/*
 * Decompiled with CFR 0.152.
 */
public final class gsk
extends Enum<gsk> {
    public static final /* enum */ gsk a = new gsk(amo.b("advancements/box_obtained"), amo.b("advancements/task_frame_obtained"), amo.b("advancements/challenge_frame_obtained"), amo.b("advancements/goal_frame_obtained"));
    public static final /* enum */ gsk b = new gsk(amo.b("advancements/box_unobtained"), amo.b("advancements/task_frame_unobtained"), amo.b("advancements/challenge_frame_unobtained"), amo.b("advancements/goal_frame_unobtained"));
    private final amo c;
    private final amo d;
    private final amo e;
    private final amo f;
    private static final /* synthetic */ gsk[] g;

    public static gsk[] values() {
        return (gsk[])g.clone();
    }

    public static gsk valueOf(String $$0) {
        return Enum.valueOf(gsk.class, $$0);
    }

    private gsk(amo $$0, amo $$1, amo $$2, amo $$3) {
        this.c = $$0;
        this.d = $$1;
        this.e = $$2;
        this.f = $$3;
    }

    public amo a() {
        return this.c;
    }

    public amo a(ai $$0) {
        return switch ($$0) {
            default -> throw new MatchException(null, null);
            case ai.a -> this.d;
            case ai.b -> this.e;
            case ai.c -> this.f;
        };
    }

    private static /* synthetic */ gsk[] b() {
        return new gsk[]{a, b};
    }

    static {
        g = gsk.b();
    }
}

