/*
 * Decompiled with CFR 0.152.
 */
public interface fvo {
    public static final amt<fvn> a = fvo.a("day");
    public static final amt<fvn> b = fvo.a("moon");
    public static final amt<fvn> c = fvo.a("villager_schedule");
    public static final amt<fvn> d = fvo.a("early_game");
    public static final float e = 15.0f;
    public static final float f = 4.0f;
    public static final int g = bel.a(1.0f, 0.48f, 0.48f, 1.0f);
    public static final float h = 0.24f;
    public static final int i = -16777216;
    public static final int j = bel.a(1.0f, 0.06f, 0.06f, 0.09f);
    public static final int k = bel.a(1.0f, 0.1f, 0.1f, 0.15f);

    public static void a(qr<fvn> $$02) {
        bfj $$12 = bfj.a(0.362f, 0.241f);
        int $$2 = 12600;
        int $$3 = 23401;
        int $$4 = 6000;
        $$02.a(a, fvn.a().a(24000).a(ceg.m, $$1 -> $$1.a($$12).a(6000, Float.valueOf(360.0f)).a(6000, Float.valueOf(0.0f))).a(ceg.n, $$1 -> $$1.a($$12).a(6000, Float.valueOf(540.0f)).a(6000, Float.valueOf(180.0f))).a(ceg.o, $$1 -> $$1.a($$12).a(6000, Float.valueOf(360.0f)).a(6000, Float.valueOf(0.0f))).a(ceg.y, cem.g, $$0 -> $$0.a(12600, true).a(23401, false)).a(ceg.a, cen.h, $$0 -> $$0.a(133, -1).a(11867, -1).a(13670, j).a(22330, j)).a(ceg.i, cen.h, $$0 -> $$0.a(133, -1).a(11867, -1).a(13670, -16777216).a(22330, -16777216)).a(ceg.r, cen.h, $$0 -> $$0.a(730, -1).a(11270, -1).a(13140, g).a(22860, g)).a(ceg.s, ceo.h, $$0 -> $$0.a(730, Float.valueOf(1.0f)).a(11270, Float.valueOf(1.0f)).a(13140, Float.valueOf(0.24f)).a(22860, Float.valueOf(0.24f))).a(ceg.z, ceo.h, $$0 -> $$0.a(133, Float.valueOf(1.0f)).a(11867, Float.valueOf(1.0f)).a(13670, Float.valueOf(0.26666668f)).a(22330, Float.valueOf(0.26666668f))).a(ceg.j, $$0 -> $$0.a(71, 1609540403).a(310, 703969843).a(565, 117167155).a(730, 16770355).a(11270, 16770355).a(11397, 83679283).a(11522, 268028723).a(11690, 703969843).a(11929, 1609540403).a(12243, -1310226637).a(12358, -857440717).a(12512, -371166669).a(12613, -153261261).a(12732, -19242189).a(12841, -19440589).a(13035, -321760973).a(13252, -1043577037).a(13775, 918435635).a(13888, 532362547).a(14039, 163001139).a(14192, 0xB33333).a(21807, 0xB23333).a(21961, 163001139).a(22112, 532362547).a(22225, 918435635).a(22748, -1043577037).a(22965, -321760973).a(23159, -19440589).a(23272, -19242189).a(23488, -371166669).a(23642, -857440717).a(23757, -1310226637)).a(ceg.q, ceo.j, $$0 -> $$0.a(92, Float.valueOf(0.037f)).a(627, Float.valueOf(0.0f)).a(11373, Float.valueOf(0.0f)).a(11732, Float.valueOf(0.016f)).a(11959, Float.valueOf(0.044f)).a(12399, Float.valueOf(0.143f)).a(12729, Float.valueOf(0.258f)).a(13228, Float.valueOf(0.5f)).a(22772, Float.valueOf(0.5f)).a(23032, Float.valueOf(0.364f)).a(23356, Float.valueOf(0.225f)).a(23758, Float.valueOf(0.101f))).a(ceg.k, cen.i, $$0 -> $$0.a(133, -1).a(11867, -1).a(13670, k).a(22330, k)).a(ceg.H, $$0 -> $$0.a(12600, bhp.a).a(23401, bhp.b)).a(ceg.L, cem.g, $$0 -> $$0.a(12600, true).a(23401, false)).a(ceg.I, ceo.j, $$0 -> $$0.a(bfj.c).a(21062, Float.valueOf(1.0f)).a(21905, Float.valueOf(0.002f))).a(ceg.N, ceo.j, $$0 -> $$0.a(bfj.c).a(362, Float.valueOf(0.0f)).a(23667, Float.valueOf(0.7f))).a(ceg.O, cem.g, $$0 -> $$0.a(12542, true).a(23460, false)).a(ceg.P, cem.g, $$0 -> $$0.a(12542, false).a(23460, true)).a());
        fvn.a $$5 = fvn.a().a(24000 * dwy.j).a(ceg.p, $$0 -> {
            for (dwy $$1 : dwy.values()) {
                $$0.a($$1.b(), $$1);
            }
        }).a(ceg.M, ceo.j, $$0 -> {
            $$0.a(bfj.c);
            for (dwy $$1 : dwy.values()) {
                $$0.a($$1.b(), Float.valueOf(esh.k[$$1.a()] * 0.5f));
            }
        });
        $$02.a(b, $$5.a());
        int $$6 = 2000;
        int $$7 = 7000;
        $$02.a(c, fvn.a().a(24000).a(ceg.R, $$0 -> $$0.a(10, dfl.b).a(2000, dfl.c).a(9000, dfl.f).a(11000, dfl.b).a(12000, dfl.e)).a(ceg.S, $$0 -> $$0.a(10, dfl.b).a(3000, dfl.d).a(6000, dfl.b).a(10000, dfl.d).a(12000, dfl.e)).a());
        $$02.a(d, fvn.a().a(ceg.Q, cem.e, $$0 -> $$0.a(0, false).a(120000, true)).a());
    }

    private static amt<fvn> a(String $$0) {
        return amt.a(mj.bw, amo.b($$0));
    }
}

