/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.List;
import java.util.Objects;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class hiu {
    private static final Logger a = LogUtils.getLogger();
    private static final cbs b = new cbs(bhs.h(), "server-list-io");
    private static final int c = 16;
    private final gfj d;
    private final List<hit> e = Lists.newArrayList();
    private final List<hit> f = Lists.newArrayList();

    public hiu(gfj $$0) {
        this.d = $$0;
    }

    public void a() {
        try {
            this.e.clear();
            this.f.clear();
            uz $$02 = vm.a(this.d.p.toPath().resolve("servers.dat"));
            if ($$02 == null) {
                return;
            }
            $$02.p("servers").j().forEach($$0 -> {
                hit $$1 = hit.a($$0);
                if ($$0.b("hidden", false)) {
                    this.f.add($$1);
                } else {
                    this.e.add($$1);
                }
            });
        }
        catch (Exception $$1) {
            a.error("Couldn't load server list", (Throwable)$$1);
        }
    }

    public void b() {
        try {
            vf $$0 = new vf();
            for (hit $$1 : this.e) {
                uz $$2 = $$1.a();
                $$2.a("hidden", false);
                $$0.add($$2);
            }
            for (hit $$3 : this.f) {
                uz $$4 = $$3.a();
                $$4.a("hidden", true);
                $$0.add($$4);
            }
            uz $$5 = new uz();
            $$5.a("servers", $$0);
            Path $$6 = this.d.p.toPath();
            Path $$7 = Files.createTempFile($$6, "servers", ".dat", new FileAttribute[0]);
            vm.b($$5, $$7);
            Path $$8 = $$6.resolve("servers.dat_old");
            Path $$9 = $$6.resolve("servers.dat");
            bhs.a($$9, $$7, $$8);
        }
        catch (Exception $$10) {
            a.error("Couldn't save server list", (Throwable)$$10);
        }
    }

    public hit a(int $$0) {
        return this.e.get($$0);
    }

    public @Nullable hit a(String $$0) {
        for (hit $$1 : this.e) {
            if (!$$1.b.equals($$0)) continue;
            return $$1;
        }
        for (hit $$2 : this.f) {
            if (!$$2.b.equals($$0)) continue;
            return $$2;
        }
        return null;
    }

    public @Nullable hit b(String $$0) {
        for (int $$1 = 0; $$1 < this.f.size(); ++$$1) {
            hit $$2 = this.f.get($$1);
            if (!$$2.b.equals($$0)) continue;
            this.f.remove($$1);
            this.e.add($$2);
            return $$2;
        }
        return null;
    }

    public void a(hit $$0) {
        if (!this.e.remove($$0)) {
            this.f.remove($$0);
        }
    }

    public void a(hit $$0, boolean $$1) {
        if ($$1) {
            this.f.add(0, $$0);
            while (this.f.size() > 16) {
                this.f.remove(this.f.size() - 1);
            }
        } else {
            this.e.add($$0);
        }
    }

    public int c() {
        return this.e.size();
    }

    public void a(int $$0, int $$1) {
        hit $$2 = this.a($$0);
        this.e.set($$0, this.a($$1));
        this.e.set($$1, $$2);
        this.b();
    }

    public void a(int $$0, hit $$1) {
        this.e.set($$0, $$1);
    }

    private static boolean a(hit $$0, List<hit> $$1) {
        for (int $$2 = 0; $$2 < $$1.size(); ++$$2) {
            hit $$3 = $$1.get($$2);
            if (!Objects.equals($$3.a, $$0.a) || !$$3.b.equals($$0.b)) continue;
            $$1.set($$2, $$0);
            return true;
        }
        return false;
    }

    public static void b(hit $$0) {
        b.a_(() -> {
            hiu $$1 = new hiu(gfj.V());
            $$1.a();
            if (!hiu.a($$0, $$1.e)) {
                hiu.a($$0, $$1.f);
            }
            $$1.b();
        });
    }
}

