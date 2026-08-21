/*
 * Decompiled with CFR 0.152.
 */
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public interface gza {
    public static final int a = -1;

    @fyc.c
    public int a();

    @a
    public int b();

    default public boolean c() {
        return this.a() == 257 || this.a() == 32 || this.a() == 335;
    }

    default public boolean d() {
        return this.a() == 257 || this.a() == 335;
    }

    default public boolean e() {
        return this.a() == 256;
    }

    default public boolean f() {
        return this.a() == 263;
    }

    default public boolean g() {
        return this.a() == 262;
    }

    default public boolean h() {
        return this.a() == 265;
    }

    default public boolean i() {
        return this.a() == 264;
    }

    default public boolean j() {
        return this.a() == 258;
    }

    default public int k() {
        int $$0 = this.a() - 48;
        if ($$0 >= 0 && $$0 <= 9) {
            return $$0;
        }
        return -1;
    }

    default public boolean l() {
        return (this.b() & 4) != 0;
    }

    default public boolean m() {
        return (this.b() & 1) != 0;
    }

    default public boolean n() {
        return (this.b() & 2) != 0;
    }

    default public boolean o() {
        return (this.b() & gyz.b) != 0;
    }

    default public boolean p() {
        return this.a() == 65 && this.o() && !this.m() && !this.l();
    }

    default public boolean q() {
        return this.a() == 67 && this.o() && !this.m() && !this.l();
    }

    default public boolean r() {
        return this.a() == 86 && this.o() && !this.m() && !this.l();
    }

    default public boolean s() {
        return this.a() == 88 && this.o() && !this.m() && !this.l();
    }

    @Retention(value=RetentionPolicy.CLASS)
    @Target(value={ElementType.FIELD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.METHOD, ElementType.TYPE_USE})
    public static @interface a {
    }
}

