package flagkit

import androidx.compose.foundation.Image
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onRoot
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import com.github.takahirom.roborazzi.captureRoboImage
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(RobolectricTestRunner::class)
@Config(sdk = [34])
@GraphicsMode(GraphicsMode.Mode.NATIVE)
class FlagPreviewTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun previewFlag() {
        composeTestRule.setContent {
            Flag(
                flag = FlagKit.Flag.PS,
                shape = RoundedCornerShape(6.dp),
                size = DpSize(56.dp, 40.dp),
            )
        }
        composeTestRule.onRoot().captureRoboImage()
    }

    @Test
    fun previewFlagByCode() {
        composeTestRule.setContent {
            Flag(
                code = "IT",
                shape = RoundedCornerShape(6.dp),
                size = DpSize(56.dp, 40.dp),
            )
        }
        composeTestRule.onRoot().captureRoboImage()
    }

    @Test
    fun previewFlagPlaceholder() {
        composeTestRule.setContent {
            FlagPlaceholder(
                shape = RoundedCornerShape(6.dp),
                size = DpSize(56.dp, 40.dp),
            )
        }
        composeTestRule.onRoot().captureRoboImage()
    }

    @Test
    fun previewFlagForInvalidCode() {
        composeTestRule.setContent {
            Flag(
                code = "XX",
                shape = RoundedCornerShape(6.dp),
                size = DpSize(56.dp, 40.dp),
            )
        }
        composeTestRule.onRoot().captureRoboImage()
    }

    @Test
    fun previewFlagImage() {
        composeTestRule.setContent {
            Image(
                imageVector = FlagKit.Flag.MA.image,
                contentDescription = null,
            )
        }
        composeTestRule.onRoot().captureRoboImage()
    }
}
