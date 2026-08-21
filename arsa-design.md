# Arsa —— 附魔模板（Enchantment Template）详细设计方案（终稿）

> 目标环境（已核对本工程）：**Minecraft 1.21.11** · Fabric Loader 0.19.3 · Fabric API 0.141.6+1.21.11 ·
> Loom 1.17-SNAPSHOT · **Mojang 官方映射**（`loom.officialMojangMappings()`）· Java 21 · 分裂源集 + fabric-datagen。
> 本方案全部 API 签名已通过 **Mojang 官方 1.21.11 映射表（piston-data）+ CFR 反编译 client-1.21.11.jar** 双重核实；
> 少量标注 `【小核】` 的点是反编译未能覆盖的个别访问器名，落地时 1 分钟可确认。
>
> 关键版本事实：1.21.11 Mojmap 中资源 ID 类叫 `net.minecraft.resources.Identifier`（1.21.10 还叫 ResourceLocation）。

**核心承诺**：全模组只新增 **1 个物品**（附魔模板）+ **2 个配方** + **2 个 Mixin**（另 1 个可选）。
> 注：本文件已按工作区最终实现同步——基底槽放行采用"槽位定义 Mixin 放宽"方案（见 5.5），
> 与早期草案的"注册表联合 Ingredient"方案等效但更稳健。
无新方块、无机器、无能量、无自定义 GUI。全部交互发生在原版的**铁砧 / 工作台 / 锻造台**。

---

## 1. 模组设计总览

附魔模板是一个"附魔载体"物品：把附魔书上的附魔数据封装成一个**可复制、一次性**的物品，
再通过锻造台转移到目标装备上。等价于"提前备好、可以复制、用一次少一个的附魔书"。

```
附魔书 ──铁砧(+9绿宝石块, 扣10级)──▶ 附魔模板 ──工作台(+普通书+7绿宝石)──▶ 附魔模板×2
                                                                              │
                                       目标物品 ◀──锻造台──┘ （消耗1模板，不耗经验）
```

| 步骤 | 原版方块 | 类比对象 |
|---|---|---|
| 制作模板 | 铁砧 | 原版铁砧改名/合并的 UI 与经验扣除 |
| 复制模板 | 工作台 | 原版锻造模板复制配方（netherite_upgrade 复制） |
| 应用模板 | 锻造台 | 原版锻造配方（smithing）的 UI 与槽位 |

---

## 2. 玩家完整玩法流程

1. **获得附魔书**：附魔台 / 村民交易 / 战利品，原版途径，不做任何改动。
2. **制作模板**：附魔书放铁砧左槽、9 个绿宝石块放右槽；费用固定 10 级。
   - 生存模式：经验等级 ≥ 10 才能取出（原版 `mayPickup` 判定），取出扣 10 级；
   - 附魔种类、等级、数量与附魔书的 `repair_cost`/penalty 都不参与计价；
   - 创造模式：忽略经验；书与 9 块照常消耗；书无附魔 → 结果槽为空。
3. **复制模板**：工作台 3×3：上中=1 本普通书，正中=1 个模板，其余 7 格=绿宝石；
   输出 2 个附魔完全相同的模板（净赚 1 个）。
4. **应用模板**：锻造台模板槽放模板、基底槽放目标物品、材料槽**保持为空**；
   结果槽出现"目标物品 + 模板附魔"成品；取出消耗 1 模板 + 1 基底物品，不耗经验。
5. **循环**：模板用完后回到第 3 步复制，或第 2 步重新制作。

---

## 3. 所有核心规则整理

### 3.1 制作（铁砧）

| 项目 | 规则 |
|---|---|
| 左槽 | 1 本**已有附魔**的附魔书（`minecraft:enchanted_book`） |
| 右槽 | 绿宝石块（`minecraft:emerald_block`）数量 ≥ 9，消耗 9 个 |
| 经验 | 固定 10 级；生存 ≥ 10 才可取出；取出扣 10 级；创造忽略 |
| Too Expensive / penalty | 不受影响：固定 10 级，不读取或叠加附魔书的任何铁砧惩罚 |
| 输出 | 1 个 `arsa:enchantment_template`，携带书中全部附魔（种类+等级），无 repair cost 等其它数据 |
| 失败 | 书无附魔 → 空；块 < 9 → 空 |
| 方向性 | 书必须左槽、块必须右槽（与原版铁砧一致），反向无效 |

### 3.2 复制（工作台）

| 项目 | 规则 |
|---|---|
| 布局（3×3） | 上中=普通书 `minecraft:book`；正中=附魔模板；其余 7 格=绿宝石 |
| 输出 | 2 个附魔完全相同的模板 |
| 要求 | 输入模板必须非空（至少 1 条附魔） |
| 消耗 | 书 ×1、绿宝石 ×7、模板 ×1（净产出 +1） |

### 3.3 使用（锻造台）

| 项目 | 规则 |
|---|---|
| 模板槽 | 1 个附魔模板 |
| 基底槽 | 1 个待附魔物品 |
| 材料槽 | **必须为空** |
| 输出 | 基底复制品 + 模板内全部附魔；名字、Lore、耐久、repair cost 一律不变 |
| 消耗 | 1 模板 + 1 基底物品；经验 0 |

### 3.4 失败条件（结果槽为空，任一不满足即整体失败）

1. 模板为空（无任何附魔）；
2. 模板中**任意一条**附魔不适用于该物品类型（原版 `Enchantment.canEnchant`）；
3. 模板内部存在互斥附魔组合；
4. 目标物品已有与模板某条附魔互斥的附魔；
5. 目标物品已有与模板**同种**的附魔（不区分等级，一律拒绝，不做等级合并）；
6. 基底物品是附魔书 / 普通书 / 附魔模板本身；
7. 锻造台材料槽放了任何东西。

---

## 4. 需要新增的物品定义（仅此 1 个）

