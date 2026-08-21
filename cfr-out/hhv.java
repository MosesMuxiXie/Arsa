/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Strings
 *  com.mojang.authlib.exceptions.MinecraftClientException
 *  com.mojang.authlib.minecraft.InsecurePublicKeyException$MissingException
 *  com.mojang.authlib.minecraft.UserApiService
 *  com.mojang.authlib.yggdrasil.response.KeyPairResponse
 *  com.mojang.authlib.yggdrasil.response.KeyPairResponse$KeyPair
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.base.Strings;
import com.mojang.authlib.exceptions.MinecraftClientException;
import com.mojang.authlib.minecraft.InsecurePublicKeyException;
import com.mojang.authlib.minecraft.UserApiService;
import com.mojang.authlib.yggdrasil.response.KeyPairResponse;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.security.PublicKey;
import java.time.DateTimeException;
import java.time.Duration;
import java.time.Instant;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class hhv
implements hir {
    private static final Logger b = LogUtils.getLogger();
    private static final Duration c = Duration.ofHours(1L);
    private static final Path d = Path.of("profilekeys", new String[0]);
    private final UserApiService e;
    private final Path f;
    private CompletableFuture<Optional<ddr>> g = CompletableFuture.completedFuture(Optional.empty());
    private Instant h = Instant.EPOCH;

    public hhv(UserApiService $$0, UUID $$1, Path $$2) {
        this.e = $$0;
        this.f = $$2.resolve(d).resolve(String.valueOf($$1) + ".json");
    }

    @Override
    public CompletableFuture<Optional<ddr>> a() {
        this.h = Instant.now().plus(c);
        this.g = this.g.thenCompose(this::a);
        return this.g;
    }

    @Override
    public boolean b() {
        if (this.g.isDone() && Instant.now().isAfter(this.h)) {
            return this.g.join().map(ddr::a).orElse(true);
        }
        return false;
    }

    private CompletableFuture<Optional<ddr>> a(Optional<ddr> $$0) {
        return CompletableFuture.supplyAsync(() -> {
            if ($$0.isPresent() && !((ddr)$$0.get()).a()) {
                if (!w.aX) {
                    this.a((ddr)null);
                }
                return $$0;
            }
            try {
                ddr $$1 = this.a(this.e);
                this.a($$1);
                return Optional.ofNullable($$1);
            }
            catch (bfc | MinecraftClientException | IOException $$2) {
                b.error("Failed to retrieve profile key pair", $$2);
                this.a((ddr)null);
                return $$0;
            }
        }, bhs.j());
    }

    private Optional<ddr> c() {
        Optional optional;
        block9: {
            if (Files.notExists(this.f, new LinkOption[0])) {
                return Optional.empty();
            }
            BufferedReader $$0 = Files.newBufferedReader(this.f);
            try {
                optional = ddr.a.parse((DynamicOps)JsonOps.INSTANCE, (Object)bhf.a($$0)).result();
                if ($$0 == null) break block9;
            }
            catch (Throwable throwable) {
                try {
                    if ($$0 != null) {
                        try {
                            $$0.close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                }
                catch (Exception $$1) {
                    b.error("Failed to read profile key pair file {}", (Object)this.f, (Object)$$1);
                    return Optional.empty();
                }
            }
            $$0.close();
        }
        return optional;
    }

    private void a(@Nullable ddr $$02) {
        try {
            Files.deleteIfExists(this.f);
        }
        catch (IOException $$1) {
            b.error("Failed to delete profile key pair file {}", (Object)this.f, (Object)$$1);
        }
        if ($$02 == null) {
            return;
        }
        if (!w.aX) {
            return;
        }
        ddr.a.encodeStart((DynamicOps)JsonOps.INSTANCE, (Object)$$02).ifSuccess($$0 -> {
            try {
                Files.createDirectories(this.f.getParent(), new FileAttribute[0]);
                Files.writeString(this.f, (CharSequence)$$0.toString(), new OpenOption[0]);
            }
            catch (Exception $$1) {
                b.error("Failed to write profile key pair file {}", (Object)this.f, (Object)$$1);
            }
        });
    }

    private @Nullable ddr a(UserApiService $$0) throws bfc, IOException {
        KeyPairResponse $$1 = $$0.getKeyPair();
        if ($$1 != null) {
            dds.a $$2 = hhv.a($$1);
            return new ddr(bfb.a($$1.keyPair().privateKey()), new dds($$2), Instant.parse($$1.refreshedAfter()));
        }
        return null;
    }

    private static dds.a a(KeyPairResponse $$0) throws bfc {
        KeyPairResponse.KeyPair $$1 = $$0.keyPair();
        if ($$1 == null || Strings.isNullOrEmpty((String)$$1.publicKey()) || $$0.publicKeySignature() == null || $$0.publicKeySignature().array().length == 0) {
            throw new bfc((Throwable)new InsecurePublicKeyException.MissingException("Missing public key"));
        }
        try {
            Instant $$2 = Instant.parse($$0.expiresAt());
            PublicKey $$3 = bfb.b($$1.publicKey());
            ByteBuffer $$4 = $$0.publicKeySignature();
            return new dds.a($$2, $$3, $$4.array());
        }
        catch (IllegalArgumentException | DateTimeException $$5) {
            throw new bfc($$5);
        }
    }
}

