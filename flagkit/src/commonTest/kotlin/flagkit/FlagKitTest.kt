package flagkit

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull
import kotlin.test.assertNull
import kotlin.test.assertTrue

class FlagKitTest {

    @Test
    fun allFlagsHaveNonBlankRegion() {
        FlagKit.Flag.entries.forEach { flag ->
            assertTrue(flag.region.isNotBlank(), "Flag ${flag.name} has blank region")
        }
    }

    @Test
    fun allFlagImagesHaveNonBlankName() {
        FlagKit.Flag.entries.forEach { flag ->
            assertTrue(flag.image.name.isNotBlank(), "Flag ${flag.name} has image with blank name")
        }
    }

    @Test
    fun flagNamesAreUnique() {
        val names = FlagKit.Flag.entries.map { it.name }
        assertEquals(names.size, names.toSet().size)
    }

    @Test
    fun totalFlagCount() {
        assertEquals(255, FlagKit.Flag.entries.size)
    }

    @Test
    fun lookupByUppercaseCode() {
        val flag = FlagKit.Flag.entries.find { it.name == "US" }
        assertNotNull(flag)
        assertEquals("United States", flag.region)
    }

    @Test
    fun lookupByLowercaseCodeViaUppercase() {
        val flag = FlagKit.Flag.entries.find { it.name == "it".uppercase() }
        assertNotNull(flag)
        assertEquals("Italy", flag.region)
    }

    @Test
    fun lookupByInvalidCodeReturnsNull() {
        val flag = FlagKit.Flag.entries.find { it.name == "XX" }
        assertNull(flag)
    }

    @Test
    fun wellKnownFlagsHaveCorrectRegions() {
        assertEquals("Palestine", FlagKit.Flag.PS.region)
        assertEquals("Italy", FlagKit.Flag.IT.region)
        assertEquals("Morocco", FlagKit.Flag.MA.region)
        assertEquals("United States", FlagKit.Flag.US.region)
        assertEquals("United Kingdom", FlagKit.Flag.GB.region)
        assertEquals("Germany", FlagKit.Flag.DE.region)
        assertEquals("France", FlagKit.Flag.FR.region)
        assertEquals("Japan", FlagKit.Flag.JP.region)
        assertEquals("European Union", FlagKit.Flag.EU.region)
    }

    @Test
    fun specialFlagsHaveCorrectRegions() {
        assertEquals("England", FlagKit.Flag.GB_ENG.region)
        assertEquals("Scotland", FlagKit.Flag.GB_SCT.region)
        assertEquals("Wales", FlagKit.Flag.GB_WLS.region)
        assertEquals("Northern Ireland", FlagKit.Flag.GB_NIR.region)
        assertEquals("Shetland", FlagKit.Flag.GB_ZET.region)
        assertEquals("California", FlagKit.Flag.US_CA.region)
        assertEquals("Pride", FlagKit.Flag.LGBT.region)
    }
}