```
id:            arsa:enchantment_template
类:            net.minecraft.world.item.Item（不需要子类）
最大堆叠:      64（Item.Properties#stacksTo(64)）
稀有度:        RARE（青色名称，与原版锻造模板一致）
数据组件:      minecraft:enchantments（ItemEnchantments，存模板附魔）
工具提示:      自动显示 "Enchantments:" 列表（组件自带 addToTooltip；1.21.9+ 无 show_in_tooltip 开关）
渲染/发光:     item/generated + 16×16 纹理（已使用定制的金色盾形+绿宝石徽章贴图，白底已抠透明）。
              注：曾尝试 ENCHANTMENT_GLINT_OVERRIDE=false 关闭附魔光效，后恢复原版默认行为
              （带附魔的模板与原版附魔物品一样带光效）。
              1.21.11 模型绑定（关键坑，已修复）：1.21.4+ 起物品模型定义走新系统，
              客户端按 DataComponents.ITEM_MODEL（默认=物品 id）在 assets/<ns>/items/<id>.json
              查找定义文件，再指向 models/item/<id>.json。缺 items/ 定义文件时物品渲染为
              紫黑棋盘格（缺失模型），与贴图内容无关。本项目已添加
              assets/arsa/items/enchantment_template.json
              （{"model":{"type":"minecraft:model","model":"arsa:item/enchantment_template"}}）。
图标:          assets/arsa/icon.png（128×128，与物品贴图同源）
语言:          zh_cn: "附魔模板" / en_us: "Enchantment Template"
创造物品栏:    INGREDIENTS（CreativeModeTabs.INGREDIENTS），排在下界合金升级模板之后
```

刻意不用：`SmithingTemplateItem`（需 trim 描述）；不存 `repair_cost`/`custom_name`/`lore`/`custom_data`/耐久。

---

## 5. Fabric 实现建议（Mojmap 类名，全部已核实）

### 5.1 需要的核心类

| 类 | 职责 |
|---|---|
| `Arsa`（现有入口） | 注册物品、配方序列化器、创造物品栏 |
| `ArsaItems` | 定义并注册 `enchantment_template` |
| `ArsaRecipes` | 注册 2 个配方序列化器 |
| `TemplateEnchantments` | 模板附魔读写 / 合法性校验 / 应用（所有逻辑唯一收口） |
| `TemplateCopyRecipe extends CustomRecipe` | 工作台复制；显式提供 3×3 `PlacementInfo` / `display()` 以支持原版配方书 |
| `TemplateApplicationRecipe implements SmithingRecipe` | 锻造台应用；覆写 `matches` 表达非空动态模板规则 |
| `TemplateIngredients`（未采用，见下） | 早期草案：构造"任意可附魔物品"Ingredient；最终实现改为 Mixin 放宽（`SmithingMenuMixin`） |
| `mixin/AnvilMenuMixin` | 铁砧制作逻辑注入（模板只读 + 固定 10 级/9 块规则） |
| `mixin/SmithingMenuMixin` | 放宽锻造台基底槽（任意合法物品可放入/shift 放入），模板槽无需处理 |

**不需要**锻造台消耗 Mixin：已核实 1.21.11 `SmithingMenu.onTake` 对模板/基底/材料三槽
**无条件各 -1**（非空才扣），模板必被消耗。模板槽插入由配方原料驱动自动放行；
基底槽因"任意合法物品"无法用 `Ingredient` 表达，才需要 `SmithingMenuMixin` 放宽。

### 5.2 物品数据如何存储

复用原版 `minecraft:enchantments` 组件（类 `ItemEnchantments`；1.21.2+ 中
`enchantments` 与 `stored_enchantments` **两个组件都是这个类**，没有 EnchantmentStorage）：
- 读：`stack.getOrDefault(DataComponents.ENCHANTMENTS, ItemEnchantments.EMPTY)`
- 写：`stack.set(DataComponents.ENCHANTMENTS, ...)` 或 `EnchantmentHelper.updateEnchantments(stack, mutable -> ...)`
- 读附魔书：`EnchantmentHelper.getEnchantmentsForCrafting(book)`（对书自动读
  `stored_enchantments`，对普通物品读 `enchantments`，一套代码通用）。
- 工具提示、发光、`/data` 检查全部由原版机制接管。

### 5.3 铁砧逻辑如何注入（Mixin）

原版 `AnvilMenu.createResult()` 末尾有"**cost ≥ 40 且非创造 → 结果清空**"（Too Expensive 来源）；
本配方固定为 10 级，不会达到该阈值。
`onTake` 会自动：扣 `cost` 级经验 → 若 `repairItemCountCost > 0` 则右槽 `shrink(repairItemCountCost)`
（否则清空）→ 清空左槽 → `cost.set(0)`；`mayPickup` 要求 `cost > 0 && (创造 || 经验等级 ≥ cost)`。

对 `createResult()` 做 `@Inject(method="createResult", at=@At("HEAD"), cancellable=true)`：
1. **左槽=附魔书 且 右槽=绿宝石块** → 接管：
   - 书无附魔（`getEnchantmentsForCrafting(left).isEmpty()`）或块 < 9 →
     输出槽置空、`cost.set(0)`、`repairItemCountCost = 0`，`cancel()`；
   - 条件满足 → 输出槽放模板、`cost.set(10)`、**`repairItemCountCost = 9`**，`cancel()`。
2. **左槽=附魔模板** → 输出置空、`cancel()`（模板只读，见第 10 节）。
3. 其它情况不 `cancel()`，原样走原版。

