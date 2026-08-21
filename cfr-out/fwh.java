/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.lwjgl.openal.AL
 *  org.lwjgl.openal.AL10
 *  org.lwjgl.openal.ALC
 *  org.lwjgl.openal.ALC10
 *  org.lwjgl.openal.ALC11
 *  org.lwjgl.openal.ALCCapabilities
 *  org.lwjgl.openal.ALCapabilities
 *  org.lwjgl.openal.ALUtil
 *  org.lwjgl.system.MemoryStack
 *  org.slf4j.Logger
 */
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import java.nio.IntBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.OptionalLong;
import java.util.Set;
import org.jspecify.annotations.Nullable;
import org.lwjgl.openal.AL;
import org.lwjgl.openal.AL10;
import org.lwjgl.openal.ALC;
import org.lwjgl.openal.ALC10;
import org.lwjgl.openal.ALC11;
import org.lwjgl.openal.ALCCapabilities;
import org.lwjgl.openal.ALCapabilities;
import org.lwjgl.openal.ALUtil;
import org.lwjgl.system.MemoryStack;
import org.slf4j.Logger;

public class fwh {
    static final Logger a = LogUtils.getLogger();
    private static final int b = 0;
    private static final int c = 30;
    private long d;
    private long e;
    private boolean f;
    private @Nullable String g;
    private static final a h = new a(){

        @Override
        public @Nullable fwg a() {
            return null;
        }

        @Override
        public boolean a(fwg $$0) {
            return false;
        }

        @Override
        public void b() {
        }

        @Override
        public int c() {
            return 0;
        }

        @Override
        public int d() {
            return 0;
        }
    };
    private a i = h;
    private a j = h;
    private final fwi k = new fwi();

    public fwh() {
        this.g = fwh.a();
    }

    public void a(@Nullable String $$0, boolean $$1) {
        this.d = fwh.a($$0);
        this.f = false;
        ALCCapabilities $$2 = ALC.createCapabilities((long)this.d);
        if (fwk.a(this.d, "Get capabilities")) {
            throw new IllegalStateException("Failed to get OpenAL capabilities");
        }
        if (!$$2.OpenALC11) {
            throw new IllegalStateException("OpenAL 1.1 not supported");
        }
        try (MemoryStack $$3 = MemoryStack.stackPush();){
            IntBuffer $$4 = this.a($$3, $$2.ALC_SOFT_HRTF && $$1);
            this.e = ALC10.alcCreateContext((long)this.d, (IntBuffer)$$4);
        }
        if (fwk.a(this.d, "Create context")) {
            throw new IllegalStateException("Unable to create OpenAL context");
        }
        ALC10.alcMakeContextCurrent((long)this.e);
        int $$5 = this.i();
        int $$6 = bgj.a((int)bgj.a((float)$$5), 2, 8);
        int $$7 = bgj.a($$5 - $$6, 8, 255);
        this.i = new b($$7);
        this.j = new b($$6);
        ALCapabilities $$8 = AL.createCapabilities((ALCCapabilities)$$2);
        fwk.a("Initialization");
        if (!$$8.AL_EXT_source_distance_model) {
            throw new IllegalStateException("AL_EXT_source_distance_model is not supported");
        }
        AL10.alEnable((int)512);
        if (!$$8.AL_EXT_LINEAR_DISTANCE) {
            throw new IllegalStateException("AL_EXT_LINEAR_DISTANCE is not supported");
        }
        fwk.a("Enable per-source distance models");
        a.info("OpenAL initialized on device {}", (Object)this.b());
        this.f = ALC10.alcIsExtensionPresent((long)this.d, (CharSequence)"ALC_EXT_disconnect");
    }

    private IntBuffer a(MemoryStack $$0, boolean $$1) {
        int $$2 = 5;
        IntBuffer $$3 = $$0.callocInt(11);
        int $$4 = ALC10.alcGetInteger((long)this.d, (int)6548);
        if ($$4 > 0) {
            $$3.put(6546).put($$1 ? 1 : 0);
            $$3.put(6550).put(0);
        }
        $$3.put(6554).put(1);
        return $$3.put(0).flip();
    }

    private int i() {
        try (MemoryStack $$0 = MemoryStack.stackPush();){
            int $$1 = ALC10.alcGetInteger((long)this.d, (int)4098);
            if (fwk.a(this.d, "Get attributes size")) {
                throw new IllegalStateException("Failed to get OpenAL attributes");
            }
            IntBuffer $$2 = $$0.mallocInt($$1);
            ALC10.alcGetIntegerv((long)this.d, (int)4099, (IntBuffer)$$2);
            if (fwk.a(this.d, "Get attributes")) {
                throw new IllegalStateException("Failed to get OpenAL attributes");
            }
            int $$3 = 0;
            while ($$3 < $$1) {
                int $$4;
                if (($$4 = $$2.get($$3++)) == 0) {
                    break;
                }
                int $$5 = $$2.get($$3++);
                if ($$4 != 4112) continue;
                int n2 = $$5;
                return n2;
            }
        }
        return 30;
    }

