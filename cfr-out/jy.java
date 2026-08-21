/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.MoreObjects
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  io.netty.buffer.ByteBuf
 *  javax.annotation.concurrent.Immutable
 *  org.joml.Vector3i
 */
import com.google.common.base.MoreObjects;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import io.netty.buffer.ByteBuf;
import java.util.stream.IntStream;
import javax.annotation.concurrent.Immutable;
import org.joml.Vector3i;

@Immutable
public class jy
implements Comparable<jy> {
    public static final Codec<jy> g = Codec.INT_STREAM.comapFlatMap($$02 -> bhs.a($$02, 3).map($$0 -> new jy($$0[0], $$0[1], $$0[2])), $$0 -> IntStream.of($$0.u(), $$0.v(), $$0.w()));
    public static final aao<ByteBuf, jy> h = aao.a(aam.h, jy::u, aam.h, jy::v, aam.h, jy::w, jy::new);
    public static final jy i = new jy(0, 0, 0);
    private int a;
    private int b;
    private int c;

    public static Codec<jy> v(int $$0) {
        return g.validate($$1 -> {
            if (Math.abs($$1.u()) < $$0 && Math.abs($$1.v()) < $$0 && Math.abs($$1.w()) < $$0) {
                return DataResult.success((Object)$$1);
            }
            return DataResult.error(() -> "Position out of range, expected at most " + $$0 + ": " + String.valueOf($$1));
        });
    }

    public jy(int $$0, int $$1, int $$2) {
        this.a = $$0;
        this.b = $$1;
        this.c = $$2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean equals(Object $$0) {
        void $$2;
        if (this == $$0) {
            return true;
        }
        if (!($$0 instanceof jy)) {
            return false;
        }
        jy $$1 = (jy)$$0;
        return this.u() == $$2.u() && this.v() == $$2.v() && this.w() == $$2.w();
    }

    public int hashCode() {
        return (this.v() + this.w() * 31) * 31 + this.u();
    }

    public int i(jy $$0) {
        if (this.v() == $$0.v()) {
            if (this.w() == $$0.w()) {
                return this.u() - $$0.u();
            }
            return this.w() - $$0.w();
        }
        return this.v() - $$0.v();
    }

    public int u() {
        return this.a;
    }

    public int v() {
        return this.b;
    }

    public int w() {
        return this.c;
    }

    protected jy u(int $$0) {
        this.a = $$0;
        return this;
    }

    protected jy t(int $$0) {
        this.b = $$0;
        return this;
    }

    protected jy s(int $$0) {
        this.c = $$0;
        return this;
    }

    public jy c(int $$0, int $$1, int $$2) {
        if ($$0 == 0 && $$1 == 0 && $$2 == 0) {
            return this;
        }
        return new jy(this.u() + $$0, this.v() + $$1, this.w() + $$2);
    }

    public jy f(jy $$0) {
        return this.c($$0.u(), $$0.v(), $$0.w());
    }

    public jy e(jy $$0) {
        return this.c(-$$0.u(), -$$0.v(), -$$0.w());
    }

    public jy o(int $$0) {
        if ($$0 == 1) {
            return this;
        }
        if ($$0 == 0) {
            return i;
        }
        return new jy(this.u() * $$0, this.v() * $$0, this.w() * $$0);
    }

    public jy f(int $$0, int $$1, int $$2) {
        return new jy(this.u() * $$0, this.v() * $$1, this.w() * $$2);
    }

    public jy q() {
        return this.n(1);
    }

    public jy n(int $$0) {
        return this.b(iz.b, $$0);
    }

    public jy p() {
        return this.m(1);
    }

    public jy m(int $$0) {
        return this.b(iz.a, $$0);
    }

    public jy o() {
        return this.l(1);
    }

    public jy l(int $$0) {
        return this.b(iz.c, $$0);
    }

    public jy n() {
        return this.k(1);
    }

    public jy k(int $$0) {
        return this.b(iz.d, $$0);
    }

    public jy m() {
        return this.j(1);
    }

    public jy j(int $$0) {
        return this.b(iz.e, $$0);
    }

    public jy l() {
        return this.i(1);
    }

    public jy i(int $$0) {
        return this.b(iz.f, $$0);
    }

    public jy b(iz $$0) {
        return this.b($$0, 1);
    }

    public jy b(iz $$0, int $$1) {
        if ($$1 == 0) {
            return this;
        }
        return new jy(this.u() + $$0.j() * $$1, this.v() + $$0.k() * $$1, this.w() + $$0.l() * $$1);
    }

    public jy b(iz.a $$0, int $$1) {
        if ($$1 == 0) {
            return this;
        }
        int $$2 = $$0 == iz.a.a ? $$1 : 0;
        int $$3 = $$0 == iz.a.b ? $$1 : 0;
        int $$4 = $$0 == iz.a.c ? $$1 : 0;
        return new jy(this.u() + $$2, this.v() + $$3, this.w() + $$4);
    }

    public jy d(jy $$0) {
        return new jy(this.v() * $$0.w() - this.w() * $$0.v(), this.w() * $$0.u() - this.u() * $$0.w(), this.u() * $$0.v() - this.v() * $$0.u());
    }

    public boolean a(jy $$0, double $$1) {
        return this.j($$0) < bgj.n($$1);
    }

    public boolean a(jn $$0, double $$1) {
        return this.b($$0) < bgj.n($$1);
    }

    public double j(jy $$0) {
        return this.d($$0.u(), $$0.v(), $$0.w());
    }

    public double b(jn $$0) {
        return this.c($$0.a(), $$0.b(), $$0.c());
    }

    public double c(double $$0, double $$1, double $$2) {
        double $$3 = (double)this.u() + 0.5 - $$0;
        double $$4 = (double)this.v() + 0.5 - $$1;
        double $$5 = (double)this.w() + 0.5 - $$2;
        return $$3 * $$3 + $$4 * $$4 + $$5 * $$5;
    }

    public double d(double $$0, double $$1, double $$2) {
        double $$3 = (double)this.u() - $$0;
        double $$4 = (double)this.v() - $$1;
        double $$5 = (double)this.w() - $$2;
        return $$3 * $$3 + $$4 * $$4 + $$5 * $$5;
    }

    public int k(jy $$0) {
        float $$1 = Math.abs($$0.u() - this.u());
        float $$2 = Math.abs($$0.v() - this.v());
        float $$3 = Math.abs($$0.w() - this.w());
        return (int)($$1 + $$2 + $$3);
    }

    public int l(jy $$0) {
        int $$1 = Math.abs(this.u() - $$0.u());
        int $$2 = Math.abs(this.v() - $$0.v());
        int $$3 = Math.abs(this.w() - $$0.w());
        return Math.max(Math.max($$1, $$2), $$3);
    }

    public int a(iz.a $$0) {
        return $$0.a(this.a, this.b, this.c);
    }

    public Vector3i x() {
        return new Vector3i(this.a, this.b, this.c);
    }

    public String toString() {
        return MoreObjects.toStringHelper((Object)this).add("x", this.u()).add("y", this.v()).add("z", this.w()).toString();
    }

    public String y() {
        return this.u() + ", " + this.v() + ", " + this.w();
    }

    @Override
    public /* synthetic */ int compareTo(Object object) {
        return this.i((jy)object);
    }
}