原理：注入直接构造新模板，只复制书的附魔组件，不读取书的 `repair_cost`
或原版计价结果。为了防止附魔书的历史 penalty、菜单旧状态或其他铁砧逻辑把费用
重新抬高，结果刷新后、`mayPickup` 取出资格判断时和 `onTake` 实际取出前都会再次
强制写入 `cost=10`；模板结果还会显式移除 `repair_cost`。原版 `onTake` 随后完成
"扣 10 级、吞书、扣 9 块、消耗时 12% 概率敲铁砧"。生存模式只需 ≥10 级，
创造模式可直接取出。

### 5.4 工作台复制配方如何注册并进入配方书

1.21.2+ 配方体系为 codec 化（`RecipeSerializer` = `MapCodec codec()` + `StreamCodec streamCodec()`）。
我们直接复用原版给特殊合成配方准备的基建：

- `TemplateCopyRecipe extends CustomRecipe`（复用原版的 `CraftingBookCategory` 与基础结构）：
  - `matches`：检查严格 3×3 网格，`(1,0)`=普通书、`(1,1)`=非空模板、其余 7 格=绿宝石
    （用 `input.getItem(x, y)`，风格同原版 `MapCloningRecipe` 等特殊配方）；
  - `assemble`：输出 `模板×2`，把输入模板的 `enchantments` 组件原样写入；
  - 配方书：覆写 `isSpecial()=false`，提供行优先的 9 格 `PlacementInfo`，并返回
    `ShapedCraftingRecipeDisplay(3, 3, ...)`；
  - 序列化器：无字段单例 → `MapCodec.unit(INSTANCE)` / `StreamCodec.unit(INSTANCE)`，
    `category` 固定在构造器（`CraftingBookCategory.MISC`）。
- `getType()` 由 `CraftingRecipe` 接口默认提供（`RecipeType.CRAFTING`），工作台自动能查到。
- JSON：`data/arsa/recipe/enchantment_template_copy.json`
  → `{"type":"arsa:template_copy"}`
- 解锁：`data/arsa/advancement/recipes/misc/enchantment_template_copy.json`；玩家获得附魔模板后
  奖励该配方，工作台配方书才会向客户端发送并显示它。
- 注意：1.21.2+ `Recipe` 的配方书数据由 `placementInfo()`/`display()` 体系提供；
  `CustomRecipe` 的默认值是“特殊、不可摆放、无展示”，不能直接沿用。

### 5.5 锻造台模板逻辑如何实现

- `TemplateApplicationRecipe implements SmithingRecipe`（**接口**，默认实现已覆盖大部分）：
  - `templateIngredient()` → `Optional.of(Ingredient.of(ArsaItems.ENCHANTMENT_TEMPLATE))`；
  - `baseIngredient()` → **"任意可附魔物品" Ingredient**（见下）；
  - `additionIngredient()` → `Optional.empty()`——原版 `Ingredient.testOptionalIngredient`
    对空 Optional 要求**该槽必须为空**，材料槽规则自动成立；
  - **需要覆盖 `matches`**：接口默认实现只测试声明的原料，无法表达“模板必须非空”
    与动态基底规则；实现检查非空模板、`isValidBase(base)` 与空材料槽；
  - `assemble(SmithingRecipeInput, HolderLookup.Provider)`：
    `canApply` 通过 → 附魔后的基底复制品；否则 `ItemStack.EMPTY`
    （原版 `SmithingMenu.createResult()` 会把结果槽置空 = "失败"表现，无需碰 GUI）；
  - `getSerializer()` 返回我们的序列化器；`getType()`/`recipeBookCategory()` 用接口默认
    （`RecipeType.SMITHING` / `SMITHING`）。
- **基底槽放行（关键，最终方案）**：1.21.2+ 锻造台槽位接受判定基于 `RecipePropertySet`——
  它是**物化物品集合**（`RecipeManager.finalizeRecipeLoading` 把所有锻造配方的
  `baseIngredient().items()` 收集成 `Set<Holder<Item>>`），自定义 Ingredient 子类无效；
  "任意合法物品"也无法表达成 Ingredient。因此：
  - `baseIngredient()` 只返回一个非空占位原料（实现里用 `Ingredient.of(Items.EMERALD)`，
    使配方管理器正常收集 SMITHING_BASE 属性集，保证配方合法）；
  - `matches()` 覆写为真正的校验（模板非空 + `isValidBase(base)` + 材料槽空）；
  - `SmithingMenuMixin` 在原版 `createInputSlotDefinitions` 的返回处**重建槽位定义**，
    仅对基底槽谓词 `or` 上"非空且非书/非模板"（保留原版其余槽位行为），
    并放宽 `canMoveIntoInputSlots` 使合法基底可 shift 放入。
  效果：剑/工具/护甲/弓/弩/三叉戟等全部放行；附魔书/普通书/模板照旧放不进去；
  原版 trim/升级配方的槽位行为完全不变（谓词取并集）。
- **模板消耗**：已核实 1.21.11 `SmithingMenu.onTake` 对模板/基底/材料三槽**无条件各 -1**
  （非空才扣），模板必被消耗、基底必被消耗——**无需任何 Mixin**。
- **模板槽插入**：我们的配方声明了模板原料 → `SMITHING_TEMPLATE` 属性集合自动包含模板 →
  可直接插入，无需 Mixin。
- 序列化器：codec 体系，配方无 JSON 字段 → `MapCodec.unit(INSTANCE)` / `StreamCodec.unit(INSTANCE)`。
- JSON：`data/arsa/recipe/enchantment_template_apply.json` → `{"type":"arsa:template_application"}`。

---

## 6. 合法性检查的实现思路（全部收口在 `TemplateEnchantments`）

### 6.1 附魔是否适用于某个 ItemStack

```java
for (Holder<Enchantment> holder : toAdd.keySet()) {
    if (!holder.value().canEnchant(base)) return false;   // 失败
}
```

- 原版 `Enchantment.canEnchant(ItemStack)`：实现为 `definition.supportedItems().test(stack.getItemHolder())`
  （数据驱动：`#minecraft:enchantable/sword`、`#chest_armor` 等 tag）。不特判附魔书，
  所以书天然返回 false；原版所有物品类型与**其它模组的物品/附魔**自动正确。
