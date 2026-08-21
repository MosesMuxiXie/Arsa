/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Optional;

public class asn {
    public static final amt<asj> a = asn.a("server_links");
    public static final amt<asj> b = asn.a("custom_options");
    public static final amt<asj> c = asn.a("quick_actions");
    public static final int d = 310;
    private static final ase e = new ase(new asg(yg.k, 200), Optional.empty());

    private static amt<asj> a(String $$0) {
        return amt.a(mj.bc, amo.b($$0));
    }

    public static void a(qr<asj> $$0) {
        je<asj> $$1 = $$0.a(mj.bc);
        $$0.a(a, new asr(new ash(yh.c("menu.server_links.title"), Optional.of(yh.c("menu.server_links")), true, true, ask.a, List.of(), List.of()), Optional.of(e), 1, 310));
        $$0.a(b, new asl(new ash(yh.c("menu.custom_options.title"), Optional.of(yh.c("menu.custom_options")), true, true, ask.a, List.of(), List.of()), $$1.b(bdr.a), Optional.of(e), 1, 310));
        $$0.a(c, new asl(new ash(yh.c("menu.quick_actions.title"), Optional.of(yh.c("menu.quick_actions")), true, true, ask.a, List.of(), List.of()), $$1.b(bdr.b), Optional.of(e), 1, 310));
    }
}

