/*
 * Decompiled with CFR 0.152.
 */
public interface bbh
extends bbn {
    @Deprecated
    public static final bbh a = bbh.b(bbl.a);
    public static final bbh b = bbh.b(bbl.b);
    public static final bbh c = bbh.b(bbl.c);
    public static final bbh d = bbh.b(bbl.d);
    public static final bbh e = bbh.b(bbl.e);

    public bbl a();

    @Override
    default public boolean hasPermission(bbi $$0) {
        if ($$0 instanceof bbi.b) {
            bbi.b $$1 = (bbi.b)$$0;
            return this.a().a($$1.b());
        }
        if ($$0.equals(bbr.e)) {
            return this.a().a(bbl.c);
        }
        return false;
    }

    @Override
    default public bbn a(bbn $$0) {
        if ($$0 instanceof bbh) {
            bbh $$1 = (bbh)$$0;
            if (this.a().a($$1.a())) {
                return $$1;
            }
            return this;
        }
        return bbn.super.a($$0);
    }

    public static bbh a(bbl $$0) {
        return switch ($$0) {
            default -> throw new MatchException(null, null);
            case bbl.a -> a;
            case bbl.b -> b;
            case bbl.c -> c;
            case bbl.d -> d;
            case bbl.e -> e;
        };
    }

    private static bbh b(final bbl $$0) {
        return new bbh(){

            @Override
            public bbl a() {
                return $$0;
            }

            public String toString() {
                return "permission level: " + $$0.name();
            }
        };
    }
}