- 显式拦截：`基底 == 附魔书 || 基底 == 普通书 || 基底 == 附魔模板` → 直接失败。
- 示例自动成立：剑吃 Protection IV → false；胸甲吃 Sharpness V → false。

### 6.2 附魔互斥

- 用**静态** `Enchantment.areCompatible(Holder<Enchantment>, Holder<Enchantment>)`
  （1.21.2+ 无实例方法；实现为双向 exclusiveSet 检查，内部已含"不同附魔"判定）。
- 检查两处：模板内部两两；模板每条 × 基底已有每条。
- 覆盖原版全部 exclusive 组：锋利/亡灵杀手/节肢杀手、全套保护类、精准采集/时运、
  多重射击/穿透、激流/忠诚/引雷等。

### 6.3 处理目标已有附魔

- 已有**同种**（同 `Holder<Enchantment>`，不论等级）→ `existing.getLevel(holder) > 0` → 拒绝；
- 已有**不同种且无互斥** → 允许，结果 = 原附魔 ∪ 模板附魔，
  用 `EnchantmentHelper.updateEnchantments(out, mutable -> 逐条 mutable.set(holder, level))` 合并；
- 基底 `copy()` 后只改一个组件 → 名字/Lore/耐久/repair_cost 原样保留。

---

## 7. NBT / Data Component 设计

- 唯一组件：`minecraft:enchantments`（`ItemEnchantments`）：
  `getLevel(Holder)` / `keySet()` / `entrySet()` / `size()` / `isEmpty()` / 静态 `EMPTY`；
  可变操作走 `EnchantmentHelper.updateEnchantments(stack, Consumer<ItemEnchantments.Mutable>)`，
  `Mutable` 提供 `set(Holder, int)` / `upgrade(Holder, int)` / `removeIf` / `toImmutable`。
  **1.21.9+ 已移除 `withTooltip`/`showInTooltip`**——组件存在即显示，不要引用这两个 API。
- 调试命令：`/give @s arsa:enchantment_template[minecraft:enchantments={levels:{"minecraft:sharpness":5}}]`
- 明确不存：`repair_cost` / `custom_name` / `lore` / `custom_data` / 耐久。
- 多附魔书 → 模板：`EnchantmentHelper.getEnchantmentsForCrafting(book)` 整体复制
  （自动完成 stored→applied），诅咒、超等级附魔原样保留，不做等级上限校验。
- 发光：`enchantments` 组件非空 → `ItemStack.isEnchanted()` → 默认 `hasFoil()` 发光
  （附魔书发光靠的是另一个组件 `enchantment_glint_override`，与我们无关）。

---

## 8. 需要注意的边界情况和潜在 bug

1. **GUI 费用文本**：1.21.11 原版铁砧界面在 `cost ≥ 40 且非创造` 时
   不绘制费用文本。本配方已改为固定 10 级，原版 GUI 会正常绘制费用及红色的
   经验不足状态，因此无需任何客户端 `AnvilScreenMixin`，工作区中已移除。
2. **`repairItemCountCost = 9` 是消耗正确性的关键**：忘了它，原版把整组绿宝石块吞掉。
3. **块 < 9 必须主动置空**：否则原版把"书+块"当普通合并，输出修理费用上涨的怪书。
4. **模板再进铁砧**会被合并/改名并写入 repair_cost → 禁模板进左槽（模板只读）。
5. **砂轮**会把模板洗成"空模板"；空模板在三处使用点都要求非空，惰性物品，可接受。
6. **堆叠**：附魔相同的模板堆叠到 64、不同则不堆叠——组件判等的正确行为，不要自定义 equals。
7. **复制配方 `assemble` 必须写组件**，否则复制出两个空模板。
8. **锻造台材料槽**：放了任何东西 → `testOptionalIngredient(empty)` 失败 → 无配方 → 结果空
   （材料槽 UI 仍允许放原版 trim 材料，因为那是其它配方声明的——符合规则"放了东西就失败"）。
9. **锻造台失败显示**：失败 = `assemble` 返回 `EMPTY` = 结果槽空，无需客户端改动。
10. **服务端/客户端**：判定全在服务端菜单/配方逻辑；配方经 codec 同步（我们的单例配方天然可同步）。
11. **基底槽放行**：由 `SmithingMenuMixin` 谓词放宽实现（非空且非书/非模板即可放入），
    与配方匹配（`matches` 再做严格校验）解耦；原版 trim/升级配方槽位行为不受影响（并集）。
12. **经验**：`mayPickup` 保证生存 ≥ 10 级才可取、创造无视；取出扣 10 级。
13. **书堆叠数**：原版附魔书最大堆叠 1；其它模组若允许堆叠，制作分支加 `左槽数量 == 1` 防御。
14. **第三方附魔/物品**：`canEnchant`/`areCompatible` 走原版数据驱动；基底放行集合也由
    注册表动态计算 → 自动兼容。个别不接 vanilla API 的模组无法识别，属其自身问题。
15. **原版配方书**：`CustomRecipe` 默认 `isSpecial()=true`、`placementInfo()=NOT_PLACEABLE`
    且 `display()` 为空，按默认实现会导致复制配方不显示。工作区实现已显式提供
    3×3 `PlacementInfo` 和 `ShapedCraftingRecipeDisplay`，并在玩家获得首个附魔模板时
    通过 advancement 解锁配方；因此可在工作台配方书的“杂项”分类中查看并一键摆放。
    JEI/EMI 对动态组件结果的更深展示仍可作为后续兼容项。

---

## 9. 代码架构草案（Mojmap 1.21.11，全部签名已核实）

包结构（沿用 `name.modid`）：

