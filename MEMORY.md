# Arsa 项目记忆手册(Memory)

> 这份手册是给未来的开发者 / AI 助手“读记忆”用的。
> **每次开始新任务前先读本文件;每次完成任务后必须更新本文件。**

---

## 1. 如何使用这份手册

1. 开始任务前,先读 `MEMORY.md`,了解项目当前状态、已做决策、待办事项。
2. 任务过程中如果产生新的重要决策、坑、API 结论,及时补进对应小节。
3. 任务完成后,在“更新记录”小节追加一条记录,并同步更新“当前状态”与“待办任务”。
4. 本文件应保持简洁、可执行,不要堆砌一次性输出。

---

## 2. 项目快照(当前状态)

- 项目名称:**Arsa** — Minecraft Fabric 附魔模板模组
- 当前目标版本:**Minecraft 1.21.11**
- 当前模组版本:**1.3.0**
- 技术栈:
  - Java 21
  - Gradle 9.5.1
  - Fabric Loader 0.19.3
  - Fabric API 0.141.6+1.21.11
  - Loom 1.17-SNAPSHOT(`net.fabricmc.fabric-loom-remap`)
  - Mojang 官方映射(`loom.officialMojangMappings()`)
- 仓库:
  - https://github.com/MosesMuxiXie/Arsa.git
  - 默认分支:`main`
  - 本地已配置 `git config http.version HTTP/1.1`(推送时避免 schannel HTTP/2 握手失败)
- 最近提交:`4f7512d 清理仓库:移除反编译/临时构建/旧发布产物并重构发布流程`

---

## 3. 架构与代码地图

功能设计文档:`arsa-design.md`(非常完整,改动前先看)。

| 位置 | 作用 |
|---|---|
| `src/main/java/name/modid/Arsa.java` | 主入口:注册物品、配方、创造物品栏 |
| `src/main/java/name/modid/ArsaItems.java` | 定义 `arsa:enchantment_template` 物品 |
| `src/main/java/name/modid/ArsaRecipes.java` | 注册 2 个配方序列化器 |
| `src/main/java/name/modid/template/TemplateEnchantments.java` | 附魔读写 / 合法性校验 / 应用,核心逻辑唯一收口 |
| `src/main/java/name/modid/template/TemplateCopyRecipe.java` | 工作台复制配方(3×3 固定摆放) |
| `src/main/java/name/modid/template/TemplateApplicationRecipe.java` | 锻造台应用配方 |
| `src/main/java/name/modid/mixin/AnvilMenuMixin.java` | 铁砧制作模板 + 模板重命名 |
| `src/main/java/name/modid/mixin/SmithingMenuMixin.java` | 放宽锻造台基底槽插入 |
| `src/main/resources/` | 物品模型、语言、配方、advancement、mixins 配置 |

当前没有客户端代码、没有 datagen 入口(空壳已删除)。

---

## 4. 构建与发布流程

- 构建命令:

  ```powershell
  .\gradlew.bat clean build
  ```

- 产物输出到 **`releases/<version>/`**(当前 `releases/1.3.0/`):
  - `arsa-<version>.jar` — 游戏安装只需这个
  - `arsa-<version>-sources.jar`
  - `SHA256SUMS.txt`
- 手工发布流程详见 `README.md` / `README_EN.md`。
- `releases/` 已加入 `.gitignore`,产物不入库。
- 发布前建议在真实客户端按 `arsa-design.md` 附录验收,并把截图存到
  `releases/<version>/screenshots/`。

---

## 5. 已完成的验证记录

- `gradlew clean build` 通过(清理后最终构建)。
- runClient 加载 51 个模组、`arsa 1.3.0` 初始化成功、1472 配方解析无报错。
- 临时自动化冒烟测试(已移除,未留在最终代码中):
  - 铁砧:附魔书 + 9 绿宝石块 → 1 个附魔模板 ✅
  - 服务端真实 `SmithingMenu.createResult()`:模板 + 铁剑 → 锋利 V 铁剑 ✅
  - 工作台复制:书 + 模板 + 7 绿宝石 → 2 个模板 ✅
- 截图证据:
  - `releases/1.3.0/screenshots/arsa-smoke-1-anvil-create.png`
  - `releases/1.3.0/screenshots/arsa-smoke-2-smithing-apply.png`
  - `releases/1.3.0/screenshots/arsa-smoke-3-world-template.png`

---

## 6. 环境 / 仓库备忘

- 工作区经过清理:反编译(`cfr-out/`)、映射表(`mojmap-*.txt`)、临时构建(`.arsa-tmp/`)、
  参考 clone(`fabric/`、`owo-lib/`、`TechReborn/`)、旧发布目录(`dist/`)已删除。
- `.gradle/` 缓存也已删除,下次构建会重新下载依赖,属于正常现象。
- `.git` 历史里仍保留旧的大文件对象;如需彻底缩小仓库,可考虑重写历史或重新初始化仓库
  (会丢失现有提交历史,需谨慎并先备份)。
- 常用操作:
  - 提交:`git add -A && git commit -m "..."` && `git push`
  - 推送遇到 SSL 失败时使用:`git -c http.version=HTTP/1.1 push`

---

## 7. 后面可能要执行的任务(待办)

- [ ] **发布下一版本时**:改 `gradle.properties` 的 `version` → `clean build` → 生成 SHA256 → 截图 → 推送。
- [ ] 可选:把 `releases/<version>/` 上传到 GitHub Releases / Modrinth。
- [ ] 可选:重写 Git 历史,移除旧的大对象,把仓库从 75.8 MB 进一步缩小。
- [ ] 可选:实现真正的 datagen(当前资源是手写 JSON)。
- [ ] 可选:为 `TemplateEnchantments.canApply` 补单元测试 / Fabric GameTest(成功、类型不符、互斥等用例)。
- [ ] 可选:重构已知小问题:
  - `TemplateCopyRecipe` 的 `matches()` 与 `PATTERN_INGREDIENTS` 存在重复坐标,建议统一为一份数据源。
  - `TemplateEnchantments.canApply()` 中 `areCompatible(a,b)` 与 `areCompatible(b,a)` 重复调用,可精简。
  - `ArsaRecipes` 两个匿名序列化器可抽公共单例辅助类。
- [ ] 可选:如果未来重新支持多版本 MC,需要建立按版本分层的源码适配层 + CI matrix,
      不要回到手工改源码再打包的旧方式。
- [ ] 长期:保持本手册与 README、arsa-design.md 三者一致。

---

## 8. 更新记录(每次做完任务必须追加)

| 日期 | 做了什么 | 结果 / 证据 | 遗留 / 下一步 |
|---|---|---|---|
| 2026-08-27 | 清理仓库:删除反编译、映射、临时构建、参考 clone、旧发布产物;删除空壳 client/datagen;重构发布路径为 `releases/<version>`;修复 CI;补充手工发布流程 | `gradlew clean build` 通过;客户端 + 服务端冒烟测试全部通过;3 张截图存档;提交 `4f7512d` 并推送到 GitHub | 可做 Git 历史瘦身;后续发布按 README 手工流程执行 |
| | | | |

---

## 9. 提醒(每次任务结束时默读一遍)

- [ ] 我是否更新了本文件的“当前状态”?
- [ ] 我是否在“更新记录”里追加了本次任务?
- [ ] 我是否同步更新了 README / arsa-design.md / CI?
- [ ] 我是否留下了可复现的验证证据(构建日志、截图、测试结果)?
- [ ] 待办任务是否还准确?完成项是否已勾掉?
