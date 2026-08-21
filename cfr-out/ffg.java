/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.MoreObjects
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  io.netty.buffer.ByteBuf
 *  org.slf4j.Logger
 */
import com.google.common.base.MoreObjects;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.Iterator;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class ffg {
    private static final Logger c = LogUtils.getLogger();
    public static final Codec<ffg> a = Codec.INT_STREAM.comapFlatMap($$02 -> bhs.a($$02, 6).map($$0 -> new ffg($$0[0], $$0[1], $$0[2], $$0[3], $$0[4], $$0[5])), $$0 -> IntStream.of($$0.d, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i)).stable();
    public static final aao<ByteBuf, ffg> b = aao.a(is.b, $$0 -> new is($$0.d, $$0.e, $$0.f), is.b, $$0 -> new is($$0.g, $$0.h, $$0.i), ($$0, $$1) -> new ffg($$0.u(), $$0.v(), $$0.w(), $$1.u(), $$1.v(), $$1.w()));
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;

    public ffg(is $$0) {
        this($$0.u(), $$0.v(), $$0.w(), $$0.u(), $$0.v(), $$0.w());
    }

    public ffg(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
        this.d = $$0;
        this.e = $$1;
        this.f = $$2;
        this.g = $$3;
        this.h = $$4;
        this.i = $$5;
        if ($$3 < $$0 || $$4 < $$1 || $$5 < $$2) {
            bhs.b("Invalid bounding box data, inverted bounds for: " + String.valueOf(this));
            this.d = Math.min($$0, $$3);
            this.e = Math.min($$1, $$4);
            this.f = Math.min($$2, $$5);
            this.g = Math.max($$0, $$3);
            this.h = Math.max($$1, $$4);
            this.i = Math.max($$2, $$5);
        }
    }

    public static ffg a(jy $$0, jy $$1) {
        return new ffg(Math.min($$0.u(), $$1.u()), Math.min($$0.v(), $$1.v()), Math.min($$0.w(), $$1.w()), Math.max($$0.u(), $$1.u()), Math.max($$0.v(), $$1.v()), Math.max($$0.w(), $$1.w()));
    }

    public static ffg a() {
        return new ffg(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
    }

    public static ffg a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, int $$8, iz $$9) {
        switch ($$9) {
            default: {
                return new ffg($$0 + $$3, $$1 + $$4, $$2 + $$5, $$0 + $$6 - 1 + $$3, $$1 + $$7 - 1 + $$4, $$2 + $$8 - 1 + $$5);
            }
            case c: {
                return new ffg($$0 + $$3, $$1 + $$4, $$2 - $$8 + 1 + $$5, $$0 + $$6 - 1 + $$3, $$1 + $$7 - 1 + $$4, $$2 + $$5);
            }
            case e: {
                return new ffg($$0 - $$8 + 1 + $$5, $$1 + $$4, $$2 + $$3, $$0 + $$5, $$1 + $$7 - 1 + $$4, $$2 + $$6 - 1 + $$3);
            }
            case f: 
        }
        return new ffg($$0 + $$5, $$1 + $$4, $$2 + $$3, $$0 + $$8 - 1 + $$5, $$1 + $$7 - 1 + $$4, $$2 + $$6 - 1 + $$3);
    }

    public Stream<dvu> b() {
        int $$0 = jw.a(this.h());
        int $$1 = jw.a(this.j());
        int $$2 = jw.a(this.k());
        int $$3 = jw.a(this.m());
        return dvu.a(new dvu($$0, $$1), new dvu($$2, $$3));
    }

    public boolean a(ffg $$0) {
        return this.g >= $$0.d && this.d <= $$0.g && this.i >= $$0.f && this.f <= $$0.i && this.h >= $$0.e && this.e <= $$0.h;
    }

    public boolean a(int $$0, int $$1, int $$2, int $$3) {
        return this.g >= $$0 && this.d <= $$2 && this.i >= $$1 && this.f <= $$3;
    }

    public static Optional<ffg> a(Iterable<is> $$0) {
        Iterator<is> $$1 = $$0.iterator();
        if (!$$1.hasNext()) {
            return Optional.empty();
        }
        ffg $$2 = new ffg($$1.next());
        $$1.forEachRemaining($$2::a);
        return Optional.of($$2);
    }

    public static Optional<ffg> b(Iterable<ffg> $$0) {
        Iterator<ffg> $$1 = $$0.iterator();
        if (!$$1.hasNext()) {
            return Optional.empty();
        }
        ffg $$2 = $$1.next();
        ffg $$3 = new ffg($$2.d, $$2.e, $$2.f, $$2.g, $$2.h, $$2.i);
        $$1.forEachRemaining($$3::b);
        return Optional.of($$3);
    }

    @Deprecated
    public ffg b(ffg $$0) {
        this.d = Math.min(this.d, $$0.d);
        this.e = Math.min(this.e, $$0.e);
        this.f = Math.min(this.f, $$0.f);
        this.g = Math.max(this.g, $$0.g);
        this.h = Math.max(this.h, $$0.h);
        this.i = Math.max(this.i, $$0.i);
        return this;
    }

    public static ffg a(ffg $$0, ffg $$1) {
        return new ffg(Math.min($$0.d, $$1.d), Math.min($$0.e, $$1.e), Math.min($$0.f, $$1.f), Math.max($$0.g, $$1.g), Math.max($$0.h, $$1.h), Math.max($$0.i, $$1.i));
    }

    @Deprecated
    public ffg a(is $$0) {
        this.d = Math.min(this.d, $$0.u());
        this.e = Math.min(this.e, $$0.v());
        this.f = Math.min(this.f, $$0.w());
        this.g = Math.max(this.g, $$0.u());
        this.h = Math.max(this.h, $$0.v());
        this.i = Math.max(this.i, $$0.w());
        return this;
    }

    @Deprecated
    public ffg a(int $$0, int $$1, int $$2) {
        this.d += $$0;
        this.e += $$1;
        this.f += $$2;
        this.g += $$0;
        this.h += $$1;
        this.i += $$2;
        return this;
    }

    @Deprecated
    public ffg a(jy $$0) {
        return this.a($$0.u(), $$0.v(), $$0.w());
    }

    public ffg b(int $$0, int $$1, int $$2) {
        return new ffg(this.d + $$0, this.e + $$1, this.f + $$2, this.g + $$0, this.h + $$1, this.i + $$2);
    }

    public ffg a(int $$0) {
        return this.c($$0, $$0, $$0);
    }

    public ffg c(int $$0, int $$1, int $$2) {
        return new ffg(this.h() - $$0, this.i() - $$1, this.j() - $$2, this.k() + $$0, this.l() + $$1, this.m() + $$2);
    }

    public boolean b(jy $$0) {
        return this.d($$0.u(), $$0.v(), $$0.w());
    }

    public boolean d(int $$0, int $$1, int $$2) {
        return $$0 >= this.d && $$0 <= this.g && $$2 >= this.f && $$2 <= this.i && $$1 >= this.e && $$1 <= this.h;
    }

    public jy c() {
        return new jy(this.g - this.d, this.h - this.e, this.i - this.f);
    }

    public int d() {
        return this.g - this.d + 1;
    }

    public int e() {
        return this.h - this.e + 1;
    }

    public int f() {
        return this.i - this.f + 1;
    }

    public is g() {
        return new is(this.d + (this.g - this.d + 1) / 2, this.e + (this.h - this.e + 1) / 2, this.f + (this.i - this.f + 1) / 2);
    }

    public void a(Consumer<is> $$0) {
        is.a $$1 = new is.a();
        $$0.accept($$1.d(this.g, this.h, this.i));
        $$0.accept($$1.d(this.d, this.h, this.i));
        $$0.accept($$1.d(this.g, this.e, this.i));
        $$0.accept($$1.d(this.d, this.e, this.i));
        $$0.accept($$1.d(this.g, this.h, this.f));
        $$0.accept($$1.d(this.d, this.h, this.f));
        $$0.accept($$1.d(this.g, this.e, this.f));
        $$0.accept($$1.d(this.d, this.e, this.f));
    }

    public String toString() {
        return MoreObjects.toStringHelper((Object)this).add("minX", this.d).add("minY", this.e).add("minZ", this.f).add("maxX", this.g).add("maxY", this.h).add("maxZ", this.i).toString();
    }

    public boolean equals(Object $$0) {
        if (this == $$0) {
            return true;
        }
        if ($$0 instanceof ffg) {
            ffg $$1 = (ffg)$$0;
            return this.d == $$1.d && this.e == $$1.e && this.f == $$1.f && this.g == $$1.g && this.h == $$1.h && this.i == $$1.i;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.d, this.e, this.f, this.g, this.h, this.i);
    }

    public int h() {
        return this.d;
    }

    public int i() {
        return this.e;
    }

    public int j() {
        return this.f;
    }

    public int k() {
        return this.g;
    }

    public int l() {
        return this.h;
    }

    public int m() {
        return this.i;
    }
}

