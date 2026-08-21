/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.arguments.BoolArgumentType
 *  com.mojang.brigadier.arguments.DoubleArgumentType
 *  com.mojang.brigadier.arguments.FloatArgumentType
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  com.mojang.brigadier.arguments.LongArgumentType
 *  com.mojang.brigadier.arguments.StringArgumentType
 */
import com.google.common.collect.Maps;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.DoubleArgumentType;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.arguments.LongArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import java.util.Locale;
import java.util.Map;

public class ic {
    private static final Map<Class<?>, ib<?, ?>> a = Maps.newHashMap();

    private static <A extends ArgumentType<?>, T extends ib.a<A>> ib<A, T> a(jq<ib<?, ?>> $$0, String $$1, Class<? extends A> $$2, ib<A, T> $$3) {
        a.put($$2, $$3);
        return jq.a($$0, $$1, $$3);
    }

    public static ib<?, ?> a(jq<ib<?, ?>> $$0) {
        ic.a($$0, "brigadier:bool", BoolArgumentType.class, ie.a(BoolArgumentType::bool));
        ic.a($$0, "brigadier:float", FloatArgumentType.class, new ii());
        ic.a($$0, "brigadier:double", DoubleArgumentType.class, new ih());
        ic.a($$0, "brigadier:integer", IntegerArgumentType.class, new ij());
        ic.a($$0, "brigadier:long", LongArgumentType.class, new ik());
        ic.a($$0, "brigadier:string", StringArgumentType.class, new il());
        ic.a($$0, "entity", eq.class, new eq.a());
        ic.a($$0, "game_profile", es.class, ie.a(es::a));
        ic.a($$0, "block_pos", gc.class, ie.a(gc::a));
        ic.a($$0, "column_pos", gd.class, ie.a(gd::a));
        ic.a($$0, "vec3", gj.class, ie.a(gj::a));
        ic.a($$0, "vec2", gi.class, ie.a(gi::a));
        ic.a($$0, "block_state", fz.class, ie.a(fz::a));
        ic.a($$0, "block_predicate", fy.class, ie.a(fy::a));
        ic.a($$0, "item_stack", gp.class, ie.a(gp::a));
        ic.a($$0, "item_predicate", gs.class, ie.a(gs::a));
        ic.a($$0, "color", el.class, ie.a(el::a));
        ic.a($$0, "hex_color", eu.class, ie.a(eu::a));
        ic.a($$0, "component", em.class, ie.a(em::a));
        ic.a($$0, "style", fq.class, ie.a(fq::a));
        ic.a($$0, "message", ew.class, ie.a(ew::a));
        ic.a($$0, "nbt_compound_tag", en.class, ie.a(en::a));
        ic.a($$0, "nbt_tag", ey.class, ie.a(ey::a));
        ic.a($$0, "nbt_path", ex.class, ie.a(ex::a));
        ic.a($$0, "objective", ez.class, ie.a(ez::a));
        ic.a($$0, "objective_criteria", fa.class, ie.a(fa::a));
        ic.a($$0, "operation", fb.class, ie.a(fb::a));
        ic.a($$0, "particle", fc.class, ie.a(fc::a));
        ic.a($$0, "angle", ej.class, ie.a(ej::a));
        ic.a($$0, "rotation", gg.class, ie.a(gg::a));
        ic.a($$0, "scoreboard_slot", fl.class, ie.a(fl::a));
        ic.a($$0, "score_holder", fk.class, new fk.a());
        ic.a($$0, "swizzle", gh.class, ie.a(gh::a));
        ic.a($$0, "team", fr.class, ie.a(fr::a));
        ic.a($$0, "item_slot", fn.class, ie.a(fn::a));
        ic.a($$0, "item_slots", fo.class, ie.a(fo::a));
        ic.a($$0, "resource_location", ev.class, ie.a(ev::a));
        ic.a($$0, "function", go.class, ie.a(go::a));
        ic.a($$0, "entity_anchor", ep.class, ie.a(ep::a));
        ic.a($$0, "int_range", fd.b.class, ie.a(fd::a));
        ic.a($$0, "float_range", fd.a.class, ie.a(fd::b));
        ic.a($$0, "dimension", eo.class, ie.a(eo::a));
        ic.a($$0, "gamemode", er.class, ie.a(er::a));
        ic.a($$0, "time", fu.class, new fu.a());
        ic.a($$0, "resource_or_tag", ic.b(fh.class), new fh.a());
        ic.a($$0, "resource_or_tag_key", ic.b(fi.class), new fi.a());
        ic.a($$0, "resource", ic.b(fe.class), new fe.a());
        ic.a($$0, "resource_key", ic.b(ff.class), new ff.a());
        ic.a($$0, "resource_selector", ic.b(fj.class), new fj.a());
        ic.a($$0, "template_mirror", fs.class, ie.a(fs::a));
        ic.a($$0, "template_rotation", ft.class, ie.a(ft::a));
        ic.a($$0, "heightmap", et.class, ie.a(et::a));
        ic.a($$0, "loot_table", fg.e.class, ie.a(fg::a));
        ic.a($$0, "loot_predicate", fg.d.class, ie.a(fg::c));
        ic.a($$0, "loot_modifier", fg.c.class, ie.a(fg::b));
        ic.a($$0, "dialog", fg.a.class, ie.a(fg::d));
        return ic.a($$0, "uuid", fv.class, ie.a(fv::a));
    }

    private static <T extends ArgumentType<?>> Class<T> b(Class<? super T> $$0) {
        return $$0;
    }

    public static boolean a(Class<?> $$0) {
        return a.containsKey($$0);
    }

    public static <A extends ArgumentType<?>> ib<A, ?> a(A $$0) {
        ib<?, ?> $$1 = a.get($$0.getClass());
        if ($$1 == null) {
            throw new IllegalArgumentException(String.format(Locale.ROOT, "Unrecognized argument type %s (%s)", $$0, $$0.getClass()));
        }
        return $$1;
    }

    public static <A extends ArgumentType<?>> ib.a<A> b(A $$0) {
        return ic.a($$0).a($$0);
    }
}

