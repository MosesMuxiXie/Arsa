/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.lang.runtime.SwitchBootstraps;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;

public final class bwu
extends Record {
    private final String b;
    private final String c;
    private final int d;
    private final float e;
    private final float f;
    private final String g;
    private final boolean h;
    private final int i;
    private final List<String> j;
    private final List<String> k;
    private final List<String> l;
    private final List<String> m;
    private final Set<is> n;
    private final Set<is> o;
    public static final aao<wx, bwu> a = aao.a((B $$0, V $$1) -> $$1.a((wx)((Object)$$0)), bwu::new);

    public bwu(wx $$0) {
        this($$0.p(), $$0.p(), $$0.readInt(), $$0.readFloat(), $$0.readFloat(), $$0.p(), $$0.readBoolean(), $$0.readInt(), $$0.a(wx::p), $$0.a(wx::p), $$0.a(wx::p), $$0.a(wx::p), (Set)((Object)$$0.a(HashSet::new, is.b)), (Set)((Object)$$0.a(HashSet::new, is.b)));
    }

    public bwu(String $$0, String $$1, int $$2, float $$3, float $$4, String $$5, boolean $$6, int $$7, List<String> $$8, List<String> $$9, List<String> $$10, List<String> $$11, Set<is> $$12, Set<is> $$13) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
        this.e = $$3;
        this.f = $$4;
        this.g = $$5;
        this.h = $$6;
        this.i = $$7;
        this.j = $$8;
        this.k = $$9;
        this.l = $$10;
        this.m = $$11;
        this.n = $$12;
        this.o = $$13;
    }

    public void a(wx $$0) {
        $$0.a(this.b);
        $$0.a(this.c);
        $$0.q(this.d);
        $$0.a(this.e);
        $$0.a(this.f);
        $$0.a(this.g);
        $$0.a(this.h);
        $$0.q(this.i);
        $$0.a(this.j, wx::a);
        $$0.a(this.k, wx::a);
        $$0.a(this.l, wx::a);
        $$0.a(this.m, wx::a);
        $$0.a(this.n, is.b);
        $$0.a(this.o, is.b);
    }

    public static bwu a(axf $$02, chl $$1) {
        List<String> list;
        int n2;
        dcx $$16;
        boolean $$17;
        String $$15;
        int $$7;
        String $$6;
        String $$2 = ahy.a($$1);
        if ($$1 instanceof dcx) {
            dcx $$3 = (dcx)$$1;
            String $$4 = $$3.gZ().b().g();
            int $$5 = $$3.d();
        } else {
            $$6 = "";
            $$7 = 0;
        }
        float $$8 = $$1.eZ();
        float $$9 = $$1.fq();
        cim<?> $$10 = $$1.ev();
        long $$11 = $$1.ao().au();
        if ($$1 instanceof dct) {
            dct $$12 = (dct)((Object)$$1);
            cdk $$13 = $$12.gP();
            String $$14 = $$13.c() ? "" : ((Object)$$13).toString();
        } else {
            $$15 = "";
        }
        boolean bl2 = $$17 = $$1 instanceof dcx && ($$16 = (dcx)$$1).a($$11);
        if ($$1 instanceof dch) {
            dch $$18 = (dch)$$1;
            n2 = $$18.p();
        } else {
            n2 = -1;
        }
        int $$19 = n2;
        List<String> $$20 = $$10.c().stream().map(dfl::a).toList();
        List<String> $$21 = $$10.d().stream().map(cje::b).toList();
        List<String> $$22 = bwu.a($$02, $$1, $$11).map($$0 -> bhi.a($$0, 255, true)).toList();
        Set<is> $$23 = bwu.a($$10, cqw.c, cqw.b, cqw.e);
        Set<is> $$24 = bwu.a($$10, cqw.d);
        if ($$1 instanceof dcx) {
            dcx $$25 = (dcx)$$1;
            list = bwu.a($$25);
        } else {
            list = List.of();
        }
        List<String> $$26 = list;
        return new bwu($$2, $$6, $$7, $$8, $$9, $$15, $$17, $$19, $$20, $$21, $$22, $$26, $$23, $$24);
    }

    @SafeVarargs
    private static Set<is> a(cim<?> $$0, cqw<jc> ... $$1) {
        return Stream.of($$1).filter($$0::a).map($$0::c).flatMap(Optional::stream).map(jc::b).collect(Collectors.toSet());
    }

    private static List<String> a(dcx $$0) {
        ArrayList<String> $$12 = new ArrayList<String>();
        $$0.he().a().forEach(($$1, $$22) -> {
            String $$32 = ahy.a($$1);
            $$22.forEach(($$2, $$3) -> $$12.add($$32 + ": " + String.valueOf($$2) + ": " + $$3));
        });
        return $$12;
    }

    private static Stream<String> a(axf $$0, chl $$1, long $$22) {
        return $$1.ev().b().entrySet().stream().map($$2 -> {
            cqw $$3 = (cqw)$$2.getKey();
            Optional $$4 = (Optional)$$2.getValue();
            return bwu.a($$0, $$22, $$3, $$4);
        }).sorted();
    }

    private static String a(axf $$0, long $$1, cqw<?> $$2, Optional<? extends cqv<?>> $$3) {
        String $$10;
        if ($$3.isPresent()) {
            cqv<?> $$4 = $$3.get();
            Object $$5 = $$4.c();
            if ($$2 == cqw.E) {
                long $$6 = $$1 - (Long)$$5;
                String $$7 = $$6 + " ticks ago";
            } else if ($$4.e()) {
                String $$8 = bwu.a($$0, $$5) + " (ttl: " + $$4.b() + ")";
            } else {
                String $$9 = bwu.a($$0, $$5);
            }
        } else {
            $$10 = "-";
        }
        return mi.A.b($$2).a() + ": " + $$10;
    }

    private static String a(axf $$0, @Nullable Object $$12) {
        Object object = $$12;
        int n2 = 0;
        return switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{UUID.class, cgk.class, cqz.class, cjp.class, jc.class, cjg.class, cex.class, Collection.class}, (Object)object, n2)) {
            case -1 -> "-";
            case 0 -> {
                UUID $$2 = (UUID)object;
                yield bwu.a($$0, $$0.d($$2));
            }
            case 1 -> {
                cgk $$3 = (cgk)object;
                yield ahy.a($$3);
            }
            case 2 -> {
                cqz $$4 = (cqz)object;
                yield bwu.a($$0, $$4.a());
            }
            case 3 -> {
                cjp $$5 = (cjp)object;
                yield bwu.a($$0, $$5.c());
            }
            case 4 -> {
                jc $$6 = (jc)object;
                yield bwu.a($$0, $$6.b());
            }
            case 5 -> {
                cjg $$7 = (cjg)object;
                yield bwu.a($$0, $$7.b());
            }
            case 6 -> {
                cex $$8 = (cex)object;
                cgk $$9 = $$8.d();
                if ($$9 == null) {
                    yield $$12.toString();
                }
                yield bwu.a($$0, $$9);
            }
            case 7 -> {
                Collection $$10 = (Collection)object;
                yield "[" + $$10.stream().map($$1 -> bwu.a($$0, $$1)).collect(Collectors.joining(", ")) + "]";
            }
            default -> $$12.toString();
        };
    }

    public boolean a(is $$0) {
        return this.n.contains($$0);
    }

    public boolean b(is $$0) {
        return this.o.contains($$0);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{bwu.class, "name;profession;xp;health;maxHealth;inventory;wantsGolem;angerLevel;activities;behaviors;memories;gossips;pois;potentialPois", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{bwu.class, "name;profession;xp;health;maxHealth;inventory;wantsGolem;angerLevel;activities;behaviors;memories;gossips;pois;potentialPois", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{bwu.class, "name;profession;xp;health;maxHealth;inventory;wantsGolem;angerLevel;activities;behaviors;memories;gossips;pois;potentialPois", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o"}, this, $$0);
    }

    public String a() {
        return this.b;
    }

    public String b() {
        return this.c;
    }

    public int c() {
        return this.d;
    }

    public float d() {
        return this.e;
    }

    public float e() {
        return this.f;
    }

    public String f() {
        return this.g;
    }

    public boolean g() {
        return this.h;
    }

    public int h() {
        return this.i;
    }

    public List<String> i() {
        return this.j;
    }

    public List<String> j() {
        return this.k;
    }

    public List<String> k() {
        return this.l;
    }

    public List<String> l() {
        return this.m;
    }

    public Set<is> m() {
        return this.n;
    }

    public Set<is> n() {
        return this.o;
    }
}

