/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.ByteBuffer;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import org.jspecify.annotations.Nullable;

public class htl
implements htr {
    public static final htr a = new htr(){

        @Override
        public boolean a(iz $$0, iz $$1) {
            return false;
        }
    };
    public static final htr b = new htr(){

        @Override
        public boolean a(iz $$0, iz $$1) {
            return true;
        }
    };
    private final List<elb> c;
    private final htv d;
    private final @Nullable fzl.b e;
    private @Nullable htt f;
    private final Map<hth, hto> g = new EnumMap<hth, hto>(hth.class);

    public htl(htt $$0, htp.a $$1) {
        this.f = $$0;
        this.d = $$1.c;
        this.c = $$1.a;
        this.e = $$1.d;
    }

    public void a(htt $$0) {
        this.f = $$0;
    }

    @Override
    public boolean b(htt $$0) {
        return !$$0.equals(this.f);
    }

    @Override
    public boolean a() {
        return !this.g.isEmpty();
    }

    @Override
    public boolean a(hth $$0) {
        return !this.g.containsKey((Object)$$0);
    }

    @Override
    public List<elb> b() {
        return this.c;
    }

    @Override
    public boolean a(iz $$0, iz $$1) {
        return this.d.a($$0, $$1);
    }

    @Override
    public @Nullable hto b(hth $$0) {
        return this.g.get((Object)$$0);
    }

    public void a(hth $$0, fzl $$1, long $$2) {
        CommandEncoder $$3 = RenderSystem.getDevice().createCommandEncoder();
        hto $$4 = this.b($$0);
        if ($$4 != null) {
            if ($$4.a().size() < (long)$$1.a().remaining()) {
                $$4.a().close();
                $$4.b(RenderSystem.getDevice().createBuffer(() -> "Section vertex buffer - layer: " + $$0.c() + "; cords: " + jw.b($$2) + ", " + jw.c($$2) + ", " + jw.d($$2), 40, $$1.a()));
            } else if (!$$4.a().isClosed()) {
                $$3.writeToBuffer($$4.a().slice(), $$1.a());
            }
            ByteBuffer $$5 = $$1.b();
            if ($$5 != null) {
                if ($$4.b() == null || $$4.b().size() < (long)$$5.remaining()) {
                    if ($$4.b() != null) {
                        $$4.b().close();
                    }
                    $$4.a(RenderSystem.getDevice().createBuffer(() -> "Section index buffer - layer: " + $$0.c() + "; cords: " + jw.b($$2) + ", " + jw.c($$2) + ", " + jw.d($$2), 72, $$5));
                } else if (!$$4.b().isClosed()) {
                    $$3.writeToBuffer($$4.b().slice(), $$5);
                }
            } else if ($$4.b() != null) {
                $$4.b().close();
                $$4.a((GpuBuffer)null);
            }
            $$4.a($$1.c().c());
            $$4.a($$1.c().e());
        } else {
            GpuBuffer $$6 = RenderSystem.getDevice().createBuffer(() -> "Section vertex buffer - layer: " + $$0.c() + "; cords: " + jw.b($$2) + ", " + jw.c($$2) + ", " + jw.d($$2), 40, $$1.a());
            ByteBuffer $$7 = $$1.b();
            GpuBuffer $$8 = $$7 != null ? RenderSystem.getDevice().createBuffer(() -> "Section index buffer - layer: " + $$0.c() + "; cords: " + jw.b($$2) + ", " + jw.c($$2) + ", " + jw.d($$2), 72, $$7) : null;
            hto $$9 = new hto($$6, $$8, $$1.c().c(), $$1.c().e());
            this.g.put($$0, $$9);
        }
    }

    public void a(hth $$0, fzi.a $$1, long $$2) {
        hto $$3 = this.b($$0);
        if ($$3 == null) {
            return;
        }
        if ($$3.b() == null) {
            $$3.a(RenderSystem.getDevice().createBuffer(() -> "Section index buffer - layer: " + $$0.c() + "; cords: " + jw.b($$2) + ", " + jw.c($$2) + ", " + jw.d($$2), 72, $$1.a()));
        } else {
            CommandEncoder $$4 = RenderSystem.getDevice().createCommandEncoder();
            if (!$$3.b().isClosed()) {
                $$4.writeToBuffer($$3.b().slice(), $$1.a());
            }
        }
    }

    @Override
    public boolean c() {
        return this.g.containsKey((Object)hth.c);
    }

    public @Nullable fzl.b d() {
        return this.e;
    }

    @Override
    public void close() {
        this.g.values().forEach(hto::close);
        this.g.clear();
    }
}

