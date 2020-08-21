package eu.acolombo.flags

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.drawable.Drawable
import androidx.annotation.DimenRes
import androidx.annotation.DrawableRes
import androidx.annotation.StyleRes
import androidx.core.content.ContextCompat.getDrawable
import com.google.android.material.shape.ShapeAppearanceModel
import java.util.*

@SuppressLint("DefaultLocale")
class Flag {

    private var code: String = Locale.getDefault().country

    constructor(countryCode: String) {
        code = countryCode.toLowerCase()
    }

    constructor(locale: Locale) {
        code = locale.country.toLowerCase(locale)
    }

    fun drawable(context: Context): Drawable? = getDrawable(
        context, context.resources.getIdentifier("flag_$code", "drawable", context.packageName)
    )

    fun image(context: Context): FlagView = FlagView(context).apply { countryCode = code }

    fun image(context: Context, shape: ShapeAppearanceModel? = null) = image(context).apply {
        shapeAppearanceModel = shape ?: shapeAppearanceModel
    }

    fun image(context: Context, style: Style) = image(context).apply {
        flagStyle = style
    }

    enum class Style(
        val square: Boolean = false,
        @StyleRes val shape: Int? = null,
        @DrawableRes val foreground: Int? = null,
        @DimenRes val elevation: Int? = R.dimen.flag_elevation_s,
        @DimenRes val edgeInset: Int? = null
    ) {
        None(elevation = null), //Rectangle of 21 x 15 points with no styling.
        Rounded(shape = R.style.ShapeAppearance_FlagView_Rounded), //Rectangle of 21 x 15 points with rounded corners.
        Square(true, shape = R.style.ShapeAppearance_FlagView_Rounded), //Square of 15 x 15 points with rounded corners.
        Circle(true, shape = R.style.ShapeAppearance_FlagView_Round), // Circular flag of 15 x 15 points.
        Waving(
            shape = R.style.ShapeAppearance_MaterialComponents_SmallComponent,
            foreground = R.drawable.flag_waving,
            elevation = R.dimen.flag_elevation_m,
            edgeInset = R.dimen.flag_edge_inset
        ),
    }

}