    public static @Nullable String a() {
        if (!ALC10.alcIsExtensionPresent((long)0L, (CharSequence)"ALC_ENUMERATE_ALL_EXT")) {
            return null;
        }
        ALUtil.getStringList((long)0L, (int)4115);
        return ALC10.alcGetString((long)0L, (int)4114);
    }

    public String b() {
        String $$0 = ALC10.alcGetString((long)this.d, (int)4115);
        if ($$0 == null) {
            $$0 = ALC10.alcGetString((long)this.d, (int)4101);
        }
        if ($$0 == null) {
            $$0 = "Unknown";
        }
        return $$0;
    }

    public synchronized boolean c() {
        String $$0 = fwh.a();
        if (Objects.equals(this.g, $$0)) {
            return false;
        }
        this.g = $$0;
        return true;
    }

    private static long a(@Nullable String $$0) {
        OptionalLong $$1 = OptionalLong.empty();
        if ($$0 != null) {
            $$1 = fwh.b($$0);
        }
        if ($$1.isEmpty()) {
            $$1 = fwh.b(fwh.a());
        }
        if ($$1.isEmpty()) {
            $$1 = fwh.b(null);
        }
        if ($$1.isEmpty()) {
            throw new IllegalStateException("Failed to open OpenAL device");
        }
        return $$1.getAsLong();
    }

    private static OptionalLong b(@Nullable String $$0) {
        long $$1 = ALC10.alcOpenDevice((CharSequence)$$0);
        if ($$1 != 0L && !fwk.a($$1, "Open device")) {
            return OptionalLong.of($$1);
        }
        return OptionalLong.empty();
    }

    public void d() {
        this.i.b();
        this.j.b();
        ALC10.alcDestroyContext((long)this.e);
        if (this.d != 0L) {
            ALC10.alcCloseDevice((long)this.d);
        }
    }

    public fwi e() {
        return this.k;
    }

    public @Nullable fwg a(c $$0) {
        return ($$0 == fwh$c.b ? this.j : this.i).a();
    }

    public void a(fwg $$0) {
        if (!this.i.a($$0) && !this.j.a($$0)) {
            throw new IllegalStateException("Tried to release unknown channel");
        }
    }

    public String f() {
        return String.format(Locale.ROOT, "Sounds: %d/%d + %d/%d", this.i.d(), this.i.c(), this.j.d(), this.j.c());
    }

    public List<String> g() {
        List $$0 = ALUtil.getStringList((long)0L, (int)4115);
        if ($$0 == null) {
            return Collections.emptyList();
        }
        return $$0;
    }

    public boolean h() {
        return this.f && ALC11.alcGetInteger((long)this.d, (int)787) == 0;
    }

    static interface a {
        public @Nullable fwg a();

        public boolean a(fwg var1);

        public void b();

        public int c();

        public int d();
    }

    static class b
    implements a {
        private final int a;
        private final Set<fwg> b = Sets.newIdentityHashSet();

        public b(int $$0) {
            this.a = $$0;
        }

        @Override
        public @Nullable fwg a() {
            if (this.b.size() >= this.a) {
                if (w.aX) {
                    a.warn("Maximum sound pool size {} reached", (Object)this.a);
                }
                return null;
            }
            fwg $$0 = fwg.a();
            if ($$0 != null) {
                this.b.add($$0);
            }
            return $$0;
        }

        @Override
        public boolean a(fwg $$0) {
            if (!this.b.remove($$0)) {
                return false;
            }
            $$0.b();
            return true;
        }

        @Override
        public void b() {
            this.b.forEach(fwg::b);
            this.b.clear();
        }

        @Override
        public int c() {
            return this.a;
        }

        @Override
        public int d() {
            return this.b.size();
        }
    }

    public static final class c
    extends Enum<c> {
        public static final /* enum */ c a = new c();
        public static final /* enum */ c b = new c();
        private static final /* synthetic */ c[] c;

        public static c[] values() {
            return (c[])c.clone();
        }

        public static c valueOf(String $$0) {
            return Enum.valueOf(c.class, $$0);
        }

        private static /* synthetic */ c[] a() {
            return new c[]{a, b};
        }

        static {
            c = fwh$c.a();
        }
    }
}

