package com.thealgorithms.conversions;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Assertions;
import java.util.Arrays;
import org.junit.jupiter.api;

public class RgbHsvConversionTest {

	/*
	 * ROOST_METHOD_HASH=hsvToRgb_6c300f50f8 ROOST_METHOD_SIG_HASH=hsvToRgb_764b827861
	 *
	 */void convertBlackColorHsvToRgb() {
		int[] result = RgbHsvConversion.hsvToRgb(0, 0, 0);
		assertArrayEquals(new int[] { 0, 0, 0 }, result);
	}

	/*
	 * ROOST_METHOD_HASH=hsvToRgb_6c300f50f8 ROOST_METHOD_SIG_HASH=hsvToRgb_764b827861
	 *
	 */void convertWhiteColorHsvToRgb() {
		int[] result = RgbHsvConversion.hsvToRgb(0, 0, 1);
		assertArrayEquals(new int[] { 255, 255, 255 }, result);
	}

	/*
	 * ROOST_METHOD_HASH=hsvToRgb_6c300f50f8 ROOST_METHOD_SIG_HASH=hsvToRgb_764b827861
	 *
	 */void invalidHueValueThrowsException() {
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
				() -> RgbHsvConversion.hsvToRgb(361, 0.5, 0.5));
		assertEquals("hue should be between 0 and 360", exception.getMessage());
	}

	/*
	 * ROOST_METHOD_HASH=hsvToRgb_6c300f50f8 ROOST_METHOD_SIG_HASH=hsvToRgb_764b827861
	 *
	 */void invalidSaturationValueThrowsException() {
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
				() -> RgbHsvConversion.hsvToRgb(180, 1.1, 0.5));
		assertEquals("saturation should be between 0 and 1", exception.getMessage());
	}

	/*
	 * ROOST_METHOD_HASH=hsvToRgb_6c300f50f8 ROOST_METHOD_SIG_HASH=hsvToRgb_764b827861
	 *
	 */void convertPrimaryRedColorHsvToRgb() {
		int[] result = RgbHsvConversion.hsvToRgb(0, 1, 1);
		assertArrayEquals(new int[] { 255, 0, 0 }, result);
	}

	/*
	 * ROOST_METHOD_HASH=hsvToRgb_6c300f50f8 ROOST_METHOD_SIG_HASH=hsvToRgb_764b827861
	 *
	 */void convertMidRangeColorHsvToRgb() {
		int[] result = RgbHsvConversion.hsvToRgb(180, 0.5, 0.5);
		assertArrayEquals(new int[] { 64, 128, 128 }, result);
	}

	/*
	 * ROOST_METHOD_HASH=hsvToRgb_6c300f50f8 ROOST_METHOD_SIG_HASH=hsvToRgb_764b827861
	 *
	 */void convertMaximumHueValueHsvToRgb() {
		int[] result = RgbHsvConversion.hsvToRgb(360, 0.5, 0.5);
		assertArrayEquals(new int[] { 128, 64, 64 }, result);
	}

	/*
	 * ROOST_METHOD_HASH=hsvToRgb_6c300f50f8 ROOST_METHOD_SIG_HASH=hsvToRgb_764b827861
	 *
	 */void convertMinimumValidValuesHsvToRgb() {
		int[] result = RgbHsvConversion.hsvToRgb(0, 0, 0);
		assertArrayEquals(new int[] { 0, 0, 0 }, result);
	}

	/*
	 * ROOST_METHOD_HASH=hsvToRgb_6c300f50f8 ROOST_METHOD_SIG_HASH=hsvToRgb_764b827861
	 *
	 */void invalidValueParameterThrowsException() {
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
				() -> RgbHsvConversion.hsvToRgb(180, 0.5, 1.1));
		assertEquals("value should be between 0 and 1", exception.getMessage());
	}

	/*
	 * ROOST_METHOD_HASH=hsvToRgb_6c300f50f8 ROOST_METHOD_SIG_HASH=hsvToRgb_764b827861
	 *
	 */void convertPrimaryGreenColorHsvToRgb() {
		int[] result = RgbHsvConversion.hsvToRgb(120, 1, 1);
		assertArrayEquals(new int[] { 0, 255, 0 }, result);
	}

	/*
	 * ROOST_METHOD_HASH=rgbToHsv_fe821c5259 ROOST_METHOD_SIG_HASH=rgbToHsv_2cb6fc136e
	 *
	 */void convertBlackRgbToHsv() {
		double[] result = RgbHsvConversion.rgbToHsv(0, 0, 0);
		assertTrue(RgbHsvConversion.approximatelyEqualHsv(result, new double[] { 0, 0, 0 }));
	}

	/*
	 * ROOST_METHOD_HASH=rgbToHsv_fe821c5259 ROOST_METHOD_SIG_HASH=rgbToHsv_2cb6fc136e
	 *
	 */void convertWhiteRgbToHsv() {
		double[] result = RgbHsvConversion.rgbToHsv(255, 255, 255);
		assertTrue(RgbHsvConversion.approximatelyEqualHsv(result, new double[] { 0, 0, 1 }));
	}

	/*
	 * ROOST_METHOD_HASH=rgbToHsv_fe821c5259 ROOST_METHOD_SIG_HASH=rgbToHsv_2cb6fc136e
	 *
	 */void convertPureRedRgbToHsv() {
		double[] result = RgbHsvConversion.rgbToHsv(255, 0, 0);
		assertTrue(RgbHsvConversion.approximatelyEqualHsv(result, new double[] { 0, 1, 1 }));
	}

	/*
	 * ROOST_METHOD_HASH=rgbToHsv_fe821c5259 ROOST_METHOD_SIG_HASH=rgbToHsv_2cb6fc136e
	 *
	 */void validateRedValueBelowRange() {
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
				() -> RgbHsvConversion.rgbToHsv(-1, 0, 0));
		assertEquals("red should be between 0 and 255", exception.getMessage());
	}

	/*
	 * ROOST_METHOD_HASH=rgbToHsv_fe821c5259 ROOST_METHOD_SIG_HASH=rgbToHsv_2cb6fc136e
	 *
	 */void validateRedValueAboveRange() {
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
				() -> RgbHsvConversion.rgbToHsv(256, 0, 0));
		assertEquals("red should be between 0 and 255", exception.getMessage());
	}

	/*
	 * ROOST_METHOD_HASH=rgbToHsv_fe821c5259 ROOST_METHOD_SIG_HASH=rgbToHsv_2cb6fc136e
	 *
	 */void convertComplexColorRgbToHsv() {
		double[] result = RgbHsvConversion.rgbToHsv(193, 196, 224);
		assertTrue(RgbHsvConversion.approximatelyEqualHsv(result, new double[] { 234, 0.14, 0.88 }));
	}

	/*
	 * ROOST_METHOD_HASH=rgbToHsv_fe821c5259 ROOST_METHOD_SIG_HASH=rgbToHsv_2cb6fc136e
	 *
	 */void convertMaximumValuesRgbToHsv() {
		double[] result = RgbHsvConversion.rgbToHsv(255, 255, 255);
		assertTrue(RgbHsvConversion.approximatelyEqualHsv(result, new double[] { 0, 0, 1 }));
	}

}