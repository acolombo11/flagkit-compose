package eu.acolombo.flags.example

import android.graphics.Color
import android.graphics.Paint
import android.os.Bundle
import android.widget.LinearLayout.LayoutParams.WRAP_CONTENT
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.google.android.material.shape.MaterialShapeDrawable
import com.google.android.material.shape.ShapeAppearanceModel
import com.google.android.material.shape.TriangleEdgeTreatment
import eu.acolombo.flags.Flag
import eu.acolombo.flags.FlagEdgeTreatment
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val locale = Locale.getDefault()
        val flag = Flag(locale = locale)

        val countryCode = locale.country
        val anotherFlag = Flag(countryCode = countryCode)

        // Retrieve the drawable for customized use
        val drawable = flag.drawable(context = this)

        // Retrieve the unstyled image for customized use
        val originalImage = anotherFlag.image(context = this)

        // Or retrieve a styled flag
        val styledImage = flag.image(context = this, style = Flag.Style.Circle)

        // You can always access the underlying drawables directly
        imageFlag.setImageResource(R.drawable.flag_zw)


        // Setup demo
        imageFlag.setImageDrawable(drawable)
        layoutContainer.addView(originalImage, WRAP_CONTENT, WRAP_CONTENT)
        layoutContainer.addView(styledImage, WRAP_CONTENT, WRAP_CONTENT)

        imageFlag.requestLayout()

    }

}