
// ********RoostGPT********
/*
Test generated by RoostGPT for test OpenAII using AI Type  and AI Model 

ROOST_METHOD_HASH=clearBit_2bb8df5689
ROOST_METHOD_SIG_HASH=clearBit_41db29e3ee

Here are your existing test cases which we found out and are not considered for test generation:

File Path: /var/tmp/Roost/RoostGPT/OpenAII/6027d49d-46d4-459b-bf2d-09388d3ac953/source/JavaAlgorithms/src/test/java/com/thealgorithms/bitmanipulation/SingleBitOperationsTest.java
Tests:
    "@Test
@Test
public void clearBitTest() {
    assertEquals(5, SingleBitOperations.clearBit(7, 1));
    assertEquals(5, SingleBitOperations.clearBit(5, 1));
}
""""
  Scenario 1: Test to clear bit at zero position
  Details:  
    TestName: clearBitAtZeroPosition
    Description: This test is designed to verify if the clearBit method can correctly clear the bit at the zero position in a given number.
  Execution:
    Arrange: Define a number with the first bit set to 1 (e.g., num = 7).
    Act: Invoke clearBit method with parameters num and bit as 0.
    Assert: The returned value should be num with the bit at zero position cleared (e.g., 6).
  Validation: 
    This assertion verifies if the clearBit method can correctly clear the bit at the zero position in a number. The expected result is based on the binary representation of the input number. This test is critical to ensure correct bitwise operation functionality is maintained.

  Scenario 2: Test to clear bit at a non-zero position
  Details:  
    TestName: clearBitAtNonZeroPosition
    Description: This test is designed to verify if the clearBit method can correctly clear the bit at a non-zero position in a given number.
  Execution:
    Arrange: Define a number with a non-zero bit set to 1 (e.g., num = 7).
    Act: Invoke clearBit method with parameters num and bit as 2.
    Assert: The returned value should be num with the bit at the second position cleared (e.g., 3).
  Validation: 
    This assertion verifies if the clearBit method can correctly clear the bit at a non-zero position in a number. The expected result is based on the binary representation of the input number. This test is critical to ensure correct bitwise operation functionality is maintained.

  Scenario 3: Test to clear bit from a number where bit is already cleared
  Details:  
    TestName: clearBitAlreadyCleared
    Description: This test is designed to verify if the clearBit method can correctly handle the operation when the bit to be cleared is already cleared in the given number.
  Execution:
    Arrange: Define a number with the bit at the specified position already cleared (e.g., num = 5).
    Act: Invoke clearBit method with parameters num and bit as 1.
    Assert: The returned value should be the same as the original number (e.g., 5).
  Validation: 
    This assertion verifies if the clearBit method can correctly handle the operation when the bit to be cleared is already cleared. The expected result is the same as the original number because the bit at the specified position is already cleared. This test is critical to ensure correct bitwise operation functionality is maintained.

  Scenario 4: Test to clear bit from a negative number
  Details:  
    TestName: clearBitFromNegativeNumber
    Description: This test is designed to verify if the clearBit method can correctly handle the operation when the given number is negative.
  Execution:
    Arrange: Define a negative number (e.g., num = -7).
    Act: Invoke clearBit method with parameters num and bit as 1.
    Assert: The returned value should be num with the bit at the first position cleared.
  Validation: 
    This assertion verifies if the clearBit method can correctly handle the operation when the input number is negative. The expected result is based on the binary representation of the input number. This test is critical to ensure correct bitwise operation functionality is maintained.
"""
*/

// ********RoostGPT********

package com.thealgorithms.bitmanipulation;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.*;

public class SingleBitOperationsClearBitTest {
    @Test
    @Tag("valid")
    public void clearBitAtZeroPosition() {
        int num = 7;
        int bit = 0;
        int clearedNum = SingleBitOperations.clearBit(num, bit);
        assertEquals(6, clearedNum, "The bit at zero position should be cleared");
    }
    @Test
    @Tag("valid")
    public void clearBitAtNonZeroPosition() {
        int num = 7;
        int bit = 2;
        int clearedNum = SingleBitOperations.clearBit(num, bit);
        assertEquals(3, clearedNum, "The bit at the non-zero position should be cleared");
    }
    @Test
    @Tag("valid")
    public void clearBitAlreadyCleared() {
        int num = 5;
        int bit = 1;
        int clearedNum = SingleBitOperations.clearBit(num, bit);
        assertEquals(5, clearedNum, "The bit is already cleared, so the number should remain the same");
    }
    @Test
    @Tag("boundary")
    public void clearBitFromNegativeNumber() {
        int num = -7;
        int bit = 1;
        int clearedNum = SingleBitOperations.clearBit(num, bit);
        assertEquals(-5, clearedNum, "The bit from the negative number should be cleared");
    }
}