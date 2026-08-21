/*
 * Decompiled with CFR 0.152.
 */
import net.minecraft.server.MinecraftServer;

public class ayj
implements akm {
    private static final yh b = yh.c("disconnect.ignoring_status_request");
    private final MinecraftServer c;
    private final wu d;

    public ayj(MinecraftServer $$0, wu $$1) {
        this.c = $$0;
        this.d = $$1;
    }

    @Override
    public void a(akj $$0) {
        switch ($$0.g()) {
            case b: {
                this.a($$0, false);
                break;
            }
            case a: {
                alq $$1 = this.c.as();
                this.d.a(alu.d);
                if (this.c.an() && $$1 != null) {
                    this.d.a(alu.b, new aym($$1, this.d));
                    break;
                }
                this.d.a(b);
                break;
            }
            case c: {
                if (!this.c.bq()) {
                    this.d.a(akv.d);
                    yw $$2 = yh.c("multiplayer.disconnect.transfers_disabled");
                    this.d.a(new aks($$2));
                    this.d.a($$2);
                    break;
                }
                this.a($$0, true);
                break;
            }
            default: {
                throw new UnsupportedOperationException("Invalid intention " + String.valueOf((Object)$$0.g()));
            }
        }
    }

    private void a(akj $$0, boolean $$1) {
        this.d.a(akv.d);
        if ($$0.b() != w.b().d()) {
            yw $$3;
            if ($$0.b() < 754) {
                yw $$2 = yh.a("multiplayer.disconnect.outdated_client", new Object[]{w.b().c()});
            } else {
                $$3 = yh.a("multiplayer.disconnect.incompatible", new Object[]{w.b().c()});
            }
            this.d.a(new aks($$3));
            this.d.a($$3);
        } else {
            this.d.a(akv.b, new ayk(this.c, this.d, $$1));
        }
    }

    @Override
    public void a(ww $$0) {
    }

    @Override
    public boolean c() {
        return this.d.i();
    }
}

