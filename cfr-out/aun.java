/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;

public class aun
implements aum {
    private final ary a;
    private final atw b;

    public aun(ary $$0, atw $$1) {
        this.a = $$0;
        this.b = $$1;
    }

    @Override
    public Collection<bck> a() {
        return this.a.bA().i().e();
    }

    @Override
    public boolean a(bck $$0, avh $$1) {
        this.b.a($$1, "Add player '{}' to allowlist", $$0.h());
        return this.a.bA().i().a($$0);
    }

    @Override
    public void a(avh $$0) {
        this.b.a($$0, "Clear allowlist", new Object[0]);
        this.a.bA().i().a();
    }

    @Override
    public void a(bbx $$0, avh $$1) {
        this.b.a($$1, "Remove player '{}' from allowlist", $$0);
        this.a.bA().i().b($$0);
    }

    @Override
    public void b(avh $$0) {
        this.b.a($$0, "Kick unlisted players", new Object[0]);
        this.a.aD();
    }
}

