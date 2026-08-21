/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 */
import com.google.common.collect.Sets;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Set;

public final class aew
extends Record
implements aay<adb> {
    private final int b;
    private final boolean c;
    private final Set<amt<dwo>> d;
    private final int e;
    private final int f;
    private final int g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final ahx k;
    private final boolean l;
    public static final aao<xq, aew> a = aay.a(aew::a, aew::new);

    private aew(xq $$02) {
        this($$02.readInt(), $$02.readBoolean(), (Set)((Object)$$02.a(Sets::newHashSetWithExpectedSize, (? super B $$0) -> $$0.a(mj.bE))), $$02.l(), $$02.l(), $$02.l(), $$02.readBoolean(), $$02.readBoolean(), $$02.readBoolean(), new ahx($$02), $$02.readBoolean());
    }

    public aew(int $$0, boolean $$1, Set<amt<dwo>> $$2, int $$3, int $$4, int $$5, boolean $$6, boolean $$7, boolean $$8, ahx $$9, boolean $$10) {
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
    }

    @Override
    private void a(xq $$0) {
        $$0.q(this.b);
        $$0.a(this.c);
        $$0.a(this.d, wx::b);
        $$0.c(this.e);
        $$0.c(this.f);
        $$0.c(this.g);
        $$0.a(this.h);
        $$0.a(this.i);
        $$0.a(this.j);
        this.k.a($$0);
        $$0.a(this.l);
    }

    @Override
    public aba<aew> a() {
        return ahz.T;
    }

    @Override
    public void a(adb $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{aew.class, "playerId;hardcore;levels;maxPlayers;chunkRadius;simulationDistance;reducedDebugInfo;showDeathScreen;doLimitedCrafting;commonPlayerSpawnInfo;enforcesSecureChat", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{aew.class, "playerId;hardcore;levels;maxPlayers;chunkRadius;simulationDistance;reducedDebugInfo;showDeathScreen;doLimitedCrafting;commonPlayerSpawnInfo;enforcesSecureChat", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{aew.class, "playerId;hardcore;levels;maxPlayers;chunkRadius;simulationDistance;reducedDebugInfo;showDeathScreen;doLimitedCrafting;commonPlayerSpawnInfo;enforcesSecureChat", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l"}, this, $$0);
    }

    public int b() {
        return this.b;
    }

    public boolean e() {
        return this.c;
    }

    public Set<amt<dwo>> f() {
        return this.d;
    }

    public int g() {
        return this.e;
    }

    public int h() {
        return this.f;
    }

    public int i() {
        return this.g;
    }

    public boolean j() {
        return this.h;
    }

    public boolean k() {
        return this.i;
    }

    public boolean l() {
        return this.j;
    }

    public ahx m() {
        return this.k;
    }

    public boolean n() {
        return this.l;
    }
}