```
name.modid
├── Arsa.java                         现有入口：补注册调用
├── ArsaItems.java                    物品定义
├── ArsaRecipes.java                  配方序列化器注册
├── template
│   ├── TemplateEnchantments.java     读写 / 校验 / 应用（核心逻辑唯一收口）
│   ├── TemplateCopyRecipe.java       工作台复制
│   └── TemplateApplicationRecipe.java 锻造台应用
└── mixin
    ├── AnvilMenuMixin.java           铁砧制作 + 模板只读
    ├── SmithingMenuMixin.java        锻造台基底槽放宽
```

### ArsaItems

```java
public final class ArsaItems {
    // 1.21.11 要求物品构造时必须带 RegistryKey（Item.Properties#setId），否则运行时 NPE。
    // ENCHANTMENT_GLINT_OVERRIDE=false：关闭 1.21.2+ 附魔光效，避免灰白扫光把图标洗成灰色。
    public static final Item ENCHANTMENT_TEMPLATE = new Item(
        new Item.Properties()
            .setId(ResourceKey.create(Registries.ITEM, Arsa.id("enchantment_template")))
            .component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, false)
            .stacksTo(64)
            .rarity(Rarity.RARE));

    public static void init() {
        Registry.register(BuiltInRegistries.ITEM, Arsa.id("enchantment_template"), ENCHANTMENT_TEMPLATE);
    }
}
```

### TemplateEnchantments（核心工具类）

```java
public final class TemplateEnchantments {
    private TemplateEnchantments() {}

    public static boolean isTemplate(ItemStack stack) {
        return stack.is(ArsaItems.ENCHANTMENT_TEMPLATE);
    }

    /** 模板自身的附魔数据（minecraft:enchantments 组件）。 */
    public static ItemEnchantments get(ItemStack stack) {
        return stack.getOrDefault(DataComponents.ENCHANTMENTS, ItemEnchantments.EMPTY);
    }

    /** 附魔书 -> 模板；整体复制，不丢任何条目。 */
    public static ItemStack fromBook(ItemStack book) {
        ItemStack template = new ItemStack(ArsaItems.ENCHANTMENT_TEMPLATE);
        ItemEnchantments ench = EnchantmentHelper.getEnchantmentsForCrafting(book); // 书自动读 stored
        if (!ench.isEmpty()) {
            template.set(DataComponents.ENCHANTMENTS, ench);
        }
        return template;
    }

    /** 严格合法性检查：任一不满足返回 false，锻造台结果槽为空。 */
    public static boolean canApply(ItemStack template, ItemStack base) {
        if (!isTemplate(template) || !isValidBase(base)) return false;
        ItemEnchantments toAdd = get(template);
        if (toAdd.isEmpty()) return false;

        ItemEnchantments existing = EnchantmentHelper.getEnchantmentsForCrafting(base);

        // 1) 每条都必须适用于基底；已有同种 → 拒绝
        for (Holder<Enchantment> holder : toAdd.keySet()) {
            if (!holder.value().canEnchant(base)) return false;
            if (existing.getLevel(holder) > 0) return false;
        }
        // 2) 模板内部两两互斥
        for (Holder<Enchantment> a : toAdd.keySet()) {
            for (Holder<Enchantment> b : toAdd.keySet()) {
                if (a != b && !Enchantment.areCompatible(a, b)) return false;
            }
        }
        // 3) 与基底已有附魔互斥
        for (Holder<Enchantment> a : toAdd.keySet()) {
            for (Holder<Enchantment> b : existing.keySet()) {
                if (!Enchantment.areCompatible(a, b)) return false;
            }
        }
        return true;
    }

    /** 1 个基底复制品 + 合并附魔；名字/Lore/耐久/repair_cost 全部原样保留。 */
    public static ItemStack applyTo(ItemStack template, ItemStack base) {
        ItemStack out = base.copy();
        out.setCount(1); // 锻造台只扣 1 个基底，防止可堆叠的可附魔物品被整组复制
        ItemEnchantments toAdd = get(template);
        EnchantmentHelper.updateEnchantments(out, mutable -> {
            for (Holder<Enchantment> holder : toAdd.keySet()) {
                mutable.set(holder, toAdd.getLevel(holder));
            }
        });
        return out;
    }
}
```

### SmithingMenuMixin（锻造台基底槽放宽；与工作区实现一致）

```java
@Mixin(SmithingMenu.class)
public abstract class SmithingMenuMixin {
    @Unique
    private static final Predicate<ItemStack> ARSA_BASE_PREDICATE = stack ->
        !stack.isEmpty() && TemplateEnchantments.isValidBase(stack);

    // 原版基底槽只接受 RecipePropertySet 出现过的物品；在槽位定义基础上放宽基底槽（取并集）
    @Inject(method = "createInputSlotDefinitions", at = @At("RETURN"), cancellable = true)
    private static void arsa$widenBaseSlot(RecipeAccess recipeAccess,
                                           CallbackInfoReturnable<ItemCombinerMenuSlotDefinition> cir) {
        ItemCombinerMenuSlotDefinition original = cir.getReturnValue();
        ItemCombinerMenuSlotDefinition.Builder builder = ItemCombinerMenuSlotDefinition.create();
        for (ItemCombinerMenuSlotDefinition.SlotDefinition slot : original.getSlots()) {
            Predicate<ItemStack> predicate = slot.mayPlace();
            if (slot.slotIndex() == SmithingMenu.BASE_SLOT) {
                predicate = predicate.or(ARSA_BASE_PREDICATE);
            }
            builder.withSlot(slot.slotIndex(), slot.x(), slot.y(), predicate);
        }
        ItemCombinerMenuSlotDefinition.SlotDefinition result = original.getResultSlot();
        builder.withResultSlot(result.slotIndex(), result.x(), result.y());
        cir.setReturnValue(builder.build());
    }

    // 允许 shift 点击把合法基底放入锻造台
    @Inject(method = "canMoveIntoInputSlots", at = @At("RETURN"), cancellable = true)
    private void arsa$allowBaseShiftClick(ItemStack stack, CallbackInfoReturnable<Boolean> cir) {
        if (!cir.getReturnValue() && ARSA_BASE_PREDICATE.test(stack)) {
            cir.setReturnValue(true);
        }
    }
}
```

