/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.Collection;

public class yg {
    public static final yh a = yh.i();
    public static final yh b = yh.c("options.on");
    public static final yh c = yh.c("options.off");
    public static final yh d = yh.c("gui.done");
    public static final yh e = yh.c("gui.cancel");
    public static final yh f = yh.c("gui.yes");
    public static final yh g = yh.c("gui.no");
    public static final yh h = yh.c("gui.ok");
    public static final yh i = yh.c("gui.proceed");
    public static final yh j = yh.c("gui.continue");
    public static final yh k = yh.c("gui.back");
    public static final yh l = yh.c("gui.toTitle");
    public static final yh m = yh.c("gui.acknowledge");
    public static final yh n = yh.c("chat.link.open");
    public static final yh o = yh.c("chat.copy");
    public static final yh p = yh.c("gui.copy_link_to_clipboard");
    public static final yh q = yh.c("menu.disconnect");
    public static final yh r = yh.c("menu.returnToMenu");
    public static final yh s = yh.c("connect.failed.transfer");
    public static final yh t = yh.c("connect.failed");
    public static final yh u = yh.b("\n");
    public static final yh v = yh.b(". ");
    public static final yh w = yh.b("...");
    public static final yh x = yg.a();

    public static yw a() {
        return yh.b(" ");
    }

    public static yw a(long $$0) {
        return yh.a("gui.days", $$0);
    }

    public static yw b(long $$0) {
        return yh.a("gui.hours", $$0);
    }

    public static yw c(long $$0) {
        return yh.a("gui.minutes", $$0);
    }

    public static yh a(boolean $$0) {
        return $$0 ? b : c;
    }

    public static yh b(boolean $$0) {
        return $$0 ? r : q;
    }

    public static yw a(yh $$0, boolean $$1) {
        return yh.a($$1 ? "options.on.composed" : "options.off.composed", $$0);
    }

    public static yw a(yh $$0, yh $$1) {
        return yh.a("options.generic_value", $$0, $$1);
    }

    public static yw a(yh ... $$0) {
        yw $$1 = yh.i();
        for (int $$2 = 0; $$2 < $$0.length; ++$$2) {
            $$1.b($$0[$$2]);
            if ($$2 == $$0.length - 1) continue;
            $$1.b(v);
        }
        return $$1;
    }

    public static yh b(yh ... $$0) {
        return yg.a(Arrays.asList($$0));
    }

    public static yh a(Collection<? extends yh> $$0) {
        return yk.a($$0, u);
    }
}

