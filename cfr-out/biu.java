/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFixUtils
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 */
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Map;
import java.util.Optional;

public class biu
extends bow {
    private static final Map<String, String> c = Map.ofEntries(Map.entry("b", "minecraft:base"), Map.entry("bl", "minecraft:square_bottom_left"), Map.entry("br", "minecraft:square_bottom_right"), Map.entry("tl", "minecraft:square_top_left"), Map.entry("tr", "minecraft:square_top_right"), Map.entry("bs", "minecraft:stripe_bottom"), Map.entry("ts", "minecraft:stripe_top"), Map.entry("ls", "minecraft:stripe_left"), Map.entry("rs", "minecraft:stripe_right"), Map.entry("cs", "minecraft:stripe_center"), Map.entry("ms", "minecraft:stripe_middle"), Map.entry("drs", "minecraft:stripe_downright"), Map.entry("dls", "minecraft:stripe_downleft"), Map.entry("ss", "minecraft:small_stripes"), Map.entry("cr", "minecraft:cross"), Map.entry("sc", "minecraft:straight_cross"), Map.entry("bt", "minecraft:triangle_bottom"), Map.entry("tt", "minecraft:triangle_top"), Map.entry("bts", "minecraft:triangles_bottom"), Map.entry("tts", "minecraft:triangles_top"), Map.entry("ld", "minecraft:diagonal_left"), Map.entry("rd", "minecraft:diagonal_up_right"), Map.entry("lud", "minecraft:diagonal_up_left"), Map.entry("rud", "minecraft:diagonal_right"), Map.entry("mc", "minecraft:circle"), Map.entry("mr", "minecraft:rhombus"), Map.entry("vh", "minecraft:half_vertical"), Map.entry("hh", "minecraft:half_horizontal"), Map.entry("vhr", "minecraft:half_vertical_right"), Map.entry("hhb", "minecraft:half_horizontal_bottom"), Map.entry("bo", "minecraft:border"), Map.entry("cbo", "minecraft:curly_border"), Map.entry("gra", "minecraft:gradient"), Map.entry("gru", "minecraft:gradient_up"), Map.entry("bri", "minecraft:bricks"), Map.entry("glb", "minecraft:globe"), Map.entry("cre", "minecraft:creeper"), Map.entry("sku", "minecraft:skull"), Map.entry("flo", "minecraft:flower"), Map.entry("moj", "minecraft:mojang"), Map.entry("pig", "minecraft:piglin"));

    public biu(Schema $$0) {
        super($$0, false, "BannerPatternFormatFix", bqh.w, "minecraft:banner");
    }

    @Override
    protected Typed<?> a(Typed<?> $$0) {
        return $$0.update(DSL.remainderFinder(), biu::a);
    }

    private static Dynamic<?> a(Dynamic<?> $$02) {
        return $$02.renameAndFixField("Patterns", "patterns", $$0 -> $$0.createList($$0.asStream().map(biu::b)));
    }

    private static Dynamic<?> b(Dynamic<?> $$0) {
        $$0 = $$0.renameAndFixField("Pattern", "pattern", $$02 -> (Dynamic)DataFixUtils.orElse((Optional)$$02.asString().map($$0 -> c.getOrDefault($$0, (String)$$0)).map(arg_0 -> ((Dynamic)$$02).createString(arg_0)).result(), (Object)$$02));
        $$0 = $$0.set("color", $$0.createString(bib.a($$0.get("Color").asInt(0))));
        $$0 = $$0.remove("Color");
        return $$0;
    }
}

