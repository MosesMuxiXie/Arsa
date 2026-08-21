/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.List;

public class avd
implements avc {
    private final ary a;
    private final atw b;

    public avd(ary $$0, atw $$1) {
        this.a = $$0;
        this.b = $$1;
    }

    @Override
    public boolean a() {
        return this.a.al();
    }

    @Override
    public boolean a(boolean $$0, boolean $$1, boolean $$2, avh $$3) {
        this.b.a($$3, "Save everything. SuppressLogs: {}, flush: {}, force: {}", $$0, $$1, $$2);
        return this.a.b($$0, $$1, $$2);
    }

    @Override
    public void a(boolean $$0, avh $$1) {
        this.b.a($$1, "Halt server. WaitForShutdown: {}", $$0);
        this.a.a($$0);
    }

    @Override
    public void a(yh $$0, avh $$1) {
        this.b.a($$1, "Send system message: '{}'", $$0.getString());
        this.a.a($$0);
    }

    @Override
    public void a(yh $$0, boolean $$1, Collection<axg> $$2, avh $$3) {
        List<String> $$4 = $$2.stream().map(ddm::aq).toList();
        this.b.a($$3, "Send system message to '{}' players (overlay: {}): '{}'", $$4.size(), $$1, $$0.getString());
        for (axg $$5 : $$2) {
            if ($$1) {
                $$5.b($$0, true);
                continue;
            }
            $$5.a($$0);
        }
    }

    @Override
    public void a(yh $$0, boolean $$1, avh $$2) {
        this.b.a($$2, "Broadcast system message (overlay: {}): '{}'", $$1, $$0.getString());
        for (axg $$3 : this.a.bA().t()) {
            if ($$1) {
                $$3.b($$0, true);
                continue;
            }
            $$3.a($$0);
        }
    }
}

