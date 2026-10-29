package com.wx.pwd;

/**
 * 回归测试（无第三方依赖），运行方式见 test.sh
 */
public class CheckStrengthTest {

    private static int failures = 0;

    public static void main(String[] args) {
        // 连续字母、键盘序列、连续数字出现在开头时也要扣分，与出现在中间时得分一致
        assertEquals("letter sequence at index 0",
                score("bcdefghijklmnopq"), score("abcdefghijklmnop"));
        assertEquals("keyboard sequence at index 0",
                score("wertyuiop"), score("qwertyuiop"));
        assertEquals("number sequence at index 0",
                score("12345678901"), score("01234567890"));

        // 包含字典词（不区分大小写）的密码应比同构成的非字典密码分低
        assertTrue("dictionary word inside password",
                score("Password123!") < score("Xkqwvbzm123!"));

        // 超长纯数字不应抛异常
        try {
            score("1234567890123");
            score("12345678901234567890");
        } catch (RuntimeException e) {
            fail("long numeric password throws " + e);
        }

        // 等级枚举：4-6 分为 MEDIUM
        assertTrue("medium level", CheckStrength.getPasswordLevel("admin@2024") == CheckStrength.LEVEL.MEDIUM);

        if (failures > 0) {
            System.out.println(failures + " test(s) failed");
            System.exit(1);
        }
        System.out.println("all tests passed");
    }

    private static int score(String passwd) {
        return CheckStrength.checkPasswordStrength(passwd);
    }

    private static void assertEquals(String name, int expected, int actual) {
        if (expected != actual) {
            fail(name + ": expected " + expected + " but was " + actual);
        }
    }

    private static void assertTrue(String name, boolean condition) {
        if (!condition) {
            fail(name);
        }
    }

    private static void fail(String message) {
        failures++;
        System.out.println("FAIL " + message);
    }
}