### AnvilMenuMixin（铁砧制作 + 模板只读；与工作区实现一致）

> 关键写法（1.21.11 实测）：mixin 直接 **extends ItemCombinerMenu**（与官方 Fabric API 的
> AnvilMenuMixin 同款），`inputSlots`/`resultSlots`/`broadcastChanges()` 全部继承直接调用，
> 只对 AnvilMenu 自身的私有字段保留 @Shadow。不要在 mixin 里 @Shadow 祖先类的**方法**
> （开发环境无 refMap 时可能解析失败导致服务器启动崩溃）。

```java
@Mixin(AnvilMenu.class)
public abstract class AnvilMenuMixin extends ItemCombinerMenu {
    @Unique
    private static final int TEMPLATE_LEVEL_COST = 10;
    @Shadow private DataSlot cost;
    @Shadow private int repairItemCountCost;

    protected AnvilMenuMixin(MenuType<?> type, int syncId, Inventory playerInventory,
                             ContainerLevelAccess context, ItemCombinerMenuSlotDefinition forgingSlotsManager) {
        super(type, syncId, playerInventory, context, forgingSlotsManager);
    }

    @Inject(method = "createResult", at = @At("HEAD"), cancellable = true)
    private void arsa$handleTemplateRecipe(CallbackInfo ci) {
        ItemStack left  = this.inputSlots.getItem(0);
        ItemStack right = this.inputSlots.getItem(1);

        // 模板只读：禁止再进铁砧合并/改名
        if (TemplateEnchantments.isTemplate(left)) {
            ci.cancel();
            this.resultSlots.setItem(0, ItemStack.EMPTY);
            this.cost.set(0);
            this.repairItemCountCost = 0;
            this.broadcastChanges();
            return;
        }

        // 制作：附魔书(左) + 绿宝石块(右)
        if (left.is(Items.ENCHANTED_BOOK) && right.is(Items.EMERALD_BLOCK)) {
            ci.cancel();
            if (EnchantmentHelper.getEnchantmentsForCrafting(left).isEmpty() || right.getCount() < 9) {
                this.resultSlots.setItem(0, ItemStack.EMPTY);
                this.cost.set(0);
                this.repairItemCountCost = 0;
            } else {
                this.arsa$setFixedTemplateResult(TemplateEnchantments.fromBook(left));
            }
            this.broadcastChanges();
        }
    }

    // 完整实现还会在 createResult RETURN、mayPickup HEAD 与 onTake HEAD
    // 三处调用同一归一规则：移除结果 repair_cost、cost=10、右槽消耗=9。
    // mayPickup 对模板直接按“创造或经验等级>=10”返回，杜绝旧 cost 参与判断。
}
```

### TemplateApplicationRecipe（锻造台应用；覆写 matches 表达动态规则）

```java
public class TemplateApplicationRecipe implements SmithingRecipe {
    public static final TemplateApplicationRecipe INSTANCE = new TemplateApplicationRecipe();

    private TemplateApplicationRecipe() {}

    @Override public Optional<Ingredient> templateIngredient() {
        return Optional.of(Ingredient.of(ArsaItems.ENCHANTMENT_TEMPLATE));
    }
    @Override public Ingredient baseIngredient() {
        // 槽位插入由 SmithingMenuMixin 放宽；这里仅提供非空占位原料，
        // 使 RecipeManager 能正常收集 SMITHING_BASE 属性集、配方不被打回。
        return Ingredient.of(Items.EMERALD);
    }
    @Override public Optional<Ingredient> additionIngredient() {
        return Optional.empty(); // testOptionalIngredient(empty) => 材料槽必须为空
    }

    // matches 覆写为真正的规则校验（接口默认实现只测原料，表达不了"模板必须非空"等）
    @Override public boolean matches(SmithingRecipeInput input, Level level) {
        return TemplateEnchantments.isTemplate(input.template())
            && !TemplateEnchantments.get(input.template()).isEmpty()
            && TemplateEnchantments.isValidBase(input.base())
            && input.addition().isEmpty();
    }

    @Override public ItemStack assemble(SmithingRecipeInput input, HolderLookup.Provider registries) {
        return TemplateEnchantments.canApply(input.template(), input.base())
            ? TemplateEnchantments.applyTo(input.template(), input.base())
            : ItemStack.EMPTY;   // 失败 → 原版把结果槽置空
    }

    @Override public boolean isSpecial() { return true; }        // 跳过 placement 告警
    @Override public PlacementInfo placementInfo() { return PlacementInfo.NOT_PLACEABLE; }
    @Override public RecipeSerializer<?> getSerializer() { return ArsaRecipes.TEMPLATE_APPLICATION; }
    // getType()/recipeBookCategory() 用接口默认（RecipeType.SMITHING / SMITHING）

    public static final MapCodec<TemplateApplicationRecipe> CODEC = MapCodec.unit(INSTANCE);
    public static final StreamCodec<RegistryByteBuf, TemplateApplicationRecipe> STREAM_CODEC =
        StreamCodec.unit(INSTANCE);
}
```

### 铁砧客户端 GUI

费用改为 10 级后，原版 `AnvilScreen` 会自行显示费用文本和经验不足的红色状态。
不再需要客户端 Mixin，`AnvilScreenMixin.java` 与 `arsa.client.mixins.json` 均已删除。

### TemplateCopyRecipe（工作台复制；复用原版 CustomRecipe 基建）

