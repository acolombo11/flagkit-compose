package flagkit

import androidx.compose.foundation.Image
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.ui.tooling.preview.Preview

@Preview
@Composable
private fun PreviewFlag() {
    Flag(
        flag = FlagKit.Flag.PS,
        shape = RoundedCornerShape(6.dp),
        size = DpSize(56.dp, 40.dp),
    )
}

@Preview
@Composable
private fun PreviewFlagCode() {
    Flag(
        code = "IT",
        shape = RoundedCornerShape(6.dp),
        size = DpSize(56.dp, 40.dp),
    )
}

@Preview
@Composable
private fun PreviewPlaceholder() {
    Flag(
        code = "GB",
        shape = RoundedCornerShape(6.dp),
        size = DpSize(56.dp, 40.dp),
    )
}

@Preview
@Composable
private fun PreviewImage() {
    Image(
        imageVector = FlagKit.Flag.MA.image,
        contentDescription = null,
    )
}