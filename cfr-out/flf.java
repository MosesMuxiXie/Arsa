/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Preconditions
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.base.Preconditions;
import org.jspecify.annotations.Nullable;

public class flf {
    private static final @Nullable flf[] am = new flf[64];
    public static final flf a = new flf(0, 0);
    public static final flf b = new flf(1, 8368696);
    public static final flf c = new flf(2, 16247203);
    public static final flf d = new flf(3, 0xC7C7C7);
    public static final flf e = new flf(4, 0xFF0000);
    public static final flf f = new flf(5, 0xA0A0FF);
    public static final flf g = new flf(6, 0xA7A7A7);
    public static final flf h = new flf(7, 31744);
    public static final flf i = new flf(8, 0xFFFFFF);
    public static final flf j = new flf(9, 10791096);
    public static final flf k = new flf(10, 9923917);
    public static final flf l = new flf(11, 0x707070);
    public static final flf m = new flf(12, 0x4040FF);
    public static final flf n = new flf(13, 9402184);
    public static final flf o = new flf(14, 0xFFFCF5);
    public static final flf p = new flf(15, 14188339);
    public static final flf q = new flf(16, 11685080);
    public static final flf r = new flf(17, 6724056);
    public static final flf s = new flf(18, 0xE5E533);
    public static final flf t = new flf(19, 8375321);
    public static final flf u = new flf(20, 15892389);
    public static final flf v = new flf(21, 0x4C4C4C);
    public static final flf w = new flf(22, 0x999999);
    public static final flf x = new flf(23, 5013401);
    public static final flf y = new flf(24, 8339378);
    public static final flf z = new flf(25, 3361970);
    public static final flf A = new flf(26, 6704179);
    public static final flf B = new flf(27, 6717235);
    public static final flf C = new flf(28, 0x993333);
    public static final flf D = new flf(29, 0x191919);
    public static final flf E = new flf(30, 16445005);
    public static final flf F = new flf(31, 6085589);
    public static final flf G = new flf(32, 4882687);
    public static final flf H = new flf(33, 55610);
    public static final flf I = new flf(34, 8476209);
    public static final flf J = new flf(35, 0x700200);
    public static final flf K = new flf(36, 13742497);
    public static final flf L = new flf(37, 10441252);
    public static final flf M = new flf(38, 9787244);
    public static final flf N = new flf(39, 7367818);
    public static final flf O = new flf(40, 12223780);
    public static final flf P = new flf(41, 6780213);
    public static final flf Q = new flf(42, 10505550);
    public static final flf R = new flf(43, 0x392923);
    public static final flf S = new flf(44, 8874850);
    public static final flf T = new flf(45, 0x575C5C);
    public static final flf U = new flf(46, 8014168);
    public static final flf V = new flf(47, 4996700);
    public static final flf W = new flf(48, 4993571);
    public static final flf X = new flf(49, 5001770);
    public static final flf Y = new flf(50, 9321518);
    public static final flf Z = new flf(51, 2430480);
    public static final flf aa = new flf(52, 12398641);
    public static final flf ab = new flf(53, 9715553);
    public static final flf ac = new flf(54, 6035741);
    public static final flf ad = new flf(55, 1474182);
    public static final flf ae = new flf(56, 3837580);
    public static final flf af = new flf(57, 5647422);
    public static final flf ag = new flf(58, 1356933);
    public static final flf ah = new flf(59, 0x646464);
    public static final flf ai = new flf(60, 14200723);
    public static final flf aj = new flf(61, 8365974);
    public final int ak;
    public final int al;

    private flf(int $$0, int $$1) {
        if ($$0 < 0 || $$0 > 63) {
            throw new IndexOutOfBoundsException("Map colour ID must be between 0 and 63 (inclusive)");
        }
        this.al = $$0;
        this.ak = $$1;
        flf.am[$$0] = this;
    }

    public int a(a $$0) {
        if (this == a) {
            return 0;
        }
        return bel.d(bel.g(this.ak), $$0.f);
    }

    public static flf a(int $$0) {
        Preconditions.checkPositionIndex((int)$$0, (int)am.length, (String)"material id");
        return flf.c($$0);
    }

    private static flf c(int $$0) {
        flf $$1 = am[$$0];
        return $$1 != null ? $$1 : a;
    }

    public static int b(int $$0) {
        int $$1 = $$0 & 0xFF;
        return flf.c($$1 >> 2).a(flf$a.b($$1 & 3));
    }

    public byte b(a $$0) {
        return (byte)(this.al << 2 | $$0.e & 3);
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a(0, 180);
        public static final /* enum */ a b = new a(1, 220);
        public static final /* enum */ a c = new a(2, 255);
        public static final /* enum */ a d = new a(3, 135);
        private static final a[] g;
        public final int e;
        public final int f;
        private static final /* synthetic */ a[] h;

        public static a[] values() {
            return (a[])h.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(int $$0, int $$1) {
            this.e = $$0;
            this.f = $$1;
        }

        public static a a(int $$0) {
            Preconditions.checkPositionIndex((int)$$0, (int)g.length, (String)"brightness id");
            return flf$a.b($$0);
        }

        static a b(int $$0) {
            return g[$$0];
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c, d};
        }

        static {
            h = flf$a.a();
            g = new a[]{a, b, c, d};
        }
    }
}

