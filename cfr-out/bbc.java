/*
 * Decompiled with CFR 0.152.
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Optional;

@FunctionalInterface
public interface bbc {
    public static final bbc b = $$0 -> Optional.empty();

    public Optional<bax> getResource(amo var1);

    default public bax getResourceOrThrow(amo $$0) throws FileNotFoundException {
        return this.getResource($$0).orElseThrow(() -> new FileNotFoundException($$0.toString()));
    }

    default public InputStream open(amo $$0) throws IOException {
        return this.getResourceOrThrow($$0).d();
    }

    default public BufferedReader openAsReader(amo $$0) throws IOException {
        return this.getResourceOrThrow($$0).e();
    }

    public static bbc fromMap(Map<amo, bax> $$0) {
        return $$1 -> Optional.ofNullable((bax)$$0.get($$1));
    }
}

