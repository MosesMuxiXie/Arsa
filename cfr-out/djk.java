/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  it.unimi.dsi.fastutil.ints.IntArrayList
 *  it.unimi.dsi.fastutil.ints.IntList
 *  it.unimi.dsi.fastutil.ints.IntLists
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import it.unimi.dsi.fastutil.ints.IntLists;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;

public class djk {
    private static final List<djj> b = bhs.a(new ArrayList(), (? super T $$0) -> {
        djk.a((List<djj>)$$0, "contents", 0);
        djk.a((List<djj>)$$0, "container.", 0, 54);
        djk.a((List<djj>)$$0, "hotbar.", 0, 9);
        djk.a((List<djj>)$$0, "inventory.", 9, 27);
        djk.a((List<djj>)$$0, "enderchest.", 200, 27);
        djk.a((List<djj>)$$0, "villager.", 300, 8);
        djk.a((List<djj>)$$0, "horse.", 500, 15);
        int $$1 = cgv.a.a(98);
        int $$2 = cgv.b.a(98);
        djk.a((List<djj>)$$0, "weapon", $$1);
        djk.a((List<djj>)$$0, "weapon.mainhand", $$1);
        djk.a((List<djj>)$$0, "weapon.offhand", $$2);
        djk.a((List<djj>)$$0, "weapon.*", new int[]{$$1, $$2});
        int $$3 = cgv.f.a(100);
        int $$4 = cgv.e.a(100);
        int $$5 = cgv.d.a(100);
        int $$6 = cgv.c.a(100);
        int $$7 = cgv.g.a(105);
        djk.a((List<djj>)$$0, "armor.head", $$3);
        djk.a((List<djj>)$$0, "armor.chest", $$4);
        djk.a((List<djj>)$$0, "armor.legs", $$5);
        djk.a((List<djj>)$$0, "armor.feet", $$6);
        djk.a((List<djj>)$$0, "armor.body", $$7);
        djk.a((List<djj>)$$0, "armor.*", $$3, $$4, $$5, $$6, $$7);
        djk.a((List<djj>)$$0, "saddle", cgv.h.a(106));
        djk.a((List<djj>)$$0, "horse.chest", 499);
        djk.a((List<djj>)$$0, "player.cursor", 499);
        djk.a((List<djj>)$$0, "player.crafting.", 500, 4);
    });
    public static final Codec<djj> a = bhh.b(() -> (djj[])b.toArray(djj[]::new));
    private static final Function<String, @Nullable djj> c = bhh.a((bhh[])((djj[])b.toArray(djj[]::new)));

    private static djj a(String $$0, int $$1) {
        return djj.a($$0, IntLists.singleton((int)$$1));
    }

    private static djj a(String $$0, IntList $$1) {
        return djj.a($$0, IntLists.unmodifiable((IntList)$$1));
    }

    private static djj a(String $$0, int ... $$1) {
        return djj.a($$0, IntList.of((int[])$$1));
    }

    private static void a(List<djj> $$0, String $$1, int $$2) {
        $$0.add(djk.a($$1, $$2));
    }

    private static void a(List<djj> $$0, String $$1, int $$2, int $$3) {
        IntArrayList $$4 = new IntArrayList($$3);
        for (int $$5 = 0; $$5 < $$3; ++$$5) {
            int $$6 = $$2 + $$5;
            $$0.add(djk.a($$1 + $$5, $$6));
            $$4.add($$6);
        }
        $$0.add(djk.a($$1 + "*", (IntList)$$4));
    }

    private static void a(List<djj> $$0, String $$1, int ... $$2) {
        $$0.add(djk.a($$1, $$2));
    }

    public static @Nullable djj a(String $$0) {
        return c.apply($$0);
    }

    public static Stream<String> a() {
        return b.stream().map(bhh::c);
    }

    public static Stream<String> b() {
        return b.stream().filter($$0 -> $$0.b() == 1).map(bhh::c);
    }
}

