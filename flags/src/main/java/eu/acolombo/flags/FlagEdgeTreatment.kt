package eu.acolombo.flags

import android.os.Build
import com.google.android.material.shape.EdgeTreatment
import com.google.android.material.shape.ShapePath

class FlagEdgeTreatment(private val size: Float, private val bias: Float = .5f) : EdgeTreatment() {

    override fun getEdgePath(length: Float, center: Float, interpolation: Float, shapePath: ShapePath) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            shapePath.quadToPoint(length * bias, size * interpolation, length, 0f)
        } else {
            shapePath.lineTo(center - length/2 * interpolation, 0f)
            shapePath.lineTo(length * bias, size * interpolation)
            shapePath.lineTo(center + length/2 * interpolation, 0f)
            shapePath.lineTo(length, 0f)
        }
    }

}