/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMaps
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 */
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class ais
extends Record
implements aay<aib> {
    private final int b;
    private final int c;
    private final short d;
    private final byte e;
    private final dhu f;
    private final Int2ObjectMap<xa> g;
    private final xa h;
    private static final int i = 128;
    private static final aao<xq, Int2ObjectMap<xa>> j = aam.a(Int2ObjectOpenHashMap::new, aam.e.a(Short::intValue, Integer::shortValue), xa.b, 128);
    public static final aao<xq, ais> a = aao.a(aam.x, ais::b, aam.h, ais::e, aam.e, ais::f, aam.c, ais::g, dhu.h, ais::h, j, ais::i, xa.b, ais::j, ais::new);

    public ais(int $$0, int $$1, short $$2, byte $$3, dhu $$4, Int2ObjectMap<xa> $$5, xa $$6) {
        $$5 = Int2ObjectMaps.unmodifiable($$5);
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
        this.e = $$3;
        this.f = $$4;
        this.g = $$5;
        this.h = $$6;
    }

    @Override
    public aba<ais> a() {
        return ahz.bG;
    }

    @Override
    public void a(aib $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ais.class, "containerId;stateId;slotNum;buttonNum;clickType;changedSlots;carriedItem", "b", "c", "d", "e", "f", "g", "h"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ais.class, "containerId;stateId;slotNum;buttonNum;clickType;changedSlots;carriedItem", "b", "c", "d", "e", "f", "g", "h"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ais.class, "containerId;stateId;slotNum;buttonNum;clickType;changedSlots;carriedItem", "b", "c", "d", "e", "f", "g", "h"}, this, $$0);
    }

    public int b() {
        return this.b;
    }

    public int e() {
        return this.c;
    }

    public short f() {
        return this.d;
    }

    public byte g() {
        return this.e;
    }

    public dhu h() {
        return this.f;
    }

    public Int2ObjectMap<xa> i() {
        return this.g;
    }

    public xa j() {
        return this.h;
    }
}

