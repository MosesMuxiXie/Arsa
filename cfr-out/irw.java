/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Function;

public final class irw
extends Enum<irw> {
    public static final /* enum */ irw a = new irw("movement", irr::new);
    public static final /* enum */ irw b = new irw("find_tree", irq::new);
    public static final /* enum */ irw c = new irw("punch_tree", irt::new);
    public static final /* enum */ irw d = new irw("open_inventory", irs::new);
    public static final /* enum */ irw e = new irw("craft_planks", irp::new);
    public static final /* enum */ irw f = new irw("none", iro::new);
    private final String g;
    private final Function<iru, ? extends irv> h;
    private static final /* synthetic */ irw[] i;

    public static irw[] values() {
        return (irw[])i.clone();
    }

    public static irw valueOf(String $$0) {
        return Enum.valueOf(irw.class, $$0);
    }

    private <T extends irv> irw(String $$0, Function<iru, T> $$1) {
        this.g = $$0;
        this.h = $$1;
    }

    public irv a(iru $$0) {
        return this.h.apply($$0);
    }

    public String a() {
        return this.g;
    }

    public static irw a(String $$0) {
        for (irw $$1 : irw.values()) {
            if (!$$1.g.equals($$0)) continue;
            return $$1;
        }
        return f;
    }

    private static /* synthetic */ irw[] b() {
        return new irw[]{a, b, c, d, e, f};
    }

    static {
        i = irw.b();
    }
}

