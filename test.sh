#!/bin/sh
# 编译并运行回归测试
set -eu
ROOT="$(cd "$(dirname "$0")" && pwd)"
OUT="$(mktemp -d)"
trap 'rm -rf "$OUT"' EXIT
javac -d "$OUT" "$ROOT"/src/com/wx/pwd/*.java "$ROOT"/test/com/wx/pwd/*.java
java -cp "$OUT" com.wx.pwd.CheckStrengthTest
