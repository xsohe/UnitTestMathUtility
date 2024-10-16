

import org.junit.Assert;
import org.junit.Test;
import com.src.MathUtility;

import static org.junit.Assert.*;

public class MathUtilityTest {

    MathUtility mathUtility = new MathUtility();

    /** =======================BEGIN TEST RUMUS PERSEGI PANJANG============================================== **/

    // Testing data with number length and height is positive
    @Test
    public void test_data_with_positive() {
        double length = 20.0, wide = 10.0;
        double result = mathUtility.HitungLuasPersegiPanjang(length, wide);

        Assert.assertEquals("Kedua nilai bernilai positif", result, 200, 0.0);
    }

    // Testing data with either both data is zero
    @Test
    public void test_data_with_both_data_is_zero() {
        double length = 0.0, wide = 0.0;
        double result = mathUtility.HitungLuasPersegiPanjang(length, wide);

        Assert.assertEquals("Kedua nilai adalah 0", result, 0.0, 0.0);
    }

    // Testing data with either number is zero on length value
    @Test
    public void test_data_with_argument_zero_on_length() {
        double length = 0;
        double wide = 50;
        double result = mathUtility.HitungLuasPersegiPanjang(length, wide);

        Assert.assertEquals("Nilai panjang dengan 0", result, 0.0, 0.0);
    }

    // Testing data with either number is zero on wide
    @Test
    public void test_data_with_argument_zero_on_wide() {
        double length = 50, wide = 0;
        double result = mathUtility.HitungLuasPersegiPanjang(length, wide);

        Assert.assertEquals("Nilai lebar dengan 0", result, 0.0, 0.0);
    }

    // Testing data with either number is negative on length
    @Test
    public void test_data_with_negative_on_length() {
        double length = -2, wide = 4;
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> MathUtility.HitungLuasPersegiPanjang(length, wide)
        );

        Assert.assertTrue(exception.getMessage().contains("Panjang dan lebar harus bernilai positif"));
    }

    // Testing data with either numebr is negative on wide
    @Test
    public void test_data_with_negative_on_wide() {
        double length = 4, wide = -2;
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> MathUtility.HitungLuasPersegiPanjang(length, wide)
        );

        Assert.assertTrue(exception.getMessage().contains("Panjang dan lebar harus bernilai positif"));
    }

    /** =======================END TEST RUMUS PERSEGI PANJANG============================================== **/
    /** =======================BEGIN TEST RUMUS PERSEGI PANJANG============================================== **/

    @Test
    public void test_calculate_diskon_with_zero_input() {
        double result = mathUtility.HitungHargaSetelahDiskon(50000, 0);

        Assert.assertEquals("diskon with zero input", result, 50000, 0.0);
    }

    @Test
    public void test_calculate_diskon_with_one_hundred_input() {
        double result = mathUtility.HitungHargaSetelahDiskon(100000, 100);

        Assert.assertEquals("Price get result is zero", result, 0, 0.0);
    }

    @Test
    public void test_calculate_diskon_with_diskon_exceeding_maximum() {
        IllegalArgumentException exception1 = assertThrows(
                IllegalArgumentException.class,
                () -> mathUtility.HitungHargaSetelahDiskon(100000, 210)
        );

        // invalid input with greater than 100
        assertSame(
                "Diskon was invalid input",
                "Harga dan diskon harus bernilai positif, dan diskon maksimal 100%",
                exception1.getMessage()
        );
    }

    @Test
    public void test_calculate_diskon_with_diskon_value_negative() {
        IllegalArgumentException exception1 = assertThrows(
                IllegalArgumentException.class,
                () -> mathUtility.HitungHargaSetelahDiskon(500000, -50)
        );

        // invalid input with greater than 100
        assertSame(
                "Diskon was invalid input",
                "Harga dan diskon harus bernilai positif, dan diskon maksimal 100%",
                exception1.getMessage()
        );
    }

    @Test
    public void test_calculate_diskon_with_price_value_is_negative() {
        IllegalArgumentException exception1 = assertThrows(
                IllegalArgumentException.class,
                () -> mathUtility.HitungHargaSetelahDiskon(-200000, 20)
        );

        // invalid input with greater than 100
        assertSame(
                "Diskon was invalid input",
                "Harga dan diskon harus bernilai positif, dan diskon maksimal 100%",
                exception1.getMessage()
        );
    }

    @Test
    public void test_calculate_diskon_with_both_data_is_zero() {
        double result = mathUtility.HitungHargaSetelahDiskon(0, 0);

        Assert.assertEquals("diskon with zero input", result, 0.0, 0.0);
    }

    @Test
    public void coba_test() {
        double testResult = mathUtility.HitungHargaSetelahDiskon(0, 0);

        Assert.assertEquals("diskon with both zero value", testResult);
    }
    /** =======================END TEST RUMUS PERSEGI PANJANG============================================== **/
}
