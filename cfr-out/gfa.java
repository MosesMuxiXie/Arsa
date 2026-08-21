/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  com.mojang.text2speech.Narrator
 *  org.lwjgl.util.tinyfd.TinyFileDialogs
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import com.mojang.text2speech.Narrator;
import org.lwjgl.util.tinyfd.TinyFileDialogs;
import org.slf4j.Logger;

public class gfa {
    public static final yh a = yg.a;
    private static final Logger b = LogUtils.getLogger();
    private final gfj c;
    private final Narrator d = Narrator.getNarrator();

    public gfa(gfj $$0) {
        this.c = $$0;
    }

    public void a(yh $$0) {
        if (this.d().c()) {
            this.e($$0);
        }
    }

    public void b(yh $$0) {
        if (this.d().e()) {
            this.e($$0);
        }
    }

    public void c(yh $$0) {
        if (this.d().d()) {
            this.e($$0);
        }
    }

    private void e(yh $$0) {
        String $$1 = $$0.getString();
        if (!$$1.isEmpty()) {
            this.b($$1);
            this.a($$1, false);
        }
    }

    public void d(yh $$0) {
        this.a($$0.getString());
    }

    public void a(String $$0) {
        if (this.d().d() && !$$0.isEmpty()) {
            this.b($$0);
            if (this.d.active()) {
                this.d.clear();
                this.a($$0, true);
            }
        }
    }

    private void a(String $$0, boolean $$1) {
        this.d.say($$0, $$1, this.c.k.a(bdb.j));
    }

    private gfm d() {
        return this.c.k.aK().b();
    }

    private void b(String $$0) {
        if (w.aX) {
            b.debug("Narrating: {}", (Object)$$0.replaceAll("\n", "\\\\n"));
        }
    }

    public void a(gfm $$0) {
        this.b();
        this.a(yh.c("options.narrator").f(" : ").b($$0.b()).getString(), true);
        gnc $$1 = gfj.V().aG();
        if (this.d.active()) {
            if ($$0 == gfm.a) {
                gna.b($$1, gna.a.a, yh.c("narrator.toast.disabled"), null);
            } else {
                gna.b($$1, gna.a.a, yh.c("narrator.toast.enabled"), $$0.b());
            }
        } else {
            gna.b($$1, gna.a.a, yh.c("narrator.toast.disabled"), yh.c("options.narrator.notavailable"));
        }
    }

    public boolean a() {
        return this.d.active();
    }

    public void b() {
        if (this.d() == gfm.a || !this.d.active()) {
            return;
        }
        this.d.clear();
    }

    public void c() {
        this.d.destroy();
    }

    public void a(boolean $$0) {
        if ($$0 && !this.a() && !TinyFileDialogs.tinyfd_messageBox((CharSequence)"Minecraft", (CharSequence)"Failed to initialize text-to-speech library. Do you want to continue?\nIf this problem persists, please report it at bugs.mojang.com", (CharSequence)"yesno", (CharSequence)"error", (boolean)true)) {
            throw new a("Narrator library is not active");
        }
    }

    public static class a
    extends gzg {
        public a(String $$0) {
            super($$0);
        }
    }
}

