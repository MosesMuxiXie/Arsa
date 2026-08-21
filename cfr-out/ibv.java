/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.objects.Object2ObjectMap
 *  it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap
 */
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.io.IOException;
import java.util.Optional;

public class ibv<S extends ieh, M extends gzm<S>>
extends ibj<S, M> {
    private static final Int2ObjectMap<amo> a = (Int2ObjectMap)bhs.a(new Int2ObjectOpenHashMap(), $$0 -> {
        $$0.put(1, (Object)amo.b("stone"));
        $$0.put(2, (Object)amo.b("iron"));
        $$0.put(3, (Object)amo.b("gold"));
        $$0.put(4, (Object)amo.b("emerald"));
        $$0.put(5, (Object)amo.b("diamond"));
    });
    private final Object2ObjectMap<amt<ddc>, inb.a> b = new Object2ObjectOpenHashMap();
    private final Object2ObjectMap<amt<dda>, inb.a> c = new Object2ObjectOpenHashMap();
    private final baz d;
    private final String e;
    private final M f;
    private final M g;

    public ibv(hyq<S, M> $$0, baz $$1, String $$2, M $$3, M $$4) {
        super($$0);
        this.d = $$1;
        this.e = $$2;
        this.f = $$3;
        this.g = $$4;
    }

    @Override
    public void a(fzm $$0, hpo $$1, int $$2, S $$3, float $$4, float $$5) {
        if (((ieh)$$3).Q) {
            return;
        }
        dcy $$6 = ((ifr)$$3).a();
        if ($$6 == null) {
            return;
        }
        jd<ddc> $$7 = $$6.a();
        jd<dda> $$8 = $$6.b();
        inb.a $$9 = this.a(this.b, "type", $$7);
        inb.a $$10 = this.a(this.c, "profession", $$8);
        Object $$11 = this.d();
        amo $$12 = this.a("type", $$7);
        boolean $$13 = $$10 == inb.a.a || $$10 == inb.a.b && $$9 != inb.a.c;
        M $$14 = ((ieh)$$3).aE ? this.g : this.f;
        ibv.b($$13 ? $$11 : $$14, $$12, $$0, $$1, $$2, $$3, -1, 1);
        if (!$$8.a(dda.b) && !((ieh)$$3).aE) {
            amo $$15 = this.a("profession", $$8);
            ibv.b($$11, $$15, $$0, $$1, $$2, $$3, -1, 2);
            if (!$$8.a(dda.m)) {
                amo $$16 = this.a("profession_level", (amo)a.get(bgj.a($$6.c(), 1, a.size())));
                ibv.b($$11, $$16, $$0, $$1, $$2, $$3, -1, 3);
            }
        }
    }

    private amo a(String $$0, amo $$12) {
        return $$12.a($$1 -> "textures/entity/" + this.e + "/" + $$0 + "/" + $$1 + ".png");
    }

    private amo a(String $$0, jd<?> $$12) {
        return $$12.e().map($$1 -> this.a($$0, $$1.a())).orElse(ilf.c());
    }

    public <K> inb.a a(Object2ObjectMap<amt<K>, inb.a> $$0, String $$1, jd<K> $$22) {
        amt $$3 = $$22.e().orElse(null);
        if ($$3 == null) {
            return inb.a.a;
        }
        return (inb.a)$$0.computeIfAbsent((Object)$$3, $$2 -> this.d.getResource(this.a($$1, $$3.a())).flatMap($$0 -> {
            try {
                return $$0.f().a(inb.b).map(inb::a);
            }
            catch (IOException $$1) {
                return Optional.empty();
            }
        }).orElse(inb.a.a));
    }
}