```java
public class TemplateCopyRecipe extends CustomRecipe {
    public static final TemplateCopyRecipe INSTANCE = new TemplateCopyRecipe();

    public static final MapCodec<TemplateCopyRecipe> CODEC = MapCodec.unit(INSTANCE);
    public static final StreamCodec<RegistryByteBuf, TemplateCopyRecipe> STREAM_CODEC =
        StreamCodec.unit(INSTANCE);

    private TemplateCopyRecipe() {
        super(CraftingBookCategory.MISC);
    }

    @Override public boolean matches(CraftingInput input, Level level) {
        if (input.width() != 3 || input.height() != 3) return false;
        if (!input.getItem(1, 0).is(Items.BOOK)) return false;                        // 上中=书
        ItemStack template = input.getItem(1, 1);                                     // 正中=模板
        if (!TemplateEnchantments.isTemplate(template)
            || TemplateEnchantments.get(template).isEmpty()) return false;
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                if ((x == 1 && y == 0) || (x == 1 && y == 1)) continue;
                if (!input.getItem(x, y).is(Items.EMERALD)) return false;             // 其余 7 格
            }
        }
        return true;
    }

    @Override public ItemStack assemble(CraftingInput input, HolderLookup.Provider registries) {
        ItemStack result = new ItemStack(ArsaItems.ENCHANTMENT_TEMPLATE, 2);
        for (int i = 0; i < input.size(); i++) {
            ItemStack stack = input.getItem(i);
            if (TemplateEnchantments.isTemplate(stack)) {
                result.set(DataComponents.ENCHANTMENTS, TemplateEnchantments.get(stack));
                break;
            }
        }
        return result;
    }

    @Override public boolean isSpecial() { return false; }
    @Override public PlacementInfo placementInfo() { return PLACEMENT_INFO; }
    @Override public List<RecipeDisplay> display() {
        List<SlotDisplay> ingredients = PATTERN_INGREDIENTS.stream()
            .map(value -> value.map(Ingredient::display).orElse(SlotDisplay.Empty.INSTANCE))
            .toList();
        return List.of(new ShapedCraftingRecipeDisplay(
            3, 3, ingredients,
            new SlotDisplay.ItemStackSlotDisplay(new ItemStack(ArsaItems.ENCHANTMENT_TEMPLATE, 2)),
            new SlotDisplay.ItemSlotDisplay(Items.CRAFTING_TABLE)));
    }
    @Override public RecipeSerializer<?> getSerializer() { return ArsaRecipes.TEMPLATE_COPY; }
}
```

`PATTERN_INGREDIENTS` / `PLACEMENT_INFO` 按行优先排列：
`绿宝石, 书, 绿宝石, 绿宝石, 模板, 绿宝石, 绿宝石, 绿宝石, 绿宝石`。

### ArsaRecipes + 入口

```java
public final class ArsaRecipes {
    public static final RecipeSerializer<TemplateCopyRecipe> TEMPLATE_COPY = new RecipeSerializer<>() {
        @Override public MapCodec<TemplateCopyRecipe> codec() { return TemplateCopyRecipe.CODEC; }
        @Override public StreamCodec<RegistryByteBuf, TemplateCopyRecipe> streamCodec() {
            return TemplateCopyRecipe.STREAM_CODEC;
        }
    };
    public static final RecipeSerializer<TemplateApplicationRecipe> TEMPLATE_APPLICATION = new RecipeSerializer<>() {
        @Override public MapCodec<TemplateApplicationRecipe> codec() { return TemplateApplicationRecipe.CODEC; }
        @Override public StreamCodec<RegistryByteBuf, TemplateApplicationRecipe> streamCodec() {
            return TemplateApplicationRecipe.STREAM_CODEC;
        }
    };

    public static void init() {
        Registry.register(BuiltInRegistries.RECIPE_SERIALIZER, Arsa.id("template_copy"), TEMPLATE_COPY);
        Registry.register(BuiltInRegistries.RECIPE_SERIALIZER, Arsa.id("template_application"), TEMPLATE_APPLICATION);
    }
}
// 入口 Arsa.onInitialize() 追加：
//   ArsaItems.init();
//   ArsaRecipes.init();
//   ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.INGREDIENTS).register(entries ->
//       entries.addAfter(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, ArsaItems.ENCHANTMENT_TEMPLATE));
//   // 【小核】addAfter 重载以 Fabric API 0.141.x 为准；如签名不符用 entries.accept(...)
```

### 资源文件

```
src/main/resources/
├── arsa.mixins.json            （现有；mixins 数组加入 AnvilMenuMixin、SmithingMenuMixin）
├── assets/arsa/
│   ├── lang/zh_cn.json         {"item.arsa.enchantment_template": "附魔模板"}
│   ├── lang/en_us.json         {"item.arsa.enchantment_template": "Enchantment Template"}
│   ├── items/enchantment_template.json
│   ├── models/item/enchantment_template.json
│   └── textures/item/enchantment_template.png
└── data/arsa/
    ├── recipe/
    │   ├── enchantment_template_copy.json     {"type":"arsa:template_copy"}
    │   └── enchantment_template_apply.json    {"type":"arsa:template_application"}
    └── advancement/recipes/misc/enchantment_template_copy.json
```

`build.gradle` / `gradle.properties` 无需改动；datagen 入口可保留不动（本期手写 JSON 即可）。

---

## 10. 规则里不合理/易歧义的点 + 最小改动修正

1. **（已核实）1.21.11 真实存在**；本工程已指向它，方案按 1.21.2+ API 体系编写并经官方映射+反编译核实。
2. **Too Expensive 与 GUI 费用**：本配方固定 10 级，低于原版 40 级阈值；
   原版 GUI 自行显示，不需要 `AnvilScreenMixin`。
