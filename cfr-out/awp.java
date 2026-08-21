/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public record awp(String b, int c, ddj d, boolean e, int f, chb g, boolean h, boolean i, awx j) {
    public static final int a = 16;

    public awp(wx $$0) {
        this($$0.d(16), $$0.readByte(), $$0.b(ddj.class), $$0.readBoolean(), $$0.readUnsignedByte(), $$0.b(chb.class), $$0.readBoolean(), $$0.readBoolean(), $$0.b(awx.class));
    }

    public void a(wx $$0) {
        $$0.a(this.b);
        $$0.l(this.c);
        $$0.a(this.d);
        $$0.a(this.e);
        $$0.l(this.f);
        $$0.a(this.g);
        $$0.a(this.h);
        $$0.a(this.i);
        $$0.a(this.j);
    }

    public static awp a() {
        return new awp("en_us", 2, ddj.a, true, 0, ddm.l, false, false, awx.a);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{awp.class, "language;viewDistance;chatVisibility;chatColors;modelCustomisation;mainHand;textFilteringEnabled;allowsListing;particleStatus", "b", "c", "d", "e", "f", "g", "h", "i", "j"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{awp.class, "language;viewDistance;chatVisibility;chatColors;modelCustomisation;mainHand;textFilteringEnabled;allowsListing;particleStatus", "b", "c", "d", "e", "f", "g", "h", "i", "j"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{awp.class, "language;viewDistance;chatVisibility;chatColors;modelCustomisation;mainHand;textFilteringEnabled;allowsListing;particleStatus", "b", "c", "d", "e", "f", "g", "h", "i", "j"}, this, $$0);
    }
}

