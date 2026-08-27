# Arsa

**中文** | [English](README_EN.md)

Minecraft Fabric 附魔模板模组。它把附魔书制成可复制、一次性使用的模板，
再通过锻造台把整组附魔转移到目标物品上。

## 用法

- 制作：铁砧左槽放附魔书，右槽放至少 9 个绿宝石块；花费固定 10 级，消耗 9 个块。费用不受附魔的种类、等级、数量或附魔书的铁砧 penalty 影响；结果刷新、取出资格判断与实际取出前都会强制归一为 10 级，输出模板也不携带 penalty。
- 命名：把附魔模板单独放入铁砧左槽即可重命名，固定花费 1 级；不会累加铁砧 penalty，也不能与右槽物品合并。
- 复制：工作台上中放书、正中放附魔模板，其余 7 格放绿宝石，输出 2 个模板。
- 应用：锻造台模板槽放附魔模板，基底槽放目标物品，材料槽保持为空。

获得第一个附魔模板后，复制配方会解锁在工作台配方书的“杂项”分类中，
并支持一键摆放。

## 版本支持

本仓库当前只维护并构建 **Minecraft 1.21.11** 版本。
需要 Java 21、Fabric Loader 0.19.3 与 Fabric API 0.141.6+1.21.11。
详细设计与验收矩阵见 `arsa-design.md`。

## 构建

```powershell
.\gradlew.bat build
```

构建产物统一输出到 `releases/<version>/`（当前为 `releases/1.3.0/`）：

- `arsa-1.3.0.jar` —— 游戏安装只需要这个文件
- `arsa-1.3.0-sources.jar` —— 源码包
- `SHA256SUMS.txt` —— 校验和

## 手工发布流程

每次发布按下面步骤手工执行，产物一律进入 `releases/<版本号>/`：

1. 需要发新版本时，修改 `gradle.properties` 中的 `version`。
2. 清理旧构建并重新构建：

   ```powershell
   .\gradlew.bat clean build
   ```

   两个 JAR 会自动生成在 `releases\<version>\`。
3. 生成校验和（PowerShell）：

   ```powershell
   $v = (Select-String -Path gradle.properties -Pattern '^version=').Line.Split('=')[1]
   Get-ChildItem "releases\$v\*.jar" | ForEach-Object {
       "{0}  {1}" -f (Get-FileHash $_.FullName -Algorithm SHA256).Hash.ToLower(), $_.Name
   } | Set-Content -Path "releases\$v\SHA256SUMS.txt" -Encoding ascii
   ```

4. 校验：`.\gradlew.bat build` 通过、JAR 与 `SHA256SUMS.txt` 位于
   `releases\<version>\` 后，才可交付或发布；游戏内只需分发 `arsa-<version>.jar`。
5. 发布前建议按 `arsa-design.md` 附录的验收清单在客户端逐项测试并截图存档。

`releases/` 目录只保留本次最新版产物；历史版本产物应从
GitHub Releases / CI artifacts 等发布渠道获取，不应回填到仓库。

项目使用 [Apache License 2.0](LICENSE) 许可证。
