package org.pursuit.testing_revisited_creating_tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import org.pursuit.testing_revisited_creating_tests.translator.SillyTranslator;

public class SillyTranslatorUnitTest {

    // TODO: add setup method

    @Test
    public void checkDoubleTalk() {
        //Given
        String textString = "Pursuit";
        String expectedResult = "Pursuit pursuit";

        //When
        String result = SillyTranslator.getInstance().doubleTalk(textString);

        //Then
        Assert.assertEquals(result, expectedResult);
    }
    // TODO: add test for every method with a non-void return type in SillyTranslator.java

    // TODO: add tear down method
    @Test
    public void checkDoubleTalk2() {
        //given
        String textString = "1234";
        String expectedResult = "1234 1234";

        //when
        String result = SillyTranslator.getInstance().doubleTalk(null);
        //then
        Assert.assertEquals("", null);
    }

    @Test
    public void checkSnakeSpeakWithNumbers() {
        String testString = "1234";
        String expectedString = "1234";

        String result = SillyTranslator.getInstance().snakeSpeak(testString);

        Assert.assertEquals(expectedString, result);

    }

    @Test
    public void checkSnakeSpeakIsNull() {
        String testString = null;
        String expectedResult = "";

        String result = SillyTranslator.getInstance().snakeSpeak(testString);

        Assert.assertEquals(expectedResult, result);

    }

    @Test
    public void checkSnakeSpeakIsStringEmpty() {
        String testString = "";
        String expectedResult = "";
        String result = SillyTranslator.getInstance().snakeSpeak(testString);
        Assert.assertEquals(expectedResult, result);

    }

    @Test
    public void checkSnakeSpeak() {
        String testString = "snake";
        String expectedResult = "sssssnake";
        String result = SillyTranslator.getInstance().snakeSpeak(testString);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void checkSnakeSpeakCapitalLetter() {
        String testString = "Sour";
        String expectedResult = "Sour";

        String result = SillyTranslator.getInstance().snakeSpeak(testString);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void checkSnakeSpeakEmptySpaces() {
        String testString = " ";
        String expectedResult = " ";

        String result = SillyTranslator.getInstance().snakeSpeak(testString);
        Assert.assertEquals(expectedResult, result);

    }


    @Test
    public void checkCaesarCypher() {
        String testString = "happy";
        String expectedResult = "ibqqz";

        String result = SillyTranslator.getInstance().caesarCypher(testString);

        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void checkCaesarCypherIsNull() {
        String testString = null;
        String expectedResult = "";

        String result = SillyTranslator.getInstance().caesarCypher(testString);

        Assert.assertEquals(expectedResult, result);

    }

    @Test
    public void checkCaesarCypherIsEmpty() {
        String testString = " ";
        String expectedResult = " ";
        String result = SillyTranslator.getInstance().caesarCypher(testString);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void checkCaesarCypherWithNumbers() {
        String testString = "1234";
        String expectedResult = "2345";
        String result = SillyTranslator.getInstance().caesarCypher(testString);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void caesarCypherTilda() {
        String testString = "~";
        String expectedResult = " ";

        String result = SillyTranslator.getInstance().caesarCypher(testString);
        Assert.assertEquals(expectedResult, result);
        //Control + Command + spacebar will give you emojis
    }

    @Test
    public void SillyTranslator_testGetInstance() {
        SillyTranslator result = SillyTranslator.getInstance();
        SillyTranslator result2 = SillyTranslator.getInstance();

        Assert.assertNotNull(result);
        Assert.assertTrue(result instanceof SillyTranslator);
        Assert.assertEquals(result, result2);
        Assert.assertSame(result, result2);
    }

    //
//@Test
//public void checkPigLatinIsNull(){
//        String testString = null;
//        String expectedResult = " ";
//
//        String result = SillyTranslator.getInstance().pigLatin(testString);
//        Assert.assertEquals(expectedResult, result);
//}
    @Test
    public void checkPigLatin() {
        String testString = "apple";
        String expectedResult = "appleway";

        String result = SillyTranslator.getInstance().pigLatin(testString);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void checkPigLatinNumbers() {
        String testString = "1234";
        String expectedResult = "";

        String result = SillyTranslator.getInstance().pigLatin(testString);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void checkPigLatinAllVowels() {
        String testString = "aeiou";
        String expectedResult = "aeiouway";

        String result = SillyTranslator.getInstance().pigLatin(testString);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void checkPigLatinNoVowels() {
        String testString = "bl";
        String expectedResult = "";

        String result = SillyTranslator.getInstance().pigLatin(testString);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void checkReverse() {
        String testString = "hello";
        String expectedResult = "ellohay";

        String result = SillyTranslator.getInstance().pigLatin(testString);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void checkSarcasticRebuttal() {
        String testString = "little";
        String expectedResult = "little shmittle";

        String result = SillyTranslator.getInstance().sarcasticRebuttal(testString);
        Assert.assertEquals(expectedResult, result);

    }

    @Test
    public void checkElide() {
        String testString = "cookie";
        String expectedResult = "cookie";

        String result = SillyTranslator.getInstance().elide(testString);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void checkSillyCase() {
        String testString = "happy";
        String expectedResult = "HaPpY";

        String result = SillyTranslator.getInstance().sillyCase(testString);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void checkDeVowel() {
        String testString = "alibi";
        String expectedResult = "lb";

        String result = SillyTranslator.getInstance().deVowel(testString);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void checkDeConsonant(){
        String testString = "cool";
        String expectedResult = "oo";

        String result = SillyTranslator.getInstance().deConsonant(testString);
        Assert.assertEquals(expectedResult, result);
    }
    @Test
    public void doubleTalk(){
        String testString = "blue";
        String expectedResult = "Blue blue";

        String result = SillyTranslator.getInstance().doubleTalk(testString);
        Assert.assertEquals(expectedResult, result);
    }

}

