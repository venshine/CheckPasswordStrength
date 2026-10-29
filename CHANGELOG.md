## 2.0.0

### 不兼容变更
* 枚举 `CheckStrength.LEVEL.MIDIUM` 更名为 `LEVEL.MEDIUM`（修正拼写），调用方需同步修改。
* 以下修复会改变部分密码的评分，例如 `Password123!` 由 8 分降为 7 分，`iloveyou520` 由 MEDIUM 降为 EASY。

### 修复
* 连续字母、键盘序列、连续数字出现在密码开头时未扣分（`indexOf > 0` 应为 `>= 0`）。
* 字典检测写反：原来判断「密码是否为字典词的一部分」，现在同时判断「密码是否包含字典词」，且不区分大小写。
* 13 位及以上的纯数字密码会抛出 `NumberFormatException`；日期检测只识别 `yyyyMMdd` 与 `yyMMdd` 两种格式。

### 其他
* 新增 Gradle 构建，通过 JitPack 发布：`com.github.venshine:CheckPasswordStrength:2.0.0`。
* 新增无依赖的回归测试 `test.sh`。
