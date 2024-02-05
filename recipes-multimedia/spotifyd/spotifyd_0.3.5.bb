SUMMARY = "A Spotify daemon"
DESCRIPTION = "\
    An open source Spotify client running as a UNIX daemon."

HOMEPAGE = "https://github.com/Spotifyd/spotifyd"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "\
    file://LICENSE;md5=84dcc94da3adb52b53ae4fa38fe49e5d \
"

DEPENDS = "\
    alsa-lib \
"

SRC_URI = "git://github.com/Spotifyd/spotifyd.git;protocol=https;nobranch=1"

# please note if you have entries that do not begin with crate://
# you must change them to how that package can be fetched
SRC_URI:append = "\
    crate://crates.io/addr2line/0.19.0 \
    crate://crates.io/adler/1.0.2 \
    crate://crates.io/aes-ctr/0.6.0 \
    crate://crates.io/aes-soft/0.6.4 \
    crate://crates.io/aes/0.6.0 \
    crate://crates.io/aes/0.7.5 \
    crate://crates.io/aesni/0.10.0 \
    crate://crates.io/aho-corasick/0.7.20 \
    crate://crates.io/alsa-sys/0.3.1 \
    crate://crates.io/alsa/0.6.0 \
    crate://crates.io/alsa/0.7.0 \
    crate://crates.io/android_system_properties/0.1.5 \
    crate://crates.io/ansi_term/0.12.1 \
    crate://crates.io/async-broadcast/0.5.1 \
    crate://crates.io/async-channel/1.8.0 \
    crate://crates.io/async-executor/1.5.0 \
    crate://crates.io/async-fs/1.6.0 \
    crate://crates.io/async-io/1.13.0 \
    crate://crates.io/async-lock/2.7.0 \
    crate://crates.io/async-recursion/1.0.4 \
    crate://crates.io/async-task/4.4.0 \
    crate://crates.io/async-trait/0.1.68 \
    crate://crates.io/atomic-waker/1.1.0 \
    crate://crates.io/atty/0.2.14 \
    crate://crates.io/autocfg/1.1.0 \
    crate://crates.io/backtrace/0.3.67 \
    crate://crates.io/base64/0.13.1 \
    crate://crates.io/bindgen/0.64.0 \
    crate://crates.io/bitflags/1.3.2 \
    crate://crates.io/block-buffer/0.10.4 \
    crate://crates.io/block-buffer/0.9.0 \
    crate://crates.io/block-modes/0.8.1 \
    crate://crates.io/block-padding/0.2.1 \
    crate://crates.io/blocking/1.3.0 \
    crate://crates.io/bumpalo/3.12.0 \
    crate://crates.io/byteorder/1.4.3 \
    crate://crates.io/bytes/1.4.0 \
    crate://crates.io/cc/1.0.79 \
    crate://crates.io/cesu8/1.1.0 \
    crate://crates.io/cexpr/0.6.0 \
    crate://crates.io/cfg-if/1.0.0 \
    crate://crates.io/chrono/0.4.24 \
    crate://crates.io/cipher/0.2.5 \
    crate://crates.io/cipher/0.3.0 \
    crate://crates.io/clang-sys/1.6.1 \
    crate://crates.io/clap/2.34.0 \
    crate://crates.io/codespan-reporting/0.11.1 \
    crate://crates.io/color-eyre/0.6.2 \
    crate://crates.io/color-spantrace/0.2.0 \
    crate://crates.io/combine/4.6.6 \
    crate://crates.io/concurrent-queue/2.1.0 \
    crate://crates.io/cookie/0.16.2 \
    crate://crates.io/cookie_store/0.19.0 \
    crate://crates.io/core-foundation-sys/0.8.3 \
    crate://crates.io/core-foundation/0.9.3 \
    crate://crates.io/coreaudio-rs/0.10.0 \
    crate://crates.io/coreaudio-sys/0.2.12 \
    crate://crates.io/cpal/0.13.5 \
    crate://crates.io/cpufeatures/0.2.6 \
    crate://crates.io/crossbeam-utils/0.8.15 \
    crate://crates.io/crypto-common/0.1.6 \
    crate://crates.io/crypto-mac/0.11.1 \
    crate://crates.io/ctr/0.6.0 \
    crate://crates.io/cxx-build/1.0.94 \
    crate://crates.io/cxx/1.0.94 \
    crate://crates.io/cxxbridge-flags/1.0.94 \
    crate://crates.io/cxxbridge-macro/1.0.94 \
    crate://crates.io/daemonize/0.5.0 \
    crate://crates.io/darling/0.13.4 \
    crate://crates.io/darling_core/0.13.4 \
    crate://crates.io/darling_macro/0.13.4 \
    crate://crates.io/dbus-crossroads/0.5.2 \
    crate://crates.io/dbus-tokio/0.7.6 \
    crate://crates.io/dbus/0.9.7 \
    crate://crates.io/derivative/2.2.0 \
    crate://crates.io/digest/0.10.6 \
    crate://crates.io/digest/0.9.0 \
    crate://crates.io/dirs-sys/0.3.7 \
    crate://crates.io/dirs/4.0.0 \
    crate://crates.io/enum_dispatch/0.3.11 \
    crate://crates.io/enumflags2/0.7.5 \
    crate://crates.io/enumflags2_derive/0.7.4 \
    crate://crates.io/env_logger/0.10.0 \
    crate://crates.io/errno-dragonfly/0.1.2 \
    crate://crates.io/errno/0.3.0 \
    crate://crates.io/error-chain/0.12.4 \
    crate://crates.io/event-listener/2.5.3 \
    crate://crates.io/eyre/0.6.8 \
    crate://crates.io/fastrand/1.9.0 \
    crate://crates.io/fern/0.6.2 \
    crate://crates.io/fixedbitset/0.4.2 \
    crate://crates.io/fnv/1.0.7 \
    crate://crates.io/form_urlencoded/1.1.0 \
    crate://crates.io/futures-channel/0.3.27 \
    crate://crates.io/futures-core/0.3.27 \
    crate://crates.io/futures-executor/0.3.27 \
    crate://crates.io/futures-io/0.3.27 \
    crate://crates.io/futures-lite/1.12.0 \
    crate://crates.io/futures-macro/0.3.27 \
    crate://crates.io/futures-sink/0.3.27 \
    crate://crates.io/futures-task/0.3.27 \
    crate://crates.io/futures-util/0.3.27 \
    crate://crates.io/futures/0.3.27 \
    crate://crates.io/generic-array/0.14.7 \
    crate://crates.io/gethostname/0.4.1 \
    crate://crates.io/getrandom/0.2.8 \
    crate://crates.io/gimli/0.27.2 \
    crate://crates.io/glob/0.3.1 \
    crate://crates.io/hashbrown/0.12.3 \
    crate://crates.io/headers-core/0.2.0 \
    crate://crates.io/headers/0.3.8 \
    crate://crates.io/heck/0.3.3 \
    crate://crates.io/heck/0.4.1 \
    crate://crates.io/hermit-abi/0.1.19 \
    crate://crates.io/hermit-abi/0.2.6 \
    crate://crates.io/hermit-abi/0.3.1 \
    crate://crates.io/hex/0.4.3 \
    crate://crates.io/hkdf/0.12.3 \
    crate://crates.io/hmac/0.11.0 \
    crate://crates.io/hmac/0.12.1 \
    crate://crates.io/hostname/0.3.1 \
    crate://crates.io/http-body/0.4.5 \
    crate://crates.io/http/0.2.9 \
    crate://crates.io/httparse/1.8.0 \
    crate://crates.io/httpdate/1.0.2 \
    crate://crates.io/humantime/2.1.0 \
    crate://crates.io/hyper-proxy/0.9.1 \
    crate://crates.io/hyper/0.14.25 \
    crate://crates.io/iana-time-zone-haiku/0.1.1 \
    crate://crates.io/iana-time-zone/0.1.54 \
    crate://crates.io/ident_case/1.0.1 \
    crate://crates.io/idna/0.3.0 \
    crate://crates.io/if-addrs/0.7.0 \
    crate://crates.io/indenter/0.3.3 \
    crate://crates.io/indexmap/1.9.3 \
    crate://crates.io/instant/0.1.12 \
    crate://crates.io/io-lifetimes/1.0.9 \
    crate://crates.io/is-terminal/0.4.6 \
    crate://crates.io/itoa/1.0.6 \
    crate://crates.io/jni-sys/0.3.0 \
    crate://crates.io/jni/0.19.0 \
    crate://crates.io/jobserver/0.1.26 \
    crate://crates.io/js-sys/0.3.61 \
    crate://crates.io/keyring/2.0.1 \
    crate://crates.io/lazy_static/1.4.0 \
    crate://crates.io/lazycell/1.3.0 \
    crate://crates.io/lewton/0.10.2 \
    crate://crates.io/libc/0.2.140 \
    crate://crates.io/libdbus-sys/0.2.4 \
    crate://crates.io/libloading/0.7.4 \
    crate://crates.io/libm/0.2.6 \
    crate://crates.io/libmdns/0.7.5 \
    crate://crates.io/libpulse-binding/2.27.1 \
    crate://crates.io/libpulse-simple-binding/2.27.1 \
    crate://crates.io/libpulse-simple-sys/1.20.1 \
    crate://crates.io/libpulse-sys/1.20.1 \
    crate://crates.io/librespot-audio/0.4.2 \
    crate://crates.io/librespot-connect/0.4.2 \
    crate://crates.io/librespot-core/0.4.2 \
    crate://crates.io/librespot-discovery/0.4.2 \
    crate://crates.io/librespot-metadata/0.4.2 \
    crate://crates.io/librespot-playback/0.4.2 \
    crate://crates.io/librespot-protocol/0.4.2 \
    crate://crates.io/link-cplusplus/1.0.8 \
    crate://crates.io/linux-keyutils/0.2.3 \
    crate://crates.io/linux-raw-sys/0.3.0 \
    crate://crates.io/lock_api/0.4.9 \
    crate://crates.io/log/0.4.17 \
    crate://crates.io/mach/0.3.2 \
    crate://crates.io/match_cfg/0.1.0 \
    crate://crates.io/maybe-async/0.2.7 \
    crate://crates.io/memchr/2.5.0 \
    crate://crates.io/memoffset/0.6.5 \
    crate://crates.io/memoffset/0.7.1 \
    crate://crates.io/mime/0.3.17 \
    crate://crates.io/minimal-lexical/0.2.1 \
    crate://crates.io/miniz_oxide/0.6.2 \
    crate://crates.io/mio/0.8.6 \
    crate://crates.io/multimap/0.8.3 \
    crate://crates.io/ndk-context/0.1.1 \
    crate://crates.io/ndk-glue/0.6.2 \
    crate://crates.io/ndk-macro/0.3.0 \
    crate://crates.io/ndk-sys/0.3.0 \
    crate://crates.io/ndk/0.6.0 \
    crate://crates.io/nix/0.23.2 \
    crate://crates.io/nix/0.24.3 \
    crate://crates.io/nix/0.26.2 \
    crate://crates.io/nom/7.1.3 \
    crate://crates.io/num-bigint/0.4.3 \
    crate://crates.io/num-complex/0.4.3 \
    crate://crates.io/num-derive/0.3.3 \
    crate://crates.io/num-integer/0.1.45 \
    crate://crates.io/num-iter/0.1.43 \
    crate://crates.io/num-rational/0.4.1 \
    crate://crates.io/num-traits/0.2.15 \
    crate://crates.io/num/0.4.0 \
    crate://crates.io/num_cpus/1.15.0 \
    crate://crates.io/num_enum/0.5.11 \
    crate://crates.io/num_enum_derive/0.5.11 \
    crate://crates.io/num_threads/0.1.6 \
    crate://crates.io/object/0.30.3 \
    crate://crates.io/oboe-sys/0.4.5 \
    crate://crates.io/oboe/0.4.6 \
    crate://crates.io/ogg/0.8.0 \
    crate://crates.io/once_cell/1.17.1 \
    crate://crates.io/opaque-debug/0.3.0 \
    crate://crates.io/ordered-stream/0.2.0 \
    crate://crates.io/owo-colors/3.5.0 \
    crate://crates.io/parking/2.0.0 \
    crate://crates.io/parking_lot/0.11.2 \
    crate://crates.io/parking_lot/0.12.1 \
    crate://crates.io/parking_lot_core/0.8.6 \
    crate://crates.io/parking_lot_core/0.9.7 \
    crate://crates.io/pbkdf2/0.8.0 \
    crate://crates.io/peeking_take_while/0.1.2 \
    crate://crates.io/percent-encoding/2.2.0 \
    crate://crates.io/petgraph/0.6.3 \
    crate://crates.io/pin-project-lite/0.2.9 \
    crate://crates.io/pin-utils/0.1.0 \
    crate://crates.io/pkg-config/0.3.26 \
    crate://crates.io/polling/2.6.0 \
    crate://crates.io/portaudio-rs/0.3.2 \
    crate://crates.io/portaudio-sys/0.1.1 \
    crate://crates.io/ppv-lite86/0.2.17 \
    crate://crates.io/priority-queue/1.3.1 \
    crate://crates.io/proc-macro-crate/1.3.1 \
    crate://crates.io/proc-macro-error-attr/1.0.4 \
    crate://crates.io/proc-macro-error/1.0.4 \
    crate://crates.io/proc-macro2/1.0.54 \
    crate://crates.io/protobuf-codegen-pure/2.28.0 \
    crate://crates.io/protobuf-codegen/2.28.0 \
    crate://crates.io/protobuf/2.28.0 \
    crate://crates.io/quote/1.0.26 \
    crate://crates.io/rand/0.8.5 \
    crate://crates.io/rand_chacha/0.3.1 \
    crate://crates.io/rand_core/0.6.4 \
    crate://crates.io/rand_distr/0.4.3 \
    crate://crates.io/redox_syscall/0.2.16 \
    crate://crates.io/redox_syscall/0.3.5 \
    crate://crates.io/redox_users/0.4.3 \
    crate://crates.io/regex-syntax/0.6.29 \
    crate://crates.io/regex/1.7.3 \
    crate://crates.io/ring/0.16.20 \
    crate://crates.io/rodio/0.15.0 \
    crate://crates.io/rspotify-http/0.11.6 \
    crate://crates.io/rspotify-macros/0.11.6 \
    crate://crates.io/rspotify-model/0.11.6 \
    crate://crates.io/rspotify/0.11.6 \
    crate://crates.io/rustc-demangle/0.1.22 \
    crate://crates.io/rustc-hash/1.1.0 \
    crate://crates.io/rustc-serialize/0.3.24 \
    crate://crates.io/rustc_version/0.4.0 \
    crate://crates.io/rustix/0.37.5 \
    crate://crates.io/rustls/0.20.8 \
    crate://crates.io/rustversion/1.0.12 \
    crate://crates.io/ryu/1.0.13 \
    crate://crates.io/same-file/1.0.6 \
    crate://crates.io/scopeguard/1.1.0 \
    crate://crates.io/scratch/1.0.5 \
    crate://crates.io/sct/0.7.0 \
    crate://crates.io/secret-service/3.0.1 \
    crate://crates.io/security-framework-sys/2.8.0 \
    crate://crates.io/security-framework/2.8.2 \
    crate://crates.io/semver/1.0.17 \
    crate://crates.io/serde/1.0.159 \
    crate://crates.io/serde_derive/1.0.159 \
    crate://crates.io/serde_json/1.0.95 \
    crate://crates.io/serde_repr/0.1.12 \
    crate://crates.io/serde_spanned/0.6.1 \
    crate://crates.io/sha-1/0.10.1 \
    crate://crates.io/sha-1/0.9.8 \
    crate://crates.io/sha1/0.10.5 \
    crate://crates.io/sha2/0.10.6 \
    crate://crates.io/shannon/0.2.0 \
    crate://crates.io/sharded-slab/0.1.4 \
    crate://crates.io/shell-words/1.1.0 \
    crate://crates.io/shlex/1.1.0 \
    crate://crates.io/signal-hook-registry/1.4.1 \
    crate://crates.io/slab/0.4.8 \
    crate://crates.io/smallvec/1.10.0 \
    crate://crates.io/socket2/0.4.9 \
    crate://crates.io/spin/0.5.2 \
    crate://crates.io/static_assertions/1.1.0 \
    crate://crates.io/stdweb/0.1.3 \
    crate://crates.io/strsim/0.10.0 \
    crate://crates.io/strsim/0.8.0 \
    crate://crates.io/structopt-derive/0.4.18 \
    crate://crates.io/structopt/0.3.26 \
    crate://crates.io/strum/0.24.1 \
    crate://crates.io/strum_macros/0.24.3 \
    crate://crates.io/subtle/2.4.1 \
    crate://crates.io/syn/1.0.109 \
    crate://crates.io/syn/2.0.11 \
    crate://crates.io/syslog/6.0.1 \
    crate://crates.io/tempfile/3.5.0 \
    crate://crates.io/termcolor/1.2.0 \
    crate://crates.io/textwrap/0.11.0 \
    crate://crates.io/thiserror-impl/1.0.40 \
    crate://crates.io/thiserror/1.0.40 \
    crate://crates.io/thread-id/4.0.0 \
    crate://crates.io/thread_local/1.1.7 \
    crate://crates.io/time-core/0.1.0 \
    crate://crates.io/time-macros/0.2.8 \
    crate://crates.io/time/0.1.45 \
    crate://crates.io/time/0.3.20 \
    crate://crates.io/tinyvec/1.6.0 \
    crate://crates.io/tinyvec_macros/0.1.1 \
    crate://crates.io/tokio-macros/2.0.0 \
    crate://crates.io/tokio-stream/0.1.12 \
    crate://crates.io/tokio-util/0.7.7 \
    crate://crates.io/tokio/1.27.0 \
    crate://crates.io/toml/0.7.3 \
    crate://crates.io/toml_datetime/0.6.1 \
    crate://crates.io/toml_edit/0.19.8 \
    crate://crates.io/tower-service/0.3.2 \
    crate://crates.io/tracing-attributes/0.1.23 \
    crate://crates.io/tracing-core/0.1.30 \
    crate://crates.io/tracing-error/0.2.0 \
    crate://crates.io/tracing-subscriber/0.3.16 \
    crate://crates.io/tracing/0.1.37 \
    crate://crates.io/try-lock/0.2.4 \
    crate://crates.io/typenum/1.16.0 \
    crate://crates.io/uds_windows/1.0.2 \
    crate://crates.io/unicode-bidi/0.3.13 \
    crate://crates.io/unicode-ident/1.0.8 \
    crate://crates.io/unicode-normalization/0.1.22 \
    crate://crates.io/unicode-segmentation/1.10.1 \
    crate://crates.io/unicode-width/0.1.10 \
    crate://crates.io/untrusted/0.7.1 \
    crate://crates.io/ureq/2.6.2 \
    crate://crates.io/url/2.3.1 \
    crate://crates.io/uuid/1.3.0 \
    crate://crates.io/valuable/0.1.0 \
    crate://crates.io/vec_map/0.8.2 \
    crate://crates.io/vergen/3.2.0 \
    crate://crates.io/version_check/0.9.4 \
    crate://crates.io/waker-fn/1.1.0 \
    crate://crates.io/walkdir/2.3.3 \
    crate://crates.io/want/0.3.0 \
    crate://crates.io/wasi/0.10.0+wasi-snapshot-preview1 \
    crate://crates.io/wasi/0.11.0+wasi-snapshot-preview1 \
    crate://crates.io/wasm-bindgen-backend/0.2.84 \
    crate://crates.io/wasm-bindgen-macro-support/0.2.84 \
    crate://crates.io/wasm-bindgen-macro/0.2.84 \
    crate://crates.io/wasm-bindgen-shared/0.2.84 \
    crate://crates.io/wasm-bindgen/0.2.84 \
    crate://crates.io/web-sys/0.3.61 \
    crate://crates.io/webpki-roots/0.22.6 \
    crate://crates.io/webpki/0.22.0 \
    crate://crates.io/whoami/1.4.0 \
    crate://crates.io/winapi-i686-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi-util/0.1.5 \
    crate://crates.io/winapi-x86_64-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi/0.3.9 \
    crate://crates.io/windows-sys/0.45.0 \
    crate://crates.io/windows-targets/0.42.2 \
    crate://crates.io/windows/0.43.0 \
    crate://crates.io/windows/0.46.0 \
    crate://crates.io/windows_aarch64_gnullvm/0.42.2 \
    crate://crates.io/windows_aarch64_msvc/0.42.2 \
    crate://crates.io/windows_i686_gnu/0.42.2 \
    crate://crates.io/windows_i686_msvc/0.42.2 \
    crate://crates.io/windows_x86_64_gnu/0.42.2 \
    crate://crates.io/windows_x86_64_gnullvm/0.42.2 \
    crate://crates.io/windows_x86_64_msvc/0.42.2 \
    crate://crates.io/winnow/0.4.1 \
    crate://crates.io/xdg/2.4.1 \
    crate://crates.io/zbus/3.11.1 \
    crate://crates.io/zbus_macros/3.11.1 \
    crate://crates.io/zbus_names/2.5.0 \
    crate://crates.io/zerocopy-derive/0.3.2 \
    crate://crates.io/zerocopy/0.6.1 \
    crate://crates.io/zvariant/3.12.0 \
    crate://crates.io/zvariant_derive/3.12.0 \
    crate://crates.io/zvariant_utils/1.0.0 \
"

SRC_URI:append = "\
    file://spotifyd.service \
"

SRCREV = "d2387ed4b8dc13f0cbe17c0c9c076e2271f4472e"
S = "${WORKDIR}/git"
CARGO_SRC_DIR = ""

inherit cargo pkgconfig systemd

do_install:append() {
    install -d ${D}/${systemd_system_unitdir}
    install -m 0644 ${WORKDIR}/spotifyd.service ${D}/${systemd_system_unitdir}
}

FILES:${PN} += "${systemd_system_unitdir}/spotifyd.service"

SYSTEMD_SERVICE:${PN} = "spotifyd.service"
