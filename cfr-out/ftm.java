/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  io.netty.buffer.ByteBuf
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 */
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.EnumSet;
import java.util.List;
import org.joml.Vector3f;
import org.joml.Vector3fc;

public class ftm
implements jn {
    public static final Codec<ftm> a = Codec.DOUBLE.listOf().comapFlatMap($$02 -> bhs.a($$02, 3).map($$0 -> new ftm((Double)$$0.get(0), (Double)$$0.get(1), (Double)$$0.get(2))), $$0 -> List.of(Double.valueOf($$0.a()), Double.valueOf($$0.b()), Double.valueOf($$0.c())));
    public static final aao<ByteBuf, ftm> b = new aao<ByteBuf, ftm>(){

        public ftm a(ByteBuf $$0) {
            return wx.g($$0);
        }

        public void a(ByteBuf $$0, ftm $$1) {
            wx.a($$0, $$1);
        }

        @Override
        public /* synthetic */ void encode(Object object, Object object2) {
            this.a((ByteBuf)object, (ftm)object2);
        }

        @Override
        public /* synthetic */ Object decode(Object object) {
            return this.a((ByteBuf)object);
        }
    };
    public static final ftm c = new ftm(0.0, 0.0, 0.0);
    public static final ftm d = new ftm(1.0, 0.0, 0.0);
    public static final ftm e = new ftm(0.0, 1.0, 0.0);
    public static final ftm f = new ftm(0.0, 0.0, 1.0);
    public final double g;
    public final double h;
    public final double i;

    public static ftm a(jy $$0) {
        return new ftm($$0.u(), $$0.v(), $$0.w());
    }

    public static ftm a(jy $$0, double $$1, double $$2, double $$3) {
        return new ftm((double)$$0.u() + $$1, (double)$$0.v() + $$2, (double)$$0.w() + $$3);
    }

    public static ftm b(jy $$0) {
        return ftm.a($$0, 0.5, 0.5, 0.5);
    }

    public static ftm c(jy $$0) {
        return ftm.a($$0, 0.5, 0.0, 0.5);
    }

    public static ftm a(jy $$0, double $$1) {
        return ftm.a($$0, 0.5, $$1, 0.5);
    }

    public ftm(double $$0, double $$1, double $$2) {
        this.g = $$0;
        this.h = $$1;
        this.i = $$2;
    }

    public ftm(Vector3fc $$0) {
        this($$0.x(), $$0.y(), $$0.z());
    }

    public ftm(jy $$0) {
        this($$0.u(), $$0.v(), $$0.w());
    }

    public ftm a(ftm $$0) {
        return new ftm($$0.g - this.g, $$0.h - this.h, $$0.i - this.i);
    }

    public ftm d() {
        double $$0 = Math.sqrt(this.g * this.g + this.h * this.h + this.i * this.i);
        if ($$0 < (double)1.0E-5f) {
            return c;
        }
        return new ftm(this.g / $$0, this.h / $$0, this.i / $$0);
    }

    public double b(ftm $$0) {
        return this.g * $$0.g + this.h * $$0.h + this.i * $$0.i;
    }

    public ftm c(ftm $$0) {
        return new ftm(this.h * $$0.i - this.i * $$0.h, this.i * $$0.g - this.g * $$0.i, this.g * $$0.h - this.h * $$0.g);
    }

    public ftm d(ftm $$0) {
        return this.a($$0.g, $$0.h, $$0.i);
    }

    public ftm a(double $$0) {
        return this.a($$0, $$0, $$0);
    }

    public ftm a(double $$0, double $$1, double $$2) {
        return this.b(-$$0, -$$1, -$$2);
    }

    public ftm b(double $$0) {
        return this.b($$0, $$0, $$0);
    }

    public ftm e(ftm $$0) {
        return this.b($$0.g, $$0.h, $$0.i);
    }

    public ftm b(double $$0, double $$1, double $$2) {
        return new ftm(this.g + $$0, this.h + $$1, this.i + $$2);
    }

    public boolean a(jn $$0, double $$1) {
        return this.c($$0.a(), $$0.b(), $$0.c()) < $$1 * $$1;
    }

    public double f(ftm $$0) {
        double $$1 = $$0.g - this.g;
        double $$2 = $$0.h - this.h;
        double $$3 = $$0.i - this.i;
        return Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
    }

    public double g(ftm $$0) {
        double $$1 = $$0.g - this.g;
        double $$2 = $$0.h - this.h;
        double $$3 = $$0.i - this.i;
        return $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
    }

    public double c(double $$0, double $$1, double $$2) {
        double $$3 = $$0 - this.g;
        double $$4 = $$1 - this.h;
        double $$5 = $$2 - this.i;
        return $$3 * $$3 + $$4 * $$4 + $$5 * $$5;
    }

    public boolean a(ftm $$0, double $$1, double $$2) {
        double $$3 = $$0.a() - this.g;
        double $$4 = $$0.b() - this.h;
        double $$5 = $$0.c() - this.i;
        return bgj.e($$3, $$5) < bgj.n($$1) && Math.abs($$4) < $$2;
    }

    public ftm c(double $$0) {
        return this.d($$0, $$0, $$0);
    }

    public ftm e() {
        return this.c(-1.0);
    }

    public ftm h(ftm $$0) {
        return this.d($$0.g, $$0.h, $$0.i);
    }

    public ftm d(double $$0, double $$1, double $$2) {
        return new ftm(this.g * $$0, this.h * $$1, this.i * $$2);
    }

    public ftm f() {
        return new ftm(this.g, 0.0, this.i);
    }

    public ftm a(bgr $$0, float $$1) {
        return this.b(($$0.i() - 0.5f) * $$1, ($$0.i() - 0.5f) * $$1, ($$0.i() - 0.5f) * $$1);
    }

    public ftm b(bgr $$0, float $$1) {
        return this.b(($$0.i() - 0.5f) * $$1, 0.0, ($$0.i() - 0.5f) * $$1);
    }

    public double g() {
        return Math.sqrt(this.g * this.g + this.h * this.h + this.i * this.i);
    }

    public double h() {
        return this.g * this.g + this.h * this.h + this.i * this.i;
    }

    public double i() {
        return Math.sqrt(this.g * this.g + this.i * this.i);
    }

    public double j() {
        return this.g * this.g + this.i * this.i;
    }

    public boolean equals(Object $$0) {
        if (this == $$0) {
            return true;
        }
        if (!($$0 instanceof ftm)) {
            return false;
        }
        ftm $$1 = (ftm)$$0;
        if (Double.compare($$1.g, this.g) != 0) {
            return false;
        }
        if (Double.compare($$1.h, this.h) != 0) {
            return false;
        }
        return Double.compare($$1.i, this.i) == 0;
    }

    public int hashCode() {
        long $$0 = Double.doubleToLongBits(this.g);
        int $$1 = (int)($$0 ^ $$0 >>> 32);
        $$0 = Double.doubleToLongBits(this.h);
        $$1 = 31 * $$1 + (int)($$0 ^ $$0 >>> 32);
        $$0 = Double.doubleToLongBits(this.i);
        $$1 = 31 * $$1 + (int)($$0 ^ $$0 >>> 32);
        return $$1;
    }

    public String toString() {
        return "(" + this.g + ", " + this.h + ", " + this.i + ")";
    }

    public ftm a(ftm $$0, double $$1) {
        return new ftm(bgj.d($$1, this.g, $$0.g), bgj.d($$1, this.h, $$0.h), bgj.d($$1, this.i, $$0.i));
    }

    public ftm a(float $$0) {
        float $$1 = bgj.b((double)$$0);
        float $$2 = bgj.a((double)$$0);
        double $$3 = this.g;
        double $$4 = this.h * (double)$$1 + this.i * (double)$$2;
        double $$5 = this.i * (double)$$1 - this.h * (double)$$2;
        return new ftm($$3, $$4, $$5);
    }

    public ftm b(float $$0) {
        float $$1 = bgj.b((double)$$0);
        float $$2 = bgj.a((double)$$0);
        double $$3 = this.g * (double)$$1 + this.i * (double)$$2;
        double $$4 = this.h;
        double $$5 = this.i * (double)$$1 - this.g * (double)$$2;
        return new ftm($$3, $$4, $$5);
    }

    public ftm c(float $$0) {
        float $$1 = bgj.b((double)$$0);
        float $$2 = bgj.a((double)$$0);
        double $$3 = this.g * (double)$$1 + this.h * (double)$$2;
        double $$4 = this.h * (double)$$1 - this.g * (double)$$2;
        double $$5 = this.i;
        return new ftm($$3, $$4, $$5);
    }

    public ftm k() {
        return new ftm(-this.i, this.h, this.g);
    }

    public static ftm a(ftl $$0) {
        return ftm.a($$0.j, $$0.k);
    }

    public static ftm a(float $$0, float $$1) {
        float $$2 = bgj.b((double)(-$$1 * ((float)Math.PI / 180) - (float)Math.PI));
        float $$3 = bgj.a((double)(-$$1 * ((float)Math.PI / 180) - (float)Math.PI));
        float $$4 = -bgj.b((double)(-$$0 * ((float)Math.PI / 180)));
        float $$5 = bgj.a((double)(-$$0 * ((float)Math.PI / 180)));
        return new ftm($$3 * $$4, $$5, $$2 * $$4);
    }

    public ftl l() {
        float $$0 = (float)Math.atan2(-this.g, this.i) * 57.295776f;
        float $$1 = (float)Math.asin(-this.h / Math.sqrt(this.g * this.g + this.h * this.h + this.i * this.i)) * 57.295776f;
        return new ftl($$1, $$0);
    }

    public ftm a(EnumSet<iz.a> $$0) {
        double $$1 = $$0.contains(iz.a.a) ? (double)bgj.c(this.g) : this.g;
        double $$2 = $$0.contains(iz.a.b) ? (double)bgj.c(this.h) : this.h;
        double $$3 = $$0.contains(iz.a.c) ? (double)bgj.c(this.i) : this.i;
        return new ftm($$1, $$2, $$3);
    }

    public double a(iz.a $$0) {
        return $$0.a(this.g, this.h, this.i);
    }

    public ftm a(iz.a $$0, double $$1) {
        double $$2 = $$0 == iz.a.a ? $$1 : this.g;
        double $$3 = $$0 == iz.a.b ? $$1 : this.h;
        double $$4 = $$0 == iz.a.c ? $$1 : this.i;
        return new ftm($$2, $$3, $$4);
    }

    public ftm a(iz $$0, double $$1) {
        jy $$2 = $$0.q();
        return new ftm(this.g + $$1 * (double)$$2.u(), this.h + $$1 * (double)$$2.v(), this.i + $$1 * (double)$$2.w());
    }

    @Override
    public final double a() {
        return this.g;
    }

    @Override
    public final double b() {
        return this.h;
    }

    @Override
    public final double c() {
        return this.i;
    }

    public Vector3f m() {
        return new Vector3f((float)this.g, (float)this.h, (float)this.i);
    }

    public ftm i(ftm $$0) {
        if ($$0.h() == 0.0) {
            return $$0;
        }
        return $$0.c(this.b($$0)).c(1.0 / $$0.h());
    }

    public static ftm a(ftl $$0, ftm $$1) {
        float $$2 = bgj.b((double)(($$0.k + 90.0f) * ((float)Math.PI / 180)));
        float $$3 = bgj.a((double)(($$0.k + 90.0f) * ((float)Math.PI / 180)));
        float $$4 = bgj.b((double)(-$$0.j * ((float)Math.PI / 180)));
        float $$5 = bgj.a((double)(-$$0.j * ((float)Math.PI / 180)));
        float $$6 = bgj.b((double)((-$$0.j + 90.0f) * ((float)Math.PI / 180)));
        float $$7 = bgj.a((double)((-$$0.j + 90.0f) * ((float)Math.PI / 180)));
        ftm $$8 = new ftm($$2 * $$4, $$5, $$3 * $$4);
        ftm $$9 = new ftm($$2 * $$6, $$7, $$3 * $$6);
        ftm $$10 = $$8.c($$9).c(-1.0);
        double $$11 = $$8.g * $$1.i + $$9.g * $$1.h + $$10.g * $$1.g;
        double $$12 = $$8.h * $$1.i + $$9.h * $$1.h + $$10.h * $$1.g;
        double $$13 = $$8.i * $$1.i + $$9.i * $$1.h + $$10.i * $$1.g;
        return new ftm($$11, $$12, $$13);
    }

    public ftm j(ftm $$0) {
        return ftm.a(this.l(), $$0);
    }

    public boolean n() {
        return Double.isFinite(this.g) && Double.isFinite(this.h) && Double.isFinite(this.i);
    }
}

