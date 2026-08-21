/*
 * Decompiled with CFR 0.152.
 */
import java.util.Locale;

public interface fgf {
    public static final fgf a = fgf.a(fhs.a::new, "MSCorridor");
    public static final fgf b = fgf.a(fhs.b::new, "MSCrossing");
    public static final fgf c = fgf.a(fhs.d::new, "MSRoom");
    public static final fgf d = fgf.a(fhs.e::new, "MSStairs");
    public static final fgf e = fgf.a(fhu.a::new, "NeBCr");
    public static final fgf f = fgf.a(fhu.b::new, "NeBEF");
    public static final fgf g = fgf.a(fhu.c::new, "NeBS");
    public static final fgf h = fgf.a(fhu.d::new, "NeCCS");
    public static final fgf i = fgf.a(fhu.e::new, "NeCTB");
    public static final fgf j = fgf.a(fhu.f::new, "NeCE");
    public static final fgf k = fgf.a(fhu.g::new, "NeSCSC");
    public static final fgf l = fgf.a(fhu.h::new, "NeSCLT");
    public static final fgf m = fgf.a(fhu.i::new, "NeSC");
    public static final fgf n = fgf.a(fhu.j::new, "NeSCRT");
    public static final fgf o = fgf.a(fhu.k::new, "NeCSR");
    public static final fgf p = fgf.a(fhu.l::new, "NeMT");
    public static final fgf q = fgf.a(fhu.o::new, "NeRC");
    public static final fgf r = fgf.a(fhu.p::new, "NeSR");
    public static final fgf s = fgf.a(fhu.q::new, "NeStart");
    public static final fgf t = fgf.a(fig.a::new, "SHCC");
    public static final fgf u = fgf.a(fig.b::new, "SHFC");
    public static final fgf v = fgf.a(fig.c::new, "SH5C");
    public static final fgf w = fgf.a(fig.d::new, "SHLT");
    public static final fgf x = fgf.a(fig.e::new, "SHLi");
    public static final fgf y = fgf.a(fig.g::new, "SHPR");
    public static final fgf z = fgf.a(fig.h::new, "SHPH");
    public static final fgf A = fgf.a(fig.i::new, "SHRT");
    public static final fgf B = fgf.a(fig.j::new, "SHRC");
    public static final fgf C = fgf.a(fig.l::new, "SHSD");
    public static final fgf D = fgf.a(fig.m::new, "SHStart");
    public static final fgf E = fgf.a(fig.n::new, "SHS");
    public static final fgf F = fgf.a(fig.o::new, "SHSSD");
    public static final fgf G = fgf.a(fhq::new, "TeJP");
    public static final fgf H = fgf.a(fia.a::a, "ORP");
    public static final fgf I = fgf.a(fhn.a::new, "Iglu");
    public static final fgf J = fgf.a(fic::new, "RUPO");
    public static final fgf K = fgf.a(fii::new, "TeSH");
    public static final fgf L = fgf.a(fhj::new, "TeDP");
    public static final fgf M = fgf.a(fhy.h::new, "OMB");
    public static final fgf N = fgf.a(fhy.j::new, "OMCR");
    public static final fgf O = fgf.a(fhy.k::new, "OMDXR");
    public static final fgf P = fgf.a(fhy.l::new, "OMDXYR");
    public static final fgf Q = fgf.a(fhy.m::new, "OMDYR");
    public static final fgf R = fgf.a(fhy.n::new, "OMDYZR");
    public static final fgf S = fgf.a(fhy.o::new, "OMDZR");
    public static final fgf T = fgf.a(fhy.p::new, "OMEntry");
    public static final fgf U = fgf.a(fhy.q::new, "OMPenthouse");
    public static final fgf V = fgf.a(fhy.s::new, "OMSimple");
    public static final fgf W = fgf.a(fhy.t::new, "OMSimpleT");
    public static final fgf X = fgf.a(fhy.u::new, "OMWR");
    public static final fgf Y = fgf.a(fhl.a::new, "ECP");
    public static final fgf Z = fgf.a(fik.i::new, "WMP");
    public static final fgf aa = fgf.a(fhh.a::new, "BTP");
    public static final fgf ab = fgf.a(fie.a::new, "Shipwreck");
    public static final fgf ac = fgf.a(fhw.a::new, "NeFos");
    public static final fgf ad = fgf.a(ffk::new, "jigsaw");

    public ffs load(fge var1, uz var2);

    private static fgf a(fgf $$0, String $$1) {
        return jq.a(mi.Q, $$1.toLowerCase(Locale.ROOT), $$0);
    }

    private static fgf a(a $$0, String $$1) {
        return fgf.a((fgf)$$0, $$1);
    }

    private static fgf a(b $$0, String $$1) {
        return fgf.a((fgf)$$0, $$1);
    }

    public static interface a
    extends fgf {
        public ffs load(uz var1);

        @Override
        default public ffs load(fge $$0, uz $$1) {
            return this.load($$1);
        }
    }

    public static interface b
    extends fgf {
        public ffs load(fjr var1, uz var2);

        @Override
        default public ffs load(fge $$0, uz $$1) {
            return this.load($$0.c(), $$1);
        }
    }
}

