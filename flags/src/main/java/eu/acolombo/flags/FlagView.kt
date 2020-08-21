package eu.acolombo.flags

import android.content.Context
import android.os.Build.VERSION.SDK_INT
import android.util.AttributeSet
import androidx.core.content.ContextCompat.getDrawable
import com.google.android.material.imageview.ShapeableImageView
import com.google.android.material.shape.ShapeAppearanceModel
import eu.acolombo.flags.Flag.Style.None
import eu.acolombo.flags.R.styleable.*
import java.util.*

class FlagView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : ShapeableImageView(context, attrs, defStyleAttr) {

    var countryCode: String = Locale.getDefault().country
        set(value) {
            field = value
            setImageDrawable(Flag(value).drawable(context))
        }

    var flagStyle: Flag.Style = None
        set(value) {
            field = value
            if (value.shape != null) {
                shapeAppearanceModel =
                    ShapeAppearanceModel.builder(context, value.shape, value.shape)
                        .also {
                            if (value.edgeInset != null) {
                                val bias = .2f
                                val inset = resources.getDimension(value.edgeInset)
                                it.setTopEdge(FlagEdgeTreatment(inset))
                                    .setLeftEdge(FlagEdgeTreatment(inset, 1 - bias))
                                    .setRightEdge(FlagEdgeTreatment(inset, bias))
                            }
                        }.build()
            }

            if (SDK_INT >= 21 && value.elevation != null) {
                elevation = resources.getDimension(value.elevation)
            }

            if (SDK_INT >= 23 && value.foreground != null) {
                foreground = getDrawable(context, value.foreground)
                foreground.alpha = 0xff / 3
            }
        }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)

        if (flagStyle.square) {
            val size = minOf(measuredHeight, measuredWidth)
            setMeasuredDimension(size, size)
        }
    }

    init {
        scaleType = ScaleType.CENTER_CROP

        val a = context.theme.obtainStyledAttributes(attrs, FlagView, defStyleAttr, 0)

        countryCode = a.getString(FlagView_countryCode) ?: Locale.getDefault().country
        flagStyle = Flag.Style.values()[a.getInt(FlagView_flagStyle, None.ordinal)]

        a.recycle()
    }

}