3. **建议补规则：模板只读**，禁止进铁砧（否则原版会合并两个模板并写入 repair_cost）——已实现。
4. **建议复制配方要求模板非空**（否则可无限复制空模板）——已实现。
5. **绿宝石块数量**：建议明确"**≥9 个、消耗 9 个**"；想严格可改恰好 9。
6. **锻造台材料槽必须为空**：由 `additionIngredient()=Optional.empty()` 天然保证，规则已明确。
7. **"已有同种附魔禁止"的代价**：已附魔装备需先砂轮洗掉再贴模板——选定规则的必然结果，建议写进模组说明。
8. **多附魔书一条不适用 → 整本失败**：混有诅咒的"万能书"受限制，属选定规则，无需改。
9. **铁砧方向性**：书必须左槽、块必须右槽，反向不触发，需文档说明。
10. **"支付 10 级"**：实现为取出时扣 10 级（原版 `giveExperienceLevels(-10)`）；
    对任意非空附魔书都是同一价格，不叠加 penalty。
11. **复制用"普通书"**：`minecraft:book`，不是书与笔/附魔书。
12. **锻造台无经验、不涨 repair_cost**：原版天然保证，保持原样。
13. **可堆叠基底的数量安全**：`base.copy()` 会保留整组数量，但锻造台只消耗 1 个基底；
    实现已在结果中 `setCount(1)`，避免可穿戴或其他模组的可堆叠可附魔物品被整组复制。

---

## 附录：自查说明与 UI 验收清单

**已完成的验证**：
1. 全部关键 API 已通过 **Mojang 官方 1.21.11 映射表（piston-data client.txt）+ CFR 反编译 client-1.21.11.jar** 逐条核实；
2. 独立重跑 `gradlew build` 通过；费用改为 10 级后已删除不再需要的 `AnvilScreenMixin`；
   之前并修复了一处 remap 警告
   （`@Shadow` 字段类型必须与真实字段完全一致，否则生产环境 mixin 引用不会被重映射）；
3. **服务端冒烟测试（已通过）**：`gradlew runServer --args="nogui"` 启动专用服务器，日志确认
   `arsa 1.1.0 加载` → `Arsa enchantment template initialized` → `Loaded 1472 recipes`（两个配方
   JSON 解析无误）→ `Done (4.768s)!`。冒烟测试实际抓到并修复了两个真实运行时 bug：
   - Mixin 里 `@Shadow` 祖先类方法（`broadcastChanges`）在无 refMap 的开发环境解析失败导致启动崩溃
     → 改为 mixin 直接 `extends ItemCombinerMenu`（官方 Fabric API 同款写法），字段/方法全部继承；
   - 1.21.11 的 `Item` 构造器要求物品必须先带 RegistryKey（`Item.Properties#setId`），否则
     `Item id not set` NPE → `ArsaItems` 构造时 `setId(ResourceKey.create(Registries.ITEM, ...))`；
   - 第四次冒烟用临时 `Class.forName("net.minecraft.world.inventory.SmithingMenu")` 强制加载锻造台
     菜单类，确认 `SmithingMenuMixin`（含 private static 方法注入）运行时应用成功（验证后已移除临时代码，
     最终 jar 已确认不含冒烟残留）；
4. 物品贴图已按用户期望效果重建（棕甲+金饰+绿宝石簇，源=用户提供的期望图，色差抠图+裁剪+缩放），
   并重做了 `icon.png`；dev 客户端启动验证：`arsa` 资源加载与 items 图集构建零错误、零警告；
5. **多模组兼容性（已实测通过）**：用户实例 179 个模组（sodium/iris/lithium/carpet/litematica 全家桶、
   worldedit、voicechat、inventoryprofilesnext 等）实机日志逐行核对：`arsa` 资源加载、items 图集构建、
   Mixin 应用、1472 配方加载全程**零错误零警告**，与其它模组无任何冲突；实例内 jar 与构建产物
   逐字节一致。之前截图中物品显示紫黑棋盘格 = 旧 jar（贴图缺失）时代的产物，换新 jar 后消失。

**仍待人工验收（需要真实客户端 UI）**：本环境无法交互式操作客户端，请按下面清单在
`gradlew runClient` 里逐项测试并截图存档：

1. `gradlew runClient`，新世界，`/gamemode creative`。
2. **铁砧-正常**：任意非空附魔书(左) + 9 绿宝石块(右) → 发光模板、费用 10；
   `/experience set @s 9 levels` 取不出；10 级可取出并扣光；放 10 块剩 1 块；
   书与 9 块被消耗。分别测试低级/高级/多附魔书，均应为 10 级且输出无 penalty。
3. **铁砧-失败**：无附魔书 + 9 块 → 空；附魔书 + 8 块 → 空。
4. **工作台**：按布局摆放 → 输出 2 个模板；`/data get entity @s SelectedItem` 核对组件一致；
   复制品发光、堆叠 64。截图工作台界面。
5. **锻造台-成功**：Sharpness V 模板 + 剑 → 锋利 V 剑（无经验、无惩罚）。截图锻造台界面。
6. **锻造台-失败矩阵**：模板 + 胸甲 → 空；模板 + 已有锋利剑 → 空；模板 + 附魔书 → 空（书放不进基底槽）；
   材料槽放材料 → 空。
7. **多附魔**：`/give @s minecraft:enchanted_book[minecraft:stored_enchantments={levels:{"minecraft:sharpness":5,"minecraft:unbreaking":3}}]`
   → 制作模板 → 应用，两条附魔齐全；换成不适用附魔 → 整体失败。
8. **互斥**：锋利+亡灵杀手模板 → 应用失败。
9. **创造模式**：0 级创造玩家可在铁砧取出模板，不扣级。
10. 可选：专用服务器联机测试（逻辑全在服务端）。

（可选）Fabric GameTest 写 3 个 `canApply` 用例（成功/类型不符/互斥）作 CI 回归。
