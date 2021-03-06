@file:kotlinx.cinterop.InteropStubs
@file:Suppress("UNUSED_VARIABLE", "UNUSED_EXPRESSION")
package sqlite3

import kotlin.native.SymbolName
import kotlinx.cinterop.internal.*
import kotlinx.cinterop.*
import cnames.structs.CCurHint
import cnames.structs.Fts5Context
import cnames.structs.Fts5Tokenizer
import cnames.structs.sqlite3_blob
import cnames.structs.sqlite3_pcache
import cnames.structs.sqlite3_stmt
import platform.posix.time_tVar
import platform.posix.tm
import platform.posix.va_list
import platform.posix.va_listVar
import platform.windows.BOOL
import platform.windows.BOOLVar
import platform.windows.CRITICAL_SECTION
import platform.windows.DWORD
import platform.windows.DWORDVar
import platform.windows.FARPROC
import platform.windows.FILETIME
import platform.windows.FILE_INFO_BY_HANDLE_CLASS
import platform.windows.GET_FILEEX_INFO_LEVELS
import platform.windows.HANDLE
import platform.windows.HANDLEVar
import platform.windows.HLOCAL
import platform.windows.HMODULE
import platform.windows.LARGE_INTEGER
import platform.windows.LONG
import platform.windows.LPBOOL
import platform.windows.LPCSTR
import platform.windows.LPCVOID
import platform.windows.LPCWSTR
import platform.windows.LPDWORD
import platform.windows.LPFILETIME
import platform.windows.LPHANDLE
import platform.windows.LPOSVERSIONINFOA
import platform.windows.LPOSVERSIONINFOW
import platform.windows.LPOVERLAPPED
import platform.windows.LPSECURITY_ATTRIBUTES
import platform.windows.LPSTR
import platform.windows.LPSTRVar
import platform.windows.LPSYSTEMTIME
import platform.windows.LPSYSTEM_INFO
import platform.windows.LPVOID
import platform.windows.LPWSTR
import platform.windows.LPWSTRVar
import platform.windows.PLARGE_INTEGER
import platform.windows.PLONG
import platform.windows.RPC_STATUS
import platform.windows.SIZE_T
import platform.windows.SYSTEMTIME
import platform.windows.SYSTEM_INFO
import platform.windows.UINT
import platform.windows.ULONG
import platform.windows.ULONG64
import platform.windows.ULONGLONG
import platform.windows.UUID

// NOTE THIS FILE IS AUTO-GENERATED

@CStruct("struct { void* p0; void* p1; void* p2; void* p3; void* p4; int p5; unsigned int p6; unsigned long long p7; long long p8; long long p9; unsigned int p10; unsigned int p11; int p12; int p13; int p14; unsigned short p15; unsigned char p16; unsigned char p17; unsigned char p18; unsigned char p19; unsigned char p20; unsigned char p21; signed char p22; unsigned char p23; unsigned char p24; unsigned char p25; unsigned char p26; unsigned char p27; unsigned char p28; int p29; unsigned int p30; int p31; int p32; int p33[12]; int p34; null p35; int p36; int p37; int p38; int p39; int p40; int p41; void* p42; void* p43; void* p44; void* p45; void* p46; void* p47; void* p48; void* p49; void* p50; void* p51; void* p52; void* p53; void* p54; void* p55; void* p56; void* p57; void* p58; union { volatile int p0; double p1; } p59; struct { unsigned int p0; unsigned short p1; unsigned char p2; unsigned int p3; unsigned int p4[3]; void* p5; void* p6; void* p7; void* p8; } p60; void* p61; void* p62; void* p63; void* p64; unsigned int p65; int p66; struct { unsigned int p0; unsigned int p1; void* p2; void* p3; } p67; void* p68; void* p69; void* p70; struct { unsigned int p0; unsigned int p1; void* p2; void* p3; } p71; struct { unsigned int p0; unsigned int p1; void* p2; void* p3; } p72; struct { void* p0; void* p1; int p2; unsigned char p3; } p73; struct { void* p0; void* p1; unsigned char p2; unsigned char p3; void* p4; } p74[2]; void* p75; int p76; int p77; int p78; long long p79; long long p80; void* p81; }")
class sqlite3(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(680, 8)
    
    var pVfs: CPointer<sqlite3_vfs>?
        get() = memberAt<CPointerVar<sqlite3_vfs>>(0).value
        set(value) { memberAt<CPointerVar<sqlite3_vfs>>(0).value = value }
    
    var pVdbe: CPointer<Vdbe>?
        get() = memberAt<CPointerVar<Vdbe>>(8).value
        set(value) { memberAt<CPointerVar<Vdbe>>(8).value = value }
    
    var pDfltColl: CPointer<CollSeq>?
        get() = memberAt<CPointerVar<CollSeq>>(16).value
        set(value) { memberAt<CPointerVar<CollSeq>>(16).value = value }
    
    var mutex: CPointer<sqlite3_mutex>?
        get() = memberAt<CPointerVar<sqlite3_mutex>>(24).value
        set(value) { memberAt<CPointerVar<sqlite3_mutex>>(24).value = value }
    
    var aDb: CPointer<Db>?
        get() = memberAt<CPointerVar<Db>>(32).value
        set(value) { memberAt<CPointerVar<Db>>(32).value = value }
    
    var nDb: Int
        get() = memberAt<IntVar>(40).value
        set(value) { memberAt<IntVar>(40).value = value }
    
    var mDbFlags: u32
        get() = memberAt<u32Var>(44).value
        set(value) { memberAt<u32Var>(44).value = value }
    
    var flags: u64
        get() = memberAt<u64Var>(48).value
        set(value) { memberAt<u64Var>(48).value = value }
    
    var lastRowid: i64
        get() = memberAt<i64Var>(56).value
        set(value) { memberAt<i64Var>(56).value = value }
    
    var szMmap: i64
        get() = memberAt<i64Var>(64).value
        set(value) { memberAt<i64Var>(64).value = value }
    
    var nSchemaLock: u32
        get() = memberAt<u32Var>(72).value
        set(value) { memberAt<u32Var>(72).value = value }
    
    var openFlags: UInt
        get() = memberAt<UIntVar>(76).value
        set(value) { memberAt<UIntVar>(76).value = value }
    
    var errCode: Int
        get() = memberAt<IntVar>(80).value
        set(value) { memberAt<IntVar>(80).value = value }
    
    var errMask: Int
        get() = memberAt<IntVar>(84).value
        set(value) { memberAt<IntVar>(84).value = value }
    
    var iSysErrno: Int
        get() = memberAt<IntVar>(88).value
        set(value) { memberAt<IntVar>(88).value = value }
    
    var dbOptFlags: u16
        get() = memberAt<u16Var>(92).value
        set(value) { memberAt<u16Var>(92).value = value }
    
    var enc: u8
        get() = memberAt<u8Var>(94).value
        set(value) { memberAt<u8Var>(94).value = value }
    
    var autoCommit: u8
        get() = memberAt<u8Var>(95).value
        set(value) { memberAt<u8Var>(95).value = value }
    
    var temp_store: u8
        get() = memberAt<u8Var>(96).value
        set(value) { memberAt<u8Var>(96).value = value }
    
    var mallocFailed: u8
        get() = memberAt<u8Var>(97).value
        set(value) { memberAt<u8Var>(97).value = value }
    
    var bBenignMalloc: u8
        get() = memberAt<u8Var>(98).value
        set(value) { memberAt<u8Var>(98).value = value }
    
    var dfltLockMode: u8
        get() = memberAt<u8Var>(99).value
        set(value) { memberAt<u8Var>(99).value = value }
    
    var nextAutovac: Byte
        get() = memberAt<ByteVar>(100).value
        set(value) { memberAt<ByteVar>(100).value = value }
    
    var suppressErr: u8
        get() = memberAt<u8Var>(101).value
        set(value) { memberAt<u8Var>(101).value = value }
    
    var vtabOnConflict: u8
        get() = memberAt<u8Var>(102).value
        set(value) { memberAt<u8Var>(102).value = value }
    
    var isTransactionSavepoint: u8
        get() = memberAt<u8Var>(103).value
        set(value) { memberAt<u8Var>(103).value = value }
    
    var mTrace: u8
        get() = memberAt<u8Var>(104).value
        set(value) { memberAt<u8Var>(104).value = value }
    
    var noSharedCache: u8
        get() = memberAt<u8Var>(105).value
        set(value) { memberAt<u8Var>(105).value = value }
    
    var nSqlExec: u8
        get() = memberAt<u8Var>(106).value
        set(value) { memberAt<u8Var>(106).value = value }
    
    var nextPagesize: Int
        get() = memberAt<IntVar>(108).value
        set(value) { memberAt<IntVar>(108).value = value }
    
    var magic: u32
        get() = memberAt<u32Var>(112).value
        set(value) { memberAt<u32Var>(112).value = value }
    
    var nChange: Int
        get() = memberAt<IntVar>(116).value
        set(value) { memberAt<IntVar>(116).value = value }
    
    var nTotalChange: Int
        get() = memberAt<IntVar>(120).value
        set(value) { memberAt<IntVar>(120).value = value }
    
    val aLimit: CArrayPointer<IntVar>
        get() = arrayMemberAt(124)
    
    var nMaxSorterMmap: Int
        get() = memberAt<IntVar>(172).value
        set(value) { memberAt<IntVar>(172).value = value }
    
    val init: sqlite3InitInfo
        get() = memberAt(176)
    
    var nVdbeActive: Int
        get() = memberAt<IntVar>(184).value
        set(value) { memberAt<IntVar>(184).value = value }
    
    var nVdbeRead: Int
        get() = memberAt<IntVar>(188).value
        set(value) { memberAt<IntVar>(188).value = value }
    
    var nVdbeWrite: Int
        get() = memberAt<IntVar>(192).value
        set(value) { memberAt<IntVar>(192).value = value }
    
    var nVdbeExec: Int
        get() = memberAt<IntVar>(196).value
        set(value) { memberAt<IntVar>(196).value = value }
    
    var nVDestroy: Int
        get() = memberAt<IntVar>(200).value
        set(value) { memberAt<IntVar>(200).value = value }
    
    var nExtension: Int
        get() = memberAt<IntVar>(204).value
        set(value) { memberAt<IntVar>(204).value = value }
    
    var aExtension: CPointer<COpaquePointerVar>?
        get() = memberAt<CPointerVar<COpaquePointerVar>>(208).value
        set(value) { memberAt<CPointerVar<COpaquePointerVar>>(208).value = value }
    
    var xTrace: CPointer<CFunction<(u32, COpaquePointer?, COpaquePointer?, COpaquePointer?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(u32, COpaquePointer?, COpaquePointer?, COpaquePointer?) -> Int>>>(216).value
        set(value) { memberAt<CPointerVar<CFunction<(u32, COpaquePointer?, COpaquePointer?, COpaquePointer?) -> Int>>>(216).value = value }
    
    var pTraceArg: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(224).value
        set(value) { memberAt<COpaquePointerVar>(224).value = value }
    
    var xProfile: CPointer<CFunction<(COpaquePointer?, CPointer<ByteVar>?, u64) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?, CPointer<ByteVar>?, u64) -> Unit>>>(232).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?, CPointer<ByteVar>?, u64) -> Unit>>>(232).value = value }
    
    var pProfileArg: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(240).value
        set(value) { memberAt<COpaquePointerVar>(240).value = value }
    
    var pCommitArg: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(248).value
        set(value) { memberAt<COpaquePointerVar>(248).value = value }
    
    var xCommitCallback: CPointer<CFunction<(COpaquePointer?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Int>>>(256).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Int>>>(256).value = value }
    
    var pRollbackArg: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(264).value
        set(value) { memberAt<COpaquePointerVar>(264).value = value }
    
    var xRollbackCallback: CPointer<CFunction<(COpaquePointer?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Unit>>>(272).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Unit>>>(272).value = value }
    
    var pUpdateArg: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(280).value
        set(value) { memberAt<COpaquePointerVar>(280).value = value }
    
    var xUpdateCallback: CPointer<CFunction<(COpaquePointer?, Int, CPointer<ByteVar>?, CPointer<ByteVar>?, sqlite_int64) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?, Int, CPointer<ByteVar>?, CPointer<ByteVar>?, sqlite_int64) -> Unit>>>(288).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?, Int, CPointer<ByteVar>?, CPointer<ByteVar>?, sqlite_int64) -> Unit>>>(288).value = value }
    
    var xWalCallback: CPointer<CFunction<(COpaquePointer?, CPointer<sqlite3>?, CPointer<ByteVar>?, Int) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?, CPointer<sqlite3>?, CPointer<ByteVar>?, Int) -> Int>>>(296).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?, CPointer<sqlite3>?, CPointer<ByteVar>?, Int) -> Int>>>(296).value = value }
    
    var pWalArg: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(304).value
        set(value) { memberAt<COpaquePointerVar>(304).value = value }
    
    var xCollNeeded: CPointer<CFunction<(COpaquePointer?, CPointer<sqlite3>?, Int, CPointer<ByteVar>?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?, CPointer<sqlite3>?, Int, CPointer<ByteVar>?) -> Unit>>>(312).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?, CPointer<sqlite3>?, Int, CPointer<ByteVar>?) -> Unit>>>(312).value = value }
    
    var xCollNeeded16: CPointer<CFunction<(COpaquePointer?, CPointer<sqlite3>?, Int, COpaquePointer?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?, CPointer<sqlite3>?, Int, COpaquePointer?) -> Unit>>>(320).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?, CPointer<sqlite3>?, Int, COpaquePointer?) -> Unit>>>(320).value = value }
    
    var pCollNeededArg: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(328).value
        set(value) { memberAt<COpaquePointerVar>(328).value = value }
    
    var pErr: CPointer<sqlite3_value>?
        get() = memberAt<CPointerVar<sqlite3_value>>(336).value
        set(value) { memberAt<CPointerVar<sqlite3_value>>(336).value = value }
    
    val u1: anonymousStruct1
        get() = memberAt(344)
    
    val lookaside: Lookaside
        get() = memberAt(352)
    
    var xAuth: sqlite3_xauth?
        get() = memberAt<sqlite3_xauthVar>(408).value
        set(value) { memberAt<sqlite3_xauthVar>(408).value = value }
    
    var pAuthArg: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(416).value
        set(value) { memberAt<COpaquePointerVar>(416).value = value }
    
    var xProgress: CPointer<CFunction<(COpaquePointer?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Int>>>(424).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Int>>>(424).value = value }
    
    var pProgressArg: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(432).value
        set(value) { memberAt<COpaquePointerVar>(432).value = value }
    
    var nProgressOps: UInt
        get() = memberAt<UIntVar>(440).value
        set(value) { memberAt<UIntVar>(440).value = value }
    
    var nVTrans: Int
        get() = memberAt<IntVar>(444).value
        set(value) { memberAt<IntVar>(444).value = value }
    
    val aModule: Hash
        get() = memberAt(448)
    
    var pVtabCtx: CPointer<VtabCtx>?
        get() = memberAt<CPointerVar<VtabCtx>>(472).value
        set(value) { memberAt<CPointerVar<VtabCtx>>(472).value = value }
    
    var aVTrans: CPointer<CPointerVar<VTable>>?
        get() = memberAt<CPointerVar<CPointerVar<VTable>>>(480).value
        set(value) { memberAt<CPointerVar<CPointerVar<VTable>>>(480).value = value }
    
    var pDisconnect: CPointer<VTable>?
        get() = memberAt<CPointerVar<VTable>>(488).value
        set(value) { memberAt<CPointerVar<VTable>>(488).value = value }
    
    val aFunc: Hash
        get() = memberAt(496)
    
    val aCollSeq: Hash
        get() = memberAt(520)
    
    val busyHandler: BusyHandler
        get() = memberAt(544)
    
    val aDbStatic: CArrayPointer<Db>
        get() = arrayMemberAt(568)
    
    var pSavepoint: CPointer<Savepoint>?
        get() = memberAt<CPointerVar<Savepoint>>(632).value
        set(value) { memberAt<CPointerVar<Savepoint>>(632).value = value }
    
    var busyTimeout: Int
        get() = memberAt<IntVar>(640).value
        set(value) { memberAt<IntVar>(640).value = value }
    
    var nSavepoint: Int
        get() = memberAt<IntVar>(644).value
        set(value) { memberAt<IntVar>(644).value = value }
    
    var nStatement: Int
        get() = memberAt<IntVar>(648).value
        set(value) { memberAt<IntVar>(648).value = value }
    
    var nDeferredCons: i64
        get() = memberAt<i64Var>(656).value
        set(value) { memberAt<i64Var>(656).value = value }
    
    var nDeferredImmCons: i64
        get() = memberAt<i64Var>(664).value
        set(value) { memberAt<i64Var>(664).value = value }
    
    var pnBytesFreed: CPointer<IntVar>?
        get() = memberAt<CPointerVar<IntVar>>(672).value
        set(value) { memberAt<CPointerVar<IntVar>>(672).value = value }
}

@CStruct("struct { int p0; int p1; int p2; void* p3; void* p4; void* p5; void* p6; void* p7; void* p8; void* p9; void* p10; void* p11; void* p12; void* p13; void* p14; void* p15; void* p16; void* p17; void* p18; void* p19; void* p20; void* p21; }")
class sqlite3_vfs(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(168, 8)
    
    var iVersion: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var szOsFile: Int
        get() = memberAt<IntVar>(4).value
        set(value) { memberAt<IntVar>(4).value = value }
    
    var mxPathname: Int
        get() = memberAt<IntVar>(8).value
        set(value) { memberAt<IntVar>(8).value = value }
    
    var pNext: CPointer<sqlite3_vfs>?
        get() = memberAt<CPointerVar<sqlite3_vfs>>(16).value
        set(value) { memberAt<CPointerVar<sqlite3_vfs>>(16).value = value }
    
    var zName: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(24).value
        set(value) { memberAt<CPointerVar<ByteVar>>(24).value = value }
    
    var pAppData: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(32).value
        set(value) { memberAt<COpaquePointerVar>(32).value = value }
    
    var xOpen: CPointer<CFunction<(CPointer<sqlite3_vfs>?, CPointer<ByteVar>?, CPointer<sqlite3_file>?, Int, CPointer<IntVar>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vfs>?, CPointer<ByteVar>?, CPointer<sqlite3_file>?, Int, CPointer<IntVar>?) -> Int>>>(40).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vfs>?, CPointer<ByteVar>?, CPointer<sqlite3_file>?, Int, CPointer<IntVar>?) -> Int>>>(40).value = value }
    
    var xDelete: CPointer<CFunction<(CPointer<sqlite3_vfs>?, CPointer<ByteVar>?, Int) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vfs>?, CPointer<ByteVar>?, Int) -> Int>>>(48).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vfs>?, CPointer<ByteVar>?, Int) -> Int>>>(48).value = value }
    
    var xAccess: CPointer<CFunction<(CPointer<sqlite3_vfs>?, CPointer<ByteVar>?, Int, CPointer<IntVar>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vfs>?, CPointer<ByteVar>?, Int, CPointer<IntVar>?) -> Int>>>(56).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vfs>?, CPointer<ByteVar>?, Int, CPointer<IntVar>?) -> Int>>>(56).value = value }
    
    var xFullPathname: CPointer<CFunction<(CPointer<sqlite3_vfs>?, CPointer<ByteVar>?, Int, CPointer<ByteVar>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vfs>?, CPointer<ByteVar>?, Int, CPointer<ByteVar>?) -> Int>>>(64).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vfs>?, CPointer<ByteVar>?, Int, CPointer<ByteVar>?) -> Int>>>(64).value = value }
    
    var xDlOpen: CPointer<CFunction<(CPointer<sqlite3_vfs>?, CPointer<ByteVar>?) -> COpaquePointer?>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vfs>?, CPointer<ByteVar>?) -> COpaquePointer?>>>(72).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vfs>?, CPointer<ByteVar>?) -> COpaquePointer?>>>(72).value = value }
    
    var xDlError: CPointer<CFunction<(CPointer<sqlite3_vfs>?, Int, CPointer<ByteVar>?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vfs>?, Int, CPointer<ByteVar>?) -> Unit>>>(80).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vfs>?, Int, CPointer<ByteVar>?) -> Unit>>>(80).value = value }
    
    var xDlSym: CPointer<CFunction<(CPointer<sqlite3_vfs>?, COpaquePointer?, CPointer<ByteVar>?) -> CPointer<CFunction<() -> Unit>>?>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vfs>?, COpaquePointer?, CPointer<ByteVar>?) -> CPointer<CFunction<() -> Unit>>?>>>(88).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vfs>?, COpaquePointer?, CPointer<ByteVar>?) -> CPointer<CFunction<() -> Unit>>?>>>(88).value = value }
    
    var xDlClose: CPointer<CFunction<(CPointer<sqlite3_vfs>?, COpaquePointer?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vfs>?, COpaquePointer?) -> Unit>>>(96).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vfs>?, COpaquePointer?) -> Unit>>>(96).value = value }
    
    var xRandomness: CPointer<CFunction<(CPointer<sqlite3_vfs>?, Int, CPointer<ByteVar>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vfs>?, Int, CPointer<ByteVar>?) -> Int>>>(104).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vfs>?, Int, CPointer<ByteVar>?) -> Int>>>(104).value = value }
    
    var xSleep: CPointer<CFunction<(CPointer<sqlite3_vfs>?, Int) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vfs>?, Int) -> Int>>>(112).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vfs>?, Int) -> Int>>>(112).value = value }
    
    var xCurrentTime: CPointer<CFunction<(CPointer<sqlite3_vfs>?, CPointer<DoubleVar>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vfs>?, CPointer<DoubleVar>?) -> Int>>>(120).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vfs>?, CPointer<DoubleVar>?) -> Int>>>(120).value = value }
    
    var xGetLastError: CPointer<CFunction<(CPointer<sqlite3_vfs>?, Int, CPointer<ByteVar>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vfs>?, Int, CPointer<ByteVar>?) -> Int>>>(128).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vfs>?, Int, CPointer<ByteVar>?) -> Int>>>(128).value = value }
    
    var xCurrentTimeInt64: CPointer<CFunction<(CPointer<sqlite3_vfs>?, CPointer<sqlite3_int64Var>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vfs>?, CPointer<sqlite3_int64Var>?) -> Int>>>(136).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vfs>?, CPointer<sqlite3_int64Var>?) -> Int>>>(136).value = value }
    
    var xSetSystemCall: CPointer<CFunction<(CPointer<sqlite3_vfs>?, CPointer<ByteVar>?, sqlite3_syscall_ptr?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vfs>?, CPointer<ByteVar>?, sqlite3_syscall_ptr?) -> Int>>>(144).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vfs>?, CPointer<ByteVar>?, sqlite3_syscall_ptr?) -> Int>>>(144).value = value }
    
    var xGetSystemCall: CPointer<CFunction<(CPointer<sqlite3_vfs>?, CPointer<ByteVar>?) -> sqlite3_syscall_ptr?>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vfs>?, CPointer<ByteVar>?) -> sqlite3_syscall_ptr?>>>(152).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vfs>?, CPointer<ByteVar>?) -> sqlite3_syscall_ptr?>>>(152).value = value }
    
    var xNextSystemCall: CPointer<CFunction<(CPointer<sqlite3_vfs>?, CPointer<ByteVar>?) -> CPointer<ByteVar>?>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vfs>?, CPointer<ByteVar>?) -> CPointer<ByteVar>?>>>(160).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vfs>?, CPointer<ByteVar>?) -> CPointer<ByteVar>?>>>(160).value = value }
}

@CStruct("struct { void* p0; }")
class sqlite3_file(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(8, 8)
    
    var pMethods: CPointer<sqlite3_io_methods>?
        get() = memberAt<CPointerVar<sqlite3_io_methods>>(0).value
        set(value) { memberAt<CPointerVar<sqlite3_io_methods>>(0).value = value }
}

@CStruct("struct { int p0; void* p1; void* p2; void* p3; void* p4; void* p5; void* p6; void* p7; void* p8; void* p9; void* p10; void* p11; void* p12; void* p13; void* p14; void* p15; void* p16; void* p17; void* p18; }")
class sqlite3_io_methods(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(152, 8)
    
    var iVersion: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var xClose: CPointer<CFunction<(CPointer<sqlite3_file>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_file>?) -> Int>>>(8).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_file>?) -> Int>>>(8).value = value }
    
    var xRead: CPointer<CFunction<(CPointer<sqlite3_file>?, COpaquePointer?, Int, sqlite3_int64) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_file>?, COpaquePointer?, Int, sqlite3_int64) -> Int>>>(16).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_file>?, COpaquePointer?, Int, sqlite3_int64) -> Int>>>(16).value = value }
    
    var xWrite: CPointer<CFunction<(CPointer<sqlite3_file>?, COpaquePointer?, Int, sqlite3_int64) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_file>?, COpaquePointer?, Int, sqlite3_int64) -> Int>>>(24).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_file>?, COpaquePointer?, Int, sqlite3_int64) -> Int>>>(24).value = value }
    
    var xTruncate: CPointer<CFunction<(CPointer<sqlite3_file>?, sqlite3_int64) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_file>?, sqlite3_int64) -> Int>>>(32).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_file>?, sqlite3_int64) -> Int>>>(32).value = value }
    
    var xSync: CPointer<CFunction<(CPointer<sqlite3_file>?, Int) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_file>?, Int) -> Int>>>(40).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_file>?, Int) -> Int>>>(40).value = value }
    
    var xFileSize: CPointer<CFunction<(CPointer<sqlite3_file>?, CPointer<sqlite3_int64Var>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_file>?, CPointer<sqlite3_int64Var>?) -> Int>>>(48).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_file>?, CPointer<sqlite3_int64Var>?) -> Int>>>(48).value = value }
    
    var xLock: CPointer<CFunction<(CPointer<sqlite3_file>?, Int) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_file>?, Int) -> Int>>>(56).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_file>?, Int) -> Int>>>(56).value = value }
    
    var xUnlock: CPointer<CFunction<(CPointer<sqlite3_file>?, Int) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_file>?, Int) -> Int>>>(64).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_file>?, Int) -> Int>>>(64).value = value }
    
    var xCheckReservedLock: CPointer<CFunction<(CPointer<sqlite3_file>?, CPointer<IntVar>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_file>?, CPointer<IntVar>?) -> Int>>>(72).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_file>?, CPointer<IntVar>?) -> Int>>>(72).value = value }
    
    var xFileControl: CPointer<CFunction<(CPointer<sqlite3_file>?, Int, COpaquePointer?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_file>?, Int, COpaquePointer?) -> Int>>>(80).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_file>?, Int, COpaquePointer?) -> Int>>>(80).value = value }
    
    var xSectorSize: CPointer<CFunction<(CPointer<sqlite3_file>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_file>?) -> Int>>>(88).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_file>?) -> Int>>>(88).value = value }
    
    var xDeviceCharacteristics: CPointer<CFunction<(CPointer<sqlite3_file>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_file>?) -> Int>>>(96).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_file>?) -> Int>>>(96).value = value }
    
    var xShmMap: CPointer<CFunction<(CPointer<sqlite3_file>?, Int, Int, Int, CPointer<COpaquePointerVar>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_file>?, Int, Int, Int, CPointer<COpaquePointerVar>?) -> Int>>>(104).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_file>?, Int, Int, Int, CPointer<COpaquePointerVar>?) -> Int>>>(104).value = value }
    
    var xShmLock: CPointer<CFunction<(CPointer<sqlite3_file>?, Int, Int, Int) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_file>?, Int, Int, Int) -> Int>>>(112).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_file>?, Int, Int, Int) -> Int>>>(112).value = value }
    
    var xShmBarrier: CPointer<CFunction<(CPointer<sqlite3_file>?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_file>?) -> Unit>>>(120).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_file>?) -> Unit>>>(120).value = value }
    
    var xShmUnmap: CPointer<CFunction<(CPointer<sqlite3_file>?, Int) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_file>?, Int) -> Int>>>(128).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_file>?, Int) -> Int>>>(128).value = value }
    
    var xFetch: CPointer<CFunction<(CPointer<sqlite3_file>?, sqlite3_int64, Int, CPointer<COpaquePointerVar>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_file>?, sqlite3_int64, Int, CPointer<COpaquePointerVar>?) -> Int>>>(136).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_file>?, sqlite3_int64, Int, CPointer<COpaquePointerVar>?) -> Int>>>(136).value = value }
    
    var xUnfetch: CPointer<CFunction<(CPointer<sqlite3_file>?, sqlite3_int64, COpaquePointer?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_file>?, sqlite3_int64, COpaquePointer?) -> Int>>>(144).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_file>?, sqlite3_int64, COpaquePointer?) -> Int>>>(144).value = value }
}

class Vdbe(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(296, 8)
    
    var db: CPointer<sqlite3>?
        get() = memberAt<CPointerVar<sqlite3>>(0).value
        set(value) { memberAt<CPointerVar<sqlite3>>(0).value = value }
    
    var pPrev: CPointer<Vdbe>?
        get() = memberAt<CPointerVar<Vdbe>>(8).value
        set(value) { memberAt<CPointerVar<Vdbe>>(8).value = value }
    
    var pNext: CPointer<Vdbe>?
        get() = memberAt<CPointerVar<Vdbe>>(16).value
        set(value) { memberAt<CPointerVar<Vdbe>>(16).value = value }
    
    var pParse: CPointer<Parse>?
        get() = memberAt<CPointerVar<Parse>>(24).value
        set(value) { memberAt<CPointerVar<Parse>>(24).value = value }
    
    var nVar: ynVar
        get() = memberAt<ynVarVar>(32).value
        set(value) { memberAt<ynVarVar>(32).value = value }
    
    var magic: u32
        get() = memberAt<u32Var>(36).value
        set(value) { memberAt<u32Var>(36).value = value }
    
    var nMem: Int
        get() = memberAt<IntVar>(40).value
        set(value) { memberAt<IntVar>(40).value = value }
    
    var nCursor: Int
        get() = memberAt<IntVar>(44).value
        set(value) { memberAt<IntVar>(44).value = value }
    
    var cacheCtr: u32
        get() = memberAt<u32Var>(48).value
        set(value) { memberAt<u32Var>(48).value = value }
    
    var pc: Int
        get() = memberAt<IntVar>(52).value
        set(value) { memberAt<IntVar>(52).value = value }
    
    var rc: Int
        get() = memberAt<IntVar>(56).value
        set(value) { memberAt<IntVar>(56).value = value }
    
    var nChange: Int
        get() = memberAt<IntVar>(60).value
        set(value) { memberAt<IntVar>(60).value = value }
    
    var iStatement: Int
        get() = memberAt<IntVar>(64).value
        set(value) { memberAt<IntVar>(64).value = value }
    
    var iCurrentTime: i64
        get() = memberAt<i64Var>(72).value
        set(value) { memberAt<i64Var>(72).value = value }
    
    var nFkConstraint: i64
        get() = memberAt<i64Var>(80).value
        set(value) { memberAt<i64Var>(80).value = value }
    
    var nStmtDefCons: i64
        get() = memberAt<i64Var>(88).value
        set(value) { memberAt<i64Var>(88).value = value }
    
    var nStmtDefImmCons: i64
        get() = memberAt<i64Var>(96).value
        set(value) { memberAt<i64Var>(96).value = value }
    
    var aMem: CPointer<Mem>?
        get() = memberAt<CPointerVar<Mem>>(104).value
        set(value) { memberAt<CPointerVar<Mem>>(104).value = value }
    
    var apArg: CPointer<CPointerVar<Mem>>?
        get() = memberAt<CPointerVar<CPointerVar<Mem>>>(112).value
        set(value) { memberAt<CPointerVar<CPointerVar<Mem>>>(112).value = value }
    
    var apCsr: CPointer<CPointerVar<VdbeCursor>>?
        get() = memberAt<CPointerVar<CPointerVar<VdbeCursor>>>(120).value
        set(value) { memberAt<CPointerVar<CPointerVar<VdbeCursor>>>(120).value = value }
    
    var aVar: CPointer<Mem>?
        get() = memberAt<CPointerVar<Mem>>(128).value
        set(value) { memberAt<CPointerVar<Mem>>(128).value = value }
    
    var aOp: CPointer<Op>?
        get() = memberAt<CPointerVar<Op>>(136).value
        set(value) { memberAt<CPointerVar<Op>>(136).value = value }
    
    var nOp: Int
        get() = memberAt<IntVar>(144).value
        set(value) { memberAt<IntVar>(144).value = value }
    
    var nOpAlloc: Int
        get() = memberAt<IntVar>(148).value
        set(value) { memberAt<IntVar>(148).value = value }
    
    var aColName: CPointer<Mem>?
        get() = memberAt<CPointerVar<Mem>>(152).value
        set(value) { memberAt<CPointerVar<Mem>>(152).value = value }
    
    var pResultSet: CPointer<Mem>?
        get() = memberAt<CPointerVar<Mem>>(160).value
        set(value) { memberAt<CPointerVar<Mem>>(160).value = value }
    
    var zErrMsg: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(168).value
        set(value) { memberAt<CPointerVar<ByteVar>>(168).value = value }
    
    var pVList: CPointer<VListVar>?
        get() = memberAt<CPointerVar<VListVar>>(176).value
        set(value) { memberAt<CPointerVar<VListVar>>(176).value = value }
    
    var startTime: i64
        get() = memberAt<i64Var>(184).value
        set(value) { memberAt<i64Var>(184).value = value }
    
    var nResColumn: u16
        get() = memberAt<u16Var>(192).value
        set(value) { memberAt<u16Var>(192).value = value }
    
    var errorAction: u8
        get() = memberAt<u8Var>(194).value
        set(value) { memberAt<u8Var>(194).value = value }
    
    var minWriteFileFormat: u8
        get() = memberAt<u8Var>(195).value
        set(value) { memberAt<u8Var>(195).value = value }
    
    var prepFlags: u8
        get() = memberAt<u8Var>(196).value
        set(value) { memberAt<u8Var>(196).value = value }
    
    var btreeMask: yDbMask
        get() = memberAt<yDbMaskVar>(200).value
        set(value) { memberAt<yDbMaskVar>(200).value = value }
    
    var lockMask: yDbMask
        get() = memberAt<yDbMaskVar>(204).value
        set(value) { memberAt<yDbMaskVar>(204).value = value }
    
    val aCounter: CArrayPointer<u32Var>
        get() = arrayMemberAt(208)
    
    var zSql: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(240).value
        set(value) { memberAt<CPointerVar<ByteVar>>(240).value = value }
    
    var pFree: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(248).value
        set(value) { memberAt<COpaquePointerVar>(248).value = value }
    
    var pFrame: CPointer<VdbeFrame>?
        get() = memberAt<CPointerVar<VdbeFrame>>(256).value
        set(value) { memberAt<CPointerVar<VdbeFrame>>(256).value = value }
    
    var pDelFrame: CPointer<VdbeFrame>?
        get() = memberAt<CPointerVar<VdbeFrame>>(264).value
        set(value) { memberAt<CPointerVar<VdbeFrame>>(264).value = value }
    
    var nFrame: Int
        get() = memberAt<IntVar>(272).value
        set(value) { memberAt<IntVar>(272).value = value }
    
    var expmask: u32
        get() = memberAt<u32Var>(276).value
        set(value) { memberAt<u32Var>(276).value = value }
    
    var pProgram: CPointer<SubProgram>?
        get() = memberAt<CPointerVar<SubProgram>>(280).value
        set(value) { memberAt<CPointerVar<SubProgram>>(280).value = value }
    
    var pAuxData: CPointer<AuxData>?
        get() = memberAt<CPointerVar<AuxData>>(288).value
        set(value) { memberAt<CPointerVar<AuxData>>(288).value = value }
    
    var expired: bft
        get() = readBits(this.rawPtr, 1576, 2, false).toUInt()
        set(value) { writeBits(this.rawPtr, 1576, 2, value.toLong()) }
    
    var explain: bft
        get() = readBits(this.rawPtr, 1578, 2, false).toUInt()
        set(value) { writeBits(this.rawPtr, 1578, 2, value.toLong()) }
    
    var doingRerun: bft
        get() = readBits(this.rawPtr, 1580, 1, false).toUInt()
        set(value) { writeBits(this.rawPtr, 1580, 1, value.toLong()) }
    
    var changeCntOn: bft
        get() = readBits(this.rawPtr, 1581, 1, false).toUInt()
        set(value) { writeBits(this.rawPtr, 1581, 1, value.toLong()) }
    
    var runOnlyOnce: bft
        get() = readBits(this.rawPtr, 1582, 1, false).toUInt()
        set(value) { writeBits(this.rawPtr, 1582, 1, value.toLong()) }
    
    var usesStmtJournal: bft
        get() = readBits(this.rawPtr, 1583, 1, false).toUInt()
        set(value) { writeBits(this.rawPtr, 1583, 1, value.toLong()) }
    
    var readOnly: bft
        get() = readBits(this.rawPtr, 1584, 1, false).toUInt()
        set(value) { writeBits(this.rawPtr, 1584, 1, value.toLong()) }
    
    var bIsReader: bft
        get() = readBits(this.rawPtr, 1585, 1, false).toUInt()
        set(value) { writeBits(this.rawPtr, 1585, 1, value.toLong()) }
}

@CStruct("struct { void* p0; void* p1; void* p2; int p3; unsigned char p4; unsigned char p5; unsigned char p6; unsigned char p7; unsigned char p8; unsigned char p9; unsigned char p10; unsigned char p11; unsigned char p12; unsigned char p13; int p14; int p15; int p16; int p17; int p18; int p19; int p20; int p21; int p22; void* p23; void* p24; struct { void* p0; unsigned int p1; } p25; unsigned int p26; unsigned int p27; int p28; int p29; int p30; int p31; int p32; void* p33; void* p34; void* p35; void* p36; int p37; unsigned int p38; unsigned int p39; unsigned int p40; unsigned char p41; unsigned char p42; unsigned char p43; int p44[8]; struct { void* p0; unsigned int p1; } p45; struct { void* p0; unsigned int p1; } p46; short p47; unsigned char p48; unsigned char p49; unsigned char p50; int p51; int p52; int p53; void* p54; void* p55; void* p56; void* p57; void* p58; void* p59; void* p60; struct { void* p0; unsigned int p1; } p61; void* p62; void* p63; void* p64; void* p65; void* p66; void* p67; }")
class Parse(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(408, 8)
    
    var db: CPointer<sqlite3>?
        get() = memberAt<CPointerVar<sqlite3>>(0).value
        set(value) { memberAt<CPointerVar<sqlite3>>(0).value = value }
    
    var zErrMsg: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(8).value
        set(value) { memberAt<CPointerVar<ByteVar>>(8).value = value }
    
    var pVdbe: CPointer<Vdbe>?
        get() = memberAt<CPointerVar<Vdbe>>(16).value
        set(value) { memberAt<CPointerVar<Vdbe>>(16).value = value }
    
    var rc: Int
        get() = memberAt<IntVar>(24).value
        set(value) { memberAt<IntVar>(24).value = value }
    
    var colNamesSet: u8
        get() = memberAt<u8Var>(28).value
        set(value) { memberAt<u8Var>(28).value = value }
    
    var checkSchema: u8
        get() = memberAt<u8Var>(29).value
        set(value) { memberAt<u8Var>(29).value = value }
    
    var nested: u8
        get() = memberAt<u8Var>(30).value
        set(value) { memberAt<u8Var>(30).value = value }
    
    var nTempReg: u8
        get() = memberAt<u8Var>(31).value
        set(value) { memberAt<u8Var>(31).value = value }
    
    var isMultiWrite: u8
        get() = memberAt<u8Var>(32).value
        set(value) { memberAt<u8Var>(32).value = value }
    
    var mayAbort: u8
        get() = memberAt<u8Var>(33).value
        set(value) { memberAt<u8Var>(33).value = value }
    
    var hasCompound: u8
        get() = memberAt<u8Var>(34).value
        set(value) { memberAt<u8Var>(34).value = value }
    
    var okConstFactor: u8
        get() = memberAt<u8Var>(35).value
        set(value) { memberAt<u8Var>(35).value = value }
    
    var disableLookaside: u8
        get() = memberAt<u8Var>(36).value
        set(value) { memberAt<u8Var>(36).value = value }
    
    var disableVtab: u8
        get() = memberAt<u8Var>(37).value
        set(value) { memberAt<u8Var>(37).value = value }
    
    var nRangeReg: Int
        get() = memberAt<IntVar>(40).value
        set(value) { memberAt<IntVar>(40).value = value }
    
    var iRangeReg: Int
        get() = memberAt<IntVar>(44).value
        set(value) { memberAt<IntVar>(44).value = value }
    
    var nErr: Int
        get() = memberAt<IntVar>(48).value
        set(value) { memberAt<IntVar>(48).value = value }
    
    var nTab: Int
        get() = memberAt<IntVar>(52).value
        set(value) { memberAt<IntVar>(52).value = value }
    
    var nMem: Int
        get() = memberAt<IntVar>(56).value
        set(value) { memberAt<IntVar>(56).value = value }
    
    var szOpAlloc: Int
        get() = memberAt<IntVar>(60).value
        set(value) { memberAt<IntVar>(60).value = value }
    
    var iSelfTab: Int
        get() = memberAt<IntVar>(64).value
        set(value) { memberAt<IntVar>(64).value = value }
    
    var nLabel: Int
        get() = memberAt<IntVar>(68).value
        set(value) { memberAt<IntVar>(68).value = value }
    
    var nLabelAlloc: Int
        get() = memberAt<IntVar>(72).value
        set(value) { memberAt<IntVar>(72).value = value }
    
    var aLabel: CPointer<IntVar>?
        get() = memberAt<CPointerVar<IntVar>>(80).value
        set(value) { memberAt<CPointerVar<IntVar>>(80).value = value }
    
    var pConstExpr: CPointer<ExprList>?
        get() = memberAt<CPointerVar<ExprList>>(88).value
        set(value) { memberAt<CPointerVar<ExprList>>(88).value = value }
    
    val constraintName: Token
        get() = memberAt(96)
    
    var writeMask: yDbMask
        get() = memberAt<yDbMaskVar>(112).value
        set(value) { memberAt<yDbMaskVar>(112).value = value }
    
    var cookieMask: yDbMask
        get() = memberAt<yDbMaskVar>(116).value
        set(value) { memberAt<yDbMaskVar>(116).value = value }
    
    var regRowid: Int
        get() = memberAt<IntVar>(120).value
        set(value) { memberAt<IntVar>(120).value = value }
    
    var regRoot: Int
        get() = memberAt<IntVar>(124).value
        set(value) { memberAt<IntVar>(124).value = value }
    
    var nMaxArg: Int
        get() = memberAt<IntVar>(128).value
        set(value) { memberAt<IntVar>(128).value = value }
    
    var nSelect: Int
        get() = memberAt<IntVar>(132).value
        set(value) { memberAt<IntVar>(132).value = value }
    
    var nTableLock: Int
        get() = memberAt<IntVar>(136).value
        set(value) { memberAt<IntVar>(136).value = value }
    
    var aTableLock: CPointer<TableLock>?
        get() = memberAt<CPointerVar<TableLock>>(144).value
        set(value) { memberAt<CPointerVar<TableLock>>(144).value = value }
    
    var pAinc: CPointer<AutoincInfo>?
        get() = memberAt<CPointerVar<AutoincInfo>>(152).value
        set(value) { memberAt<CPointerVar<AutoincInfo>>(152).value = value }
    
    var pToplevel: CPointer<Parse>?
        get() = memberAt<CPointerVar<Parse>>(160).value
        set(value) { memberAt<CPointerVar<Parse>>(160).value = value }
    
    var pTriggerTab: CPointer<Table>?
        get() = memberAt<CPointerVar<Table>>(168).value
        set(value) { memberAt<CPointerVar<Table>>(168).value = value }
    
    var addrCrTab: Int
        get() = memberAt<IntVar>(176).value
        set(value) { memberAt<IntVar>(176).value = value }
    
    var nQueryLoop: u32
        get() = memberAt<u32Var>(180).value
        set(value) { memberAt<u32Var>(180).value = value }
    
    var oldmask: u32
        get() = memberAt<u32Var>(184).value
        set(value) { memberAt<u32Var>(184).value = value }
    
    var newmask: u32
        get() = memberAt<u32Var>(188).value
        set(value) { memberAt<u32Var>(188).value = value }
    
    var eTriggerOp: u8
        get() = memberAt<u8Var>(192).value
        set(value) { memberAt<u8Var>(192).value = value }
    
    var eOrconf: u8
        get() = memberAt<u8Var>(193).value
        set(value) { memberAt<u8Var>(193).value = value }
    
    var disableTriggers: u8
        get() = memberAt<u8Var>(194).value
        set(value) { memberAt<u8Var>(194).value = value }
    
    val aTempReg: CArrayPointer<IntVar>
        get() = arrayMemberAt(196)
    
    val sNameToken: Token
        get() = memberAt(232)
    
    val sLastToken: Token
        get() = memberAt(248)
    
    var nVar: ynVar
        get() = memberAt<ynVarVar>(264).value
        set(value) { memberAt<ynVarVar>(264).value = value }
    
    var iPkSortOrder: u8
        get() = memberAt<u8Var>(266).value
        set(value) { memberAt<u8Var>(266).value = value }
    
    var explain: u8
        get() = memberAt<u8Var>(267).value
        set(value) { memberAt<u8Var>(267).value = value }
    
    var eParseMode: u8
        get() = memberAt<u8Var>(268).value
        set(value) { memberAt<u8Var>(268).value = value }
    
    var nVtabLock: Int
        get() = memberAt<IntVar>(272).value
        set(value) { memberAt<IntVar>(272).value = value }
    
    var nHeight: Int
        get() = memberAt<IntVar>(276).value
        set(value) { memberAt<IntVar>(276).value = value }
    
    var addrExplain: Int
        get() = memberAt<IntVar>(280).value
        set(value) { memberAt<IntVar>(280).value = value }
    
    var pVList: CPointer<VListVar>?
        get() = memberAt<CPointerVar<VListVar>>(288).value
        set(value) { memberAt<CPointerVar<VListVar>>(288).value = value }
    
    var pReprepare: CPointer<Vdbe>?
        get() = memberAt<CPointerVar<Vdbe>>(296).value
        set(value) { memberAt<CPointerVar<Vdbe>>(296).value = value }
    
    var zTail: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(304).value
        set(value) { memberAt<CPointerVar<ByteVar>>(304).value = value }
    
    var pNewTable: CPointer<Table>?
        get() = memberAt<CPointerVar<Table>>(312).value
        set(value) { memberAt<CPointerVar<Table>>(312).value = value }
    
    var pNewIndex: CPointer<Index>?
        get() = memberAt<CPointerVar<Index>>(320).value
        set(value) { memberAt<CPointerVar<Index>>(320).value = value }
    
    var pNewTrigger: CPointer<Trigger>?
        get() = memberAt<CPointerVar<Trigger>>(328).value
        set(value) { memberAt<CPointerVar<Trigger>>(328).value = value }
    
    var zAuthContext: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(336).value
        set(value) { memberAt<CPointerVar<ByteVar>>(336).value = value }
    
    val sArg: Token
        get() = memberAt(344)
    
    var apVtabLock: CPointer<CPointerVar<Table>>?
        get() = memberAt<CPointerVar<CPointerVar<Table>>>(360).value
        set(value) { memberAt<CPointerVar<CPointerVar<Table>>>(360).value = value }
    
    var pZombieTab: CPointer<Table>?
        get() = memberAt<CPointerVar<Table>>(368).value
        set(value) { memberAt<CPointerVar<Table>>(368).value = value }
    
    var pTriggerPrg: CPointer<TriggerPrg>?
        get() = memberAt<CPointerVar<TriggerPrg>>(376).value
        set(value) { memberAt<CPointerVar<TriggerPrg>>(376).value = value }
    
    var pWith: CPointer<With>?
        get() = memberAt<CPointerVar<With>>(384).value
        set(value) { memberAt<CPointerVar<With>>(384).value = value }
    
    var pWithToFree: CPointer<With>?
        get() = memberAt<CPointerVar<With>>(392).value
        set(value) { memberAt<CPointerVar<With>>(392).value = value }
    
    var pRename: CPointer<RenameToken>?
        get() = memberAt<CPointerVar<RenameToken>>(400).value
        set(value) { memberAt<CPointerVar<RenameToken>>(400).value = value }
}

@CStruct("struct { int p0; null p1[1]; }")
class ExprList(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(40, 8)
    
    var nExpr: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    val a: CArrayPointer<ExprList_item>
        get() = arrayMemberAt(8)
}

class ExprList_item(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(32, 8)
    
    var pExpr: CPointer<Expr>?
        get() = memberAt<CPointerVar<Expr>>(0).value
        set(value) { memberAt<CPointerVar<Expr>>(0).value = value }
    
    var zName: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(8).value
        set(value) { memberAt<CPointerVar<ByteVar>>(8).value = value }
    
    var zSpan: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(16).value
        set(value) { memberAt<CPointerVar<ByteVar>>(16).value = value }
    
    var sortOrder: u8
        get() = memberAt<u8Var>(24).value
        set(value) { memberAt<u8Var>(24).value = value }
    
    val u: anonymousStruct2
        get() = memberAt(28)
    
    var done: UInt
        get() = readBits(this.rawPtr, 200, 1, false).toUInt()
        set(value) { writeBits(this.rawPtr, 200, 1, value.toLong()) }
    
    var bSpanIsTab: UInt
        get() = readBits(this.rawPtr, 201, 1, false).toUInt()
        set(value) { writeBits(this.rawPtr, 201, 1, value.toLong()) }
    
    var reusable: UInt
        get() = readBits(this.rawPtr, 202, 1, false).toUInt()
        set(value) { writeBits(this.rawPtr, 202, 1, value.toLong()) }
    
    var bSorterRef: UInt
        get() = readBits(this.rawPtr, 203, 1, false).toUInt()
        set(value) { writeBits(this.rawPtr, 203, 1, value.toLong()) }
}

@CStruct("struct { unsigned char p0; char p1; unsigned int p2; union { void* p0; int p1; } p3; void* p4; void* p5; union { void* p0; void* p1; } p6; int p7; int p8; short p9; short p10; short p11; unsigned char p12; void* p13; union { void* p0; void* p1; struct { int p0; int p1; } p2; } p14; }")
class Expr(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(72, 8)
    
    var op: u8
        get() = memberAt<u8Var>(0).value
        set(value) { memberAt<u8Var>(0).value = value }
    
    var affinity: Byte
        get() = memberAt<ByteVar>(1).value
        set(value) { memberAt<ByteVar>(1).value = value }
    
    var flags: u32
        get() = memberAt<u32Var>(4).value
        set(value) { memberAt<u32Var>(4).value = value }
    
    val u: anonymousStruct3
        get() = memberAt(8)
    
    var pLeft: CPointer<Expr>?
        get() = memberAt<CPointerVar<Expr>>(16).value
        set(value) { memberAt<CPointerVar<Expr>>(16).value = value }
    
    var pRight: CPointer<Expr>?
        get() = memberAt<CPointerVar<Expr>>(24).value
        set(value) { memberAt<CPointerVar<Expr>>(24).value = value }
    
    val x: anonymousStruct4
        get() = memberAt(32)
    
    var nHeight: Int
        get() = memberAt<IntVar>(40).value
        set(value) { memberAt<IntVar>(40).value = value }
    
    var iTable: Int
        get() = memberAt<IntVar>(44).value
        set(value) { memberAt<IntVar>(44).value = value }
    
    var iColumn: ynVar
        get() = memberAt<ynVarVar>(48).value
        set(value) { memberAt<ynVarVar>(48).value = value }
    
    var iAgg: i16
        get() = memberAt<i16Var>(50).value
        set(value) { memberAt<i16Var>(50).value = value }
    
    var iRightJoinTable: i16
        get() = memberAt<i16Var>(52).value
        set(value) { memberAt<i16Var>(52).value = value }
    
    var op2: u8
        get() = memberAt<u8Var>(54).value
        set(value) { memberAt<u8Var>(54).value = value }
    
    var pAggInfo: CPointer<AggInfo>?
        get() = memberAt<CPointerVar<AggInfo>>(56).value
        set(value) { memberAt<CPointerVar<AggInfo>>(56).value = value }
    
    val y: anonymousStruct5
        get() = memberAt(64)
}

@CStruct("union { void* p0; int p1; }")
class anonymousStruct3(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(8, 8)
    
    var zToken: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(0).value
        set(value) { memberAt<CPointerVar<ByteVar>>(0).value = value }
    
    var iValue: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
}

@CStruct("union { void* p0; void* p1; }")
class anonymousStruct4(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(8, 8)
    
    var pList: CPointer<ExprList>?
        get() = memberAt<CPointerVar<ExprList>>(0).value
        set(value) { memberAt<CPointerVar<ExprList>>(0).value = value }
    
    var pSelect: CPointer<Select>?
        get() = memberAt<CPointerVar<Select>>(0).value
        set(value) { memberAt<CPointerVar<Select>>(0).value = value }
}

@CStruct("struct { void* p0; unsigned char p1; short p2; unsigned int p3; int p4; int p5; unsigned int p6; int p7[2]; void* p8; void* p9; void* p10; void* p11; void* p12; void* p13; void* p14; void* p15; void* p16; void* p17; void* p18; }")
class Select(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(128, 8)
    
    var pEList: CPointer<ExprList>?
        get() = memberAt<CPointerVar<ExprList>>(0).value
        set(value) { memberAt<CPointerVar<ExprList>>(0).value = value }
    
    var op: u8
        get() = memberAt<u8Var>(8).value
        set(value) { memberAt<u8Var>(8).value = value }
    
    var nSelectRow: LogEst
        get() = memberAt<LogEstVar>(10).value
        set(value) { memberAt<LogEstVar>(10).value = value }
    
    var selFlags: u32
        get() = memberAt<u32Var>(12).value
        set(value) { memberAt<u32Var>(12).value = value }
    
    var iLimit: Int
        get() = memberAt<IntVar>(16).value
        set(value) { memberAt<IntVar>(16).value = value }
    
    var iOffset: Int
        get() = memberAt<IntVar>(20).value
        set(value) { memberAt<IntVar>(20).value = value }
    
    var selId: u32
        get() = memberAt<u32Var>(24).value
        set(value) { memberAt<u32Var>(24).value = value }
    
    val addrOpenEphm: CArrayPointer<IntVar>
        get() = arrayMemberAt(28)
    
    var pSrc: CPointer<SrcList>?
        get() = memberAt<CPointerVar<SrcList>>(40).value
        set(value) { memberAt<CPointerVar<SrcList>>(40).value = value }
    
    var pWhere: CPointer<Expr>?
        get() = memberAt<CPointerVar<Expr>>(48).value
        set(value) { memberAt<CPointerVar<Expr>>(48).value = value }
    
    var pGroupBy: CPointer<ExprList>?
        get() = memberAt<CPointerVar<ExprList>>(56).value
        set(value) { memberAt<CPointerVar<ExprList>>(56).value = value }
    
    var pHaving: CPointer<Expr>?
        get() = memberAt<CPointerVar<Expr>>(64).value
        set(value) { memberAt<CPointerVar<Expr>>(64).value = value }
    
    var pOrderBy: CPointer<ExprList>?
        get() = memberAt<CPointerVar<ExprList>>(72).value
        set(value) { memberAt<CPointerVar<ExprList>>(72).value = value }
    
    var pPrior: CPointer<Select>?
        get() = memberAt<CPointerVar<Select>>(80).value
        set(value) { memberAt<CPointerVar<Select>>(80).value = value }
    
    var pNext: CPointer<Select>?
        get() = memberAt<CPointerVar<Select>>(88).value
        set(value) { memberAt<CPointerVar<Select>>(88).value = value }
    
    var pLimit: CPointer<Expr>?
        get() = memberAt<CPointerVar<Expr>>(96).value
        set(value) { memberAt<CPointerVar<Expr>>(96).value = value }
    
    var pWith: CPointer<With>?
        get() = memberAt<CPointerVar<With>>(104).value
        set(value) { memberAt<CPointerVar<With>>(104).value = value }
    
    var pWin: CPointer<Window>?
        get() = memberAt<CPointerVar<Window>>(112).value
        set(value) { memberAt<CPointerVar<Window>>(112).value = value }
    
    var pWinDefn: CPointer<Window>?
        get() = memberAt<CPointerVar<Window>>(120).value
        set(value) { memberAt<CPointerVar<Window>>(120).value = value }
}

@CStruct("struct { int p0; unsigned int p1; struct { void* p0; void* p1; void* p2; void* p3; void* p4; void* p5; int p6; int p7; int p8; null p9; int p10; void* p11; void* p12; unsigned long long p13; union { void* p0; void* p1; } p14; void* p15; } p2[1]; }")
class SrcList(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(120, 8)
    
    var nSrc: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var nAlloc: u32
        get() = memberAt<u32Var>(4).value
        set(value) { memberAt<u32Var>(4).value = value }
    
    val a: CArrayPointer<SrcList_item>
        get() = arrayMemberAt(8)
}

@CStruct("struct { void* p0; void* p1; void* p2; void* p3; void* p4; void* p5; int p6; int p7; int p8; null p9; int p10; void* p11; void* p12; unsigned long long p13; union { void* p0; void* p1; } p14; void* p15; }")
class SrcList_item(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(112, 8)
    
    var pSchema: CPointer<Schema>?
        get() = memberAt<CPointerVar<Schema>>(0).value
        set(value) { memberAt<CPointerVar<Schema>>(0).value = value }
    
    var zDatabase: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(8).value
        set(value) { memberAt<CPointerVar<ByteVar>>(8).value = value }
    
    var zName: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(16).value
        set(value) { memberAt<CPointerVar<ByteVar>>(16).value = value }
    
    var zAlias: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(24).value
        set(value) { memberAt<CPointerVar<ByteVar>>(24).value = value }
    
    var pTab: CPointer<Table>?
        get() = memberAt<CPointerVar<Table>>(32).value
        set(value) { memberAt<CPointerVar<Table>>(32).value = value }
    
    var pSelect: CPointer<Select>?
        get() = memberAt<CPointerVar<Select>>(40).value
        set(value) { memberAt<CPointerVar<Select>>(40).value = value }
    
    var addrFillSub: Int
        get() = memberAt<IntVar>(48).value
        set(value) { memberAt<IntVar>(48).value = value }
    
    var regReturn: Int
        get() = memberAt<IntVar>(52).value
        set(value) { memberAt<IntVar>(52).value = value }
    
    var regResult: Int
        get() = memberAt<IntVar>(56).value
        set(value) { memberAt<IntVar>(56).value = value }
    
    val fg: anonymousStruct6
        get() = memberAt(60)
    
    var iCursor: Int
        get() = memberAt<IntVar>(64).value
        set(value) { memberAt<IntVar>(64).value = value }
    
    var pOn: CPointer<Expr>?
        get() = memberAt<CPointerVar<Expr>>(72).value
        set(value) { memberAt<CPointerVar<Expr>>(72).value = value }
    
    var pUsing: CPointer<IdList>?
        get() = memberAt<CPointerVar<IdList>>(80).value
        set(value) { memberAt<CPointerVar<IdList>>(80).value = value }
    
    var colUsed: Bitmask
        get() = memberAt<BitmaskVar>(88).value
        set(value) { memberAt<BitmaskVar>(88).value = value }
    
    val u1: anonymousStruct7
        get() = memberAt(96)
    
    var pIBIndex: CPointer<Index>?
        get() = memberAt<CPointerVar<Index>>(104).value
        set(value) { memberAt<CPointerVar<Index>>(104).value = value }
}

@CStruct("struct { int p0; int p1; struct { unsigned int p0; unsigned int p1; void* p2; void* p3; } p2; struct { unsigned int p0; unsigned int p1; void* p2; void* p3; } p3; struct { unsigned int p0; unsigned int p1; void* p2; void* p3; } p4; struct { unsigned int p0; unsigned int p1; void* p2; void* p3; } p5; void* p6; unsigned char p7; unsigned char p8; unsigned short p9; int p10; }")
class Schema(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(120, 8)
    
    var schema_cookie: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var iGeneration: Int
        get() = memberAt<IntVar>(4).value
        set(value) { memberAt<IntVar>(4).value = value }
    
    val tblHash: Hash
        get() = memberAt(8)
    
    val idxHash: Hash
        get() = memberAt(32)
    
    val trigHash: Hash
        get() = memberAt(56)
    
    val fkeyHash: Hash
        get() = memberAt(80)
    
    var pSeqTab: CPointer<Table>?
        get() = memberAt<CPointerVar<Table>>(104).value
        set(value) { memberAt<CPointerVar<Table>>(104).value = value }
    
    var file_format: u8
        get() = memberAt<u8Var>(112).value
        set(value) { memberAt<u8Var>(112).value = value }
    
    var enc: u8
        get() = memberAt<u8Var>(113).value
        set(value) { memberAt<u8Var>(113).value = value }
    
    var schemaFlags: u16
        get() = memberAt<u16Var>(114).value
        set(value) { memberAt<u16Var>(114).value = value }
    
    var cache_size: Int
        get() = memberAt<IntVar>(116).value
        set(value) { memberAt<IntVar>(116).value = value }
}

@CStruct("struct { unsigned int p0; unsigned int p1; void* p2; void* p3; }")
class Hash(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(24, 8)
    
    var htsize: UInt
        get() = memberAt<UIntVar>(0).value
        set(value) { memberAt<UIntVar>(0).value = value }
    
    var count: UInt
        get() = memberAt<UIntVar>(4).value
        set(value) { memberAt<UIntVar>(4).value = value }
    
    var first: CPointer<HashElem>?
        get() = memberAt<CPointerVar<HashElem>>(8).value
        set(value) { memberAt<CPointerVar<HashElem>>(8).value = value }
    
    var ht: CPointer<_ht>?
        get() = memberAt<CPointerVar<_ht>>(16).value
        set(value) { memberAt<CPointerVar<_ht>>(16).value = value }
}

@CStruct("struct { void* p0; void* p1; void* p2; void* p3; }")
class HashElem(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(32, 8)
    
    var next: CPointer<HashElem>?
        get() = memberAt<CPointerVar<HashElem>>(0).value
        set(value) { memberAt<CPointerVar<HashElem>>(0).value = value }
    
    var prev: CPointer<HashElem>?
        get() = memberAt<CPointerVar<HashElem>>(8).value
        set(value) { memberAt<CPointerVar<HashElem>>(8).value = value }
    
    var data: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(16).value
        set(value) { memberAt<COpaquePointerVar>(16).value = value }
    
    var pKey: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(24).value
        set(value) { memberAt<CPointerVar<ByteVar>>(24).value = value }
}

@CStruct("struct { int p0; void* p1; }")
class _ht(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 8)
    
    var count: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var chain: CPointer<HashElem>?
        get() = memberAt<CPointerVar<HashElem>>(8).value
        set(value) { memberAt<CPointerVar<HashElem>>(8).value = value }
}

@CStruct("struct { void* p0; void* p1; void* p2; void* p3; void* p4; void* p5; void* p6; int p7; unsigned int p8; unsigned int p9; short p10; short p11; short p12; short p13; unsigned char p14; int p15; int p16; void* p17; void* p18; void* p19; void* p20; void* p21; }")
class Table(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(128, 8)
    
    var zName: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(0).value
        set(value) { memberAt<CPointerVar<ByteVar>>(0).value = value }
    
    var aCol: CPointer<Column>?
        get() = memberAt<CPointerVar<Column>>(8).value
        set(value) { memberAt<CPointerVar<Column>>(8).value = value }
    
    var pIndex: CPointer<Index>?
        get() = memberAt<CPointerVar<Index>>(16).value
        set(value) { memberAt<CPointerVar<Index>>(16).value = value }
    
    var pSelect: CPointer<Select>?
        get() = memberAt<CPointerVar<Select>>(24).value
        set(value) { memberAt<CPointerVar<Select>>(24).value = value }
    
    var pFKey: CPointer<FKey>?
        get() = memberAt<CPointerVar<FKey>>(32).value
        set(value) { memberAt<CPointerVar<FKey>>(32).value = value }
    
    var zColAff: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(40).value
        set(value) { memberAt<CPointerVar<ByteVar>>(40).value = value }
    
    var pCheck: CPointer<ExprList>?
        get() = memberAt<CPointerVar<ExprList>>(48).value
        set(value) { memberAt<CPointerVar<ExprList>>(48).value = value }
    
    var tnum: Int
        get() = memberAt<IntVar>(56).value
        set(value) { memberAt<IntVar>(56).value = value }
    
    var nTabRef: u32
        get() = memberAt<u32Var>(60).value
        set(value) { memberAt<u32Var>(60).value = value }
    
    var tabFlags: u32
        get() = memberAt<u32Var>(64).value
        set(value) { memberAt<u32Var>(64).value = value }
    
    var iPKey: i16
        get() = memberAt<i16Var>(68).value
        set(value) { memberAt<i16Var>(68).value = value }
    
    var nCol: i16
        get() = memberAt<i16Var>(70).value
        set(value) { memberAt<i16Var>(70).value = value }
    
    var nRowLogEst: LogEst
        get() = memberAt<LogEstVar>(72).value
        set(value) { memberAt<LogEstVar>(72).value = value }
    
    var szTabRow: LogEst
        get() = memberAt<LogEstVar>(74).value
        set(value) { memberAt<LogEstVar>(74).value = value }
    
    var keyConf: u8
        get() = memberAt<u8Var>(76).value
        set(value) { memberAt<u8Var>(76).value = value }
    
    var addColOffset: Int
        get() = memberAt<IntVar>(80).value
        set(value) { memberAt<IntVar>(80).value = value }
    
    var nModuleArg: Int
        get() = memberAt<IntVar>(84).value
        set(value) { memberAt<IntVar>(84).value = value }
    
    var azModuleArg: CPointer<CPointerVar<ByteVar>>?
        get() = memberAt<CPointerVar<CPointerVar<ByteVar>>>(88).value
        set(value) { memberAt<CPointerVar<CPointerVar<ByteVar>>>(88).value = value }
    
    var pVTable: CPointer<VTable>?
        get() = memberAt<CPointerVar<VTable>>(96).value
        set(value) { memberAt<CPointerVar<VTable>>(96).value = value }
    
    var pTrigger: CPointer<Trigger>?
        get() = memberAt<CPointerVar<Trigger>>(104).value
        set(value) { memberAt<CPointerVar<Trigger>>(104).value = value }
    
    var pSchema: CPointer<Schema>?
        get() = memberAt<CPointerVar<Schema>>(112).value
        set(value) { memberAt<CPointerVar<Schema>>(112).value = value }
    
    var pNextZombie: CPointer<Table>?
        get() = memberAt<CPointerVar<Table>>(120).value
        set(value) { memberAt<CPointerVar<Table>>(120).value = value }
}

@CStruct("struct { void* p0; void* p1; void* p2; unsigned char p3; char p4; unsigned char p5; unsigned char p6; }")
class Column(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(32, 8)
    
    var zName: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(0).value
        set(value) { memberAt<CPointerVar<ByteVar>>(0).value = value }
    
    var pDflt: CPointer<Expr>?
        get() = memberAt<CPointerVar<Expr>>(8).value
        set(value) { memberAt<CPointerVar<Expr>>(8).value = value }
    
    var zColl: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(16).value
        set(value) { memberAt<CPointerVar<ByteVar>>(16).value = value }
    
    var notNull: u8
        get() = memberAt<u8Var>(24).value
        set(value) { memberAt<u8Var>(24).value = value }
    
    var affinity: Byte
        get() = memberAt<ByteVar>(25).value
        set(value) { memberAt<ByteVar>(25).value = value }
    
    var szEst: u8
        get() = memberAt<u8Var>(26).value
        set(value) { memberAt<u8Var>(26).value = value }
    
    var colFlags: u8
        get() = memberAt<u8Var>(27).value
        set(value) { memberAt<u8Var>(27).value = value }
}

class Index(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(112, 8)
    
    var zName: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(0).value
        set(value) { memberAt<CPointerVar<ByteVar>>(0).value = value }
    
    var aiColumn: CPointer<i16Var>?
        get() = memberAt<CPointerVar<i16Var>>(8).value
        set(value) { memberAt<CPointerVar<i16Var>>(8).value = value }
    
    var aiRowLogEst: CPointer<LogEstVar>?
        get() = memberAt<CPointerVar<LogEstVar>>(16).value
        set(value) { memberAt<CPointerVar<LogEstVar>>(16).value = value }
    
    var pTable: CPointer<Table>?
        get() = memberAt<CPointerVar<Table>>(24).value
        set(value) { memberAt<CPointerVar<Table>>(24).value = value }
    
    var zColAff: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(32).value
        set(value) { memberAt<CPointerVar<ByteVar>>(32).value = value }
    
    var pNext: CPointer<Index>?
        get() = memberAt<CPointerVar<Index>>(40).value
        set(value) { memberAt<CPointerVar<Index>>(40).value = value }
    
    var pSchema: CPointer<Schema>?
        get() = memberAt<CPointerVar<Schema>>(48).value
        set(value) { memberAt<CPointerVar<Schema>>(48).value = value }
    
    var aSortOrder: CPointer<u8Var>?
        get() = memberAt<CPointerVar<u8Var>>(56).value
        set(value) { memberAt<CPointerVar<u8Var>>(56).value = value }
    
    var azColl: CPointer<CPointerVar<ByteVar>>?
        get() = memberAt<CPointerVar<CPointerVar<ByteVar>>>(64).value
        set(value) { memberAt<CPointerVar<CPointerVar<ByteVar>>>(64).value = value }
    
    var pPartIdxWhere: CPointer<Expr>?
        get() = memberAt<CPointerVar<Expr>>(72).value
        set(value) { memberAt<CPointerVar<Expr>>(72).value = value }
    
    var aColExpr: CPointer<ExprList>?
        get() = memberAt<CPointerVar<ExprList>>(80).value
        set(value) { memberAt<CPointerVar<ExprList>>(80).value = value }
    
    var tnum: Int
        get() = memberAt<IntVar>(88).value
        set(value) { memberAt<IntVar>(88).value = value }
    
    var szIdxRow: LogEst
        get() = memberAt<LogEstVar>(92).value
        set(value) { memberAt<LogEstVar>(92).value = value }
    
    var nKeyCol: u16
        get() = memberAt<u16Var>(94).value
        set(value) { memberAt<u16Var>(94).value = value }
    
    var nColumn: u16
        get() = memberAt<u16Var>(96).value
        set(value) { memberAt<u16Var>(96).value = value }
    
    var onError: u8
        get() = memberAt<u8Var>(98).value
        set(value) { memberAt<u8Var>(98).value = value }
    
    var colNotIdxed: Bitmask
        get() = memberAt<BitmaskVar>(104).value
        set(value) { memberAt<BitmaskVar>(104).value = value }
    
    var idxType: UInt
        get() = readBits(this.rawPtr, 792, 2, false).toUInt()
        set(value) { writeBits(this.rawPtr, 792, 2, value.toLong()) }
    
    var bUnordered: UInt
        get() = readBits(this.rawPtr, 794, 1, false).toUInt()
        set(value) { writeBits(this.rawPtr, 794, 1, value.toLong()) }
    
    var uniqNotNull: UInt
        get() = readBits(this.rawPtr, 795, 1, false).toUInt()
        set(value) { writeBits(this.rawPtr, 795, 1, value.toLong()) }
    
    var isResized: UInt
        get() = readBits(this.rawPtr, 796, 1, false).toUInt()
        set(value) { writeBits(this.rawPtr, 796, 1, value.toLong()) }
    
    var isCovering: UInt
        get() = readBits(this.rawPtr, 797, 1, false).toUInt()
        set(value) { writeBits(this.rawPtr, 797, 1, value.toLong()) }
    
    var noSkipScan: UInt
        get() = readBits(this.rawPtr, 798, 1, false).toUInt()
        set(value) { writeBits(this.rawPtr, 798, 1, value.toLong()) }
    
    var hasStat1: UInt
        get() = readBits(this.rawPtr, 799, 1, false).toUInt()
        set(value) { writeBits(this.rawPtr, 799, 1, value.toLong()) }
    
    var bNoQuery: UInt
        get() = readBits(this.rawPtr, 800, 1, false).toUInt()
        set(value) { writeBits(this.rawPtr, 800, 1, value.toLong()) }
}

@CStruct("struct { void* p0; void* p1; void* p2; void* p3; void* p4; int p5; unsigned char p6; unsigned char p7[2]; void* p8[2]; struct { int p0; void* p1; } p9[1]; }")
class FKey(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(80, 8)
    
    var pFrom: CPointer<Table>?
        get() = memberAt<CPointerVar<Table>>(0).value
        set(value) { memberAt<CPointerVar<Table>>(0).value = value }
    
    var pNextFrom: CPointer<FKey>?
        get() = memberAt<CPointerVar<FKey>>(8).value
        set(value) { memberAt<CPointerVar<FKey>>(8).value = value }
    
    var zTo: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(16).value
        set(value) { memberAt<CPointerVar<ByteVar>>(16).value = value }
    
    var pNextTo: CPointer<FKey>?
        get() = memberAt<CPointerVar<FKey>>(24).value
        set(value) { memberAt<CPointerVar<FKey>>(24).value = value }
    
    var pPrevTo: CPointer<FKey>?
        get() = memberAt<CPointerVar<FKey>>(32).value
        set(value) { memberAt<CPointerVar<FKey>>(32).value = value }
    
    var nCol: Int
        get() = memberAt<IntVar>(40).value
        set(value) { memberAt<IntVar>(40).value = value }
    
    var isDeferred: u8
        get() = memberAt<u8Var>(44).value
        set(value) { memberAt<u8Var>(44).value = value }
    
    val aAction: CArrayPointer<u8Var>
        get() = arrayMemberAt(45)
    
    val apTrigger: CArrayPointer<CPointerVar<Trigger>>
        get() = arrayMemberAt(48)
    
    val aCol: CArrayPointer<sColMap>
        get() = arrayMemberAt(64)
}

@CStruct("struct { void* p0; void* p1; unsigned char p2; unsigned char p3; void* p4; void* p5; void* p6; void* p7; void* p8; void* p9; }")
class Trigger(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(72, 8)
    
    var zName: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(0).value
        set(value) { memberAt<CPointerVar<ByteVar>>(0).value = value }
    
    var table: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(8).value
        set(value) { memberAt<CPointerVar<ByteVar>>(8).value = value }
    
    var op: u8
        get() = memberAt<u8Var>(16).value
        set(value) { memberAt<u8Var>(16).value = value }
    
    var tr_tm: u8
        get() = memberAt<u8Var>(17).value
        set(value) { memberAt<u8Var>(17).value = value }
    
    var pWhen: CPointer<Expr>?
        get() = memberAt<CPointerVar<Expr>>(24).value
        set(value) { memberAt<CPointerVar<Expr>>(24).value = value }
    
    var pColumns: CPointer<IdList>?
        get() = memberAt<CPointerVar<IdList>>(32).value
        set(value) { memberAt<CPointerVar<IdList>>(32).value = value }
    
    var pSchema: CPointer<Schema>?
        get() = memberAt<CPointerVar<Schema>>(40).value
        set(value) { memberAt<CPointerVar<Schema>>(40).value = value }
    
    var pTabSchema: CPointer<Schema>?
        get() = memberAt<CPointerVar<Schema>>(48).value
        set(value) { memberAt<CPointerVar<Schema>>(48).value = value }
    
    var step_list: CPointer<TriggerStep>?
        get() = memberAt<CPointerVar<TriggerStep>>(56).value
        set(value) { memberAt<CPointerVar<TriggerStep>>(56).value = value }
    
    var pNext: CPointer<Trigger>?
        get() = memberAt<CPointerVar<Trigger>>(64).value
        set(value) { memberAt<CPointerVar<Trigger>>(64).value = value }
}

@CStruct("struct { void* p0; int p1; }")
class IdList(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 8)
    
    var a: CPointer<IdList_item>?
        get() = memberAt<CPointerVar<IdList_item>>(0).value
        set(value) { memberAt<CPointerVar<IdList_item>>(0).value = value }
    
    var nId: Int
        get() = memberAt<IntVar>(8).value
        set(value) { memberAt<IntVar>(8).value = value }
}

@CStruct("struct { void* p0; int p1; }")
class IdList_item(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 8)
    
    var zName: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(0).value
        set(value) { memberAt<CPointerVar<ByteVar>>(0).value = value }
    
    var idx: Int
        get() = memberAt<IntVar>(8).value
        set(value) { memberAt<IntVar>(8).value = value }
}

@CStruct("struct { unsigned char p0; unsigned char p1; void* p2; void* p3; void* p4; void* p5; void* p6; void* p7; void* p8; void* p9; void* p10; void* p11; }")
class TriggerStep(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(88, 8)
    
    var op: u8
        get() = memberAt<u8Var>(0).value
        set(value) { memberAt<u8Var>(0).value = value }
    
    var orconf: u8
        get() = memberAt<u8Var>(1).value
        set(value) { memberAt<u8Var>(1).value = value }
    
    var pTrig: CPointer<Trigger>?
        get() = memberAt<CPointerVar<Trigger>>(8).value
        set(value) { memberAt<CPointerVar<Trigger>>(8).value = value }
    
    var pSelect: CPointer<Select>?
        get() = memberAt<CPointerVar<Select>>(16).value
        set(value) { memberAt<CPointerVar<Select>>(16).value = value }
    
    var zTarget: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(24).value
        set(value) { memberAt<CPointerVar<ByteVar>>(24).value = value }
    
    var pWhere: CPointer<Expr>?
        get() = memberAt<CPointerVar<Expr>>(32).value
        set(value) { memberAt<CPointerVar<Expr>>(32).value = value }
    
    var pExprList: CPointer<ExprList>?
        get() = memberAt<CPointerVar<ExprList>>(40).value
        set(value) { memberAt<CPointerVar<ExprList>>(40).value = value }
    
    var pIdList: CPointer<IdList>?
        get() = memberAt<CPointerVar<IdList>>(48).value
        set(value) { memberAt<CPointerVar<IdList>>(48).value = value }
    
    var pUpsert: CPointer<Upsert>?
        get() = memberAt<CPointerVar<Upsert>>(56).value
        set(value) { memberAt<CPointerVar<Upsert>>(56).value = value }
    
    var zSpan: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(64).value
        set(value) { memberAt<CPointerVar<ByteVar>>(64).value = value }
    
    var pNext: CPointer<TriggerStep>?
        get() = memberAt<CPointerVar<TriggerStep>>(72).value
        set(value) { memberAt<CPointerVar<TriggerStep>>(72).value = value }
    
    var pLast: CPointer<TriggerStep>?
        get() = memberAt<CPointerVar<TriggerStep>>(80).value
        set(value) { memberAt<CPointerVar<TriggerStep>>(80).value = value }
}

@CStruct("struct { void* p0; void* p1; void* p2; void* p3; void* p4; void* p5; int p6; int p7; int p8; }")
class Upsert(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(64, 8)
    
    var pUpsertTarget: CPointer<ExprList>?
        get() = memberAt<CPointerVar<ExprList>>(0).value
        set(value) { memberAt<CPointerVar<ExprList>>(0).value = value }
    
    var pUpsertTargetWhere: CPointer<Expr>?
        get() = memberAt<CPointerVar<Expr>>(8).value
        set(value) { memberAt<CPointerVar<Expr>>(8).value = value }
    
    var pUpsertSet: CPointer<ExprList>?
        get() = memberAt<CPointerVar<ExprList>>(16).value
        set(value) { memberAt<CPointerVar<ExprList>>(16).value = value }
    
    var pUpsertWhere: CPointer<Expr>?
        get() = memberAt<CPointerVar<Expr>>(24).value
        set(value) { memberAt<CPointerVar<Expr>>(24).value = value }
    
    var pUpsertIdx: CPointer<Index>?
        get() = memberAt<CPointerVar<Index>>(32).value
        set(value) { memberAt<CPointerVar<Index>>(32).value = value }
    
    var pUpsertSrc: CPointer<SrcList>?
        get() = memberAt<CPointerVar<SrcList>>(40).value
        set(value) { memberAt<CPointerVar<SrcList>>(40).value = value }
    
    var regData: Int
        get() = memberAt<IntVar>(48).value
        set(value) { memberAt<IntVar>(48).value = value }
    
    var iDataCur: Int
        get() = memberAt<IntVar>(52).value
        set(value) { memberAt<IntVar>(52).value = value }
    
    var iIdxCur: Int
        get() = memberAt<IntVar>(56).value
        set(value) { memberAt<IntVar>(56).value = value }
}

@CStruct("struct { int p0; void* p1; }")
class sColMap(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 8)
    
    var iFrom: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var zCol: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(8).value
        set(value) { memberAt<CPointerVar<ByteVar>>(8).value = value }
}

@CStruct("struct { void* p0; void* p1; void* p2; int p3; unsigned char p4; int p5; void* p6; }")
class VTable(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(48, 8)
    
    var db: CPointer<sqlite3>?
        get() = memberAt<CPointerVar<sqlite3>>(0).value
        set(value) { memberAt<CPointerVar<sqlite3>>(0).value = value }
    
    var pMod: CPointer<Module>?
        get() = memberAt<CPointerVar<Module>>(8).value
        set(value) { memberAt<CPointerVar<Module>>(8).value = value }
    
    var pVtab: CPointer<sqlite3_vtab>?
        get() = memberAt<CPointerVar<sqlite3_vtab>>(16).value
        set(value) { memberAt<CPointerVar<sqlite3_vtab>>(16).value = value }
    
    var nRef: Int
        get() = memberAt<IntVar>(24).value
        set(value) { memberAt<IntVar>(24).value = value }
    
    var bConstraint: u8
        get() = memberAt<u8Var>(28).value
        set(value) { memberAt<u8Var>(28).value = value }
    
    var iSavepoint: Int
        get() = memberAt<IntVar>(32).value
        set(value) { memberAt<IntVar>(32).value = value }
    
    var pNext: CPointer<VTable>?
        get() = memberAt<CPointerVar<VTable>>(40).value
        set(value) { memberAt<CPointerVar<VTable>>(40).value = value }
}

@CStruct("struct { void* p0; void* p1; void* p2; void* p3; void* p4; }")
class Module(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(40, 8)
    
    var pModule: CPointer<sqlite3_module>?
        get() = memberAt<CPointerVar<sqlite3_module>>(0).value
        set(value) { memberAt<CPointerVar<sqlite3_module>>(0).value = value }
    
    var zName: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(8).value
        set(value) { memberAt<CPointerVar<ByteVar>>(8).value = value }
    
    var pAux: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(16).value
        set(value) { memberAt<COpaquePointerVar>(16).value = value }
    
    var xDestroy: CPointer<CFunction<(COpaquePointer?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Unit>>>(24).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Unit>>>(24).value = value }
    
    var pEpoTab: CPointer<Table>?
        get() = memberAt<CPointerVar<Table>>(32).value
        set(value) { memberAt<CPointerVar<Table>>(32).value = value }
}

@CStruct("struct { int p0; void* p1; void* p2; void* p3; void* p4; void* p5; void* p6; void* p7; void* p8; void* p9; void* p10; void* p11; void* p12; void* p13; void* p14; void* p15; void* p16; void* p17; void* p18; void* p19; void* p20; void* p21; void* p22; void* p23; }")
class sqlite3_module(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(192, 8)
    
    var iVersion: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var xCreate: CPointer<CFunction<(CPointer<sqlite3>?, COpaquePointer?, Int, CPointer<CPointerVar<ByteVar>>?, CPointer<CPointerVar<sqlite3_vtab>>?, CPointer<CPointerVar<ByteVar>>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, COpaquePointer?, Int, CPointer<CPointerVar<ByteVar>>?, CPointer<CPointerVar<sqlite3_vtab>>?, CPointer<CPointerVar<ByteVar>>?) -> Int>>>(8).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, COpaquePointer?, Int, CPointer<CPointerVar<ByteVar>>?, CPointer<CPointerVar<sqlite3_vtab>>?, CPointer<CPointerVar<ByteVar>>?) -> Int>>>(8).value = value }
    
    var xConnect: CPointer<CFunction<(CPointer<sqlite3>?, COpaquePointer?, Int, CPointer<CPointerVar<ByteVar>>?, CPointer<CPointerVar<sqlite3_vtab>>?, CPointer<CPointerVar<ByteVar>>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, COpaquePointer?, Int, CPointer<CPointerVar<ByteVar>>?, CPointer<CPointerVar<sqlite3_vtab>>?, CPointer<CPointerVar<ByteVar>>?) -> Int>>>(16).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, COpaquePointer?, Int, CPointer<CPointerVar<ByteVar>>?, CPointer<CPointerVar<sqlite3_vtab>>?, CPointer<CPointerVar<ByteVar>>?) -> Int>>>(16).value = value }
    
    var xBestIndex: CPointer<CFunction<(CPointer<sqlite3_vtab>?, CPointer<sqlite3_index_info>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vtab>?, CPointer<sqlite3_index_info>?) -> Int>>>(24).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vtab>?, CPointer<sqlite3_index_info>?) -> Int>>>(24).value = value }
    
    var xDisconnect: CPointer<CFunction<(CPointer<sqlite3_vtab>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vtab>?) -> Int>>>(32).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vtab>?) -> Int>>>(32).value = value }
    
    var xDestroy: CPointer<CFunction<(CPointer<sqlite3_vtab>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vtab>?) -> Int>>>(40).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vtab>?) -> Int>>>(40).value = value }
    
    var xOpen: CPointer<CFunction<(CPointer<sqlite3_vtab>?, CPointer<CPointerVar<sqlite3_vtab_cursor>>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vtab>?, CPointer<CPointerVar<sqlite3_vtab_cursor>>?) -> Int>>>(48).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vtab>?, CPointer<CPointerVar<sqlite3_vtab_cursor>>?) -> Int>>>(48).value = value }
    
    var xClose: CPointer<CFunction<(CPointer<sqlite3_vtab_cursor>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vtab_cursor>?) -> Int>>>(56).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vtab_cursor>?) -> Int>>>(56).value = value }
    
    var xFilter: CPointer<CFunction<(CPointer<sqlite3_vtab_cursor>?, Int, CPointer<ByteVar>?, Int, CPointer<CPointerVar<sqlite3_value>>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vtab_cursor>?, Int, CPointer<ByteVar>?, Int, CPointer<CPointerVar<sqlite3_value>>?) -> Int>>>(64).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vtab_cursor>?, Int, CPointer<ByteVar>?, Int, CPointer<CPointerVar<sqlite3_value>>?) -> Int>>>(64).value = value }
    
    var xNext: CPointer<CFunction<(CPointer<sqlite3_vtab_cursor>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vtab_cursor>?) -> Int>>>(72).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vtab_cursor>?) -> Int>>>(72).value = value }
    
    var xEof: CPointer<CFunction<(CPointer<sqlite3_vtab_cursor>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vtab_cursor>?) -> Int>>>(80).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vtab_cursor>?) -> Int>>>(80).value = value }
    
    var xColumn: CPointer<CFunction<(CPointer<sqlite3_vtab_cursor>?, CPointer<sqlite3_context>?, Int) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vtab_cursor>?, CPointer<sqlite3_context>?, Int) -> Int>>>(88).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vtab_cursor>?, CPointer<sqlite3_context>?, Int) -> Int>>>(88).value = value }
    
    var xRowid: CPointer<CFunction<(CPointer<sqlite3_vtab_cursor>?, CPointer<sqlite3_int64Var>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vtab_cursor>?, CPointer<sqlite3_int64Var>?) -> Int>>>(96).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vtab_cursor>?, CPointer<sqlite3_int64Var>?) -> Int>>>(96).value = value }
    
    var xUpdate: CPointer<CFunction<(CPointer<sqlite3_vtab>?, Int, CPointer<CPointerVar<sqlite3_value>>?, CPointer<sqlite3_int64Var>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vtab>?, Int, CPointer<CPointerVar<sqlite3_value>>?, CPointer<sqlite3_int64Var>?) -> Int>>>(104).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vtab>?, Int, CPointer<CPointerVar<sqlite3_value>>?, CPointer<sqlite3_int64Var>?) -> Int>>>(104).value = value }
    
    var xBegin: CPointer<CFunction<(CPointer<sqlite3_vtab>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vtab>?) -> Int>>>(112).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vtab>?) -> Int>>>(112).value = value }
    
    var xSync: CPointer<CFunction<(CPointer<sqlite3_vtab>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vtab>?) -> Int>>>(120).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vtab>?) -> Int>>>(120).value = value }
    
    var xCommit: CPointer<CFunction<(CPointer<sqlite3_vtab>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vtab>?) -> Int>>>(128).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vtab>?) -> Int>>>(128).value = value }
    
    var xRollback: CPointer<CFunction<(CPointer<sqlite3_vtab>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vtab>?) -> Int>>>(136).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vtab>?) -> Int>>>(136).value = value }
    
    var xFindFunction: CPointer<CFunction<(CPointer<sqlite3_vtab>?, Int, CPointer<ByteVar>?, CPointer<CPointerVar<CFunction<(CPointer<sqlite3_context>?, Int, CPointer<CPointerVar<sqlite3_value>>?) -> Unit>>>?, CPointer<COpaquePointerVar>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vtab>?, Int, CPointer<ByteVar>?, CPointer<CPointerVar<CFunction<(CPointer<sqlite3_context>?, Int, CPointer<CPointerVar<sqlite3_value>>?) -> Unit>>>?, CPointer<COpaquePointerVar>?) -> Int>>>(144).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vtab>?, Int, CPointer<ByteVar>?, CPointer<CPointerVar<CFunction<(CPointer<sqlite3_context>?, Int, CPointer<CPointerVar<sqlite3_value>>?) -> Unit>>>?, CPointer<COpaquePointerVar>?) -> Int>>>(144).value = value }
    
    var xRename: CPointer<CFunction<(CPointer<sqlite3_vtab>?, CPointer<ByteVar>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vtab>?, CPointer<ByteVar>?) -> Int>>>(152).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vtab>?, CPointer<ByteVar>?) -> Int>>>(152).value = value }
    
    var xSavepoint: CPointer<CFunction<(CPointer<sqlite3_vtab>?, Int) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vtab>?, Int) -> Int>>>(160).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vtab>?, Int) -> Int>>>(160).value = value }
    
    var xRelease: CPointer<CFunction<(CPointer<sqlite3_vtab>?, Int) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vtab>?, Int) -> Int>>>(168).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vtab>?, Int) -> Int>>>(168).value = value }
    
    var xRollbackTo: CPointer<CFunction<(CPointer<sqlite3_vtab>?, Int) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vtab>?, Int) -> Int>>>(176).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vtab>?, Int) -> Int>>>(176).value = value }
    
    var xShadowName: CPointer<CFunction<(CPointer<ByteVar>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<ByteVar>?) -> Int>>>(184).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<ByteVar>?) -> Int>>>(184).value = value }
}

@CStruct("struct { void* p0; int p1; void* p2; }")
class sqlite3_vtab(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(24, 8)
    
    var pModule: CPointer<sqlite3_module>?
        get() = memberAt<CPointerVar<sqlite3_module>>(0).value
        set(value) { memberAt<CPointerVar<sqlite3_module>>(0).value = value }
    
    var nRef: Int
        get() = memberAt<IntVar>(8).value
        set(value) { memberAt<IntVar>(8).value = value }
    
    var zErrMsg: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(16).value
        set(value) { memberAt<CPointerVar<ByteVar>>(16).value = value }
}

@CStruct("struct { int p0; void* p1; int p2; void* p3; void* p4; int p5; void* p6; int p7; int p8; double p9; long long p10; int p11; unsigned long long p12; }")
class sqlite3_index_info(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(96, 8)
    
    var nConstraint: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var aConstraint: CPointer<sqlite3_index_constraint>?
        get() = memberAt<CPointerVar<sqlite3_index_constraint>>(8).value
        set(value) { memberAt<CPointerVar<sqlite3_index_constraint>>(8).value = value }
    
    var nOrderBy: Int
        get() = memberAt<IntVar>(16).value
        set(value) { memberAt<IntVar>(16).value = value }
    
    var aOrderBy: CPointer<sqlite3_index_orderby>?
        get() = memberAt<CPointerVar<sqlite3_index_orderby>>(24).value
        set(value) { memberAt<CPointerVar<sqlite3_index_orderby>>(24).value = value }
    
    var aConstraintUsage: CPointer<sqlite3_index_constraint_usage>?
        get() = memberAt<CPointerVar<sqlite3_index_constraint_usage>>(32).value
        set(value) { memberAt<CPointerVar<sqlite3_index_constraint_usage>>(32).value = value }
    
    var idxNum: Int
        get() = memberAt<IntVar>(40).value
        set(value) { memberAt<IntVar>(40).value = value }
    
    var idxStr: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(48).value
        set(value) { memberAt<CPointerVar<ByteVar>>(48).value = value }
    
    var needToFreeIdxStr: Int
        get() = memberAt<IntVar>(56).value
        set(value) { memberAt<IntVar>(56).value = value }
    
    var orderByConsumed: Int
        get() = memberAt<IntVar>(60).value
        set(value) { memberAt<IntVar>(60).value = value }
    
    var estimatedCost: Double
        get() = memberAt<DoubleVar>(64).value
        set(value) { memberAt<DoubleVar>(64).value = value }
    
    var estimatedRows: sqlite3_int64
        get() = memberAt<sqlite3_int64Var>(72).value
        set(value) { memberAt<sqlite3_int64Var>(72).value = value }
    
    var idxFlags: Int
        get() = memberAt<IntVar>(80).value
        set(value) { memberAt<IntVar>(80).value = value }
    
    var colUsed: sqlite3_uint64
        get() = memberAt<sqlite3_uint64Var>(88).value
        set(value) { memberAt<sqlite3_uint64Var>(88).value = value }
}

@CStruct("struct { int p0; unsigned char p1; unsigned char p2; int p3; }")
class sqlite3_index_constraint(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(12, 4)
    
    var iColumn: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var op: UByte
        get() = memberAt<UByteVar>(4).value
        set(value) { memberAt<UByteVar>(4).value = value }
    
    var usable: UByte
        get() = memberAt<UByteVar>(5).value
        set(value) { memberAt<UByteVar>(5).value = value }
    
    var iTermOffset: Int
        get() = memberAt<IntVar>(8).value
        set(value) { memberAt<IntVar>(8).value = value }
}

@CStruct("struct { int p0; unsigned char p1; }")
class sqlite3_index_orderby(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(8, 4)
    
    var iColumn: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var desc: UByte
        get() = memberAt<UByteVar>(4).value
        set(value) { memberAt<UByteVar>(4).value = value }
}

@CStruct("struct { int p0; unsigned char p1; }")
class sqlite3_index_constraint_usage(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(8, 4)
    
    var argvIndex: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var omit: UByte
        get() = memberAt<UByteVar>(4).value
        set(value) { memberAt<UByteVar>(4).value = value }
}

@CStruct("struct { void* p0; }")
class sqlite3_vtab_cursor(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(8, 8)
    
    var pVtab: CPointer<sqlite3_vtab>?
        get() = memberAt<CPointerVar<sqlite3_vtab>>(0).value
        set(value) { memberAt<CPointerVar<sqlite3_vtab>>(0).value = value }
}

@CStruct("struct { union { double p0; long long p1; int p2; void* p3; void* p4; } p0; unsigned short p1; unsigned char p2; unsigned char p3; int p4; void* p5; void* p6; int p7; unsigned int p8; void* p9; void* p10; }")
class sqlite3_value(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(56, 8)
    
    val u: MemValue
        get() = memberAt(0)
    
    var flags: u16
        get() = memberAt<u16Var>(8).value
        set(value) { memberAt<u16Var>(8).value = value }
    
    var enc: u8
        get() = memberAt<u8Var>(10).value
        set(value) { memberAt<u8Var>(10).value = value }
    
    var eSubtype: u8
        get() = memberAt<u8Var>(11).value
        set(value) { memberAt<u8Var>(11).value = value }
    
    var n: Int
        get() = memberAt<IntVar>(12).value
        set(value) { memberAt<IntVar>(12).value = value }
    
    var z: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(16).value
        set(value) { memberAt<CPointerVar<ByteVar>>(16).value = value }
    
    var zMalloc: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(24).value
        set(value) { memberAt<CPointerVar<ByteVar>>(24).value = value }
    
    var szMalloc: Int
        get() = memberAt<IntVar>(32).value
        set(value) { memberAt<IntVar>(32).value = value }
    
    var uTemp: u32
        get() = memberAt<u32Var>(36).value
        set(value) { memberAt<u32Var>(36).value = value }
    
    var db: CPointer<sqlite3>?
        get() = memberAt<CPointerVar<sqlite3>>(40).value
        set(value) { memberAt<CPointerVar<sqlite3>>(40).value = value }
    
    var xDel: CPointer<CFunction<(COpaquePointer?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Unit>>>(48).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Unit>>>(48).value = value }
}

@CStruct("union { double p0; long long p1; int p2; void* p3; void* p4; }")
class MemValue(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(8, 8)
    
    var r: Double
        get() = memberAt<DoubleVar>(0).value
        set(value) { memberAt<DoubleVar>(0).value = value }
    
    var i: i64
        get() = memberAt<i64Var>(0).value
        set(value) { memberAt<i64Var>(0).value = value }
    
    var nZero: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var zPType: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(0).value
        set(value) { memberAt<CPointerVar<ByteVar>>(0).value = value }
    
    var pDef: CPointer<FuncDef>?
        get() = memberAt<CPointerVar<FuncDef>>(0).value
        set(value) { memberAt<CPointerVar<FuncDef>>(0).value = value }
}

@CStruct("struct { signed char p0; unsigned int p1; void* p2; void* p3; void* p4; void* p5; void* p6; void* p7; void* p8; union { void* p0; void* p1; } p9; }")
class FuncDef(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(72, 8)
    
    var nArg: i8
        get() = memberAt<i8Var>(0).value
        set(value) { memberAt<i8Var>(0).value = value }
    
    var funcFlags: u32
        get() = memberAt<u32Var>(4).value
        set(value) { memberAt<u32Var>(4).value = value }
    
    var pUserData: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(8).value
        set(value) { memberAt<COpaquePointerVar>(8).value = value }
    
    var pNext: CPointer<FuncDef>?
        get() = memberAt<CPointerVar<FuncDef>>(16).value
        set(value) { memberAt<CPointerVar<FuncDef>>(16).value = value }
    
    var xSFunc: CPointer<CFunction<(CPointer<sqlite3_context>?, Int, CPointer<CPointerVar<sqlite3_value>>?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_context>?, Int, CPointer<CPointerVar<sqlite3_value>>?) -> Unit>>>(24).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_context>?, Int, CPointer<CPointerVar<sqlite3_value>>?) -> Unit>>>(24).value = value }
    
    var xFinalize: CPointer<CFunction<(CPointer<sqlite3_context>?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_context>?) -> Unit>>>(32).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_context>?) -> Unit>>>(32).value = value }
    
    var xValue: CPointer<CFunction<(CPointer<sqlite3_context>?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_context>?) -> Unit>>>(40).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_context>?) -> Unit>>>(40).value = value }
    
    var xInverse: CPointer<CFunction<(CPointer<sqlite3_context>?, Int, CPointer<CPointerVar<sqlite3_value>>?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_context>?, Int, CPointer<CPointerVar<sqlite3_value>>?) -> Unit>>>(48).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_context>?, Int, CPointer<CPointerVar<sqlite3_value>>?) -> Unit>>>(48).value = value }
    
    var zName: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(56).value
        set(value) { memberAt<CPointerVar<ByteVar>>(56).value = value }
    
    val u: anonymousStruct8
        get() = memberAt(64)
}

@CStruct("struct { void* p0; void* p1; void* p2; void* p3; int p4; int p5; unsigned char p6; unsigned char p7; void* p8[1]; }")
class sqlite3_context(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(56, 8)
    
    var pOut: CPointer<Mem>?
        get() = memberAt<CPointerVar<Mem>>(0).value
        set(value) { memberAt<CPointerVar<Mem>>(0).value = value }
    
    var pFunc: CPointer<FuncDef>?
        get() = memberAt<CPointerVar<FuncDef>>(8).value
        set(value) { memberAt<CPointerVar<FuncDef>>(8).value = value }
    
    var pMem: CPointer<Mem>?
        get() = memberAt<CPointerVar<Mem>>(16).value
        set(value) { memberAt<CPointerVar<Mem>>(16).value = value }
    
    var pVdbe: CPointer<Vdbe>?
        get() = memberAt<CPointerVar<Vdbe>>(24).value
        set(value) { memberAt<CPointerVar<Vdbe>>(24).value = value }
    
    var iOp: Int
        get() = memberAt<IntVar>(32).value
        set(value) { memberAt<IntVar>(32).value = value }
    
    var isError: Int
        get() = memberAt<IntVar>(36).value
        set(value) { memberAt<IntVar>(36).value = value }
    
    var skipFlag: u8
        get() = memberAt<u8Var>(40).value
        set(value) { memberAt<u8Var>(40).value = value }
    
    var argc: u8
        get() = memberAt<u8Var>(41).value
        set(value) { memberAt<u8Var>(41).value = value }
    
    val argv: CArrayPointer<CPointerVar<sqlite3_value>>
        get() = arrayMemberAt(48)
}

@CStruct("union { void* p0; void* p1; }")
class anonymousStruct8(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(8, 8)
    
    var pHash: CPointer<FuncDef>?
        get() = memberAt<CPointerVar<FuncDef>>(0).value
        set(value) { memberAt<CPointerVar<FuncDef>>(0).value = value }
    
    var pDestructor: CPointer<FuncDestructor>?
        get() = memberAt<CPointerVar<FuncDestructor>>(0).value
        set(value) { memberAt<CPointerVar<FuncDestructor>>(0).value = value }
}

@CStruct("struct { int p0; void* p1; void* p2; }")
class FuncDestructor(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(24, 8)
    
    var nRef: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var xDestroy: CPointer<CFunction<(COpaquePointer?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Unit>>>(8).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Unit>>>(8).value = value }
    
    var pUserData: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(16).value
        set(value) { memberAt<COpaquePointerVar>(16).value = value }
}

class anonymousStruct6(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(4, 4)
    
    var jointype: u8
        get() = memberAt<u8Var>(0).value
        set(value) { memberAt<u8Var>(0).value = value }
    
    var notIndexed: UInt
        get() = readBits(this.rawPtr, 8, 1, false).toUInt()
        set(value) { writeBits(this.rawPtr, 8, 1, value.toLong()) }
    
    var isIndexedBy: UInt
        get() = readBits(this.rawPtr, 9, 1, false).toUInt()
        set(value) { writeBits(this.rawPtr, 9, 1, value.toLong()) }
    
    var isTabFunc: UInt
        get() = readBits(this.rawPtr, 10, 1, false).toUInt()
        set(value) { writeBits(this.rawPtr, 10, 1, value.toLong()) }
    
    var isCorrelated: UInt
        get() = readBits(this.rawPtr, 11, 1, false).toUInt()
        set(value) { writeBits(this.rawPtr, 11, 1, value.toLong()) }
    
    var viaCoroutine: UInt
        get() = readBits(this.rawPtr, 12, 1, false).toUInt()
        set(value) { writeBits(this.rawPtr, 12, 1, value.toLong()) }
    
    var isRecursive: UInt
        get() = readBits(this.rawPtr, 13, 1, false).toUInt()
        set(value) { writeBits(this.rawPtr, 13, 1, value.toLong()) }
}

@CStruct("union { void* p0; void* p1; }")
class anonymousStruct7(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(8, 8)
    
    var zIndexedBy: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(0).value
        set(value) { memberAt<CPointerVar<ByteVar>>(0).value = value }
    
    var pFuncArg: CPointer<ExprList>?
        get() = memberAt<CPointerVar<ExprList>>(0).value
        set(value) { memberAt<CPointerVar<ExprList>>(0).value = value }
}

@CStruct("struct { int p0; void* p1; struct { void* p0; void* p1; void* p2; void* p3; } p2[1]; }")
class With(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(48, 8)
    
    var nCte: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var pOuter: CPointer<With>?
        get() = memberAt<CPointerVar<With>>(8).value
        set(value) { memberAt<CPointerVar<With>>(8).value = value }
    
    val a: CArrayPointer<Cte>
        get() = arrayMemberAt(16)
}

@CStruct("struct { void* p0; void* p1; void* p2; void* p3; }")
class Cte(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(32, 8)
    
    var zName: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(0).value
        set(value) { memberAt<CPointerVar<ByteVar>>(0).value = value }
    
    var pCols: CPointer<ExprList>?
        get() = memberAt<CPointerVar<ExprList>>(8).value
        set(value) { memberAt<CPointerVar<ExprList>>(8).value = value }
    
    var pSelect: CPointer<Select>?
        get() = memberAt<CPointerVar<Select>>(16).value
        set(value) { memberAt<CPointerVar<Select>>(16).value = value }
    
    var zCteErr: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(24).value
        set(value) { memberAt<CPointerVar<ByteVar>>(24).value = value }
}

@CStruct("struct { void* p0; void* p1; void* p2; unsigned char p3; unsigned char p4; unsigned char p5; void* p6; void* p7; void* p8; void* p9; void* p10; int p11; int p12; int p13; int p14; int p15; int p16; void* p17; int p18; int p19; }")
class Window(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(112, 8)
    
    var zName: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(0).value
        set(value) { memberAt<CPointerVar<ByteVar>>(0).value = value }
    
    var pPartition: CPointer<ExprList>?
        get() = memberAt<CPointerVar<ExprList>>(8).value
        set(value) { memberAt<CPointerVar<ExprList>>(8).value = value }
    
    var pOrderBy: CPointer<ExprList>?
        get() = memberAt<CPointerVar<ExprList>>(16).value
        set(value) { memberAt<CPointerVar<ExprList>>(16).value = value }
    
    var eType: u8
        get() = memberAt<u8Var>(24).value
        set(value) { memberAt<u8Var>(24).value = value }
    
    var eStart: u8
        get() = memberAt<u8Var>(25).value
        set(value) { memberAt<u8Var>(25).value = value }
    
    var eEnd: u8
        get() = memberAt<u8Var>(26).value
        set(value) { memberAt<u8Var>(26).value = value }
    
    var pStart: CPointer<Expr>?
        get() = memberAt<CPointerVar<Expr>>(32).value
        set(value) { memberAt<CPointerVar<Expr>>(32).value = value }
    
    var pEnd: CPointer<Expr>?
        get() = memberAt<CPointerVar<Expr>>(40).value
        set(value) { memberAt<CPointerVar<Expr>>(40).value = value }
    
    var pNextWin: CPointer<Window>?
        get() = memberAt<CPointerVar<Window>>(48).value
        set(value) { memberAt<CPointerVar<Window>>(48).value = value }
    
    var pFilter: CPointer<Expr>?
        get() = memberAt<CPointerVar<Expr>>(56).value
        set(value) { memberAt<CPointerVar<Expr>>(56).value = value }
    
    var pFunc: CPointer<FuncDef>?
        get() = memberAt<CPointerVar<FuncDef>>(64).value
        set(value) { memberAt<CPointerVar<FuncDef>>(64).value = value }
    
    var iEphCsr: Int
        get() = memberAt<IntVar>(72).value
        set(value) { memberAt<IntVar>(72).value = value }
    
    var regAccum: Int
        get() = memberAt<IntVar>(76).value
        set(value) { memberAt<IntVar>(76).value = value }
    
    var regResult: Int
        get() = memberAt<IntVar>(80).value
        set(value) { memberAt<IntVar>(80).value = value }
    
    var csrApp: Int
        get() = memberAt<IntVar>(84).value
        set(value) { memberAt<IntVar>(84).value = value }
    
    var regApp: Int
        get() = memberAt<IntVar>(88).value
        set(value) { memberAt<IntVar>(88).value = value }
    
    var regPart: Int
        get() = memberAt<IntVar>(92).value
        set(value) { memberAt<IntVar>(92).value = value }
    
    var pOwner: CPointer<Expr>?
        get() = memberAt<CPointerVar<Expr>>(96).value
        set(value) { memberAt<CPointerVar<Expr>>(96).value = value }
    
    var nBufferCol: Int
        get() = memberAt<IntVar>(104).value
        set(value) { memberAt<IntVar>(104).value = value }
    
    var iArgCol: Int
        get() = memberAt<IntVar>(108).value
        set(value) { memberAt<IntVar>(108).value = value }
}

@CStruct("struct { unsigned char p0; unsigned char p1; int p2; int p3; int p4; int p5; int p6; void* p7; void* p8; int p9; int p10; void* p11; int p12; }")
class AggInfo(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(64, 8)
    
    var directMode: u8
        get() = memberAt<u8Var>(0).value
        set(value) { memberAt<u8Var>(0).value = value }
    
    var useSortingIdx: u8
        get() = memberAt<u8Var>(1).value
        set(value) { memberAt<u8Var>(1).value = value }
    
    var sortingIdx: Int
        get() = memberAt<IntVar>(4).value
        set(value) { memberAt<IntVar>(4).value = value }
    
    var sortingIdxPTab: Int
        get() = memberAt<IntVar>(8).value
        set(value) { memberAt<IntVar>(8).value = value }
    
    var nSortingColumn: Int
        get() = memberAt<IntVar>(12).value
        set(value) { memberAt<IntVar>(12).value = value }
    
    var mnReg: Int
        get() = memberAt<IntVar>(16).value
        set(value) { memberAt<IntVar>(16).value = value }
    
    var mxReg: Int
        get() = memberAt<IntVar>(20).value
        set(value) { memberAt<IntVar>(20).value = value }
    
    var pGroupBy: CPointer<ExprList>?
        get() = memberAt<CPointerVar<ExprList>>(24).value
        set(value) { memberAt<CPointerVar<ExprList>>(24).value = value }
    
    var aCol: CPointer<AggInfo_col>?
        get() = memberAt<CPointerVar<AggInfo_col>>(32).value
        set(value) { memberAt<CPointerVar<AggInfo_col>>(32).value = value }
    
    var nColumn: Int
        get() = memberAt<IntVar>(40).value
        set(value) { memberAt<IntVar>(40).value = value }
    
    var nAccumulator: Int
        get() = memberAt<IntVar>(44).value
        set(value) { memberAt<IntVar>(44).value = value }
    
    var aFunc: CPointer<AggInfo_func>?
        get() = memberAt<CPointerVar<AggInfo_func>>(48).value
        set(value) { memberAt<CPointerVar<AggInfo_func>>(48).value = value }
    
    var nFunc: Int
        get() = memberAt<IntVar>(56).value
        set(value) { memberAt<IntVar>(56).value = value }
}

@CStruct("struct { void* p0; int p1; int p2; int p3; int p4; void* p5; }")
class AggInfo_col(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(32, 8)
    
    var pTab: CPointer<Table>?
        get() = memberAt<CPointerVar<Table>>(0).value
        set(value) { memberAt<CPointerVar<Table>>(0).value = value }
    
    var iTable: Int
        get() = memberAt<IntVar>(8).value
        set(value) { memberAt<IntVar>(8).value = value }
    
    var iColumn: Int
        get() = memberAt<IntVar>(12).value
        set(value) { memberAt<IntVar>(12).value = value }
    
    var iSorterColumn: Int
        get() = memberAt<IntVar>(16).value
        set(value) { memberAt<IntVar>(16).value = value }
    
    var iMem: Int
        get() = memberAt<IntVar>(20).value
        set(value) { memberAt<IntVar>(20).value = value }
    
    var pExpr: CPointer<Expr>?
        get() = memberAt<CPointerVar<Expr>>(24).value
        set(value) { memberAt<CPointerVar<Expr>>(24).value = value }
}

@CStruct("struct { void* p0; void* p1; int p2; int p3; }")
class AggInfo_func(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(24, 8)
    
    var pExpr: CPointer<Expr>?
        get() = memberAt<CPointerVar<Expr>>(0).value
        set(value) { memberAt<CPointerVar<Expr>>(0).value = value }
    
    var pFunc: CPointer<FuncDef>?
        get() = memberAt<CPointerVar<FuncDef>>(8).value
        set(value) { memberAt<CPointerVar<FuncDef>>(8).value = value }
    
    var iMem: Int
        get() = memberAt<IntVar>(16).value
        set(value) { memberAt<IntVar>(16).value = value }
    
    var iDistinct: Int
        get() = memberAt<IntVar>(20).value
        set(value) { memberAt<IntVar>(20).value = value }
}

@CStruct("union { void* p0; void* p1; struct { int p0; int p1; } p2; }")
class anonymousStruct5(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(8, 8)
    
    var pTab: CPointer<Table>?
        get() = memberAt<CPointerVar<Table>>(0).value
        set(value) { memberAt<CPointerVar<Table>>(0).value = value }
    
    var pWin: CPointer<Window>?
        get() = memberAt<CPointerVar<Window>>(0).value
        set(value) { memberAt<CPointerVar<Window>>(0).value = value }
    
    val sub: anonymousStruct9
        get() = memberAt(0)
}

@CStruct("struct { int p0; int p1; }")
class anonymousStruct9(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(8, 4)
    
    var iAddr: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var regReturn: Int
        get() = memberAt<IntVar>(4).value
        set(value) { memberAt<IntVar>(4).value = value }
}

@CStruct("union { struct { unsigned short p0; unsigned short p1; } p0; int p1; }")
class anonymousStruct2(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(4, 4)
    
    val x: anonymousStruct10
        get() = memberAt(0)
    
    var iConstExprReg: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
}

@CStruct("struct { unsigned short p0; unsigned short p1; }")
class anonymousStruct10(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(4, 2)
    
    var iOrderByCol: u16
        get() = memberAt<u16Var>(0).value
        set(value) { memberAt<u16Var>(0).value = value }
    
    var iAlias: u16
        get() = memberAt<u16Var>(2).value
        set(value) { memberAt<u16Var>(2).value = value }
}

@CStruct("struct { void* p0; unsigned int p1; }")
class Token(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 8)
    
    var z: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(0).value
        set(value) { memberAt<CPointerVar<ByteVar>>(0).value = value }
    
    var n: UInt
        get() = memberAt<UIntVar>(8).value
        set(value) { memberAt<UIntVar>(8).value = value }
}

@CStruct("struct { int p0; int p1; unsigned char p2; void* p3; }")
class TableLock(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(24, 8)
    
    var iDb: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var iTab: Int
        get() = memberAt<IntVar>(4).value
        set(value) { memberAt<IntVar>(4).value = value }
    
    var isWriteLock: u8
        get() = memberAt<u8Var>(8).value
        set(value) { memberAt<u8Var>(8).value = value }
    
    var zLockName: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(16).value
        set(value) { memberAt<CPointerVar<ByteVar>>(16).value = value }
}

@CStruct("struct { void* p0; void* p1; int p2; int p3; }")
class AutoincInfo(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(24, 8)
    
    var pNext: CPointer<AutoincInfo>?
        get() = memberAt<CPointerVar<AutoincInfo>>(0).value
        set(value) { memberAt<CPointerVar<AutoincInfo>>(0).value = value }
    
    var pTab: CPointer<Table>?
        get() = memberAt<CPointerVar<Table>>(8).value
        set(value) { memberAt<CPointerVar<Table>>(8).value = value }
    
    var iDb: Int
        get() = memberAt<IntVar>(16).value
        set(value) { memberAt<IntVar>(16).value = value }
    
    var regCtr: Int
        get() = memberAt<IntVar>(20).value
        set(value) { memberAt<IntVar>(20).value = value }
}

@CStruct("struct { void* p0; void* p1; void* p2; int p3; unsigned int p4[2]; }")
class TriggerPrg(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(40, 8)
    
    var pTrigger: CPointer<Trigger>?
        get() = memberAt<CPointerVar<Trigger>>(0).value
        set(value) { memberAt<CPointerVar<Trigger>>(0).value = value }
    
    var pNext: CPointer<TriggerPrg>?
        get() = memberAt<CPointerVar<TriggerPrg>>(8).value
        set(value) { memberAt<CPointerVar<TriggerPrg>>(8).value = value }
    
    var pProgram: CPointer<SubProgram>?
        get() = memberAt<CPointerVar<SubProgram>>(16).value
        set(value) { memberAt<CPointerVar<SubProgram>>(16).value = value }
    
    var orconf: Int
        get() = memberAt<IntVar>(24).value
        set(value) { memberAt<IntVar>(24).value = value }
    
    val aColmask: CArrayPointer<u32Var>
        get() = arrayMemberAt(28)
}

@CStruct("struct { void* p0; int p1; int p2; int p3; void* p4; void* p5; void* p6; }")
class SubProgram(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(48, 8)
    
    var aOp: CPointer<VdbeOp>?
        get() = memberAt<CPointerVar<VdbeOp>>(0).value
        set(value) { memberAt<CPointerVar<VdbeOp>>(0).value = value }
    
    var nOp: Int
        get() = memberAt<IntVar>(8).value
        set(value) { memberAt<IntVar>(8).value = value }
    
    var nMem: Int
        get() = memberAt<IntVar>(12).value
        set(value) { memberAt<IntVar>(12).value = value }
    
    var nCsr: Int
        get() = memberAt<IntVar>(16).value
        set(value) { memberAt<IntVar>(16).value = value }
    
    var aOnce: CPointer<u8Var>?
        get() = memberAt<CPointerVar<u8Var>>(24).value
        set(value) { memberAt<CPointerVar<u8Var>>(24).value = value }
    
    var token: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(32).value
        set(value) { memberAt<COpaquePointerVar>(32).value = value }
    
    var pNext: CPointer<SubProgram>?
        get() = memberAt<CPointerVar<SubProgram>>(40).value
        set(value) { memberAt<CPointerVar<SubProgram>>(40).value = value }
}

@CStruct("struct { unsigned char p0; signed char p1; unsigned short p2; int p3; int p4; int p5; union { int p0; void* p1; void* p2; void* p3; void* p4; void* p5; void* p6; void* p7; void* p8; void* p9; void* p10; void* p11; void* p12; void* p13; void* p14; } p6; }")
class VdbeOp(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(24, 8)
    
    var opcode: u8
        get() = memberAt<u8Var>(0).value
        set(value) { memberAt<u8Var>(0).value = value }
    
    var p4type: Byte
        get() = memberAt<ByteVar>(1).value
        set(value) { memberAt<ByteVar>(1).value = value }
    
    var p5: u16
        get() = memberAt<u16Var>(2).value
        set(value) { memberAt<u16Var>(2).value = value }
    
    var p1: Int
        get() = memberAt<IntVar>(4).value
        set(value) { memberAt<IntVar>(4).value = value }
    
    var p2: Int
        get() = memberAt<IntVar>(8).value
        set(value) { memberAt<IntVar>(8).value = value }
    
    var p3: Int
        get() = memberAt<IntVar>(12).value
        set(value) { memberAt<IntVar>(12).value = value }
    
    val p4: p4union
        get() = memberAt(16)
}

@CStruct("union { int p0; void* p1; void* p2; void* p3; void* p4; void* p5; void* p6; void* p7; void* p8; void* p9; void* p10; void* p11; void* p12; void* p13; void* p14; }")
class p4union(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(8, 8)
    
    var i: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var p: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(0).value
        set(value) { memberAt<COpaquePointerVar>(0).value = value }
    
    var z: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(0).value
        set(value) { memberAt<CPointerVar<ByteVar>>(0).value = value }
    
    var pI64: CPointer<i64Var>?
        get() = memberAt<CPointerVar<i64Var>>(0).value
        set(value) { memberAt<CPointerVar<i64Var>>(0).value = value }
    
    var pReal: CPointer<DoubleVar>?
        get() = memberAt<CPointerVar<DoubleVar>>(0).value
        set(value) { memberAt<CPointerVar<DoubleVar>>(0).value = value }
    
    var pFunc: CPointer<FuncDef>?
        get() = memberAt<CPointerVar<FuncDef>>(0).value
        set(value) { memberAt<CPointerVar<FuncDef>>(0).value = value }
    
    var pCtx: CPointer<sqlite3_context>?
        get() = memberAt<CPointerVar<sqlite3_context>>(0).value
        set(value) { memberAt<CPointerVar<sqlite3_context>>(0).value = value }
    
    var pColl: CPointer<CollSeq>?
        get() = memberAt<CPointerVar<CollSeq>>(0).value
        set(value) { memberAt<CPointerVar<CollSeq>>(0).value = value }
    
    var pMem: CPointer<Mem>?
        get() = memberAt<CPointerVar<Mem>>(0).value
        set(value) { memberAt<CPointerVar<Mem>>(0).value = value }
    
    var pVtab: CPointer<VTable>?
        get() = memberAt<CPointerVar<VTable>>(0).value
        set(value) { memberAt<CPointerVar<VTable>>(0).value = value }
    
    var pKeyInfo: CPointer<KeyInfo>?
        get() = memberAt<CPointerVar<KeyInfo>>(0).value
        set(value) { memberAt<CPointerVar<KeyInfo>>(0).value = value }
    
    var ai: CPointer<IntVar>?
        get() = memberAt<CPointerVar<IntVar>>(0).value
        set(value) { memberAt<CPointerVar<IntVar>>(0).value = value }
    
    var pProgram: CPointer<SubProgram>?
        get() = memberAt<CPointerVar<SubProgram>>(0).value
        set(value) { memberAt<CPointerVar<SubProgram>>(0).value = value }
    
    var pTab: CPointer<Table>?
        get() = memberAt<CPointerVar<Table>>(0).value
        set(value) { memberAt<CPointerVar<Table>>(0).value = value }
    
    var xAdvance: CPointer<CFunction<(CPointer<BtCursor>?, Int) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<BtCursor>?, Int) -> Int>>>(0).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<BtCursor>?, Int) -> Int>>>(0).value = value }
}

@CStruct("struct { void* p0; unsigned char p1; void* p2; void* p3; void* p4; }")
class CollSeq(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(40, 8)
    
    var zName: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(0).value
        set(value) { memberAt<CPointerVar<ByteVar>>(0).value = value }
    
    var enc: u8
        get() = memberAt<u8Var>(8).value
        set(value) { memberAt<u8Var>(8).value = value }
    
    var pUser: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(16).value
        set(value) { memberAt<COpaquePointerVar>(16).value = value }
    
    var xCmp: CPointer<CFunction<(COpaquePointer?, Int, COpaquePointer?, Int, COpaquePointer?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?, Int, COpaquePointer?, Int, COpaquePointer?) -> Int>>>(24).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?, Int, COpaquePointer?, Int, COpaquePointer?) -> Int>>>(24).value = value }
    
    var xDel: CPointer<CFunction<(COpaquePointer?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Unit>>>(32).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Unit>>>(32).value = value }
}

@CStruct("struct { unsigned int p0; unsigned char p1; unsigned short p2; unsigned short p3; void* p4; void* p5; void* p6[1]; }")
class KeyInfo(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(40, 8)
    
    var nRef: u32
        get() = memberAt<u32Var>(0).value
        set(value) { memberAt<u32Var>(0).value = value }
    
    var enc: u8
        get() = memberAt<u8Var>(4).value
        set(value) { memberAt<u8Var>(4).value = value }
    
    var nKeyField: u16
        get() = memberAt<u16Var>(6).value
        set(value) { memberAt<u16Var>(6).value = value }
    
    var nAllField: u16
        get() = memberAt<u16Var>(8).value
        set(value) { memberAt<u16Var>(8).value = value }
    
    var db: CPointer<sqlite3>?
        get() = memberAt<CPointerVar<sqlite3>>(16).value
        set(value) { memberAt<CPointerVar<sqlite3>>(16).value = value }
    
    var aSortOrder: CPointer<u8Var>?
        get() = memberAt<CPointerVar<u8Var>>(24).value
        set(value) { memberAt<CPointerVar<u8Var>>(24).value = value }
    
    val aColl: CArrayPointer<CPointerVar<CollSeq>>
        get() = arrayMemberAt(32)
}

@CStruct("struct { unsigned char p0; unsigned char p1; unsigned char p2; unsigned char p3; int p4; void* p5; void* p6; void* p7; void* p8; void* p9; struct { long long p0; void* p1; unsigned int p2; unsigned short p3; unsigned short p4; } p10; long long p11; unsigned int p12; signed char p13; unsigned char p14; unsigned short p15; unsigned short p16[19]; void* p17; void* p18; void* p19[19]; }")
class BtCursor(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(296, 8)
    
    var eState: u8
        get() = memberAt<u8Var>(0).value
        set(value) { memberAt<u8Var>(0).value = value }
    
    var curFlags: u8
        get() = memberAt<u8Var>(1).value
        set(value) { memberAt<u8Var>(1).value = value }
    
    var curPagerFlags: u8
        get() = memberAt<u8Var>(2).value
        set(value) { memberAt<u8Var>(2).value = value }
    
    var hints: u8
        get() = memberAt<u8Var>(3).value
        set(value) { memberAt<u8Var>(3).value = value }
    
    var skipNext: Int
        get() = memberAt<IntVar>(4).value
        set(value) { memberAt<IntVar>(4).value = value }
    
    var pBtree: CPointer<Btree>?
        get() = memberAt<CPointerVar<Btree>>(8).value
        set(value) { memberAt<CPointerVar<Btree>>(8).value = value }
    
    var aOverflow: CPointer<PgnoVar>?
        get() = memberAt<CPointerVar<PgnoVar>>(16).value
        set(value) { memberAt<CPointerVar<PgnoVar>>(16).value = value }
    
    var pKey: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(24).value
        set(value) { memberAt<COpaquePointerVar>(24).value = value }
    
    var pBt: CPointer<BtShared>?
        get() = memberAt<CPointerVar<BtShared>>(32).value
        set(value) { memberAt<CPointerVar<BtShared>>(32).value = value }
    
    var pNext: CPointer<BtCursor>?
        get() = memberAt<CPointerVar<BtCursor>>(40).value
        set(value) { memberAt<CPointerVar<BtCursor>>(40).value = value }
    
    val info: CellInfo
        get() = memberAt(48)
    
    var nKey: i64
        get() = memberAt<i64Var>(72).value
        set(value) { memberAt<i64Var>(72).value = value }
    
    var pgnoRoot: Pgno
        get() = memberAt<PgnoVar>(80).value
        set(value) { memberAt<PgnoVar>(80).value = value }
    
    var iPage: i8
        get() = memberAt<i8Var>(84).value
        set(value) { memberAt<i8Var>(84).value = value }
    
    var curIntKey: u8
        get() = memberAt<u8Var>(85).value
        set(value) { memberAt<u8Var>(85).value = value }
    
    var ix: u16
        get() = memberAt<u16Var>(86).value
        set(value) { memberAt<u16Var>(86).value = value }
    
    val aiIdx: CArrayPointer<u16Var>
        get() = arrayMemberAt(88)
    
    var pKeyInfo: CPointer<KeyInfo>?
        get() = memberAt<CPointerVar<KeyInfo>>(128).value
        set(value) { memberAt<CPointerVar<KeyInfo>>(128).value = value }
    
    var pPage: CPointer<MemPage>?
        get() = memberAt<CPointerVar<MemPage>>(136).value
        set(value) { memberAt<CPointerVar<MemPage>>(136).value = value }
    
    val apPage: CArrayPointer<CPointerVar<MemPage>>
        get() = arrayMemberAt(144)
}

@CStruct("struct { void* p0; void* p1; unsigned char p2; unsigned char p3; unsigned char p4; unsigned char p5; int p6; int p7; unsigned int p8; void* p9; void* p10; struct { void* p0; unsigned int p1; unsigned char p2; void* p3; } p11; }")
class Btree(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(72, 8)
    
    var db: CPointer<sqlite3>?
        get() = memberAt<CPointerVar<sqlite3>>(0).value
        set(value) { memberAt<CPointerVar<sqlite3>>(0).value = value }
    
    var pBt: CPointer<BtShared>?
        get() = memberAt<CPointerVar<BtShared>>(8).value
        set(value) { memberAt<CPointerVar<BtShared>>(8).value = value }
    
    var inTrans: u8
        get() = memberAt<u8Var>(16).value
        set(value) { memberAt<u8Var>(16).value = value }
    
    var sharable: u8
        get() = memberAt<u8Var>(17).value
        set(value) { memberAt<u8Var>(17).value = value }
    
    var locked: u8
        get() = memberAt<u8Var>(18).value
        set(value) { memberAt<u8Var>(18).value = value }
    
    var hasIncrblobCur: u8
        get() = memberAt<u8Var>(19).value
        set(value) { memberAt<u8Var>(19).value = value }
    
    var wantToLock: Int
        get() = memberAt<IntVar>(20).value
        set(value) { memberAt<IntVar>(20).value = value }
    
    var nBackup: Int
        get() = memberAt<IntVar>(24).value
        set(value) { memberAt<IntVar>(24).value = value }
    
    var iDataVersion: u32
        get() = memberAt<u32Var>(28).value
        set(value) { memberAt<u32Var>(28).value = value }
    
    var pNext: CPointer<Btree>?
        get() = memberAt<CPointerVar<Btree>>(32).value
        set(value) { memberAt<CPointerVar<Btree>>(32).value = value }
    
    var pPrev: CPointer<Btree>?
        get() = memberAt<CPointerVar<Btree>>(40).value
        set(value) { memberAt<CPointerVar<Btree>>(40).value = value }
    
    val lock: BtLock
        get() = memberAt(48)
}

@CStruct("struct { void* p0; void* p1; void* p2; void* p3; unsigned char p4; unsigned char p5; unsigned char p6; unsigned char p7; unsigned char p8; unsigned char p9; unsigned short p10; unsigned short p11; unsigned short p12; unsigned short p13; unsigned short p14; unsigned int p15; unsigned int p16; int p17; unsigned int p18; void* p19; void* p20; void* p21; void* p22; int p23; void* p24; void* p25; void* p26; void* p27; }")
class BtShared(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(136, 8)
    
    var pPager: CPointer<Pager>?
        get() = memberAt<CPointerVar<Pager>>(0).value
        set(value) { memberAt<CPointerVar<Pager>>(0).value = value }
    
    var db: CPointer<sqlite3>?
        get() = memberAt<CPointerVar<sqlite3>>(8).value
        set(value) { memberAt<CPointerVar<sqlite3>>(8).value = value }
    
    var pCursor: CPointer<BtCursor>?
        get() = memberAt<CPointerVar<BtCursor>>(16).value
        set(value) { memberAt<CPointerVar<BtCursor>>(16).value = value }
    
    var pPage1: CPointer<MemPage>?
        get() = memberAt<CPointerVar<MemPage>>(24).value
        set(value) { memberAt<CPointerVar<MemPage>>(24).value = value }
    
    var openFlags: u8
        get() = memberAt<u8Var>(32).value
        set(value) { memberAt<u8Var>(32).value = value }
    
    var autoVacuum: u8
        get() = memberAt<u8Var>(33).value
        set(value) { memberAt<u8Var>(33).value = value }
    
    var incrVacuum: u8
        get() = memberAt<u8Var>(34).value
        set(value) { memberAt<u8Var>(34).value = value }
    
    var bDoTruncate: u8
        get() = memberAt<u8Var>(35).value
        set(value) { memberAt<u8Var>(35).value = value }
    
    var inTransaction: u8
        get() = memberAt<u8Var>(36).value
        set(value) { memberAt<u8Var>(36).value = value }
    
    var max1bytePayload: u8
        get() = memberAt<u8Var>(37).value
        set(value) { memberAt<u8Var>(37).value = value }
    
    var btsFlags: u16
        get() = memberAt<u16Var>(38).value
        set(value) { memberAt<u16Var>(38).value = value }
    
    var maxLocal: u16
        get() = memberAt<u16Var>(40).value
        set(value) { memberAt<u16Var>(40).value = value }
    
    var minLocal: u16
        get() = memberAt<u16Var>(42).value
        set(value) { memberAt<u16Var>(42).value = value }
    
    var maxLeaf: u16
        get() = memberAt<u16Var>(44).value
        set(value) { memberAt<u16Var>(44).value = value }
    
    var minLeaf: u16
        get() = memberAt<u16Var>(46).value
        set(value) { memberAt<u16Var>(46).value = value }
    
    var pageSize: u32
        get() = memberAt<u32Var>(48).value
        set(value) { memberAt<u32Var>(48).value = value }
    
    var usableSize: u32
        get() = memberAt<u32Var>(52).value
        set(value) { memberAt<u32Var>(52).value = value }
    
    var nTransaction: Int
        get() = memberAt<IntVar>(56).value
        set(value) { memberAt<IntVar>(56).value = value }
    
    var nPage: u32
        get() = memberAt<u32Var>(60).value
        set(value) { memberAt<u32Var>(60).value = value }
    
    var pSchema: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(64).value
        set(value) { memberAt<COpaquePointerVar>(64).value = value }
    
    var xFreeSchema: CPointer<CFunction<(COpaquePointer?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Unit>>>(72).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Unit>>>(72).value = value }
    
    var mutex: CPointer<sqlite3_mutex>?
        get() = memberAt<CPointerVar<sqlite3_mutex>>(80).value
        set(value) { memberAt<CPointerVar<sqlite3_mutex>>(80).value = value }
    
    var pHasContent: CPointer<Bitvec>?
        get() = memberAt<CPointerVar<Bitvec>>(88).value
        set(value) { memberAt<CPointerVar<Bitvec>>(88).value = value }
    
    var nRef: Int
        get() = memberAt<IntVar>(96).value
        set(value) { memberAt<IntVar>(96).value = value }
    
    var pNext: CPointer<BtShared>?
        get() = memberAt<CPointerVar<BtShared>>(104).value
        set(value) { memberAt<CPointerVar<BtShared>>(104).value = value }
    
    var pLock: CPointer<BtLock>?
        get() = memberAt<CPointerVar<BtLock>>(112).value
        set(value) { memberAt<CPointerVar<BtLock>>(112).value = value }
    
    var pWriter: CPointer<Btree>?
        get() = memberAt<CPointerVar<Btree>>(120).value
        set(value) { memberAt<CPointerVar<Btree>>(120).value = value }
    
    var pTmpSpace: CPointer<u8Var>?
        get() = memberAt<CPointerVar<u8Var>>(128).value
        set(value) { memberAt<CPointerVar<u8Var>>(128).value = value }
}

@CStruct("struct { void* p0; unsigned char p1; unsigned char p2; unsigned char p3; unsigned char p4; unsigned char p5; unsigned char p6; unsigned char p7; unsigned char p8; unsigned char p9; unsigned char p10; unsigned char p11; unsigned char p12; unsigned char p13; unsigned char p14; unsigned char p15; unsigned char p16; unsigned char p17; unsigned char p18; unsigned char p19; unsigned char p20; unsigned int p21; unsigned int p22; unsigned int p23; unsigned int p24; int p25; int p26; unsigned int p27; unsigned int p28; void* p29; void* p30; void* p31; void* p32; long long p33; long long p34; void* p35; void* p36; int p37; unsigned int p38; char p39[16]; int p40; long long p41; void* p42; unsigned short p43; short p44; unsigned int p45; unsigned int p46; int p47; unsigned int p48; long long p49; void* p50; void* p51; void* p52; void* p53; int p54[4]; void* p55; void* p56; void* p57; void* p58; void* p59; void* p60; }")
class Pager(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(304, 8)
    
    var pVfs: CPointer<sqlite3_vfs>?
        get() = memberAt<CPointerVar<sqlite3_vfs>>(0).value
        set(value) { memberAt<CPointerVar<sqlite3_vfs>>(0).value = value }
    
    var exclusiveMode: u8
        get() = memberAt<u8Var>(8).value
        set(value) { memberAt<u8Var>(8).value = value }
    
    var journalMode: u8
        get() = memberAt<u8Var>(9).value
        set(value) { memberAt<u8Var>(9).value = value }
    
    var useJournal: u8
        get() = memberAt<u8Var>(10).value
        set(value) { memberAt<u8Var>(10).value = value }
    
    var noSync: u8
        get() = memberAt<u8Var>(11).value
        set(value) { memberAt<u8Var>(11).value = value }
    
    var fullSync: u8
        get() = memberAt<u8Var>(12).value
        set(value) { memberAt<u8Var>(12).value = value }
    
    var extraSync: u8
        get() = memberAt<u8Var>(13).value
        set(value) { memberAt<u8Var>(13).value = value }
    
    var syncFlags: u8
        get() = memberAt<u8Var>(14).value
        set(value) { memberAt<u8Var>(14).value = value }
    
    var walSyncFlags: u8
        get() = memberAt<u8Var>(15).value
        set(value) { memberAt<u8Var>(15).value = value }
    
    var tempFile: u8
        get() = memberAt<u8Var>(16).value
        set(value) { memberAt<u8Var>(16).value = value }
    
    var noLock: u8
        get() = memberAt<u8Var>(17).value
        set(value) { memberAt<u8Var>(17).value = value }
    
    var readOnly: u8
        get() = memberAt<u8Var>(18).value
        set(value) { memberAt<u8Var>(18).value = value }
    
    var memDb: u8
        get() = memberAt<u8Var>(19).value
        set(value) { memberAt<u8Var>(19).value = value }
    
    var eState: u8
        get() = memberAt<u8Var>(20).value
        set(value) { memberAt<u8Var>(20).value = value }
    
    var eLock: u8
        get() = memberAt<u8Var>(21).value
        set(value) { memberAt<u8Var>(21).value = value }
    
    var changeCountDone: u8
        get() = memberAt<u8Var>(22).value
        set(value) { memberAt<u8Var>(22).value = value }
    
    var setMaster: u8
        get() = memberAt<u8Var>(23).value
        set(value) { memberAt<u8Var>(23).value = value }
    
    var doNotSpill: u8
        get() = memberAt<u8Var>(24).value
        set(value) { memberAt<u8Var>(24).value = value }
    
    var subjInMemory: u8
        get() = memberAt<u8Var>(25).value
        set(value) { memberAt<u8Var>(25).value = value }
    
    var bUseFetch: u8
        get() = memberAt<u8Var>(26).value
        set(value) { memberAt<u8Var>(26).value = value }
    
    var hasHeldSharedLock: u8
        get() = memberAt<u8Var>(27).value
        set(value) { memberAt<u8Var>(27).value = value }
    
    var dbSize: Pgno
        get() = memberAt<PgnoVar>(28).value
        set(value) { memberAt<PgnoVar>(28).value = value }
    
    var dbOrigSize: Pgno
        get() = memberAt<PgnoVar>(32).value
        set(value) { memberAt<PgnoVar>(32).value = value }
    
    var dbFileSize: Pgno
        get() = memberAt<PgnoVar>(36).value
        set(value) { memberAt<PgnoVar>(36).value = value }
    
    var dbHintSize: Pgno
        get() = memberAt<PgnoVar>(40).value
        set(value) { memberAt<PgnoVar>(40).value = value }
    
    var errCode: Int
        get() = memberAt<IntVar>(44).value
        set(value) { memberAt<IntVar>(44).value = value }
    
    var nRec: Int
        get() = memberAt<IntVar>(48).value
        set(value) { memberAt<IntVar>(48).value = value }
    
    var cksumInit: u32
        get() = memberAt<u32Var>(52).value
        set(value) { memberAt<u32Var>(52).value = value }
    
    var nSubRec: u32
        get() = memberAt<u32Var>(56).value
        set(value) { memberAt<u32Var>(56).value = value }
    
    var pInJournal: CPointer<Bitvec>?
        get() = memberAt<CPointerVar<Bitvec>>(64).value
        set(value) { memberAt<CPointerVar<Bitvec>>(64).value = value }
    
    var fd: CPointer<sqlite3_file>?
        get() = memberAt<CPointerVar<sqlite3_file>>(72).value
        set(value) { memberAt<CPointerVar<sqlite3_file>>(72).value = value }
    
    var jfd: CPointer<sqlite3_file>?
        get() = memberAt<CPointerVar<sqlite3_file>>(80).value
        set(value) { memberAt<CPointerVar<sqlite3_file>>(80).value = value }
    
    var sjfd: CPointer<sqlite3_file>?
        get() = memberAt<CPointerVar<sqlite3_file>>(88).value
        set(value) { memberAt<CPointerVar<sqlite3_file>>(88).value = value }
    
    var journalOff: i64
        get() = memberAt<i64Var>(96).value
        set(value) { memberAt<i64Var>(96).value = value }
    
    var journalHdr: i64
        get() = memberAt<i64Var>(104).value
        set(value) { memberAt<i64Var>(104).value = value }
    
    var pBackup: CPointer<sqlite3_backup>?
        get() = memberAt<CPointerVar<sqlite3_backup>>(112).value
        set(value) { memberAt<CPointerVar<sqlite3_backup>>(112).value = value }
    
    var aSavepoint: CPointer<PagerSavepoint>?
        get() = memberAt<CPointerVar<PagerSavepoint>>(120).value
        set(value) { memberAt<CPointerVar<PagerSavepoint>>(120).value = value }
    
    var nSavepoint: Int
        get() = memberAt<IntVar>(128).value
        set(value) { memberAt<IntVar>(128).value = value }
    
    var iDataVersion: u32
        get() = memberAt<u32Var>(132).value
        set(value) { memberAt<u32Var>(132).value = value }
    
    val dbFileVers: CArrayPointer<ByteVar>
        get() = arrayMemberAt(136)
    
    var nMmapOut: Int
        get() = memberAt<IntVar>(152).value
        set(value) { memberAt<IntVar>(152).value = value }
    
    var szMmap: sqlite3_int64
        get() = memberAt<sqlite3_int64Var>(160).value
        set(value) { memberAt<sqlite3_int64Var>(160).value = value }
    
    var pMmapFreelist: CPointer<PgHdr>?
        get() = memberAt<CPointerVar<PgHdr>>(168).value
        set(value) { memberAt<CPointerVar<PgHdr>>(168).value = value }
    
    var nExtra: u16
        get() = memberAt<u16Var>(176).value
        set(value) { memberAt<u16Var>(176).value = value }
    
    var nReserve: i16
        get() = memberAt<i16Var>(178).value
        set(value) { memberAt<i16Var>(178).value = value }
    
    var vfsFlags: u32
        get() = memberAt<u32Var>(180).value
        set(value) { memberAt<u32Var>(180).value = value }
    
    var sectorSize: u32
        get() = memberAt<u32Var>(184).value
        set(value) { memberAt<u32Var>(184).value = value }
    
    var pageSize: Int
        get() = memberAt<IntVar>(188).value
        set(value) { memberAt<IntVar>(188).value = value }
    
    var mxPgno: Pgno
        get() = memberAt<PgnoVar>(192).value
        set(value) { memberAt<PgnoVar>(192).value = value }
    
    var journalSizeLimit: i64
        get() = memberAt<i64Var>(200).value
        set(value) { memberAt<i64Var>(200).value = value }
    
    var zFilename: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(208).value
        set(value) { memberAt<CPointerVar<ByteVar>>(208).value = value }
    
    var zJournal: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(216).value
        set(value) { memberAt<CPointerVar<ByteVar>>(216).value = value }
    
    var xBusyHandler: CPointer<CFunction<(COpaquePointer?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Int>>>(224).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Int>>>(224).value = value }
    
    var pBusyHandlerArg: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(232).value
        set(value) { memberAt<COpaquePointerVar>(232).value = value }
    
    val aStat: CArrayPointer<IntVar>
        get() = arrayMemberAt(240)
    
    var xReiniter: CPointer<CFunction<(CPointer<DbPage>?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<DbPage>?) -> Unit>>>(256).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<DbPage>?) -> Unit>>>(256).value = value }
    
    var xGet: CPointer<CFunction<(CPointer<Pager>?, Pgno, CPointer<CPointerVar<DbPage>>?, Int) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<Pager>?, Pgno, CPointer<CPointerVar<DbPage>>?, Int) -> Int>>>(264).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<Pager>?, Pgno, CPointer<CPointerVar<DbPage>>?, Int) -> Int>>>(264).value = value }
    
    var pTmpSpace: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(272).value
        set(value) { memberAt<CPointerVar<ByteVar>>(272).value = value }
    
    var pPCache: CPointer<PCache>?
        get() = memberAt<CPointerVar<PCache>>(280).value
        set(value) { memberAt<CPointerVar<PCache>>(280).value = value }
    
    var pWal: CPointer<Wal>?
        get() = memberAt<CPointerVar<Wal>>(288).value
        set(value) { memberAt<CPointerVar<Wal>>(288).value = value }
    
    var zWal: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(296).value
        set(value) { memberAt<CPointerVar<ByteVar>>(296).value = value }
}

@CStruct("struct { unsigned int p0; unsigned int p1; unsigned int p2; union { unsigned char p0[496]; unsigned int p1[124]; void* p2[62]; } p3; }")
class Bitvec(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(512, 8)
    
    var iSize: u32
        get() = memberAt<u32Var>(0).value
        set(value) { memberAt<u32Var>(0).value = value }
    
    var nSet: u32
        get() = memberAt<u32Var>(4).value
        set(value) { memberAt<u32Var>(4).value = value }
    
    var iDivisor: u32
        get() = memberAt<u32Var>(8).value
        set(value) { memberAt<u32Var>(8).value = value }
    
    val u: anonymousStruct11
        get() = memberAt(16)
}

@CStruct("union { unsigned char p0[496]; unsigned int p1[124]; void* p2[62]; }")
class anonymousStruct11(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(496, 8)
    
    val aBitmap: CArrayPointer<u8Var>
        get() = arrayMemberAt(0)
    
    val aHash: CArrayPointer<u32Var>
        get() = arrayMemberAt(0)
    
    val apSub: CArrayPointer<CPointerVar<Bitvec>>
        get() = arrayMemberAt(0)
}

@CStruct("struct { void* p0; void* p1; unsigned int p2; int p3; unsigned int p4; void* p5; void* p6; int p7; unsigned int p8; unsigned int p9; int p10; void* p11; }")
class sqlite3_backup(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(72, 8)
    
    var pDestDb: CPointer<sqlite3>?
        get() = memberAt<CPointerVar<sqlite3>>(0).value
        set(value) { memberAt<CPointerVar<sqlite3>>(0).value = value }
    
    var pDest: CPointer<Btree>?
        get() = memberAt<CPointerVar<Btree>>(8).value
        set(value) { memberAt<CPointerVar<Btree>>(8).value = value }
    
    var iDestSchema: u32
        get() = memberAt<u32Var>(16).value
        set(value) { memberAt<u32Var>(16).value = value }
    
    var bDestLocked: Int
        get() = memberAt<IntVar>(20).value
        set(value) { memberAt<IntVar>(20).value = value }
    
    var iNext: Pgno
        get() = memberAt<PgnoVar>(24).value
        set(value) { memberAt<PgnoVar>(24).value = value }
    
    var pSrcDb: CPointer<sqlite3>?
        get() = memberAt<CPointerVar<sqlite3>>(32).value
        set(value) { memberAt<CPointerVar<sqlite3>>(32).value = value }
    
    var pSrc: CPointer<Btree>?
        get() = memberAt<CPointerVar<Btree>>(40).value
        set(value) { memberAt<CPointerVar<Btree>>(40).value = value }
    
    var rc: Int
        get() = memberAt<IntVar>(48).value
        set(value) { memberAt<IntVar>(48).value = value }
    
    var nRemaining: Pgno
        get() = memberAt<PgnoVar>(52).value
        set(value) { memberAt<PgnoVar>(52).value = value }
    
    var nPagecount: Pgno
        get() = memberAt<PgnoVar>(56).value
        set(value) { memberAt<PgnoVar>(56).value = value }
    
    var isAttached: Int
        get() = memberAt<IntVar>(60).value
        set(value) { memberAt<IntVar>(60).value = value }
    
    var pNext: CPointer<sqlite3_backup>?
        get() = memberAt<CPointerVar<sqlite3_backup>>(64).value
        set(value) { memberAt<CPointerVar<sqlite3_backup>>(64).value = value }
}

@CStruct("struct { long long p0; long long p1; void* p2; unsigned int p3; unsigned int p4; unsigned int p5[4]; }")
class PagerSavepoint(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(48, 8)
    
    var iOffset: i64
        get() = memberAt<i64Var>(0).value
        set(value) { memberAt<i64Var>(0).value = value }
    
    var iHdrOffset: i64
        get() = memberAt<i64Var>(8).value
        set(value) { memberAt<i64Var>(8).value = value }
    
    var pInSavepoint: CPointer<Bitvec>?
        get() = memberAt<CPointerVar<Bitvec>>(16).value
        set(value) { memberAt<CPointerVar<Bitvec>>(16).value = value }
    
    var nOrig: Pgno
        get() = memberAt<PgnoVar>(24).value
        set(value) { memberAt<PgnoVar>(24).value = value }
    
    var iSubRec: Pgno
        get() = memberAt<PgnoVar>(28).value
        set(value) { memberAt<PgnoVar>(28).value = value }
    
    val aWalData: CArrayPointer<u32Var>
        get() = arrayMemberAt(32)
}

@CStruct("struct { void* p0; void* p1; void* p2; void* p3; void* p4; void* p5; unsigned int p6; unsigned short p7; short p8; void* p9; void* p10; }")
class PgHdr(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(72, 8)
    
    var pPage: CPointer<sqlite3_pcache_page>?
        get() = memberAt<CPointerVar<sqlite3_pcache_page>>(0).value
        set(value) { memberAt<CPointerVar<sqlite3_pcache_page>>(0).value = value }
    
    var pData: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(8).value
        set(value) { memberAt<COpaquePointerVar>(8).value = value }
    
    var pExtra: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(16).value
        set(value) { memberAt<COpaquePointerVar>(16).value = value }
    
    var pCache: CPointer<PCache>?
        get() = memberAt<CPointerVar<PCache>>(24).value
        set(value) { memberAt<CPointerVar<PCache>>(24).value = value }
    
    var pDirty: CPointer<PgHdr>?
        get() = memberAt<CPointerVar<PgHdr>>(32).value
        set(value) { memberAt<CPointerVar<PgHdr>>(32).value = value }
    
    var pPager: CPointer<Pager>?
        get() = memberAt<CPointerVar<Pager>>(40).value
        set(value) { memberAt<CPointerVar<Pager>>(40).value = value }
    
    var pgno: Pgno
        get() = memberAt<PgnoVar>(48).value
        set(value) { memberAt<PgnoVar>(48).value = value }
    
    var flags: u16
        get() = memberAt<u16Var>(52).value
        set(value) { memberAt<u16Var>(52).value = value }
    
    var nRef: i16
        get() = memberAt<i16Var>(54).value
        set(value) { memberAt<i16Var>(54).value = value }
    
    var pDirtyNext: CPointer<PgHdr>?
        get() = memberAt<CPointerVar<PgHdr>>(56).value
        set(value) { memberAt<CPointerVar<PgHdr>>(56).value = value }
    
    var pDirtyPrev: CPointer<PgHdr>?
        get() = memberAt<CPointerVar<PgHdr>>(64).value
        set(value) { memberAt<CPointerVar<PgHdr>>(64).value = value }
}

@CStruct("struct { void* p0; void* p1; }")
class sqlite3_pcache_page(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 8)
    
    var pBuf: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(0).value
        set(value) { memberAt<COpaquePointerVar>(0).value = value }
    
    var pExtra: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(8).value
        set(value) { memberAt<COpaquePointerVar>(8).value = value }
}

@CStruct("struct { void* p0; void* p1; void* p2; int p3; int p4; int p5; int p6; int p7; unsigned char p8; unsigned char p9; void* p10; void* p11; void* p12; }")
class PCache(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(72, 8)
    
    var pDirty: CPointer<PgHdr>?
        get() = memberAt<CPointerVar<PgHdr>>(0).value
        set(value) { memberAt<CPointerVar<PgHdr>>(0).value = value }
    
    var pDirtyTail: CPointer<PgHdr>?
        get() = memberAt<CPointerVar<PgHdr>>(8).value
        set(value) { memberAt<CPointerVar<PgHdr>>(8).value = value }
    
    var pSynced: CPointer<PgHdr>?
        get() = memberAt<CPointerVar<PgHdr>>(16).value
        set(value) { memberAt<CPointerVar<PgHdr>>(16).value = value }
    
    var nRefSum: Int
        get() = memberAt<IntVar>(24).value
        set(value) { memberAt<IntVar>(24).value = value }
    
    var szCache: Int
        get() = memberAt<IntVar>(28).value
        set(value) { memberAt<IntVar>(28).value = value }
    
    var szSpill: Int
        get() = memberAt<IntVar>(32).value
        set(value) { memberAt<IntVar>(32).value = value }
    
    var szPage: Int
        get() = memberAt<IntVar>(36).value
        set(value) { memberAt<IntVar>(36).value = value }
    
    var szExtra: Int
        get() = memberAt<IntVar>(40).value
        set(value) { memberAt<IntVar>(40).value = value }
    
    var bPurgeable: u8
        get() = memberAt<u8Var>(44).value
        set(value) { memberAt<u8Var>(44).value = value }
    
    var eCreate: u8
        get() = memberAt<u8Var>(45).value
        set(value) { memberAt<u8Var>(45).value = value }
    
    var xStress: CPointer<CFunction<(COpaquePointer?, CPointer<PgHdr>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?, CPointer<PgHdr>?) -> Int>>>(48).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?, CPointer<PgHdr>?) -> Int>>>(48).value = value }
    
    var pStress: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(56).value
        set(value) { memberAt<COpaquePointerVar>(56).value = value }
    
    var pCache: CPointer<sqlite3_pcache>?
        get() = memberAt<CPointerVar<sqlite3_pcache>>(64).value
        set(value) { memberAt<CPointerVar<sqlite3_pcache>>(64).value = value }
}

@CStruct("struct { void* p0; void* p1; void* p2; unsigned int p3; long long p4; int p5; int p6; void* p7; unsigned int p8; short p9; unsigned char p10; unsigned char p11; unsigned char p12; unsigned char p13; unsigned char p14; unsigned char p15; unsigned char p16; unsigned char p17; unsigned char p18; struct { unsigned int p0; unsigned int p1; unsigned int p2; unsigned char p3; unsigned char p4; unsigned short p5; unsigned int p6; unsigned int p7; unsigned int p8[2]; unsigned int p9[2]; unsigned int p10[2]; } p19; unsigned int p20; unsigned int p21; void* p22; unsigned int p23; }")
class Wal(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(144, 8)
    
    var pVfs: CPointer<sqlite3_vfs>?
        get() = memberAt<CPointerVar<sqlite3_vfs>>(0).value
        set(value) { memberAt<CPointerVar<sqlite3_vfs>>(0).value = value }
    
    var pDbFd: CPointer<sqlite3_file>?
        get() = memberAt<CPointerVar<sqlite3_file>>(8).value
        set(value) { memberAt<CPointerVar<sqlite3_file>>(8).value = value }
    
    var pWalFd: CPointer<sqlite3_file>?
        get() = memberAt<CPointerVar<sqlite3_file>>(16).value
        set(value) { memberAt<CPointerVar<sqlite3_file>>(16).value = value }
    
    var iCallback: u32
        get() = memberAt<u32Var>(24).value
        set(value) { memberAt<u32Var>(24).value = value }
    
    var mxWalSize: i64
        get() = memberAt<i64Var>(32).value
        set(value) { memberAt<i64Var>(32).value = value }
    
    var nWiData: Int
        get() = memberAt<IntVar>(40).value
        set(value) { memberAt<IntVar>(40).value = value }
    
    var szFirstBlock: Int
        get() = memberAt<IntVar>(44).value
        set(value) { memberAt<IntVar>(44).value = value }
    
    var apWiData: CPointer<CPointerVar<u32Var>>?
        get() = memberAt<CPointerVar<CPointerVar<u32Var>>>(48).value
        set(value) { memberAt<CPointerVar<CPointerVar<u32Var>>>(48).value = value }
    
    var szPage: u32
        get() = memberAt<u32Var>(56).value
        set(value) { memberAt<u32Var>(56).value = value }
    
    var readLock: i16
        get() = memberAt<i16Var>(60).value
        set(value) { memberAt<i16Var>(60).value = value }
    
    var syncFlags: u8
        get() = memberAt<u8Var>(62).value
        set(value) { memberAt<u8Var>(62).value = value }
    
    var exclusiveMode: u8
        get() = memberAt<u8Var>(63).value
        set(value) { memberAt<u8Var>(63).value = value }
    
    var writeLock: u8
        get() = memberAt<u8Var>(64).value
        set(value) { memberAt<u8Var>(64).value = value }
    
    var ckptLock: u8
        get() = memberAt<u8Var>(65).value
        set(value) { memberAt<u8Var>(65).value = value }
    
    var readOnly: u8
        get() = memberAt<u8Var>(66).value
        set(value) { memberAt<u8Var>(66).value = value }
    
    var truncateOnCommit: u8
        get() = memberAt<u8Var>(67).value
        set(value) { memberAt<u8Var>(67).value = value }
    
    var syncHeader: u8
        get() = memberAt<u8Var>(68).value
        set(value) { memberAt<u8Var>(68).value = value }
    
    var padToSectorBoundary: u8
        get() = memberAt<u8Var>(69).value
        set(value) { memberAt<u8Var>(69).value = value }
    
    var bShmUnreliable: u8
        get() = memberAt<u8Var>(70).value
        set(value) { memberAt<u8Var>(70).value = value }
    
    val hdr: WalIndexHdr
        get() = memberAt(72)
    
    var minFrame: u32
        get() = memberAt<u32Var>(120).value
        set(value) { memberAt<u32Var>(120).value = value }
    
    var iReCksum: u32
        get() = memberAt<u32Var>(124).value
        set(value) { memberAt<u32Var>(124).value = value }
    
    var zWalName: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(128).value
        set(value) { memberAt<CPointerVar<ByteVar>>(128).value = value }
    
    var nCkpt: u32
        get() = memberAt<u32Var>(136).value
        set(value) { memberAt<u32Var>(136).value = value }
}

@CStruct("struct { unsigned int p0; unsigned int p1; unsigned int p2; unsigned char p3; unsigned char p4; unsigned short p5; unsigned int p6; unsigned int p7; unsigned int p8[2]; unsigned int p9[2]; unsigned int p10[2]; }")
class WalIndexHdr(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(48, 4)
    
    var iVersion: u32
        get() = memberAt<u32Var>(0).value
        set(value) { memberAt<u32Var>(0).value = value }
    
    var unused: u32
        get() = memberAt<u32Var>(4).value
        set(value) { memberAt<u32Var>(4).value = value }
    
    var iChange: u32
        get() = memberAt<u32Var>(8).value
        set(value) { memberAt<u32Var>(8).value = value }
    
    var isInit: u8
        get() = memberAt<u8Var>(12).value
        set(value) { memberAt<u8Var>(12).value = value }
    
    var bigEndCksum: u8
        get() = memberAt<u8Var>(13).value
        set(value) { memberAt<u8Var>(13).value = value }
    
    var szPage: u16
        get() = memberAt<u16Var>(14).value
        set(value) { memberAt<u16Var>(14).value = value }
    
    var mxFrame: u32
        get() = memberAt<u32Var>(16).value
        set(value) { memberAt<u32Var>(16).value = value }
    
    var nPage: u32
        get() = memberAt<u32Var>(20).value
        set(value) { memberAt<u32Var>(20).value = value }
    
    val aFrameCksum: CArrayPointer<u32Var>
        get() = arrayMemberAt(24)
    
    val aSalt: CArrayPointer<u32Var>
        get() = arrayMemberAt(32)
    
    val aCksum: CArrayPointer<u32Var>
        get() = arrayMemberAt(40)
}

@CStruct("struct { unsigned char p0; unsigned char p1; unsigned char p2; unsigned char p3; unsigned int p4; unsigned char p5; unsigned char p6; unsigned char p7; unsigned char p8; unsigned char p9; unsigned short p10; unsigned short p11; unsigned short p12; unsigned short p13; unsigned short p14; unsigned short p15; unsigned short p16[4]; void* p17[4]; void* p18; void* p19; void* p20; void* p21; void* p22; void* p23; void* p24; void* p25; }")
class MemPage(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(136, 8)
    
    var isInit: u8
        get() = memberAt<u8Var>(0).value
        set(value) { memberAt<u8Var>(0).value = value }
    
    var bBusy: u8
        get() = memberAt<u8Var>(1).value
        set(value) { memberAt<u8Var>(1).value = value }
    
    var intKey: u8
        get() = memberAt<u8Var>(2).value
        set(value) { memberAt<u8Var>(2).value = value }
    
    var intKeyLeaf: u8
        get() = memberAt<u8Var>(3).value
        set(value) { memberAt<u8Var>(3).value = value }
    
    var pgno: Pgno
        get() = memberAt<PgnoVar>(4).value
        set(value) { memberAt<PgnoVar>(4).value = value }
    
    var leaf: u8
        get() = memberAt<u8Var>(8).value
        set(value) { memberAt<u8Var>(8).value = value }
    
    var hdrOffset: u8
        get() = memberAt<u8Var>(9).value
        set(value) { memberAt<u8Var>(9).value = value }
    
    var childPtrSize: u8
        get() = memberAt<u8Var>(10).value
        set(value) { memberAt<u8Var>(10).value = value }
    
    var max1bytePayload: u8
        get() = memberAt<u8Var>(11).value
        set(value) { memberAt<u8Var>(11).value = value }
    
    var nOverflow: u8
        get() = memberAt<u8Var>(12).value
        set(value) { memberAt<u8Var>(12).value = value }
    
    var maxLocal: u16
        get() = memberAt<u16Var>(14).value
        set(value) { memberAt<u16Var>(14).value = value }
    
    var minLocal: u16
        get() = memberAt<u16Var>(16).value
        set(value) { memberAt<u16Var>(16).value = value }
    
    var cellOffset: u16
        get() = memberAt<u16Var>(18).value
        set(value) { memberAt<u16Var>(18).value = value }
    
    var nFree: u16
        get() = memberAt<u16Var>(20).value
        set(value) { memberAt<u16Var>(20).value = value }
    
    var nCell: u16
        get() = memberAt<u16Var>(22).value
        set(value) { memberAt<u16Var>(22).value = value }
    
    var maskPage: u16
        get() = memberAt<u16Var>(24).value
        set(value) { memberAt<u16Var>(24).value = value }
    
    val aiOvfl: CArrayPointer<u16Var>
        get() = arrayMemberAt(26)
    
    val apOvfl: CArrayPointer<CPointerVar<u8Var>>
        get() = arrayMemberAt(40)
    
    var pBt: CPointer<BtShared>?
        get() = memberAt<CPointerVar<BtShared>>(72).value
        set(value) { memberAt<CPointerVar<BtShared>>(72).value = value }
    
    var aData: CPointer<u8Var>?
        get() = memberAt<CPointerVar<u8Var>>(80).value
        set(value) { memberAt<CPointerVar<u8Var>>(80).value = value }
    
    var aDataEnd: CPointer<u8Var>?
        get() = memberAt<CPointerVar<u8Var>>(88).value
        set(value) { memberAt<CPointerVar<u8Var>>(88).value = value }
    
    var aCellIdx: CPointer<u8Var>?
        get() = memberAt<CPointerVar<u8Var>>(96).value
        set(value) { memberAt<CPointerVar<u8Var>>(96).value = value }
    
    var aDataOfst: CPointer<u8Var>?
        get() = memberAt<CPointerVar<u8Var>>(104).value
        set(value) { memberAt<CPointerVar<u8Var>>(104).value = value }
    
    var pDbPage: CPointer<DbPage>?
        get() = memberAt<CPointerVar<DbPage>>(112).value
        set(value) { memberAt<CPointerVar<DbPage>>(112).value = value }
    
    var xCellSize: CPointer<CFunction<(CPointer<MemPage>?, CPointer<u8Var>?) -> u16>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<MemPage>?, CPointer<u8Var>?) -> u16>>>(120).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<MemPage>?, CPointer<u8Var>?) -> u16>>>(120).value = value }
    
    var xParseCell: CPointer<CFunction<(CPointer<MemPage>?, CPointer<u8Var>?, CPointer<CellInfo>?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<MemPage>?, CPointer<u8Var>?, CPointer<CellInfo>?) -> Unit>>>(128).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<MemPage>?, CPointer<u8Var>?, CPointer<CellInfo>?) -> Unit>>>(128).value = value }
}

@CStruct("struct { long long p0; void* p1; unsigned int p2; unsigned short p3; unsigned short p4; }")
class CellInfo(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(24, 8)
    
    var nKey: i64
        get() = memberAt<i64Var>(0).value
        set(value) { memberAt<i64Var>(0).value = value }
    
    var pPayload: CPointer<u8Var>?
        get() = memberAt<CPointerVar<u8Var>>(8).value
        set(value) { memberAt<CPointerVar<u8Var>>(8).value = value }
    
    var nPayload: u32
        get() = memberAt<u32Var>(16).value
        set(value) { memberAt<u32Var>(16).value = value }
    
    var nLocal: u16
        get() = memberAt<u16Var>(20).value
        set(value) { memberAt<u16Var>(20).value = value }
    
    var nSize: u16
        get() = memberAt<u16Var>(22).value
        set(value) { memberAt<u16Var>(22).value = value }
}

@CStruct("struct { struct { void* p0; long p1; long p2; void* p3; void* p4; unsigned long long p5; } p0; int p1; }")
class sqlite3_mutex(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(48, 8)
    
    val mutex: CRITICAL_SECTION
        get() = memberAt(0)
    
    var id: Int
        get() = memberAt<IntVar>(40).value
        set(value) { memberAt<IntVar>(40).value = value }
}

@CStruct("struct { void* p0; unsigned int p1; unsigned char p2; void* p3; }")
class BtLock(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(24, 8)
    
    var pBtree: CPointer<Btree>?
        get() = memberAt<CPointerVar<Btree>>(0).value
        set(value) { memberAt<CPointerVar<Btree>>(0).value = value }
    
    var iTable: Pgno
        get() = memberAt<PgnoVar>(8).value
        set(value) { memberAt<PgnoVar>(8).value = value }
    
    var eLock: u8
        get() = memberAt<u8Var>(12).value
        set(value) { memberAt<u8Var>(12).value = value }
    
    var pNext: CPointer<BtLock>?
        get() = memberAt<CPointerVar<BtLock>>(16).value
        set(value) { memberAt<CPointerVar<BtLock>>(16).value = value }
}

@CStruct("struct { void* p0; struct { void* p0; unsigned int p1; } p1; void* p2; }")
class RenameToken(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(32, 8)
    
    var p: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(0).value
        set(value) { memberAt<COpaquePointerVar>(0).value = value }
    
    val t: Token
        get() = memberAt(8)
    
    var pNext: CPointer<RenameToken>?
        get() = memberAt<CPointerVar<RenameToken>>(24).value
        set(value) { memberAt<CPointerVar<RenameToken>>(24).value = value }
}

class VdbeCursor(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(120, 8)
    
    var eCurType: u8
        get() = memberAt<u8Var>(0).value
        set(value) { memberAt<u8Var>(0).value = value }
    
    var iDb: i8
        get() = memberAt<i8Var>(1).value
        set(value) { memberAt<i8Var>(1).value = value }
    
    var nullRow: u8
        get() = memberAt<u8Var>(2).value
        set(value) { memberAt<u8Var>(2).value = value }
    
    var deferredMoveto: u8
        get() = memberAt<u8Var>(3).value
        set(value) { memberAt<u8Var>(3).value = value }
    
    var isTable: u8
        get() = memberAt<u8Var>(4).value
        set(value) { memberAt<u8Var>(4).value = value }
    
    var pBtx: CPointer<Btree>?
        get() = memberAt<CPointerVar<Btree>>(8).value
        set(value) { memberAt<CPointerVar<Btree>>(8).value = value }
    
    var seqCount: i64
        get() = memberAt<i64Var>(16).value
        set(value) { memberAt<i64Var>(16).value = value }
    
    var aAltMap: CPointer<IntVar>?
        get() = memberAt<CPointerVar<IntVar>>(24).value
        set(value) { memberAt<CPointerVar<IntVar>>(24).value = value }
    
    var cacheStatus: u32
        get() = memberAt<u32Var>(32).value
        set(value) { memberAt<u32Var>(32).value = value }
    
    var seekResult: Int
        get() = memberAt<IntVar>(36).value
        set(value) { memberAt<IntVar>(36).value = value }
    
    var pAltCursor: CPointer<VdbeCursor>?
        get() = memberAt<CPointerVar<VdbeCursor>>(40).value
        set(value) { memberAt<CPointerVar<VdbeCursor>>(40).value = value }
    
    val uc: anonymousStruct12
        get() = memberAt(48)
    
    var pKeyInfo: CPointer<KeyInfo>?
        get() = memberAt<CPointerVar<KeyInfo>>(56).value
        set(value) { memberAt<CPointerVar<KeyInfo>>(56).value = value }
    
    var iHdrOffset: u32
        get() = memberAt<u32Var>(64).value
        set(value) { memberAt<u32Var>(64).value = value }
    
    var pgnoRoot: Pgno
        get() = memberAt<PgnoVar>(68).value
        set(value) { memberAt<PgnoVar>(68).value = value }
    
    var nField: i16
        get() = memberAt<i16Var>(72).value
        set(value) { memberAt<i16Var>(72).value = value }
    
    var nHdrParsed: u16
        get() = memberAt<u16Var>(74).value
        set(value) { memberAt<u16Var>(74).value = value }
    
    var movetoTarget: i64
        get() = memberAt<i64Var>(80).value
        set(value) { memberAt<i64Var>(80).value = value }
    
    var aOffset: CPointer<u32Var>?
        get() = memberAt<CPointerVar<u32Var>>(88).value
        set(value) { memberAt<CPointerVar<u32Var>>(88).value = value }
    
    var aRow: CPointer<u8Var>?
        get() = memberAt<CPointerVar<u8Var>>(96).value
        set(value) { memberAt<CPointerVar<u8Var>>(96).value = value }
    
    var payloadSize: u32
        get() = memberAt<u32Var>(104).value
        set(value) { memberAt<u32Var>(104).value = value }
    
    var szRow: u32
        get() = memberAt<u32Var>(108).value
        set(value) { memberAt<u32Var>(108).value = value }
    
    val aType: CArrayPointer<u32Var>
        get() = arrayMemberAt(112)
    
    var isEphemeral: Bool
        get() = readBits(this.rawPtr, 40, 1, false).toUInt()
        set(value) { writeBits(this.rawPtr, 40, 1, value.toLong()) }
    
    var useRandomRowid: Bool
        get() = readBits(this.rawPtr, 41, 1, false).toUInt()
        set(value) { writeBits(this.rawPtr, 41, 1, value.toLong()) }
    
    var isOrdered: Bool
        get() = readBits(this.rawPtr, 42, 1, false).toUInt()
        set(value) { writeBits(this.rawPtr, 42, 1, value.toLong()) }
    
    var seekHit: Bool
        get() = readBits(this.rawPtr, 43, 1, false).toUInt()
        set(value) { writeBits(this.rawPtr, 43, 1, value.toLong()) }
}

@CStruct("union { void* p0; void* p1; void* p2; }")
class anonymousStruct12(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(8, 8)
    
    var pCursor: CPointer<BtCursor>?
        get() = memberAt<CPointerVar<BtCursor>>(0).value
        set(value) { memberAt<CPointerVar<BtCursor>>(0).value = value }
    
    var pVCur: CPointer<sqlite3_vtab_cursor>?
        get() = memberAt<CPointerVar<sqlite3_vtab_cursor>>(0).value
        set(value) { memberAt<CPointerVar<sqlite3_vtab_cursor>>(0).value = value }
    
    var pSorter: CPointer<VdbeSorter>?
        get() = memberAt<CPointerVar<VdbeSorter>>(0).value
        set(value) { memberAt<CPointerVar<VdbeSorter>>(0).value = value }
}

@CStruct("struct { int p0; int p1; int p2; int p3; void* p4; void* p5; void* p6; void* p7; void* p8; struct { void* p0; void* p1; int p2; } p9; int p10; int p11; unsigned char p12; unsigned char p13; unsigned char p14; unsigned char p15; unsigned char p16; struct { void* p0; int p1; void* p2; void* p3; struct { void* p0; void* p1; int p2; } p4; int p5; void* p6; struct { void* p0; long long p1; } p7; struct { void* p0; long long p1; } p8; } p17[1]; }")
class VdbeSorter(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(200, 8)
    
    var mnPmaSize: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var mxPmaSize: Int
        get() = memberAt<IntVar>(4).value
        set(value) { memberAt<IntVar>(4).value = value }
    
    var mxKeysize: Int
        get() = memberAt<IntVar>(8).value
        set(value) { memberAt<IntVar>(8).value = value }
    
    var pgsz: Int
        get() = memberAt<IntVar>(12).value
        set(value) { memberAt<IntVar>(12).value = value }
    
    var pReader: CPointer<PmaReader>?
        get() = memberAt<CPointerVar<PmaReader>>(16).value
        set(value) { memberAt<CPointerVar<PmaReader>>(16).value = value }
    
    var pMerger: CPointer<MergeEngine>?
        get() = memberAt<CPointerVar<MergeEngine>>(24).value
        set(value) { memberAt<CPointerVar<MergeEngine>>(24).value = value }
    
    var db: CPointer<sqlite3>?
        get() = memberAt<CPointerVar<sqlite3>>(32).value
        set(value) { memberAt<CPointerVar<sqlite3>>(32).value = value }
    
    var pKeyInfo: CPointer<KeyInfo>?
        get() = memberAt<CPointerVar<KeyInfo>>(40).value
        set(value) { memberAt<CPointerVar<KeyInfo>>(40).value = value }
    
    var pUnpacked: CPointer<UnpackedRecord>?
        get() = memberAt<CPointerVar<UnpackedRecord>>(48).value
        set(value) { memberAt<CPointerVar<UnpackedRecord>>(48).value = value }
    
    val list: SorterList
        get() = memberAt(56)
    
    var iMemory: Int
        get() = memberAt<IntVar>(80).value
        set(value) { memberAt<IntVar>(80).value = value }
    
    var nMemory: Int
        get() = memberAt<IntVar>(84).value
        set(value) { memberAt<IntVar>(84).value = value }
    
    var bUsePMA: u8
        get() = memberAt<u8Var>(88).value
        set(value) { memberAt<u8Var>(88).value = value }
    
    var bUseThreads: u8
        get() = memberAt<u8Var>(89).value
        set(value) { memberAt<u8Var>(89).value = value }
    
    var iPrev: u8
        get() = memberAt<u8Var>(90).value
        set(value) { memberAt<u8Var>(90).value = value }
    
    var nTask: u8
        get() = memberAt<u8Var>(91).value
        set(value) { memberAt<u8Var>(91).value = value }
    
    var typeMask: u8
        get() = memberAt<u8Var>(92).value
        set(value) { memberAt<u8Var>(92).value = value }
    
    val aTask: CArrayPointer<SortSubtask>
        get() = arrayMemberAt(96)
}

@CStruct("struct { long long p0; long long p1; int p2; int p3; void* p4; void* p5; void* p6; void* p7; int p8; void* p9; void* p10; }")
class PmaReader(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(80, 8)
    
    var iReadOff: i64
        get() = memberAt<i64Var>(0).value
        set(value) { memberAt<i64Var>(0).value = value }
    
    var iEof: i64
        get() = memberAt<i64Var>(8).value
        set(value) { memberAt<i64Var>(8).value = value }
    
    var nAlloc: Int
        get() = memberAt<IntVar>(16).value
        set(value) { memberAt<IntVar>(16).value = value }
    
    var nKey: Int
        get() = memberAt<IntVar>(20).value
        set(value) { memberAt<IntVar>(20).value = value }
    
    var pFd: CPointer<sqlite3_file>?
        get() = memberAt<CPointerVar<sqlite3_file>>(24).value
        set(value) { memberAt<CPointerVar<sqlite3_file>>(24).value = value }
    
    var aAlloc: CPointer<u8Var>?
        get() = memberAt<CPointerVar<u8Var>>(32).value
        set(value) { memberAt<CPointerVar<u8Var>>(32).value = value }
    
    var aKey: CPointer<u8Var>?
        get() = memberAt<CPointerVar<u8Var>>(40).value
        set(value) { memberAt<CPointerVar<u8Var>>(40).value = value }
    
    var aBuffer: CPointer<u8Var>?
        get() = memberAt<CPointerVar<u8Var>>(48).value
        set(value) { memberAt<CPointerVar<u8Var>>(48).value = value }
    
    var nBuffer: Int
        get() = memberAt<IntVar>(56).value
        set(value) { memberAt<IntVar>(56).value = value }
    
    var aMap: CPointer<u8Var>?
        get() = memberAt<CPointerVar<u8Var>>(64).value
        set(value) { memberAt<CPointerVar<u8Var>>(64).value = value }
    
    var pIncr: CPointer<IncrMerger>?
        get() = memberAt<CPointerVar<IncrMerger>>(72).value
        set(value) { memberAt<CPointerVar<IncrMerger>>(72).value = value }
}

@CStruct("struct { void* p0; void* p1; long long p2; int p3; int p4; int p5; struct { void* p0; long long p1; } p6[2]; }")
class IncrMerger(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(72, 8)
    
    var pTask: CPointer<SortSubtask>?
        get() = memberAt<CPointerVar<SortSubtask>>(0).value
        set(value) { memberAt<CPointerVar<SortSubtask>>(0).value = value }
    
    var pMerger: CPointer<MergeEngine>?
        get() = memberAt<CPointerVar<MergeEngine>>(8).value
        set(value) { memberAt<CPointerVar<MergeEngine>>(8).value = value }
    
    var iStartOff: i64
        get() = memberAt<i64Var>(16).value
        set(value) { memberAt<i64Var>(16).value = value }
    
    var mxSz: Int
        get() = memberAt<IntVar>(24).value
        set(value) { memberAt<IntVar>(24).value = value }
    
    var bEof: Int
        get() = memberAt<IntVar>(28).value
        set(value) { memberAt<IntVar>(28).value = value }
    
    var bUseThread: Int
        get() = memberAt<IntVar>(32).value
        set(value) { memberAt<IntVar>(32).value = value }
    
    val aFile: CArrayPointer<SorterFile>
        get() = arrayMemberAt(40)
}

@CStruct("struct { void* p0; int p1; void* p2; void* p3; struct { void* p0; void* p1; int p2; } p4; int p5; void* p6; struct { void* p0; long long p1; } p7; struct { void* p0; long long p1; } p8; }")
class SortSubtask(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(104, 8)
    
    var pThread: CPointer<SQLiteThread>?
        get() = memberAt<CPointerVar<SQLiteThread>>(0).value
        set(value) { memberAt<CPointerVar<SQLiteThread>>(0).value = value }
    
    var bDone: Int
        get() = memberAt<IntVar>(8).value
        set(value) { memberAt<IntVar>(8).value = value }
    
    var pSorter: CPointer<VdbeSorter>?
        get() = memberAt<CPointerVar<VdbeSorter>>(16).value
        set(value) { memberAt<CPointerVar<VdbeSorter>>(16).value = value }
    
    var pUnpacked: CPointer<UnpackedRecord>?
        get() = memberAt<CPointerVar<UnpackedRecord>>(24).value
        set(value) { memberAt<CPointerVar<UnpackedRecord>>(24).value = value }
    
    val list: SorterList
        get() = memberAt(32)
    
    var nPMA: Int
        get() = memberAt<IntVar>(56).value
        set(value) { memberAt<IntVar>(56).value = value }
    
    var xCompare: SorterCompare?
        get() = memberAt<SorterCompareVar>(64).value
        set(value) { memberAt<SorterCompareVar>(64).value = value }
    
    val file: SorterFile
        get() = memberAt(72)
    
    val file2: SorterFile
        get() = memberAt(88)
}

@CStruct("struct { void* p0; unsigned int p1; void* p2; void* p3; void* p4; }")
class SQLiteThread(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(40, 8)
    
    var tid: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(0).value
        set(value) { memberAt<COpaquePointerVar>(0).value = value }
    
    var id: UInt
        get() = memberAt<UIntVar>(8).value
        set(value) { memberAt<UIntVar>(8).value = value }
    
    var xTask: CPointer<CFunction<(COpaquePointer?) -> COpaquePointer?>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?) -> COpaquePointer?>>>(16).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?) -> COpaquePointer?>>>(16).value = value }
    
    var pIn: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(24).value
        set(value) { memberAt<COpaquePointerVar>(24).value = value }
    
    var pResult: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(32).value
        set(value) { memberAt<COpaquePointerVar>(32).value = value }
}

@CStruct("struct { void* p0; void* p1; unsigned short p2; signed char p3; unsigned char p4; signed char p5; signed char p6; unsigned char p7; }")
class UnpackedRecord(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(24, 8)
    
    var pKeyInfo: CPointer<KeyInfo>?
        get() = memberAt<CPointerVar<KeyInfo>>(0).value
        set(value) { memberAt<CPointerVar<KeyInfo>>(0).value = value }
    
    var aMem: CPointer<Mem>?
        get() = memberAt<CPointerVar<Mem>>(8).value
        set(value) { memberAt<CPointerVar<Mem>>(8).value = value }
    
    var nField: u16
        get() = memberAt<u16Var>(16).value
        set(value) { memberAt<u16Var>(16).value = value }
    
    var default_rc: i8
        get() = memberAt<i8Var>(18).value
        set(value) { memberAt<i8Var>(18).value = value }
    
    var errCode: u8
        get() = memberAt<u8Var>(19).value
        set(value) { memberAt<u8Var>(19).value = value }
    
    var r1: i8
        get() = memberAt<i8Var>(20).value
        set(value) { memberAt<i8Var>(20).value = value }
    
    var r2: i8
        get() = memberAt<i8Var>(21).value
        set(value) { memberAt<i8Var>(21).value = value }
    
    var eqSeen: u8
        get() = memberAt<u8Var>(22).value
        set(value) { memberAt<u8Var>(22).value = value }
}

@CStruct("struct { void* p0; void* p1; int p2; }")
class SorterList(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(24, 8)
    
    var pList: CPointer<SorterRecord>?
        get() = memberAt<CPointerVar<SorterRecord>>(0).value
        set(value) { memberAt<CPointerVar<SorterRecord>>(0).value = value }
    
    var aMemory: CPointer<u8Var>?
        get() = memberAt<CPointerVar<u8Var>>(8).value
        set(value) { memberAt<CPointerVar<u8Var>>(8).value = value }
    
    var szPMA: Int
        get() = memberAt<IntVar>(16).value
        set(value) { memberAt<IntVar>(16).value = value }
}

@CStruct("struct { int p0; union { void* p0; int p1; } p1; }")
class SorterRecord(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 8)
    
    var nVal: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    val u: anonymousStruct13
        get() = memberAt(8)
}

@CStruct("union { void* p0; int p1; }")
class anonymousStruct13(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(8, 8)
    
    var pNext: CPointer<SorterRecord>?
        get() = memberAt<CPointerVar<SorterRecord>>(0).value
        set(value) { memberAt<CPointerVar<SorterRecord>>(0).value = value }
    
    var iNext: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
}

@CStruct("struct { void* p0; long long p1; }")
class SorterFile(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 8)
    
    var pFd: CPointer<sqlite3_file>?
        get() = memberAt<CPointerVar<sqlite3_file>>(0).value
        set(value) { memberAt<CPointerVar<sqlite3_file>>(0).value = value }
    
    var iEof: i64
        get() = memberAt<i64Var>(8).value
        set(value) { memberAt<i64Var>(8).value = value }
}

@CStruct("struct { int p0; void* p1; void* p2; void* p3; }")
class MergeEngine(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(32, 8)
    
    var nTree: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var pTask: CPointer<SortSubtask>?
        get() = memberAt<CPointerVar<SortSubtask>>(8).value
        set(value) { memberAt<CPointerVar<SortSubtask>>(8).value = value }
    
    var aTree: CPointer<IntVar>?
        get() = memberAt<CPointerVar<IntVar>>(16).value
        set(value) { memberAt<CPointerVar<IntVar>>(16).value = value }
    
    var aReadr: CPointer<PmaReader>?
        get() = memberAt<CPointerVar<PmaReader>>(24).value
        set(value) { memberAt<CPointerVar<PmaReader>>(24).value = value }
}

@CStruct("struct { void* p0; void* p1; void* p2; void* p3; void* p4; void* p5; void* p6; void* p7; long long p8; void* p9; int p10; int p11; int p12; int p13; int p14; int p15; int p16; int p17; }")
class VdbeFrame(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(112, 8)
    
    var v: CPointer<Vdbe>?
        get() = memberAt<CPointerVar<Vdbe>>(0).value
        set(value) { memberAt<CPointerVar<Vdbe>>(0).value = value }
    
    var pParent: CPointer<VdbeFrame>?
        get() = memberAt<CPointerVar<VdbeFrame>>(8).value
        set(value) { memberAt<CPointerVar<VdbeFrame>>(8).value = value }
    
    var aOp: CPointer<Op>?
        get() = memberAt<CPointerVar<Op>>(16).value
        set(value) { memberAt<CPointerVar<Op>>(16).value = value }
    
    var anExec: CPointer<i64Var>?
        get() = memberAt<CPointerVar<i64Var>>(24).value
        set(value) { memberAt<CPointerVar<i64Var>>(24).value = value }
    
    var aMem: CPointer<Mem>?
        get() = memberAt<CPointerVar<Mem>>(32).value
        set(value) { memberAt<CPointerVar<Mem>>(32).value = value }
    
    var apCsr: CPointer<CPointerVar<VdbeCursor>>?
        get() = memberAt<CPointerVar<CPointerVar<VdbeCursor>>>(40).value
        set(value) { memberAt<CPointerVar<CPointerVar<VdbeCursor>>>(40).value = value }
    
    var aOnce: CPointer<u8Var>?
        get() = memberAt<CPointerVar<u8Var>>(48).value
        set(value) { memberAt<CPointerVar<u8Var>>(48).value = value }
    
    var token: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(56).value
        set(value) { memberAt<COpaquePointerVar>(56).value = value }
    
    var lastRowid: i64
        get() = memberAt<i64Var>(64).value
        set(value) { memberAt<i64Var>(64).value = value }
    
    var pAuxData: CPointer<AuxData>?
        get() = memberAt<CPointerVar<AuxData>>(72).value
        set(value) { memberAt<CPointerVar<AuxData>>(72).value = value }
    
    var nCursor: Int
        get() = memberAt<IntVar>(80).value
        set(value) { memberAt<IntVar>(80).value = value }
    
    var pc: Int
        get() = memberAt<IntVar>(84).value
        set(value) { memberAt<IntVar>(84).value = value }
    
    var nOp: Int
        get() = memberAt<IntVar>(88).value
        set(value) { memberAt<IntVar>(88).value = value }
    
    var nMem: Int
        get() = memberAt<IntVar>(92).value
        set(value) { memberAt<IntVar>(92).value = value }
    
    var nChildMem: Int
        get() = memberAt<IntVar>(96).value
        set(value) { memberAt<IntVar>(96).value = value }
    
    var nChildCsr: Int
        get() = memberAt<IntVar>(100).value
        set(value) { memberAt<IntVar>(100).value = value }
    
    var nChange: Int
        get() = memberAt<IntVar>(104).value
        set(value) { memberAt<IntVar>(104).value = value }
    
    var nDbChange: Int
        get() = memberAt<IntVar>(108).value
        set(value) { memberAt<IntVar>(108).value = value }
}

@CStruct("struct { int p0; int p1; void* p2; void* p3; void* p4; }")
class AuxData(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(32, 8)
    
    var iAuxOp: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var iAuxArg: Int
        get() = memberAt<IntVar>(4).value
        set(value) { memberAt<IntVar>(4).value = value }
    
    var pAux: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(8).value
        set(value) { memberAt<COpaquePointerVar>(8).value = value }
    
    var xDeleteAux: CPointer<CFunction<(COpaquePointer?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Unit>>>(16).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Unit>>>(16).value = value }
    
    var pNextAux: CPointer<AuxData>?
        get() = memberAt<CPointerVar<AuxData>>(24).value
        set(value) { memberAt<CPointerVar<AuxData>>(24).value = value }
}

@CStruct("struct { void* p0; void* p1; unsigned char p2; unsigned char p3; void* p4; }")
class Db(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(32, 8)
    
    var zDbSName: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(0).value
        set(value) { memberAt<CPointerVar<ByteVar>>(0).value = value }
    
    var pBt: CPointer<Btree>?
        get() = memberAt<CPointerVar<Btree>>(8).value
        set(value) { memberAt<CPointerVar<Btree>>(8).value = value }
    
    var safety_level: u8
        get() = memberAt<u8Var>(16).value
        set(value) { memberAt<u8Var>(16).value = value }
    
    var bSyncSet: u8
        get() = memberAt<u8Var>(17).value
        set(value) { memberAt<u8Var>(17).value = value }
    
    var pSchema: CPointer<Schema>?
        get() = memberAt<CPointerVar<Schema>>(24).value
        set(value) { memberAt<CPointerVar<Schema>>(24).value = value }
}

class sqlite3InitInfo(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(8, 4)
    
    var newTnum: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var iDb: u8
        get() = memberAt<u8Var>(4).value
        set(value) { memberAt<u8Var>(4).value = value }
    
    var busy: u8
        get() = memberAt<u8Var>(5).value
        set(value) { memberAt<u8Var>(5).value = value }
    
    var orphanTrigger: UInt
        get() = readBits(this.rawPtr, 48, 1, false).toUInt()
        set(value) { writeBits(this.rawPtr, 48, 1, value.toLong()) }
    
    var imposterTable: UInt
        get() = readBits(this.rawPtr, 49, 1, false).toUInt()
        set(value) { writeBits(this.rawPtr, 49, 1, value.toLong()) }
    
    var reopenMemdb: UInt
        get() = readBits(this.rawPtr, 50, 1, false).toUInt()
        set(value) { writeBits(this.rawPtr, 50, 1, value.toLong()) }
}

@CStruct("union { volatile int p0; double p1; }")
class anonymousStruct1(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(8, 8)
    
    var isInterrupted: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var notUsed1: Double
        get() = memberAt<DoubleVar>(0).value
        set(value) { memberAt<DoubleVar>(0).value = value }
}

@CStruct("struct { unsigned int p0; unsigned short p1; unsigned char p2; unsigned int p3; unsigned int p4[3]; void* p5; void* p6; void* p7; void* p8; }")
class Lookaside(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(56, 8)
    
    var bDisable: u32
        get() = memberAt<u32Var>(0).value
        set(value) { memberAt<u32Var>(0).value = value }
    
    var sz: u16
        get() = memberAt<u16Var>(4).value
        set(value) { memberAt<u16Var>(4).value = value }
    
    var bMalloced: u8
        get() = memberAt<u8Var>(6).value
        set(value) { memberAt<u8Var>(6).value = value }
    
    var nSlot: u32
        get() = memberAt<u32Var>(8).value
        set(value) { memberAt<u32Var>(8).value = value }
    
    val anStat: CArrayPointer<u32Var>
        get() = arrayMemberAt(12)
    
    var pInit: CPointer<LookasideSlot>?
        get() = memberAt<CPointerVar<LookasideSlot>>(24).value
        set(value) { memberAt<CPointerVar<LookasideSlot>>(24).value = value }
    
    var pFree: CPointer<LookasideSlot>?
        get() = memberAt<CPointerVar<LookasideSlot>>(32).value
        set(value) { memberAt<CPointerVar<LookasideSlot>>(32).value = value }
    
    var pStart: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(40).value
        set(value) { memberAt<COpaquePointerVar>(40).value = value }
    
    var pEnd: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(48).value
        set(value) { memberAt<COpaquePointerVar>(48).value = value }
}

@CStruct("struct { void* p0; }")
class LookasideSlot(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(8, 8)
    
    var pNext: CPointer<LookasideSlot>?
        get() = memberAt<CPointerVar<LookasideSlot>>(0).value
        set(value) { memberAt<CPointerVar<LookasideSlot>>(0).value = value }
}

@CStruct("struct { void* p0; void* p1; void* p2; int p3; }")
class VtabCtx(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(32, 8)
    
    var pVTable: CPointer<VTable>?
        get() = memberAt<CPointerVar<VTable>>(0).value
        set(value) { memberAt<CPointerVar<VTable>>(0).value = value }
    
    var pTab: CPointer<Table>?
        get() = memberAt<CPointerVar<Table>>(8).value
        set(value) { memberAt<CPointerVar<Table>>(8).value = value }
    
    var pPrior: CPointer<VtabCtx>?
        get() = memberAt<CPointerVar<VtabCtx>>(16).value
        set(value) { memberAt<CPointerVar<VtabCtx>>(16).value = value }
    
    var bDeclared: Int
        get() = memberAt<IntVar>(24).value
        set(value) { memberAt<IntVar>(24).value = value }
}

@CStruct("struct { void* p0; void* p1; int p2; unsigned char p3; }")
class BusyHandler(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(24, 8)
    
    var xBusyHandler: CPointer<CFunction<(COpaquePointer?, Int) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?, Int) -> Int>>>(0).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?, Int) -> Int>>>(0).value = value }
    
    var pBusyArg: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(8).value
        set(value) { memberAt<COpaquePointerVar>(8).value = value }
    
    var nBusy: Int
        get() = memberAt<IntVar>(16).value
        set(value) { memberAt<IntVar>(16).value = value }
    
    var bExtraFileArg: u8
        get() = memberAt<u8Var>(20).value
        set(value) { memberAt<u8Var>(20).value = value }
}

@CStruct("struct { void* p0; long long p1; long long p2; void* p3; }")
class Savepoint(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(32, 8)
    
    var zName: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(0).value
        set(value) { memberAt<CPointerVar<ByteVar>>(0).value = value }
    
    var nDeferredCons: i64
        get() = memberAt<i64Var>(8).value
        set(value) { memberAt<i64Var>(8).value = value }
    
    var nDeferredImmCons: i64
        get() = memberAt<i64Var>(16).value
        set(value) { memberAt<i64Var>(16).value = value }
    
    var pNext: CPointer<Savepoint>?
        get() = memberAt<CPointerVar<Savepoint>>(24).value
        set(value) { memberAt<CPointerVar<Savepoint>>(24).value = value }
}

@CStruct("struct { void* p0; void* p1; void* p2; void* p3; void* p4; void* p5; void* p6; void* p7; void* p8; void* p9; void* p10; void* p11; void* p12; void* p13; void* p14; void* p15; void* p16; void* p17; void* p18; void* p19; void* p20; void* p21; void* p22; void* p23; void* p24; void* p25; void* p26; void* p27; void* p28; void* p29; void* p30; void* p31; void* p32; void* p33; void* p34; void* p35; void* p36; void* p37; void* p38; void* p39; void* p40; void* p41; void* p42; void* p43; void* p44; void* p45; void* p46; void* p47; void* p48; void* p49; void* p50; void* p51; void* p52; void* p53; void* p54; void* p55; void* p56; void* p57; void* p58; void* p59; void* p60; void* p61; void* p62; void* p63; void* p64; void* p65; void* p66; void* p67; void* p68; void* p69; void* p70; void* p71; void* p72; void* p73; void* p74; void* p75; void* p76; void* p77; void* p78; void* p79; void* p80; void* p81; void* p82; void* p83; void* p84; void* p85; void* p86; void* p87; void* p88; void* p89; void* p90; void* p91; void* p92; void* p93; void* p94; void* p95; void* p96; void* p97; void* p98; void* p99; void* p100; void* p101; void* p102; void* p103; void* p104; void* p105; void* p106; void* p107; void* p108; void* p109; void* p110; void* p111; void* p112; void* p113; void* p114; void* p115; void* p116; void* p117; void* p118; void* p119; void* p120; void* p121; void* p122; void* p123; void* p124; void* p125; void* p126; void* p127; void* p128; void* p129; void* p130; void* p131; void* p132; void* p133; void* p134; void* p135; void* p136; void* p137; void* p138; void* p139; void* p140; void* p141; void* p142; void* p143; void* p144; void* p145; void* p146; void* p147; void* p148; void* p149; void* p150; void* p151; void* p152; void* p153; void* p154; void* p155; void* p156; void* p157; void* p158; void* p159; void* p160; void* p161; void* p162; void* p163; void* p164; void* p165; void* p166; void* p167; void* p168; void* p169; void* p170; void* p171; void* p172; void* p173; void* p174; void* p175; void* p176; void* p177; void* p178; void* p179; void* p180; void* p181; void* p182; void* p183; void* p184; void* p185; void* p186; void* p187; void* p188; void* p189; void* p190; void* p191; void* p192; void* p193; void* p194; void* p195; void* p196; void* p197; void* p198; void* p199; void* p200; void* p201; void* p202; void* p203; void* p204; void* p205; void* p206; void* p207; void* p208; void* p209; void* p210; void* p211; void* p212; void* p213; void* p214; void* p215; void* p216; void* p217; void* p218; void* p219; void* p220; void* p221; void* p222; void* p223; void* p224; void* p225; void* p226; void* p227; void* p228; void* p229; void* p230; void* p231; void* p232; void* p233; void* p234; void* p235; void* p236; void* p237; void* p238; void* p239; void* p240; }")
class sqlite3_api_routines(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(1928, 8)
    
    var aggregate_context: CPointer<CFunction<(CPointer<sqlite3_context>?, Int) -> COpaquePointer?>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_context>?, Int) -> COpaquePointer?>>>(0).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_context>?, Int) -> COpaquePointer?>>>(0).value = value }
    
    var aggregate_count: CPointer<CFunction<(CPointer<sqlite3_context>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_context>?) -> Int>>>(8).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_context>?) -> Int>>>(8).value = value }
    
    var bind_blob: CPointer<CFunction<(CPointer<sqlite3_stmt>?, Int, COpaquePointer?, Int, CPointer<CFunction<(COpaquePointer?) -> Unit>>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_stmt>?, Int, COpaquePointer?, Int, CPointer<CFunction<(COpaquePointer?) -> Unit>>?) -> Int>>>(16).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_stmt>?, Int, COpaquePointer?, Int, CPointer<CFunction<(COpaquePointer?) -> Unit>>?) -> Int>>>(16).value = value }
    
    var bind_double: CPointer<CFunction<(CPointer<sqlite3_stmt>?, Int, Double) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_stmt>?, Int, Double) -> Int>>>(24).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_stmt>?, Int, Double) -> Int>>>(24).value = value }
    
    var bind_int: CPointer<CFunction<(CPointer<sqlite3_stmt>?, Int, Int) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_stmt>?, Int, Int) -> Int>>>(32).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_stmt>?, Int, Int) -> Int>>>(32).value = value }
    
    var bind_int64: CPointer<CFunction<(CPointer<sqlite3_stmt>?, Int, sqlite_int64) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_stmt>?, Int, sqlite_int64) -> Int>>>(40).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_stmt>?, Int, sqlite_int64) -> Int>>>(40).value = value }
    
    var bind_null: CPointer<CFunction<(CPointer<sqlite3_stmt>?, Int) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_stmt>?, Int) -> Int>>>(48).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_stmt>?, Int) -> Int>>>(48).value = value }
    
    var bind_parameter_count: CPointer<CFunction<(CPointer<sqlite3_stmt>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_stmt>?) -> Int>>>(56).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_stmt>?) -> Int>>>(56).value = value }
    
    var bind_parameter_index: CPointer<CFunction<(CPointer<sqlite3_stmt>?, CPointer<ByteVar>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_stmt>?, CPointer<ByteVar>?) -> Int>>>(64).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_stmt>?, CPointer<ByteVar>?) -> Int>>>(64).value = value }
    
    var bind_parameter_name: CPointer<CFunction<(CPointer<sqlite3_stmt>?, Int) -> CPointer<ByteVar>?>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_stmt>?, Int) -> CPointer<ByteVar>?>>>(72).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_stmt>?, Int) -> CPointer<ByteVar>?>>>(72).value = value }
    
    var bind_text: CPointer<CFunction<(CPointer<sqlite3_stmt>?, Int, CPointer<ByteVar>?, Int, CPointer<CFunction<(COpaquePointer?) -> Unit>>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_stmt>?, Int, CPointer<ByteVar>?, Int, CPointer<CFunction<(COpaquePointer?) -> Unit>>?) -> Int>>>(80).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_stmt>?, Int, CPointer<ByteVar>?, Int, CPointer<CFunction<(COpaquePointer?) -> Unit>>?) -> Int>>>(80).value = value }
    
    var bind_text16: CPointer<CFunction<(CPointer<sqlite3_stmt>?, Int, COpaquePointer?, Int, CPointer<CFunction<(COpaquePointer?) -> Unit>>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_stmt>?, Int, COpaquePointer?, Int, CPointer<CFunction<(COpaquePointer?) -> Unit>>?) -> Int>>>(88).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_stmt>?, Int, COpaquePointer?, Int, CPointer<CFunction<(COpaquePointer?) -> Unit>>?) -> Int>>>(88).value = value }
    
    var bind_value: CPointer<CFunction<(CPointer<sqlite3_stmt>?, Int, CPointer<sqlite3_value>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_stmt>?, Int, CPointer<sqlite3_value>?) -> Int>>>(96).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_stmt>?, Int, CPointer<sqlite3_value>?) -> Int>>>(96).value = value }
    
    var busy_handler: CPointer<CFunction<(CPointer<sqlite3>?, CPointer<CFunction<(COpaquePointer?, Int) -> Int>>?, COpaquePointer?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, CPointer<CFunction<(COpaquePointer?, Int) -> Int>>?, COpaquePointer?) -> Int>>>(104).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, CPointer<CFunction<(COpaquePointer?, Int) -> Int>>?, COpaquePointer?) -> Int>>>(104).value = value }
    
    var busy_timeout: CPointer<CFunction<(CPointer<sqlite3>?, Int) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, Int) -> Int>>>(112).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, Int) -> Int>>>(112).value = value }
    
    var changes: CPointer<CFunction<(CPointer<sqlite3>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?) -> Int>>>(120).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?) -> Int>>>(120).value = value }
    
    var close: CPointer<CFunction<(CPointer<sqlite3>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?) -> Int>>>(128).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?) -> Int>>>(128).value = value }
    
    var collation_needed: CPointer<CFunction<(CPointer<sqlite3>?, COpaquePointer?, CPointer<CFunction<(COpaquePointer?, CPointer<sqlite3>?, Int, CPointer<ByteVar>?) -> Unit>>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, COpaquePointer?, CPointer<CFunction<(COpaquePointer?, CPointer<sqlite3>?, Int, CPointer<ByteVar>?) -> Unit>>?) -> Int>>>(136).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, COpaquePointer?, CPointer<CFunction<(COpaquePointer?, CPointer<sqlite3>?, Int, CPointer<ByteVar>?) -> Unit>>?) -> Int>>>(136).value = value }
    
    var collation_needed16: CPointer<CFunction<(CPointer<sqlite3>?, COpaquePointer?, CPointer<CFunction<(COpaquePointer?, CPointer<sqlite3>?, Int, COpaquePointer?) -> Unit>>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, COpaquePointer?, CPointer<CFunction<(COpaquePointer?, CPointer<sqlite3>?, Int, COpaquePointer?) -> Unit>>?) -> Int>>>(144).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, COpaquePointer?, CPointer<CFunction<(COpaquePointer?, CPointer<sqlite3>?, Int, COpaquePointer?) -> Unit>>?) -> Int>>>(144).value = value }
    
    var column_blob: CPointer<CFunction<(CPointer<sqlite3_stmt>?, Int) -> COpaquePointer?>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_stmt>?, Int) -> COpaquePointer?>>>(152).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_stmt>?, Int) -> COpaquePointer?>>>(152).value = value }
    
    var column_bytes: CPointer<CFunction<(CPointer<sqlite3_stmt>?, Int) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_stmt>?, Int) -> Int>>>(160).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_stmt>?, Int) -> Int>>>(160).value = value }
    
    var column_bytes16: CPointer<CFunction<(CPointer<sqlite3_stmt>?, Int) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_stmt>?, Int) -> Int>>>(168).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_stmt>?, Int) -> Int>>>(168).value = value }
    
    var column_count: CPointer<CFunction<(CPointer<sqlite3_stmt>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_stmt>?) -> Int>>>(176).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_stmt>?) -> Int>>>(176).value = value }
    
    var column_database_name: CPointer<CFunction<(CPointer<sqlite3_stmt>?, Int) -> CPointer<ByteVar>?>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_stmt>?, Int) -> CPointer<ByteVar>?>>>(184).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_stmt>?, Int) -> CPointer<ByteVar>?>>>(184).value = value }
    
    var column_database_name16: CPointer<CFunction<(CPointer<sqlite3_stmt>?, Int) -> COpaquePointer?>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_stmt>?, Int) -> COpaquePointer?>>>(192).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_stmt>?, Int) -> COpaquePointer?>>>(192).value = value }
    
    var column_decltype: CPointer<CFunction<(CPointer<sqlite3_stmt>?, Int) -> CPointer<ByteVar>?>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_stmt>?, Int) -> CPointer<ByteVar>?>>>(200).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_stmt>?, Int) -> CPointer<ByteVar>?>>>(200).value = value }
    
    var column_decltype16: CPointer<CFunction<(CPointer<sqlite3_stmt>?, Int) -> COpaquePointer?>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_stmt>?, Int) -> COpaquePointer?>>>(208).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_stmt>?, Int) -> COpaquePointer?>>>(208).value = value }
    
    var column_double: CPointer<CFunction<(CPointer<sqlite3_stmt>?, Int) -> Double>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_stmt>?, Int) -> Double>>>(216).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_stmt>?, Int) -> Double>>>(216).value = value }
    
    var column_int: CPointer<CFunction<(CPointer<sqlite3_stmt>?, Int) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_stmt>?, Int) -> Int>>>(224).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_stmt>?, Int) -> Int>>>(224).value = value }
    
    var column_int64: CPointer<CFunction<(CPointer<sqlite3_stmt>?, Int) -> sqlite_int64>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_stmt>?, Int) -> sqlite_int64>>>(232).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_stmt>?, Int) -> sqlite_int64>>>(232).value = value }
    
    var column_name: CPointer<CFunction<(CPointer<sqlite3_stmt>?, Int) -> CPointer<ByteVar>?>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_stmt>?, Int) -> CPointer<ByteVar>?>>>(240).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_stmt>?, Int) -> CPointer<ByteVar>?>>>(240).value = value }
    
    var column_name16: CPointer<CFunction<(CPointer<sqlite3_stmt>?, Int) -> COpaquePointer?>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_stmt>?, Int) -> COpaquePointer?>>>(248).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_stmt>?, Int) -> COpaquePointer?>>>(248).value = value }
    
    var column_origin_name: CPointer<CFunction<(CPointer<sqlite3_stmt>?, Int) -> CPointer<ByteVar>?>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_stmt>?, Int) -> CPointer<ByteVar>?>>>(256).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_stmt>?, Int) -> CPointer<ByteVar>?>>>(256).value = value }
    
    var column_origin_name16: CPointer<CFunction<(CPointer<sqlite3_stmt>?, Int) -> COpaquePointer?>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_stmt>?, Int) -> COpaquePointer?>>>(264).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_stmt>?, Int) -> COpaquePointer?>>>(264).value = value }
    
    var column_table_name: CPointer<CFunction<(CPointer<sqlite3_stmt>?, Int) -> CPointer<ByteVar>?>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_stmt>?, Int) -> CPointer<ByteVar>?>>>(272).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_stmt>?, Int) -> CPointer<ByteVar>?>>>(272).value = value }
    
    var column_table_name16: CPointer<CFunction<(CPointer<sqlite3_stmt>?, Int) -> COpaquePointer?>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_stmt>?, Int) -> COpaquePointer?>>>(280).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_stmt>?, Int) -> COpaquePointer?>>>(280).value = value }
    
    var column_text: CPointer<CFunction<(CPointer<sqlite3_stmt>?, Int) -> CPointer<UByteVar>?>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_stmt>?, Int) -> CPointer<UByteVar>?>>>(288).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_stmt>?, Int) -> CPointer<UByteVar>?>>>(288).value = value }
    
    var column_text16: CPointer<CFunction<(CPointer<sqlite3_stmt>?, Int) -> COpaquePointer?>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_stmt>?, Int) -> COpaquePointer?>>>(296).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_stmt>?, Int) -> COpaquePointer?>>>(296).value = value }
    
    var column_type: CPointer<CFunction<(CPointer<sqlite3_stmt>?, Int) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_stmt>?, Int) -> Int>>>(304).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_stmt>?, Int) -> Int>>>(304).value = value }
    
    var column_value: CPointer<CFunction<(CPointer<sqlite3_stmt>?, Int) -> CPointer<sqlite3_value>?>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_stmt>?, Int) -> CPointer<sqlite3_value>?>>>(312).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_stmt>?, Int) -> CPointer<sqlite3_value>?>>>(312).value = value }
    
    var commit_hook: CPointer<CFunction<(CPointer<sqlite3>?, CPointer<CFunction<(COpaquePointer?) -> Int>>?, COpaquePointer?) -> COpaquePointer?>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, CPointer<CFunction<(COpaquePointer?) -> Int>>?, COpaquePointer?) -> COpaquePointer?>>>(320).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, CPointer<CFunction<(COpaquePointer?) -> Int>>?, COpaquePointer?) -> COpaquePointer?>>>(320).value = value }
    
    var complete: CPointer<CFunction<(CPointer<ByteVar>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<ByteVar>?) -> Int>>>(328).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<ByteVar>?) -> Int>>>(328).value = value }
    
    var complete16: CPointer<CFunction<(COpaquePointer?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Int>>>(336).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Int>>>(336).value = value }
    
    var create_collation: CPointer<CFunction<(CPointer<sqlite3>?, CPointer<ByteVar>?, Int, COpaquePointer?, CPointer<CFunction<(COpaquePointer?, Int, COpaquePointer?, Int, COpaquePointer?) -> Int>>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, CPointer<ByteVar>?, Int, COpaquePointer?, CPointer<CFunction<(COpaquePointer?, Int, COpaquePointer?, Int, COpaquePointer?) -> Int>>?) -> Int>>>(344).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, CPointer<ByteVar>?, Int, COpaquePointer?, CPointer<CFunction<(COpaquePointer?, Int, COpaquePointer?, Int, COpaquePointer?) -> Int>>?) -> Int>>>(344).value = value }
    
    var create_collation16: CPointer<CFunction<(CPointer<sqlite3>?, COpaquePointer?, Int, COpaquePointer?, CPointer<CFunction<(COpaquePointer?, Int, COpaquePointer?, Int, COpaquePointer?) -> Int>>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, COpaquePointer?, Int, COpaquePointer?, CPointer<CFunction<(COpaquePointer?, Int, COpaquePointer?, Int, COpaquePointer?) -> Int>>?) -> Int>>>(352).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, COpaquePointer?, Int, COpaquePointer?, CPointer<CFunction<(COpaquePointer?, Int, COpaquePointer?, Int, COpaquePointer?) -> Int>>?) -> Int>>>(352).value = value }
    
    var create_function: CPointer<CFunction<(CPointer<sqlite3>?, CPointer<ByteVar>?, Int, Int, COpaquePointer?, CPointer<CFunction<(CPointer<sqlite3_context>?, Int, CPointer<CPointerVar<sqlite3_value>>?) -> Unit>>?, CPointer<CFunction<(CPointer<sqlite3_context>?, Int, CPointer<CPointerVar<sqlite3_value>>?) -> Unit>>?, CPointer<CFunction<(CPointer<sqlite3_context>?) -> Unit>>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, CPointer<ByteVar>?, Int, Int, COpaquePointer?, CPointer<CFunction<(CPointer<sqlite3_context>?, Int, CPointer<CPointerVar<sqlite3_value>>?) -> Unit>>?, CPointer<CFunction<(CPointer<sqlite3_context>?, Int, CPointer<CPointerVar<sqlite3_value>>?) -> Unit>>?, CPointer<CFunction<(CPointer<sqlite3_context>?) -> Unit>>?) -> Int>>>(360).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, CPointer<ByteVar>?, Int, Int, COpaquePointer?, CPointer<CFunction<(CPointer<sqlite3_context>?, Int, CPointer<CPointerVar<sqlite3_value>>?) -> Unit>>?, CPointer<CFunction<(CPointer<sqlite3_context>?, Int, CPointer<CPointerVar<sqlite3_value>>?) -> Unit>>?, CPointer<CFunction<(CPointer<sqlite3_context>?) -> Unit>>?) -> Int>>>(360).value = value }
    
    var create_function16: CPointer<CFunction<(CPointer<sqlite3>?, COpaquePointer?, Int, Int, COpaquePointer?, CPointer<CFunction<(CPointer<sqlite3_context>?, Int, CPointer<CPointerVar<sqlite3_value>>?) -> Unit>>?, CPointer<CFunction<(CPointer<sqlite3_context>?, Int, CPointer<CPointerVar<sqlite3_value>>?) -> Unit>>?, CPointer<CFunction<(CPointer<sqlite3_context>?) -> Unit>>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, COpaquePointer?, Int, Int, COpaquePointer?, CPointer<CFunction<(CPointer<sqlite3_context>?, Int, CPointer<CPointerVar<sqlite3_value>>?) -> Unit>>?, CPointer<CFunction<(CPointer<sqlite3_context>?, Int, CPointer<CPointerVar<sqlite3_value>>?) -> Unit>>?, CPointer<CFunction<(CPointer<sqlite3_context>?) -> Unit>>?) -> Int>>>(368).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, COpaquePointer?, Int, Int, COpaquePointer?, CPointer<CFunction<(CPointer<sqlite3_context>?, Int, CPointer<CPointerVar<sqlite3_value>>?) -> Unit>>?, CPointer<CFunction<(CPointer<sqlite3_context>?, Int, CPointer<CPointerVar<sqlite3_value>>?) -> Unit>>?, CPointer<CFunction<(CPointer<sqlite3_context>?) -> Unit>>?) -> Int>>>(368).value = value }
    
    var create_module: CPointer<CFunction<(CPointer<sqlite3>?, CPointer<ByteVar>?, CPointer<sqlite3_module>?, COpaquePointer?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, CPointer<ByteVar>?, CPointer<sqlite3_module>?, COpaquePointer?) -> Int>>>(376).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, CPointer<ByteVar>?, CPointer<sqlite3_module>?, COpaquePointer?) -> Int>>>(376).value = value }
    
    var data_count: CPointer<CFunction<(CPointer<sqlite3_stmt>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_stmt>?) -> Int>>>(384).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_stmt>?) -> Int>>>(384).value = value }
    
    var db_handle: CPointer<CFunction<(CPointer<sqlite3_stmt>?) -> CPointer<sqlite3>?>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_stmt>?) -> CPointer<sqlite3>?>>>(392).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_stmt>?) -> CPointer<sqlite3>?>>>(392).value = value }
    
    var declare_vtab: CPointer<CFunction<(CPointer<sqlite3>?, CPointer<ByteVar>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, CPointer<ByteVar>?) -> Int>>>(400).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, CPointer<ByteVar>?) -> Int>>>(400).value = value }
    
    var enable_shared_cache: CPointer<CFunction<(Int) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(Int) -> Int>>>(408).value
        set(value) { memberAt<CPointerVar<CFunction<(Int) -> Int>>>(408).value = value }
    
    var errcode: CPointer<CFunction<(CPointer<sqlite3>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?) -> Int>>>(416).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?) -> Int>>>(416).value = value }
    
    var errmsg: CPointer<CFunction<(CPointer<sqlite3>?) -> CPointer<ByteVar>?>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?) -> CPointer<ByteVar>?>>>(424).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?) -> CPointer<ByteVar>?>>>(424).value = value }
    
    var errmsg16: CPointer<CFunction<(CPointer<sqlite3>?) -> COpaquePointer?>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?) -> COpaquePointer?>>>(432).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?) -> COpaquePointer?>>>(432).value = value }
    
    var exec: CPointer<CFunction<(CPointer<sqlite3>?, CPointer<ByteVar>?, sqlite3_callback?, COpaquePointer?, CPointer<CPointerVar<ByteVar>>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, CPointer<ByteVar>?, sqlite3_callback?, COpaquePointer?, CPointer<CPointerVar<ByteVar>>?) -> Int>>>(440).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, CPointer<ByteVar>?, sqlite3_callback?, COpaquePointer?, CPointer<CPointerVar<ByteVar>>?) -> Int>>>(440).value = value }
    
    var expired: CPointer<CFunction<(CPointer<sqlite3_stmt>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_stmt>?) -> Int>>>(448).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_stmt>?) -> Int>>>(448).value = value }
    
    var finalize: CPointer<CFunction<(CPointer<sqlite3_stmt>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_stmt>?) -> Int>>>(456).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_stmt>?) -> Int>>>(456).value = value }
    
    var free: CPointer<CFunction<(COpaquePointer?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Unit>>>(464).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Unit>>>(464).value = value }
    
    var free_table: CPointer<CFunction<(CPointer<CPointerVar<ByteVar>>?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<CPointerVar<ByteVar>>?) -> Unit>>>(472).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<CPointerVar<ByteVar>>?) -> Unit>>>(472).value = value }
    
    var get_autocommit: CPointer<CFunction<(CPointer<sqlite3>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?) -> Int>>>(480).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?) -> Int>>>(480).value = value }
    
    var get_auxdata: CPointer<CFunction<(CPointer<sqlite3_context>?, Int) -> COpaquePointer?>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_context>?, Int) -> COpaquePointer?>>>(488).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_context>?, Int) -> COpaquePointer?>>>(488).value = value }
    
    var get_table: CPointer<CFunction<(CPointer<sqlite3>?, CPointer<ByteVar>?, CPointer<CPointerVar<CPointerVar<ByteVar>>>?, CPointer<IntVar>?, CPointer<IntVar>?, CPointer<CPointerVar<ByteVar>>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, CPointer<ByteVar>?, CPointer<CPointerVar<CPointerVar<ByteVar>>>?, CPointer<IntVar>?, CPointer<IntVar>?, CPointer<CPointerVar<ByteVar>>?) -> Int>>>(496).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, CPointer<ByteVar>?, CPointer<CPointerVar<CPointerVar<ByteVar>>>?, CPointer<IntVar>?, CPointer<IntVar>?, CPointer<CPointerVar<ByteVar>>?) -> Int>>>(496).value = value }
    
    var global_recover: CPointer<CFunction<() -> Int>>?
        get() = memberAt<CPointerVar<CFunction<() -> Int>>>(504).value
        set(value) { memberAt<CPointerVar<CFunction<() -> Int>>>(504).value = value }
    
    var interruptx: CPointer<CFunction<(CPointer<sqlite3>?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?) -> Unit>>>(512).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?) -> Unit>>>(512).value = value }
    
    var last_insert_rowid: CPointer<CFunction<(CPointer<sqlite3>?) -> sqlite_int64>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?) -> sqlite_int64>>>(520).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?) -> sqlite_int64>>>(520).value = value }
    
    var libversion: CPointer<CFunction<() -> CPointer<ByteVar>?>>?
        get() = memberAt<CPointerVar<CFunction<() -> CPointer<ByteVar>?>>>(528).value
        set(value) { memberAt<CPointerVar<CFunction<() -> CPointer<ByteVar>?>>>(528).value = value }
    
    var libversion_number: CPointer<CFunction<() -> Int>>?
        get() = memberAt<CPointerVar<CFunction<() -> Int>>>(536).value
        set(value) { memberAt<CPointerVar<CFunction<() -> Int>>>(536).value = value }
    
    var malloc: CPointer<CFunction<(Int) -> COpaquePointer?>>?
        get() = memberAt<CPointerVar<CFunction<(Int) -> COpaquePointer?>>>(544).value
        set(value) { memberAt<CPointerVar<CFunction<(Int) -> COpaquePointer?>>>(544).value = value }
    
    var mprintf: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(552).value
        set(value) { memberAt<COpaquePointerVar>(552).value = value }
    
    var open: CPointer<CFunction<(CPointer<ByteVar>?, CPointer<CPointerVar<sqlite3>>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<ByteVar>?, CPointer<CPointerVar<sqlite3>>?) -> Int>>>(560).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<ByteVar>?, CPointer<CPointerVar<sqlite3>>?) -> Int>>>(560).value = value }
    
    var open16: CPointer<CFunction<(COpaquePointer?, CPointer<CPointerVar<sqlite3>>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?, CPointer<CPointerVar<sqlite3>>?) -> Int>>>(568).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?, CPointer<CPointerVar<sqlite3>>?) -> Int>>>(568).value = value }
    
    var prepare: CPointer<CFunction<(CPointer<sqlite3>?, CPointer<ByteVar>?, Int, CPointer<CPointerVar<sqlite3_stmt>>?, CPointer<CPointerVar<ByteVar>>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, CPointer<ByteVar>?, Int, CPointer<CPointerVar<sqlite3_stmt>>?, CPointer<CPointerVar<ByteVar>>?) -> Int>>>(576).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, CPointer<ByteVar>?, Int, CPointer<CPointerVar<sqlite3_stmt>>?, CPointer<CPointerVar<ByteVar>>?) -> Int>>>(576).value = value }
    
    var prepare16: CPointer<CFunction<(CPointer<sqlite3>?, COpaquePointer?, Int, CPointer<CPointerVar<sqlite3_stmt>>?, CPointer<COpaquePointerVar>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, COpaquePointer?, Int, CPointer<CPointerVar<sqlite3_stmt>>?, CPointer<COpaquePointerVar>?) -> Int>>>(584).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, COpaquePointer?, Int, CPointer<CPointerVar<sqlite3_stmt>>?, CPointer<COpaquePointerVar>?) -> Int>>>(584).value = value }
    
    var profile: CPointer<CFunction<(CPointer<sqlite3>?, CPointer<CFunction<(COpaquePointer?, CPointer<ByteVar>?, sqlite_uint64) -> Unit>>?, COpaquePointer?) -> COpaquePointer?>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, CPointer<CFunction<(COpaquePointer?, CPointer<ByteVar>?, sqlite_uint64) -> Unit>>?, COpaquePointer?) -> COpaquePointer?>>>(592).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, CPointer<CFunction<(COpaquePointer?, CPointer<ByteVar>?, sqlite_uint64) -> Unit>>?, COpaquePointer?) -> COpaquePointer?>>>(592).value = value }
    
    var progress_handler: CPointer<CFunction<(CPointer<sqlite3>?, Int, CPointer<CFunction<(COpaquePointer?) -> Int>>?, COpaquePointer?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, Int, CPointer<CFunction<(COpaquePointer?) -> Int>>?, COpaquePointer?) -> Unit>>>(600).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, Int, CPointer<CFunction<(COpaquePointer?) -> Int>>?, COpaquePointer?) -> Unit>>>(600).value = value }
    
    var realloc: CPointer<CFunction<(COpaquePointer?, Int) -> COpaquePointer?>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?, Int) -> COpaquePointer?>>>(608).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?, Int) -> COpaquePointer?>>>(608).value = value }
    
    var reset: CPointer<CFunction<(CPointer<sqlite3_stmt>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_stmt>?) -> Int>>>(616).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_stmt>?) -> Int>>>(616).value = value }
    
    var result_blob: CPointer<CFunction<(CPointer<sqlite3_context>?, COpaquePointer?, Int, CPointer<CFunction<(COpaquePointer?) -> Unit>>?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_context>?, COpaquePointer?, Int, CPointer<CFunction<(COpaquePointer?) -> Unit>>?) -> Unit>>>(624).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_context>?, COpaquePointer?, Int, CPointer<CFunction<(COpaquePointer?) -> Unit>>?) -> Unit>>>(624).value = value }
    
    var result_double: CPointer<CFunction<(CPointer<sqlite3_context>?, Double) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_context>?, Double) -> Unit>>>(632).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_context>?, Double) -> Unit>>>(632).value = value }
    
    var result_error: CPointer<CFunction<(CPointer<sqlite3_context>?, CPointer<ByteVar>?, Int) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_context>?, CPointer<ByteVar>?, Int) -> Unit>>>(640).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_context>?, CPointer<ByteVar>?, Int) -> Unit>>>(640).value = value }
    
    var result_error16: CPointer<CFunction<(CPointer<sqlite3_context>?, COpaquePointer?, Int) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_context>?, COpaquePointer?, Int) -> Unit>>>(648).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_context>?, COpaquePointer?, Int) -> Unit>>>(648).value = value }
    
    var result_int: CPointer<CFunction<(CPointer<sqlite3_context>?, Int) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_context>?, Int) -> Unit>>>(656).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_context>?, Int) -> Unit>>>(656).value = value }
    
    var result_int64: CPointer<CFunction<(CPointer<sqlite3_context>?, sqlite_int64) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_context>?, sqlite_int64) -> Unit>>>(664).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_context>?, sqlite_int64) -> Unit>>>(664).value = value }
    
    var result_null: CPointer<CFunction<(CPointer<sqlite3_context>?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_context>?) -> Unit>>>(672).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_context>?) -> Unit>>>(672).value = value }
    
    var result_text: CPointer<CFunction<(CPointer<sqlite3_context>?, CPointer<ByteVar>?, Int, CPointer<CFunction<(COpaquePointer?) -> Unit>>?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_context>?, CPointer<ByteVar>?, Int, CPointer<CFunction<(COpaquePointer?) -> Unit>>?) -> Unit>>>(680).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_context>?, CPointer<ByteVar>?, Int, CPointer<CFunction<(COpaquePointer?) -> Unit>>?) -> Unit>>>(680).value = value }
    
    var result_text16: CPointer<CFunction<(CPointer<sqlite3_context>?, COpaquePointer?, Int, CPointer<CFunction<(COpaquePointer?) -> Unit>>?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_context>?, COpaquePointer?, Int, CPointer<CFunction<(COpaquePointer?) -> Unit>>?) -> Unit>>>(688).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_context>?, COpaquePointer?, Int, CPointer<CFunction<(COpaquePointer?) -> Unit>>?) -> Unit>>>(688).value = value }
    
    var result_text16be: CPointer<CFunction<(CPointer<sqlite3_context>?, COpaquePointer?, Int, CPointer<CFunction<(COpaquePointer?) -> Unit>>?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_context>?, COpaquePointer?, Int, CPointer<CFunction<(COpaquePointer?) -> Unit>>?) -> Unit>>>(696).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_context>?, COpaquePointer?, Int, CPointer<CFunction<(COpaquePointer?) -> Unit>>?) -> Unit>>>(696).value = value }
    
    var result_text16le: CPointer<CFunction<(CPointer<sqlite3_context>?, COpaquePointer?, Int, CPointer<CFunction<(COpaquePointer?) -> Unit>>?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_context>?, COpaquePointer?, Int, CPointer<CFunction<(COpaquePointer?) -> Unit>>?) -> Unit>>>(704).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_context>?, COpaquePointer?, Int, CPointer<CFunction<(COpaquePointer?) -> Unit>>?) -> Unit>>>(704).value = value }
    
    var result_value: CPointer<CFunction<(CPointer<sqlite3_context>?, CPointer<sqlite3_value>?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_context>?, CPointer<sqlite3_value>?) -> Unit>>>(712).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_context>?, CPointer<sqlite3_value>?) -> Unit>>>(712).value = value }
    
    var rollback_hook: CPointer<CFunction<(CPointer<sqlite3>?, CPointer<CFunction<(COpaquePointer?) -> Unit>>?, COpaquePointer?) -> COpaquePointer?>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, CPointer<CFunction<(COpaquePointer?) -> Unit>>?, COpaquePointer?) -> COpaquePointer?>>>(720).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, CPointer<CFunction<(COpaquePointer?) -> Unit>>?, COpaquePointer?) -> COpaquePointer?>>>(720).value = value }
    
    var set_authorizer: CPointer<CFunction<(CPointer<sqlite3>?, CPointer<CFunction<(COpaquePointer?, Int, CPointer<ByteVar>?, CPointer<ByteVar>?, CPointer<ByteVar>?, CPointer<ByteVar>?) -> Int>>?, COpaquePointer?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, CPointer<CFunction<(COpaquePointer?, Int, CPointer<ByteVar>?, CPointer<ByteVar>?, CPointer<ByteVar>?, CPointer<ByteVar>?) -> Int>>?, COpaquePointer?) -> Int>>>(728).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, CPointer<CFunction<(COpaquePointer?, Int, CPointer<ByteVar>?, CPointer<ByteVar>?, CPointer<ByteVar>?, CPointer<ByteVar>?) -> Int>>?, COpaquePointer?) -> Int>>>(728).value = value }
    
    var set_auxdata: CPointer<CFunction<(CPointer<sqlite3_context>?, Int, COpaquePointer?, CPointer<CFunction<(COpaquePointer?) -> Unit>>?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_context>?, Int, COpaquePointer?, CPointer<CFunction<(COpaquePointer?) -> Unit>>?) -> Unit>>>(736).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_context>?, Int, COpaquePointer?, CPointer<CFunction<(COpaquePointer?) -> Unit>>?) -> Unit>>>(736).value = value }
    
    var xsnprintf: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(744).value
        set(value) { memberAt<COpaquePointerVar>(744).value = value }
    
    var step: CPointer<CFunction<(CPointer<sqlite3_stmt>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_stmt>?) -> Int>>>(752).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_stmt>?) -> Int>>>(752).value = value }
    
    var table_column_metadata: CPointer<CFunction<(CPointer<sqlite3>?, CPointer<ByteVar>?, CPointer<ByteVar>?, CPointer<ByteVar>?, CPointer<CPointerVar<ByteVar>>?, CPointer<CPointerVar<ByteVar>>?, CPointer<IntVar>?, CPointer<IntVar>?, CPointer<IntVar>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, CPointer<ByteVar>?, CPointer<ByteVar>?, CPointer<ByteVar>?, CPointer<CPointerVar<ByteVar>>?, CPointer<CPointerVar<ByteVar>>?, CPointer<IntVar>?, CPointer<IntVar>?, CPointer<IntVar>?) -> Int>>>(760).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, CPointer<ByteVar>?, CPointer<ByteVar>?, CPointer<ByteVar>?, CPointer<CPointerVar<ByteVar>>?, CPointer<CPointerVar<ByteVar>>?, CPointer<IntVar>?, CPointer<IntVar>?, CPointer<IntVar>?) -> Int>>>(760).value = value }
    
    var thread_cleanup: CPointer<CFunction<() -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<() -> Unit>>>(768).value
        set(value) { memberAt<CPointerVar<CFunction<() -> Unit>>>(768).value = value }
    
    var total_changes: CPointer<CFunction<(CPointer<sqlite3>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?) -> Int>>>(776).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?) -> Int>>>(776).value = value }
    
    var trace: CPointer<CFunction<(CPointer<sqlite3>?, CPointer<CFunction<(COpaquePointer?, CPointer<ByteVar>?) -> Unit>>?, COpaquePointer?) -> COpaquePointer?>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, CPointer<CFunction<(COpaquePointer?, CPointer<ByteVar>?) -> Unit>>?, COpaquePointer?) -> COpaquePointer?>>>(784).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, CPointer<CFunction<(COpaquePointer?, CPointer<ByteVar>?) -> Unit>>?, COpaquePointer?) -> COpaquePointer?>>>(784).value = value }
    
    var transfer_bindings: CPointer<CFunction<(CPointer<sqlite3_stmt>?, CPointer<sqlite3_stmt>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_stmt>?, CPointer<sqlite3_stmt>?) -> Int>>>(792).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_stmt>?, CPointer<sqlite3_stmt>?) -> Int>>>(792).value = value }
    
    var update_hook: CPointer<CFunction<(CPointer<sqlite3>?, CPointer<CFunction<(COpaquePointer?, Int, CPointer<ByteVar>?, CPointer<ByteVar>?, sqlite_int64) -> Unit>>?, COpaquePointer?) -> COpaquePointer?>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, CPointer<CFunction<(COpaquePointer?, Int, CPointer<ByteVar>?, CPointer<ByteVar>?, sqlite_int64) -> Unit>>?, COpaquePointer?) -> COpaquePointer?>>>(800).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, CPointer<CFunction<(COpaquePointer?, Int, CPointer<ByteVar>?, CPointer<ByteVar>?, sqlite_int64) -> Unit>>?, COpaquePointer?) -> COpaquePointer?>>>(800).value = value }
    
    var user_data: CPointer<CFunction<(CPointer<sqlite3_context>?) -> COpaquePointer?>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_context>?) -> COpaquePointer?>>>(808).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_context>?) -> COpaquePointer?>>>(808).value = value }
    
    var value_blob: CPointer<CFunction<(CPointer<sqlite3_value>?) -> COpaquePointer?>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_value>?) -> COpaquePointer?>>>(816).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_value>?) -> COpaquePointer?>>>(816).value = value }
    
    var value_bytes: CPointer<CFunction<(CPointer<sqlite3_value>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_value>?) -> Int>>>(824).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_value>?) -> Int>>>(824).value = value }
    
    var value_bytes16: CPointer<CFunction<(CPointer<sqlite3_value>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_value>?) -> Int>>>(832).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_value>?) -> Int>>>(832).value = value }
    
    var value_double: CPointer<CFunction<(CPointer<sqlite3_value>?) -> Double>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_value>?) -> Double>>>(840).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_value>?) -> Double>>>(840).value = value }
    
    var value_int: CPointer<CFunction<(CPointer<sqlite3_value>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_value>?) -> Int>>>(848).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_value>?) -> Int>>>(848).value = value }
    
    var value_int64: CPointer<CFunction<(CPointer<sqlite3_value>?) -> sqlite_int64>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_value>?) -> sqlite_int64>>>(856).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_value>?) -> sqlite_int64>>>(856).value = value }
    
    var value_numeric_type: CPointer<CFunction<(CPointer<sqlite3_value>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_value>?) -> Int>>>(864).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_value>?) -> Int>>>(864).value = value }
    
    var value_text: CPointer<CFunction<(CPointer<sqlite3_value>?) -> CPointer<UByteVar>?>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_value>?) -> CPointer<UByteVar>?>>>(872).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_value>?) -> CPointer<UByteVar>?>>>(872).value = value }
    
    var value_text16: CPointer<CFunction<(CPointer<sqlite3_value>?) -> COpaquePointer?>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_value>?) -> COpaquePointer?>>>(880).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_value>?) -> COpaquePointer?>>>(880).value = value }
    
    var value_text16be: CPointer<CFunction<(CPointer<sqlite3_value>?) -> COpaquePointer?>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_value>?) -> COpaquePointer?>>>(888).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_value>?) -> COpaquePointer?>>>(888).value = value }
    
    var value_text16le: CPointer<CFunction<(CPointer<sqlite3_value>?) -> COpaquePointer?>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_value>?) -> COpaquePointer?>>>(896).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_value>?) -> COpaquePointer?>>>(896).value = value }
    
    var value_type: CPointer<CFunction<(CPointer<sqlite3_value>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_value>?) -> Int>>>(904).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_value>?) -> Int>>>(904).value = value }
    
    var vmprintf: CPointer<CFunction<(CPointer<ByteVar>?, va_list?) -> CPointer<ByteVar>?>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<ByteVar>?, va_list?) -> CPointer<ByteVar>?>>>(912).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<ByteVar>?, va_list?) -> CPointer<ByteVar>?>>>(912).value = value }
    
    var overload_function: CPointer<CFunction<(CPointer<sqlite3>?, CPointer<ByteVar>?, Int) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, CPointer<ByteVar>?, Int) -> Int>>>(920).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, CPointer<ByteVar>?, Int) -> Int>>>(920).value = value }
    
    var prepare_v2: CPointer<CFunction<(CPointer<sqlite3>?, CPointer<ByteVar>?, Int, CPointer<CPointerVar<sqlite3_stmt>>?, CPointer<CPointerVar<ByteVar>>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, CPointer<ByteVar>?, Int, CPointer<CPointerVar<sqlite3_stmt>>?, CPointer<CPointerVar<ByteVar>>?) -> Int>>>(928).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, CPointer<ByteVar>?, Int, CPointer<CPointerVar<sqlite3_stmt>>?, CPointer<CPointerVar<ByteVar>>?) -> Int>>>(928).value = value }
    
    var prepare16_v2: CPointer<CFunction<(CPointer<sqlite3>?, COpaquePointer?, Int, CPointer<CPointerVar<sqlite3_stmt>>?, CPointer<COpaquePointerVar>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, COpaquePointer?, Int, CPointer<CPointerVar<sqlite3_stmt>>?, CPointer<COpaquePointerVar>?) -> Int>>>(936).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, COpaquePointer?, Int, CPointer<CPointerVar<sqlite3_stmt>>?, CPointer<COpaquePointerVar>?) -> Int>>>(936).value = value }
    
    var clear_bindings: CPointer<CFunction<(CPointer<sqlite3_stmt>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_stmt>?) -> Int>>>(944).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_stmt>?) -> Int>>>(944).value = value }
    
    var create_module_v2: CPointer<CFunction<(CPointer<sqlite3>?, CPointer<ByteVar>?, CPointer<sqlite3_module>?, COpaquePointer?, CPointer<CFunction<(COpaquePointer?) -> Unit>>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, CPointer<ByteVar>?, CPointer<sqlite3_module>?, COpaquePointer?, CPointer<CFunction<(COpaquePointer?) -> Unit>>?) -> Int>>>(952).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, CPointer<ByteVar>?, CPointer<sqlite3_module>?, COpaquePointer?, CPointer<CFunction<(COpaquePointer?) -> Unit>>?) -> Int>>>(952).value = value }
    
    var bind_zeroblob: CPointer<CFunction<(CPointer<sqlite3_stmt>?, Int, Int) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_stmt>?, Int, Int) -> Int>>>(960).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_stmt>?, Int, Int) -> Int>>>(960).value = value }
    
    var blob_bytes: CPointer<CFunction<(CPointer<sqlite3_blob>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_blob>?) -> Int>>>(968).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_blob>?) -> Int>>>(968).value = value }
    
    var blob_close: CPointer<CFunction<(CPointer<sqlite3_blob>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_blob>?) -> Int>>>(976).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_blob>?) -> Int>>>(976).value = value }
    
    var blob_open: CPointer<CFunction<(CPointer<sqlite3>?, CPointer<ByteVar>?, CPointer<ByteVar>?, CPointer<ByteVar>?, sqlite3_int64, Int, CPointer<CPointerVar<sqlite3_blob>>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, CPointer<ByteVar>?, CPointer<ByteVar>?, CPointer<ByteVar>?, sqlite3_int64, Int, CPointer<CPointerVar<sqlite3_blob>>?) -> Int>>>(984).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, CPointer<ByteVar>?, CPointer<ByteVar>?, CPointer<ByteVar>?, sqlite3_int64, Int, CPointer<CPointerVar<sqlite3_blob>>?) -> Int>>>(984).value = value }
    
    var blob_read: CPointer<CFunction<(CPointer<sqlite3_blob>?, COpaquePointer?, Int, Int) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_blob>?, COpaquePointer?, Int, Int) -> Int>>>(992).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_blob>?, COpaquePointer?, Int, Int) -> Int>>>(992).value = value }
    
    var blob_write: CPointer<CFunction<(CPointer<sqlite3_blob>?, COpaquePointer?, Int, Int) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_blob>?, COpaquePointer?, Int, Int) -> Int>>>(1000).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_blob>?, COpaquePointer?, Int, Int) -> Int>>>(1000).value = value }
    
    var create_collation_v2: CPointer<CFunction<(CPointer<sqlite3>?, CPointer<ByteVar>?, Int, COpaquePointer?, CPointer<CFunction<(COpaquePointer?, Int, COpaquePointer?, Int, COpaquePointer?) -> Int>>?, CPointer<CFunction<(COpaquePointer?) -> Unit>>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, CPointer<ByteVar>?, Int, COpaquePointer?, CPointer<CFunction<(COpaquePointer?, Int, COpaquePointer?, Int, COpaquePointer?) -> Int>>?, CPointer<CFunction<(COpaquePointer?) -> Unit>>?) -> Int>>>(1008).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, CPointer<ByteVar>?, Int, COpaquePointer?, CPointer<CFunction<(COpaquePointer?, Int, COpaquePointer?, Int, COpaquePointer?) -> Int>>?, CPointer<CFunction<(COpaquePointer?) -> Unit>>?) -> Int>>>(1008).value = value }
    
    var file_control: CPointer<CFunction<(CPointer<sqlite3>?, CPointer<ByteVar>?, Int, COpaquePointer?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, CPointer<ByteVar>?, Int, COpaquePointer?) -> Int>>>(1016).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, CPointer<ByteVar>?, Int, COpaquePointer?) -> Int>>>(1016).value = value }
    
    var memory_highwater: CPointer<CFunction<(Int) -> sqlite3_int64>>?
        get() = memberAt<CPointerVar<CFunction<(Int) -> sqlite3_int64>>>(1024).value
        set(value) { memberAt<CPointerVar<CFunction<(Int) -> sqlite3_int64>>>(1024).value = value }
    
    var memory_used: CPointer<CFunction<() -> sqlite3_int64>>?
        get() = memberAt<CPointerVar<CFunction<() -> sqlite3_int64>>>(1032).value
        set(value) { memberAt<CPointerVar<CFunction<() -> sqlite3_int64>>>(1032).value = value }
    
    var mutex_alloc: CPointer<CFunction<(Int) -> CPointer<sqlite3_mutex>?>>?
        get() = memberAt<CPointerVar<CFunction<(Int) -> CPointer<sqlite3_mutex>?>>>(1040).value
        set(value) { memberAt<CPointerVar<CFunction<(Int) -> CPointer<sqlite3_mutex>?>>>(1040).value = value }
    
    var mutex_enter: CPointer<CFunction<(CPointer<sqlite3_mutex>?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_mutex>?) -> Unit>>>(1048).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_mutex>?) -> Unit>>>(1048).value = value }
    
    var mutex_free: CPointer<CFunction<(CPointer<sqlite3_mutex>?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_mutex>?) -> Unit>>>(1056).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_mutex>?) -> Unit>>>(1056).value = value }
    
    var mutex_leave: CPointer<CFunction<(CPointer<sqlite3_mutex>?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_mutex>?) -> Unit>>>(1064).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_mutex>?) -> Unit>>>(1064).value = value }
    
    var mutex_try: CPointer<CFunction<(CPointer<sqlite3_mutex>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_mutex>?) -> Int>>>(1072).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_mutex>?) -> Int>>>(1072).value = value }
    
    var open_v2: CPointer<CFunction<(CPointer<ByteVar>?, CPointer<CPointerVar<sqlite3>>?, Int, CPointer<ByteVar>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<ByteVar>?, CPointer<CPointerVar<sqlite3>>?, Int, CPointer<ByteVar>?) -> Int>>>(1080).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<ByteVar>?, CPointer<CPointerVar<sqlite3>>?, Int, CPointer<ByteVar>?) -> Int>>>(1080).value = value }
    
    var release_memory: CPointer<CFunction<(Int) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(Int) -> Int>>>(1088).value
        set(value) { memberAt<CPointerVar<CFunction<(Int) -> Int>>>(1088).value = value }
    
    var result_error_nomem: CPointer<CFunction<(CPointer<sqlite3_context>?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_context>?) -> Unit>>>(1096).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_context>?) -> Unit>>>(1096).value = value }
    
    var result_error_toobig: CPointer<CFunction<(CPointer<sqlite3_context>?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_context>?) -> Unit>>>(1104).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_context>?) -> Unit>>>(1104).value = value }
    
    var sleep: CPointer<CFunction<(Int) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(Int) -> Int>>>(1112).value
        set(value) { memberAt<CPointerVar<CFunction<(Int) -> Int>>>(1112).value = value }
    
    var soft_heap_limit: CPointer<CFunction<(Int) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(Int) -> Unit>>>(1120).value
        set(value) { memberAt<CPointerVar<CFunction<(Int) -> Unit>>>(1120).value = value }
    
    var vfs_find: CPointer<CFunction<(CPointer<ByteVar>?) -> CPointer<sqlite3_vfs>?>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<ByteVar>?) -> CPointer<sqlite3_vfs>?>>>(1128).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<ByteVar>?) -> CPointer<sqlite3_vfs>?>>>(1128).value = value }
    
    var vfs_register: CPointer<CFunction<(CPointer<sqlite3_vfs>?, Int) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vfs>?, Int) -> Int>>>(1136).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vfs>?, Int) -> Int>>>(1136).value = value }
    
    var vfs_unregister: CPointer<CFunction<(CPointer<sqlite3_vfs>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vfs>?) -> Int>>>(1144).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vfs>?) -> Int>>>(1144).value = value }
    
    var xthreadsafe: CPointer<CFunction<() -> Int>>?
        get() = memberAt<CPointerVar<CFunction<() -> Int>>>(1152).value
        set(value) { memberAt<CPointerVar<CFunction<() -> Int>>>(1152).value = value }
    
    var result_zeroblob: CPointer<CFunction<(CPointer<sqlite3_context>?, Int) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_context>?, Int) -> Unit>>>(1160).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_context>?, Int) -> Unit>>>(1160).value = value }
    
    var result_error_code: CPointer<CFunction<(CPointer<sqlite3_context>?, Int) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_context>?, Int) -> Unit>>>(1168).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_context>?, Int) -> Unit>>>(1168).value = value }
    
    var test_control: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(1176).value
        set(value) { memberAt<COpaquePointerVar>(1176).value = value }
    
    var randomness: CPointer<CFunction<(Int, COpaquePointer?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(Int, COpaquePointer?) -> Unit>>>(1184).value
        set(value) { memberAt<CPointerVar<CFunction<(Int, COpaquePointer?) -> Unit>>>(1184).value = value }
    
    var context_db_handle: CPointer<CFunction<(CPointer<sqlite3_context>?) -> CPointer<sqlite3>?>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_context>?) -> CPointer<sqlite3>?>>>(1192).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_context>?) -> CPointer<sqlite3>?>>>(1192).value = value }
    
    var extended_result_codes: CPointer<CFunction<(CPointer<sqlite3>?, Int) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, Int) -> Int>>>(1200).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, Int) -> Int>>>(1200).value = value }
    
    var limit: CPointer<CFunction<(CPointer<sqlite3>?, Int, Int) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, Int, Int) -> Int>>>(1208).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, Int, Int) -> Int>>>(1208).value = value }
    
    var next_stmt: CPointer<CFunction<(CPointer<sqlite3>?, CPointer<sqlite3_stmt>?) -> CPointer<sqlite3_stmt>?>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, CPointer<sqlite3_stmt>?) -> CPointer<sqlite3_stmt>?>>>(1216).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, CPointer<sqlite3_stmt>?) -> CPointer<sqlite3_stmt>?>>>(1216).value = value }
    
    var sql: CPointer<CFunction<(CPointer<sqlite3_stmt>?) -> CPointer<ByteVar>?>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_stmt>?) -> CPointer<ByteVar>?>>>(1224).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_stmt>?) -> CPointer<ByteVar>?>>>(1224).value = value }
    
    var status: CPointer<CFunction<(Int, CPointer<IntVar>?, CPointer<IntVar>?, Int) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(Int, CPointer<IntVar>?, CPointer<IntVar>?, Int) -> Int>>>(1232).value
        set(value) { memberAt<CPointerVar<CFunction<(Int, CPointer<IntVar>?, CPointer<IntVar>?, Int) -> Int>>>(1232).value = value }
    
    var backup_finish: CPointer<CFunction<(CPointer<sqlite3_backup>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_backup>?) -> Int>>>(1240).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_backup>?) -> Int>>>(1240).value = value }
    
    var backup_init: CPointer<CFunction<(CPointer<sqlite3>?, CPointer<ByteVar>?, CPointer<sqlite3>?, CPointer<ByteVar>?) -> CPointer<sqlite3_backup>?>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, CPointer<ByteVar>?, CPointer<sqlite3>?, CPointer<ByteVar>?) -> CPointer<sqlite3_backup>?>>>(1248).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, CPointer<ByteVar>?, CPointer<sqlite3>?, CPointer<ByteVar>?) -> CPointer<sqlite3_backup>?>>>(1248).value = value }
    
    var backup_pagecount: CPointer<CFunction<(CPointer<sqlite3_backup>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_backup>?) -> Int>>>(1256).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_backup>?) -> Int>>>(1256).value = value }
    
    var backup_remaining: CPointer<CFunction<(CPointer<sqlite3_backup>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_backup>?) -> Int>>>(1264).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_backup>?) -> Int>>>(1264).value = value }
    
    var backup_step: CPointer<CFunction<(CPointer<sqlite3_backup>?, Int) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_backup>?, Int) -> Int>>>(1272).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_backup>?, Int) -> Int>>>(1272).value = value }
    
    var compileoption_get: CPointer<CFunction<(Int) -> CPointer<ByteVar>?>>?
        get() = memberAt<CPointerVar<CFunction<(Int) -> CPointer<ByteVar>?>>>(1280).value
        set(value) { memberAt<CPointerVar<CFunction<(Int) -> CPointer<ByteVar>?>>>(1280).value = value }
    
    var compileoption_used: CPointer<CFunction<(CPointer<ByteVar>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<ByteVar>?) -> Int>>>(1288).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<ByteVar>?) -> Int>>>(1288).value = value }
    
    var create_function_v2: CPointer<CFunction<(CPointer<sqlite3>?, CPointer<ByteVar>?, Int, Int, COpaquePointer?, CPointer<CFunction<(CPointer<sqlite3_context>?, Int, CPointer<CPointerVar<sqlite3_value>>?) -> Unit>>?, CPointer<CFunction<(CPointer<sqlite3_context>?, Int, CPointer<CPointerVar<sqlite3_value>>?) -> Unit>>?, CPointer<CFunction<(CPointer<sqlite3_context>?) -> Unit>>?, CPointer<CFunction<(COpaquePointer?) -> Unit>>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, CPointer<ByteVar>?, Int, Int, COpaquePointer?, CPointer<CFunction<(CPointer<sqlite3_context>?, Int, CPointer<CPointerVar<sqlite3_value>>?) -> Unit>>?, CPointer<CFunction<(CPointer<sqlite3_context>?, Int, CPointer<CPointerVar<sqlite3_value>>?) -> Unit>>?, CPointer<CFunction<(CPointer<sqlite3_context>?) -> Unit>>?, CPointer<CFunction<(COpaquePointer?) -> Unit>>?) -> Int>>>(1296).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, CPointer<ByteVar>?, Int, Int, COpaquePointer?, CPointer<CFunction<(CPointer<sqlite3_context>?, Int, CPointer<CPointerVar<sqlite3_value>>?) -> Unit>>?, CPointer<CFunction<(CPointer<sqlite3_context>?, Int, CPointer<CPointerVar<sqlite3_value>>?) -> Unit>>?, CPointer<CFunction<(CPointer<sqlite3_context>?) -> Unit>>?, CPointer<CFunction<(COpaquePointer?) -> Unit>>?) -> Int>>>(1296).value = value }
    
    var db_config: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(1304).value
        set(value) { memberAt<COpaquePointerVar>(1304).value = value }
    
    var db_mutex: CPointer<CFunction<(CPointer<sqlite3>?) -> CPointer<sqlite3_mutex>?>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?) -> CPointer<sqlite3_mutex>?>>>(1312).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?) -> CPointer<sqlite3_mutex>?>>>(1312).value = value }
    
    var db_status: CPointer<CFunction<(CPointer<sqlite3>?, Int, CPointer<IntVar>?, CPointer<IntVar>?, Int) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, Int, CPointer<IntVar>?, CPointer<IntVar>?, Int) -> Int>>>(1320).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, Int, CPointer<IntVar>?, CPointer<IntVar>?, Int) -> Int>>>(1320).value = value }
    
    var extended_errcode: CPointer<CFunction<(CPointer<sqlite3>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?) -> Int>>>(1328).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?) -> Int>>>(1328).value = value }
    
    var log: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(1336).value
        set(value) { memberAt<COpaquePointerVar>(1336).value = value }
    
    var soft_heap_limit64: CPointer<CFunction<(sqlite3_int64) -> sqlite3_int64>>?
        get() = memberAt<CPointerVar<CFunction<(sqlite3_int64) -> sqlite3_int64>>>(1344).value
        set(value) { memberAt<CPointerVar<CFunction<(sqlite3_int64) -> sqlite3_int64>>>(1344).value = value }
    
    var sourceid: CPointer<CFunction<() -> CPointer<ByteVar>?>>?
        get() = memberAt<CPointerVar<CFunction<() -> CPointer<ByteVar>?>>>(1352).value
        set(value) { memberAt<CPointerVar<CFunction<() -> CPointer<ByteVar>?>>>(1352).value = value }
    
    var stmt_status: CPointer<CFunction<(CPointer<sqlite3_stmt>?, Int, Int) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_stmt>?, Int, Int) -> Int>>>(1360).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_stmt>?, Int, Int) -> Int>>>(1360).value = value }
    
    var strnicmp: CPointer<CFunction<(CPointer<ByteVar>?, CPointer<ByteVar>?, Int) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<ByteVar>?, CPointer<ByteVar>?, Int) -> Int>>>(1368).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<ByteVar>?, CPointer<ByteVar>?, Int) -> Int>>>(1368).value = value }
    
    var unlock_notify: CPointer<CFunction<(CPointer<sqlite3>?, CPointer<CFunction<(CPointer<COpaquePointerVar>?, Int) -> Unit>>?, COpaquePointer?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, CPointer<CFunction<(CPointer<COpaquePointerVar>?, Int) -> Unit>>?, COpaquePointer?) -> Int>>>(1376).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, CPointer<CFunction<(CPointer<COpaquePointerVar>?, Int) -> Unit>>?, COpaquePointer?) -> Int>>>(1376).value = value }
    
    var wal_autocheckpoint: CPointer<CFunction<(CPointer<sqlite3>?, Int) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, Int) -> Int>>>(1384).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, Int) -> Int>>>(1384).value = value }
    
    var wal_checkpoint: CPointer<CFunction<(CPointer<sqlite3>?, CPointer<ByteVar>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, CPointer<ByteVar>?) -> Int>>>(1392).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, CPointer<ByteVar>?) -> Int>>>(1392).value = value }
    
    var wal_hook: CPointer<CFunction<(CPointer<sqlite3>?, CPointer<CFunction<(COpaquePointer?, CPointer<sqlite3>?, CPointer<ByteVar>?, Int) -> Int>>?, COpaquePointer?) -> COpaquePointer?>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, CPointer<CFunction<(COpaquePointer?, CPointer<sqlite3>?, CPointer<ByteVar>?, Int) -> Int>>?, COpaquePointer?) -> COpaquePointer?>>>(1400).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, CPointer<CFunction<(COpaquePointer?, CPointer<sqlite3>?, CPointer<ByteVar>?, Int) -> Int>>?, COpaquePointer?) -> COpaquePointer?>>>(1400).value = value }
    
    var blob_reopen: CPointer<CFunction<(CPointer<sqlite3_blob>?, sqlite3_int64) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_blob>?, sqlite3_int64) -> Int>>>(1408).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_blob>?, sqlite3_int64) -> Int>>>(1408).value = value }
    
    var vtab_config: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(1416).value
        set(value) { memberAt<COpaquePointerVar>(1416).value = value }
    
    var vtab_on_conflict: CPointer<CFunction<(CPointer<sqlite3>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?) -> Int>>>(1424).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?) -> Int>>>(1424).value = value }
    
    var close_v2: CPointer<CFunction<(CPointer<sqlite3>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?) -> Int>>>(1432).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?) -> Int>>>(1432).value = value }
    
    var db_filename: CPointer<CFunction<(CPointer<sqlite3>?, CPointer<ByteVar>?) -> CPointer<ByteVar>?>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, CPointer<ByteVar>?) -> CPointer<ByteVar>?>>>(1440).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, CPointer<ByteVar>?) -> CPointer<ByteVar>?>>>(1440).value = value }
    
    var db_readonly: CPointer<CFunction<(CPointer<sqlite3>?, CPointer<ByteVar>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, CPointer<ByteVar>?) -> Int>>>(1448).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, CPointer<ByteVar>?) -> Int>>>(1448).value = value }
    
    var db_release_memory: CPointer<CFunction<(CPointer<sqlite3>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?) -> Int>>>(1456).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?) -> Int>>>(1456).value = value }
    
    var errstr: CPointer<CFunction<(Int) -> CPointer<ByteVar>?>>?
        get() = memberAt<CPointerVar<CFunction<(Int) -> CPointer<ByteVar>?>>>(1464).value
        set(value) { memberAt<CPointerVar<CFunction<(Int) -> CPointer<ByteVar>?>>>(1464).value = value }
    
    var stmt_busy: CPointer<CFunction<(CPointer<sqlite3_stmt>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_stmt>?) -> Int>>>(1472).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_stmt>?) -> Int>>>(1472).value = value }
    
    var stmt_readonly: CPointer<CFunction<(CPointer<sqlite3_stmt>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_stmt>?) -> Int>>>(1480).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_stmt>?) -> Int>>>(1480).value = value }
    
    var stricmp: CPointer<CFunction<(CPointer<ByteVar>?, CPointer<ByteVar>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<ByteVar>?, CPointer<ByteVar>?) -> Int>>>(1488).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<ByteVar>?, CPointer<ByteVar>?) -> Int>>>(1488).value = value }
    
    var uri_boolean: CPointer<CFunction<(CPointer<ByteVar>?, CPointer<ByteVar>?, Int) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<ByteVar>?, CPointer<ByteVar>?, Int) -> Int>>>(1496).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<ByteVar>?, CPointer<ByteVar>?, Int) -> Int>>>(1496).value = value }
    
    var uri_int64: CPointer<CFunction<(CPointer<ByteVar>?, CPointer<ByteVar>?, sqlite3_int64) -> sqlite3_int64>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<ByteVar>?, CPointer<ByteVar>?, sqlite3_int64) -> sqlite3_int64>>>(1504).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<ByteVar>?, CPointer<ByteVar>?, sqlite3_int64) -> sqlite3_int64>>>(1504).value = value }
    
    var uri_parameter: CPointer<CFunction<(CPointer<ByteVar>?, CPointer<ByteVar>?) -> CPointer<ByteVar>?>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<ByteVar>?, CPointer<ByteVar>?) -> CPointer<ByteVar>?>>>(1512).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<ByteVar>?, CPointer<ByteVar>?) -> CPointer<ByteVar>?>>>(1512).value = value }
    
    var xvsnprintf: CPointer<CFunction<(Int, CPointer<ByteVar>?, CPointer<ByteVar>?, va_list?) -> CPointer<ByteVar>?>>?
        get() = memberAt<CPointerVar<CFunction<(Int, CPointer<ByteVar>?, CPointer<ByteVar>?, va_list?) -> CPointer<ByteVar>?>>>(1520).value
        set(value) { memberAt<CPointerVar<CFunction<(Int, CPointer<ByteVar>?, CPointer<ByteVar>?, va_list?) -> CPointer<ByteVar>?>>>(1520).value = value }
    
    var wal_checkpoint_v2: CPointer<CFunction<(CPointer<sqlite3>?, CPointer<ByteVar>?, Int, CPointer<IntVar>?, CPointer<IntVar>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, CPointer<ByteVar>?, Int, CPointer<IntVar>?, CPointer<IntVar>?) -> Int>>>(1528).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, CPointer<ByteVar>?, Int, CPointer<IntVar>?, CPointer<IntVar>?) -> Int>>>(1528).value = value }
    
    var auto_extension: CPointer<CFunction<(CPointer<CFunction<() -> Unit>>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<CFunction<() -> Unit>>?) -> Int>>>(1536).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<CFunction<() -> Unit>>?) -> Int>>>(1536).value = value }
    
    var bind_blob64: CPointer<CFunction<(CPointer<sqlite3_stmt>?, Int, COpaquePointer?, sqlite3_uint64, CPointer<CFunction<(COpaquePointer?) -> Unit>>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_stmt>?, Int, COpaquePointer?, sqlite3_uint64, CPointer<CFunction<(COpaquePointer?) -> Unit>>?) -> Int>>>(1544).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_stmt>?, Int, COpaquePointer?, sqlite3_uint64, CPointer<CFunction<(COpaquePointer?) -> Unit>>?) -> Int>>>(1544).value = value }
    
    var bind_text64: CPointer<CFunction<(CPointer<sqlite3_stmt>?, Int, CPointer<ByteVar>?, sqlite3_uint64, CPointer<CFunction<(COpaquePointer?) -> Unit>>?, UByte) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_stmt>?, Int, CPointer<ByteVar>?, sqlite3_uint64, CPointer<CFunction<(COpaquePointer?) -> Unit>>?, UByte) -> Int>>>(1552).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_stmt>?, Int, CPointer<ByteVar>?, sqlite3_uint64, CPointer<CFunction<(COpaquePointer?) -> Unit>>?, UByte) -> Int>>>(1552).value = value }
    
    var cancel_auto_extension: CPointer<CFunction<(CPointer<CFunction<() -> Unit>>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<CFunction<() -> Unit>>?) -> Int>>>(1560).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<CFunction<() -> Unit>>?) -> Int>>>(1560).value = value }
    
    var load_extension: CPointer<CFunction<(CPointer<sqlite3>?, CPointer<ByteVar>?, CPointer<ByteVar>?, CPointer<CPointerVar<ByteVar>>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, CPointer<ByteVar>?, CPointer<ByteVar>?, CPointer<CPointerVar<ByteVar>>?) -> Int>>>(1568).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, CPointer<ByteVar>?, CPointer<ByteVar>?, CPointer<CPointerVar<ByteVar>>?) -> Int>>>(1568).value = value }
    
    var malloc64: CPointer<CFunction<(sqlite3_uint64) -> COpaquePointer?>>?
        get() = memberAt<CPointerVar<CFunction<(sqlite3_uint64) -> COpaquePointer?>>>(1576).value
        set(value) { memberAt<CPointerVar<CFunction<(sqlite3_uint64) -> COpaquePointer?>>>(1576).value = value }
    
    var msize: CPointer<CFunction<(COpaquePointer?) -> sqlite3_uint64>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?) -> sqlite3_uint64>>>(1584).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?) -> sqlite3_uint64>>>(1584).value = value }
    
    var realloc64: CPointer<CFunction<(COpaquePointer?, sqlite3_uint64) -> COpaquePointer?>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?, sqlite3_uint64) -> COpaquePointer?>>>(1592).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?, sqlite3_uint64) -> COpaquePointer?>>>(1592).value = value }
    
    var reset_auto_extension: CPointer<CFunction<() -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<() -> Unit>>>(1600).value
        set(value) { memberAt<CPointerVar<CFunction<() -> Unit>>>(1600).value = value }
    
    var result_blob64: CPointer<CFunction<(CPointer<sqlite3_context>?, COpaquePointer?, sqlite3_uint64, CPointer<CFunction<(COpaquePointer?) -> Unit>>?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_context>?, COpaquePointer?, sqlite3_uint64, CPointer<CFunction<(COpaquePointer?) -> Unit>>?) -> Unit>>>(1608).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_context>?, COpaquePointer?, sqlite3_uint64, CPointer<CFunction<(COpaquePointer?) -> Unit>>?) -> Unit>>>(1608).value = value }
    
    var result_text64: CPointer<CFunction<(CPointer<sqlite3_context>?, CPointer<ByteVar>?, sqlite3_uint64, CPointer<CFunction<(COpaquePointer?) -> Unit>>?, UByte) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_context>?, CPointer<ByteVar>?, sqlite3_uint64, CPointer<CFunction<(COpaquePointer?) -> Unit>>?, UByte) -> Unit>>>(1616).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_context>?, CPointer<ByteVar>?, sqlite3_uint64, CPointer<CFunction<(COpaquePointer?) -> Unit>>?, UByte) -> Unit>>>(1616).value = value }
    
    var strglob: CPointer<CFunction<(CPointer<ByteVar>?, CPointer<ByteVar>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<ByteVar>?, CPointer<ByteVar>?) -> Int>>>(1624).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<ByteVar>?, CPointer<ByteVar>?) -> Int>>>(1624).value = value }
    
    var value_dup: CPointer<CFunction<(CPointer<sqlite3_value>?) -> CPointer<sqlite3_value>?>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_value>?) -> CPointer<sqlite3_value>?>>>(1632).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_value>?) -> CPointer<sqlite3_value>?>>>(1632).value = value }
    
    var value_free: CPointer<CFunction<(CPointer<sqlite3_value>?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_value>?) -> Unit>>>(1640).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_value>?) -> Unit>>>(1640).value = value }
    
    var result_zeroblob64: CPointer<CFunction<(CPointer<sqlite3_context>?, sqlite3_uint64) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_context>?, sqlite3_uint64) -> Int>>>(1648).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_context>?, sqlite3_uint64) -> Int>>>(1648).value = value }
    
    var bind_zeroblob64: CPointer<CFunction<(CPointer<sqlite3_stmt>?, Int, sqlite3_uint64) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_stmt>?, Int, sqlite3_uint64) -> Int>>>(1656).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_stmt>?, Int, sqlite3_uint64) -> Int>>>(1656).value = value }
    
    var value_subtype: CPointer<CFunction<(CPointer<sqlite3_value>?) -> UInt>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_value>?) -> UInt>>>(1664).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_value>?) -> UInt>>>(1664).value = value }
    
    var result_subtype: CPointer<CFunction<(CPointer<sqlite3_context>?, UInt) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_context>?, UInt) -> Unit>>>(1672).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_context>?, UInt) -> Unit>>>(1672).value = value }
    
    var status64: CPointer<CFunction<(Int, CPointer<sqlite3_int64Var>?, CPointer<sqlite3_int64Var>?, Int) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(Int, CPointer<sqlite3_int64Var>?, CPointer<sqlite3_int64Var>?, Int) -> Int>>>(1680).value
        set(value) { memberAt<CPointerVar<CFunction<(Int, CPointer<sqlite3_int64Var>?, CPointer<sqlite3_int64Var>?, Int) -> Int>>>(1680).value = value }
    
    var strlike: CPointer<CFunction<(CPointer<ByteVar>?, CPointer<ByteVar>?, UInt) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<ByteVar>?, CPointer<ByteVar>?, UInt) -> Int>>>(1688).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<ByteVar>?, CPointer<ByteVar>?, UInt) -> Int>>>(1688).value = value }
    
    var db_cacheflush: CPointer<CFunction<(CPointer<sqlite3>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?) -> Int>>>(1696).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?) -> Int>>>(1696).value = value }
    
    var system_errno: CPointer<CFunction<(CPointer<sqlite3>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?) -> Int>>>(1704).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?) -> Int>>>(1704).value = value }
    
    var trace_v2: CPointer<CFunction<(CPointer<sqlite3>?, UInt, CPointer<CFunction<(UInt, COpaquePointer?, COpaquePointer?, COpaquePointer?) -> Int>>?, COpaquePointer?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, UInt, CPointer<CFunction<(UInt, COpaquePointer?, COpaquePointer?, COpaquePointer?) -> Int>>?, COpaquePointer?) -> Int>>>(1712).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, UInt, CPointer<CFunction<(UInt, COpaquePointer?, COpaquePointer?, COpaquePointer?) -> Int>>?, COpaquePointer?) -> Int>>>(1712).value = value }
    
    var expanded_sql: CPointer<CFunction<(CPointer<sqlite3_stmt>?) -> CPointer<ByteVar>?>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_stmt>?) -> CPointer<ByteVar>?>>>(1720).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_stmt>?) -> CPointer<ByteVar>?>>>(1720).value = value }
    
    var set_last_insert_rowid: CPointer<CFunction<(CPointer<sqlite3>?, sqlite3_int64) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, sqlite3_int64) -> Unit>>>(1728).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, sqlite3_int64) -> Unit>>>(1728).value = value }
    
    var prepare_v3: CPointer<CFunction<(CPointer<sqlite3>?, CPointer<ByteVar>?, Int, UInt, CPointer<CPointerVar<sqlite3_stmt>>?, CPointer<CPointerVar<ByteVar>>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, CPointer<ByteVar>?, Int, UInt, CPointer<CPointerVar<sqlite3_stmt>>?, CPointer<CPointerVar<ByteVar>>?) -> Int>>>(1736).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, CPointer<ByteVar>?, Int, UInt, CPointer<CPointerVar<sqlite3_stmt>>?, CPointer<CPointerVar<ByteVar>>?) -> Int>>>(1736).value = value }
    
    var prepare16_v3: CPointer<CFunction<(CPointer<sqlite3>?, COpaquePointer?, Int, UInt, CPointer<CPointerVar<sqlite3_stmt>>?, CPointer<COpaquePointerVar>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, COpaquePointer?, Int, UInt, CPointer<CPointerVar<sqlite3_stmt>>?, CPointer<COpaquePointerVar>?) -> Int>>>(1744).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, COpaquePointer?, Int, UInt, CPointer<CPointerVar<sqlite3_stmt>>?, CPointer<COpaquePointerVar>?) -> Int>>>(1744).value = value }
    
    var bind_pointer: CPointer<CFunction<(CPointer<sqlite3_stmt>?, Int, COpaquePointer?, CPointer<ByteVar>?, CPointer<CFunction<(COpaquePointer?) -> Unit>>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_stmt>?, Int, COpaquePointer?, CPointer<ByteVar>?, CPointer<CFunction<(COpaquePointer?) -> Unit>>?) -> Int>>>(1752).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_stmt>?, Int, COpaquePointer?, CPointer<ByteVar>?, CPointer<CFunction<(COpaquePointer?) -> Unit>>?) -> Int>>>(1752).value = value }
    
    var result_pointer: CPointer<CFunction<(CPointer<sqlite3_context>?, COpaquePointer?, CPointer<ByteVar>?, CPointer<CFunction<(COpaquePointer?) -> Unit>>?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_context>?, COpaquePointer?, CPointer<ByteVar>?, CPointer<CFunction<(COpaquePointer?) -> Unit>>?) -> Unit>>>(1760).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_context>?, COpaquePointer?, CPointer<ByteVar>?, CPointer<CFunction<(COpaquePointer?) -> Unit>>?) -> Unit>>>(1760).value = value }
    
    var value_pointer: CPointer<CFunction<(CPointer<sqlite3_value>?, CPointer<ByteVar>?) -> COpaquePointer?>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_value>?, CPointer<ByteVar>?) -> COpaquePointer?>>>(1768).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_value>?, CPointer<ByteVar>?) -> COpaquePointer?>>>(1768).value = value }
    
    var vtab_nochange: CPointer<CFunction<(CPointer<sqlite3_context>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_context>?) -> Int>>>(1776).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_context>?) -> Int>>>(1776).value = value }
    
    var value_nochange: CPointer<CFunction<(CPointer<sqlite3_value>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_value>?) -> Int>>>(1784).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_value>?) -> Int>>>(1784).value = value }
    
    var vtab_collation: CPointer<CFunction<(CPointer<sqlite3_index_info>?, Int) -> CPointer<ByteVar>?>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_index_info>?, Int) -> CPointer<ByteVar>?>>>(1792).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_index_info>?, Int) -> CPointer<ByteVar>?>>>(1792).value = value }
    
    var keyword_count: CPointer<CFunction<() -> Int>>?
        get() = memberAt<CPointerVar<CFunction<() -> Int>>>(1800).value
        set(value) { memberAt<CPointerVar<CFunction<() -> Int>>>(1800).value = value }
    
    var keyword_name: CPointer<CFunction<(Int, CPointer<CPointerVar<ByteVar>>?, CPointer<IntVar>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(Int, CPointer<CPointerVar<ByteVar>>?, CPointer<IntVar>?) -> Int>>>(1808).value
        set(value) { memberAt<CPointerVar<CFunction<(Int, CPointer<CPointerVar<ByteVar>>?, CPointer<IntVar>?) -> Int>>>(1808).value = value }
    
    var keyword_check: CPointer<CFunction<(CPointer<ByteVar>?, Int) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<ByteVar>?, Int) -> Int>>>(1816).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<ByteVar>?, Int) -> Int>>>(1816).value = value }
    
    var str_new: CPointer<CFunction<(CPointer<sqlite3>?) -> CPointer<sqlite3_str>?>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?) -> CPointer<sqlite3_str>?>>>(1824).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?) -> CPointer<sqlite3_str>?>>>(1824).value = value }
    
    var str_finish: CPointer<CFunction<(CPointer<sqlite3_str>?) -> CPointer<ByteVar>?>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_str>?) -> CPointer<ByteVar>?>>>(1832).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_str>?) -> CPointer<ByteVar>?>>>(1832).value = value }
    
    var str_appendf: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(1840).value
        set(value) { memberAt<COpaquePointerVar>(1840).value = value }
    
    var str_vappendf: CPointer<CFunction<(CPointer<sqlite3_str>?, CPointer<ByteVar>?, va_list?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_str>?, CPointer<ByteVar>?, va_list?) -> Unit>>>(1848).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_str>?, CPointer<ByteVar>?, va_list?) -> Unit>>>(1848).value = value }
    
    var str_append: CPointer<CFunction<(CPointer<sqlite3_str>?, CPointer<ByteVar>?, Int) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_str>?, CPointer<ByteVar>?, Int) -> Unit>>>(1856).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_str>?, CPointer<ByteVar>?, Int) -> Unit>>>(1856).value = value }
    
    var str_appendall: CPointer<CFunction<(CPointer<sqlite3_str>?, CPointer<ByteVar>?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_str>?, CPointer<ByteVar>?) -> Unit>>>(1864).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_str>?, CPointer<ByteVar>?) -> Unit>>>(1864).value = value }
    
    var str_appendchar: CPointer<CFunction<(CPointer<sqlite3_str>?, Int, Byte) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_str>?, Int, Byte) -> Unit>>>(1872).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_str>?, Int, Byte) -> Unit>>>(1872).value = value }
    
    var str_reset: CPointer<CFunction<(CPointer<sqlite3_str>?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_str>?) -> Unit>>>(1880).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_str>?) -> Unit>>>(1880).value = value }
    
    var str_errcode: CPointer<CFunction<(CPointer<sqlite3_str>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_str>?) -> Int>>>(1888).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_str>?) -> Int>>>(1888).value = value }
    
    var str_length: CPointer<CFunction<(CPointer<sqlite3_str>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_str>?) -> Int>>>(1896).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_str>?) -> Int>>>(1896).value = value }
    
    var str_value: CPointer<CFunction<(CPointer<sqlite3_str>?) -> CPointer<ByteVar>?>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_str>?) -> CPointer<ByteVar>?>>>(1904).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_str>?) -> CPointer<ByteVar>?>>>(1904).value = value }
    
    var create_window_function: CPointer<CFunction<(CPointer<sqlite3>?, CPointer<ByteVar>?, Int, Int, COpaquePointer?, CPointer<CFunction<(CPointer<sqlite3_context>?, Int, CPointer<CPointerVar<sqlite3_value>>?) -> Unit>>?, CPointer<CFunction<(CPointer<sqlite3_context>?) -> Unit>>?, CPointer<CFunction<(CPointer<sqlite3_context>?) -> Unit>>?, CPointer<CFunction<(CPointer<sqlite3_context>?, Int, CPointer<CPointerVar<sqlite3_value>>?) -> Unit>>?, CPointer<CFunction<(COpaquePointer?) -> Unit>>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, CPointer<ByteVar>?, Int, Int, COpaquePointer?, CPointer<CFunction<(CPointer<sqlite3_context>?, Int, CPointer<CPointerVar<sqlite3_value>>?) -> Unit>>?, CPointer<CFunction<(CPointer<sqlite3_context>?) -> Unit>>?, CPointer<CFunction<(CPointer<sqlite3_context>?) -> Unit>>?, CPointer<CFunction<(CPointer<sqlite3_context>?, Int, CPointer<CPointerVar<sqlite3_value>>?) -> Unit>>?, CPointer<CFunction<(COpaquePointer?) -> Unit>>?) -> Int>>>(1912).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, CPointer<ByteVar>?, Int, Int, COpaquePointer?, CPointer<CFunction<(CPointer<sqlite3_context>?, Int, CPointer<CPointerVar<sqlite3_value>>?) -> Unit>>?, CPointer<CFunction<(CPointer<sqlite3_context>?) -> Unit>>?, CPointer<CFunction<(CPointer<sqlite3_context>?) -> Unit>>?, CPointer<CFunction<(CPointer<sqlite3_context>?, Int, CPointer<CPointerVar<sqlite3_value>>?) -> Unit>>?, CPointer<CFunction<(COpaquePointer?) -> Unit>>?) -> Int>>>(1912).value = value }
    
    var normalized_sql: CPointer<CFunction<(CPointer<sqlite3_stmt>?) -> CPointer<ByteVar>?>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_stmt>?) -> CPointer<ByteVar>?>>>(1920).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_stmt>?) -> CPointer<ByteVar>?>>>(1920).value = value }
}

@CStruct("struct { void* p0; void* p1; unsigned int p2; unsigned int p3; unsigned int p4; unsigned char p5; unsigned char p6; }")
class sqlite3_str(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(32, 8)
    
    var db: CPointer<sqlite3>?
        get() = memberAt<CPointerVar<sqlite3>>(0).value
        set(value) { memberAt<CPointerVar<sqlite3>>(0).value = value }
    
    var zText: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(8).value
        set(value) { memberAt<CPointerVar<ByteVar>>(8).value = value }
    
    var nAlloc: u32
        get() = memberAt<u32Var>(16).value
        set(value) { memberAt<u32Var>(16).value = value }
    
    var mxAlloc: u32
        get() = memberAt<u32Var>(20).value
        set(value) { memberAt<u32Var>(20).value = value }
    
    var nChar: u32
        get() = memberAt<u32Var>(24).value
        set(value) { memberAt<u32Var>(24).value = value }
    
    var accError: u8
        get() = memberAt<u8Var>(28).value
        set(value) { memberAt<u8Var>(28).value = value }
    
    var printfFlags: u8
        get() = memberAt<u8Var>(29).value
        set(value) { memberAt<u8Var>(29).value = value }
}

@CStruct("struct { void* p0; void* p1; void* p2; void* p3; void* p4; void* p5; void* p6; void* p7; }")
class sqlite3_mem_methods(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(64, 8)
    
    var xMalloc: CPointer<CFunction<(Int) -> COpaquePointer?>>?
        get() = memberAt<CPointerVar<CFunction<(Int) -> COpaquePointer?>>>(0).value
        set(value) { memberAt<CPointerVar<CFunction<(Int) -> COpaquePointer?>>>(0).value = value }
    
    var xFree: CPointer<CFunction<(COpaquePointer?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Unit>>>(8).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Unit>>>(8).value = value }
    
    var xRealloc: CPointer<CFunction<(COpaquePointer?, Int) -> COpaquePointer?>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?, Int) -> COpaquePointer?>>>(16).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?, Int) -> COpaquePointer?>>>(16).value = value }
    
    var xSize: CPointer<CFunction<(COpaquePointer?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Int>>>(24).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Int>>>(24).value = value }
    
    var xRoundup: CPointer<CFunction<(Int) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(Int) -> Int>>>(32).value
        set(value) { memberAt<CPointerVar<CFunction<(Int) -> Int>>>(32).value = value }
    
    var xInit: CPointer<CFunction<(COpaquePointer?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Int>>>(40).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Int>>>(40).value = value }
    
    var xShutdown: CPointer<CFunction<(COpaquePointer?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Unit>>>(48).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Unit>>>(48).value = value }
    
    var pAppData: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(56).value
        set(value) { memberAt<COpaquePointerVar>(56).value = value }
}

@CStruct("struct { void* p0; void* p1; void* p2; void* p3; void* p4; void* p5; void* p6; void* p7; void* p8; }")
class sqlite3_mutex_methods(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(72, 8)
    
    var xMutexInit: CPointer<CFunction<() -> Int>>?
        get() = memberAt<CPointerVar<CFunction<() -> Int>>>(0).value
        set(value) { memberAt<CPointerVar<CFunction<() -> Int>>>(0).value = value }
    
    var xMutexEnd: CPointer<CFunction<() -> Int>>?
        get() = memberAt<CPointerVar<CFunction<() -> Int>>>(8).value
        set(value) { memberAt<CPointerVar<CFunction<() -> Int>>>(8).value = value }
    
    var xMutexAlloc: CPointer<CFunction<(Int) -> CPointer<sqlite3_mutex>?>>?
        get() = memberAt<CPointerVar<CFunction<(Int) -> CPointer<sqlite3_mutex>?>>>(16).value
        set(value) { memberAt<CPointerVar<CFunction<(Int) -> CPointer<sqlite3_mutex>?>>>(16).value = value }
    
    var xMutexFree: CPointer<CFunction<(CPointer<sqlite3_mutex>?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_mutex>?) -> Unit>>>(24).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_mutex>?) -> Unit>>>(24).value = value }
    
    var xMutexEnter: CPointer<CFunction<(CPointer<sqlite3_mutex>?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_mutex>?) -> Unit>>>(32).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_mutex>?) -> Unit>>>(32).value = value }
    
    var xMutexTry: CPointer<CFunction<(CPointer<sqlite3_mutex>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_mutex>?) -> Int>>>(40).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_mutex>?) -> Int>>>(40).value = value }
    
    var xMutexLeave: CPointer<CFunction<(CPointer<sqlite3_mutex>?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_mutex>?) -> Unit>>>(48).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_mutex>?) -> Unit>>>(48).value = value }
    
    var xMutexHeld: CPointer<CFunction<(CPointer<sqlite3_mutex>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_mutex>?) -> Int>>>(56).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_mutex>?) -> Int>>>(56).value = value }
    
    var xMutexNotheld: CPointer<CFunction<(CPointer<sqlite3_mutex>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_mutex>?) -> Int>>>(64).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_mutex>?) -> Int>>>(64).value = value }
}

@CStruct("struct { int p0; void* p1; void* p2; void* p3; void* p4; void* p5; void* p6; void* p7; void* p8; void* p9; void* p10; void* p11; void* p12; }")
class sqlite3_pcache_methods2(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(104, 8)
    
    var iVersion: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var pArg: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(8).value
        set(value) { memberAt<COpaquePointerVar>(8).value = value }
    
    var xInit: CPointer<CFunction<(COpaquePointer?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Int>>>(16).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Int>>>(16).value = value }
    
    var xShutdown: CPointer<CFunction<(COpaquePointer?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Unit>>>(24).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Unit>>>(24).value = value }
    
    var xCreate: CPointer<CFunction<(Int, Int, Int) -> CPointer<sqlite3_pcache>?>>?
        get() = memberAt<CPointerVar<CFunction<(Int, Int, Int) -> CPointer<sqlite3_pcache>?>>>(32).value
        set(value) { memberAt<CPointerVar<CFunction<(Int, Int, Int) -> CPointer<sqlite3_pcache>?>>>(32).value = value }
    
    var xCachesize: CPointer<CFunction<(CPointer<sqlite3_pcache>?, Int) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_pcache>?, Int) -> Unit>>>(40).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_pcache>?, Int) -> Unit>>>(40).value = value }
    
    var xPagecount: CPointer<CFunction<(CPointer<sqlite3_pcache>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_pcache>?) -> Int>>>(48).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_pcache>?) -> Int>>>(48).value = value }
    
    var xFetch: CPointer<CFunction<(CPointer<sqlite3_pcache>?, UInt, Int) -> CPointer<sqlite3_pcache_page>?>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_pcache>?, UInt, Int) -> CPointer<sqlite3_pcache_page>?>>>(56).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_pcache>?, UInt, Int) -> CPointer<sqlite3_pcache_page>?>>>(56).value = value }
    
    var xUnpin: CPointer<CFunction<(CPointer<sqlite3_pcache>?, CPointer<sqlite3_pcache_page>?, Int) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_pcache>?, CPointer<sqlite3_pcache_page>?, Int) -> Unit>>>(64).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_pcache>?, CPointer<sqlite3_pcache_page>?, Int) -> Unit>>>(64).value = value }
    
    var xRekey: CPointer<CFunction<(CPointer<sqlite3_pcache>?, CPointer<sqlite3_pcache_page>?, UInt, UInt) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_pcache>?, CPointer<sqlite3_pcache_page>?, UInt, UInt) -> Unit>>>(72).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_pcache>?, CPointer<sqlite3_pcache_page>?, UInt, UInt) -> Unit>>>(72).value = value }
    
    var xTruncate: CPointer<CFunction<(CPointer<sqlite3_pcache>?, UInt) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_pcache>?, UInt) -> Unit>>>(80).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_pcache>?, UInt) -> Unit>>>(80).value = value }
    
    var xDestroy: CPointer<CFunction<(CPointer<sqlite3_pcache>?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_pcache>?) -> Unit>>>(88).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_pcache>?) -> Unit>>>(88).value = value }
    
    var xShrink: CPointer<CFunction<(CPointer<sqlite3_pcache>?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_pcache>?) -> Unit>>>(96).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_pcache>?) -> Unit>>>(96).value = value }
}

@CStruct("struct { void* p0; void* p1; void* p2; void* p3; void* p4; void* p5; void* p6; void* p7; void* p8; void* p9; void* p10; }")
class sqlite3_pcache_methods(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(88, 8)
    
    var pArg: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(0).value
        set(value) { memberAt<COpaquePointerVar>(0).value = value }
    
    var xInit: CPointer<CFunction<(COpaquePointer?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Int>>>(8).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Int>>>(8).value = value }
    
    var xShutdown: CPointer<CFunction<(COpaquePointer?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Unit>>>(16).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Unit>>>(16).value = value }
    
    var xCreate: CPointer<CFunction<(Int, Int) -> CPointer<sqlite3_pcache>?>>?
        get() = memberAt<CPointerVar<CFunction<(Int, Int) -> CPointer<sqlite3_pcache>?>>>(24).value
        set(value) { memberAt<CPointerVar<CFunction<(Int, Int) -> CPointer<sqlite3_pcache>?>>>(24).value = value }
    
    var xCachesize: CPointer<CFunction<(CPointer<sqlite3_pcache>?, Int) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_pcache>?, Int) -> Unit>>>(32).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_pcache>?, Int) -> Unit>>>(32).value = value }
    
    var xPagecount: CPointer<CFunction<(CPointer<sqlite3_pcache>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_pcache>?) -> Int>>>(40).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_pcache>?) -> Int>>>(40).value = value }
    
    var xFetch: CPointer<CFunction<(CPointer<sqlite3_pcache>?, UInt, Int) -> COpaquePointer?>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_pcache>?, UInt, Int) -> COpaquePointer?>>>(48).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_pcache>?, UInt, Int) -> COpaquePointer?>>>(48).value = value }
    
    var xUnpin: CPointer<CFunction<(CPointer<sqlite3_pcache>?, COpaquePointer?, Int) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_pcache>?, COpaquePointer?, Int) -> Unit>>>(56).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_pcache>?, COpaquePointer?, Int) -> Unit>>>(56).value = value }
    
    var xRekey: CPointer<CFunction<(CPointer<sqlite3_pcache>?, COpaquePointer?, UInt, UInt) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_pcache>?, COpaquePointer?, UInt, UInt) -> Unit>>>(64).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_pcache>?, COpaquePointer?, UInt, UInt) -> Unit>>>(64).value = value }
    
    var xTruncate: CPointer<CFunction<(CPointer<sqlite3_pcache>?, UInt) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_pcache>?, UInt) -> Unit>>>(72).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_pcache>?, UInt) -> Unit>>>(72).value = value }
    
    var xDestroy: CPointer<CFunction<(CPointer<sqlite3_pcache>?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_pcache>?) -> Unit>>>(80).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_pcache>?) -> Unit>>>(80).value = value }
}

@CStruct("struct { unsigned char p0[48]; }")
class sqlite3_snapshot(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(48, 1)
    
    val hidden: CArrayPointer<UByteVar>
        get() = arrayMemberAt(0)
}

@CStruct("struct { void* p0; int p1; void* p2; void* p3; void* p4; }")
class sqlite3_rtree_geometry(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(40, 8)
    
    var pContext: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(0).value
        set(value) { memberAt<COpaquePointerVar>(0).value = value }
    
    var nParam: Int
        get() = memberAt<IntVar>(8).value
        set(value) { memberAt<IntVar>(8).value = value }
    
    var aParam: CPointer<sqlite3_rtree_dblVar>?
        get() = memberAt<CPointerVar<sqlite3_rtree_dblVar>>(16).value
        set(value) { memberAt<CPointerVar<sqlite3_rtree_dblVar>>(16).value = value }
    
    var pUser: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(24).value
        set(value) { memberAt<COpaquePointerVar>(24).value = value }
    
    var xDelUser: CPointer<CFunction<(COpaquePointer?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Unit>>>(32).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Unit>>>(32).value = value }
}

@CStruct("struct { void* p0; int p1; void* p2; void* p3; void* p4; void* p5; void* p6; int p7; int p8; int p9; long long p10; double p11; int p12; int p13; double p14; void* p15; }")
class sqlite3_rtree_query_info(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(112, 8)
    
    var pContext: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(0).value
        set(value) { memberAt<COpaquePointerVar>(0).value = value }
    
    var nParam: Int
        get() = memberAt<IntVar>(8).value
        set(value) { memberAt<IntVar>(8).value = value }
    
    var aParam: CPointer<sqlite3_rtree_dblVar>?
        get() = memberAt<CPointerVar<sqlite3_rtree_dblVar>>(16).value
        set(value) { memberAt<CPointerVar<sqlite3_rtree_dblVar>>(16).value = value }
    
    var pUser: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(24).value
        set(value) { memberAt<COpaquePointerVar>(24).value = value }
    
    var xDelUser: CPointer<CFunction<(COpaquePointer?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Unit>>>(32).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Unit>>>(32).value = value }
    
    var aCoord: CPointer<sqlite3_rtree_dblVar>?
        get() = memberAt<CPointerVar<sqlite3_rtree_dblVar>>(40).value
        set(value) { memberAt<CPointerVar<sqlite3_rtree_dblVar>>(40).value = value }
    
    var anQueue: CPointer<UIntVar>?
        get() = memberAt<CPointerVar<UIntVar>>(48).value
        set(value) { memberAt<CPointerVar<UIntVar>>(48).value = value }
    
    var nCoord: Int
        get() = memberAt<IntVar>(56).value
        set(value) { memberAt<IntVar>(56).value = value }
    
    var iLevel: Int
        get() = memberAt<IntVar>(60).value
        set(value) { memberAt<IntVar>(60).value = value }
    
    var mxLevel: Int
        get() = memberAt<IntVar>(64).value
        set(value) { memberAt<IntVar>(64).value = value }
    
    var iRowid: sqlite3_int64
        get() = memberAt<sqlite3_int64Var>(72).value
        set(value) { memberAt<sqlite3_int64Var>(72).value = value }
    
    var rParentScore: sqlite3_rtree_dbl
        get() = memberAt<sqlite3_rtree_dblVar>(80).value
        set(value) { memberAt<sqlite3_rtree_dblVar>(80).value = value }
    
    var eParentWithin: Int
        get() = memberAt<IntVar>(88).value
        set(value) { memberAt<IntVar>(88).value = value }
    
    var eWithin: Int
        get() = memberAt<IntVar>(92).value
        set(value) { memberAt<IntVar>(92).value = value }
    
    var rScore: sqlite3_rtree_dbl
        get() = memberAt<sqlite3_rtree_dblVar>(96).value
        set(value) { memberAt<sqlite3_rtree_dblVar>(96).value = value }
    
    var apSqlParam: CPointer<CPointerVar<sqlite3_value>>?
        get() = memberAt<CPointerVar<CPointerVar<sqlite3_value>>>(104).value
        set(value) { memberAt<CPointerVar<CPointerVar<sqlite3_value>>>(104).value = value }
}

@CStruct("struct { int p0; void* p1; void* p2; void* p3; void* p4; void* p5; void* p6; void* p7; void* p8; void* p9; void* p10; void* p11; void* p12; void* p13; void* p14; void* p15; void* p16; void* p17; void* p18; void* p19; }")
class Fts5ExtensionApi(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(160, 8)
    
    var iVersion: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var xUserData: CPointer<CFunction<(CPointer<Fts5Context>?) -> COpaquePointer?>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<Fts5Context>?) -> COpaquePointer?>>>(8).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<Fts5Context>?) -> COpaquePointer?>>>(8).value = value }
    
    var xColumnCount: CPointer<CFunction<(CPointer<Fts5Context>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<Fts5Context>?) -> Int>>>(16).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<Fts5Context>?) -> Int>>>(16).value = value }
    
    var xRowCount: CPointer<CFunction<(CPointer<Fts5Context>?, CPointer<sqlite3_int64Var>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<Fts5Context>?, CPointer<sqlite3_int64Var>?) -> Int>>>(24).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<Fts5Context>?, CPointer<sqlite3_int64Var>?) -> Int>>>(24).value = value }
    
    var xColumnTotalSize: CPointer<CFunction<(CPointer<Fts5Context>?, Int, CPointer<sqlite3_int64Var>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<Fts5Context>?, Int, CPointer<sqlite3_int64Var>?) -> Int>>>(32).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<Fts5Context>?, Int, CPointer<sqlite3_int64Var>?) -> Int>>>(32).value = value }
    
    var xTokenize: CPointer<CFunction<(CPointer<Fts5Context>?, CPointer<ByteVar>?, Int, COpaquePointer?, CPointer<CFunction<(COpaquePointer?, Int, CPointer<ByteVar>?, Int, Int, Int) -> Int>>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<Fts5Context>?, CPointer<ByteVar>?, Int, COpaquePointer?, CPointer<CFunction<(COpaquePointer?, Int, CPointer<ByteVar>?, Int, Int, Int) -> Int>>?) -> Int>>>(40).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<Fts5Context>?, CPointer<ByteVar>?, Int, COpaquePointer?, CPointer<CFunction<(COpaquePointer?, Int, CPointer<ByteVar>?, Int, Int, Int) -> Int>>?) -> Int>>>(40).value = value }
    
    var xPhraseCount: CPointer<CFunction<(CPointer<Fts5Context>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<Fts5Context>?) -> Int>>>(48).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<Fts5Context>?) -> Int>>>(48).value = value }
    
    var xPhraseSize: CPointer<CFunction<(CPointer<Fts5Context>?, Int) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<Fts5Context>?, Int) -> Int>>>(56).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<Fts5Context>?, Int) -> Int>>>(56).value = value }
    
    var xInstCount: CPointer<CFunction<(CPointer<Fts5Context>?, CPointer<IntVar>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<Fts5Context>?, CPointer<IntVar>?) -> Int>>>(64).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<Fts5Context>?, CPointer<IntVar>?) -> Int>>>(64).value = value }
    
    var xInst: CPointer<CFunction<(CPointer<Fts5Context>?, Int, CPointer<IntVar>?, CPointer<IntVar>?, CPointer<IntVar>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<Fts5Context>?, Int, CPointer<IntVar>?, CPointer<IntVar>?, CPointer<IntVar>?) -> Int>>>(72).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<Fts5Context>?, Int, CPointer<IntVar>?, CPointer<IntVar>?, CPointer<IntVar>?) -> Int>>>(72).value = value }
    
    var xRowid: CPointer<CFunction<(CPointer<Fts5Context>?) -> sqlite3_int64>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<Fts5Context>?) -> sqlite3_int64>>>(80).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<Fts5Context>?) -> sqlite3_int64>>>(80).value = value }
    
    var xColumnText: CPointer<CFunction<(CPointer<Fts5Context>?, Int, CPointer<CPointerVar<ByteVar>>?, CPointer<IntVar>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<Fts5Context>?, Int, CPointer<CPointerVar<ByteVar>>?, CPointer<IntVar>?) -> Int>>>(88).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<Fts5Context>?, Int, CPointer<CPointerVar<ByteVar>>?, CPointer<IntVar>?) -> Int>>>(88).value = value }
    
    var xColumnSize: CPointer<CFunction<(CPointer<Fts5Context>?, Int, CPointer<IntVar>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<Fts5Context>?, Int, CPointer<IntVar>?) -> Int>>>(96).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<Fts5Context>?, Int, CPointer<IntVar>?) -> Int>>>(96).value = value }
    
    var xQueryPhrase: CPointer<CFunction<(CPointer<Fts5Context>?, Int, COpaquePointer?, CPointer<CFunction<(CPointer<Fts5ExtensionApi>?, CPointer<Fts5Context>?, COpaquePointer?) -> Int>>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<Fts5Context>?, Int, COpaquePointer?, CPointer<CFunction<(CPointer<Fts5ExtensionApi>?, CPointer<Fts5Context>?, COpaquePointer?) -> Int>>?) -> Int>>>(104).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<Fts5Context>?, Int, COpaquePointer?, CPointer<CFunction<(CPointer<Fts5ExtensionApi>?, CPointer<Fts5Context>?, COpaquePointer?) -> Int>>?) -> Int>>>(104).value = value }
    
    var xSetAuxdata: CPointer<CFunction<(CPointer<Fts5Context>?, COpaquePointer?, CPointer<CFunction<(COpaquePointer?) -> Unit>>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<Fts5Context>?, COpaquePointer?, CPointer<CFunction<(COpaquePointer?) -> Unit>>?) -> Int>>>(112).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<Fts5Context>?, COpaquePointer?, CPointer<CFunction<(COpaquePointer?) -> Unit>>?) -> Int>>>(112).value = value }
    
    var xGetAuxdata: CPointer<CFunction<(CPointer<Fts5Context>?, Int) -> COpaquePointer?>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<Fts5Context>?, Int) -> COpaquePointer?>>>(120).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<Fts5Context>?, Int) -> COpaquePointer?>>>(120).value = value }
    
    var xPhraseFirst: CPointer<CFunction<(CPointer<Fts5Context>?, Int, CPointer<Fts5PhraseIter>?, CPointer<IntVar>?, CPointer<IntVar>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<Fts5Context>?, Int, CPointer<Fts5PhraseIter>?, CPointer<IntVar>?, CPointer<IntVar>?) -> Int>>>(128).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<Fts5Context>?, Int, CPointer<Fts5PhraseIter>?, CPointer<IntVar>?, CPointer<IntVar>?) -> Int>>>(128).value = value }
    
    var xPhraseNext: CPointer<CFunction<(CPointer<Fts5Context>?, CPointer<Fts5PhraseIter>?, CPointer<IntVar>?, CPointer<IntVar>?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<Fts5Context>?, CPointer<Fts5PhraseIter>?, CPointer<IntVar>?, CPointer<IntVar>?) -> Unit>>>(136).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<Fts5Context>?, CPointer<Fts5PhraseIter>?, CPointer<IntVar>?, CPointer<IntVar>?) -> Unit>>>(136).value = value }
    
    var xPhraseFirstColumn: CPointer<CFunction<(CPointer<Fts5Context>?, Int, CPointer<Fts5PhraseIter>?, CPointer<IntVar>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<Fts5Context>?, Int, CPointer<Fts5PhraseIter>?, CPointer<IntVar>?) -> Int>>>(144).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<Fts5Context>?, Int, CPointer<Fts5PhraseIter>?, CPointer<IntVar>?) -> Int>>>(144).value = value }
    
    var xPhraseNextColumn: CPointer<CFunction<(CPointer<Fts5Context>?, CPointer<Fts5PhraseIter>?, CPointer<IntVar>?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<Fts5Context>?, CPointer<Fts5PhraseIter>?, CPointer<IntVar>?) -> Unit>>>(152).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<Fts5Context>?, CPointer<Fts5PhraseIter>?, CPointer<IntVar>?) -> Unit>>>(152).value = value }
}

@CStruct("struct { void* p0; void* p1; }")
class Fts5PhraseIter(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 8)
    
    var a: CPointer<UByteVar>?
        get() = memberAt<CPointerVar<UByteVar>>(0).value
        set(value) { memberAt<CPointerVar<UByteVar>>(0).value = value }
    
    var b: CPointer<UByteVar>?
        get() = memberAt<CPointerVar<UByteVar>>(8).value
        set(value) { memberAt<CPointerVar<UByteVar>>(8).value = value }
}

@CStruct("struct { void* p0; void* p1; void* p2; }")
class fts5_tokenizer(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(24, 8)
    
    var xCreate: CPointer<CFunction<(COpaquePointer?, CPointer<CPointerVar<ByteVar>>?, Int, CPointer<CPointerVar<Fts5Tokenizer>>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?, CPointer<CPointerVar<ByteVar>>?, Int, CPointer<CPointerVar<Fts5Tokenizer>>?) -> Int>>>(0).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?, CPointer<CPointerVar<ByteVar>>?, Int, CPointer<CPointerVar<Fts5Tokenizer>>?) -> Int>>>(0).value = value }
    
    var xDelete: CPointer<CFunction<(CPointer<Fts5Tokenizer>?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<Fts5Tokenizer>?) -> Unit>>>(8).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<Fts5Tokenizer>?) -> Unit>>>(8).value = value }
    
    var xTokenize: CPointer<CFunction<(CPointer<Fts5Tokenizer>?, COpaquePointer?, Int, CPointer<ByteVar>?, Int, CPointer<CFunction<(COpaquePointer?, Int, CPointer<ByteVar>?, Int, Int, Int) -> Int>>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<Fts5Tokenizer>?, COpaquePointer?, Int, CPointer<ByteVar>?, Int, CPointer<CFunction<(COpaquePointer?, Int, CPointer<ByteVar>?, Int, Int, Int) -> Int>>?) -> Int>>>(16).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<Fts5Tokenizer>?, COpaquePointer?, Int, CPointer<ByteVar>?, Int, CPointer<CFunction<(COpaquePointer?, Int, CPointer<ByteVar>?, Int, Int, Int) -> Int>>?) -> Int>>>(16).value = value }
}

@CStruct("struct { int p0; void* p1; void* p2; void* p3; }")
class fts5_api(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(32, 8)
    
    var iVersion: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var xCreateTokenizer: CPointer<CFunction<(CPointer<fts5_api>?, CPointer<ByteVar>?, COpaquePointer?, CPointer<fts5_tokenizer>?, CPointer<CFunction<(COpaquePointer?) -> Unit>>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<fts5_api>?, CPointer<ByteVar>?, COpaquePointer?, CPointer<fts5_tokenizer>?, CPointer<CFunction<(COpaquePointer?) -> Unit>>?) -> Int>>>(8).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<fts5_api>?, CPointer<ByteVar>?, COpaquePointer?, CPointer<fts5_tokenizer>?, CPointer<CFunction<(COpaquePointer?) -> Unit>>?) -> Int>>>(8).value = value }
    
    var xFindTokenizer: CPointer<CFunction<(CPointer<fts5_api>?, CPointer<ByteVar>?, CPointer<COpaquePointerVar>?, CPointer<fts5_tokenizer>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<fts5_api>?, CPointer<ByteVar>?, CPointer<COpaquePointerVar>?, CPointer<fts5_tokenizer>?) -> Int>>>(16).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<fts5_api>?, CPointer<ByteVar>?, CPointer<COpaquePointerVar>?, CPointer<fts5_tokenizer>?) -> Int>>>(16).value = value }
    
    var xCreateFunction: CPointer<CFunction<(CPointer<fts5_api>?, CPointer<ByteVar>?, COpaquePointer?, fts5_extension_function?, CPointer<CFunction<(COpaquePointer?) -> Unit>>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<fts5_api>?, CPointer<ByteVar>?, COpaquePointer?, fts5_extension_function?, CPointer<CFunction<(COpaquePointer?) -> Unit>>?) -> Int>>>(24).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<fts5_api>?, CPointer<ByteVar>?, COpaquePointer?, fts5_extension_function?, CPointer<CFunction<(COpaquePointer?) -> Unit>>?) -> Int>>>(24).value = value }
}

@CStruct("struct { void* p0; void* p1; }")
class AuthContext(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 8)
    
    var zAuthContext: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(0).value
        set(value) { memberAt<CPointerVar<ByteVar>>(0).value = value }
    
    var pParse: CPointer<Parse>?
        get() = memberAt<CPointerVar<Parse>>(8).value
        set(value) { memberAt<CPointerVar<Parse>>(8).value = value }
}

@CStruct("struct { void* p0[23]; }")
class FuncDefHash(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(184, 8)
    
    val a: CArrayPointer<CPointerVar<FuncDef>>
        get() = arrayMemberAt(0)
}

@CStruct("struct { void* p0; int p1; void* p2; void* p3; void* p4; }")
class IndexSample(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(40, 8)
    
    var p: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(0).value
        set(value) { memberAt<COpaquePointerVar>(0).value = value }
    
    var n: Int
        get() = memberAt<IntVar>(8).value
        set(value) { memberAt<IntVar>(8).value = value }
    
    var anEq: CPointer<tRowcntVar>?
        get() = memberAt<CPointerVar<tRowcntVar>>(16).value
        set(value) { memberAt<CPointerVar<tRowcntVar>>(16).value = value }
    
    var anLt: CPointer<tRowcntVar>?
        get() = memberAt<CPointerVar<tRowcntVar>>(24).value
        set(value) { memberAt<CPointerVar<tRowcntVar>>(24).value = value }
    
    var anDLt: CPointer<tRowcntVar>?
        get() = memberAt<CPointerVar<tRowcntVar>>(32).value
        set(value) { memberAt<CPointerVar<tRowcntVar>>(32).value = value }
}

@CStruct("struct { void* p0; void* p1; union { void* p0; void* p1; void* p2; } p2; void* p3; int p4; int p5; unsigned short p6; void* p7; }")
class NameContext(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(56, 8)
    
    var pParse: CPointer<Parse>?
        get() = memberAt<CPointerVar<Parse>>(0).value
        set(value) { memberAt<CPointerVar<Parse>>(0).value = value }
    
    var pSrcList: CPointer<SrcList>?
        get() = memberAt<CPointerVar<SrcList>>(8).value
        set(value) { memberAt<CPointerVar<SrcList>>(8).value = value }
    
    val uNC: anonymousStruct14
        get() = memberAt(16)
    
    var pNext: CPointer<NameContext>?
        get() = memberAt<CPointerVar<NameContext>>(24).value
        set(value) { memberAt<CPointerVar<NameContext>>(24).value = value }
    
    var nRef: Int
        get() = memberAt<IntVar>(32).value
        set(value) { memberAt<IntVar>(32).value = value }
    
    var nErr: Int
        get() = memberAt<IntVar>(36).value
        set(value) { memberAt<IntVar>(36).value = value }
    
    var ncFlags: u16
        get() = memberAt<u16Var>(40).value
        set(value) { memberAt<u16Var>(40).value = value }
    
    var pWinSelect: CPointer<Select>?
        get() = memberAt<CPointerVar<Select>>(48).value
        set(value) { memberAt<CPointerVar<Select>>(48).value = value }
}

@CStruct("union { void* p0; void* p1; void* p2; }")
class anonymousStruct14(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(8, 8)
    
    var pEList: CPointer<ExprList>?
        get() = memberAt<CPointerVar<ExprList>>(0).value
        set(value) { memberAt<CPointerVar<ExprList>>(0).value = value }
    
    var pAggInfo: CPointer<AggInfo>?
        get() = memberAt<CPointerVar<AggInfo>>(0).value
        set(value) { memberAt<CPointerVar<AggInfo>>(0).value = value }
    
    var pUpsert: CPointer<Upsert>?
        get() = memberAt<CPointerVar<Upsert>>(0).value
        set(value) { memberAt<CPointerVar<Upsert>>(0).value = value }
}

@CStruct("struct { void* p0; void* p1; int p2; void* p3; struct { unsigned int p0; unsigned char p1; unsigned short p2; unsigned short p3; void* p4; void* p5; void* p6[1]; } p4; void* p5; void* p6; int p7; long long p8; long long p9; void* p10; void* p11; void* p12; }")
class PreUpdate(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(136, 8)
    
    var v: CPointer<Vdbe>?
        get() = memberAt<CPointerVar<Vdbe>>(0).value
        set(value) { memberAt<CPointerVar<Vdbe>>(0).value = value }
    
    var pCsr: CPointer<VdbeCursor>?
        get() = memberAt<CPointerVar<VdbeCursor>>(8).value
        set(value) { memberAt<CPointerVar<VdbeCursor>>(8).value = value }
    
    var op: Int
        get() = memberAt<IntVar>(16).value
        set(value) { memberAt<IntVar>(16).value = value }
    
    var aRecord: CPointer<u8Var>?
        get() = memberAt<CPointerVar<u8Var>>(24).value
        set(value) { memberAt<CPointerVar<u8Var>>(24).value = value }
    
    val keyinfo: KeyInfo
        get() = memberAt(32)
    
    var pUnpacked: CPointer<UnpackedRecord>?
        get() = memberAt<CPointerVar<UnpackedRecord>>(72).value
        set(value) { memberAt<CPointerVar<UnpackedRecord>>(72).value = value }
    
    var pNewUnpacked: CPointer<UnpackedRecord>?
        get() = memberAt<CPointerVar<UnpackedRecord>>(80).value
        set(value) { memberAt<CPointerVar<UnpackedRecord>>(80).value = value }
    
    var iNewReg: Int
        get() = memberAt<IntVar>(88).value
        set(value) { memberAt<IntVar>(88).value = value }
    
    var iKey1: i64
        get() = memberAt<i64Var>(96).value
        set(value) { memberAt<i64Var>(96).value = value }
    
    var iKey2: i64
        get() = memberAt<i64Var>(104).value
        set(value) { memberAt<i64Var>(104).value = value }
    
    var aNew: CPointer<Mem>?
        get() = memberAt<CPointerVar<Mem>>(112).value
        set(value) { memberAt<CPointerVar<Mem>>(112).value = value }
    
    var pTab: CPointer<Table>?
        get() = memberAt<CPointerVar<Table>>(120).value
        set(value) { memberAt<CPointerVar<Table>>(120).value = value }
    
    var pPk: CPointer<Index>?
        get() = memberAt<CPointerVar<Index>>(128).value
        set(value) { memberAt<CPointerVar<Index>>(128).value = value }
}

@CStruct("struct { int p0; int p1; void* p2; }")
class PrintfArguments(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 8)
    
    var nArg: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var nUsed: Int
        get() = memberAt<IntVar>(4).value
        set(value) { memberAt<IntVar>(4).value = value }
    
    var apArg: CPointer<CPointerVar<sqlite3_value>>?
        get() = memberAt<CPointerVar<CPointerVar<sqlite3_value>>>(8).value
        set(value) { memberAt<CPointerVar<CPointerVar<sqlite3_value>>>(8).value = value }
}

@CStruct("struct { void* p0; void* p1; void* p2; void* p3; void* p4; void* p5; unsigned short p6; unsigned short p7; int p8; }")
class RowSet(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(56, 8)
    
    var pChunk: CPointer<RowSetChunk>?
        get() = memberAt<CPointerVar<RowSetChunk>>(0).value
        set(value) { memberAt<CPointerVar<RowSetChunk>>(0).value = value }
    
    var db: CPointer<sqlite3>?
        get() = memberAt<CPointerVar<sqlite3>>(8).value
        set(value) { memberAt<CPointerVar<sqlite3>>(8).value = value }
    
    var pEntry: CPointer<RowSetEntry>?
        get() = memberAt<CPointerVar<RowSetEntry>>(16).value
        set(value) { memberAt<CPointerVar<RowSetEntry>>(16).value = value }
    
    var pLast: CPointer<RowSetEntry>?
        get() = memberAt<CPointerVar<RowSetEntry>>(24).value
        set(value) { memberAt<CPointerVar<RowSetEntry>>(24).value = value }
    
    var pFresh: CPointer<RowSetEntry>?
        get() = memberAt<CPointerVar<RowSetEntry>>(32).value
        set(value) { memberAt<CPointerVar<RowSetEntry>>(32).value = value }
    
    var pForest: CPointer<RowSetEntry>?
        get() = memberAt<CPointerVar<RowSetEntry>>(40).value
        set(value) { memberAt<CPointerVar<RowSetEntry>>(40).value = value }
    
    var nFresh: u16
        get() = memberAt<u16Var>(48).value
        set(value) { memberAt<u16Var>(48).value = value }
    
    var rsFlags: u16
        get() = memberAt<u16Var>(50).value
        set(value) { memberAt<u16Var>(50).value = value }
    
    var iBatch: Int
        get() = memberAt<IntVar>(52).value
        set(value) { memberAt<IntVar>(52).value = value }
}

@CStruct("struct { void* p0; struct { long long p0; void* p1; void* p2; } p1[42]; }")
class RowSetChunk(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(1016, 8)
    
    var pNextChunk: CPointer<RowSetChunk>?
        get() = memberAt<CPointerVar<RowSetChunk>>(0).value
        set(value) { memberAt<CPointerVar<RowSetChunk>>(0).value = value }
    
    val aEntry: CArrayPointer<RowSetEntry>
        get() = arrayMemberAt(8)
}

@CStruct("struct { long long p0; void* p1; void* p2; }")
class RowSetEntry(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(24, 8)
    
    var v: i64
        get() = memberAt<i64Var>(0).value
        set(value) { memberAt<i64Var>(0).value = value }
    
    var pRight: CPointer<RowSetEntry>?
        get() = memberAt<CPointerVar<RowSetEntry>>(8).value
        set(value) { memberAt<CPointerVar<RowSetEntry>>(8).value = value }
    
    var pLeft: CPointer<RowSetEntry>?
        get() = memberAt<CPointerVar<RowSetEntry>>(16).value
        set(value) { memberAt<CPointerVar<RowSetEntry>>(16).value = value }
}

@CStruct("struct { unsigned char p0; int p1; int p2; int p3; void* p4; void* p5; }")
class SelectDest(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(32, 8)
    
    var eDest: u8
        get() = memberAt<u8Var>(0).value
        set(value) { memberAt<u8Var>(0).value = value }
    
    var iSDParm: Int
        get() = memberAt<IntVar>(4).value
        set(value) { memberAt<IntVar>(4).value = value }
    
    var iSdst: Int
        get() = memberAt<IntVar>(8).value
        set(value) { memberAt<IntVar>(8).value = value }
    
    var nSdst: Int
        get() = memberAt<IntVar>(12).value
        set(value) { memberAt<IntVar>(12).value = value }
    
    var zAffSdst: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(16).value
        set(value) { memberAt<CPointerVar<ByteVar>>(16).value = value }
    
    var pOrderBy: CPointer<ExprList>?
        get() = memberAt<CPointerVar<ExprList>>(24).value
        set(value) { memberAt<CPointerVar<ExprList>>(24).value = value }
}

@CStruct("struct { void* p0; void* p1; void* p2; void* p3; int p4; unsigned char p5; union { void* p0; int p1; int p2; void* p3; void* p4; void* p5; void* p6; void* p7; void* p8; void* p9; void* p10; void* p11; void* p12; void* p13; } p6; }")
class Walker(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(48, 8)
    
    var pParse: CPointer<Parse>?
        get() = memberAt<CPointerVar<Parse>>(0).value
        set(value) { memberAt<CPointerVar<Parse>>(0).value = value }
    
    var xExprCallback: CPointer<CFunction<(CPointer<Walker>?, CPointer<Expr>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<Walker>?, CPointer<Expr>?) -> Int>>>(8).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<Walker>?, CPointer<Expr>?) -> Int>>>(8).value = value }
    
    var xSelectCallback: CPointer<CFunction<(CPointer<Walker>?, CPointer<Select>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<Walker>?, CPointer<Select>?) -> Int>>>(16).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<Walker>?, CPointer<Select>?) -> Int>>>(16).value = value }
    
    var xSelectCallback2: CPointer<CFunction<(CPointer<Walker>?, CPointer<Select>?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<Walker>?, CPointer<Select>?) -> Unit>>>(24).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<Walker>?, CPointer<Select>?) -> Unit>>>(24).value = value }
    
    var walkerDepth: Int
        get() = memberAt<IntVar>(32).value
        set(value) { memberAt<IntVar>(32).value = value }
    
    var eCode: u8
        get() = memberAt<u8Var>(36).value
        set(value) { memberAt<u8Var>(36).value = value }
    
    val u: anonymousStruct15
        get() = memberAt(40)
}

@CStruct("union { void* p0; int p1; int p2; void* p3; void* p4; void* p5; void* p6; void* p7; void* p8; void* p9; void* p10; void* p11; void* p12; void* p13; }")
class anonymousStruct15(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(8, 8)
    
    var pNC: CPointer<NameContext>?
        get() = memberAt<CPointerVar<NameContext>>(0).value
        set(value) { memberAt<CPointerVar<NameContext>>(0).value = value }
    
    var n: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var iCur: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var pSrcList: CPointer<SrcList>?
        get() = memberAt<CPointerVar<SrcList>>(0).value
        set(value) { memberAt<CPointerVar<SrcList>>(0).value = value }
    
    var pSrcCount: CPointer<SrcCount>?
        get() = memberAt<CPointerVar<SrcCount>>(0).value
        set(value) { memberAt<CPointerVar<SrcCount>>(0).value = value }
    
    var pCCurHint: CPointer<CCurHint>?
        get() = memberAt<CPointerVar<CCurHint>>(0).value
        set(value) { memberAt<CPointerVar<CCurHint>>(0).value = value }
    
    var aiCol: CPointer<IntVar>?
        get() = memberAt<CPointerVar<IntVar>>(0).value
        set(value) { memberAt<CPointerVar<IntVar>>(0).value = value }
    
    var pIdxCover: CPointer<IdxCover>?
        get() = memberAt<CPointerVar<IdxCover>>(0).value
        set(value) { memberAt<CPointerVar<IdxCover>>(0).value = value }
    
    var pIdxTrans: CPointer<IdxExprTrans>?
        get() = memberAt<CPointerVar<IdxExprTrans>>(0).value
        set(value) { memberAt<CPointerVar<IdxExprTrans>>(0).value = value }
    
    var pGroupBy: CPointer<ExprList>?
        get() = memberAt<CPointerVar<ExprList>>(0).value
        set(value) { memberAt<CPointerVar<ExprList>>(0).value = value }
    
    var pSelect: CPointer<Select>?
        get() = memberAt<CPointerVar<Select>>(0).value
        set(value) { memberAt<CPointerVar<Select>>(0).value = value }
    
    var pRewrite: CPointer<WindowRewrite>?
        get() = memberAt<CPointerVar<WindowRewrite>>(0).value
        set(value) { memberAt<CPointerVar<WindowRewrite>>(0).value = value }
    
    var pConst: CPointer<WhereConst>?
        get() = memberAt<CPointerVar<WhereConst>>(0).value
        set(value) { memberAt<CPointerVar<WhereConst>>(0).value = value }
    
    var pRename: CPointer<RenameCtx>?
        get() = memberAt<CPointerVar<RenameCtx>>(0).value
        set(value) { memberAt<CPointerVar<RenameCtx>>(0).value = value }
}

@CStruct("struct { void* p0; int p1; int p2; }")
class SrcCount(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 8)
    
    var pSrc: CPointer<SrcList>?
        get() = memberAt<CPointerVar<SrcList>>(0).value
        set(value) { memberAt<CPointerVar<SrcList>>(0).value = value }
    
    var nThis: Int
        get() = memberAt<IntVar>(8).value
        set(value) { memberAt<IntVar>(8).value = value }
    
    var nOther: Int
        get() = memberAt<IntVar>(12).value
        set(value) { memberAt<IntVar>(12).value = value }
}

@CStruct("struct { void* p0; int p1; }")
class IdxCover(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 8)
    
    var pIdx: CPointer<Index>?
        get() = memberAt<CPointerVar<Index>>(0).value
        set(value) { memberAt<CPointerVar<Index>>(0).value = value }
    
    var iCur: Int
        get() = memberAt<IntVar>(8).value
        set(value) { memberAt<IntVar>(8).value = value }
}

@CStruct("struct { void* p0; int p1; int p2; int p3; }")
class IdxExprTrans(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(24, 8)
    
    var pIdxExpr: CPointer<Expr>?
        get() = memberAt<CPointerVar<Expr>>(0).value
        set(value) { memberAt<CPointerVar<Expr>>(0).value = value }
    
    var iTabCur: Int
        get() = memberAt<IntVar>(8).value
        set(value) { memberAt<IntVar>(8).value = value }
    
    var iIdxCur: Int
        get() = memberAt<IntVar>(12).value
        set(value) { memberAt<IntVar>(12).value = value }
    
    var iIdxCol: Int
        get() = memberAt<IntVar>(16).value
        set(value) { memberAt<IntVar>(16).value = value }
}

@CStruct("struct { void* p0; void* p1; void* p2; void* p3; }")
class WindowRewrite(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(32, 8)
    
    var pWin: CPointer<Window>?
        get() = memberAt<CPointerVar<Window>>(0).value
        set(value) { memberAt<CPointerVar<Window>>(0).value = value }
    
    var pSrc: CPointer<SrcList>?
        get() = memberAt<CPointerVar<SrcList>>(8).value
        set(value) { memberAt<CPointerVar<SrcList>>(8).value = value }
    
    var pSub: CPointer<ExprList>?
        get() = memberAt<CPointerVar<ExprList>>(16).value
        set(value) { memberAt<CPointerVar<ExprList>>(16).value = value }
    
    var pSubSelect: CPointer<Select>?
        get() = memberAt<CPointerVar<Select>>(24).value
        set(value) { memberAt<CPointerVar<Select>>(24).value = value }
}

@CStruct("struct { void* p0; int p1; int p2; void* p3; }")
class WhereConst(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(24, 8)
    
    var pParse: CPointer<Parse>?
        get() = memberAt<CPointerVar<Parse>>(0).value
        set(value) { memberAt<CPointerVar<Parse>>(0).value = value }
    
    var nConst: Int
        get() = memberAt<IntVar>(8).value
        set(value) { memberAt<IntVar>(8).value = value }
    
    var nChng: Int
        get() = memberAt<IntVar>(12).value
        set(value) { memberAt<IntVar>(12).value = value }
    
    var apExpr: CPointer<CPointerVar<Expr>>?
        get() = memberAt<CPointerVar<CPointerVar<Expr>>>(16).value
        set(value) { memberAt<CPointerVar<CPointerVar<Expr>>>(16).value = value }
}

@CStruct("struct { void* p0; int p1; int p2; void* p3; void* p4; }")
class RenameCtx(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(32, 8)
    
    var pList: CPointer<RenameToken>?
        get() = memberAt<CPointerVar<RenameToken>>(0).value
        set(value) { memberAt<CPointerVar<RenameToken>>(0).value = value }
    
    var nList: Int
        get() = memberAt<IntVar>(8).value
        set(value) { memberAt<IntVar>(8).value = value }
    
    var iCol: Int
        get() = memberAt<IntVar>(12).value
        set(value) { memberAt<IntVar>(12).value = value }
    
    var pTab: CPointer<Table>?
        get() = memberAt<CPointerVar<Table>>(16).value
        set(value) { memberAt<CPointerVar<Table>>(16).value = value }
    
    var zOld: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(24).value
        set(value) { memberAt<CPointerVar<ByteVar>>(24).value = value }
}

@CStruct("struct { void* p0; void* p1; void* p2; void* p3; void* p4; short p5; int p6[2]; int p7; int p8; int p9; unsigned short p10; unsigned char p11; signed char p12; unsigned char p13; unsigned char p14; unsigned char p15; unsigned char p16; unsigned char p17; int p18; void* p19; unsigned long long p20; short p21; struct { void* p0; void* p1; unsigned char p2; unsigned char p3; int p4; int p5; void* p6; struct { void* p0; void* p1; short p2; unsigned short p3; unsigned short p4; unsigned char p5; unsigned char p6; int p7; int p8; int p9; union { int p0; void* p1; void* p2; } p10; unsigned long long p11; unsigned long long p12; } p7[8]; } p22; struct { int p0; int p1; int p2[64]; } p23; struct { int p0; int p1; int p2; int p3; int p4; int p5; int p6; int p7; int p8; unsigned int p9; int p10; unsigned char p11; unsigned char p12; unsigned char p13; unsigned char p14; int p15; int p16; union { struct { int p0; void* p1; } p0; void* p1; } p17; void* p18; unsigned long long p19; } p24[1]; }")
class WhereInfo(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(1008, 8)
    
    var pParse: CPointer<Parse>?
        get() = memberAt<CPointerVar<Parse>>(0).value
        set(value) { memberAt<CPointerVar<Parse>>(0).value = value }
    
    var pTabList: CPointer<SrcList>?
        get() = memberAt<CPointerVar<SrcList>>(8).value
        set(value) { memberAt<CPointerVar<SrcList>>(8).value = value }
    
    var pOrderBy: CPointer<ExprList>?
        get() = memberAt<CPointerVar<ExprList>>(16).value
        set(value) { memberAt<CPointerVar<ExprList>>(16).value = value }
    
    var pResultSet: CPointer<ExprList>?
        get() = memberAt<CPointerVar<ExprList>>(24).value
        set(value) { memberAt<CPointerVar<ExprList>>(24).value = value }
    
    var pWhere: CPointer<Expr>?
        get() = memberAt<CPointerVar<Expr>>(32).value
        set(value) { memberAt<CPointerVar<Expr>>(32).value = value }
    
    var iLimit: LogEst
        get() = memberAt<LogEstVar>(40).value
        set(value) { memberAt<LogEstVar>(40).value = value }
    
    val aiCurOnePass: CArrayPointer<IntVar>
        get() = arrayMemberAt(44)
    
    var iContinue: Int
        get() = memberAt<IntVar>(52).value
        set(value) { memberAt<IntVar>(52).value = value }
    
    var iBreak: Int
        get() = memberAt<IntVar>(56).value
        set(value) { memberAt<IntVar>(56).value = value }
    
    var savedNQueryLoop: Int
        get() = memberAt<IntVar>(60).value
        set(value) { memberAt<IntVar>(60).value = value }
    
    var wctrlFlags: u16
        get() = memberAt<u16Var>(64).value
        set(value) { memberAt<u16Var>(64).value = value }
    
    var nLevel: u8
        get() = memberAt<u8Var>(66).value
        set(value) { memberAt<u8Var>(66).value = value }
    
    var nOBSat: i8
        get() = memberAt<i8Var>(67).value
        set(value) { memberAt<i8Var>(67).value = value }
    
    var sorted: u8
        get() = memberAt<u8Var>(68).value
        set(value) { memberAt<u8Var>(68).value = value }
    
    var eOnePass: u8
        get() = memberAt<u8Var>(69).value
        set(value) { memberAt<u8Var>(69).value = value }
    
    var untestedTerms: u8
        get() = memberAt<u8Var>(70).value
        set(value) { memberAt<u8Var>(70).value = value }
    
    var eDistinct: u8
        get() = memberAt<u8Var>(71).value
        set(value) { memberAt<u8Var>(71).value = value }
    
    var bOrderedInnerLoop: u8
        get() = memberAt<u8Var>(72).value
        set(value) { memberAt<u8Var>(72).value = value }
    
    var iTop: Int
        get() = memberAt<IntVar>(76).value
        set(value) { memberAt<IntVar>(76).value = value }
    
    var pLoops: CPointer<WhereLoop>?
        get() = memberAt<CPointerVar<WhereLoop>>(80).value
        set(value) { memberAt<CPointerVar<WhereLoop>>(80).value = value }
    
    var revMask: Bitmask
        get() = memberAt<BitmaskVar>(88).value
        set(value) { memberAt<BitmaskVar>(88).value = value }
    
    var nRowOut: LogEst
        get() = memberAt<LogEstVar>(96).value
        set(value) { memberAt<LogEstVar>(96).value = value }
    
    val sWC: WhereClause
        get() = memberAt(104)
    
    val sMaskSet: WhereMaskSet
        get() = memberAt(656)
    
    val a: CArrayPointer<WhereLevel>
        get() = arrayMemberAt(920)
}

@CStruct("struct { unsigned long long p0; unsigned long long p1; unsigned char p2; unsigned char p3; short p4; short p5; short p6; union { struct { unsigned short p0; unsigned short p1; unsigned short p2; unsigned short p3; void* p4; } p0; struct { int p0; unsigned char p1; signed char p2; unsigned short p3; void* p4; } p1; } p7; unsigned int p8; unsigned short p9; unsigned short p10; unsigned short p11; void* p12; void* p13; void* p14[3]; }")
class WhereLoop(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(96, 8)
    
    var prereq: Bitmask
        get() = memberAt<BitmaskVar>(0).value
        set(value) { memberAt<BitmaskVar>(0).value = value }
    
    var maskSelf: Bitmask
        get() = memberAt<BitmaskVar>(8).value
        set(value) { memberAt<BitmaskVar>(8).value = value }
    
    var iTab: u8
        get() = memberAt<u8Var>(16).value
        set(value) { memberAt<u8Var>(16).value = value }
    
    var iSortIdx: u8
        get() = memberAt<u8Var>(17).value
        set(value) { memberAt<u8Var>(17).value = value }
    
    var rSetup: LogEst
        get() = memberAt<LogEstVar>(18).value
        set(value) { memberAt<LogEstVar>(18).value = value }
    
    var rRun: LogEst
        get() = memberAt<LogEstVar>(20).value
        set(value) { memberAt<LogEstVar>(20).value = value }
    
    var nOut: LogEst
        get() = memberAt<LogEstVar>(22).value
        set(value) { memberAt<LogEstVar>(22).value = value }
    
    val u: anonymousStruct16
        get() = memberAt(24)
    
    var wsFlags: u32
        get() = memberAt<u32Var>(40).value
        set(value) { memberAt<u32Var>(40).value = value }
    
    var nLTerm: u16
        get() = memberAt<u16Var>(44).value
        set(value) { memberAt<u16Var>(44).value = value }
    
    var nSkip: u16
        get() = memberAt<u16Var>(46).value
        set(value) { memberAt<u16Var>(46).value = value }
    
    var nLSlot: u16
        get() = memberAt<u16Var>(48).value
        set(value) { memberAt<u16Var>(48).value = value }
    
    var aLTerm: CPointer<CPointerVar<WhereTerm>>?
        get() = memberAt<CPointerVar<CPointerVar<WhereTerm>>>(56).value
        set(value) { memberAt<CPointerVar<CPointerVar<WhereTerm>>>(56).value = value }
    
    var pNextLoop: CPointer<WhereLoop>?
        get() = memberAt<CPointerVar<WhereLoop>>(64).value
        set(value) { memberAt<CPointerVar<WhereLoop>>(64).value = value }
    
    val aLTermSpace: CArrayPointer<CPointerVar<WhereTerm>>
        get() = arrayMemberAt(72)
}

@CStruct("union { struct { unsigned short p0; unsigned short p1; unsigned short p2; unsigned short p3; void* p4; } p0; struct { int p0; unsigned char p1; signed char p2; unsigned short p3; void* p4; } p1; }")
class anonymousStruct16(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 8)
    
    val btree: anonymousStruct17
        get() = memberAt(0)
    
    val vtab: anonymousStruct18
        get() = memberAt(0)
}

@CStruct("struct { unsigned short p0; unsigned short p1; unsigned short p2; unsigned short p3; void* p4; }")
class anonymousStruct17(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 8)
    
    var nEq: u16
        get() = memberAt<u16Var>(0).value
        set(value) { memberAt<u16Var>(0).value = value }
    
    var nBtm: u16
        get() = memberAt<u16Var>(2).value
        set(value) { memberAt<u16Var>(2).value = value }
    
    var nTop: u16
        get() = memberAt<u16Var>(4).value
        set(value) { memberAt<u16Var>(4).value = value }
    
    var nIdxCol: u16
        get() = memberAt<u16Var>(6).value
        set(value) { memberAt<u16Var>(6).value = value }
    
    var pIndex: CPointer<Index>?
        get() = memberAt<CPointerVar<Index>>(8).value
        set(value) { memberAt<CPointerVar<Index>>(8).value = value }
}

@CStruct("struct { int p0; unsigned char p1; signed char p2; unsigned short p3; void* p4; }")
class anonymousStruct18(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 8)
    
    var idxNum: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var needFree: u8
        get() = memberAt<u8Var>(4).value
        set(value) { memberAt<u8Var>(4).value = value }
    
    var isOrdered: i8
        get() = memberAt<i8Var>(5).value
        set(value) { memberAt<i8Var>(5).value = value }
    
    var omitMask: u16
        get() = memberAt<u16Var>(6).value
        set(value) { memberAt<u16Var>(6).value = value }
    
    var idxStr: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(8).value
        set(value) { memberAt<CPointerVar<ByteVar>>(8).value = value }
}

@CStruct("struct { void* p0; void* p1; short p2; unsigned short p3; unsigned short p4; unsigned char p5; unsigned char p6; int p7; int p8; int p9; union { int p0; void* p1; void* p2; } p10; unsigned long long p11; unsigned long long p12; }")
class WhereTerm(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(64, 8)
    
    var pExpr: CPointer<Expr>?
        get() = memberAt<CPointerVar<Expr>>(0).value
        set(value) { memberAt<CPointerVar<Expr>>(0).value = value }
    
    var pWC: CPointer<WhereClause>?
        get() = memberAt<CPointerVar<WhereClause>>(8).value
        set(value) { memberAt<CPointerVar<WhereClause>>(8).value = value }
    
    var truthProb: LogEst
        get() = memberAt<LogEstVar>(16).value
        set(value) { memberAt<LogEstVar>(16).value = value }
    
    var wtFlags: u16
        get() = memberAt<u16Var>(18).value
        set(value) { memberAt<u16Var>(18).value = value }
    
    var eOperator: u16
        get() = memberAt<u16Var>(20).value
        set(value) { memberAt<u16Var>(20).value = value }
    
    var nChild: u8
        get() = memberAt<u8Var>(22).value
        set(value) { memberAt<u8Var>(22).value = value }
    
    var eMatchOp: u8
        get() = memberAt<u8Var>(23).value
        set(value) { memberAt<u8Var>(23).value = value }
    
    var iParent: Int
        get() = memberAt<IntVar>(24).value
        set(value) { memberAt<IntVar>(24).value = value }
    
    var leftCursor: Int
        get() = memberAt<IntVar>(28).value
        set(value) { memberAt<IntVar>(28).value = value }
    
    var iField: Int
        get() = memberAt<IntVar>(32).value
        set(value) { memberAt<IntVar>(32).value = value }
    
    val u: anonymousStruct19
        get() = memberAt(40)
    
    var prereqRight: Bitmask
        get() = memberAt<BitmaskVar>(48).value
        set(value) { memberAt<BitmaskVar>(48).value = value }
    
    var prereqAll: Bitmask
        get() = memberAt<BitmaskVar>(56).value
        set(value) { memberAt<BitmaskVar>(56).value = value }
}

@CStruct("struct { void* p0; void* p1; unsigned char p2; unsigned char p3; int p4; int p5; void* p6; struct { void* p0; void* p1; short p2; unsigned short p3; unsigned short p4; unsigned char p5; unsigned char p6; int p7; int p8; int p9; union { int p0; void* p1; void* p2; } p10; unsigned long long p11; unsigned long long p12; } p7[8]; }")
class WhereClause(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(552, 8)
    
    var pWInfo: CPointer<WhereInfo>?
        get() = memberAt<CPointerVar<WhereInfo>>(0).value
        set(value) { memberAt<CPointerVar<WhereInfo>>(0).value = value }
    
    var pOuter: CPointer<WhereClause>?
        get() = memberAt<CPointerVar<WhereClause>>(8).value
        set(value) { memberAt<CPointerVar<WhereClause>>(8).value = value }
    
    var op: u8
        get() = memberAt<u8Var>(16).value
        set(value) { memberAt<u8Var>(16).value = value }
    
    var hasOr: u8
        get() = memberAt<u8Var>(17).value
        set(value) { memberAt<u8Var>(17).value = value }
    
    var nTerm: Int
        get() = memberAt<IntVar>(20).value
        set(value) { memberAt<IntVar>(20).value = value }
    
    var nSlot: Int
        get() = memberAt<IntVar>(24).value
        set(value) { memberAt<IntVar>(24).value = value }
    
    var a: CPointer<WhereTerm>?
        get() = memberAt<CPointerVar<WhereTerm>>(32).value
        set(value) { memberAt<CPointerVar<WhereTerm>>(32).value = value }
    
    val aStatic: CArrayPointer<WhereTerm>
        get() = arrayMemberAt(40)
}

@CStruct("union { int p0; void* p1; void* p2; }")
class anonymousStruct19(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(8, 8)
    
    var leftColumn: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var pOrInfo: CPointer<WhereOrInfo>?
        get() = memberAt<CPointerVar<WhereOrInfo>>(0).value
        set(value) { memberAt<CPointerVar<WhereOrInfo>>(0).value = value }
    
    var pAndInfo: CPointer<WhereAndInfo>?
        get() = memberAt<CPointerVar<WhereAndInfo>>(0).value
        set(value) { memberAt<CPointerVar<WhereAndInfo>>(0).value = value }
}

@CStruct("struct { struct { void* p0; void* p1; unsigned char p2; unsigned char p3; int p4; int p5; void* p6; struct { void* p0; void* p1; short p2; unsigned short p3; unsigned short p4; unsigned char p5; unsigned char p6; int p7; int p8; int p9; union { int p0; void* p1; void* p2; } p10; unsigned long long p11; unsigned long long p12; } p7[8]; } p0; unsigned long long p1; }")
class WhereOrInfo(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(560, 8)
    
    val wc: WhereClause
        get() = memberAt(0)
    
    var indexable: Bitmask
        get() = memberAt<BitmaskVar>(552).value
        set(value) { memberAt<BitmaskVar>(552).value = value }
}

@CStruct("struct { struct { void* p0; void* p1; unsigned char p2; unsigned char p3; int p4; int p5; void* p6; struct { void* p0; void* p1; short p2; unsigned short p3; unsigned short p4; unsigned char p5; unsigned char p6; int p7; int p8; int p9; union { int p0; void* p1; void* p2; } p10; unsigned long long p11; unsigned long long p12; } p7[8]; } p0; }")
class WhereAndInfo(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(552, 8)
    
    val wc: WhereClause
        get() = memberAt(0)
}

@CStruct("struct { int p0; int p1; int p2[64]; }")
class WhereMaskSet(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(264, 4)
    
    var bVarSelect: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var n: Int
        get() = memberAt<IntVar>(4).value
        set(value) { memberAt<IntVar>(4).value = value }
    
    val ix: CArrayPointer<IntVar>
        get() = arrayMemberAt(8)
}

@CStruct("struct { int p0; int p1; int p2; int p3; int p4; int p5; int p6; int p7; int p8; unsigned int p9; int p10; unsigned char p11; unsigned char p12; unsigned char p13; unsigned char p14; int p15; int p16; union { struct { int p0; void* p1; } p0; void* p1; } p17; void* p18; unsigned long long p19; }")
class WhereLevel(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(88, 8)
    
    var iLeftJoin: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var iTabCur: Int
        get() = memberAt<IntVar>(4).value
        set(value) { memberAt<IntVar>(4).value = value }
    
    var iIdxCur: Int
        get() = memberAt<IntVar>(8).value
        set(value) { memberAt<IntVar>(8).value = value }
    
    var addrBrk: Int
        get() = memberAt<IntVar>(12).value
        set(value) { memberAt<IntVar>(12).value = value }
    
    var addrNxt: Int
        get() = memberAt<IntVar>(16).value
        set(value) { memberAt<IntVar>(16).value = value }
    
    var addrSkip: Int
        get() = memberAt<IntVar>(20).value
        set(value) { memberAt<IntVar>(20).value = value }
    
    var addrCont: Int
        get() = memberAt<IntVar>(24).value
        set(value) { memberAt<IntVar>(24).value = value }
    
    var addrFirst: Int
        get() = memberAt<IntVar>(28).value
        set(value) { memberAt<IntVar>(28).value = value }
    
    var addrBody: Int
        get() = memberAt<IntVar>(32).value
        set(value) { memberAt<IntVar>(32).value = value }
    
    var iLikeRepCntr: u32
        get() = memberAt<u32Var>(36).value
        set(value) { memberAt<u32Var>(36).value = value }
    
    var addrLikeRep: Int
        get() = memberAt<IntVar>(40).value
        set(value) { memberAt<IntVar>(40).value = value }
    
    var iFrom: u8
        get() = memberAt<u8Var>(44).value
        set(value) { memberAt<u8Var>(44).value = value }
    
    var op: u8
        get() = memberAt<u8Var>(45).value
        set(value) { memberAt<u8Var>(45).value = value }
    
    var p3: u8
        get() = memberAt<u8Var>(46).value
        set(value) { memberAt<u8Var>(46).value = value }
    
    var p5: u8
        get() = memberAt<u8Var>(47).value
        set(value) { memberAt<u8Var>(47).value = value }
    
    var p1: Int
        get() = memberAt<IntVar>(48).value
        set(value) { memberAt<IntVar>(48).value = value }
    
    var p2: Int
        get() = memberAt<IntVar>(52).value
        set(value) { memberAt<IntVar>(52).value = value }
    
    val u: anonymousStruct20
        get() = memberAt(56)
    
    var pWLoop: CPointer<WhereLoop>?
        get() = memberAt<CPointerVar<WhereLoop>>(72).value
        set(value) { memberAt<CPointerVar<WhereLoop>>(72).value = value }
    
    var notReady: Bitmask
        get() = memberAt<BitmaskVar>(80).value
        set(value) { memberAt<BitmaskVar>(80).value = value }
}

@CStruct("union { struct { int p0; void* p1; } p0; void* p1; }")
class anonymousStruct20(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 8)
    
    val `in`: anonymousStruct21
        get() = memberAt(0)
    
    var pCovidx: CPointer<Index>?
        get() = memberAt<CPointerVar<Index>>(0).value
        set(value) { memberAt<CPointerVar<Index>>(0).value = value }
}

@CStruct("struct { int p0; void* p1; }")
class anonymousStruct21(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 8)
    
    var nIn: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var aInLoop: CPointer<InLoop>?
        get() = memberAt<CPointerVar<InLoop>>(8).value
        set(value) { memberAt<CPointerVar<InLoop>>(8).value = value }
}

@CStruct("struct { int p0; int p1; int p2; int p3; unsigned char p4; }")
class InLoop(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(20, 4)
    
    var iCur: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var addrInTop: Int
        get() = memberAt<IntVar>(4).value
        set(value) { memberAt<IntVar>(4).value = value }
    
    var iBase: Int
        get() = memberAt<IntVar>(8).value
        set(value) { memberAt<IntVar>(8).value = value }
    
    var nPrefix: Int
        get() = memberAt<IntVar>(12).value
        set(value) { memberAt<IntVar>(12).value = value }
    
    var eEndLoopOp: u8
        get() = memberAt<u8Var>(16).value
        set(value) { memberAt<u8Var>(16).value = value }
}

@CStruct("struct { void* p0; long long p1; void* p2; void* p3; unsigned short p4; int p5; int p6; }")
class BtreePayload(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(48, 8)
    
    var pKey: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(0).value
        set(value) { memberAt<COpaquePointerVar>(0).value = value }
    
    var nKey: sqlite3_int64
        get() = memberAt<sqlite3_int64Var>(8).value
        set(value) { memberAt<sqlite3_int64Var>(8).value = value }
    
    var pData: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(16).value
        set(value) { memberAt<COpaquePointerVar>(16).value = value }
    
    var aMem: CPointer<sqlite3_value>?
        get() = memberAt<CPointerVar<sqlite3_value>>(24).value
        set(value) { memberAt<CPointerVar<sqlite3_value>>(24).value = value }
    
    var nMem: u16
        get() = memberAt<u16Var>(32).value
        set(value) { memberAt<u16Var>(32).value = value }
    
    var nData: Int
        get() = memberAt<IntVar>(36).value
        set(value) { memberAt<IntVar>(36).value = value }
    
    var nZero: Int
        get() = memberAt<IntVar>(40).value
        set(value) { memberAt<IntVar>(40).value = value }
}

@CStruct("struct { unsigned char p0; signed char p1; signed char p2; signed char p3; }")
class VdbeOpList(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(4, 1)
    
    var opcode: u8
        get() = memberAt<u8Var>(0).value
        set(value) { memberAt<u8Var>(0).value = value }
    
    var p1: Byte
        get() = memberAt<ByteVar>(1).value
        set(value) { memberAt<ByteVar>(1).value = value }
    
    var p2: Byte
        get() = memberAt<ByteVar>(2).value
        set(value) { memberAt<ByteVar>(2).value = value }
    
    var p3: Byte
        get() = memberAt<ByteVar>(3).value
        set(value) { memberAt<ByteVar>(3).value = value }
}

@CStruct("struct { void* p0; void* p1; int p2; void* p3; void* p4; void* p5; }")
class DbFixer(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(48, 8)
    
    var pParse: CPointer<Parse>?
        get() = memberAt<CPointerVar<Parse>>(0).value
        set(value) { memberAt<CPointerVar<Parse>>(0).value = value }
    
    var pSchema: CPointer<Schema>?
        get() = memberAt<CPointerVar<Schema>>(8).value
        set(value) { memberAt<CPointerVar<Schema>>(8).value = value }
    
    var bVarOnly: Int
        get() = memberAt<IntVar>(16).value
        set(value) { memberAt<IntVar>(16).value = value }
    
    var zDb: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(24).value
        set(value) { memberAt<CPointerVar<ByteVar>>(24).value = value }
    
    var zType: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(32).value
        set(value) { memberAt<CPointerVar<ByteVar>>(32).value = value }
    
    var pName: CPointer<Token>?
        get() = memberAt<CPointerVar<Token>>(40).value
        set(value) { memberAt<CPointerVar<Token>>(40).value = value }
}

@CStruct("struct { void* p0; void* p1; int p2; int p3; unsigned int p4; unsigned int p5; }")
class InitData(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(32, 8)
    
    var db: CPointer<sqlite3>?
        get() = memberAt<CPointerVar<sqlite3>>(0).value
        set(value) { memberAt<CPointerVar<sqlite3>>(0).value = value }
    
    var pzErrMsg: CPointer<CPointerVar<ByteVar>>?
        get() = memberAt<CPointerVar<CPointerVar<ByteVar>>>(8).value
        set(value) { memberAt<CPointerVar<CPointerVar<ByteVar>>>(8).value = value }
    
    var iDb: Int
        get() = memberAt<IntVar>(16).value
        set(value) { memberAt<IntVar>(16).value = value }
    
    var rc: Int
        get() = memberAt<IntVar>(20).value
        set(value) { memberAt<IntVar>(20).value = value }
    
    var mInitFlags: u32
        get() = memberAt<u32Var>(24).value
        set(value) { memberAt<u32Var>(24).value = value }
    
    var nInitRow: u32
        get() = memberAt<u32Var>(28).value
        set(value) { memberAt<u32Var>(28).value = value }
}

@CStruct("struct { int p0; int p1; int p2; int p3; int p4; int p5; int p6; int p7; int p8; int p9; int p10; struct { void* p0; void* p1; void* p2; void* p3; void* p4; void* p5; void* p6; void* p7; } p11; struct { void* p0; void* p1; void* p2; void* p3; void* p4; void* p5; void* p6; void* p7; void* p8; } p12; struct { int p0; void* p1; void* p2; void* p3; void* p4; void* p5; void* p6; void* p7; void* p8; void* p9; void* p10; void* p11; void* p12; } p13; void* p14; int p15; int p16; int p17; long long p18; long long p19; void* p20; int p21; int p22; int p23; int p24; unsigned int p25; int p26; int p27; int p28; int p29; int p30; int p31; void* p32; void* p33; void* p34; void* p35; int p36; int p37; int p38; unsigned int p39; }")
class Sqlite3Config(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(432, 8)
    
    var bMemstat: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var bCoreMutex: Int
        get() = memberAt<IntVar>(4).value
        set(value) { memberAt<IntVar>(4).value = value }
    
    var bFullMutex: Int
        get() = memberAt<IntVar>(8).value
        set(value) { memberAt<IntVar>(8).value = value }
    
    var bOpenUri: Int
        get() = memberAt<IntVar>(12).value
        set(value) { memberAt<IntVar>(12).value = value }
    
    var bUseCis: Int
        get() = memberAt<IntVar>(16).value
        set(value) { memberAt<IntVar>(16).value = value }
    
    var bSmallMalloc: Int
        get() = memberAt<IntVar>(20).value
        set(value) { memberAt<IntVar>(20).value = value }
    
    var mxStrlen: Int
        get() = memberAt<IntVar>(24).value
        set(value) { memberAt<IntVar>(24).value = value }
    
    var neverCorrupt: Int
        get() = memberAt<IntVar>(28).value
        set(value) { memberAt<IntVar>(28).value = value }
    
    var szLookaside: Int
        get() = memberAt<IntVar>(32).value
        set(value) { memberAt<IntVar>(32).value = value }
    
    var nLookaside: Int
        get() = memberAt<IntVar>(36).value
        set(value) { memberAt<IntVar>(36).value = value }
    
    var nStmtSpill: Int
        get() = memberAt<IntVar>(40).value
        set(value) { memberAt<IntVar>(40).value = value }
    
    val m: sqlite3_mem_methods
        get() = memberAt(48)
    
    val mutex: sqlite3_mutex_methods
        get() = memberAt(112)
    
    val pcache2: sqlite3_pcache_methods2
        get() = memberAt(184)
    
    var pHeap: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(288).value
        set(value) { memberAt<COpaquePointerVar>(288).value = value }
    
    var nHeap: Int
        get() = memberAt<IntVar>(296).value
        set(value) { memberAt<IntVar>(296).value = value }
    
    var mnReq: Int
        get() = memberAt<IntVar>(300).value
        set(value) { memberAt<IntVar>(300).value = value }
    
    var mxReq: Int
        get() = memberAt<IntVar>(304).value
        set(value) { memberAt<IntVar>(304).value = value }
    
    var szMmap: sqlite3_int64
        get() = memberAt<sqlite3_int64Var>(312).value
        set(value) { memberAt<sqlite3_int64Var>(312).value = value }
    
    var mxMmap: sqlite3_int64
        get() = memberAt<sqlite3_int64Var>(320).value
        set(value) { memberAt<sqlite3_int64Var>(320).value = value }
    
    var pPage: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(328).value
        set(value) { memberAt<COpaquePointerVar>(328).value = value }
    
    var szPage: Int
        get() = memberAt<IntVar>(336).value
        set(value) { memberAt<IntVar>(336).value = value }
    
    var nPage: Int
        get() = memberAt<IntVar>(340).value
        set(value) { memberAt<IntVar>(340).value = value }
    
    var mxParserStack: Int
        get() = memberAt<IntVar>(344).value
        set(value) { memberAt<IntVar>(344).value = value }
    
    var sharedCacheEnabled: Int
        get() = memberAt<IntVar>(348).value
        set(value) { memberAt<IntVar>(348).value = value }
    
    var szPma: u32
        get() = memberAt<u32Var>(352).value
        set(value) { memberAt<u32Var>(352).value = value }
    
    var isInit: Int
        get() = memberAt<IntVar>(356).value
        set(value) { memberAt<IntVar>(356).value = value }
    
    var inProgress: Int
        get() = memberAt<IntVar>(360).value
        set(value) { memberAt<IntVar>(360).value = value }
    
    var isMutexInit: Int
        get() = memberAt<IntVar>(364).value
        set(value) { memberAt<IntVar>(364).value = value }
    
    var isMallocInit: Int
        get() = memberAt<IntVar>(368).value
        set(value) { memberAt<IntVar>(368).value = value }
    
    var isPCacheInit: Int
        get() = memberAt<IntVar>(372).value
        set(value) { memberAt<IntVar>(372).value = value }
    
    var nRefInitMutex: Int
        get() = memberAt<IntVar>(376).value
        set(value) { memberAt<IntVar>(376).value = value }
    
    var pInitMutex: CPointer<sqlite3_mutex>?
        get() = memberAt<CPointerVar<sqlite3_mutex>>(384).value
        set(value) { memberAt<CPointerVar<sqlite3_mutex>>(384).value = value }
    
    var xLog: CPointer<CFunction<(COpaquePointer?, Int, CPointer<ByteVar>?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?, Int, CPointer<ByteVar>?) -> Unit>>>(392).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?, Int, CPointer<ByteVar>?) -> Unit>>>(392).value = value }
    
    var pLogArg: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(400).value
        set(value) { memberAt<COpaquePointerVar>(400).value = value }
    
    var xTestCallback: CPointer<CFunction<(Int) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(Int) -> Int>>>(408).value
        set(value) { memberAt<CPointerVar<CFunction<(Int) -> Int>>>(408).value = value }
    
    var bLocaltimeFault: Int
        get() = memberAt<IntVar>(416).value
        set(value) { memberAt<IntVar>(416).value = value }
    
    var bInternalFunctions: Int
        get() = memberAt<IntVar>(420).value
        set(value) { memberAt<IntVar>(420).value = value }
    
    var iOnceResetThreshold: Int
        get() = memberAt<IntVar>(424).value
        set(value) { memberAt<IntVar>(424).value = value }
    
    var szSorterRef: u32
        get() = memberAt<u32Var>(428).value
        set(value) { memberAt<u32Var>(428).value = value }
}

@CStruct("struct { int p0; int p1; int p2; int p3; short p4; void* p5; }")
class ScanStatus(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(32, 8)
    
    var addrExplain: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var addrLoop: Int
        get() = memberAt<IntVar>(4).value
        set(value) { memberAt<IntVar>(4).value = value }
    
    var addrVisit: Int
        get() = memberAt<IntVar>(8).value
        set(value) { memberAt<IntVar>(8).value = value }
    
    var iSelectID: Int
        get() = memberAt<IntVar>(12).value
        set(value) { memberAt<IntVar>(12).value = value }
    
    var nEst: LogEst
        get() = memberAt<LogEstVar>(16).value
        set(value) { memberAt<LogEstVar>(16).value = value }
    
    var zName: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(24).value
        set(value) { memberAt<CPointerVar<ByteVar>>(24).value = value }
}

@CStruct("struct { void* p0; char p1[8]; }")
class DblquoteStr(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 8)
    
    var pNextStr: CPointer<DblquoteStr>?
        get() = memberAt<CPointerVar<DblquoteStr>>(0).value
        set(value) { memberAt<CPointerVar<DblquoteStr>>(0).value = value }
    
    val z: CArrayPointer<ByteVar>
        get() = arrayMemberAt(8)
}

@CStruct("struct { long long p0[10]; long long p1[10]; }")
class sqlite3StatType(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(160, 8)
    
    val nowValue: CArrayPointer<sqlite3StatValueTypeVar>
        get() = arrayMemberAt(0)
    
    val mxValue: CArrayPointer<sqlite3StatValueTypeVar>
        get() = arrayMemberAt(80)
}

@CStruct("struct { long long p0; int p1; int p2; int p3; int p4; int p5; int p6; double p7; char p8; char p9; char p10; char p11; char p12; char p13; char p14; }")
class DateTime(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(48, 8)
    
    var iJD: sqlite3_int64
        get() = memberAt<sqlite3_int64Var>(0).value
        set(value) { memberAt<sqlite3_int64Var>(0).value = value }
    
    var Y: Int
        get() = memberAt<IntVar>(8).value
        set(value) { memberAt<IntVar>(8).value = value }
    
    var M: Int
        get() = memberAt<IntVar>(12).value
        set(value) { memberAt<IntVar>(12).value = value }
    
    var D: Int
        get() = memberAt<IntVar>(16).value
        set(value) { memberAt<IntVar>(16).value = value }
    
    var h: Int
        get() = memberAt<IntVar>(20).value
        set(value) { memberAt<IntVar>(20).value = value }
    
    var m: Int
        get() = memberAt<IntVar>(24).value
        set(value) { memberAt<IntVar>(24).value = value }
    
    var tz: Int
        get() = memberAt<IntVar>(28).value
        set(value) { memberAt<IntVar>(28).value = value }
    
    var s: Double
        get() = memberAt<DoubleVar>(32).value
        set(value) { memberAt<DoubleVar>(32).value = value }
    
    var validJD: Byte
        get() = memberAt<ByteVar>(40).value
        set(value) { memberAt<ByteVar>(40).value = value }
    
    var rawS: Byte
        get() = memberAt<ByteVar>(41).value
        set(value) { memberAt<ByteVar>(41).value = value }
    
    var validYMD: Byte
        get() = memberAt<ByteVar>(42).value
        set(value) { memberAt<ByteVar>(42).value = value }
    
    var validHMS: Byte
        get() = memberAt<ByteVar>(43).value
        set(value) { memberAt<ByteVar>(43).value = value }
    
    var validTZ: Byte
        get() = memberAt<ByteVar>(44).value
        set(value) { memberAt<ByteVar>(44).value = value }
    
    var tzSet: Byte
        get() = memberAt<ByteVar>(45).value
        set(value) { memberAt<ByteVar>(45).value = value }
    
    var isError: Byte
        get() = memberAt<ByteVar>(46).value
        set(value) { memberAt<ByteVar>(46).value = value }
}

@CStruct("struct { unsigned char p0; unsigned char p1; void* p2; double p3; double p4; }")
class anonymousStruct22(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(32, 8)
    
    var eType: u8
        get() = memberAt<u8Var>(0).value
        set(value) { memberAt<u8Var>(0).value = value }
    
    var nName: u8
        get() = memberAt<u8Var>(1).value
        set(value) { memberAt<u8Var>(1).value = value }
    
    var zName: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(8).value
        set(value) { memberAt<CPointerVar<ByteVar>>(8).value = value }
    
    var rLimit: Double
        get() = memberAt<DoubleVar>(16).value
        set(value) { memberAt<DoubleVar>(16).value = value }
    
    var rXform: Double
        get() = memberAt<DoubleVar>(24).value
        set(value) { memberAt<DoubleVar>(24).value = value }
}

@CStruct("struct { void* p0; void* p1; }")
class BenignMallocHooks(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 8)
    
    var xBenignBegin: CPointer<CFunction<() -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<() -> Unit>>>(0).value
        set(value) { memberAt<CPointerVar<CFunction<() -> Unit>>>(0).value = value }
    
    var xBenignEnd: CPointer<CFunction<() -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<() -> Unit>>>(8).value
        set(value) { memberAt<CPointerVar<CFunction<() -> Unit>>>(8).value = value }
}

@CStruct("struct { void* p0; long long p1; int p2; }")
class Mem0Global(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(24, 8)
    
    var mutex: CPointer<sqlite3_mutex>?
        get() = memberAt<CPointerVar<sqlite3_mutex>>(0).value
        set(value) { memberAt<CPointerVar<sqlite3_mutex>>(0).value = value }
    
    var alarmThreshold: sqlite3_int64
        get() = memberAt<sqlite3_int64Var>(8).value
        set(value) { memberAt<sqlite3_int64Var>(8).value = value }
    
    var nearlyFull: Int
        get() = memberAt<IntVar>(16).value
        set(value) { memberAt<IntVar>(16).value = value }
}

@CStruct("struct { char p0; unsigned char p1; unsigned char p2; unsigned char p3; unsigned char p4; unsigned char p5; }")
class et_info(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(6, 1)
    
    var fmttype: Byte
        get() = memberAt<ByteVar>(0).value
        set(value) { memberAt<ByteVar>(0).value = value }
    
    var base: etByte
        get() = memberAt<etByteVar>(1).value
        set(value) { memberAt<etByteVar>(1).value = value }
    
    var flags: etByte
        get() = memberAt<etByteVar>(2).value
        set(value) { memberAt<etByteVar>(2).value = value }
    
    var type: etByte
        get() = memberAt<etByteVar>(3).value
        set(value) { memberAt<etByteVar>(3).value = value }
    
    var charset: etByte
        get() = memberAt<etByteVar>(4).value
        set(value) { memberAt<etByteVar>(4).value = value }
    
    var prefix: etByte
        get() = memberAt<etByteVar>(5).value
        set(value) { memberAt<etByteVar>(5).value = value }
}

@CStruct("struct { unsigned char p0; unsigned char p1; unsigned char p2; unsigned char p3[256]; }")
class sqlite3PrngType(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(259, 1)
    
    var isInit: UByte
        get() = memberAt<UByteVar>(0).value
        set(value) { memberAt<UByteVar>(0).value = value }
    
    var i: UByte
        get() = memberAt<UByteVar>(1).value
        set(value) { memberAt<UByteVar>(1).value = value }
    
    var j: UByte
        get() = memberAt<UByteVar>(2).value
        set(value) { memberAt<UByteVar>(2).value = value }
    
    val s: CArrayPointer<UByteVar>
        get() = arrayMemberAt(3)
}

@CStruct("struct { void* p0; void* p1; unsigned char p2; unsigned short p3; unsigned short p4; }")
class winShm(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(24, 8)
    
    var pShmNode: CPointer<winShmNode>?
        get() = memberAt<CPointerVar<winShmNode>>(0).value
        set(value) { memberAt<CPointerVar<winShmNode>>(0).value = value }
    
    var pNext: CPointer<winShm>?
        get() = memberAt<CPointerVar<winShm>>(8).value
        set(value) { memberAt<CPointerVar<winShm>>(8).value = value }
    
    var hasMutex: u8
        get() = memberAt<u8Var>(16).value
        set(value) { memberAt<u8Var>(16).value = value }
    
    var sharedMask: u16
        get() = memberAt<u16Var>(18).value
        set(value) { memberAt<u16Var>(18).value = value }
    
    var exclMask: u16
        get() = memberAt<u16Var>(20).value
        set(value) { memberAt<u16Var>(20).value = value }
}

@CStruct("struct { void* p0; void* p1; struct { void* p0; void* p1; void* p2; unsigned char p3; short p4; unsigned char p5; unsigned long p6; void* p7; void* p8; int p9; int p10; void* p11; void* p12; long long p13; long long p14; } p2; int p3; int p4; unsigned char p5; unsigned char p6; void* p7; unsigned long p8; int p9; void* p10; void* p11; }")
class winShmNode(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(160, 8)
    
    var mutex: CPointer<sqlite3_mutex>?
        get() = memberAt<CPointerVar<sqlite3_mutex>>(0).value
        set(value) { memberAt<CPointerVar<sqlite3_mutex>>(0).value = value }
    
    var zFilename: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(8).value
        set(value) { memberAt<CPointerVar<ByteVar>>(8).value = value }
    
    val hFile: winFile
        get() = memberAt(16)
    
    var szRegion: Int
        get() = memberAt<IntVar>(112).value
        set(value) { memberAt<IntVar>(112).value = value }
    
    var nRegion: Int
        get() = memberAt<IntVar>(116).value
        set(value) { memberAt<IntVar>(116).value = value }
    
    var isReadonly: u8
        get() = memberAt<u8Var>(120).value
        set(value) { memberAt<u8Var>(120).value = value }
    
    var isUnlocked: u8
        get() = memberAt<u8Var>(121).value
        set(value) { memberAt<u8Var>(121).value = value }
    
    var aRegion: CPointer<ShmRegion>?
        get() = memberAt<CPointerVar<ShmRegion>>(128).value
        set(value) { memberAt<CPointerVar<ShmRegion>>(128).value = value }
    
    var lastErrno: DWORD
        get() = memberAt<DWORDVar>(136).value
        set(value) { memberAt<DWORDVar>(136).value = value }
    
    var nRef: Int
        get() = memberAt<IntVar>(140).value
        set(value) { memberAt<IntVar>(140).value = value }
    
    var pFirst: CPointer<winShm>?
        get() = memberAt<CPointerVar<winShm>>(144).value
        set(value) { memberAt<CPointerVar<winShm>>(144).value = value }
    
    var pNext: CPointer<winShmNode>?
        get() = memberAt<CPointerVar<winShmNode>>(152).value
        set(value) { memberAt<CPointerVar<winShmNode>>(152).value = value }
}

@CStruct("struct { void* p0; void* p1; void* p2; unsigned char p3; short p4; unsigned char p5; unsigned long p6; void* p7; void* p8; int p9; int p10; void* p11; void* p12; long long p13; long long p14; }")
class winFile(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(96, 8)
    
    var pMethod: CPointer<sqlite3_io_methods>?
        get() = memberAt<CPointerVar<sqlite3_io_methods>>(0).value
        set(value) { memberAt<CPointerVar<sqlite3_io_methods>>(0).value = value }
    
    var pVfs: CPointer<sqlite3_vfs>?
        get() = memberAt<CPointerVar<sqlite3_vfs>>(8).value
        set(value) { memberAt<CPointerVar<sqlite3_vfs>>(8).value = value }
    
    var h: HANDLE?
        get() = memberAt<HANDLEVar>(16).value
        set(value) { memberAt<HANDLEVar>(16).value = value }
    
    var locktype: u8
        get() = memberAt<u8Var>(24).value
        set(value) { memberAt<u8Var>(24).value = value }
    
    var sharedLockByte: Short
        get() = memberAt<ShortVar>(26).value
        set(value) { memberAt<ShortVar>(26).value = value }
    
    var ctrlFlags: u8
        get() = memberAt<u8Var>(28).value
        set(value) { memberAt<u8Var>(28).value = value }
    
    var lastErrno: DWORD
        get() = memberAt<DWORDVar>(32).value
        set(value) { memberAt<DWORDVar>(32).value = value }
    
    var pShm: CPointer<winShm>?
        get() = memberAt<CPointerVar<winShm>>(40).value
        set(value) { memberAt<CPointerVar<winShm>>(40).value = value }
    
    var zPath: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(48).value
        set(value) { memberAt<CPointerVar<ByteVar>>(48).value = value }
    
    var szChunk: Int
        get() = memberAt<IntVar>(56).value
        set(value) { memberAt<IntVar>(56).value = value }
    
    var nFetchOut: Int
        get() = memberAt<IntVar>(60).value
        set(value) { memberAt<IntVar>(60).value = value }
    
    var hMap: HANDLE?
        get() = memberAt<HANDLEVar>(64).value
        set(value) { memberAt<HANDLEVar>(64).value = value }
    
    var pMapRegion: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(72).value
        set(value) { memberAt<COpaquePointerVar>(72).value = value }
    
    var mmapSize: sqlite3_int64
        get() = memberAt<sqlite3_int64Var>(80).value
        set(value) { memberAt<sqlite3_int64Var>(80).value = value }
    
    var mmapSizeMax: sqlite3_int64
        get() = memberAt<sqlite3_int64Var>(88).value
        set(value) { memberAt<sqlite3_int64Var>(88).value = value }
}

@CStruct("struct { void* p0; void* p1; }")
class ShmRegion(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 8)
    
    var hMap: HANDLE?
        get() = memberAt<HANDLEVar>(0).value
        set(value) { memberAt<HANDLEVar>(0).value = value }
    
    var pMap: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(8).value
        set(value) { memberAt<COpaquePointerVar>(8).value = value }
}

@CStruct("struct { void* p0; void* p1; int p2; }")
class winVfsAppData(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(24, 8)
    
    var pMethod: CPointer<sqlite3_io_methods>?
        get() = memberAt<CPointerVar<sqlite3_io_methods>>(0).value
        set(value) { memberAt<CPointerVar<sqlite3_io_methods>>(0).value = value }
    
    var pAppData: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(8).value
        set(value) { memberAt<COpaquePointerVar>(8).value = value }
    
    var bNoLock: BOOL
        get() = memberAt<BOOLVar>(16).value
        set(value) { memberAt<BOOLVar>(16).value = value }
}

@CStruct("struct { void* p0; void* p1; void* p2; }")
class win_syscall(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(24, 8)
    
    var zName: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(0).value
        set(value) { memberAt<CPointerVar<ByteVar>>(0).value = value }
    
    var pCurrent: sqlite3_syscall_ptr?
        get() = memberAt<sqlite3_syscall_ptrVar>(8).value
        set(value) { memberAt<sqlite3_syscall_ptrVar>(8).value = value }
    
    var pDefault: sqlite3_syscall_ptr?
        get() = memberAt<sqlite3_syscall_ptrVar>(16).value
        set(value) { memberAt<sqlite3_syscall_ptrVar>(16).value = value }
}

@CStruct("struct { void* p0; int p1; int p2; int p3; }")
class EntropyGatherer(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(24, 8)
    
    var a: CPointer<UByteVar>?
        get() = memberAt<CPointerVar<UByteVar>>(0).value
        set(value) { memberAt<CPointerVar<UByteVar>>(0).value = value }
    
    var na: Int
        get() = memberAt<IntVar>(8).value
        set(value) { memberAt<IntVar>(8).value = value }
    
    var i: Int
        get() = memberAt<IntVar>(12).value
        set(value) { memberAt<IntVar>(12).value = value }
    
    var nXor: Int
        get() = memberAt<IntVar>(16).value
        set(value) { memberAt<IntVar>(16).value = value }
}

@CStruct("struct { void* p0; void* p1; int p2; int p3; int p4; int p5; unsigned int p6; unsigned int p7; unsigned int p8; unsigned int p9; unsigned int p10; unsigned int p11; unsigned int p12; unsigned int p13; void* p14; void* p15; void* p16; }")
class PCache1(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(88, 8)
    
    var pGroup: CPointer<PGroup>?
        get() = memberAt<CPointerVar<PGroup>>(0).value
        set(value) { memberAt<CPointerVar<PGroup>>(0).value = value }
    
    var pnPurgeable: CPointer<UIntVar>?
        get() = memberAt<CPointerVar<UIntVar>>(8).value
        set(value) { memberAt<CPointerVar<UIntVar>>(8).value = value }
    
    var szPage: Int
        get() = memberAt<IntVar>(16).value
        set(value) { memberAt<IntVar>(16).value = value }
    
    var szExtra: Int
        get() = memberAt<IntVar>(20).value
        set(value) { memberAt<IntVar>(20).value = value }
    
    var szAlloc: Int
        get() = memberAt<IntVar>(24).value
        set(value) { memberAt<IntVar>(24).value = value }
    
    var bPurgeable: Int
        get() = memberAt<IntVar>(28).value
        set(value) { memberAt<IntVar>(28).value = value }
    
    var nMin: UInt
        get() = memberAt<UIntVar>(32).value
        set(value) { memberAt<UIntVar>(32).value = value }
    
    var nMax: UInt
        get() = memberAt<UIntVar>(36).value
        set(value) { memberAt<UIntVar>(36).value = value }
    
    var n90pct: UInt
        get() = memberAt<UIntVar>(40).value
        set(value) { memberAt<UIntVar>(40).value = value }
    
    var iMaxKey: UInt
        get() = memberAt<UIntVar>(44).value
        set(value) { memberAt<UIntVar>(44).value = value }
    
    var nPurgeableDummy: UInt
        get() = memberAt<UIntVar>(48).value
        set(value) { memberAt<UIntVar>(48).value = value }
    
    var nRecyclable: UInt
        get() = memberAt<UIntVar>(52).value
        set(value) { memberAt<UIntVar>(52).value = value }
    
    var nPage: UInt
        get() = memberAt<UIntVar>(56).value
        set(value) { memberAt<UIntVar>(56).value = value }
    
    var nHash: UInt
        get() = memberAt<UIntVar>(60).value
        set(value) { memberAt<UIntVar>(60).value = value }
    
    var apHash: CPointer<CPointerVar<PgHdr1>>?
        get() = memberAt<CPointerVar<CPointerVar<PgHdr1>>>(64).value
        set(value) { memberAt<CPointerVar<CPointerVar<PgHdr1>>>(64).value = value }
    
    var pFree: CPointer<PgHdr1>?
        get() = memberAt<CPointerVar<PgHdr1>>(72).value
        set(value) { memberAt<CPointerVar<PgHdr1>>(72).value = value }
    
    var pBulk: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(80).value
        set(value) { memberAt<COpaquePointerVar>(80).value = value }
}

@CStruct("struct { void* p0; unsigned int p1; unsigned int p2; unsigned int p3; unsigned int p4; struct { struct { void* p0; void* p1; } p0; unsigned int p1; unsigned short p2; unsigned short p3; void* p4; void* p5; void* p6; void* p7; } p5; }")
class PGroup(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(80, 8)
    
    var mutex: CPointer<sqlite3_mutex>?
        get() = memberAt<CPointerVar<sqlite3_mutex>>(0).value
        set(value) { memberAt<CPointerVar<sqlite3_mutex>>(0).value = value }
    
    var nMaxPage: UInt
        get() = memberAt<UIntVar>(8).value
        set(value) { memberAt<UIntVar>(8).value = value }
    
    var nMinPage: UInt
        get() = memberAt<UIntVar>(12).value
        set(value) { memberAt<UIntVar>(12).value = value }
    
    var mxPinned: UInt
        get() = memberAt<UIntVar>(16).value
        set(value) { memberAt<UIntVar>(16).value = value }
    
    var nPurgeable: UInt
        get() = memberAt<UIntVar>(20).value
        set(value) { memberAt<UIntVar>(20).value = value }
    
    val lru: PgHdr1
        get() = memberAt(24)
}

@CStruct("struct { struct { void* p0; void* p1; } p0; unsigned int p1; unsigned short p2; unsigned short p3; void* p4; void* p5; void* p6; void* p7; }")
class PgHdr1(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(56, 8)
    
    val page: sqlite3_pcache_page
        get() = memberAt(0)
    
    var iKey: UInt
        get() = memberAt<UIntVar>(16).value
        set(value) { memberAt<UIntVar>(16).value = value }
    
    var isBulkLocal: u16
        get() = memberAt<u16Var>(20).value
        set(value) { memberAt<u16Var>(20).value = value }
    
    var isAnchor: u16
        get() = memberAt<u16Var>(22).value
        set(value) { memberAt<u16Var>(22).value = value }
    
    var pNext: CPointer<PgHdr1>?
        get() = memberAt<CPointerVar<PgHdr1>>(24).value
        set(value) { memberAt<CPointerVar<PgHdr1>>(24).value = value }
    
    var pCache: CPointer<PCache1>?
        get() = memberAt<CPointerVar<PCache1>>(32).value
        set(value) { memberAt<CPointerVar<PCache1>>(32).value = value }
    
    var pLruNext: CPointer<PgHdr1>?
        get() = memberAt<CPointerVar<PgHdr1>>(40).value
        set(value) { memberAt<CPointerVar<PgHdr1>>(40).value = value }
    
    var pLruPrev: CPointer<PgHdr1>?
        get() = memberAt<CPointerVar<PgHdr1>>(48).value
        set(value) { memberAt<CPointerVar<PgHdr1>>(48).value = value }
}

@CStruct("struct { void* p0; }")
class PgFreeslot(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(8, 8)
    
    var pNext: CPointer<PgFreeslot>?
        get() = memberAt<CPointerVar<PgFreeslot>>(0).value
        set(value) { memberAt<CPointerVar<PgFreeslot>>(0).value = value }
}

@CStruct("struct { struct { void* p0; unsigned int p1; unsigned int p2; unsigned int p3; unsigned int p4; struct { struct { void* p0; void* p1; } p0; unsigned int p1; unsigned short p2; unsigned short p3; void* p4; void* p5; void* p6; void* p7; } p5; } p0; int p1; int p2; int p3; int p4; int p5; int p6; void* p7; void* p8; void* p9; void* p10; int p11; int p12; }")
class PCacheGlobal(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(144, 8)
    
    val grp: PGroup
        get() = memberAt(0)
    
    var isInit: Int
        get() = memberAt<IntVar>(80).value
        set(value) { memberAt<IntVar>(80).value = value }
    
    var separateCache: Int
        get() = memberAt<IntVar>(84).value
        set(value) { memberAt<IntVar>(84).value = value }
    
    var nInitPage: Int
        get() = memberAt<IntVar>(88).value
        set(value) { memberAt<IntVar>(88).value = value }
    
    var szSlot: Int
        get() = memberAt<IntVar>(92).value
        set(value) { memberAt<IntVar>(92).value = value }
    
    var nSlot: Int
        get() = memberAt<IntVar>(96).value
        set(value) { memberAt<IntVar>(96).value = value }
    
    var nReserve: Int
        get() = memberAt<IntVar>(100).value
        set(value) { memberAt<IntVar>(100).value = value }
    
    var pStart: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(104).value
        set(value) { memberAt<COpaquePointerVar>(104).value = value }
    
    var pEnd: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(112).value
        set(value) { memberAt<COpaquePointerVar>(112).value = value }
    
    var mutex: CPointer<sqlite3_mutex>?
        get() = memberAt<CPointerVar<sqlite3_mutex>>(120).value
        set(value) { memberAt<CPointerVar<sqlite3_mutex>>(120).value = value }
    
    var pFree: CPointer<PgFreeslot>?
        get() = memberAt<CPointerVar<PgFreeslot>>(128).value
        set(value) { memberAt<CPointerVar<PgFreeslot>>(128).value = value }
    
    var nFreeSlot: Int
        get() = memberAt<IntVar>(136).value
        set(value) { memberAt<IntVar>(136).value = value }
    
    var bUnderPressure: Int
        get() = memberAt<IntVar>(140).value
        set(value) { memberAt<IntVar>(140).value = value }
}

@CStruct("struct { int p0; int p1; struct { int p0; void* p1; void* p2; int p3; int p4; } p2[1]; }")
class WalIterator(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(40, 8)
    
    var iPrior: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var nSegment: Int
        get() = memberAt<IntVar>(4).value
        set(value) { memberAt<IntVar>(4).value = value }
    
    val aSegment: CArrayPointer<WalSegment>
        get() = arrayMemberAt(8)
}

@CStruct("struct { int p0; void* p1; void* p2; int p3; int p4; }")
class WalSegment(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(32, 8)
    
    var iNext: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var aIndex: CPointer<ht_slotVar>?
        get() = memberAt<CPointerVar<ht_slotVar>>(8).value
        set(value) { memberAt<CPointerVar<ht_slotVar>>(8).value = value }
    
    var aPgno: CPointer<u32Var>?
        get() = memberAt<CPointerVar<u32Var>>(16).value
        set(value) { memberAt<CPointerVar<u32Var>>(16).value = value }
    
    var nEntry: Int
        get() = memberAt<IntVar>(24).value
        set(value) { memberAt<IntVar>(24).value = value }
    
    var iZero: Int
        get() = memberAt<IntVar>(28).value
        set(value) { memberAt<IntVar>(28).value = value }
}

@CStruct("struct { unsigned int p0; unsigned int p1[5]; unsigned char p2[8]; unsigned int p3; unsigned int p4; }")
class WalCkptInfo(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(40, 4)
    
    var nBackfill: u32
        get() = memberAt<u32Var>(0).value
        set(value) { memberAt<u32Var>(0).value = value }
    
    val aReadMark: CArrayPointer<u32Var>
        get() = arrayMemberAt(4)
    
    val aLock: CArrayPointer<u8Var>
        get() = arrayMemberAt(24)
    
    var nBackfillAttempted: u32
        get() = memberAt<u32Var>(32).value
        set(value) { memberAt<u32Var>(32).value = value }
    
    var notUsed0: u32
        get() = memberAt<u32Var>(36).value
        set(value) { memberAt<u32Var>(36).value = value }
}

@CStruct("struct { void* p0; void* p1; unsigned int p2; }")
class WalHashLoc(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(24, 8)
    
    var aHash: CPointer<ht_slotVar>?
        get() = memberAt<CPointerVar<ht_slotVar>>(0).value
        set(value) { memberAt<CPointerVar<ht_slotVar>>(0).value = value }
    
    var aPgno: CPointer<u32Var>?
        get() = memberAt<CPointerVar<u32Var>>(8).value
        set(value) { memberAt<CPointerVar<u32Var>>(8).value = value }
    
    var iZero: u32
        get() = memberAt<u32Var>(16).value
        set(value) { memberAt<u32Var>(16).value = value }
}

@CStruct("struct { void* p0; void* p1; long long p2; int p3; int p4; }")
class WalWriter(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(32, 8)
    
    var pWal: CPointer<Wal>?
        get() = memberAt<CPointerVar<Wal>>(0).value
        set(value) { memberAt<CPointerVar<Wal>>(0).value = value }
    
    var pFd: CPointer<sqlite3_file>?
        get() = memberAt<CPointerVar<sqlite3_file>>(8).value
        set(value) { memberAt<CPointerVar<sqlite3_file>>(8).value = value }
    
    var iSyncPoint: sqlite3_int64
        get() = memberAt<sqlite3_int64Var>(16).value
        set(value) { memberAt<sqlite3_int64Var>(16).value = value }
    
    var syncFlags: Int
        get() = memberAt<IntVar>(24).value
        set(value) { memberAt<IntVar>(24).value = value }
    
    var szPage: Int
        get() = memberAt<IntVar>(28).value
        set(value) { memberAt<IntVar>(28).value = value }
}

@CStruct("struct { void* p0; void* p1; void* p2; unsigned int p3; int p4; int p5; int p6; void* p7; int p8; int p9; struct { void* p0; void* p1; unsigned int p2; unsigned int p3; unsigned int p4; unsigned char p5; unsigned char p6; } p10; void* p11; }")
class IntegrityCk(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(96, 8)
    
    var pBt: CPointer<BtShared>?
        get() = memberAt<CPointerVar<BtShared>>(0).value
        set(value) { memberAt<CPointerVar<BtShared>>(0).value = value }
    
    var pPager: CPointer<Pager>?
        get() = memberAt<CPointerVar<Pager>>(8).value
        set(value) { memberAt<CPointerVar<Pager>>(8).value = value }
    
    var aPgRef: CPointer<u8Var>?
        get() = memberAt<CPointerVar<u8Var>>(16).value
        set(value) { memberAt<CPointerVar<u8Var>>(16).value = value }
    
    var nPage: Pgno
        get() = memberAt<PgnoVar>(24).value
        set(value) { memberAt<PgnoVar>(24).value = value }
    
    var mxErr: Int
        get() = memberAt<IntVar>(28).value
        set(value) { memberAt<IntVar>(28).value = value }
    
    var nErr: Int
        get() = memberAt<IntVar>(32).value
        set(value) { memberAt<IntVar>(32).value = value }
    
    var mallocFailed: Int
        get() = memberAt<IntVar>(36).value
        set(value) { memberAt<IntVar>(36).value = value }
    
    var zPfx: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(40).value
        set(value) { memberAt<CPointerVar<ByteVar>>(40).value = value }
    
    var v1: Int
        get() = memberAt<IntVar>(48).value
        set(value) { memberAt<IntVar>(48).value = value }
    
    var v2: Int
        get() = memberAt<IntVar>(52).value
        set(value) { memberAt<IntVar>(52).value = value }
    
    val errMsg: StrAccum
        get() = memberAt(56)
    
    var heap: CPointer<u32Var>?
        get() = memberAt<CPointerVar<u32Var>>(88).value
        set(value) { memberAt<CPointerVar<u32Var>>(88).value = value }
}

@CStruct("struct { int p0; void* p1; void* p2; void* p3; void* p4[6]; int p5[6]; }")
class CellArray(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(104, 8)
    
    var nCell: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var pRef: CPointer<MemPage>?
        get() = memberAt<CPointerVar<MemPage>>(8).value
        set(value) { memberAt<CPointerVar<MemPage>>(8).value = value }
    
    var apCell: CPointer<CPointerVar<u8Var>>?
        get() = memberAt<CPointerVar<CPointerVar<u8Var>>>(16).value
        set(value) { memberAt<CPointerVar<CPointerVar<u8Var>>>(16).value = value }
    
    var szCell: CPointer<u16Var>?
        get() = memberAt<CPointerVar<u16Var>>(24).value
        set(value) { memberAt<CPointerVar<u16Var>>(24).value = value }
    
    val apEnd: CArrayPointer<CPointerVar<u8Var>>
        get() = arrayMemberAt(32)
    
    val ixNx: CArrayPointer<IntVar>
        get() = arrayMemberAt(80)
}

@CStruct("struct { void* p0; void* p1; void* p2; int p3; }")
class ValueNewStat4Ctx(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(32, 8)
    
    var pParse: CPointer<Parse>?
        get() = memberAt<CPointerVar<Parse>>(0).value
        set(value) { memberAt<CPointerVar<Parse>>(0).value = value }
    
    var pIdx: CPointer<Index>?
        get() = memberAt<CPointerVar<Index>>(8).value
        set(value) { memberAt<CPointerVar<Index>>(8).value = value }
    
    var ppRec: CPointer<CPointerVar<UnpackedRecord>>?
        get() = memberAt<CPointerVar<CPointerVar<UnpackedRecord>>>(16).value
        set(value) { memberAt<CPointerVar<CPointerVar<UnpackedRecord>>>(16).value = value }
    
    var iVal: Int
        get() = memberAt<IntVar>(24).value
        set(value) { memberAt<IntVar>(24).value = value }
}

@CStruct("struct { void* p0; int p1; int p2; }")
class ReusableSpace(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 8)
    
    var pSpace: CPointer<u8Var>?
        get() = memberAt<CPointerVar<u8Var>>(0).value
        set(value) { memberAt<CPointerVar<u8Var>>(0).value = value }
    
    var nFree: Int
        get() = memberAt<IntVar>(8).value
        set(value) { memberAt<IntVar>(8).value = value }
    
    var nNeeded: Int
        get() = memberAt<IntVar>(12).value
        set(value) { memberAt<IntVar>(12).value = value }
}

@CStruct("struct { int p0; int p1; unsigned short p2; void* p3; void* p4; void* p5; void* p6; void* p7; }")
class Incrblob(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(56, 8)
    
    var nByte: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var iOffset: Int
        get() = memberAt<IntVar>(4).value
        set(value) { memberAt<IntVar>(4).value = value }
    
    var iCol: u16
        get() = memberAt<u16Var>(8).value
        set(value) { memberAt<u16Var>(8).value = value }
    
    var pCsr: CPointer<BtCursor>?
        get() = memberAt<CPointerVar<BtCursor>>(16).value
        set(value) { memberAt<CPointerVar<BtCursor>>(16).value = value }
    
    var pStmt: CPointer<sqlite3_stmt>?
        get() = memberAt<CPointerVar<sqlite3_stmt>>(24).value
        set(value) { memberAt<CPointerVar<sqlite3_stmt>>(24).value = value }
    
    var db: CPointer<sqlite3>?
        get() = memberAt<CPointerVar<sqlite3>>(32).value
        set(value) { memberAt<CPointerVar<sqlite3>>(32).value = value }
    
    var zDb: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(40).value
        set(value) { memberAt<CPointerVar<ByteVar>>(40).value = value }
    
    var pTab: CPointer<Table>?
        get() = memberAt<CPointerVar<Table>>(48).value
        set(value) { memberAt<CPointerVar<Table>>(48).value = value }
}

@CStruct("struct { int p0; void* p1; int p2; int p3; int p4; long long p5; void* p6; }")
class PmaWriter(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(48, 8)
    
    var eFWErr: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var aBuffer: CPointer<u8Var>?
        get() = memberAt<CPointerVar<u8Var>>(8).value
        set(value) { memberAt<CPointerVar<u8Var>>(8).value = value }
    
    var nBuffer: Int
        get() = memberAt<IntVar>(16).value
        set(value) { memberAt<IntVar>(16).value = value }
    
    var iBufStart: Int
        get() = memberAt<IntVar>(20).value
        set(value) { memberAt<IntVar>(20).value = value }
    
    var iBufEnd: Int
        get() = memberAt<IntVar>(24).value
        set(value) { memberAt<IntVar>(24).value = value }
    
    var iWriteOff: i64
        get() = memberAt<i64Var>(32).value
        set(value) { memberAt<i64Var>(32).value = value }
    
    var pFd: CPointer<sqlite3_file>?
        get() = memberAt<CPointerVar<sqlite3_file>>(40).value
        set(value) { memberAt<CPointerVar<sqlite3_file>>(40).value = value }
}

@CStruct("struct { void* p0; int p1; int p2; int p3; void* p4; struct { long long p0; void* p1; } p5; struct { long long p0; void* p1; } p6; int p7; void* p8; void* p9; }")
class MemJournal(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(88, 8)
    
    var pMethod: CPointer<sqlite3_io_methods>?
        get() = memberAt<CPointerVar<sqlite3_io_methods>>(0).value
        set(value) { memberAt<CPointerVar<sqlite3_io_methods>>(0).value = value }
    
    var nChunkSize: Int
        get() = memberAt<IntVar>(8).value
        set(value) { memberAt<IntVar>(8).value = value }
    
    var nSpill: Int
        get() = memberAt<IntVar>(12).value
        set(value) { memberAt<IntVar>(12).value = value }
    
    var nSize: Int
        get() = memberAt<IntVar>(16).value
        set(value) { memberAt<IntVar>(16).value = value }
    
    var pFirst: CPointer<FileChunk>?
        get() = memberAt<CPointerVar<FileChunk>>(24).value
        set(value) { memberAt<CPointerVar<FileChunk>>(24).value = value }
    
    val endpoint: FilePoint
        get() = memberAt(32)
    
    val readpoint: FilePoint
        get() = memberAt(48)
    
    var flags: Int
        get() = memberAt<IntVar>(64).value
        set(value) { memberAt<IntVar>(64).value = value }
    
    var pVfs: CPointer<sqlite3_vfs>?
        get() = memberAt<CPointerVar<sqlite3_vfs>>(72).value
        set(value) { memberAt<CPointerVar<sqlite3_vfs>>(72).value = value }
    
    var zJournal: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(80).value
        set(value) { memberAt<CPointerVar<ByteVar>>(80).value = value }
}

@CStruct("struct { void* p0; unsigned char p1[8]; }")
class FileChunk(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 8)
    
    var pNext: CPointer<FileChunk>?
        get() = memberAt<CPointerVar<FileChunk>>(0).value
        set(value) { memberAt<CPointerVar<FileChunk>>(0).value = value }
    
    val zChunk: CArrayPointer<u8Var>
        get() = arrayMemberAt(8)
}

@CStruct("struct { long long p0; void* p1; }")
class FilePoint(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 8)
    
    var iOffset: sqlite3_int64
        get() = memberAt<sqlite3_int64Var>(0).value
        set(value) { memberAt<sqlite3_int64Var>(0).value = value }
    
    var pChunk: CPointer<FileChunk>?
        get() = memberAt<CPointerVar<FileChunk>>(8).value
        set(value) { memberAt<CPointerVar<FileChunk>>(8).value = value }
}

@CStruct("struct { unsigned int p0; unsigned int p1; int p2; int p3; int p4; struct { void* p0; void* p1; } p5; unsigned int p6; void* p7; int p8; int p9; int p10; int p11; void* p12; void* p13; }")
class Stat4Accum(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(88, 8)
    
    var nRow: tRowcnt
        get() = memberAt<tRowcntVar>(0).value
        set(value) { memberAt<tRowcntVar>(0).value = value }
    
    var nPSample: tRowcnt
        get() = memberAt<tRowcntVar>(4).value
        set(value) { memberAt<tRowcntVar>(4).value = value }
    
    var nCol: Int
        get() = memberAt<IntVar>(8).value
        set(value) { memberAt<IntVar>(8).value = value }
    
    var nKeyCol: Int
        get() = memberAt<IntVar>(12).value
        set(value) { memberAt<IntVar>(12).value = value }
    
    var mxSample: Int
        get() = memberAt<IntVar>(16).value
        set(value) { memberAt<IntVar>(16).value = value }
    
    val current: Stat4Sample
        get() = memberAt(24)
    
    var iPrn: u32
        get() = memberAt<u32Var>(40).value
        set(value) { memberAt<u32Var>(40).value = value }
    
    var aBest: CPointer<Stat4Sample>?
        get() = memberAt<CPointerVar<Stat4Sample>>(48).value
        set(value) { memberAt<CPointerVar<Stat4Sample>>(48).value = value }
    
    var iMin: Int
        get() = memberAt<IntVar>(56).value
        set(value) { memberAt<IntVar>(56).value = value }
    
    var nSample: Int
        get() = memberAt<IntVar>(60).value
        set(value) { memberAt<IntVar>(60).value = value }
    
    var nMaxEqZero: Int
        get() = memberAt<IntVar>(64).value
        set(value) { memberAt<IntVar>(64).value = value }
    
    var iGet: Int
        get() = memberAt<IntVar>(68).value
        set(value) { memberAt<IntVar>(68).value = value }
    
    var a: CPointer<Stat4Sample>?
        get() = memberAt<CPointerVar<Stat4Sample>>(72).value
        set(value) { memberAt<CPointerVar<Stat4Sample>>(72).value = value }
    
    var db: CPointer<sqlite3>?
        get() = memberAt<CPointerVar<sqlite3>>(80).value
        set(value) { memberAt<CPointerVar<sqlite3>>(80).value = value }
}

@CStruct("struct { void* p0; void* p1; }")
class Stat4Sample(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 8)
    
    var anEq: CPointer<tRowcntVar>?
        get() = memberAt<CPointerVar<tRowcntVar>>(0).value
        set(value) { memberAt<CPointerVar<tRowcntVar>>(0).value = value }
    
    var anDLt: CPointer<tRowcntVar>?
        get() = memberAt<CPointerVar<tRowcntVar>>(8).value
        set(value) { memberAt<CPointerVar<tRowcntVar>>(8).value = value }
}

@CStruct("struct { void* p0; void* p1; }")
class analysisInfo(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 8)
    
    var db: CPointer<sqlite3>?
        get() = memberAt<CPointerVar<sqlite3>>(0).value
        set(value) { memberAt<CPointerVar<sqlite3>>(0).value = value }
    
    var zDatabase: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(8).value
        set(value) { memberAt<CPointerVar<ByteVar>>(8).value = value }
}

@CStruct("struct { unsigned char p0; unsigned char p1; unsigned char p2; unsigned char p3; }")
class compareInfo(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(4, 1)
    
    var matchAll: u8
        get() = memberAt<u8Var>(0).value
        set(value) { memberAt<u8Var>(0).value = value }
    
    var matchOne: u8
        get() = memberAt<u8Var>(1).value
        set(value) { memberAt<u8Var>(1).value = value }
    
    var matchSet: u8
        get() = memberAt<u8Var>(2).value
        set(value) { memberAt<u8Var>(2).value = value }
    
    var noCase: u8
        get() = memberAt<u8Var>(3).value
        set(value) { memberAt<u8Var>(3).value = value }
}

@CStruct("struct { double p0; long long p1; long long p2; unsigned char p3; unsigned char p4; }")
class SumCtx(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(32, 8)
    
    var rSum: Double
        get() = memberAt<DoubleVar>(0).value
        set(value) { memberAt<DoubleVar>(0).value = value }
    
    var iSum: i64
        get() = memberAt<i64Var>(8).value
        set(value) { memberAt<i64Var>(8).value = value }
    
    var cnt: i64
        get() = memberAt<i64Var>(16).value
        set(value) { memberAt<i64Var>(16).value = value }
    
    var overflow: u8
        get() = memberAt<u8Var>(24).value
        set(value) { memberAt<u8Var>(24).value = value }
    
    var approx: u8
        get() = memberAt<u8Var>(25).value
        set(value) { memberAt<u8Var>(25).value = value }
}

@CStruct("struct { long long p0; }")
class CountCtx(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(8, 8)
    
    var n: i64
        get() = memberAt<i64Var>(0).value
        set(value) { memberAt<i64Var>(0).value = value }
}

@CStruct("struct { unsigned int p0; void* p1; }")
class sqlite3AutoExtList(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 8)
    
    var nExt: u32
        get() = memberAt<u32Var>(0).value
        set(value) { memberAt<u32Var>(0).value = value }
    
    var aExt: CPointer<CPointerVar<CFunction<() -> Unit>>>?
        get() = memberAt<CPointerVar<CPointerVar<CFunction<() -> Unit>>>>(8).value
        set(value) { memberAt<CPointerVar<CPointerVar<CFunction<() -> Unit>>>>(8).value = value }
}

@CStruct("struct { void* p0; unsigned char p1; unsigned char p2; unsigned char p3; unsigned char p4; unsigned long long p5; }")
class PragmaName(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(24, 8)
    
    var zName: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(0).value
        set(value) { memberAt<CPointerVar<ByteVar>>(0).value = value }
    
    var ePragTyp: u8
        get() = memberAt<u8Var>(8).value
        set(value) { memberAt<u8Var>(8).value = value }
    
    var mPragFlg: u8
        get() = memberAt<u8Var>(9).value
        set(value) { memberAt<u8Var>(9).value = value }
    
    var iPragCName: u8
        get() = memberAt<u8Var>(10).value
        set(value) { memberAt<u8Var>(10).value = value }
    
    var nPragCName: u8
        get() = memberAt<u8Var>(11).value
        set(value) { memberAt<u8Var>(11).value = value }
    
    var iArg: u64
        get() = memberAt<u64Var>(16).value
        set(value) { memberAt<u64Var>(16).value = value }
}

@CStruct("struct { struct { void* p0; int p1; void* p2; } p0; void* p1; void* p2; unsigned char p3; unsigned char p4; }")
class PragmaVtab(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(48, 8)
    
    val base: sqlite3_vtab
        get() = memberAt(0)
    
    var db: CPointer<sqlite3>?
        get() = memberAt<CPointerVar<sqlite3>>(24).value
        set(value) { memberAt<CPointerVar<sqlite3>>(24).value = value }
    
    var pName: CPointer<PragmaName>?
        get() = memberAt<CPointerVar<PragmaName>>(32).value
        set(value) { memberAt<CPointerVar<PragmaName>>(32).value = value }
    
    var nHidden: u8
        get() = memberAt<u8Var>(40).value
        set(value) { memberAt<u8Var>(40).value = value }
    
    var iHidden: u8
        get() = memberAt<u8Var>(41).value
        set(value) { memberAt<u8Var>(41).value = value }
}

@CStruct("struct { struct { void* p0; } p0; void* p1; long long p2; void* p3[2]; }")
class PragmaVtabCursor(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(40, 8)
    
    val base: sqlite3_vtab_cursor
        get() = memberAt(0)
    
    var pPragma: CPointer<sqlite3_stmt>?
        get() = memberAt<CPointerVar<sqlite3_stmt>>(8).value
        set(value) { memberAt<CPointerVar<sqlite3_stmt>>(8).value = value }
    
    var iRowid: sqlite_int64
        get() = memberAt<sqlite_int64Var>(16).value
        set(value) { memberAt<sqlite_int64Var>(16).value = value }
    
    val azArg: CArrayPointer<CPointerVar<ByteVar>>
        get() = arrayMemberAt(24)
}

@CStruct("struct { unsigned char p0; unsigned char p1; int p2; int p3; }")
class DistinctCtx(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(12, 4)
    
    var isTnct: u8
        get() = memberAt<u8Var>(0).value
        set(value) { memberAt<u8Var>(0).value = value }
    
    var eTnctType: u8
        get() = memberAt<u8Var>(1).value
        set(value) { memberAt<u8Var>(1).value = value }
    
    var tabTnct: Int
        get() = memberAt<IntVar>(4).value
        set(value) { memberAt<IntVar>(4).value = value }
    
    var addrTnct: Int
        get() = memberAt<IntVar>(8).value
        set(value) { memberAt<IntVar>(8).value = value }
}

@CStruct("struct { void* p0; int p1; int p2; int p3; int p4; int p5; int p6; int p7; unsigned char p8; void* p9; }")
class SortCtx(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(48, 8)
    
    var pOrderBy: CPointer<ExprList>?
        get() = memberAt<CPointerVar<ExprList>>(0).value
        set(value) { memberAt<CPointerVar<ExprList>>(0).value = value }
    
    var nOBSat: Int
        get() = memberAt<IntVar>(8).value
        set(value) { memberAt<IntVar>(8).value = value }
    
    var iECursor: Int
        get() = memberAt<IntVar>(12).value
        set(value) { memberAt<IntVar>(12).value = value }
    
    var regReturn: Int
        get() = memberAt<IntVar>(16).value
        set(value) { memberAt<IntVar>(16).value = value }
    
    var labelBkOut: Int
        get() = memberAt<IntVar>(20).value
        set(value) { memberAt<IntVar>(20).value = value }
    
    var addrSortIndex: Int
        get() = memberAt<IntVar>(24).value
        set(value) { memberAt<IntVar>(24).value = value }
    
    var labelDone: Int
        get() = memberAt<IntVar>(28).value
        set(value) { memberAt<IntVar>(28).value = value }
    
    var labelOBLopt: Int
        get() = memberAt<IntVar>(32).value
        set(value) { memberAt<IntVar>(32).value = value }
    
    var sortFlags: u8
        get() = memberAt<u8Var>(36).value
        set(value) { memberAt<u8Var>(36).value = value }
    
    var pDeferredRowLoad: CPointer<RowLoadInfo>?
        get() = memberAt<CPointerVar<RowLoadInfo>>(40).value
        set(value) { memberAt<CPointerVar<RowLoadInfo>>(40).value = value }
}

@CStruct("struct { int p0; unsigned char p1; }")
class RowLoadInfo(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(8, 4)
    
    var regResult: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var ecelFlags: u8
        get() = memberAt<u8Var>(4).value
        set(value) { memberAt<u8Var>(4).value = value }
}

@CStruct("struct { void* p0; int p1; int p2; int p3; void* p4; }")
class SubstContext(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(32, 8)
    
    var pParse: CPointer<Parse>?
        get() = memberAt<CPointerVar<Parse>>(0).value
        set(value) { memberAt<CPointerVar<Parse>>(0).value = value }
    
    var iTable: Int
        get() = memberAt<IntVar>(8).value
        set(value) { memberAt<IntVar>(8).value = value }
    
    var iNewTable: Int
        get() = memberAt<IntVar>(12).value
        set(value) { memberAt<IntVar>(12).value = value }
    
    var isLeftJoin: Int
        get() = memberAt<IntVar>(16).value
        set(value) { memberAt<IntVar>(16).value = value }
    
    var pEList: CPointer<ExprList>?
        get() = memberAt<CPointerVar<ExprList>>(24).value
        set(value) { memberAt<CPointerVar<ExprList>>(24).value = value }
}

@CStruct("struct { void* p0; void* p1; unsigned int p2; unsigned int p3; unsigned int p4; unsigned int p5; int p6; }")
class TabResult(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(40, 8)
    
    var azResult: CPointer<CPointerVar<ByteVar>>?
        get() = memberAt<CPointerVar<CPointerVar<ByteVar>>>(0).value
        set(value) { memberAt<CPointerVar<CPointerVar<ByteVar>>>(0).value = value }
    
    var zErrMsg: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(8).value
        set(value) { memberAt<CPointerVar<ByteVar>>(8).value = value }
    
    var nAlloc: u32
        get() = memberAt<u32Var>(16).value
        set(value) { memberAt<u32Var>(16).value = value }
    
    var nRow: u32
        get() = memberAt<u32Var>(20).value
        set(value) { memberAt<u32Var>(20).value = value }
    
    var nColumn: u32
        get() = memberAt<u32Var>(24).value
        set(value) { memberAt<u32Var>(24).value = value }
    
    var nData: u32
        get() = memberAt<u32Var>(28).value
        set(value) { memberAt<u32Var>(28).value = value }
    
    var rc: Int
        get() = memberAt<IntVar>(32).value
        set(value) { memberAt<IntVar>(32).value = value }
}

@CStruct("struct { unsigned long long p0; unsigned long long p1; short p2; short p3; short p4; signed char p5; void* p6; }")
class WherePath(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(32, 8)
    
    var maskLoop: Bitmask
        get() = memberAt<BitmaskVar>(0).value
        set(value) { memberAt<BitmaskVar>(0).value = value }
    
    var revLoop: Bitmask
        get() = memberAt<BitmaskVar>(8).value
        set(value) { memberAt<BitmaskVar>(8).value = value }
    
    var nRow: LogEst
        get() = memberAt<LogEstVar>(16).value
        set(value) { memberAt<LogEstVar>(16).value = value }
    
    var rCost: LogEst
        get() = memberAt<LogEstVar>(18).value
        set(value) { memberAt<LogEstVar>(18).value = value }
    
    var rUnsorted: LogEst
        get() = memberAt<LogEstVar>(20).value
        set(value) { memberAt<LogEstVar>(20).value = value }
    
    var isOrdered: i8
        get() = memberAt<i8Var>(22).value
        set(value) { memberAt<i8Var>(22).value = value }
    
    var aLoop: CPointer<CPointerVar<WhereLoop>>?
        get() = memberAt<CPointerVar<CPointerVar<WhereLoop>>>(24).value
        set(value) { memberAt<CPointerVar<CPointerVar<WhereLoop>>>(24).value = value }
}

@CStruct("struct { void* p0; void* p1; void* p2; void* p3; void* p4; unsigned int p5; unsigned int p6; }")
class WhereLoopBuilder(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(48, 8)
    
    var pWInfo: CPointer<WhereInfo>?
        get() = memberAt<CPointerVar<WhereInfo>>(0).value
        set(value) { memberAt<CPointerVar<WhereInfo>>(0).value = value }
    
    var pWC: CPointer<WhereClause>?
        get() = memberAt<CPointerVar<WhereClause>>(8).value
        set(value) { memberAt<CPointerVar<WhereClause>>(8).value = value }
    
    var pOrderBy: CPointer<ExprList>?
        get() = memberAt<CPointerVar<ExprList>>(16).value
        set(value) { memberAt<CPointerVar<ExprList>>(16).value = value }
    
    var pNew: CPointer<WhereLoop>?
        get() = memberAt<CPointerVar<WhereLoop>>(24).value
        set(value) { memberAt<CPointerVar<WhereLoop>>(24).value = value }
    
    var pOrSet: CPointer<WhereOrSet>?
        get() = memberAt<CPointerVar<WhereOrSet>>(32).value
        set(value) { memberAt<CPointerVar<WhereOrSet>>(32).value = value }
    
    var bldFlags: UInt
        get() = memberAt<UIntVar>(40).value
        set(value) { memberAt<UIntVar>(40).value = value }
    
    var iPlanLimit: UInt
        get() = memberAt<UIntVar>(44).value
        set(value) { memberAt<UIntVar>(44).value = value }
}

@CStruct("struct { unsigned short p0; struct { unsigned long long p0; short p1; short p2; } p1[3]; }")
class WhereOrSet(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(56, 8)
    
    var n: u16
        get() = memberAt<u16Var>(0).value
        set(value) { memberAt<u16Var>(0).value = value }
    
    val a: CArrayPointer<WhereOrCost>
        get() = arrayMemberAt(8)
}

@CStruct("struct { unsigned long long p0; short p1; short p2; }")
class WhereOrCost(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 8)
    
    var prereq: Bitmask
        get() = memberAt<BitmaskVar>(0).value
        set(value) { memberAt<BitmaskVar>(0).value = value }
    
    var rRun: LogEst
        get() = memberAt<LogEstVar>(8).value
        set(value) { memberAt<LogEstVar>(8).value = value }
    
    var nOut: LogEst
        get() = memberAt<LogEstVar>(10).value
        set(value) { memberAt<LogEstVar>(10).value = value }
}

@CStruct("struct { void* p0; void* p1; void* p2; void* p3; char p4; unsigned char p5; unsigned char p6; unsigned int p7; int p8; int p9[11]; short p10[11]; }")
class WhereScan(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(112, 8)
    
    var pOrigWC: CPointer<WhereClause>?
        get() = memberAt<CPointerVar<WhereClause>>(0).value
        set(value) { memberAt<CPointerVar<WhereClause>>(0).value = value }
    
    var pWC: CPointer<WhereClause>?
        get() = memberAt<CPointerVar<WhereClause>>(8).value
        set(value) { memberAt<CPointerVar<WhereClause>>(8).value = value }
    
    var zCollName: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(16).value
        set(value) { memberAt<CPointerVar<ByteVar>>(16).value = value }
    
    var pIdxExpr: CPointer<Expr>?
        get() = memberAt<CPointerVar<Expr>>(24).value
        set(value) { memberAt<CPointerVar<Expr>>(24).value = value }
    
    var idxaff: Byte
        get() = memberAt<ByteVar>(32).value
        set(value) { memberAt<ByteVar>(32).value = value }
    
    var nEquiv: UByte
        get() = memberAt<UByteVar>(33).value
        set(value) { memberAt<UByteVar>(33).value = value }
    
    var iEquiv: UByte
        get() = memberAt<UByteVar>(34).value
        set(value) { memberAt<UByteVar>(34).value = value }
    
    var opMask: u32
        get() = memberAt<u32Var>(36).value
        set(value) { memberAt<u32Var>(36).value = value }
    
    var k: Int
        get() = memberAt<IntVar>(40).value
        set(value) { memberAt<IntVar>(40).value = value }
    
    val aiCur: CArrayPointer<IntVar>
        get() = arrayMemberAt(44)
    
    val aiColumn: CArrayPointer<i16Var>
        get() = arrayMemberAt(88)
}

@CStruct("struct { void* p0; void* p1; }")
class HiddenIndexInfo(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 8)
    
    var pWC: CPointer<WhereClause>?
        get() = memberAt<CPointerVar<WhereClause>>(0).value
        set(value) { memberAt<CPointerVar<WhereClause>>(0).value = value }
    
    var pParse: CPointer<Parse>?
        get() = memberAt<CPointerVar<Parse>>(8).value
        set(value) { memberAt<CPointerVar<Parse>>(8).value = value }
}

@CStruct("struct { long long p0; long long p1; long long p2; }")
class CallCount(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(24, 8)
    
    var nValue: i64
        get() = memberAt<i64Var>(0).value
        set(value) { memberAt<i64Var>(0).value = value }
    
    var nStep: i64
        get() = memberAt<i64Var>(8).value
        set(value) { memberAt<i64Var>(8).value = value }
    
    var nTotal: i64
        get() = memberAt<i64Var>(16).value
        set(value) { memberAt<i64Var>(16).value = value }
}

@CStruct("struct { long long p0; long long p1; long long p2; }")
class NtileCtx(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(24, 8)
    
    var nTotal: i64
        get() = memberAt<i64Var>(0).value
        set(value) { memberAt<i64Var>(0).value = value }
    
    var nParam: i64
        get() = memberAt<i64Var>(8).value
        set(value) { memberAt<i64Var>(8).value = value }
    
    var iRow: i64
        get() = memberAt<i64Var>(16).value
        set(value) { memberAt<i64Var>(16).value = value }
}

@CStruct("struct { void* p0; int p1; }")
class LastValueCtx(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 8)
    
    var pVal: CPointer<sqlite3_value>?
        get() = memberAt<CPointerVar<sqlite3_value>>(0).value
        set(value) { memberAt<CPointerVar<sqlite3_value>>(0).value = value }
    
    var nVal: Int
        get() = memberAt<IntVar>(8).value
        set(value) { memberAt<IntVar>(8).value = value }
}

@CStruct("struct { int p0; void* p1; }")
class TrigEvent(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 8)
    
    var a: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var b: CPointer<IdList>?
        get() = memberAt<CPointerVar<IdList>>(8).value
        set(value) { memberAt<CPointerVar<IdList>>(8).value = value }
}

@CStruct("struct { int p0; void* p1; }")
class FrameBound(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 8)
    
    var eType: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var pExpr: CPointer<Expr>?
        get() = memberAt<CPointerVar<Expr>>(8).value
        set(value) { memberAt<CPointerVar<Expr>>(8).value = value }
}

@CStruct("union { int p0; struct { void* p0; unsigned int p1; } p1; void* p2; int p3; void* p4; void* p5; void* p6; void* p7; struct { int p0; void* p1; } p8; void* p9; struct { int p0; void* p1; } p10; struct { int p0; int p1; } p11; void* p12; void* p13; void* p14; void* p15; }")
class YYMINORTYPE(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 8)
    
    var yyinit: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    val yy0: Token
        get() = memberAt(0)
    
    var yy42: CPointer<ExprList>?
        get() = memberAt<CPointerVar<ExprList>>(0).value
        set(value) { memberAt<CPointerVar<ExprList>>(0).value = value }
    
    var yy96: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var yy119: CPointer<TriggerStep>?
        get() = memberAt<CPointerVar<TriggerStep>>(0).value
        set(value) { memberAt<CPointerVar<TriggerStep>>(0).value = value }
    
    var yy147: CPointer<Window>?
        get() = memberAt<CPointerVar<Window>>(0).value
        set(value) { memberAt<CPointerVar<Window>>(0).value = value }
    
    var yy167: CPointer<SrcList>?
        get() = memberAt<CPointerVar<SrcList>>(0).value
        set(value) { memberAt<CPointerVar<SrcList>>(0).value = value }
    
    var yy266: CPointer<Upsert>?
        get() = memberAt<CPointerVar<Upsert>>(0).value
        set(value) { memberAt<CPointerVar<Upsert>>(0).value = value }
    
    val yy317: FrameBound
        get() = memberAt(0)
    
    var yy336: CPointer<IdList>?
        get() = memberAt<CPointerVar<IdList>>(0).value
        set(value) { memberAt<CPointerVar<IdList>>(0).value = value }
    
    val yy350: TrigEvent
        get() = memberAt(0)
    
    val yy367: anonymousStruct23
        get() = memberAt(0)
    
    var yy423: CPointer<Select>?
        get() = memberAt<CPointerVar<Select>>(0).value
        set(value) { memberAt<CPointerVar<Select>>(0).value = value }
    
    var yy464: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(0).value
        set(value) { memberAt<CPointerVar<ByteVar>>(0).value = value }
    
    var yy490: CPointer<Expr>?
        get() = memberAt<CPointerVar<Expr>>(0).value
        set(value) { memberAt<CPointerVar<Expr>>(0).value = value }
    
    var yy499: CPointer<With>?
        get() = memberAt<CPointerVar<With>>(0).value
        set(value) { memberAt<CPointerVar<With>>(0).value = value }
}

@CStruct("struct { int p0; int p1; }")
class anonymousStruct23(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(8, 4)
    
    var value: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var mask: Int
        get() = memberAt<IntVar>(4).value
        set(value) { memberAt<IntVar>(4).value = value }
}

@CStruct("struct { unsigned short p0; unsigned short p1; union { int p0; struct { void* p0; unsigned int p1; } p1; void* p2; int p3; void* p4; void* p5; void* p6; void* p7; struct { int p0; void* p1; } p8; void* p9; struct { int p0; void* p1; } p10; struct { int p0; int p1; } p11; void* p12; void* p13; void* p14; void* p15; } p2; }")
class yyStackEntry(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(24, 8)
    
    var stateno: UShort
        get() = memberAt<UShortVar>(0).value
        set(value) { memberAt<UShortVar>(0).value = value }
    
    var major: UShort
        get() = memberAt<UShortVar>(2).value
        set(value) { memberAt<UShortVar>(2).value = value }
    
    val minor: YYMINORTYPE
        get() = memberAt(8)
}

@CStruct("struct { void* p0; void* p1; struct { unsigned short p0; unsigned short p1; union { int p0; struct { void* p0; unsigned int p1; } p1; void* p2; int p3; void* p4; void* p5; void* p6; void* p7; struct { int p0; void* p1; } p8; void* p9; struct { int p0; void* p1; } p10; struct { int p0; int p1; } p11; void* p12; void* p13; void* p14; void* p15; } p2; } p2[100]; void* p3; }")
class yyParser(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(2424, 8)
    
    var yytos: CPointer<yyStackEntry>?
        get() = memberAt<CPointerVar<yyStackEntry>>(0).value
        set(value) { memberAt<CPointerVar<yyStackEntry>>(0).value = value }
    
    var pParse: CPointer<Parse>?
        get() = memberAt<CPointerVar<Parse>>(8).value
        set(value) { memberAt<CPointerVar<Parse>>(8).value = value }
    
    val yystack: CArrayPointer<yyStackEntry>
        get() = arrayMemberAt(16)
    
    var yystackEnd: CPointer<yyStackEntry>?
        get() = memberAt<CPointerVar<yyStackEntry>>(2416).value
        set(value) { memberAt<CPointerVar<yyStackEntry>>(2416).value = value }
}

@CCall("knifunptr_sqlite30_sqlite3CompileOptions")
external fun sqlite3CompileOptions(pnOpt: CValuesRef<IntVar>?): CPointer<CPointerVar<ByteVar>>?

@CCall("knifunptr_sqlite31_sqlite3_libversion")
external fun sqlite3_libversion(): CPointer<ByteVar>?

@CCall("knifunptr_sqlite32_sqlite3_sourceid")
external fun sqlite3_sourceid(): CPointer<ByteVar>?

@CCall("knifunptr_sqlite33_sqlite3_libversion_number")
external fun sqlite3_libversion_number(): Int

@CCall("knifunptr_sqlite34_sqlite3_compileoption_used")
external fun sqlite3_compileoption_used(@CCall.CString zOptName: String?): Int

@CCall("knifunptr_sqlite35_sqlite3_compileoption_get")
external fun sqlite3_compileoption_get(N: Int): CPointer<ByteVar>?

@CCall("knifunptr_sqlite36_sqlite3_threadsafe")
external fun sqlite3_threadsafe(): Int

@CCall("knifunptr_sqlite37_sqlite3_close")
external fun sqlite3_close(arg0: CValuesRef<sqlite3>?): Int

@CCall("knifunptr_sqlite38_sqlite3_close_v2")
external fun sqlite3_close_v2(arg0: CValuesRef<sqlite3>?): Int

@CCall("knifunptr_sqlite39_sqlite3_exec")
external fun sqlite3_exec(arg0: CValuesRef<sqlite3>?, @CCall.CString sql: String?, callback: CPointer<CFunction<(COpaquePointer?, Int, CPointer<CPointerVar<ByteVar>>?, CPointer<CPointerVar<ByteVar>>?) -> Int>>?, arg3: CValuesRef<*>?, errmsg: CValuesRef<CPointerVar<ByteVar>>?): Int

@CCall("knifunptr_sqlite310_sqlite3_initialize")
external fun sqlite3_initialize(): Int

@CCall("knifunptr_sqlite311_sqlite3_shutdown")
external fun sqlite3_shutdown(): Int

@CCall("knifunptr_sqlite312_sqlite3_os_init")
external fun sqlite3_os_init(): Int

@CCall("knifunptr_sqlite313_sqlite3_os_end")
external fun sqlite3_os_end(): Int

@CCall("knifunptr_sqlite314_sqlite3_config")
external fun sqlite3_config(arg0: Int, vararg variadicArguments: Any?): Int

@CCall("knifunptr_sqlite315_sqlite3_db_config")
external fun sqlite3_db_config(arg0: CValuesRef<sqlite3>?, op: Int, vararg variadicArguments: Any?): Int

@CCall("knifunptr_sqlite316_sqlite3_extended_result_codes")
external fun sqlite3_extended_result_codes(arg0: CValuesRef<sqlite3>?, onoff: Int): Int

@CCall("knifunptr_sqlite317_sqlite3_last_insert_rowid")
external fun sqlite3_last_insert_rowid(arg0: CValuesRef<sqlite3>?): sqlite3_int64

@CCall("knifunptr_sqlite318_sqlite3_set_last_insert_rowid")
external fun sqlite3_set_last_insert_rowid(arg0: CValuesRef<sqlite3>?, arg1: sqlite3_int64): Unit

@CCall("knifunptr_sqlite319_sqlite3_changes")
external fun sqlite3_changes(arg0: CValuesRef<sqlite3>?): Int

@CCall("knifunptr_sqlite320_sqlite3_total_changes")
external fun sqlite3_total_changes(arg0: CValuesRef<sqlite3>?): Int

@CCall("knifunptr_sqlite321_sqlite3_interrupt")
external fun sqlite3_interrupt(arg0: CValuesRef<sqlite3>?): Unit

@CCall("knifunptr_sqlite322_sqlite3_complete")
external fun sqlite3_complete(@CCall.CString sql: String?): Int

@CCall("knifunptr_sqlite323_sqlite3_complete16")
external fun sqlite3_complete16(sql: CValuesRef<*>?): Int

@CCall("knifunptr_sqlite324_sqlite3_busy_handler")
external fun sqlite3_busy_handler(arg0: CValuesRef<sqlite3>?, arg1: CPointer<CFunction<(COpaquePointer?, Int) -> Int>>?, arg2: CValuesRef<*>?): Int

@CCall("knifunptr_sqlite325_sqlite3_busy_timeout")
external fun sqlite3_busy_timeout(arg0: CValuesRef<sqlite3>?, ms: Int): Int

@CCall("knifunptr_sqlite326_sqlite3_get_table")
external fun sqlite3_get_table(db: CValuesRef<sqlite3>?, @CCall.CString zSql: String?, pazResult: CValuesRef<CPointerVar<CPointerVar<ByteVar>>>?, pnRow: CValuesRef<IntVar>?, pnColumn: CValuesRef<IntVar>?, pzErrmsg: CValuesRef<CPointerVar<ByteVar>>?): Int

@CCall("knifunptr_sqlite327_sqlite3_free_table")
external fun sqlite3_free_table(result: CValuesRef<CPointerVar<ByteVar>>?): Unit

@CCall("knifunptr_sqlite328_sqlite3_mprintf")
external fun sqlite3_mprintf(@CCall.CString arg0: String?, vararg variadicArguments: Any?): CPointer<ByteVar>?

@CCall("knifunptr_sqlite329_sqlite3_vmprintf")
external fun sqlite3_vmprintf(@CCall.CString arg0: String?, arg1: va_list?): CPointer<ByteVar>?

@CCall("knifunptr_sqlite330_sqlite3_snprintf")
external fun sqlite3_snprintf(arg0: Int, arg1: CValuesRef<ByteVar>?, @CCall.CString arg2: String?, vararg variadicArguments: Any?): CPointer<ByteVar>?

@CCall("knifunptr_sqlite331_sqlite3_vsnprintf")
external fun sqlite3_vsnprintf(arg0: Int, arg1: CValuesRef<ByteVar>?, @CCall.CString arg2: String?, arg3: va_list?): CPointer<ByteVar>?

@CCall("knifunptr_sqlite332_sqlite3_malloc")
external fun sqlite3_malloc(arg0: Int): COpaquePointer?

@CCall("knifunptr_sqlite333_sqlite3_malloc64")
external fun sqlite3_malloc64(arg0: sqlite3_uint64): COpaquePointer?

@CCall("knifunptr_sqlite334_sqlite3_realloc")
external fun sqlite3_realloc(arg0: CValuesRef<*>?, arg1: Int): COpaquePointer?

@CCall("knifunptr_sqlite335_sqlite3_realloc64")
external fun sqlite3_realloc64(arg0: CValuesRef<*>?, arg1: sqlite3_uint64): COpaquePointer?

@CCall("knifunptr_sqlite336_sqlite3_free")
external fun sqlite3_free(arg0: CValuesRef<*>?): Unit

@CCall("knifunptr_sqlite337_sqlite3_msize")
external fun sqlite3_msize(arg0: CValuesRef<*>?): sqlite3_uint64

@CCall("knifunptr_sqlite338_sqlite3_memory_used")
external fun sqlite3_memory_used(): sqlite3_int64

@CCall("knifunptr_sqlite339_sqlite3_memory_highwater")
external fun sqlite3_memory_highwater(resetFlag: Int): sqlite3_int64

@CCall("knifunptr_sqlite340_sqlite3_randomness")
external fun sqlite3_randomness(N: Int, P: CValuesRef<*>?): Unit

@CCall("knifunptr_sqlite341_sqlite3_set_authorizer")
external fun sqlite3_set_authorizer(arg0: CValuesRef<sqlite3>?, xAuth: CPointer<CFunction<(COpaquePointer?, Int, CPointer<ByteVar>?, CPointer<ByteVar>?, CPointer<ByteVar>?, CPointer<ByteVar>?) -> Int>>?, pUserData: CValuesRef<*>?): Int

@CCall("knifunptr_sqlite342_sqlite3_trace")
external fun sqlite3_trace(arg0: CValuesRef<sqlite3>?, xTrace: CPointer<CFunction<(COpaquePointer?, CPointer<ByteVar>?) -> Unit>>?, arg2: CValuesRef<*>?): COpaquePointer?

@CCall("knifunptr_sqlite343_sqlite3_profile")
external fun sqlite3_profile(arg0: CValuesRef<sqlite3>?, xProfile: CPointer<CFunction<(COpaquePointer?, CPointer<ByteVar>?, sqlite3_uint64) -> Unit>>?, arg2: CValuesRef<*>?): COpaquePointer?

@CCall("knifunptr_sqlite344_sqlite3_trace_v2")
external fun sqlite3_trace_v2(arg0: CValuesRef<sqlite3>?, uMask: UInt, xCallback: CPointer<CFunction<(UInt, COpaquePointer?, COpaquePointer?, COpaquePointer?) -> Int>>?, pCtx: CValuesRef<*>?): Int

@CCall("knifunptr_sqlite345_sqlite3_progress_handler")
external fun sqlite3_progress_handler(arg0: CValuesRef<sqlite3>?, arg1: Int, arg2: CPointer<CFunction<(COpaquePointer?) -> Int>>?, arg3: CValuesRef<*>?): Unit

@CCall("knifunptr_sqlite346_sqlite3_open")
external fun sqlite3_open(@CCall.CString filename: String?, ppDb: CValuesRef<CPointerVar<sqlite3>>?): Int

@CCall("knifunptr_sqlite347_sqlite3_open16")
external fun sqlite3_open16(filename: CValuesRef<*>?, ppDb: CValuesRef<CPointerVar<sqlite3>>?): Int

@CCall("knifunptr_sqlite348_sqlite3_open_v2")
external fun sqlite3_open_v2(@CCall.CString filename: String?, ppDb: CValuesRef<CPointerVar<sqlite3>>?, flags: Int, @CCall.CString zVfs: String?): Int

@CCall("knifunptr_sqlite349_sqlite3_uri_parameter")
external fun sqlite3_uri_parameter(@CCall.CString zFilename: String?, @CCall.CString zParam: String?): CPointer<ByteVar>?

@CCall("knifunptr_sqlite350_sqlite3_uri_boolean")
external fun sqlite3_uri_boolean(@CCall.CString zFile: String?, @CCall.CString zParam: String?, bDefault: Int): Int

@CCall("knifunptr_sqlite351_sqlite3_uri_int64")
external fun sqlite3_uri_int64(@CCall.CString arg0: String?, @CCall.CString arg1: String?, arg2: sqlite3_int64): sqlite3_int64

@CCall("knifunptr_sqlite352_sqlite3_errcode")
external fun sqlite3_errcode(db: CValuesRef<sqlite3>?): Int

@CCall("knifunptr_sqlite353_sqlite3_extended_errcode")
external fun sqlite3_extended_errcode(db: CValuesRef<sqlite3>?): Int

@CCall("knifunptr_sqlite354_sqlite3_errmsg")
external fun sqlite3_errmsg(arg0: CValuesRef<sqlite3>?): CPointer<ByteVar>?

@CCall("knifunptr_sqlite355_sqlite3_errmsg16")
external fun sqlite3_errmsg16(arg0: CValuesRef<sqlite3>?): COpaquePointer?

@CCall("knifunptr_sqlite356_sqlite3_errstr")
external fun sqlite3_errstr(arg0: Int): CPointer<ByteVar>?

@CCall("knifunptr_sqlite357_sqlite3_limit")
external fun sqlite3_limit(arg0: CValuesRef<sqlite3>?, id: Int, newVal: Int): Int

@CCall("knifunptr_sqlite358_sqlite3_prepare")
external fun sqlite3_prepare(db: CValuesRef<sqlite3>?, @CCall.CString zSql: String?, nByte: Int, ppStmt: CValuesRef<CPointerVar<sqlite3_stmt>>?, pzTail: CValuesRef<CPointerVar<ByteVar>>?): Int

@CCall("knifunptr_sqlite359_sqlite3_prepare_v2")
external fun sqlite3_prepare_v2(db: CValuesRef<sqlite3>?, @CCall.CString zSql: String?, nByte: Int, ppStmt: CValuesRef<CPointerVar<sqlite3_stmt>>?, pzTail: CValuesRef<CPointerVar<ByteVar>>?): Int

@CCall("knifunptr_sqlite360_sqlite3_prepare_v3")
external fun sqlite3_prepare_v3(db: CValuesRef<sqlite3>?, @CCall.CString zSql: String?, nByte: Int, prepFlags: UInt, ppStmt: CValuesRef<CPointerVar<sqlite3_stmt>>?, pzTail: CValuesRef<CPointerVar<ByteVar>>?): Int

@CCall("knifunptr_sqlite361_sqlite3_prepare16")
external fun sqlite3_prepare16(db: CValuesRef<sqlite3>?, zSql: CValuesRef<*>?, nByte: Int, ppStmt: CValuesRef<CPointerVar<sqlite3_stmt>>?, pzTail: CValuesRef<COpaquePointerVar>?): Int

@CCall("knifunptr_sqlite362_sqlite3_prepare16_v2")
external fun sqlite3_prepare16_v2(db: CValuesRef<sqlite3>?, zSql: CValuesRef<*>?, nByte: Int, ppStmt: CValuesRef<CPointerVar<sqlite3_stmt>>?, pzTail: CValuesRef<COpaquePointerVar>?): Int

@CCall("knifunptr_sqlite363_sqlite3_prepare16_v3")
external fun sqlite3_prepare16_v3(db: CValuesRef<sqlite3>?, zSql: CValuesRef<*>?, nByte: Int, prepFlags: UInt, ppStmt: CValuesRef<CPointerVar<sqlite3_stmt>>?, pzTail: CValuesRef<COpaquePointerVar>?): Int

@CCall("knifunptr_sqlite364_sqlite3_sql")
external fun sqlite3_sql(pStmt: CValuesRef<sqlite3_stmt>?): CPointer<ByteVar>?

@CCall("knifunptr_sqlite365_sqlite3_expanded_sql")
external fun sqlite3_expanded_sql(pStmt: CValuesRef<sqlite3_stmt>?): CPointer<ByteVar>?

@CCall("knifunptr_sqlite366_sqlite3_normalized_sql")
external fun sqlite3_normalized_sql(pStmt: CValuesRef<sqlite3_stmt>?): CPointer<ByteVar>?

@CCall("knifunptr_sqlite367_sqlite3_stmt_readonly")
external fun sqlite3_stmt_readonly(pStmt: CValuesRef<sqlite3_stmt>?): Int

@CCall("knifunptr_sqlite368_sqlite3_stmt_busy")
external fun sqlite3_stmt_busy(arg0: CValuesRef<sqlite3_stmt>?): Int

@CCall("knifunptr_sqlite369_sqlite3_bind_blob")
external fun sqlite3_bind_blob(arg0: CValuesRef<sqlite3_stmt>?, arg1: Int, arg2: CValuesRef<*>?, n: Int, arg4: CPointer<CFunction<(COpaquePointer?) -> Unit>>?): Int

@CCall("knifunptr_sqlite370_sqlite3_bind_blob64")
external fun sqlite3_bind_blob64(arg0: CValuesRef<sqlite3_stmt>?, arg1: Int, arg2: CValuesRef<*>?, arg3: sqlite3_uint64, arg4: CPointer<CFunction<(COpaquePointer?) -> Unit>>?): Int

@CCall("knifunptr_sqlite371_sqlite3_bind_double")
external fun sqlite3_bind_double(arg0: CValuesRef<sqlite3_stmt>?, arg1: Int, arg2: Double): Int

@CCall("knifunptr_sqlite372_sqlite3_bind_int")
external fun sqlite3_bind_int(arg0: CValuesRef<sqlite3_stmt>?, arg1: Int, arg2: Int): Int

@CCall("knifunptr_sqlite373_sqlite3_bind_int64")
external fun sqlite3_bind_int64(arg0: CValuesRef<sqlite3_stmt>?, arg1: Int, arg2: sqlite3_int64): Int

@CCall("knifunptr_sqlite374_sqlite3_bind_null")
external fun sqlite3_bind_null(arg0: CValuesRef<sqlite3_stmt>?, arg1: Int): Int

@CCall("knifunptr_sqlite375_sqlite3_bind_text")
external fun sqlite3_bind_text(arg0: CValuesRef<sqlite3_stmt>?, arg1: Int, @CCall.CString arg2: String?, arg3: Int, arg4: CPointer<CFunction<(COpaquePointer?) -> Unit>>?): Int

@CCall("knifunptr_sqlite376_sqlite3_bind_text16")
external fun sqlite3_bind_text16(arg0: CValuesRef<sqlite3_stmt>?, arg1: Int, arg2: CValuesRef<*>?, arg3: Int, arg4: CPointer<CFunction<(COpaquePointer?) -> Unit>>?): Int

@CCall("knifunptr_sqlite377_sqlite3_bind_text64")
external fun sqlite3_bind_text64(arg0: CValuesRef<sqlite3_stmt>?, arg1: Int, @CCall.CString arg2: String?, arg3: sqlite3_uint64, arg4: CPointer<CFunction<(COpaquePointer?) -> Unit>>?, encoding: UByte): Int

@CCall("knifunptr_sqlite378_sqlite3_bind_value")
external fun sqlite3_bind_value(arg0: CValuesRef<sqlite3_stmt>?, arg1: Int, arg2: CValuesRef<sqlite3_value>?): Int

@CCall("knifunptr_sqlite379_sqlite3_bind_pointer")
external fun sqlite3_bind_pointer(arg0: CValuesRef<sqlite3_stmt>?, arg1: Int, arg2: CValuesRef<*>?, @CCall.CString arg3: String?, arg4: CPointer<CFunction<(COpaquePointer?) -> Unit>>?): Int

@CCall("knifunptr_sqlite380_sqlite3_bind_zeroblob")
external fun sqlite3_bind_zeroblob(arg0: CValuesRef<sqlite3_stmt>?, arg1: Int, n: Int): Int

@CCall("knifunptr_sqlite381_sqlite3_bind_zeroblob64")
external fun sqlite3_bind_zeroblob64(arg0: CValuesRef<sqlite3_stmt>?, arg1: Int, arg2: sqlite3_uint64): Int

@CCall("knifunptr_sqlite382_sqlite3_bind_parameter_count")
external fun sqlite3_bind_parameter_count(arg0: CValuesRef<sqlite3_stmt>?): Int

@CCall("knifunptr_sqlite383_sqlite3_bind_parameter_name")
external fun sqlite3_bind_parameter_name(arg0: CValuesRef<sqlite3_stmt>?, arg1: Int): CPointer<ByteVar>?

@CCall("knifunptr_sqlite384_sqlite3_bind_parameter_index")
external fun sqlite3_bind_parameter_index(arg0: CValuesRef<sqlite3_stmt>?, @CCall.CString zName: String?): Int

@CCall("knifunptr_sqlite385_sqlite3_clear_bindings")
external fun sqlite3_clear_bindings(arg0: CValuesRef<sqlite3_stmt>?): Int

@CCall("knifunptr_sqlite386_sqlite3_column_count")
external fun sqlite3_column_count(pStmt: CValuesRef<sqlite3_stmt>?): Int

@CCall("knifunptr_sqlite387_sqlite3_column_name")
external fun sqlite3_column_name(arg0: CValuesRef<sqlite3_stmt>?, N: Int): CPointer<ByteVar>?

@CCall("knifunptr_sqlite388_sqlite3_column_name16")
external fun sqlite3_column_name16(arg0: CValuesRef<sqlite3_stmt>?, N: Int): COpaquePointer?

@Deprecated("Unable to import this declaration", level = DeprecationLevel.ERROR)
fun sqlite3_column_database_name(arg0: CValuesRef<sqlite3_stmt>?, arg1: Int): CPointer<ByteVar>? = throw UnsupportedOperationException()

@Deprecated("Unable to import this declaration", level = DeprecationLevel.ERROR)
fun sqlite3_column_database_name16(arg0: CValuesRef<sqlite3_stmt>?, arg1: Int): COpaquePointer? = throw UnsupportedOperationException()

@Deprecated("Unable to import this declaration", level = DeprecationLevel.ERROR)
fun sqlite3_column_table_name(arg0: CValuesRef<sqlite3_stmt>?, arg1: Int): CPointer<ByteVar>? = throw UnsupportedOperationException()

@Deprecated("Unable to import this declaration", level = DeprecationLevel.ERROR)
fun sqlite3_column_table_name16(arg0: CValuesRef<sqlite3_stmt>?, arg1: Int): COpaquePointer? = throw UnsupportedOperationException()

@Deprecated("Unable to import this declaration", level = DeprecationLevel.ERROR)
fun sqlite3_column_origin_name(arg0: CValuesRef<sqlite3_stmt>?, arg1: Int): CPointer<ByteVar>? = throw UnsupportedOperationException()

@Deprecated("Unable to import this declaration", level = DeprecationLevel.ERROR)
fun sqlite3_column_origin_name16(arg0: CValuesRef<sqlite3_stmt>?, arg1: Int): COpaquePointer? = throw UnsupportedOperationException()

@CCall("knifunptr_sqlite395_sqlite3_column_decltype")
external fun sqlite3_column_decltype(arg0: CValuesRef<sqlite3_stmt>?, arg1: Int): CPointer<ByteVar>?

@CCall("knifunptr_sqlite396_sqlite3_column_decltype16")
external fun sqlite3_column_decltype16(arg0: CValuesRef<sqlite3_stmt>?, arg1: Int): COpaquePointer?

@CCall("knifunptr_sqlite397_sqlite3_step")
external fun sqlite3_step(arg0: CValuesRef<sqlite3_stmt>?): Int

@CCall("knifunptr_sqlite398_sqlite3_data_count")
external fun sqlite3_data_count(pStmt: CValuesRef<sqlite3_stmt>?): Int

@CCall("knifunptr_sqlite399_sqlite3_column_blob")
external fun sqlite3_column_blob(arg0: CValuesRef<sqlite3_stmt>?, iCol: Int): COpaquePointer?

@CCall("knifunptr_sqlite3100_sqlite3_column_double")
external fun sqlite3_column_double(arg0: CValuesRef<sqlite3_stmt>?, iCol: Int): Double

@CCall("knifunptr_sqlite3101_sqlite3_column_int")
external fun sqlite3_column_int(arg0: CValuesRef<sqlite3_stmt>?, iCol: Int): Int

@CCall("knifunptr_sqlite3102_sqlite3_column_int64")
external fun sqlite3_column_int64(arg0: CValuesRef<sqlite3_stmt>?, iCol: Int): sqlite3_int64

@CCall("knifunptr_sqlite3103_sqlite3_column_text")
external fun sqlite3_column_text(arg0: CValuesRef<sqlite3_stmt>?, iCol: Int): CPointer<UByteVar>?

@CCall("knifunptr_sqlite3104_sqlite3_column_text16")
external fun sqlite3_column_text16(arg0: CValuesRef<sqlite3_stmt>?, iCol: Int): COpaquePointer?

@CCall("knifunptr_sqlite3105_sqlite3_column_value")
external fun sqlite3_column_value(arg0: CValuesRef<sqlite3_stmt>?, iCol: Int): CPointer<sqlite3_value>?

@CCall("knifunptr_sqlite3106_sqlite3_column_bytes")
external fun sqlite3_column_bytes(arg0: CValuesRef<sqlite3_stmt>?, iCol: Int): Int

@CCall("knifunptr_sqlite3107_sqlite3_column_bytes16")
external fun sqlite3_column_bytes16(arg0: CValuesRef<sqlite3_stmt>?, iCol: Int): Int

@CCall("knifunptr_sqlite3108_sqlite3_column_type")
external fun sqlite3_column_type(arg0: CValuesRef<sqlite3_stmt>?, iCol: Int): Int

@CCall("knifunptr_sqlite3109_sqlite3_finalize")
external fun sqlite3_finalize(pStmt: CValuesRef<sqlite3_stmt>?): Int

@CCall("knifunptr_sqlite3110_sqlite3_reset")
external fun sqlite3_reset(pStmt: CValuesRef<sqlite3_stmt>?): Int

@CCall("knifunptr_sqlite3111_sqlite3_create_function")
external fun sqlite3_create_function(db: CValuesRef<sqlite3>?, @CCall.CString zFunctionName: String?, nArg: Int, eTextRep: Int, pApp: CValuesRef<*>?, xFunc: CPointer<CFunction<(CPointer<sqlite3_context>?, Int, CPointer<CPointerVar<sqlite3_value>>?) -> Unit>>?, xStep: CPointer<CFunction<(CPointer<sqlite3_context>?, Int, CPointer<CPointerVar<sqlite3_value>>?) -> Unit>>?, xFinal: CPointer<CFunction<(CPointer<sqlite3_context>?) -> Unit>>?): Int

@CCall("knifunptr_sqlite3112_sqlite3_create_function16")
external fun sqlite3_create_function16(db: CValuesRef<sqlite3>?, zFunctionName: CValuesRef<*>?, nArg: Int, eTextRep: Int, pApp: CValuesRef<*>?, xFunc: CPointer<CFunction<(CPointer<sqlite3_context>?, Int, CPointer<CPointerVar<sqlite3_value>>?) -> Unit>>?, xStep: CPointer<CFunction<(CPointer<sqlite3_context>?, Int, CPointer<CPointerVar<sqlite3_value>>?) -> Unit>>?, xFinal: CPointer<CFunction<(CPointer<sqlite3_context>?) -> Unit>>?): Int

@CCall("knifunptr_sqlite3113_sqlite3_create_function_v2")
external fun sqlite3_create_function_v2(db: CValuesRef<sqlite3>?, @CCall.CString zFunctionName: String?, nArg: Int, eTextRep: Int, pApp: CValuesRef<*>?, xFunc: CPointer<CFunction<(CPointer<sqlite3_context>?, Int, CPointer<CPointerVar<sqlite3_value>>?) -> Unit>>?, xStep: CPointer<CFunction<(CPointer<sqlite3_context>?, Int, CPointer<CPointerVar<sqlite3_value>>?) -> Unit>>?, xFinal: CPointer<CFunction<(CPointer<sqlite3_context>?) -> Unit>>?, xDestroy: CPointer<CFunction<(COpaquePointer?) -> Unit>>?): Int

@CCall("knifunptr_sqlite3114_sqlite3_create_window_function")
external fun sqlite3_create_window_function(db: CValuesRef<sqlite3>?, @CCall.CString zFunctionName: String?, nArg: Int, eTextRep: Int, pApp: CValuesRef<*>?, xStep: CPointer<CFunction<(CPointer<sqlite3_context>?, Int, CPointer<CPointerVar<sqlite3_value>>?) -> Unit>>?, xFinal: CPointer<CFunction<(CPointer<sqlite3_context>?) -> Unit>>?, xValue: CPointer<CFunction<(CPointer<sqlite3_context>?) -> Unit>>?, xInverse: CPointer<CFunction<(CPointer<sqlite3_context>?, Int, CPointer<CPointerVar<sqlite3_value>>?) -> Unit>>?, xDestroy: CPointer<CFunction<(COpaquePointer?) -> Unit>>?): Int

@CCall("knifunptr_sqlite3115_sqlite3_aggregate_count")
external fun sqlite3_aggregate_count(arg0: CValuesRef<sqlite3_context>?): Int

@CCall("knifunptr_sqlite3116_sqlite3_expired")
external fun sqlite3_expired(arg0: CValuesRef<sqlite3_stmt>?): Int

@CCall("knifunptr_sqlite3117_sqlite3_transfer_bindings")
external fun sqlite3_transfer_bindings(arg0: CValuesRef<sqlite3_stmt>?, arg1: CValuesRef<sqlite3_stmt>?): Int

@CCall("knifunptr_sqlite3118_sqlite3_global_recover")
external fun sqlite3_global_recover(): Int

@CCall("knifunptr_sqlite3119_sqlite3_thread_cleanup")
external fun sqlite3_thread_cleanup(): Unit

@CCall("knifunptr_sqlite3120_sqlite3_memory_alarm")
external fun sqlite3_memory_alarm(arg0: CPointer<CFunction<(COpaquePointer?, sqlite3_int64, Int) -> Unit>>?, arg1: CValuesRef<*>?, arg2: sqlite3_int64): Int

@CCall("knifunptr_sqlite3121_sqlite3_value_blob")
external fun sqlite3_value_blob(arg0: CValuesRef<sqlite3_value>?): COpaquePointer?

@CCall("knifunptr_sqlite3122_sqlite3_value_double")
external fun sqlite3_value_double(arg0: CValuesRef<sqlite3_value>?): Double

@CCall("knifunptr_sqlite3123_sqlite3_value_int")
external fun sqlite3_value_int(arg0: CValuesRef<sqlite3_value>?): Int

@CCall("knifunptr_sqlite3124_sqlite3_value_int64")
external fun sqlite3_value_int64(arg0: CValuesRef<sqlite3_value>?): sqlite3_int64

@CCall("knifunptr_sqlite3125_sqlite3_value_pointer")
external fun sqlite3_value_pointer(arg0: CValuesRef<sqlite3_value>?, @CCall.CString arg1: String?): COpaquePointer?

@CCall("knifunptr_sqlite3126_sqlite3_value_text")
external fun sqlite3_value_text(arg0: CValuesRef<sqlite3_value>?): CPointer<UByteVar>?

@CCall("knifunptr_sqlite3127_sqlite3_value_text16")
external fun sqlite3_value_text16(arg0: CValuesRef<sqlite3_value>?): COpaquePointer?

@CCall("knifunptr_sqlite3128_sqlite3_value_text16le")
external fun sqlite3_value_text16le(arg0: CValuesRef<sqlite3_value>?): COpaquePointer?

@CCall("knifunptr_sqlite3129_sqlite3_value_text16be")
external fun sqlite3_value_text16be(arg0: CValuesRef<sqlite3_value>?): COpaquePointer?

@CCall("knifunptr_sqlite3130_sqlite3_value_bytes")
external fun sqlite3_value_bytes(arg0: CValuesRef<sqlite3_value>?): Int

@CCall("knifunptr_sqlite3131_sqlite3_value_bytes16")
external fun sqlite3_value_bytes16(arg0: CValuesRef<sqlite3_value>?): Int

@CCall("knifunptr_sqlite3132_sqlite3_value_type")
external fun sqlite3_value_type(arg0: CValuesRef<sqlite3_value>?): Int

@CCall("knifunptr_sqlite3133_sqlite3_value_numeric_type")
external fun sqlite3_value_numeric_type(arg0: CValuesRef<sqlite3_value>?): Int

@CCall("knifunptr_sqlite3134_sqlite3_value_nochange")
external fun sqlite3_value_nochange(arg0: CValuesRef<sqlite3_value>?): Int

@CCall("knifunptr_sqlite3135_sqlite3_value_subtype")
external fun sqlite3_value_subtype(arg0: CValuesRef<sqlite3_value>?): UInt

@CCall("knifunptr_sqlite3136_sqlite3_value_dup")
external fun sqlite3_value_dup(arg0: CValuesRef<sqlite3_value>?): CPointer<sqlite3_value>?

@CCall("knifunptr_sqlite3137_sqlite3_value_free")
external fun sqlite3_value_free(arg0: CValuesRef<sqlite3_value>?): Unit

@CCall("knifunptr_sqlite3138_sqlite3_aggregate_context")
external fun sqlite3_aggregate_context(arg0: CValuesRef<sqlite3_context>?, nBytes: Int): COpaquePointer?

@CCall("knifunptr_sqlite3139_sqlite3_user_data")
external fun sqlite3_user_data(arg0: CValuesRef<sqlite3_context>?): COpaquePointer?

@CCall("knifunptr_sqlite3140_sqlite3_context_db_handle")
external fun sqlite3_context_db_handle(arg0: CValuesRef<sqlite3_context>?): CPointer<sqlite3>?

@CCall("knifunptr_sqlite3141_sqlite3_get_auxdata")
external fun sqlite3_get_auxdata(arg0: CValuesRef<sqlite3_context>?, N: Int): COpaquePointer?

@CCall("knifunptr_sqlite3142_sqlite3_set_auxdata")
external fun sqlite3_set_auxdata(arg0: CValuesRef<sqlite3_context>?, N: Int, arg2: CValuesRef<*>?, arg3: CPointer<CFunction<(COpaquePointer?) -> Unit>>?): Unit

@CCall("knifunptr_sqlite3143_sqlite3_result_blob")
external fun sqlite3_result_blob(arg0: CValuesRef<sqlite3_context>?, arg1: CValuesRef<*>?, arg2: Int, arg3: CPointer<CFunction<(COpaquePointer?) -> Unit>>?): Unit

@CCall("knifunptr_sqlite3144_sqlite3_result_blob64")
external fun sqlite3_result_blob64(arg0: CValuesRef<sqlite3_context>?, arg1: CValuesRef<*>?, arg2: sqlite3_uint64, arg3: CPointer<CFunction<(COpaquePointer?) -> Unit>>?): Unit

@CCall("knifunptr_sqlite3145_sqlite3_result_double")
external fun sqlite3_result_double(arg0: CValuesRef<sqlite3_context>?, arg1: Double): Unit

@CCall("knifunptr_sqlite3146_sqlite3_result_error")
external fun sqlite3_result_error(arg0: CValuesRef<sqlite3_context>?, @CCall.CString arg1: String?, arg2: Int): Unit

@CCall("knifunptr_sqlite3147_sqlite3_result_error16")
external fun sqlite3_result_error16(arg0: CValuesRef<sqlite3_context>?, arg1: CValuesRef<*>?, arg2: Int): Unit

@CCall("knifunptr_sqlite3148_sqlite3_result_error_toobig")
external fun sqlite3_result_error_toobig(arg0: CValuesRef<sqlite3_context>?): Unit

@CCall("knifunptr_sqlite3149_sqlite3_result_error_nomem")
external fun sqlite3_result_error_nomem(arg0: CValuesRef<sqlite3_context>?): Unit

@CCall("knifunptr_sqlite3150_sqlite3_result_error_code")
external fun sqlite3_result_error_code(arg0: CValuesRef<sqlite3_context>?, arg1: Int): Unit

@CCall("knifunptr_sqlite3151_sqlite3_result_int")
external fun sqlite3_result_int(arg0: CValuesRef<sqlite3_context>?, arg1: Int): Unit

@CCall("knifunptr_sqlite3152_sqlite3_result_int64")
external fun sqlite3_result_int64(arg0: CValuesRef<sqlite3_context>?, arg1: sqlite3_int64): Unit

@CCall("knifunptr_sqlite3153_sqlite3_result_null")
external fun sqlite3_result_null(arg0: CValuesRef<sqlite3_context>?): Unit

@CCall("knifunptr_sqlite3154_sqlite3_result_text")
external fun sqlite3_result_text(arg0: CValuesRef<sqlite3_context>?, @CCall.CString arg1: String?, arg2: Int, arg3: CPointer<CFunction<(COpaquePointer?) -> Unit>>?): Unit

@CCall("knifunptr_sqlite3155_sqlite3_result_text64")
external fun sqlite3_result_text64(arg0: CValuesRef<sqlite3_context>?, @CCall.CString arg1: String?, arg2: sqlite3_uint64, arg3: CPointer<CFunction<(COpaquePointer?) -> Unit>>?, encoding: UByte): Unit

@CCall("knifunptr_sqlite3156_sqlite3_result_text16")
external fun sqlite3_result_text16(arg0: CValuesRef<sqlite3_context>?, arg1: CValuesRef<*>?, arg2: Int, arg3: CPointer<CFunction<(COpaquePointer?) -> Unit>>?): Unit

@CCall("knifunptr_sqlite3157_sqlite3_result_text16le")
external fun sqlite3_result_text16le(arg0: CValuesRef<sqlite3_context>?, arg1: CValuesRef<*>?, arg2: Int, arg3: CPointer<CFunction<(COpaquePointer?) -> Unit>>?): Unit

@CCall("knifunptr_sqlite3158_sqlite3_result_text16be")
external fun sqlite3_result_text16be(arg0: CValuesRef<sqlite3_context>?, arg1: CValuesRef<*>?, arg2: Int, arg3: CPointer<CFunction<(COpaquePointer?) -> Unit>>?): Unit

@CCall("knifunptr_sqlite3159_sqlite3_result_value")
external fun sqlite3_result_value(arg0: CValuesRef<sqlite3_context>?, arg1: CValuesRef<sqlite3_value>?): Unit

@CCall("knifunptr_sqlite3160_sqlite3_result_pointer")
external fun sqlite3_result_pointer(arg0: CValuesRef<sqlite3_context>?, arg1: CValuesRef<*>?, @CCall.CString arg2: String?, arg3: CPointer<CFunction<(COpaquePointer?) -> Unit>>?): Unit

@CCall("knifunptr_sqlite3161_sqlite3_result_zeroblob")
external fun sqlite3_result_zeroblob(arg0: CValuesRef<sqlite3_context>?, n: Int): Unit

@CCall("knifunptr_sqlite3162_sqlite3_result_zeroblob64")
external fun sqlite3_result_zeroblob64(arg0: CValuesRef<sqlite3_context>?, n: sqlite3_uint64): Int

@CCall("knifunptr_sqlite3163_sqlite3_result_subtype")
external fun sqlite3_result_subtype(arg0: CValuesRef<sqlite3_context>?, arg1: UInt): Unit

@CCall("knifunptr_sqlite3164_sqlite3_create_collation")
external fun sqlite3_create_collation(arg0: CValuesRef<sqlite3>?, @CCall.CString zName: String?, eTextRep: Int, pArg: CValuesRef<*>?, xCompare: CPointer<CFunction<(COpaquePointer?, Int, COpaquePointer?, Int, COpaquePointer?) -> Int>>?): Int

@CCall("knifunptr_sqlite3165_sqlite3_create_collation_v2")
external fun sqlite3_create_collation_v2(arg0: CValuesRef<sqlite3>?, @CCall.CString zName: String?, eTextRep: Int, pArg: CValuesRef<*>?, xCompare: CPointer<CFunction<(COpaquePointer?, Int, COpaquePointer?, Int, COpaquePointer?) -> Int>>?, xDestroy: CPointer<CFunction<(COpaquePointer?) -> Unit>>?): Int

@CCall("knifunptr_sqlite3166_sqlite3_create_collation16")
external fun sqlite3_create_collation16(arg0: CValuesRef<sqlite3>?, zName: CValuesRef<*>?, eTextRep: Int, pArg: CValuesRef<*>?, xCompare: CPointer<CFunction<(COpaquePointer?, Int, COpaquePointer?, Int, COpaquePointer?) -> Int>>?): Int

@CCall("knifunptr_sqlite3167_sqlite3_collation_needed")
external fun sqlite3_collation_needed(arg0: CValuesRef<sqlite3>?, arg1: CValuesRef<*>?, arg2: CPointer<CFunction<(COpaquePointer?, CPointer<sqlite3>?, Int, CPointer<ByteVar>?) -> Unit>>?): Int

@CCall("knifunptr_sqlite3168_sqlite3_collation_needed16")
external fun sqlite3_collation_needed16(arg0: CValuesRef<sqlite3>?, arg1: CValuesRef<*>?, arg2: CPointer<CFunction<(COpaquePointer?, CPointer<sqlite3>?, Int, COpaquePointer?) -> Unit>>?): Int

@CCall("knifunptr_sqlite3169_sqlite3_sleep")
external fun sqlite3_sleep(arg0: Int): Int

@CCall("knifunptr_sqlite3170_sqlite3_win32_set_directory")
external fun sqlite3_win32_set_directory(type: UInt, zValue: CValuesRef<*>?): Int

@CCall("knifunptr_sqlite3171_sqlite3_win32_set_directory8")
external fun sqlite3_win32_set_directory8(type: UInt, @CCall.CString zValue: String?): Int

@CCall("knifunptr_sqlite3172_sqlite3_win32_set_directory16")
external fun sqlite3_win32_set_directory16(type: UInt, zValue: CValuesRef<*>?): Int

@CCall("knifunptr_sqlite3173_sqlite3_get_autocommit")
external fun sqlite3_get_autocommit(arg0: CValuesRef<sqlite3>?): Int

@CCall("knifunptr_sqlite3174_sqlite3_db_handle")
external fun sqlite3_db_handle(arg0: CValuesRef<sqlite3_stmt>?): CPointer<sqlite3>?

@CCall("knifunptr_sqlite3175_sqlite3_db_filename")
external fun sqlite3_db_filename(db: CValuesRef<sqlite3>?, @CCall.CString zDbName: String?): CPointer<ByteVar>?

@CCall("knifunptr_sqlite3176_sqlite3_db_readonly")
external fun sqlite3_db_readonly(db: CValuesRef<sqlite3>?, @CCall.CString zDbName: String?): Int

@CCall("knifunptr_sqlite3177_sqlite3_next_stmt")
external fun sqlite3_next_stmt(pDb: CValuesRef<sqlite3>?, pStmt: CValuesRef<sqlite3_stmt>?): CPointer<sqlite3_stmt>?

@CCall("knifunptr_sqlite3178_sqlite3_commit_hook")
external fun sqlite3_commit_hook(arg0: CValuesRef<sqlite3>?, arg1: CPointer<CFunction<(COpaquePointer?) -> Int>>?, arg2: CValuesRef<*>?): COpaquePointer?

@CCall("knifunptr_sqlite3179_sqlite3_rollback_hook")
external fun sqlite3_rollback_hook(arg0: CValuesRef<sqlite3>?, arg1: CPointer<CFunction<(COpaquePointer?) -> Unit>>?, arg2: CValuesRef<*>?): COpaquePointer?

@CCall("knifunptr_sqlite3180_sqlite3_update_hook")
external fun sqlite3_update_hook(arg0: CValuesRef<sqlite3>?, arg1: CPointer<CFunction<(COpaquePointer?, Int, CPointer<ByteVar>?, CPointer<ByteVar>?, sqlite3_int64) -> Unit>>?, arg2: CValuesRef<*>?): COpaquePointer?

@CCall("knifunptr_sqlite3181_sqlite3_enable_shared_cache")
external fun sqlite3_enable_shared_cache(arg0: Int): Int

@CCall("knifunptr_sqlite3182_sqlite3_release_memory")
external fun sqlite3_release_memory(arg0: Int): Int

@CCall("knifunptr_sqlite3183_sqlite3_db_release_memory")
external fun sqlite3_db_release_memory(arg0: CValuesRef<sqlite3>?): Int

@CCall("knifunptr_sqlite3184_sqlite3_soft_heap_limit64")
external fun sqlite3_soft_heap_limit64(N: sqlite3_int64): sqlite3_int64

@CCall("knifunptr_sqlite3185_sqlite3_soft_heap_limit")
external fun sqlite3_soft_heap_limit(N: Int): Unit

@CCall("knifunptr_sqlite3186_sqlite3_table_column_metadata")
external fun sqlite3_table_column_metadata(db: CValuesRef<sqlite3>?, @CCall.CString zDbName: String?, @CCall.CString zTableName: String?, @CCall.CString zColumnName: String?, pzDataType: CValuesRef<CPointerVar<ByteVar>>?, pzCollSeq: CValuesRef<CPointerVar<ByteVar>>?, pNotNull: CValuesRef<IntVar>?, pPrimaryKey: CValuesRef<IntVar>?, pAutoinc: CValuesRef<IntVar>?): Int

@CCall("knifunptr_sqlite3187_sqlite3_load_extension")
external fun sqlite3_load_extension(db: CValuesRef<sqlite3>?, @CCall.CString zFile: String?, @CCall.CString zProc: String?, pzErrMsg: CValuesRef<CPointerVar<ByteVar>>?): Int

@CCall("knifunptr_sqlite3188_sqlite3_enable_load_extension")
external fun sqlite3_enable_load_extension(db: CValuesRef<sqlite3>?, onoff: Int): Int

@CCall("knifunptr_sqlite3189_sqlite3_auto_extension")
external fun sqlite3_auto_extension(xEntryPoint: CPointer<CFunction<() -> Unit>>?): Int

@CCall("knifunptr_sqlite3190_sqlite3_cancel_auto_extension")
external fun sqlite3_cancel_auto_extension(xEntryPoint: CPointer<CFunction<() -> Unit>>?): Int

@CCall("knifunptr_sqlite3191_sqlite3_reset_auto_extension")
external fun sqlite3_reset_auto_extension(): Unit

@CCall("knifunptr_sqlite3192_sqlite3_create_module")
external fun sqlite3_create_module(db: CValuesRef<sqlite3>?, @CCall.CString zName: String?, p: CValuesRef<sqlite3_module>?, pClientData: CValuesRef<*>?): Int

@CCall("knifunptr_sqlite3193_sqlite3_create_module_v2")
external fun sqlite3_create_module_v2(db: CValuesRef<sqlite3>?, @CCall.CString zName: String?, p: CValuesRef<sqlite3_module>?, pClientData: CValuesRef<*>?, xDestroy: CPointer<CFunction<(COpaquePointer?) -> Unit>>?): Int

@CCall("knifunptr_sqlite3194_sqlite3_declare_vtab")
external fun sqlite3_declare_vtab(arg0: CValuesRef<sqlite3>?, @CCall.CString zSQL: String?): Int

@CCall("knifunptr_sqlite3195_sqlite3_overload_function")
external fun sqlite3_overload_function(arg0: CValuesRef<sqlite3>?, @CCall.CString zFuncName: String?, nArg: Int): Int

@CCall("knifunptr_sqlite3196_sqlite3_blob_open")
external fun sqlite3_blob_open(arg0: CValuesRef<sqlite3>?, @CCall.CString zDb: String?, @CCall.CString zTable: String?, @CCall.CString zColumn: String?, iRow: sqlite3_int64, flags: Int, ppBlob: CValuesRef<CPointerVar<sqlite3_blob>>?): Int

@CCall("knifunptr_sqlite3197_sqlite3_blob_reopen")
external fun sqlite3_blob_reopen(arg0: CValuesRef<sqlite3_blob>?, arg1: sqlite3_int64): Int

@CCall("knifunptr_sqlite3198_sqlite3_blob_close")
external fun sqlite3_blob_close(arg0: CValuesRef<sqlite3_blob>?): Int

@CCall("knifunptr_sqlite3199_sqlite3_blob_bytes")
external fun sqlite3_blob_bytes(arg0: CValuesRef<sqlite3_blob>?): Int

@CCall("knifunptr_sqlite3200_sqlite3_blob_read")
external fun sqlite3_blob_read(arg0: CValuesRef<sqlite3_blob>?, Z: CValuesRef<*>?, N: Int, iOffset: Int): Int

@CCall("knifunptr_sqlite3201_sqlite3_blob_write")
external fun sqlite3_blob_write(arg0: CValuesRef<sqlite3_blob>?, z: CValuesRef<*>?, n: Int, iOffset: Int): Int

@CCall("knifunptr_sqlite3202_sqlite3_vfs_find")
external fun sqlite3_vfs_find(@CCall.CString zVfsName: String?): CPointer<sqlite3_vfs>?

@CCall("knifunptr_sqlite3203_sqlite3_vfs_register")
external fun sqlite3_vfs_register(arg0: CValuesRef<sqlite3_vfs>?, makeDflt: Int): Int

@CCall("knifunptr_sqlite3204_sqlite3_vfs_unregister")
external fun sqlite3_vfs_unregister(arg0: CValuesRef<sqlite3_vfs>?): Int

@CCall("knifunptr_sqlite3205_sqlite3_mutex_alloc")
external fun sqlite3_mutex_alloc(arg0: Int): CPointer<sqlite3_mutex>?

@CCall("knifunptr_sqlite3206_sqlite3_mutex_free")
external fun sqlite3_mutex_free(arg0: CValuesRef<sqlite3_mutex>?): Unit

@CCall("knifunptr_sqlite3207_sqlite3_mutex_enter")
external fun sqlite3_mutex_enter(arg0: CValuesRef<sqlite3_mutex>?): Unit

@CCall("knifunptr_sqlite3208_sqlite3_mutex_try")
external fun sqlite3_mutex_try(arg0: CValuesRef<sqlite3_mutex>?): Int

@CCall("knifunptr_sqlite3209_sqlite3_mutex_leave")
external fun sqlite3_mutex_leave(arg0: CValuesRef<sqlite3_mutex>?): Unit

@CCall("knifunptr_sqlite3210_sqlite3_mutex_held")
external fun sqlite3_mutex_held(arg0: CValuesRef<sqlite3_mutex>?): Int

@CCall("knifunptr_sqlite3211_sqlite3_mutex_notheld")
external fun sqlite3_mutex_notheld(arg0: CValuesRef<sqlite3_mutex>?): Int

@CCall("knifunptr_sqlite3212_sqlite3_db_mutex")
external fun sqlite3_db_mutex(arg0: CValuesRef<sqlite3>?): CPointer<sqlite3_mutex>?

@CCall("knifunptr_sqlite3213_sqlite3_file_control")
external fun sqlite3_file_control(arg0: CValuesRef<sqlite3>?, @CCall.CString zDbName: String?, op: Int, arg3: CValuesRef<*>?): Int

@CCall("knifunptr_sqlite3214_sqlite3_test_control")
external fun sqlite3_test_control(op: Int, vararg variadicArguments: Any?): Int

@CCall("knifunptr_sqlite3215_sqlite3_keyword_count")
external fun sqlite3_keyword_count(): Int

@CCall("knifunptr_sqlite3216_sqlite3_keyword_name")
external fun sqlite3_keyword_name(arg0: Int, arg1: CValuesRef<CPointerVar<ByteVar>>?, arg2: CValuesRef<IntVar>?): Int

@CCall("knifunptr_sqlite3217_sqlite3_keyword_check")
external fun sqlite3_keyword_check(@CCall.CString arg0: String?, arg1: Int): Int

@CCall("knifunptr_sqlite3218_sqlite3_str_new")
external fun sqlite3_str_new(arg0: CValuesRef<sqlite3>?): CPointer<sqlite3_str>?

@CCall("knifunptr_sqlite3219_sqlite3_str_finish")
external fun sqlite3_str_finish(arg0: CValuesRef<sqlite3_str>?): CPointer<ByteVar>?

@CCall("knifunptr_sqlite3220_sqlite3_str_appendf")
external fun sqlite3_str_appendf(arg0: CValuesRef<sqlite3_str>?, @CCall.CString zFormat: String?, vararg variadicArguments: Any?): Unit

@CCall("knifunptr_sqlite3221_sqlite3_str_vappendf")
external fun sqlite3_str_vappendf(arg0: CValuesRef<sqlite3_str>?, @CCall.CString zFormat: String?, arg2: va_list?): Unit

@CCall("knifunptr_sqlite3222_sqlite3_str_append")
external fun sqlite3_str_append(arg0: CValuesRef<sqlite3_str>?, @CCall.CString zIn: String?, N: Int): Unit

@CCall("knifunptr_sqlite3223_sqlite3_str_appendall")
external fun sqlite3_str_appendall(arg0: CValuesRef<sqlite3_str>?, @CCall.CString zIn: String?): Unit

@CCall("knifunptr_sqlite3224_sqlite3_str_appendchar")
external fun sqlite3_str_appendchar(arg0: CValuesRef<sqlite3_str>?, N: Int, C: Byte): Unit

@CCall("knifunptr_sqlite3225_sqlite3_str_reset")
external fun sqlite3_str_reset(arg0: CValuesRef<sqlite3_str>?): Unit

@CCall("knifunptr_sqlite3226_sqlite3_str_errcode")
external fun sqlite3_str_errcode(arg0: CValuesRef<sqlite3_str>?): Int

@CCall("knifunptr_sqlite3227_sqlite3_str_length")
external fun sqlite3_str_length(arg0: CValuesRef<sqlite3_str>?): Int

@CCall("knifunptr_sqlite3228_sqlite3_str_value")
external fun sqlite3_str_value(arg0: CValuesRef<sqlite3_str>?): CPointer<ByteVar>?

@CCall("knifunptr_sqlite3229_sqlite3_status")
external fun sqlite3_status(op: Int, pCurrent: CValuesRef<IntVar>?, pHighwater: CValuesRef<IntVar>?, resetFlag: Int): Int

@CCall("knifunptr_sqlite3230_sqlite3_status64")
external fun sqlite3_status64(op: Int, pCurrent: CValuesRef<sqlite3_int64Var>?, pHighwater: CValuesRef<sqlite3_int64Var>?, resetFlag: Int): Int

@CCall("knifunptr_sqlite3231_sqlite3_db_status")
external fun sqlite3_db_status(arg0: CValuesRef<sqlite3>?, op: Int, pCur: CValuesRef<IntVar>?, pHiwtr: CValuesRef<IntVar>?, resetFlg: Int): Int

@CCall("knifunptr_sqlite3232_sqlite3_stmt_status")
external fun sqlite3_stmt_status(arg0: CValuesRef<sqlite3_stmt>?, op: Int, resetFlg: Int): Int

@CCall("knifunptr_sqlite3233_sqlite3_backup_init")
external fun sqlite3_backup_init(pDest: CValuesRef<sqlite3>?, @CCall.CString zDestName: String?, pSource: CValuesRef<sqlite3>?, @CCall.CString zSourceName: String?): CPointer<sqlite3_backup>?

@CCall("knifunptr_sqlite3234_sqlite3_backup_step")
external fun sqlite3_backup_step(p: CValuesRef<sqlite3_backup>?, nPage: Int): Int

@CCall("knifunptr_sqlite3235_sqlite3_backup_finish")
external fun sqlite3_backup_finish(p: CValuesRef<sqlite3_backup>?): Int

@CCall("knifunptr_sqlite3236_sqlite3_backup_remaining")
external fun sqlite3_backup_remaining(p: CValuesRef<sqlite3_backup>?): Int

@CCall("knifunptr_sqlite3237_sqlite3_backup_pagecount")
external fun sqlite3_backup_pagecount(p: CValuesRef<sqlite3_backup>?): Int

@CCall("knifunptr_sqlite3238_sqlite3_unlock_notify")
external fun sqlite3_unlock_notify(pBlocked: CValuesRef<sqlite3>?, xNotify: CPointer<CFunction<(CPointer<COpaquePointerVar>?, Int) -> Unit>>?, pNotifyArg: CValuesRef<*>?): Int

@CCall("knifunptr_sqlite3239_sqlite3_stricmp")
external fun sqlite3_stricmp(@CCall.CString arg0: String?, @CCall.CString arg1: String?): Int

@CCall("knifunptr_sqlite3240_sqlite3_strnicmp")
external fun sqlite3_strnicmp(@CCall.CString arg0: String?, @CCall.CString arg1: String?, arg2: Int): Int

@CCall("knifunptr_sqlite3241_sqlite3_strglob")
external fun sqlite3_strglob(@CCall.CString zGlob: String?, @CCall.CString zStr: String?): Int

@CCall("knifunptr_sqlite3242_sqlite3_strlike")
external fun sqlite3_strlike(@CCall.CString zGlob: String?, @CCall.CString zStr: String?, cEsc: UInt): Int

@CCall("knifunptr_sqlite3243_sqlite3_log")
external fun sqlite3_log(iErrCode: Int, @CCall.CString zFormat: String?, vararg variadicArguments: Any?): Unit

@CCall("knifunptr_sqlite3244_sqlite3_wal_hook")
external fun sqlite3_wal_hook(arg0: CValuesRef<sqlite3>?, arg1: CPointer<CFunction<(COpaquePointer?, CPointer<sqlite3>?, CPointer<ByteVar>?, Int) -> Int>>?, arg2: CValuesRef<*>?): COpaquePointer?

@CCall("knifunptr_sqlite3245_sqlite3_wal_autocheckpoint")
external fun sqlite3_wal_autocheckpoint(db: CValuesRef<sqlite3>?, N: Int): Int

@CCall("knifunptr_sqlite3246_sqlite3_wal_checkpoint")
external fun sqlite3_wal_checkpoint(db: CValuesRef<sqlite3>?, @CCall.CString zDb: String?): Int

@CCall("knifunptr_sqlite3247_sqlite3_wal_checkpoint_v2")
external fun sqlite3_wal_checkpoint_v2(db: CValuesRef<sqlite3>?, @CCall.CString zDb: String?, eMode: Int, pnLog: CValuesRef<IntVar>?, pnCkpt: CValuesRef<IntVar>?): Int

@CCall("knifunptr_sqlite3248_sqlite3_vtab_config")
external fun sqlite3_vtab_config(arg0: CValuesRef<sqlite3>?, op: Int, vararg variadicArguments: Any?): Int

@CCall("knifunptr_sqlite3249_sqlite3_vtab_on_conflict")
external fun sqlite3_vtab_on_conflict(arg0: CValuesRef<sqlite3>?): Int

@CCall("knifunptr_sqlite3250_sqlite3_vtab_nochange")
external fun sqlite3_vtab_nochange(arg0: CValuesRef<sqlite3_context>?): Int

@CCall("knifunptr_sqlite3251_sqlite3_vtab_collation")
external fun sqlite3_vtab_collation(arg0: CValuesRef<sqlite3_index_info>?, arg1: Int): CPointer<ByteVar>?

@CCall("knifunptr_sqlite3252_sqlite3_stmt_scanstatus")
external fun sqlite3_stmt_scanstatus(pStmt: CValuesRef<sqlite3_stmt>?, idx: Int, iScanStatusOp: Int, pOut: CValuesRef<*>?): Int

@CCall("knifunptr_sqlite3253_sqlite3_stmt_scanstatus_reset")
external fun sqlite3_stmt_scanstatus_reset(arg0: CValuesRef<sqlite3_stmt>?): Unit

@CCall("knifunptr_sqlite3254_sqlite3_db_cacheflush")
external fun sqlite3_db_cacheflush(arg0: CValuesRef<sqlite3>?): Int

@CCall("knifunptr_sqlite3255_sqlite3_system_errno")
external fun sqlite3_system_errno(arg0: CValuesRef<sqlite3>?): Int

@CCall("knifunptr_sqlite3256_sqlite3_snapshot_get")
external fun sqlite3_snapshot_get(db: CValuesRef<sqlite3>?, @CCall.CString zSchema: String?, ppSnapshot: CValuesRef<CPointerVar<sqlite3_snapshot>>?): Int

@CCall("knifunptr_sqlite3257_sqlite3_snapshot_open")
external fun sqlite3_snapshot_open(db: CValuesRef<sqlite3>?, @CCall.CString zSchema: String?, pSnapshot: CValuesRef<sqlite3_snapshot>?): Int

@CCall("knifunptr_sqlite3258_sqlite3_snapshot_free")
external fun sqlite3_snapshot_free(arg0: CValuesRef<sqlite3_snapshot>?): Unit

@CCall("knifunptr_sqlite3259_sqlite3_snapshot_cmp")
external fun sqlite3_snapshot_cmp(p1: CValuesRef<sqlite3_snapshot>?, p2: CValuesRef<sqlite3_snapshot>?): Int

@CCall("knifunptr_sqlite3260_sqlite3_snapshot_recover")
external fun sqlite3_snapshot_recover(db: CValuesRef<sqlite3>?, @CCall.CString zDb: String?): Int

@CCall("knifunptr_sqlite3261_sqlite3_serialize")
external fun sqlite3_serialize(db: CValuesRef<sqlite3>?, @CCall.CString zSchema: String?, piSize: CValuesRef<sqlite3_int64Var>?, mFlags: UInt): CPointer<UByteVar>?

@CCall("knifunptr_sqlite3262_sqlite3_deserialize")
external fun sqlite3_deserialize(db: CValuesRef<sqlite3>?, @CCall.CString zSchema: String?, pData: CValuesRef<UByteVar>?, szDb: sqlite3_int64, szBuf: sqlite3_int64, mFlags: UInt): Int

@CCall("knifunptr_sqlite3263_sqlite3_rtree_geometry_callback")
external fun sqlite3_rtree_geometry_callback(db: CValuesRef<sqlite3>?, @CCall.CString zGeom: String?, xGeom: CPointer<CFunction<(CPointer<sqlite3_rtree_geometry>?, Int, CPointer<sqlite3_rtree_dblVar>?, CPointer<IntVar>?) -> Int>>?, pContext: CValuesRef<*>?): Int

@CCall("knifunptr_sqlite3264_sqlite3_rtree_query_callback")
external fun sqlite3_rtree_query_callback(db: CValuesRef<sqlite3>?, @CCall.CString zQueryFunc: String?, xQueryFunc: CPointer<CFunction<(CPointer<sqlite3_rtree_query_info>?) -> Int>>?, pContext: CValuesRef<*>?, xDestructor: CPointer<CFunction<(COpaquePointer?) -> Unit>>?): Int

@CCall("knifunptr_sqlite3265_sqlite3HashInit")
external fun sqlite3HashInit(arg0: CValuesRef<Hash>?): Unit

@CCall("knifunptr_sqlite3266_sqlite3HashInsert")
external fun sqlite3HashInsert(arg0: CValuesRef<Hash>?, @CCall.CString pKey: String?, pData: CValuesRef<*>?): COpaquePointer?

@CCall("knifunptr_sqlite3267_sqlite3HashFind")
external fun sqlite3HashFind(arg0: CValuesRef<Hash>?, @CCall.CString pKey: String?): COpaquePointer?

@CCall("knifunptr_sqlite3268_sqlite3HashClear")
external fun sqlite3HashClear(arg0: CValuesRef<Hash>?): Unit

@CCall("knifunptr_sqlite3269_sqlite3BtreeOpen")
external fun sqlite3BtreeOpen(pVfs: CValuesRef<sqlite3_vfs>?, @CCall.CString zFilename: String?, db: CValuesRef<sqlite3>?, ppBtree: CValuesRef<CPointerVar<Btree>>?, flags: Int, vfsFlags: Int): Int

@CCall("knifunptr_sqlite3270_sqlite3BtreeClose")
external fun sqlite3BtreeClose(arg0: CValuesRef<Btree>?): Int

@CCall("knifunptr_sqlite3271_sqlite3BtreeSetCacheSize")
external fun sqlite3BtreeSetCacheSize(arg0: CValuesRef<Btree>?, arg1: Int): Int

@CCall("knifunptr_sqlite3272_sqlite3BtreeSetSpillSize")
external fun sqlite3BtreeSetSpillSize(arg0: CValuesRef<Btree>?, arg1: Int): Int

@CCall("knifunptr_sqlite3273_sqlite3BtreeSetMmapLimit")
external fun sqlite3BtreeSetMmapLimit(arg0: CValuesRef<Btree>?, arg1: sqlite3_int64): Int

@CCall("knifunptr_sqlite3274_sqlite3BtreeSetPagerFlags")
external fun sqlite3BtreeSetPagerFlags(arg0: CValuesRef<Btree>?, arg1: UInt): Int

@CCall("knifunptr_sqlite3275_sqlite3BtreeSetPageSize")
external fun sqlite3BtreeSetPageSize(p: CValuesRef<Btree>?, nPagesize: Int, nReserve: Int, eFix: Int): Int

@CCall("knifunptr_sqlite3276_sqlite3BtreeGetPageSize")
external fun sqlite3BtreeGetPageSize(arg0: CValuesRef<Btree>?): Int

@CCall("knifunptr_sqlite3277_sqlite3BtreeMaxPageCount")
external fun sqlite3BtreeMaxPageCount(arg0: CValuesRef<Btree>?, arg1: Int): Int

@CCall("knifunptr_sqlite3278_sqlite3BtreeLastPage")
external fun sqlite3BtreeLastPage(arg0: CValuesRef<Btree>?): u32

@CCall("knifunptr_sqlite3279_sqlite3BtreeSecureDelete")
external fun sqlite3BtreeSecureDelete(arg0: CValuesRef<Btree>?, arg1: Int): Int

@CCall("knifunptr_sqlite3280_sqlite3BtreeGetOptimalReserve")
external fun sqlite3BtreeGetOptimalReserve(arg0: CValuesRef<Btree>?): Int

@CCall("knifunptr_sqlite3281_sqlite3BtreeGetReserveNoMutex")
external fun sqlite3BtreeGetReserveNoMutex(p: CValuesRef<Btree>?): Int

@CCall("knifunptr_sqlite3282_sqlite3BtreeSetAutoVacuum")
external fun sqlite3BtreeSetAutoVacuum(arg0: CValuesRef<Btree>?, arg1: Int): Int

@CCall("knifunptr_sqlite3283_sqlite3BtreeGetAutoVacuum")
external fun sqlite3BtreeGetAutoVacuum(arg0: CValuesRef<Btree>?): Int

@CCall("knifunptr_sqlite3284_sqlite3BtreeBeginTrans")
external fun sqlite3BtreeBeginTrans(arg0: CValuesRef<Btree>?, arg1: Int, arg2: CValuesRef<IntVar>?): Int

@CCall("knifunptr_sqlite3285_sqlite3BtreeCommitPhaseOne")
external fun sqlite3BtreeCommitPhaseOne(arg0: CValuesRef<Btree>?, @CCall.CString zMaster: String?): Int

@CCall("knifunptr_sqlite3286_sqlite3BtreeCommitPhaseTwo")
external fun sqlite3BtreeCommitPhaseTwo(arg0: CValuesRef<Btree>?, arg1: Int): Int

@CCall("knifunptr_sqlite3287_sqlite3BtreeCommit")
external fun sqlite3BtreeCommit(arg0: CValuesRef<Btree>?): Int

@CCall("knifunptr_sqlite3288_sqlite3BtreeRollback")
external fun sqlite3BtreeRollback(arg0: CValuesRef<Btree>?, arg1: Int, arg2: Int): Int

@CCall("knifunptr_sqlite3289_sqlite3BtreeBeginStmt")
external fun sqlite3BtreeBeginStmt(arg0: CValuesRef<Btree>?, arg1: Int): Int

@CCall("knifunptr_sqlite3290_sqlite3BtreeCreateTable")
external fun sqlite3BtreeCreateTable(arg0: CValuesRef<Btree>?, arg1: CValuesRef<IntVar>?, flags: Int): Int

@CCall("knifunptr_sqlite3291_sqlite3BtreeIsInTrans")
external fun sqlite3BtreeIsInTrans(arg0: CValuesRef<Btree>?): Int

@CCall("knifunptr_sqlite3292_sqlite3BtreeIsInReadTrans")
external fun sqlite3BtreeIsInReadTrans(arg0: CValuesRef<Btree>?): Int

@CCall("knifunptr_sqlite3293_sqlite3BtreeIsInBackup")
external fun sqlite3BtreeIsInBackup(arg0: CValuesRef<Btree>?): Int

@CCall("knifunptr_sqlite3294_sqlite3BtreeSchema")
external fun sqlite3BtreeSchema(arg0: CValuesRef<Btree>?, arg1: Int, arg2: CPointer<CFunction<(COpaquePointer?) -> Unit>>?): COpaquePointer?

@CCall("knifunptr_sqlite3295_sqlite3BtreeSchemaLocked")
external fun sqlite3BtreeSchemaLocked(pBtree: CValuesRef<Btree>?): Int

@CCall("knifunptr_sqlite3296_sqlite3BtreeLockTable")
external fun sqlite3BtreeLockTable(pBtree: CValuesRef<Btree>?, iTab: Int, isWriteLock: u8): Int

@CCall("knifunptr_sqlite3297_sqlite3BtreeSavepoint")
external fun sqlite3BtreeSavepoint(arg0: CValuesRef<Btree>?, arg1: Int, arg2: Int): Int

@CCall("knifunptr_sqlite3298_sqlite3BtreeGetFilename")
external fun sqlite3BtreeGetFilename(arg0: CValuesRef<Btree>?): CPointer<ByteVar>?

@CCall("knifunptr_sqlite3299_sqlite3BtreeGetJournalname")
external fun sqlite3BtreeGetJournalname(arg0: CValuesRef<Btree>?): CPointer<ByteVar>?

@CCall("knifunptr_sqlite3300_sqlite3BtreeCopyFile")
external fun sqlite3BtreeCopyFile(arg0: CValuesRef<Btree>?, arg1: CValuesRef<Btree>?): Int

@CCall("knifunptr_sqlite3301_sqlite3BtreeIncrVacuum")
external fun sqlite3BtreeIncrVacuum(arg0: CValuesRef<Btree>?): Int

@CCall("knifunptr_sqlite3302_sqlite3BtreeDropTable")
external fun sqlite3BtreeDropTable(arg0: CValuesRef<Btree>?, arg1: Int, arg2: CValuesRef<IntVar>?): Int

@CCall("knifunptr_sqlite3303_sqlite3BtreeClearTable")
external fun sqlite3BtreeClearTable(arg0: CValuesRef<Btree>?, arg1: Int, arg2: CValuesRef<IntVar>?): Int

@CCall("knifunptr_sqlite3304_sqlite3BtreeClearTableOfCursor")
external fun sqlite3BtreeClearTableOfCursor(arg0: CValuesRef<BtCursor>?): Int

@CCall("knifunptr_sqlite3305_sqlite3BtreeTripAllCursors")
external fun sqlite3BtreeTripAllCursors(arg0: CValuesRef<Btree>?, arg1: Int, arg2: Int): Int

@CCall("knifunptr_sqlite3306_sqlite3BtreeGetMeta")
external fun sqlite3BtreeGetMeta(pBtree: CValuesRef<Btree>?, idx: Int, pValue: CValuesRef<u32Var>?): Unit

@CCall("knifunptr_sqlite3307_sqlite3BtreeUpdateMeta")
external fun sqlite3BtreeUpdateMeta(arg0: CValuesRef<Btree>?, idx: Int, value: u32): Int

@CCall("knifunptr_sqlite3308_sqlite3BtreeNewDb")
external fun sqlite3BtreeNewDb(p: CValuesRef<Btree>?): Int

@CCall("knifunptr_sqlite3309_sqlite3BtreeCursor")
external fun sqlite3BtreeCursor(arg0: CValuesRef<Btree>?, iTable: Int, wrFlag: Int, arg3: CValuesRef<KeyInfo>?, pCursor: CValuesRef<BtCursor>?): Int

@CCall("knifunptr_sqlite3310_sqlite3BtreeFakeValidCursor")
external fun sqlite3BtreeFakeValidCursor(): CPointer<BtCursor>?

@CCall("knifunptr_sqlite3311_sqlite3BtreeCursorSize")
external fun sqlite3BtreeCursorSize(): Int

@CCall("knifunptr_sqlite3312_sqlite3BtreeCursorZero")
external fun sqlite3BtreeCursorZero(arg0: CValuesRef<BtCursor>?): Unit

@CCall("knifunptr_sqlite3313_sqlite3BtreeCursorHintFlags")
external fun sqlite3BtreeCursorHintFlags(arg0: CValuesRef<BtCursor>?, arg1: UInt): Unit

@CCall("knifunptr_sqlite3314_sqlite3BtreeCloseCursor")
external fun sqlite3BtreeCloseCursor(arg0: CValuesRef<BtCursor>?): Int

@CCall("knifunptr_sqlite3315_sqlite3BtreeMovetoUnpacked")
external fun sqlite3BtreeMovetoUnpacked(arg0: CValuesRef<BtCursor>?, pUnKey: CValuesRef<UnpackedRecord>?, intKey: i64, bias: Int, pRes: CValuesRef<IntVar>?): Int

@CCall("knifunptr_sqlite3316_sqlite3BtreeCursorHasMoved")
external fun sqlite3BtreeCursorHasMoved(arg0: CValuesRef<BtCursor>?): Int

@CCall("knifunptr_sqlite3317_sqlite3BtreeCursorRestore")
external fun sqlite3BtreeCursorRestore(arg0: CValuesRef<BtCursor>?, arg1: CValuesRef<IntVar>?): Int

@CCall("knifunptr_sqlite3318_sqlite3BtreeDelete")
external fun sqlite3BtreeDelete(arg0: CValuesRef<BtCursor>?, flags: u8): Int

@CCall("knifunptr_sqlite3319_sqlite3BtreeInsert")
external fun sqlite3BtreeInsert(arg0: CValuesRef<BtCursor>?, pPayload: CValuesRef<BtreePayload>?, flags: Int, seekResult: Int): Int

@CCall("knifunptr_sqlite3320_sqlite3BtreeFirst")
external fun sqlite3BtreeFirst(arg0: CValuesRef<BtCursor>?, pRes: CValuesRef<IntVar>?): Int

@CCall("knifunptr_sqlite3321_sqlite3BtreeSkipNext")
external fun sqlite3BtreeSkipNext(arg0: CValuesRef<BtCursor>?): Unit

@CCall("knifunptr_sqlite3322_sqlite3BtreeLast")
external fun sqlite3BtreeLast(arg0: CValuesRef<BtCursor>?, pRes: CValuesRef<IntVar>?): Int

@CCall("knifunptr_sqlite3323_sqlite3BtreeNext")
external fun sqlite3BtreeNext(arg0: CValuesRef<BtCursor>?, flags: Int): Int

@CCall("knifunptr_sqlite3324_sqlite3BtreeEof")
external fun sqlite3BtreeEof(arg0: CValuesRef<BtCursor>?): Int

@CCall("knifunptr_sqlite3325_sqlite3BtreePrevious")
external fun sqlite3BtreePrevious(arg0: CValuesRef<BtCursor>?, flags: Int): Int

@CCall("knifunptr_sqlite3326_sqlite3BtreeIntegerKey")
external fun sqlite3BtreeIntegerKey(arg0: CValuesRef<BtCursor>?): i64

@CCall("knifunptr_sqlite3327_sqlite3BtreePayload")
external fun sqlite3BtreePayload(arg0: CValuesRef<BtCursor>?, offset: u32, amt: u32, arg3: CValuesRef<*>?): Int

@CCall("knifunptr_sqlite3328_sqlite3BtreePayloadFetch")
external fun sqlite3BtreePayloadFetch(arg0: CValuesRef<BtCursor>?, pAmt: CValuesRef<u32Var>?): COpaquePointer?

@CCall("knifunptr_sqlite3329_sqlite3BtreePayloadSize")
external fun sqlite3BtreePayloadSize(arg0: CValuesRef<BtCursor>?): u32

@CCall("knifunptr_sqlite3330_sqlite3BtreeMaxRecordSize")
external fun sqlite3BtreeMaxRecordSize(arg0: CValuesRef<BtCursor>?): sqlite3_int64

@CCall("knifunptr_sqlite3331_sqlite3BtreeIntegrityCheck")
external fun sqlite3BtreeIntegrityCheck(arg0: CValuesRef<Btree>?, aRoot: CValuesRef<IntVar>?, nRoot: Int, arg3: Int, arg4: CValuesRef<IntVar>?): CPointer<ByteVar>?

@CCall("knifunptr_sqlite3332_sqlite3BtreePager")
external fun sqlite3BtreePager(arg0: CValuesRef<Btree>?): CPointer<Pager>?

@CCall("knifunptr_sqlite3333_sqlite3BtreeRowCountEst")
external fun sqlite3BtreeRowCountEst(arg0: CValuesRef<BtCursor>?): i64

@CCall("knifunptr_sqlite3334_sqlite3BtreePayloadChecked")
external fun sqlite3BtreePayloadChecked(arg0: CValuesRef<BtCursor>?, offset: u32, amt: u32, arg3: CValuesRef<*>?): Int

@CCall("knifunptr_sqlite3335_sqlite3BtreePutData")
external fun sqlite3BtreePutData(arg0: CValuesRef<BtCursor>?, offset: u32, amt: u32, arg3: CValuesRef<*>?): Int

@CCall("knifunptr_sqlite3336_sqlite3BtreeIncrblobCursor")
external fun sqlite3BtreeIncrblobCursor(arg0: CValuesRef<BtCursor>?): Unit

@CCall("knifunptr_sqlite3337_sqlite3BtreeClearCursor")
external fun sqlite3BtreeClearCursor(arg0: CValuesRef<BtCursor>?): Unit

@CCall("knifunptr_sqlite3338_sqlite3BtreeSetVersion")
external fun sqlite3BtreeSetVersion(pBt: CValuesRef<Btree>?, iVersion: Int): Int

@CCall("knifunptr_sqlite3339_sqlite3BtreeCursorHasHint")
external fun sqlite3BtreeCursorHasHint(arg0: CValuesRef<BtCursor>?, mask: UInt): Int

@CCall("knifunptr_sqlite3340_sqlite3BtreeIsReadonly")
external fun sqlite3BtreeIsReadonly(pBt: CValuesRef<Btree>?): Int

@CCall("knifunptr_sqlite3341_sqlite3HeaderSizeBtree")
external fun sqlite3HeaderSizeBtree(): Int

@CCall("knifunptr_sqlite3342_sqlite3BtreeCursorIsValidNN")
external fun sqlite3BtreeCursorIsValidNN(arg0: CValuesRef<BtCursor>?): Int

@CCall("knifunptr_sqlite3343_sqlite3BtreeCount")
external fun sqlite3BtreeCount(arg0: CValuesRef<BtCursor>?, arg1: CValuesRef<i64Var>?): Int

@CCall("knifunptr_sqlite3344_sqlite3BtreeCheckpoint")
external fun sqlite3BtreeCheckpoint(arg0: CValuesRef<Btree>?, arg1: Int, arg2: CValuesRef<IntVar>?, arg3: CValuesRef<IntVar>?): Int

@CCall("knifunptr_sqlite3345_sqlite3BtreeEnter")
external fun sqlite3BtreeEnter(arg0: CValuesRef<Btree>?): Unit

@CCall("knifunptr_sqlite3346_sqlite3BtreeEnterAll")
external fun sqlite3BtreeEnterAll(arg0: CValuesRef<sqlite3>?): Unit

@CCall("knifunptr_sqlite3347_sqlite3BtreeSharable")
external fun sqlite3BtreeSharable(arg0: CValuesRef<Btree>?): Int

@CCall("knifunptr_sqlite3348_sqlite3BtreeEnterCursor")
external fun sqlite3BtreeEnterCursor(arg0: CValuesRef<BtCursor>?): Unit

@CCall("knifunptr_sqlite3349_sqlite3BtreeConnectionCount")
external fun sqlite3BtreeConnectionCount(arg0: CValuesRef<Btree>?): Int

@CCall("knifunptr_sqlite3350_sqlite3BtreeLeave")
external fun sqlite3BtreeLeave(arg0: CValuesRef<Btree>?): Unit

@CCall("knifunptr_sqlite3351_sqlite3BtreeLeaveCursor")
external fun sqlite3BtreeLeaveCursor(arg0: CValuesRef<BtCursor>?): Unit

@CCall("knifunptr_sqlite3352_sqlite3BtreeLeaveAll")
external fun sqlite3BtreeLeaveAll(arg0: CValuesRef<sqlite3>?): Unit

@CCall("knifunptr_sqlite3353_sqlite3VdbeCreate")
external fun sqlite3VdbeCreate(arg0: CValuesRef<Parse>?): CPointer<Vdbe>?

@CCall("knifunptr_sqlite3354_sqlite3VdbeAddOp0")
external fun sqlite3VdbeAddOp0(arg0: CValuesRef<Vdbe>?, arg1: Int): Int

@CCall("knifunptr_sqlite3355_sqlite3VdbeAddOp1")
external fun sqlite3VdbeAddOp1(arg0: CValuesRef<Vdbe>?, arg1: Int, arg2: Int): Int

@CCall("knifunptr_sqlite3356_sqlite3VdbeAddOp2")
external fun sqlite3VdbeAddOp2(arg0: CValuesRef<Vdbe>?, arg1: Int, arg2: Int, arg3: Int): Int

@CCall("knifunptr_sqlite3357_sqlite3VdbeGoto")
external fun sqlite3VdbeGoto(arg0: CValuesRef<Vdbe>?, arg1: Int): Int

@CCall("knifunptr_sqlite3358_sqlite3VdbeLoadString")
external fun sqlite3VdbeLoadString(arg0: CValuesRef<Vdbe>?, arg1: Int, @CCall.CString arg2: String?): Int

@CCall("knifunptr_sqlite3359_sqlite3VdbeMultiLoad")
external fun sqlite3VdbeMultiLoad(arg0: CValuesRef<Vdbe>?, arg1: Int, @CCall.CString arg2: String?, vararg variadicArguments: Any?): Unit

@CCall("knifunptr_sqlite3360_sqlite3VdbeAddOp3")
external fun sqlite3VdbeAddOp3(arg0: CValuesRef<Vdbe>?, arg1: Int, arg2: Int, arg3: Int, arg4: Int): Int

@CCall("knifunptr_sqlite3361_sqlite3VdbeAddOp4")
external fun sqlite3VdbeAddOp4(arg0: CValuesRef<Vdbe>?, arg1: Int, arg2: Int, arg3: Int, arg4: Int, @CCall.CString zP4: String?, arg6: Int): Int

@CCall("knifunptr_sqlite3362_sqlite3VdbeAddOp4Dup8")
external fun sqlite3VdbeAddOp4Dup8(arg0: CValuesRef<Vdbe>?, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: CValuesRef<u8Var>?, arg6: Int): Int

@CCall("knifunptr_sqlite3363_sqlite3VdbeAddOp4Int")
external fun sqlite3VdbeAddOp4Int(arg0: CValuesRef<Vdbe>?, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int): Int

@CCall("knifunptr_sqlite3364_sqlite3VdbeEndCoroutine")
external fun sqlite3VdbeEndCoroutine(arg0: CValuesRef<Vdbe>?, arg1: Int): Unit

@CCall("knifunptr_sqlite3365_sqlite3VdbeAddOpList")
external fun sqlite3VdbeAddOpList(arg0: CValuesRef<Vdbe>?, nOp: Int, aOp: CValuesRef<VdbeOpList>?, iLineno: Int): CPointer<VdbeOp>?

@CCall("knifunptr_sqlite3366_sqlite3VdbeExplain")
external fun sqlite3VdbeExplain(arg0: CValuesRef<Parse>?, arg1: u8, @CCall.CString arg2: String?, vararg variadicArguments: Any?): Unit

@CCall("knifunptr_sqlite3367_sqlite3VdbeExplainPop")
external fun sqlite3VdbeExplainPop(arg0: CValuesRef<Parse>?): Unit

@CCall("knifunptr_sqlite3368_sqlite3VdbeExplainParent")
external fun sqlite3VdbeExplainParent(arg0: CValuesRef<Parse>?): Int

@CCall("knifunptr_sqlite3369_sqlite3VdbeAddParseSchemaOp")
external fun sqlite3VdbeAddParseSchemaOp(arg0: CValuesRef<Vdbe>?, arg1: Int, arg2: CValuesRef<ByteVar>?): Unit

@CCall("knifunptr_sqlite3370_sqlite3VdbeChangeOpcode")
external fun sqlite3VdbeChangeOpcode(arg0: CValuesRef<Vdbe>?, addr: u32, arg2: u8): Unit

@CCall("knifunptr_sqlite3371_sqlite3VdbeChangeP1")
external fun sqlite3VdbeChangeP1(arg0: CValuesRef<Vdbe>?, addr: u32, P1: Int): Unit

@CCall("knifunptr_sqlite3372_sqlite3VdbeChangeP2")
external fun sqlite3VdbeChangeP2(arg0: CValuesRef<Vdbe>?, addr: u32, P2: Int): Unit

@CCall("knifunptr_sqlite3373_sqlite3VdbeChangeP3")
external fun sqlite3VdbeChangeP3(arg0: CValuesRef<Vdbe>?, addr: u32, P3: Int): Unit

@CCall("knifunptr_sqlite3374_sqlite3VdbeChangeP5")
external fun sqlite3VdbeChangeP5(arg0: CValuesRef<Vdbe>?, P5: u16): Unit

@CCall("knifunptr_sqlite3375_sqlite3VdbeJumpHere")
external fun sqlite3VdbeJumpHere(arg0: CValuesRef<Vdbe>?, addr: Int): Unit

@CCall("knifunptr_sqlite3376_sqlite3VdbeChangeToNoop")
external fun sqlite3VdbeChangeToNoop(arg0: CValuesRef<Vdbe>?, addr: Int): Int

@CCall("knifunptr_sqlite3377_sqlite3VdbeDeletePriorOpcode")
external fun sqlite3VdbeDeletePriorOpcode(arg0: CValuesRef<Vdbe>?, op: u8): Int

@CCall("knifunptr_sqlite3378_sqlite3VdbeChangeP4")
external fun sqlite3VdbeChangeP4(arg0: CValuesRef<Vdbe>?, addr: Int, @CCall.CString zP4: String?, N: Int): Unit

@CCall("knifunptr_sqlite3379_sqlite3VdbeAppendP4")
external fun sqlite3VdbeAppendP4(arg0: CValuesRef<Vdbe>?, pP4: CValuesRef<*>?, p4type: Int): Unit

@CCall("knifunptr_sqlite3380_sqlite3VdbeSetP4KeyInfo")
external fun sqlite3VdbeSetP4KeyInfo(arg0: CValuesRef<Parse>?, arg1: CValuesRef<Index>?): Unit

@CCall("knifunptr_sqlite3381_sqlite3VdbeUsesBtree")
external fun sqlite3VdbeUsesBtree(arg0: CValuesRef<Vdbe>?, arg1: Int): Unit

@CCall("knifunptr_sqlite3382_sqlite3VdbeGetOp")
external fun sqlite3VdbeGetOp(arg0: CValuesRef<Vdbe>?, arg1: Int): CPointer<VdbeOp>?

@CCall("knifunptr_sqlite3383_sqlite3VdbeMakeLabel")
external fun sqlite3VdbeMakeLabel(arg0: CValuesRef<Parse>?): Int

@CCall("knifunptr_sqlite3384_sqlite3VdbeRunOnlyOnce")
external fun sqlite3VdbeRunOnlyOnce(arg0: CValuesRef<Vdbe>?): Unit

@CCall("knifunptr_sqlite3385_sqlite3VdbeReusable")
external fun sqlite3VdbeReusable(arg0: CValuesRef<Vdbe>?): Unit

@CCall("knifunptr_sqlite3386_sqlite3VdbeDelete")
external fun sqlite3VdbeDelete(arg0: CValuesRef<Vdbe>?): Unit

@CCall("knifunptr_sqlite3387_sqlite3VdbeClearObject")
external fun sqlite3VdbeClearObject(arg0: CValuesRef<sqlite3>?, arg1: CValuesRef<Vdbe>?): Unit

@CCall("knifunptr_sqlite3388_sqlite3VdbeMakeReady")
external fun sqlite3VdbeMakeReady(arg0: CValuesRef<Vdbe>?, arg1: CValuesRef<Parse>?): Unit

@CCall("knifunptr_sqlite3389_sqlite3VdbeFinalize")
external fun sqlite3VdbeFinalize(arg0: CValuesRef<Vdbe>?): Int

@CCall("knifunptr_sqlite3390_sqlite3VdbeResolveLabel")
external fun sqlite3VdbeResolveLabel(arg0: CValuesRef<Vdbe>?, arg1: Int): Unit

@CCall("knifunptr_sqlite3391_sqlite3VdbeCurrentAddr")
external fun sqlite3VdbeCurrentAddr(arg0: CValuesRef<Vdbe>?): Int

@CCall("knifunptr_sqlite3392_sqlite3VdbeResetStepResult")
external fun sqlite3VdbeResetStepResult(arg0: CValuesRef<Vdbe>?): Unit

@CCall("knifunptr_sqlite3393_sqlite3VdbeRewind")
external fun sqlite3VdbeRewind(arg0: CValuesRef<Vdbe>?): Unit

@CCall("knifunptr_sqlite3394_sqlite3VdbeReset")
external fun sqlite3VdbeReset(arg0: CValuesRef<Vdbe>?): Int

@CCall("knifunptr_sqlite3395_sqlite3VdbeSetNumCols")
external fun sqlite3VdbeSetNumCols(arg0: CValuesRef<Vdbe>?, arg1: Int): Unit

@CCall("knifunptr_sqlite3396_sqlite3VdbeSetColName")
external fun sqlite3VdbeSetColName(arg0: CValuesRef<Vdbe>?, arg1: Int, arg2: Int, @CCall.CString arg3: String?, arg4: CPointer<CFunction<(COpaquePointer?) -> Unit>>?): Int

@CCall("knifunptr_sqlite3397_sqlite3VdbeCountChanges")
external fun sqlite3VdbeCountChanges(arg0: CValuesRef<Vdbe>?): Unit

@CCall("knifunptr_sqlite3398_sqlite3VdbeDb")
external fun sqlite3VdbeDb(arg0: CValuesRef<Vdbe>?): CPointer<sqlite3>?

@CCall("knifunptr_sqlite3399_sqlite3VdbePrepareFlags")
external fun sqlite3VdbePrepareFlags(arg0: CValuesRef<Vdbe>?): u8

@CCall("knifunptr_sqlite3400_sqlite3VdbeSetSql")
external fun sqlite3VdbeSetSql(arg0: CValuesRef<Vdbe>?, @CCall.CString z: String?, n: Int, arg3: u8): Unit

@CCall("knifunptr_sqlite3401_sqlite3VdbeSwap")
external fun sqlite3VdbeSwap(arg0: CValuesRef<Vdbe>?, arg1: CValuesRef<Vdbe>?): Unit

@CCall("knifunptr_sqlite3402_sqlite3VdbeTakeOpArray")
external fun sqlite3VdbeTakeOpArray(arg0: CValuesRef<Vdbe>?, arg1: CValuesRef<IntVar>?, arg2: CValuesRef<IntVar>?): CPointer<VdbeOp>?

@CCall("knifunptr_sqlite3403_sqlite3VdbeGetBoundValue")
external fun sqlite3VdbeGetBoundValue(arg0: CValuesRef<Vdbe>?, arg1: Int, arg2: u8): CPointer<sqlite3_value>?

@CCall("knifunptr_sqlite3404_sqlite3VdbeSetVarmask")
external fun sqlite3VdbeSetVarmask(arg0: CValuesRef<Vdbe>?, arg1: Int): Unit

@CCall("knifunptr_sqlite3405_sqlite3VdbeExpandSql")
external fun sqlite3VdbeExpandSql(arg0: CValuesRef<Vdbe>?, @CCall.CString arg1: String?): CPointer<ByteVar>?

@CCall("knifunptr_sqlite3406_sqlite3MemCompare")
external fun sqlite3MemCompare(arg0: CValuesRef<Mem>?, arg1: CValuesRef<Mem>?, arg2: CValuesRef<CollSeq>?): Int

@CCall("knifunptr_sqlite3407_sqlite3BlobCompare")
external fun sqlite3BlobCompare(arg0: CValuesRef<Mem>?, arg1: CValuesRef<Mem>?): Int

@CCall("knifunptr_sqlite3408_sqlite3VdbeRecordUnpack")
external fun sqlite3VdbeRecordUnpack(arg0: CValuesRef<KeyInfo>?, arg1: Int, arg2: CValuesRef<*>?, arg3: CValuesRef<UnpackedRecord>?): Unit

@CCall("knifunptr_sqlite3409_sqlite3VdbeRecordCompare")
external fun sqlite3VdbeRecordCompare(arg0: Int, arg1: CValuesRef<*>?, arg2: CValuesRef<UnpackedRecord>?): Int

@CCall("knifunptr_sqlite3410_sqlite3VdbeRecordCompareWithSkip")
external fun sqlite3VdbeRecordCompareWithSkip(arg0: Int, arg1: CValuesRef<*>?, arg2: CValuesRef<UnpackedRecord>?, arg3: Int): Int

@CCall("knifunptr_sqlite3411_sqlite3VdbeAllocUnpackedRecord")
external fun sqlite3VdbeAllocUnpackedRecord(arg0: CValuesRef<KeyInfo>?): CPointer<UnpackedRecord>?

@CCall("knifunptr_sqlite3412_sqlite3VdbeFindCompare")
external fun sqlite3VdbeFindCompare(arg0: CValuesRef<UnpackedRecord>?): RecordCompare?

@CCall("knifunptr_sqlite3413_sqlite3VdbeLinkSubProgram")
external fun sqlite3VdbeLinkSubProgram(arg0: CValuesRef<Vdbe>?, arg1: CValuesRef<SubProgram>?): Unit

@CCall("knifunptr_sqlite3414_sqlite3NotPureFunc")
external fun sqlite3NotPureFunc(arg0: CValuesRef<sqlite3_context>?): Int

@CCall("knifunptr_sqlite3415_sqlite3PagerOpen")
external fun sqlite3PagerOpen(arg0: CValuesRef<sqlite3_vfs>?, ppPager: CValuesRef<CPointerVar<Pager>>?, @CCall.CString arg2: String?, arg3: Int, arg4: Int, arg5: Int, arg6: CPointer<CFunction<(CPointer<DbPage>?) -> Unit>>?): Int

@CCall("knifunptr_sqlite3416_sqlite3PagerClose")
external fun sqlite3PagerClose(pPager: CValuesRef<Pager>?, arg1: CValuesRef<sqlite3>?): Int

@CCall("knifunptr_sqlite3417_sqlite3PagerReadFileheader")
external fun sqlite3PagerReadFileheader(arg0: CValuesRef<Pager>?, arg1: Int, arg2: CValuesRef<UByteVar>?): Int

@CCall("knifunptr_sqlite3418_sqlite3PagerSetBusyHandler")
external fun sqlite3PagerSetBusyHandler(arg0: CValuesRef<Pager>?, arg1: CPointer<CFunction<(COpaquePointer?) -> Int>>?, arg2: CValuesRef<*>?): Unit

@CCall("knifunptr_sqlite3419_sqlite3PagerSetPagesize")
external fun sqlite3PagerSetPagesize(arg0: CValuesRef<Pager>?, arg1: CValuesRef<u32Var>?, arg2: Int): Int

@CCall("knifunptr_sqlite3420_sqlite3PagerMaxPageCount")
external fun sqlite3PagerMaxPageCount(arg0: CValuesRef<Pager>?, arg1: Int): Int

@CCall("knifunptr_sqlite3421_sqlite3PagerSetCachesize")
external fun sqlite3PagerSetCachesize(arg0: CValuesRef<Pager>?, arg1: Int): Unit

@CCall("knifunptr_sqlite3422_sqlite3PagerSetSpillsize")
external fun sqlite3PagerSetSpillsize(arg0: CValuesRef<Pager>?, arg1: Int): Int

@CCall("knifunptr_sqlite3423_sqlite3PagerSetMmapLimit")
external fun sqlite3PagerSetMmapLimit(arg0: CValuesRef<Pager>?, arg1: sqlite3_int64): Unit

@CCall("knifunptr_sqlite3424_sqlite3PagerShrink")
external fun sqlite3PagerShrink(arg0: CValuesRef<Pager>?): Unit

@CCall("knifunptr_sqlite3425_sqlite3PagerSetFlags")
external fun sqlite3PagerSetFlags(arg0: CValuesRef<Pager>?, arg1: UInt): Unit

@CCall("knifunptr_sqlite3426_sqlite3PagerLockingMode")
external fun sqlite3PagerLockingMode(arg0: CValuesRef<Pager>?, arg1: Int): Int

@CCall("knifunptr_sqlite3427_sqlite3PagerSetJournalMode")
external fun sqlite3PagerSetJournalMode(arg0: CValuesRef<Pager>?, arg1: Int): Int

@CCall("knifunptr_sqlite3428_sqlite3PagerGetJournalMode")
external fun sqlite3PagerGetJournalMode(arg0: CValuesRef<Pager>?): Int

@CCall("knifunptr_sqlite3429_sqlite3PagerOkToChangeJournalMode")
external fun sqlite3PagerOkToChangeJournalMode(arg0: CValuesRef<Pager>?): Int

@CCall("knifunptr_sqlite3430_sqlite3PagerJournalSizeLimit")
external fun sqlite3PagerJournalSizeLimit(arg0: CValuesRef<Pager>?, arg1: i64): i64

@CCall("knifunptr_sqlite3431_sqlite3PagerBackupPtr")
external fun sqlite3PagerBackupPtr(arg0: CValuesRef<Pager>?): CPointer<CPointerVar<sqlite3_backup>>?

@CCall("knifunptr_sqlite3432_sqlite3PagerFlush")
external fun sqlite3PagerFlush(arg0: CValuesRef<Pager>?): Int

@CCall("knifunptr_sqlite3433_sqlite3PagerGet")
external fun sqlite3PagerGet(pPager: CValuesRef<Pager>?, pgno: Pgno, ppPage: CValuesRef<CPointerVar<DbPage>>?, clrFlag: Int): Int

@CCall("knifunptr_sqlite3434_sqlite3PagerLookup")
external fun sqlite3PagerLookup(pPager: CValuesRef<Pager>?, pgno: Pgno): CPointer<DbPage>?

@CCall("knifunptr_sqlite3435_sqlite3PagerRef")
external fun sqlite3PagerRef(arg0: CValuesRef<DbPage>?): Unit

@CCall("knifunptr_sqlite3436_sqlite3PagerUnref")
external fun sqlite3PagerUnref(arg0: CValuesRef<DbPage>?): Unit

@CCall("knifunptr_sqlite3437_sqlite3PagerUnrefNotNull")
external fun sqlite3PagerUnrefNotNull(arg0: CValuesRef<DbPage>?): Unit

@CCall("knifunptr_sqlite3438_sqlite3PagerUnrefPageOne")
external fun sqlite3PagerUnrefPageOne(arg0: CValuesRef<DbPage>?): Unit

@CCall("knifunptr_sqlite3439_sqlite3PagerWrite")
external fun sqlite3PagerWrite(arg0: CValuesRef<DbPage>?): Int

@CCall("knifunptr_sqlite3440_sqlite3PagerDontWrite")
external fun sqlite3PagerDontWrite(arg0: CValuesRef<DbPage>?): Unit

@CCall("knifunptr_sqlite3441_sqlite3PagerMovepage")
external fun sqlite3PagerMovepage(arg0: CValuesRef<Pager>?, arg1: CValuesRef<DbPage>?, arg2: Pgno, arg3: Int): Int

@CCall("knifunptr_sqlite3442_sqlite3PagerPageRefcount")
external fun sqlite3PagerPageRefcount(arg0: CValuesRef<DbPage>?): Int

@CCall("knifunptr_sqlite3443_sqlite3PagerGetData")
external fun sqlite3PagerGetData(arg0: CValuesRef<DbPage>?): COpaquePointer?

@CCall("knifunptr_sqlite3444_sqlite3PagerGetExtra")
external fun sqlite3PagerGetExtra(arg0: CValuesRef<DbPage>?): COpaquePointer?

@CCall("knifunptr_sqlite3445_sqlite3PagerPagecount")
external fun sqlite3PagerPagecount(arg0: CValuesRef<Pager>?, arg1: CValuesRef<IntVar>?): Unit

@CCall("knifunptr_sqlite3446_sqlite3PagerBegin")
external fun sqlite3PagerBegin(arg0: CValuesRef<Pager>?, exFlag: Int, arg2: Int): Int

@CCall("knifunptr_sqlite3447_sqlite3PagerCommitPhaseOne")
external fun sqlite3PagerCommitPhaseOne(arg0: CValuesRef<Pager>?, @CCall.CString zMaster: String?, arg2: Int): Int

@CCall("knifunptr_sqlite3448_sqlite3PagerExclusiveLock")
external fun sqlite3PagerExclusiveLock(arg0: CValuesRef<Pager>?): Int

@CCall("knifunptr_sqlite3449_sqlite3PagerSync")
external fun sqlite3PagerSync(pPager: CValuesRef<Pager>?, @CCall.CString zMaster: String?): Int

@CCall("knifunptr_sqlite3450_sqlite3PagerCommitPhaseTwo")
external fun sqlite3PagerCommitPhaseTwo(arg0: CValuesRef<Pager>?): Int

@CCall("knifunptr_sqlite3451_sqlite3PagerRollback")
external fun sqlite3PagerRollback(arg0: CValuesRef<Pager>?): Int

@CCall("knifunptr_sqlite3452_sqlite3PagerOpenSavepoint")
external fun sqlite3PagerOpenSavepoint(pPager: CValuesRef<Pager>?, n: Int): Int

@CCall("knifunptr_sqlite3453_sqlite3PagerSavepoint")
external fun sqlite3PagerSavepoint(pPager: CValuesRef<Pager>?, op: Int, iSavepoint: Int): Int

@CCall("knifunptr_sqlite3454_sqlite3PagerSharedLock")
external fun sqlite3PagerSharedLock(pPager: CValuesRef<Pager>?): Int

@CCall("knifunptr_sqlite3455_sqlite3PagerCheckpoint")
external fun sqlite3PagerCheckpoint(pPager: CValuesRef<Pager>?, arg1: CValuesRef<sqlite3>?, arg2: Int, arg3: CValuesRef<IntVar>?, arg4: CValuesRef<IntVar>?): Int

@CCall("knifunptr_sqlite3456_sqlite3PagerWalSupported")
external fun sqlite3PagerWalSupported(pPager: CValuesRef<Pager>?): Int

@CCall("knifunptr_sqlite3457_sqlite3PagerWalCallback")
external fun sqlite3PagerWalCallback(pPager: CValuesRef<Pager>?): Int

@CCall("knifunptr_sqlite3458_sqlite3PagerOpenWal")
external fun sqlite3PagerOpenWal(pPager: CValuesRef<Pager>?, pisOpen: CValuesRef<IntVar>?): Int

@CCall("knifunptr_sqlite3459_sqlite3PagerCloseWal")
external fun sqlite3PagerCloseWal(pPager: CValuesRef<Pager>?, arg1: CValuesRef<sqlite3>?): Int

@CCall("knifunptr_sqlite3460_sqlite3PagerIsreadonly")
external fun sqlite3PagerIsreadonly(arg0: CValuesRef<Pager>?): u8

@CCall("knifunptr_sqlite3461_sqlite3PagerDataVersion")
external fun sqlite3PagerDataVersion(arg0: CValuesRef<Pager>?): u32

@CCall("knifunptr_sqlite3462_sqlite3PagerMemUsed")
external fun sqlite3PagerMemUsed(arg0: CValuesRef<Pager>?): Int

@CCall("knifunptr_sqlite3463_sqlite3PagerFilename")
external fun sqlite3PagerFilename(arg0: CValuesRef<Pager>?, arg1: Int): CPointer<ByteVar>?

@CCall("knifunptr_sqlite3464_sqlite3PagerVfs")
external fun sqlite3PagerVfs(arg0: CValuesRef<Pager>?): CPointer<sqlite3_vfs>?

@CCall("knifunptr_sqlite3465_sqlite3PagerFile")
external fun sqlite3PagerFile(arg0: CValuesRef<Pager>?): CPointer<sqlite3_file>?

@CCall("knifunptr_sqlite3466_sqlite3PagerJrnlFile")
external fun sqlite3PagerJrnlFile(arg0: CValuesRef<Pager>?): CPointer<sqlite3_file>?

@CCall("knifunptr_sqlite3467_sqlite3PagerJournalname")
external fun sqlite3PagerJournalname(arg0: CValuesRef<Pager>?): CPointer<ByteVar>?

@CCall("knifunptr_sqlite3468_sqlite3PagerTempSpace")
external fun sqlite3PagerTempSpace(arg0: CValuesRef<Pager>?): COpaquePointer?

@CCall("knifunptr_sqlite3469_sqlite3PagerIsMemdb")
external fun sqlite3PagerIsMemdb(arg0: CValuesRef<Pager>?): Int

@CCall("knifunptr_sqlite3470_sqlite3PagerCacheStat")
external fun sqlite3PagerCacheStat(arg0: CValuesRef<Pager>?, arg1: Int, arg2: Int, arg3: CValuesRef<IntVar>?): Unit

@CCall("knifunptr_sqlite3471_sqlite3PagerClearCache")
external fun sqlite3PagerClearCache(arg0: CValuesRef<Pager>?): Unit

@CCall("knifunptr_sqlite3472_sqlite3SectorSize")
external fun sqlite3SectorSize(arg0: CValuesRef<sqlite3_file>?): Int

@CCall("knifunptr_sqlite3473_sqlite3PagerTruncateImage")
external fun sqlite3PagerTruncateImage(arg0: CValuesRef<Pager>?, arg1: Pgno): Unit

@CCall("knifunptr_sqlite3474_sqlite3PagerRekey")
external fun sqlite3PagerRekey(arg0: CValuesRef<DbPage>?, arg1: Pgno, arg2: u16): Unit

@CCall("knifunptr_sqlite3475_sqlite3PcacheInitialize")
external fun sqlite3PcacheInitialize(): Int

@CCall("knifunptr_sqlite3476_sqlite3PcacheShutdown")
external fun sqlite3PcacheShutdown(): Unit

@CCall("knifunptr_sqlite3477_sqlite3PCacheBufferSetup")
external fun sqlite3PCacheBufferSetup(arg0: CValuesRef<*>?, sz: Int, n: Int): Unit

@CCall("knifunptr_sqlite3478_sqlite3PcacheOpen")
external fun sqlite3PcacheOpen(szPage: Int, szExtra: Int, bPurgeable: Int, xStress: CPointer<CFunction<(COpaquePointer?, CPointer<PgHdr>?) -> Int>>?, pStress: CValuesRef<*>?, pToInit: CValuesRef<PCache>?): Int

@CCall("knifunptr_sqlite3479_sqlite3PcacheSetPageSize")
external fun sqlite3PcacheSetPageSize(arg0: CValuesRef<PCache>?, arg1: Int): Int

@CCall("knifunptr_sqlite3480_sqlite3PcacheSize")
external fun sqlite3PcacheSize(): Int

@CCall("knifunptr_sqlite3481_sqlite3PcacheFetch")
external fun sqlite3PcacheFetch(arg0: CValuesRef<PCache>?, arg1: Pgno, createFlag: Int): CPointer<sqlite3_pcache_page>?

@CCall("knifunptr_sqlite3482_sqlite3PcacheFetchStress")
external fun sqlite3PcacheFetchStress(arg0: CValuesRef<PCache>?, arg1: Pgno, arg2: CValuesRef<CPointerVar<sqlite3_pcache_page>>?): Int

@CCall("knifunptr_sqlite3483_sqlite3PcacheFetchFinish")
external fun sqlite3PcacheFetchFinish(arg0: CValuesRef<PCache>?, arg1: Pgno, pPage: CValuesRef<sqlite3_pcache_page>?): CPointer<PgHdr>?

@CCall("knifunptr_sqlite3484_sqlite3PcacheRelease")
external fun sqlite3PcacheRelease(arg0: CValuesRef<PgHdr>?): Unit

@CCall("knifunptr_sqlite3485_sqlite3PcacheDrop")
external fun sqlite3PcacheDrop(arg0: CValuesRef<PgHdr>?): Unit

@CCall("knifunptr_sqlite3486_sqlite3PcacheMakeDirty")
external fun sqlite3PcacheMakeDirty(arg0: CValuesRef<PgHdr>?): Unit

@CCall("knifunptr_sqlite3487_sqlite3PcacheMakeClean")
external fun sqlite3PcacheMakeClean(arg0: CValuesRef<PgHdr>?): Unit

@CCall("knifunptr_sqlite3488_sqlite3PcacheCleanAll")
external fun sqlite3PcacheCleanAll(arg0: CValuesRef<PCache>?): Unit

@CCall("knifunptr_sqlite3489_sqlite3PcacheClearWritable")
external fun sqlite3PcacheClearWritable(arg0: CValuesRef<PCache>?): Unit

@CCall("knifunptr_sqlite3490_sqlite3PcacheMove")
external fun sqlite3PcacheMove(arg0: CValuesRef<PgHdr>?, arg1: Pgno): Unit

@CCall("knifunptr_sqlite3491_sqlite3PcacheTruncate")
external fun sqlite3PcacheTruncate(arg0: CValuesRef<PCache>?, x: Pgno): Unit

@CCall("knifunptr_sqlite3492_sqlite3PcacheDirtyList")
external fun sqlite3PcacheDirtyList(arg0: CValuesRef<PCache>?): CPointer<PgHdr>?

@CCall("knifunptr_sqlite3493_sqlite3PcacheClose")
external fun sqlite3PcacheClose(arg0: CValuesRef<PCache>?): Unit

@CCall("knifunptr_sqlite3494_sqlite3PcacheClearSyncFlags")
external fun sqlite3PcacheClearSyncFlags(arg0: CValuesRef<PCache>?): Unit

@CCall("knifunptr_sqlite3495_sqlite3PcacheClear")
external fun sqlite3PcacheClear(arg0: CValuesRef<PCache>?): Unit

@CCall("knifunptr_sqlite3496_sqlite3PcacheRefCount")
external fun sqlite3PcacheRefCount(arg0: CValuesRef<PCache>?): Int

@CCall("knifunptr_sqlite3497_sqlite3PcacheRef")
external fun sqlite3PcacheRef(arg0: CValuesRef<PgHdr>?): Unit

@CCall("knifunptr_sqlite3498_sqlite3PcachePageRefcount")
external fun sqlite3PcachePageRefcount(arg0: CValuesRef<PgHdr>?): Int

@CCall("knifunptr_sqlite3499_sqlite3PcachePagecount")
external fun sqlite3PcachePagecount(arg0: CValuesRef<PCache>?): Int

@CCall("knifunptr_sqlite3500_sqlite3PcacheSetCachesize")
external fun sqlite3PcacheSetCachesize(arg0: CValuesRef<PCache>?, arg1: Int): Unit

@CCall("knifunptr_sqlite3501_sqlite3PcacheSetSpillsize")
external fun sqlite3PcacheSetSpillsize(arg0: CValuesRef<PCache>?, arg1: Int): Int

@CCall("knifunptr_sqlite3502_sqlite3PcacheShrink")
external fun sqlite3PcacheShrink(arg0: CValuesRef<PCache>?): Unit

@CCall("knifunptr_sqlite3503_sqlite3PCacheSetDefault")
external fun sqlite3PCacheSetDefault(): Unit

@CCall("knifunptr_sqlite3504_sqlite3HeaderSizePcache")
external fun sqlite3HeaderSizePcache(): Int

@CCall("knifunptr_sqlite3505_sqlite3HeaderSizePcache1")
external fun sqlite3HeaderSizePcache1(): Int

@CCall("knifunptr_sqlite3506_sqlite3PCachePercentDirty")
external fun sqlite3PCachePercentDirty(arg0: CValuesRef<PCache>?): Int

@CCall("knifunptr_sqlite3507_sqlite3OsInit")
external fun sqlite3OsInit(): Int

@CCall("knifunptr_sqlite3508_sqlite3OsClose")
external fun sqlite3OsClose(arg0: CValuesRef<sqlite3_file>?): Unit

@CCall("knifunptr_sqlite3509_sqlite3OsRead")
external fun sqlite3OsRead(arg0: CValuesRef<sqlite3_file>?, arg1: CValuesRef<*>?, amt: Int, offset: i64): Int

@CCall("knifunptr_sqlite3510_sqlite3OsWrite")
external fun sqlite3OsWrite(arg0: CValuesRef<sqlite3_file>?, arg1: CValuesRef<*>?, amt: Int, offset: i64): Int

@CCall("knifunptr_sqlite3511_sqlite3OsTruncate")
external fun sqlite3OsTruncate(arg0: CValuesRef<sqlite3_file>?, size: i64): Int

@CCall("knifunptr_sqlite3512_sqlite3OsSync")
external fun sqlite3OsSync(arg0: CValuesRef<sqlite3_file>?, arg1: Int): Int

@CCall("knifunptr_sqlite3513_sqlite3OsFileSize")
external fun sqlite3OsFileSize(arg0: CValuesRef<sqlite3_file>?, pSize: CValuesRef<i64Var>?): Int

@CCall("knifunptr_sqlite3514_sqlite3OsLock")
external fun sqlite3OsLock(arg0: CValuesRef<sqlite3_file>?, arg1: Int): Int

@CCall("knifunptr_sqlite3515_sqlite3OsUnlock")
external fun sqlite3OsUnlock(arg0: CValuesRef<sqlite3_file>?, arg1: Int): Int

@CCall("knifunptr_sqlite3516_sqlite3OsCheckReservedLock")
external fun sqlite3OsCheckReservedLock(id: CValuesRef<sqlite3_file>?, pResOut: CValuesRef<IntVar>?): Int

@CCall("knifunptr_sqlite3517_sqlite3OsFileControl")
external fun sqlite3OsFileControl(arg0: CValuesRef<sqlite3_file>?, arg1: Int, arg2: CValuesRef<*>?): Int

@CCall("knifunptr_sqlite3518_sqlite3OsFileControlHint")
external fun sqlite3OsFileControlHint(arg0: CValuesRef<sqlite3_file>?, arg1: Int, arg2: CValuesRef<*>?): Unit

@CCall("knifunptr_sqlite3519_sqlite3OsSectorSize")
external fun sqlite3OsSectorSize(id: CValuesRef<sqlite3_file>?): Int

@CCall("knifunptr_sqlite3520_sqlite3OsDeviceCharacteristics")
external fun sqlite3OsDeviceCharacteristics(id: CValuesRef<sqlite3_file>?): Int

@CCall("knifunptr_sqlite3521_sqlite3OsShmMap")
external fun sqlite3OsShmMap(arg0: CValuesRef<sqlite3_file>?, arg1: Int, arg2: Int, arg3: Int, arg4: CValuesRef<COpaquePointerVar>?): Int

@CCall("knifunptr_sqlite3522_sqlite3OsShmLock")
external fun sqlite3OsShmLock(id: CValuesRef<sqlite3_file>?, arg1: Int, arg2: Int, arg3: Int): Int

@CCall("knifunptr_sqlite3523_sqlite3OsShmBarrier")
external fun sqlite3OsShmBarrier(id: CValuesRef<sqlite3_file>?): Unit

@CCall("knifunptr_sqlite3524_sqlite3OsShmUnmap")
external fun sqlite3OsShmUnmap(id: CValuesRef<sqlite3_file>?, arg1: Int): Int

@CCall("knifunptr_sqlite3525_sqlite3OsFetch")
external fun sqlite3OsFetch(id: CValuesRef<sqlite3_file>?, arg1: i64, arg2: Int, arg3: CValuesRef<COpaquePointerVar>?): Int

@CCall("knifunptr_sqlite3526_sqlite3OsUnfetch")
external fun sqlite3OsUnfetch(arg0: CValuesRef<sqlite3_file>?, arg1: i64, arg2: CValuesRef<*>?): Int

@CCall("knifunptr_sqlite3527_sqlite3OsOpen")
external fun sqlite3OsOpen(arg0: CValuesRef<sqlite3_vfs>?, @CCall.CString arg1: String?, arg2: CValuesRef<sqlite3_file>?, arg3: Int, arg4: CValuesRef<IntVar>?): Int

@CCall("knifunptr_sqlite3528_sqlite3OsDelete")
external fun sqlite3OsDelete(arg0: CValuesRef<sqlite3_vfs>?, @CCall.CString arg1: String?, arg2: Int): Int

@CCall("knifunptr_sqlite3529_sqlite3OsAccess")
external fun sqlite3OsAccess(arg0: CValuesRef<sqlite3_vfs>?, @CCall.CString arg1: String?, arg2: Int, pResOut: CValuesRef<IntVar>?): Int

@CCall("knifunptr_sqlite3530_sqlite3OsFullPathname")
external fun sqlite3OsFullPathname(arg0: CValuesRef<sqlite3_vfs>?, @CCall.CString arg1: String?, arg2: Int, arg3: CValuesRef<ByteVar>?): Int

@CCall("knifunptr_sqlite3531_sqlite3OsDlOpen")
external fun sqlite3OsDlOpen(arg0: CValuesRef<sqlite3_vfs>?, @CCall.CString arg1: String?): COpaquePointer?

@CCall("knifunptr_sqlite3532_sqlite3OsDlError")
external fun sqlite3OsDlError(arg0: CValuesRef<sqlite3_vfs>?, arg1: Int, arg2: CValuesRef<ByteVar>?): Unit

@CCall("knifunptr_sqlite3533_sqlite3OsDlSym")
external fun sqlite3OsDlSym(arg0: CValuesRef<sqlite3_vfs>?, arg1: CValuesRef<*>?, @CCall.CString arg2: String?): CPointer<CFunction<() -> Unit>>?

@CCall("knifunptr_sqlite3534_sqlite3OsDlClose")
external fun sqlite3OsDlClose(arg0: CValuesRef<sqlite3_vfs>?, arg1: CValuesRef<*>?): Unit

@CCall("knifunptr_sqlite3535_sqlite3OsRandomness")
external fun sqlite3OsRandomness(arg0: CValuesRef<sqlite3_vfs>?, arg1: Int, arg2: CValuesRef<ByteVar>?): Int

@CCall("knifunptr_sqlite3536_sqlite3OsSleep")
external fun sqlite3OsSleep(arg0: CValuesRef<sqlite3_vfs>?, arg1: Int): Int

@CCall("knifunptr_sqlite3537_sqlite3OsGetLastError")
external fun sqlite3OsGetLastError(arg0: CValuesRef<sqlite3_vfs>?): Int

@CCall("knifunptr_sqlite3538_sqlite3OsCurrentTimeInt64")
external fun sqlite3OsCurrentTimeInt64(arg0: CValuesRef<sqlite3_vfs>?, arg1: CValuesRef<sqlite3_int64Var>?): Int

@CCall("knifunptr_sqlite3539_sqlite3OsOpenMalloc")
external fun sqlite3OsOpenMalloc(arg0: CValuesRef<sqlite3_vfs>?, @CCall.CString arg1: String?, arg2: CValuesRef<CPointerVar<sqlite3_file>>?, arg3: Int, arg4: CValuesRef<IntVar>?): Int

@CCall("knifunptr_sqlite3540_sqlite3OsCloseFree")
external fun sqlite3OsCloseFree(arg0: CValuesRef<sqlite3_file>?): Unit

@CCall("knifunptr_sqlite3541_sqlite3WalkExpr")
external fun sqlite3WalkExpr(arg0: CValuesRef<Walker>?, arg1: CValuesRef<Expr>?): Int

@CCall("knifunptr_sqlite3542_sqlite3WalkExprList")
external fun sqlite3WalkExprList(arg0: CValuesRef<Walker>?, arg1: CValuesRef<ExprList>?): Int

@CCall("knifunptr_sqlite3543_sqlite3WalkSelect")
external fun sqlite3WalkSelect(arg0: CValuesRef<Walker>?, arg1: CValuesRef<Select>?): Int

@CCall("knifunptr_sqlite3544_sqlite3WalkSelectExpr")
external fun sqlite3WalkSelectExpr(arg0: CValuesRef<Walker>?, arg1: CValuesRef<Select>?): Int

@CCall("knifunptr_sqlite3545_sqlite3WalkSelectFrom")
external fun sqlite3WalkSelectFrom(arg0: CValuesRef<Walker>?, arg1: CValuesRef<Select>?): Int

@CCall("knifunptr_sqlite3546_sqlite3ExprWalkNoop")
external fun sqlite3ExprWalkNoop(arg0: CValuesRef<Walker>?, arg1: CValuesRef<Expr>?): Int

@CCall("knifunptr_sqlite3547_sqlite3SelectWalkNoop")
external fun sqlite3SelectWalkNoop(arg0: CValuesRef<Walker>?, arg1: CValuesRef<Select>?): Int

@CCall("knifunptr_sqlite3548_sqlite3SelectWalkFail")
external fun sqlite3SelectWalkFail(arg0: CValuesRef<Walker>?, arg1: CValuesRef<Select>?): Int

@CCall("knifunptr_sqlite3549_sqlite3WindowDelete")
external fun sqlite3WindowDelete(arg0: CValuesRef<sqlite3>?, arg1: CValuesRef<Window>?): Unit

@CCall("knifunptr_sqlite3550_sqlite3WindowListDelete")
external fun sqlite3WindowListDelete(db: CValuesRef<sqlite3>?, p: CValuesRef<Window>?): Unit

@CCall("knifunptr_sqlite3551_sqlite3WindowAlloc")
external fun sqlite3WindowAlloc(arg0: CValuesRef<Parse>?, arg1: Int, arg2: Int, arg3: CValuesRef<Expr>?, arg4: Int, arg5: CValuesRef<Expr>?): CPointer<Window>?

@CCall("knifunptr_sqlite3552_sqlite3WindowAttach")
external fun sqlite3WindowAttach(arg0: CValuesRef<Parse>?, arg1: CValuesRef<Expr>?, arg2: CValuesRef<Window>?): Unit

@CCall("knifunptr_sqlite3553_sqlite3WindowCompare")
external fun sqlite3WindowCompare(arg0: CValuesRef<Parse>?, arg1: CValuesRef<Window>?, arg2: CValuesRef<Window>?): Int

@CCall("knifunptr_sqlite3554_sqlite3WindowCodeInit")
external fun sqlite3WindowCodeInit(arg0: CValuesRef<Parse>?, arg1: CValuesRef<Window>?): Unit

@CCall("knifunptr_sqlite3555_sqlite3WindowCodeStep")
external fun sqlite3WindowCodeStep(arg0: CValuesRef<Parse>?, arg1: CValuesRef<Select>?, arg2: CValuesRef<WhereInfo>?, arg3: Int, arg4: Int): Unit

@CCall("knifunptr_sqlite3556_sqlite3WindowRewrite")
external fun sqlite3WindowRewrite(arg0: CValuesRef<Parse>?, arg1: CValuesRef<Select>?): Int

@CCall("knifunptr_sqlite3557_sqlite3ExpandSubquery")
external fun sqlite3ExpandSubquery(arg0: CValuesRef<Parse>?, arg1: CValuesRef<SrcList_item>?): Int

@CCall("knifunptr_sqlite3558_sqlite3WindowUpdate")
external fun sqlite3WindowUpdate(arg0: CValuesRef<Parse>?, arg1: CValuesRef<Window>?, arg2: CValuesRef<Window>?, arg3: CValuesRef<FuncDef>?): Unit

@CCall("knifunptr_sqlite3559_sqlite3WindowDup")
external fun sqlite3WindowDup(db: CValuesRef<sqlite3>?, pOwner: CValuesRef<Expr>?, p: CValuesRef<Window>?): CPointer<Window>?

@CCall("knifunptr_sqlite3560_sqlite3WindowListDup")
external fun sqlite3WindowListDup(db: CValuesRef<sqlite3>?, p: CValuesRef<Window>?): CPointer<Window>?

@CCall("knifunptr_sqlite3561_sqlite3WindowFunctions")
external fun sqlite3WindowFunctions(): Unit

@CCall("knifunptr_sqlite3562_sqlite3ReportError")
external fun sqlite3ReportError(iErr: Int, lineno: Int, @CCall.CString zType: String?): Int

@CCall("knifunptr_sqlite3563_sqlite3CorruptError")
external fun sqlite3CorruptError(arg0: Int): Int

@CCall("knifunptr_sqlite3564_sqlite3MisuseError")
external fun sqlite3MisuseError(arg0: Int): Int

@CCall("knifunptr_sqlite3565_sqlite3CantopenError")
external fun sqlite3CantopenError(arg0: Int): Int

@CCall("knifunptr_sqlite3566_sqlite3IsIdChar")
external fun sqlite3IsIdChar(arg0: u8): Int

@CCall("knifunptr_sqlite3567_sqlite3StrICmp")
external fun sqlite3StrICmp(@CCall.CString arg0: String?, @CCall.CString arg1: String?): Int

@CCall("knifunptr_sqlite3568_sqlite3Strlen30")
external fun sqlite3Strlen30(@CCall.CString arg0: String?): Int

@CCall("knifunptr_sqlite3569_sqlite3ColumnType")
external fun sqlite3ColumnType(arg0: CValuesRef<Column>?, arg1: CValuesRef<ByteVar>?): CPointer<ByteVar>?

@CCall("knifunptr_sqlite3570_sqlite3MallocInit")
external fun sqlite3MallocInit(): Int

@CCall("knifunptr_sqlite3571_sqlite3MallocEnd")
external fun sqlite3MallocEnd(): Unit

@CCall("knifunptr_sqlite3572_sqlite3Malloc")
external fun sqlite3Malloc(arg0: u64): COpaquePointer?

@CCall("knifunptr_sqlite3573_sqlite3MallocZero")
external fun sqlite3MallocZero(arg0: u64): COpaquePointer?

@CCall("knifunptr_sqlite3574_sqlite3DbMallocZero")
external fun sqlite3DbMallocZero(arg0: CValuesRef<sqlite3>?, arg1: u64): COpaquePointer?

@CCall("knifunptr_sqlite3575_sqlite3DbMallocRaw")
external fun sqlite3DbMallocRaw(arg0: CValuesRef<sqlite3>?, arg1: u64): COpaquePointer?

@CCall("knifunptr_sqlite3576_sqlite3DbMallocRawNN")
external fun sqlite3DbMallocRawNN(arg0: CValuesRef<sqlite3>?, arg1: u64): COpaquePointer?

@CCall("knifunptr_sqlite3577_sqlite3DbStrDup")
external fun sqlite3DbStrDup(arg0: CValuesRef<sqlite3>?, @CCall.CString arg1: String?): CPointer<ByteVar>?

@CCall("knifunptr_sqlite3578_sqlite3DbStrNDup")
external fun sqlite3DbStrNDup(arg0: CValuesRef<sqlite3>?, @CCall.CString arg1: String?, arg2: u64): CPointer<ByteVar>?

@CCall("knifunptr_sqlite3579_sqlite3DbSpanDup")
external fun sqlite3DbSpanDup(arg0: CValuesRef<sqlite3>?, @CCall.CString arg1: String?, @CCall.CString arg2: String?): CPointer<ByteVar>?

@CCall("knifunptr_sqlite3580_sqlite3Realloc")
external fun sqlite3Realloc(arg0: CValuesRef<*>?, arg1: u64): COpaquePointer?

@CCall("knifunptr_sqlite3581_sqlite3DbReallocOrFree")
external fun sqlite3DbReallocOrFree(arg0: CValuesRef<sqlite3>?, arg1: CValuesRef<*>?, arg2: u64): COpaquePointer?

@CCall("knifunptr_sqlite3582_sqlite3DbRealloc")
external fun sqlite3DbRealloc(arg0: CValuesRef<sqlite3>?, arg1: CValuesRef<*>?, arg2: u64): COpaquePointer?

@CCall("knifunptr_sqlite3583_sqlite3DbFree")
external fun sqlite3DbFree(arg0: CValuesRef<sqlite3>?, arg1: CValuesRef<*>?): Unit

@CCall("knifunptr_sqlite3584_sqlite3DbFreeNN")
external fun sqlite3DbFreeNN(arg0: CValuesRef<sqlite3>?, arg1: CValuesRef<*>?): Unit

@CCall("knifunptr_sqlite3585_sqlite3MallocSize")
external fun sqlite3MallocSize(arg0: CValuesRef<*>?): Int

@CCall("knifunptr_sqlite3586_sqlite3DbMallocSize")
external fun sqlite3DbMallocSize(arg0: CValuesRef<sqlite3>?, arg1: CValuesRef<*>?): Int

@CCall("knifunptr_sqlite3587_sqlite3PageMalloc")
external fun sqlite3PageMalloc(arg0: Int): COpaquePointer?

@CCall("knifunptr_sqlite3588_sqlite3PageFree")
external fun sqlite3PageFree(arg0: CValuesRef<*>?): Unit

@CCall("knifunptr_sqlite3589_sqlite3MemSetDefault")
external fun sqlite3MemSetDefault(): Unit

@CCall("knifunptr_sqlite3590_sqlite3BenignMallocHooks")
external fun sqlite3BenignMallocHooks(arg0: CPointer<CFunction<() -> Unit>>?, arg1: CPointer<CFunction<() -> Unit>>?): Unit

@CCall("knifunptr_sqlite3591_sqlite3HeapNearlyFull")
external fun sqlite3HeapNearlyFull(): Int

@CCall("knifunptr_sqlite3592_sqlite3DefaultMutex")
external fun sqlite3DefaultMutex(): CPointer<sqlite3_mutex_methods>?

@CCall("knifunptr_sqlite3593_sqlite3NoopMutex")
external fun sqlite3NoopMutex(): CPointer<sqlite3_mutex_methods>?

@CCall("knifunptr_sqlite3594_sqlite3MutexAlloc")
external fun sqlite3MutexAlloc(arg0: Int): CPointer<sqlite3_mutex>?

@CCall("knifunptr_sqlite3595_sqlite3MutexInit")
external fun sqlite3MutexInit(): Int

@CCall("knifunptr_sqlite3596_sqlite3MutexEnd")
external fun sqlite3MutexEnd(): Int

@CCall("knifunptr_sqlite3597_sqlite3MemoryBarrier")
external fun sqlite3MemoryBarrier(): Unit

@CCall("knifunptr_sqlite3598_sqlite3StatusValue")
external fun sqlite3StatusValue(arg0: Int): sqlite3_int64

@CCall("knifunptr_sqlite3599_sqlite3StatusUp")
external fun sqlite3StatusUp(arg0: Int, arg1: Int): Unit

@CCall("knifunptr_sqlite3600_sqlite3StatusDown")
external fun sqlite3StatusDown(arg0: Int, arg1: Int): Unit

@CCall("knifunptr_sqlite3601_sqlite3StatusHighwater")
external fun sqlite3StatusHighwater(arg0: Int, arg1: Int): Unit

@CCall("knifunptr_sqlite3602_sqlite3LookasideUsed")
external fun sqlite3LookasideUsed(arg0: CValuesRef<sqlite3>?, arg1: CValuesRef<IntVar>?): Int

@CCall("knifunptr_sqlite3603_sqlite3Pcache1Mutex")
external fun sqlite3Pcache1Mutex(): CPointer<sqlite3_mutex>?

@CCall("knifunptr_sqlite3604_sqlite3MallocMutex")
external fun sqlite3MallocMutex(): CPointer<sqlite3_mutex>?

@CCall("knifunptr_sqlite3605_sqlite3IsNaN")
external fun sqlite3IsNaN(arg0: Double): Int

@CCall("knifunptr_sqlite3606_sqlite3MPrintf")
external fun sqlite3MPrintf(arg0: CValuesRef<sqlite3>?, @CCall.CString arg1: String?, vararg variadicArguments: Any?): CPointer<ByteVar>?

@CCall("knifunptr_sqlite3607_sqlite3VMPrintf")
external fun sqlite3VMPrintf(arg0: CValuesRef<sqlite3>?, @CCall.CString arg1: String?, arg2: va_list?): CPointer<ByteVar>?

@CCall("knifunptr_sqlite3608_sqlite3SetString")
external fun sqlite3SetString(arg0: CValuesRef<CPointerVar<ByteVar>>?, arg1: CValuesRef<sqlite3>?, @CCall.CString arg2: String?): Unit

@CCall("knifunptr_sqlite3609_sqlite3ErrorMsg")
external fun sqlite3ErrorMsg(arg0: CValuesRef<Parse>?, @CCall.CString arg1: String?, vararg variadicArguments: Any?): Unit

@CCall("knifunptr_sqlite3610_sqlite3Dequote")
external fun sqlite3Dequote(arg0: CValuesRef<ByteVar>?): Unit

@CCall("knifunptr_sqlite3611_sqlite3DequoteExpr")
external fun sqlite3DequoteExpr(arg0: CValuesRef<Expr>?): Unit

@CCall("knifunptr_sqlite3612_sqlite3TokenInit")
external fun sqlite3TokenInit(arg0: CValuesRef<Token>?, arg1: CValuesRef<ByteVar>?): Unit

@CCall("knifunptr_sqlite3613_sqlite3KeywordCode")
external fun sqlite3KeywordCode(arg0: CValuesRef<UByteVar>?, arg1: Int): Int

@CCall("knifunptr_sqlite3614_sqlite3RunParser")
external fun sqlite3RunParser(arg0: CValuesRef<Parse>?, @CCall.CString arg1: String?, arg2: CValuesRef<CPointerVar<ByteVar>>?): Int

@CCall("knifunptr_sqlite3615_sqlite3FinishCoding")
external fun sqlite3FinishCoding(arg0: CValuesRef<Parse>?): Unit

@CCall("knifunptr_sqlite3616_sqlite3GetTempReg")
external fun sqlite3GetTempReg(arg0: CValuesRef<Parse>?): Int

@CCall("knifunptr_sqlite3617_sqlite3ReleaseTempReg")
external fun sqlite3ReleaseTempReg(arg0: CValuesRef<Parse>?, arg1: Int): Unit

@CCall("knifunptr_sqlite3618_sqlite3GetTempRange")
external fun sqlite3GetTempRange(arg0: CValuesRef<Parse>?, arg1: Int): Int

@CCall("knifunptr_sqlite3619_sqlite3ReleaseTempRange")
external fun sqlite3ReleaseTempRange(arg0: CValuesRef<Parse>?, arg1: Int, arg2: Int): Unit

@CCall("knifunptr_sqlite3620_sqlite3ClearTempRegCache")
external fun sqlite3ClearTempRegCache(arg0: CValuesRef<Parse>?): Unit

@CCall("knifunptr_sqlite3621_sqlite3ExprAlloc")
external fun sqlite3ExprAlloc(arg0: CValuesRef<sqlite3>?, arg1: Int, arg2: CValuesRef<Token>?, arg3: Int): CPointer<Expr>?

@CCall("knifunptr_sqlite3622_sqlite3Expr")
external fun sqlite3Expr(arg0: CValuesRef<sqlite3>?, arg1: Int, @CCall.CString arg2: String?): CPointer<Expr>?

@CCall("knifunptr_sqlite3623_sqlite3ExprAttachSubtrees")
external fun sqlite3ExprAttachSubtrees(arg0: CValuesRef<sqlite3>?, arg1: CValuesRef<Expr>?, arg2: CValuesRef<Expr>?, arg3: CValuesRef<Expr>?): Unit

@CCall("knifunptr_sqlite3624_sqlite3PExpr")
external fun sqlite3PExpr(arg0: CValuesRef<Parse>?, arg1: Int, arg2: CValuesRef<Expr>?, arg3: CValuesRef<Expr>?): CPointer<Expr>?

@CCall("knifunptr_sqlite3625_sqlite3PExprAddSelect")
external fun sqlite3PExprAddSelect(arg0: CValuesRef<Parse>?, arg1: CValuesRef<Expr>?, arg2: CValuesRef<Select>?): Unit

@CCall("knifunptr_sqlite3626_sqlite3ExprAnd")
external fun sqlite3ExprAnd(arg0: CValuesRef<sqlite3>?, arg1: CValuesRef<Expr>?, arg2: CValuesRef<Expr>?): CPointer<Expr>?

@CCall("knifunptr_sqlite3627_sqlite3ExprFunction")
external fun sqlite3ExprFunction(arg0: CValuesRef<Parse>?, arg1: CValuesRef<ExprList>?, arg2: CValuesRef<Token>?, arg3: Int): CPointer<Expr>?

@CCall("knifunptr_sqlite3628_sqlite3ExprAssignVarNumber")
external fun sqlite3ExprAssignVarNumber(arg0: CValuesRef<Parse>?, arg1: CValuesRef<Expr>?, arg2: u32): Unit

@CCall("knifunptr_sqlite3629_sqlite3ExprDelete")
external fun sqlite3ExprDelete(arg0: CValuesRef<sqlite3>?, arg1: CValuesRef<Expr>?): Unit

@CCall("knifunptr_sqlite3630_sqlite3ExprListAppend")
external fun sqlite3ExprListAppend(arg0: CValuesRef<Parse>?, arg1: CValuesRef<ExprList>?, arg2: CValuesRef<Expr>?): CPointer<ExprList>?

@CCall("knifunptr_sqlite3631_sqlite3ExprListAppendVector")
external fun sqlite3ExprListAppendVector(arg0: CValuesRef<Parse>?, arg1: CValuesRef<ExprList>?, arg2: CValuesRef<IdList>?, arg3: CValuesRef<Expr>?): CPointer<ExprList>?

@CCall("knifunptr_sqlite3632_sqlite3ExprListSetSortOrder")
external fun sqlite3ExprListSetSortOrder(arg0: CValuesRef<ExprList>?, arg1: Int): Unit

@CCall("knifunptr_sqlite3633_sqlite3ExprListSetName")
external fun sqlite3ExprListSetName(arg0: CValuesRef<Parse>?, arg1: CValuesRef<ExprList>?, arg2: CValuesRef<Token>?, arg3: Int): Unit

@CCall("knifunptr_sqlite3634_sqlite3ExprListSetSpan")
external fun sqlite3ExprListSetSpan(arg0: CValuesRef<Parse>?, arg1: CValuesRef<ExprList>?, @CCall.CString arg2: String?, @CCall.CString arg3: String?): Unit

@CCall("knifunptr_sqlite3635_sqlite3ExprListDelete")
external fun sqlite3ExprListDelete(arg0: CValuesRef<sqlite3>?, arg1: CValuesRef<ExprList>?): Unit

@CCall("knifunptr_sqlite3636_sqlite3ExprListFlags")
external fun sqlite3ExprListFlags(arg0: CValuesRef<ExprList>?): u32

@CCall("knifunptr_sqlite3637_sqlite3IndexHasDuplicateRootPage")
external fun sqlite3IndexHasDuplicateRootPage(arg0: CValuesRef<Index>?): Int

@CCall("knifunptr_sqlite3638_sqlite3Init")
external fun sqlite3Init(arg0: CValuesRef<sqlite3>?, arg1: CValuesRef<CPointerVar<ByteVar>>?): Int

@CCall("knifunptr_sqlite3639_sqlite3InitCallback")
external fun sqlite3InitCallback(arg0: CValuesRef<*>?, arg1: Int, arg2: CValuesRef<CPointerVar<ByteVar>>?, arg3: CValuesRef<CPointerVar<ByteVar>>?): Int

@CCall("knifunptr_sqlite3640_sqlite3InitOne")
external fun sqlite3InitOne(arg0: CValuesRef<sqlite3>?, arg1: Int, arg2: CValuesRef<CPointerVar<ByteVar>>?, arg3: u32): Int

@CCall("knifunptr_sqlite3641_sqlite3Pragma")
external fun sqlite3Pragma(arg0: CValuesRef<Parse>?, arg1: CValuesRef<Token>?, arg2: CValuesRef<Token>?, arg3: CValuesRef<Token>?, arg4: Int): Unit

@CCall("knifunptr_sqlite3642_sqlite3PragmaVtabRegister")
external fun sqlite3PragmaVtabRegister(arg0: CValuesRef<sqlite3>?, @CCall.CString zName: String?): CPointer<Module>?

@CCall("knifunptr_sqlite3643_sqlite3ResetAllSchemasOfConnection")
external fun sqlite3ResetAllSchemasOfConnection(arg0: CValuesRef<sqlite3>?): Unit

@CCall("knifunptr_sqlite3644_sqlite3ResetOneSchema")
external fun sqlite3ResetOneSchema(arg0: CValuesRef<sqlite3>?, arg1: Int): Unit

@CCall("knifunptr_sqlite3645_sqlite3CollapseDatabaseArray")
external fun sqlite3CollapseDatabaseArray(arg0: CValuesRef<sqlite3>?): Unit

@CCall("knifunptr_sqlite3646_sqlite3CommitInternalChanges")
external fun sqlite3CommitInternalChanges(arg0: CValuesRef<sqlite3>?): Unit

@CCall("knifunptr_sqlite3647_sqlite3DeleteColumnNames")
external fun sqlite3DeleteColumnNames(arg0: CValuesRef<sqlite3>?, arg1: CValuesRef<Table>?): Unit

@CCall("knifunptr_sqlite3648_sqlite3ColumnsFromExprList")
external fun sqlite3ColumnsFromExprList(arg0: CValuesRef<Parse>?, arg1: CValuesRef<ExprList>?, arg2: CValuesRef<i16Var>?, arg3: CValuesRef<CPointerVar<Column>>?): Int

@CCall("knifunptr_sqlite3649_sqlite3SelectAddColumnTypeAndCollation")
external fun sqlite3SelectAddColumnTypeAndCollation(arg0: CValuesRef<Parse>?, arg1: CValuesRef<Table>?, arg2: CValuesRef<Select>?): Unit

@CCall("knifunptr_sqlite3650_sqlite3ResultSetOfSelect")
external fun sqlite3ResultSetOfSelect(arg0: CValuesRef<Parse>?, arg1: CValuesRef<Select>?): CPointer<Table>?

@CCall("knifunptr_sqlite3651_sqlite3OpenMasterTable")
external fun sqlite3OpenMasterTable(arg0: CValuesRef<Parse>?, arg1: Int): Unit

@CCall("knifunptr_sqlite3652_sqlite3PrimaryKeyIndex")
external fun sqlite3PrimaryKeyIndex(arg0: CValuesRef<Table>?): CPointer<Index>?

@CCall("knifunptr_sqlite3653_sqlite3ColumnOfIndex")
external fun sqlite3ColumnOfIndex(arg0: CValuesRef<Index>?, arg1: i16): i16

@CCall("knifunptr_sqlite3654_sqlite3StartTable")
external fun sqlite3StartTable(arg0: CValuesRef<Parse>?, arg1: CValuesRef<Token>?, arg2: CValuesRef<Token>?, arg3: Int, arg4: Int, arg5: Int, arg6: Int): Unit

@CCall("knifunptr_sqlite3655_sqlite3AddColumn")
external fun sqlite3AddColumn(arg0: CValuesRef<Parse>?, arg1: CValuesRef<Token>?, arg2: CValuesRef<Token>?): Unit

@CCall("knifunptr_sqlite3656_sqlite3AddNotNull")
external fun sqlite3AddNotNull(arg0: CValuesRef<Parse>?, arg1: Int): Unit

@CCall("knifunptr_sqlite3657_sqlite3AddPrimaryKey")
external fun sqlite3AddPrimaryKey(arg0: CValuesRef<Parse>?, arg1: CValuesRef<ExprList>?, arg2: Int, arg3: Int, arg4: Int): Unit

@CCall("knifunptr_sqlite3658_sqlite3AddCheckConstraint")
external fun sqlite3AddCheckConstraint(arg0: CValuesRef<Parse>?, arg1: CValuesRef<Expr>?): Unit

@CCall("knifunptr_sqlite3659_sqlite3AddDefaultValue")
external fun sqlite3AddDefaultValue(arg0: CValuesRef<Parse>?, arg1: CValuesRef<Expr>?, @CCall.CString arg2: String?, @CCall.CString arg3: String?): Unit

@CCall("knifunptr_sqlite3660_sqlite3AddCollateType")
external fun sqlite3AddCollateType(arg0: CValuesRef<Parse>?, arg1: CValuesRef<Token>?): Unit

@CCall("knifunptr_sqlite3661_sqlite3EndTable")
external fun sqlite3EndTable(arg0: CValuesRef<Parse>?, arg1: CValuesRef<Token>?, arg2: CValuesRef<Token>?, arg3: u8, arg4: CValuesRef<Select>?): Unit

@CCall("knifunptr_sqlite3662_sqlite3ParseUri")
external fun sqlite3ParseUri(@CCall.CString arg0: String?, @CCall.CString arg1: String?, arg2: CValuesRef<UIntVar>?, arg3: CValuesRef<CPointerVar<sqlite3_vfs>>?, arg4: CValuesRef<CPointerVar<ByteVar>>?, arg5: CValuesRef<CPointerVar<ByteVar>>?): Int

@CCall("knifunptr_sqlite3663_sqlite3DbNameToBtree")
external fun sqlite3DbNameToBtree(arg0: CValuesRef<sqlite3>?, @CCall.CString arg1: String?): CPointer<Btree>?

@CCall("knifunptr_sqlite3664_sqlite3FaultSim")
external fun sqlite3FaultSim(arg0: Int): Int

@CCall("knifunptr_sqlite3665_sqlite3BitvecCreate")
external fun sqlite3BitvecCreate(arg0: u32): CPointer<Bitvec>?

@CCall("knifunptr_sqlite3666_sqlite3BitvecTest")
external fun sqlite3BitvecTest(arg0: CValuesRef<Bitvec>?, arg1: u32): Int

@CCall("knifunptr_sqlite3667_sqlite3BitvecTestNotNull")
external fun sqlite3BitvecTestNotNull(arg0: CValuesRef<Bitvec>?, arg1: u32): Int

@CCall("knifunptr_sqlite3668_sqlite3BitvecSet")
external fun sqlite3BitvecSet(arg0: CValuesRef<Bitvec>?, arg1: u32): Int

@CCall("knifunptr_sqlite3669_sqlite3BitvecClear")
external fun sqlite3BitvecClear(arg0: CValuesRef<Bitvec>?, arg1: u32, arg2: CValuesRef<*>?): Unit

@CCall("knifunptr_sqlite3670_sqlite3BitvecDestroy")
external fun sqlite3BitvecDestroy(arg0: CValuesRef<Bitvec>?): Unit

@CCall("knifunptr_sqlite3671_sqlite3BitvecSize")
external fun sqlite3BitvecSize(arg0: CValuesRef<Bitvec>?): u32

@CCall("knifunptr_sqlite3672_sqlite3BitvecBuiltinTest")
external fun sqlite3BitvecBuiltinTest(arg0: Int, arg1: CValuesRef<IntVar>?): Int

@CCall("knifunptr_sqlite3673_sqlite3RowSetInit")
external fun sqlite3RowSetInit(arg0: CValuesRef<sqlite3>?): CPointer<RowSet>?

@CCall("knifunptr_sqlite3674_sqlite3RowSetDelete")
external fun sqlite3RowSetDelete(arg0: CValuesRef<*>?): Unit

@CCall("knifunptr_sqlite3675_sqlite3RowSetClear")
external fun sqlite3RowSetClear(arg0: CValuesRef<*>?): Unit

@CCall("knifunptr_sqlite3676_sqlite3RowSetInsert")
external fun sqlite3RowSetInsert(arg0: CValuesRef<RowSet>?, arg1: i64): Unit

@CCall("knifunptr_sqlite3677_sqlite3RowSetTest")
external fun sqlite3RowSetTest(arg0: CValuesRef<RowSet>?, iBatch: Int, arg2: i64): Int

@CCall("knifunptr_sqlite3678_sqlite3RowSetNext")
external fun sqlite3RowSetNext(arg0: CValuesRef<RowSet>?, arg1: CValuesRef<i64Var>?): Int

@CCall("knifunptr_sqlite3679_sqlite3CreateView")
external fun sqlite3CreateView(arg0: CValuesRef<Parse>?, arg1: CValuesRef<Token>?, arg2: CValuesRef<Token>?, arg3: CValuesRef<Token>?, arg4: CValuesRef<ExprList>?, arg5: CValuesRef<Select>?, arg6: Int, arg7: Int): Unit

@CCall("knifunptr_sqlite3680_sqlite3ViewGetColumnNames")
external fun sqlite3ViewGetColumnNames(arg0: CValuesRef<Parse>?, arg1: CValuesRef<Table>?): Int

@CCall("knifunptr_sqlite3681_sqlite3DropTable")
external fun sqlite3DropTable(arg0: CValuesRef<Parse>?, arg1: CValuesRef<SrcList>?, arg2: Int, arg3: Int): Unit

@CCall("knifunptr_sqlite3682_sqlite3CodeDropTable")
external fun sqlite3CodeDropTable(arg0: CValuesRef<Parse>?, arg1: CValuesRef<Table>?, arg2: Int, arg3: Int): Unit

@CCall("knifunptr_sqlite3683_sqlite3DeleteTable")
external fun sqlite3DeleteTable(arg0: CValuesRef<sqlite3>?, arg1: CValuesRef<Table>?): Unit

@CCall("knifunptr_sqlite3684_sqlite3FreeIndex")
external fun sqlite3FreeIndex(arg0: CValuesRef<sqlite3>?, arg1: CValuesRef<Index>?): Unit

@CCall("knifunptr_sqlite3685_sqlite3AutoincrementBegin")
external fun sqlite3AutoincrementBegin(pParse: CValuesRef<Parse>?): Unit

@CCall("knifunptr_sqlite3686_sqlite3AutoincrementEnd")
external fun sqlite3AutoincrementEnd(pParse: CValuesRef<Parse>?): Unit

@CCall("knifunptr_sqlite3687_sqlite3Insert")
external fun sqlite3Insert(arg0: CValuesRef<Parse>?, arg1: CValuesRef<SrcList>?, arg2: CValuesRef<Select>?, arg3: CValuesRef<IdList>?, arg4: Int, arg5: CValuesRef<Upsert>?): Unit

@CCall("knifunptr_sqlite3688_sqlite3ArrayAllocate")
external fun sqlite3ArrayAllocate(arg0: CValuesRef<sqlite3>?, arg1: CValuesRef<*>?, arg2: Int, arg3: CValuesRef<IntVar>?, arg4: CValuesRef<IntVar>?): COpaquePointer?

@CCall("knifunptr_sqlite3689_sqlite3IdListAppend")
external fun sqlite3IdListAppend(arg0: CValuesRef<Parse>?, arg1: CValuesRef<IdList>?, arg2: CValuesRef<Token>?): CPointer<IdList>?

@CCall("knifunptr_sqlite3690_sqlite3IdListIndex")
external fun sqlite3IdListIndex(arg0: CValuesRef<IdList>?, @CCall.CString arg1: String?): Int

@CCall("knifunptr_sqlite3691_sqlite3SrcListEnlarge")
external fun sqlite3SrcListEnlarge(arg0: CValuesRef<Parse>?, arg1: CValuesRef<SrcList>?, arg2: Int, arg3: Int): CPointer<SrcList>?

@CCall("knifunptr_sqlite3692_sqlite3SrcListAppend")
external fun sqlite3SrcListAppend(arg0: CValuesRef<Parse>?, arg1: CValuesRef<SrcList>?, arg2: CValuesRef<Token>?, arg3: CValuesRef<Token>?): CPointer<SrcList>?

@CCall("knifunptr_sqlite3693_sqlite3SrcListAppendFromTerm")
external fun sqlite3SrcListAppendFromTerm(arg0: CValuesRef<Parse>?, arg1: CValuesRef<SrcList>?, arg2: CValuesRef<Token>?, arg3: CValuesRef<Token>?, arg4: CValuesRef<Token>?, arg5: CValuesRef<Select>?, arg6: CValuesRef<Expr>?, arg7: CValuesRef<IdList>?): CPointer<SrcList>?

@CCall("knifunptr_sqlite3694_sqlite3SrcListIndexedBy")
external fun sqlite3SrcListIndexedBy(arg0: CValuesRef<Parse>?, arg1: CValuesRef<SrcList>?, arg2: CValuesRef<Token>?): Unit

@CCall("knifunptr_sqlite3695_sqlite3SrcListFuncArgs")
external fun sqlite3SrcListFuncArgs(arg0: CValuesRef<Parse>?, arg1: CValuesRef<SrcList>?, arg2: CValuesRef<ExprList>?): Unit

@CCall("knifunptr_sqlite3696_sqlite3IndexedByLookup")
external fun sqlite3IndexedByLookup(arg0: CValuesRef<Parse>?, arg1: CValuesRef<SrcList_item>?): Int

@CCall("knifunptr_sqlite3697_sqlite3SrcListShiftJoinType")
external fun sqlite3SrcListShiftJoinType(arg0: CValuesRef<SrcList>?): Unit

@CCall("knifunptr_sqlite3698_sqlite3SrcListAssignCursors")
external fun sqlite3SrcListAssignCursors(arg0: CValuesRef<Parse>?, arg1: CValuesRef<SrcList>?): Unit

@CCall("knifunptr_sqlite3699_sqlite3IdListDelete")
external fun sqlite3IdListDelete(arg0: CValuesRef<sqlite3>?, arg1: CValuesRef<IdList>?): Unit

@CCall("knifunptr_sqlite3700_sqlite3SrcListDelete")
external fun sqlite3SrcListDelete(arg0: CValuesRef<sqlite3>?, arg1: CValuesRef<SrcList>?): Unit

@CCall("knifunptr_sqlite3701_sqlite3AllocateIndexObject")
external fun sqlite3AllocateIndexObject(arg0: CValuesRef<sqlite3>?, arg1: i16, arg2: Int, arg3: CValuesRef<CPointerVar<ByteVar>>?): CPointer<Index>?

@CCall("knifunptr_sqlite3702_sqlite3CreateIndex")
external fun sqlite3CreateIndex(arg0: CValuesRef<Parse>?, arg1: CValuesRef<Token>?, arg2: CValuesRef<Token>?, arg3: CValuesRef<SrcList>?, arg4: CValuesRef<ExprList>?, arg5: Int, arg6: CValuesRef<Token>?, arg7: CValuesRef<Expr>?, arg8: Int, arg9: Int, arg10: u8): Unit

@CCall("knifunptr_sqlite3703_sqlite3DropIndex")
external fun sqlite3DropIndex(arg0: CValuesRef<Parse>?, arg1: CValuesRef<SrcList>?, arg2: Int): Unit

@CCall("knifunptr_sqlite3704_sqlite3Select")
external fun sqlite3Select(arg0: CValuesRef<Parse>?, arg1: CValuesRef<Select>?, arg2: CValuesRef<SelectDest>?): Int

@CCall("knifunptr_sqlite3705_sqlite3SelectNew")
external fun sqlite3SelectNew(arg0: CValuesRef<Parse>?, arg1: CValuesRef<ExprList>?, arg2: CValuesRef<SrcList>?, arg3: CValuesRef<Expr>?, arg4: CValuesRef<ExprList>?, arg5: CValuesRef<Expr>?, arg6: CValuesRef<ExprList>?, arg7: u32, arg8: CValuesRef<Expr>?): CPointer<Select>?

@CCall("knifunptr_sqlite3706_sqlite3SelectDelete")
external fun sqlite3SelectDelete(arg0: CValuesRef<sqlite3>?, arg1: CValuesRef<Select>?): Unit

@CCall("knifunptr_sqlite3707_sqlite3SrcListLookup")
external fun sqlite3SrcListLookup(arg0: CValuesRef<Parse>?, arg1: CValuesRef<SrcList>?): CPointer<Table>?

@CCall("knifunptr_sqlite3708_sqlite3IsReadOnly")
external fun sqlite3IsReadOnly(arg0: CValuesRef<Parse>?, arg1: CValuesRef<Table>?, arg2: Int): Int

@CCall("knifunptr_sqlite3709_sqlite3OpenTable")
external fun sqlite3OpenTable(arg0: CValuesRef<Parse>?, iCur: Int, iDb: Int, arg3: CValuesRef<Table>?, arg4: Int): Unit

@CCall("knifunptr_sqlite3710_sqlite3DeleteFrom")
external fun sqlite3DeleteFrom(arg0: CValuesRef<Parse>?, arg1: CValuesRef<SrcList>?, arg2: CValuesRef<Expr>?, arg3: CValuesRef<ExprList>?, arg4: CValuesRef<Expr>?): Unit

@CCall("knifunptr_sqlite3711_sqlite3Update")
external fun sqlite3Update(arg0: CValuesRef<Parse>?, arg1: CValuesRef<SrcList>?, arg2: CValuesRef<ExprList>?, arg3: CValuesRef<Expr>?, arg4: Int, arg5: CValuesRef<ExprList>?, arg6: CValuesRef<Expr>?, arg7: CValuesRef<Upsert>?): Unit

@CCall("knifunptr_sqlite3712_sqlite3WhereBegin")
external fun sqlite3WhereBegin(arg0: CValuesRef<Parse>?, arg1: CValuesRef<SrcList>?, arg2: CValuesRef<Expr>?, arg3: CValuesRef<ExprList>?, arg4: CValuesRef<ExprList>?, arg5: u16, arg6: Int): CPointer<WhereInfo>?

@CCall("knifunptr_sqlite3713_sqlite3WhereEnd")
external fun sqlite3WhereEnd(arg0: CValuesRef<WhereInfo>?): Unit

@CCall("knifunptr_sqlite3714_sqlite3WhereOutputRowCount")
external fun sqlite3WhereOutputRowCount(arg0: CValuesRef<WhereInfo>?): LogEst

@CCall("knifunptr_sqlite3715_sqlite3WhereIsDistinct")
external fun sqlite3WhereIsDistinct(arg0: CValuesRef<WhereInfo>?): Int

@CCall("knifunptr_sqlite3716_sqlite3WhereIsOrdered")
external fun sqlite3WhereIsOrdered(arg0: CValuesRef<WhereInfo>?): Int

@CCall("knifunptr_sqlite3717_sqlite3WhereOrderByLimitOptLabel")
external fun sqlite3WhereOrderByLimitOptLabel(arg0: CValuesRef<WhereInfo>?): Int

@CCall("knifunptr_sqlite3718_sqlite3WhereIsSorted")
external fun sqlite3WhereIsSorted(arg0: CValuesRef<WhereInfo>?): Int

@CCall("knifunptr_sqlite3719_sqlite3WhereContinueLabel")
external fun sqlite3WhereContinueLabel(arg0: CValuesRef<WhereInfo>?): Int

@CCall("knifunptr_sqlite3720_sqlite3WhereBreakLabel")
external fun sqlite3WhereBreakLabel(arg0: CValuesRef<WhereInfo>?): Int

@CCall("knifunptr_sqlite3721_sqlite3WhereOkOnePass")
external fun sqlite3WhereOkOnePass(arg0: CValuesRef<WhereInfo>?, arg1: CValuesRef<IntVar>?): Int

@CCall("knifunptr_sqlite3722_sqlite3ExprCodeLoadIndexColumn")
external fun sqlite3ExprCodeLoadIndexColumn(arg0: CValuesRef<Parse>?, arg1: CValuesRef<Index>?, arg2: Int, arg3: Int, arg4: Int): Unit

@CCall("knifunptr_sqlite3723_sqlite3ExprCodeGetColumn")
external fun sqlite3ExprCodeGetColumn(arg0: CValuesRef<Parse>?, arg1: CValuesRef<Table>?, arg2: Int, arg3: Int, arg4: Int, arg5: u8): Int

@CCall("knifunptr_sqlite3724_sqlite3ExprCodeGetColumnOfTable")
external fun sqlite3ExprCodeGetColumnOfTable(arg0: CValuesRef<Vdbe>?, arg1: CValuesRef<Table>?, arg2: Int, arg3: Int, arg4: Int): Unit

@CCall("knifunptr_sqlite3725_sqlite3ExprCodeMove")
external fun sqlite3ExprCodeMove(arg0: CValuesRef<Parse>?, arg1: Int, arg2: Int, arg3: Int): Unit

@CCall("knifunptr_sqlite3726_sqlite3ExprCode")
external fun sqlite3ExprCode(arg0: CValuesRef<Parse>?, arg1: CValuesRef<Expr>?, arg2: Int): Unit

@CCall("knifunptr_sqlite3727_sqlite3ExprCodeCopy")
external fun sqlite3ExprCodeCopy(arg0: CValuesRef<Parse>?, arg1: CValuesRef<Expr>?, arg2: Int): Unit

@CCall("knifunptr_sqlite3728_sqlite3ExprCodeFactorable")
external fun sqlite3ExprCodeFactorable(arg0: CValuesRef<Parse>?, arg1: CValuesRef<Expr>?, arg2: Int): Unit

@CCall("knifunptr_sqlite3729_sqlite3ExprCodeAtInit")
external fun sqlite3ExprCodeAtInit(arg0: CValuesRef<Parse>?, arg1: CValuesRef<Expr>?, arg2: Int): Int

@CCall("knifunptr_sqlite3730_sqlite3ExprCodeTemp")
external fun sqlite3ExprCodeTemp(arg0: CValuesRef<Parse>?, arg1: CValuesRef<Expr>?, arg2: CValuesRef<IntVar>?): Int

@CCall("knifunptr_sqlite3731_sqlite3ExprCodeTarget")
external fun sqlite3ExprCodeTarget(arg0: CValuesRef<Parse>?, arg1: CValuesRef<Expr>?, arg2: Int): Int

@CCall("knifunptr_sqlite3732_sqlite3ExprCodeAndCache")
external fun sqlite3ExprCodeAndCache(arg0: CValuesRef<Parse>?, arg1: CValuesRef<Expr>?, arg2: Int): Unit

@CCall("knifunptr_sqlite3733_sqlite3ExprCodeExprList")
external fun sqlite3ExprCodeExprList(arg0: CValuesRef<Parse>?, arg1: CValuesRef<ExprList>?, arg2: Int, arg3: Int, arg4: u8): Int

@CCall("knifunptr_sqlite3734_sqlite3ExprIfTrue")
external fun sqlite3ExprIfTrue(arg0: CValuesRef<Parse>?, arg1: CValuesRef<Expr>?, arg2: Int, arg3: Int): Unit

@CCall("knifunptr_sqlite3735_sqlite3ExprIfFalse")
external fun sqlite3ExprIfFalse(arg0: CValuesRef<Parse>?, arg1: CValuesRef<Expr>?, arg2: Int, arg3: Int): Unit

@CCall("knifunptr_sqlite3736_sqlite3ExprIfFalseDup")
external fun sqlite3ExprIfFalseDup(arg0: CValuesRef<Parse>?, arg1: CValuesRef<Expr>?, arg2: Int, arg3: Int): Unit

@CCall("knifunptr_sqlite3737_sqlite3FindTable")
external fun sqlite3FindTable(arg0: CValuesRef<sqlite3>?, @CCall.CString arg1: String?, @CCall.CString arg2: String?): CPointer<Table>?

@CCall("knifunptr_sqlite3738_sqlite3LocateTable")
external fun sqlite3LocateTable(arg0: CValuesRef<Parse>?, flags: u32, @CCall.CString arg2: String?, @CCall.CString arg3: String?): CPointer<Table>?

@CCall("knifunptr_sqlite3739_sqlite3LocateTableItem")
external fun sqlite3LocateTableItem(arg0: CValuesRef<Parse>?, flags: u32, arg2: CValuesRef<SrcList_item>?): CPointer<Table>?

@CCall("knifunptr_sqlite3740_sqlite3FindIndex")
external fun sqlite3FindIndex(arg0: CValuesRef<sqlite3>?, @CCall.CString arg1: String?, @CCall.CString arg2: String?): CPointer<Index>?

@CCall("knifunptr_sqlite3741_sqlite3UnlinkAndDeleteTable")
external fun sqlite3UnlinkAndDeleteTable(arg0: CValuesRef<sqlite3>?, arg1: Int, @CCall.CString arg2: String?): Unit

@CCall("knifunptr_sqlite3742_sqlite3UnlinkAndDeleteIndex")
external fun sqlite3UnlinkAndDeleteIndex(arg0: CValuesRef<sqlite3>?, arg1: Int, @CCall.CString arg2: String?): Unit

@CCall("knifunptr_sqlite3743_sqlite3Vacuum")
external fun sqlite3Vacuum(arg0: CValuesRef<Parse>?, arg1: CValuesRef<Token>?, arg2: CValuesRef<Expr>?): Unit

@CCall("knifunptr_sqlite3744_sqlite3RunVacuum")
external fun sqlite3RunVacuum(arg0: CValuesRef<CPointerVar<ByteVar>>?, arg1: CValuesRef<sqlite3>?, arg2: Int, arg3: CValuesRef<sqlite3_value>?): Int

@CCall("knifunptr_sqlite3745_sqlite3NameFromToken")
external fun sqlite3NameFromToken(arg0: CValuesRef<sqlite3>?, arg1: CValuesRef<Token>?): CPointer<ByteVar>?

@CCall("knifunptr_sqlite3746_sqlite3ExprCompare")
external fun sqlite3ExprCompare(arg0: CValuesRef<Parse>?, arg1: CValuesRef<Expr>?, arg2: CValuesRef<Expr>?, arg3: Int): Int

@CCall("knifunptr_sqlite3747_sqlite3ExprCompareSkip")
external fun sqlite3ExprCompareSkip(arg0: CValuesRef<Expr>?, arg1: CValuesRef<Expr>?, arg2: Int): Int

@CCall("knifunptr_sqlite3748_sqlite3ExprListCompare")
external fun sqlite3ExprListCompare(arg0: CValuesRef<ExprList>?, arg1: CValuesRef<ExprList>?, arg2: Int): Int

@CCall("knifunptr_sqlite3749_sqlite3ExprImpliesExpr")
external fun sqlite3ExprImpliesExpr(arg0: CValuesRef<Parse>?, arg1: CValuesRef<Expr>?, arg2: CValuesRef<Expr>?, arg3: Int): Int

@CCall("knifunptr_sqlite3750_sqlite3ExprImpliesNonNullRow")
external fun sqlite3ExprImpliesNonNullRow(arg0: CValuesRef<Expr>?, arg1: Int): Int

@CCall("knifunptr_sqlite3751_sqlite3ExprAnalyzeAggregates")
external fun sqlite3ExprAnalyzeAggregates(arg0: CValuesRef<NameContext>?, arg1: CValuesRef<Expr>?): Unit

@CCall("knifunptr_sqlite3752_sqlite3ExprAnalyzeAggList")
external fun sqlite3ExprAnalyzeAggList(arg0: CValuesRef<NameContext>?, arg1: CValuesRef<ExprList>?): Unit

@CCall("knifunptr_sqlite3753_sqlite3ExprCoveredByIndex")
external fun sqlite3ExprCoveredByIndex(arg0: CValuesRef<Expr>?, iCur: Int, pIdx: CValuesRef<Index>?): Int

@CCall("knifunptr_sqlite3754_sqlite3FunctionUsesThisSrc")
external fun sqlite3FunctionUsesThisSrc(arg0: CValuesRef<Expr>?, arg1: CValuesRef<SrcList>?): Int

@CCall("knifunptr_sqlite3755_sqlite3GetVdbe")
external fun sqlite3GetVdbe(arg0: CValuesRef<Parse>?): CPointer<Vdbe>?

@CCall("knifunptr_sqlite3756_sqlite3PrngSaveState")
external fun sqlite3PrngSaveState(): Unit

@CCall("knifunptr_sqlite3757_sqlite3PrngRestoreState")
external fun sqlite3PrngRestoreState(): Unit

@CCall("knifunptr_sqlite3758_sqlite3RollbackAll")
external fun sqlite3RollbackAll(arg0: CValuesRef<sqlite3>?, arg1: Int): Unit

@CCall("knifunptr_sqlite3759_sqlite3CodeVerifySchema")
external fun sqlite3CodeVerifySchema(arg0: CValuesRef<Parse>?, arg1: Int): Unit

@CCall("knifunptr_sqlite3760_sqlite3CodeVerifyNamedSchema")
external fun sqlite3CodeVerifyNamedSchema(arg0: CValuesRef<Parse>?, @CCall.CString zDb: String?): Unit

@CCall("knifunptr_sqlite3761_sqlite3BeginTransaction")
external fun sqlite3BeginTransaction(arg0: CValuesRef<Parse>?, arg1: Int): Unit

@CCall("knifunptr_sqlite3762_sqlite3EndTransaction")
external fun sqlite3EndTransaction(arg0: CValuesRef<Parse>?, arg1: Int): Unit

@CCall("knifunptr_sqlite3763_sqlite3Savepoint")
external fun sqlite3Savepoint(arg0: CValuesRef<Parse>?, arg1: Int, arg2: CValuesRef<Token>?): Unit

@CCall("knifunptr_sqlite3764_sqlite3CloseSavepoints")
external fun sqlite3CloseSavepoints(arg0: CValuesRef<sqlite3>?): Unit

@CCall("knifunptr_sqlite3765_sqlite3LeaveMutexAndCloseZombie")
external fun sqlite3LeaveMutexAndCloseZombie(arg0: CValuesRef<sqlite3>?): Unit

@CCall("knifunptr_sqlite3766_sqlite3ExprIdToTrueFalse")
external fun sqlite3ExprIdToTrueFalse(arg0: CValuesRef<Expr>?): Int

@CCall("knifunptr_sqlite3767_sqlite3ExprTruthValue")
external fun sqlite3ExprTruthValue(arg0: CValuesRef<Expr>?): Int

@CCall("knifunptr_sqlite3768_sqlite3ExprIsConstant")
external fun sqlite3ExprIsConstant(arg0: CValuesRef<Expr>?): Int

@CCall("knifunptr_sqlite3769_sqlite3ExprIsConstantNotJoin")
external fun sqlite3ExprIsConstantNotJoin(arg0: CValuesRef<Expr>?): Int

@CCall("knifunptr_sqlite3770_sqlite3ExprIsConstantOrFunction")
external fun sqlite3ExprIsConstantOrFunction(arg0: CValuesRef<Expr>?, arg1: u8): Int

@CCall("knifunptr_sqlite3771_sqlite3ExprIsConstantOrGroupBy")
external fun sqlite3ExprIsConstantOrGroupBy(arg0: CValuesRef<Parse>?, arg1: CValuesRef<Expr>?, arg2: CValuesRef<ExprList>?): Int

@CCall("knifunptr_sqlite3772_sqlite3ExprIsTableConstant")
external fun sqlite3ExprIsTableConstant(arg0: CValuesRef<Expr>?, arg1: Int): Int

@CCall("knifunptr_sqlite3773_sqlite3ExprIsInteger")
external fun sqlite3ExprIsInteger(arg0: CValuesRef<Expr>?, arg1: CValuesRef<IntVar>?): Int

@CCall("knifunptr_sqlite3774_sqlite3ExprCanBeNull")
external fun sqlite3ExprCanBeNull(arg0: CValuesRef<Expr>?): Int

@CCall("knifunptr_sqlite3775_sqlite3ExprNeedsNoAffinityChange")
external fun sqlite3ExprNeedsNoAffinityChange(arg0: CValuesRef<Expr>?, arg1: Byte): Int

@CCall("knifunptr_sqlite3776_sqlite3IsRowid")
external fun sqlite3IsRowid(@CCall.CString arg0: String?): Int

@CCall("knifunptr_sqlite3777_sqlite3GenerateRowDelete")
external fun sqlite3GenerateRowDelete(arg0: CValuesRef<Parse>?, arg1: CValuesRef<Table>?, arg2: CValuesRef<Trigger>?, arg3: Int, arg4: Int, arg5: Int, arg6: i16, arg7: u8, arg8: u8, arg9: u8, arg10: Int): Unit

@CCall("knifunptr_sqlite3778_sqlite3GenerateRowIndexDelete")
external fun sqlite3GenerateRowIndexDelete(arg0: CValuesRef<Parse>?, arg1: CValuesRef<Table>?, arg2: Int, arg3: Int, arg4: CValuesRef<IntVar>?, arg5: Int): Unit

@CCall("knifunptr_sqlite3779_sqlite3GenerateIndexKey")
external fun sqlite3GenerateIndexKey(arg0: CValuesRef<Parse>?, arg1: CValuesRef<Index>?, arg2: Int, arg3: Int, arg4: Int, arg5: CValuesRef<IntVar>?, arg6: CValuesRef<Index>?, arg7: Int): Int

@CCall("knifunptr_sqlite3780_sqlite3ResolvePartIdxLabel")
external fun sqlite3ResolvePartIdxLabel(arg0: CValuesRef<Parse>?, arg1: Int): Unit

@CCall("knifunptr_sqlite3781_sqlite3ExprReferencesUpdatedColumn")
external fun sqlite3ExprReferencesUpdatedColumn(arg0: CValuesRef<Expr>?, arg1: CValuesRef<IntVar>?, arg2: Int): Int

@CCall("knifunptr_sqlite3782_sqlite3GenerateConstraintChecks")
external fun sqlite3GenerateConstraintChecks(arg0: CValuesRef<Parse>?, arg1: CValuesRef<Table>?, arg2: CValuesRef<IntVar>?, arg3: Int, arg4: Int, arg5: Int, arg6: Int, arg7: u8, arg8: u8, arg9: Int, arg10: CValuesRef<IntVar>?, arg11: CValuesRef<IntVar>?, arg12: CValuesRef<Upsert>?): Unit

@CCall("knifunptr_sqlite3783_sqlite3CompleteInsertion")
external fun sqlite3CompleteInsertion(arg0: CValuesRef<Parse>?, arg1: CValuesRef<Table>?, arg2: Int, arg3: Int, arg4: Int, arg5: CValuesRef<IntVar>?, arg6: Int, arg7: Int, arg8: Int): Unit

@CCall("knifunptr_sqlite3784_sqlite3OpenTableAndIndices")
external fun sqlite3OpenTableAndIndices(arg0: CValuesRef<Parse>?, arg1: CValuesRef<Table>?, arg2: Int, arg3: u8, arg4: Int, arg5: CValuesRef<u8Var>?, arg6: CValuesRef<IntVar>?, arg7: CValuesRef<IntVar>?): Int

@CCall("knifunptr_sqlite3785_sqlite3BeginWriteOperation")
external fun sqlite3BeginWriteOperation(arg0: CValuesRef<Parse>?, arg1: Int, arg2: Int): Unit

@CCall("knifunptr_sqlite3786_sqlite3MultiWrite")
external fun sqlite3MultiWrite(arg0: CValuesRef<Parse>?): Unit

@CCall("knifunptr_sqlite3787_sqlite3MayAbort")
external fun sqlite3MayAbort(arg0: CValuesRef<Parse>?): Unit

@CCall("knifunptr_sqlite3788_sqlite3HaltConstraint")
external fun sqlite3HaltConstraint(arg0: CValuesRef<Parse>?, arg1: Int, arg2: Int, arg3: CValuesRef<ByteVar>?, arg4: i8, arg5: u8): Unit

@CCall("knifunptr_sqlite3789_sqlite3UniqueConstraint")
external fun sqlite3UniqueConstraint(arg0: CValuesRef<Parse>?, arg1: Int, arg2: CValuesRef<Index>?): Unit

@CCall("knifunptr_sqlite3790_sqlite3RowidConstraint")
external fun sqlite3RowidConstraint(arg0: CValuesRef<Parse>?, arg1: Int, arg2: CValuesRef<Table>?): Unit

@CCall("knifunptr_sqlite3791_sqlite3ExprDup")
external fun sqlite3ExprDup(arg0: CValuesRef<sqlite3>?, arg1: CValuesRef<Expr>?, arg2: Int): CPointer<Expr>?

@CCall("knifunptr_sqlite3792_sqlite3ExprListDup")
external fun sqlite3ExprListDup(arg0: CValuesRef<sqlite3>?, arg1: CValuesRef<ExprList>?, arg2: Int): CPointer<ExprList>?

@CCall("knifunptr_sqlite3793_sqlite3SrcListDup")
external fun sqlite3SrcListDup(arg0: CValuesRef<sqlite3>?, arg1: CValuesRef<SrcList>?, arg2: Int): CPointer<SrcList>?

@CCall("knifunptr_sqlite3794_sqlite3IdListDup")
external fun sqlite3IdListDup(arg0: CValuesRef<sqlite3>?, arg1: CValuesRef<IdList>?): CPointer<IdList>?

@CCall("knifunptr_sqlite3795_sqlite3SelectDup")
external fun sqlite3SelectDup(arg0: CValuesRef<sqlite3>?, arg1: CValuesRef<Select>?, arg2: Int): CPointer<Select>?

@CCall("knifunptr_sqlite3796_sqlite3FunctionSearch")
external fun sqlite3FunctionSearch(arg0: Int, @CCall.CString arg1: String?): CPointer<FuncDef>?

@CCall("knifunptr_sqlite3797_sqlite3InsertBuiltinFuncs")
external fun sqlite3InsertBuiltinFuncs(arg0: CValuesRef<FuncDef>?, arg1: Int): Unit

@CCall("knifunptr_sqlite3798_sqlite3FindFunction")
external fun sqlite3FindFunction(arg0: CValuesRef<sqlite3>?, @CCall.CString arg1: String?, arg2: Int, arg3: u8, arg4: u8): CPointer<FuncDef>?

@CCall("knifunptr_sqlite3799_sqlite3RegisterBuiltinFunctions")
external fun sqlite3RegisterBuiltinFunctions(): Unit

@CCall("knifunptr_sqlite3800_sqlite3RegisterDateTimeFunctions")
external fun sqlite3RegisterDateTimeFunctions(): Unit

@CCall("knifunptr_sqlite3801_sqlite3RegisterPerConnectionBuiltinFunctions")
external fun sqlite3RegisterPerConnectionBuiltinFunctions(arg0: CValuesRef<sqlite3>?): Unit

@CCall("knifunptr_sqlite3802_sqlite3SafetyCheckOk")
external fun sqlite3SafetyCheckOk(arg0: CValuesRef<sqlite3>?): Int

@CCall("knifunptr_sqlite3803_sqlite3SafetyCheckSickOrOk")
external fun sqlite3SafetyCheckSickOrOk(arg0: CValuesRef<sqlite3>?): Int

@CCall("knifunptr_sqlite3804_sqlite3ChangeCookie")
external fun sqlite3ChangeCookie(arg0: CValuesRef<Parse>?, arg1: Int): Unit

@CCall("knifunptr_sqlite3805_sqlite3MaterializeView")
external fun sqlite3MaterializeView(arg0: CValuesRef<Parse>?, arg1: CValuesRef<Table>?, arg2: CValuesRef<Expr>?, arg3: CValuesRef<ExprList>?, arg4: CValuesRef<Expr>?, arg5: Int): Unit

@CCall("knifunptr_sqlite3806_sqlite3BeginTrigger")
external fun sqlite3BeginTrigger(arg0: CValuesRef<Parse>?, arg1: CValuesRef<Token>?, arg2: CValuesRef<Token>?, arg3: Int, arg4: Int, arg5: CValuesRef<IdList>?, arg6: CValuesRef<SrcList>?, arg7: CValuesRef<Expr>?, arg8: Int, arg9: Int): Unit

@CCall("knifunptr_sqlite3807_sqlite3FinishTrigger")
external fun sqlite3FinishTrigger(arg0: CValuesRef<Parse>?, arg1: CValuesRef<TriggerStep>?, arg2: CValuesRef<Token>?): Unit

@CCall("knifunptr_sqlite3808_sqlite3DropTrigger")
external fun sqlite3DropTrigger(arg0: CValuesRef<Parse>?, arg1: CValuesRef<SrcList>?, arg2: Int): Unit

@CCall("knifunptr_sqlite3809_sqlite3DropTriggerPtr")
external fun sqlite3DropTriggerPtr(arg0: CValuesRef<Parse>?, arg1: CValuesRef<Trigger>?): Unit

@CCall("knifunptr_sqlite3810_sqlite3TriggersExist")
external fun sqlite3TriggersExist(arg0: CValuesRef<Parse>?, arg1: CValuesRef<Table>?, arg2: Int, arg3: CValuesRef<ExprList>?, pMask: CValuesRef<IntVar>?): CPointer<Trigger>?

@CCall("knifunptr_sqlite3811_sqlite3TriggerList")
external fun sqlite3TriggerList(arg0: CValuesRef<Parse>?, arg1: CValuesRef<Table>?): CPointer<Trigger>?

@CCall("knifunptr_sqlite3812_sqlite3CodeRowTrigger")
external fun sqlite3CodeRowTrigger(arg0: CValuesRef<Parse>?, arg1: CValuesRef<Trigger>?, arg2: Int, arg3: CValuesRef<ExprList>?, arg4: Int, arg5: CValuesRef<Table>?, arg6: Int, arg7: Int, arg8: Int): Unit

@CCall("knifunptr_sqlite3813_sqlite3CodeRowTriggerDirect")
external fun sqlite3CodeRowTriggerDirect(arg0: CValuesRef<Parse>?, arg1: CValuesRef<Trigger>?, arg2: CValuesRef<Table>?, arg3: Int, arg4: Int, arg5: Int): Unit

@CCall("knifunptr_sqlite3814_sqliteViewTriggers")
external fun sqliteViewTriggers(arg0: CValuesRef<Parse>?, arg1: CValuesRef<Table>?, arg2: CValuesRef<Expr>?, arg3: Int, arg4: CValuesRef<ExprList>?): Unit

@CCall("knifunptr_sqlite3815_sqlite3DeleteTriggerStep")
external fun sqlite3DeleteTriggerStep(arg0: CValuesRef<sqlite3>?, arg1: CValuesRef<TriggerStep>?): Unit

@CCall("knifunptr_sqlite3816_sqlite3TriggerSelectStep")
external fun sqlite3TriggerSelectStep(arg0: CValuesRef<sqlite3>?, arg1: CValuesRef<Select>?, @CCall.CString arg2: String?, @CCall.CString arg3: String?): CPointer<TriggerStep>?

@CCall("knifunptr_sqlite3817_sqlite3TriggerInsertStep")
external fun sqlite3TriggerInsertStep(arg0: CValuesRef<Parse>?, arg1: CValuesRef<Token>?, arg2: CValuesRef<IdList>?, arg3: CValuesRef<Select>?, arg4: u8, arg5: CValuesRef<Upsert>?, @CCall.CString arg6: String?, @CCall.CString arg7: String?): CPointer<TriggerStep>?

@CCall("knifunptr_sqlite3818_sqlite3TriggerUpdateStep")
external fun sqlite3TriggerUpdateStep(arg0: CValuesRef<Parse>?, arg1: CValuesRef<Token>?, arg2: CValuesRef<ExprList>?, arg3: CValuesRef<Expr>?, arg4: u8, @CCall.CString arg5: String?, @CCall.CString arg6: String?): CPointer<TriggerStep>?

@CCall("knifunptr_sqlite3819_sqlite3TriggerDeleteStep")
external fun sqlite3TriggerDeleteStep(arg0: CValuesRef<Parse>?, arg1: CValuesRef<Token>?, arg2: CValuesRef<Expr>?, @CCall.CString arg3: String?, @CCall.CString arg4: String?): CPointer<TriggerStep>?

@CCall("knifunptr_sqlite3820_sqlite3DeleteTrigger")
external fun sqlite3DeleteTrigger(arg0: CValuesRef<sqlite3>?, arg1: CValuesRef<Trigger>?): Unit

@CCall("knifunptr_sqlite3821_sqlite3UnlinkAndDeleteTrigger")
external fun sqlite3UnlinkAndDeleteTrigger(arg0: CValuesRef<sqlite3>?, arg1: Int, @CCall.CString arg2: String?): Unit

@CCall("knifunptr_sqlite3822_sqlite3TriggerColmask")
external fun sqlite3TriggerColmask(arg0: CValuesRef<Parse>?, arg1: CValuesRef<Trigger>?, arg2: CValuesRef<ExprList>?, arg3: Int, arg4: Int, arg5: CValuesRef<Table>?, arg6: Int): u32

@CCall("knifunptr_sqlite3823_sqlite3JoinType")
external fun sqlite3JoinType(arg0: CValuesRef<Parse>?, arg1: CValuesRef<Token>?, arg2: CValuesRef<Token>?, arg3: CValuesRef<Token>?): Int

@CCall("knifunptr_sqlite3824_sqlite3CreateForeignKey")
external fun sqlite3CreateForeignKey(arg0: CValuesRef<Parse>?, arg1: CValuesRef<ExprList>?, arg2: CValuesRef<Token>?, arg3: CValuesRef<ExprList>?, arg4: Int): Unit

@CCall("knifunptr_sqlite3825_sqlite3DeferForeignKey")
external fun sqlite3DeferForeignKey(arg0: CValuesRef<Parse>?, arg1: Int): Unit

@CCall("knifunptr_sqlite3826_sqlite3AuthRead")
external fun sqlite3AuthRead(arg0: CValuesRef<Parse>?, arg1: CValuesRef<Expr>?, arg2: CValuesRef<Schema>?, arg3: CValuesRef<SrcList>?): Unit

@CCall("knifunptr_sqlite3827_sqlite3AuthCheck")
external fun sqlite3AuthCheck(arg0: CValuesRef<Parse>?, arg1: Int, @CCall.CString arg2: String?, @CCall.CString arg3: String?, @CCall.CString arg4: String?): Int

@CCall("knifunptr_sqlite3828_sqlite3AuthContextPush")
external fun sqlite3AuthContextPush(arg0: CValuesRef<Parse>?, arg1: CValuesRef<AuthContext>?, @CCall.CString arg2: String?): Unit

@CCall("knifunptr_sqlite3829_sqlite3AuthContextPop")
external fun sqlite3AuthContextPop(arg0: CValuesRef<AuthContext>?): Unit

@CCall("knifunptr_sqlite3830_sqlite3AuthReadCol")
external fun sqlite3AuthReadCol(arg0: CValuesRef<Parse>?, @CCall.CString arg1: String?, @CCall.CString arg2: String?, arg3: Int): Int

@CCall("knifunptr_sqlite3831_sqlite3Attach")
external fun sqlite3Attach(arg0: CValuesRef<Parse>?, arg1: CValuesRef<Expr>?, arg2: CValuesRef<Expr>?, arg3: CValuesRef<Expr>?): Unit

@CCall("knifunptr_sqlite3832_sqlite3Detach")
external fun sqlite3Detach(arg0: CValuesRef<Parse>?, arg1: CValuesRef<Expr>?): Unit

@CCall("knifunptr_sqlite3833_sqlite3FixInit")
external fun sqlite3FixInit(arg0: CValuesRef<DbFixer>?, arg1: CValuesRef<Parse>?, arg2: Int, @CCall.CString arg3: String?, arg4: CValuesRef<Token>?): Unit

@CCall("knifunptr_sqlite3834_sqlite3FixSrcList")
external fun sqlite3FixSrcList(arg0: CValuesRef<DbFixer>?, arg1: CValuesRef<SrcList>?): Int

@CCall("knifunptr_sqlite3835_sqlite3FixSelect")
external fun sqlite3FixSelect(arg0: CValuesRef<DbFixer>?, arg1: CValuesRef<Select>?): Int

@CCall("knifunptr_sqlite3836_sqlite3FixExpr")
external fun sqlite3FixExpr(arg0: CValuesRef<DbFixer>?, arg1: CValuesRef<Expr>?): Int

@CCall("knifunptr_sqlite3837_sqlite3FixExprList")
external fun sqlite3FixExprList(arg0: CValuesRef<DbFixer>?, arg1: CValuesRef<ExprList>?): Int

@CCall("knifunptr_sqlite3838_sqlite3FixTriggerStep")
external fun sqlite3FixTriggerStep(arg0: CValuesRef<DbFixer>?, arg1: CValuesRef<TriggerStep>?): Int

@CCall("knifunptr_sqlite3839_sqlite3AtoF")
external fun sqlite3AtoF(@CCall.CString z: String?, arg1: CValuesRef<DoubleVar>?, arg2: Int, arg3: u8): Int

@CCall("knifunptr_sqlite3840_sqlite3GetInt32")
external fun sqlite3GetInt32(@CCall.CString arg0: String?, arg1: CValuesRef<IntVar>?): Int

@CCall("knifunptr_sqlite3841_sqlite3Atoi")
external fun sqlite3Atoi(@CCall.CString arg0: String?): Int

@CCall("knifunptr_sqlite3842_sqlite3Utf16ByteLen")
external fun sqlite3Utf16ByteLen(pData: CValuesRef<*>?, nChar: Int): Int

@CCall("knifunptr_sqlite3843_sqlite3Utf8CharLen")
external fun sqlite3Utf8CharLen(@CCall.CString pData: String?, nByte: Int): Int

@CCall("knifunptr_sqlite3844_sqlite3Utf8Read")
external fun sqlite3Utf8Read(arg0: CValuesRef<CPointerVar<u8Var>>?): u32

@CCall("knifunptr_sqlite3845_sqlite3LogEst")
external fun sqlite3LogEst(arg0: u64): LogEst

@CCall("knifunptr_sqlite3846_sqlite3LogEstAdd")
external fun sqlite3LogEstAdd(arg0: LogEst, arg1: LogEst): LogEst

@CCall("knifunptr_sqlite3847_sqlite3LogEstFromDouble")
external fun sqlite3LogEstFromDouble(arg0: Double): LogEst

@CCall("knifunptr_sqlite3848_sqlite3VListAdd")
external fun sqlite3VListAdd(arg0: CValuesRef<sqlite3>?, arg1: CValuesRef<VListVar>?, @CCall.CString arg2: String?, arg3: Int, arg4: Int): CPointer<VListVar>?

@CCall("knifunptr_sqlite3849_sqlite3VListNumToName")
external fun sqlite3VListNumToName(arg0: CValuesRef<VListVar>?, arg1: Int): CPointer<ByteVar>?

@CCall("knifunptr_sqlite3850_sqlite3VListNameToNum")
external fun sqlite3VListNameToNum(arg0: CValuesRef<VListVar>?, @CCall.CString arg1: String?, arg2: Int): Int

@CCall("knifunptr_sqlite3851_sqlite3PutVarint")
external fun sqlite3PutVarint(arg0: CValuesRef<UByteVar>?, arg1: u64): Int

@CCall("knifunptr_sqlite3852_sqlite3GetVarint")
external fun sqlite3GetVarint(arg0: CValuesRef<UByteVar>?, arg1: CValuesRef<u64Var>?): u8

@CCall("knifunptr_sqlite3853_sqlite3GetVarint32")
external fun sqlite3GetVarint32(arg0: CValuesRef<UByteVar>?, arg1: CValuesRef<u32Var>?): u8

@CCall("knifunptr_sqlite3854_sqlite3VarintLen")
external fun sqlite3VarintLen(v: u64): Int

@CCall("knifunptr_sqlite3855_sqlite3IndexAffinityStr")
external fun sqlite3IndexAffinityStr(arg0: CValuesRef<sqlite3>?, arg1: CValuesRef<Index>?): CPointer<ByteVar>?

@CCall("knifunptr_sqlite3856_sqlite3TableAffinity")
external fun sqlite3TableAffinity(arg0: CValuesRef<Vdbe>?, arg1: CValuesRef<Table>?, arg2: Int): Unit

@CCall("knifunptr_sqlite3857_sqlite3CompareAffinity")
external fun sqlite3CompareAffinity(pExpr: CValuesRef<Expr>?, aff2: Byte): Byte

@CCall("knifunptr_sqlite3858_sqlite3IndexAffinityOk")
external fun sqlite3IndexAffinityOk(pExpr: CValuesRef<Expr>?, idx_affinity: Byte): Int

@CCall("knifunptr_sqlite3859_sqlite3TableColumnAffinity")
external fun sqlite3TableColumnAffinity(arg0: CValuesRef<Table>?, arg1: Int): Byte

@CCall("knifunptr_sqlite3860_sqlite3ExprAffinity")
external fun sqlite3ExprAffinity(pExpr: CValuesRef<Expr>?): Byte

@CCall("knifunptr_sqlite3861_sqlite3Atoi64")
external fun sqlite3Atoi64(@CCall.CString arg0: String?, arg1: CValuesRef<i64Var>?, arg2: Int, arg3: u8): Int

@CCall("knifunptr_sqlite3862_sqlite3DecOrHexToI64")
external fun sqlite3DecOrHexToI64(@CCall.CString arg0: String?, arg1: CValuesRef<i64Var>?): Int

@CCall("knifunptr_sqlite3863_sqlite3ErrorWithMsg")
external fun sqlite3ErrorWithMsg(arg0: CValuesRef<sqlite3>?, arg1: Int, @CCall.CString arg2: String?, vararg variadicArguments: Any?): Unit

@CCall("knifunptr_sqlite3864_sqlite3Error")
external fun sqlite3Error(arg0: CValuesRef<sqlite3>?, arg1: Int): Unit

@CCall("knifunptr_sqlite3865_sqlite3SystemError")
external fun sqlite3SystemError(arg0: CValuesRef<sqlite3>?, arg1: Int): Unit

@CCall("knifunptr_sqlite3866_sqlite3HexToBlob")
external fun sqlite3HexToBlob(arg0: CValuesRef<sqlite3>?, @CCall.CString z: String?, n: Int): COpaquePointer?

@CCall("knifunptr_sqlite3867_sqlite3HexToInt")
external fun sqlite3HexToInt(h: Int): u8

@CCall("knifunptr_sqlite3868_sqlite3TwoPartName")
external fun sqlite3TwoPartName(arg0: CValuesRef<Parse>?, arg1: CValuesRef<Token>?, arg2: CValuesRef<Token>?, arg3: CValuesRef<CPointerVar<Token>>?): Int

@CCall("knifunptr_sqlite3869_sqlite3ErrStr")
external fun sqlite3ErrStr(arg0: Int): CPointer<ByteVar>?

@CCall("knifunptr_sqlite3870_sqlite3ReadSchema")
external fun sqlite3ReadSchema(pParse: CValuesRef<Parse>?): Int

@CCall("knifunptr_sqlite3871_sqlite3FindCollSeq")
external fun sqlite3FindCollSeq(arg0: CValuesRef<sqlite3>?, enc: u8, @CCall.CString arg2: String?, arg3: Int): CPointer<CollSeq>?

@CCall("knifunptr_sqlite3872_sqlite3IsBinary")
external fun sqlite3IsBinary(arg0: CValuesRef<CollSeq>?): Int

@CCall("knifunptr_sqlite3873_sqlite3LocateCollSeq")
external fun sqlite3LocateCollSeq(pParse: CValuesRef<Parse>?, @CCall.CString zName: String?): CPointer<CollSeq>?

@CCall("knifunptr_sqlite3874_sqlite3ExprCollSeq")
external fun sqlite3ExprCollSeq(pParse: CValuesRef<Parse>?, pExpr: CValuesRef<Expr>?): CPointer<CollSeq>?

@CCall("knifunptr_sqlite3875_sqlite3ExprNNCollSeq")
external fun sqlite3ExprNNCollSeq(pParse: CValuesRef<Parse>?, pExpr: CValuesRef<Expr>?): CPointer<CollSeq>?

@CCall("knifunptr_sqlite3876_sqlite3ExprCollSeqMatch")
external fun sqlite3ExprCollSeqMatch(arg0: CValuesRef<Parse>?, arg1: CValuesRef<Expr>?, arg2: CValuesRef<Expr>?): Int

@CCall("knifunptr_sqlite3877_sqlite3ExprAddCollateToken")
external fun sqlite3ExprAddCollateToken(pParse: CValuesRef<Parse>?, arg1: CValuesRef<Expr>?, arg2: CValuesRef<Token>?, arg3: Int): CPointer<Expr>?

@CCall("knifunptr_sqlite3878_sqlite3ExprAddCollateString")
external fun sqlite3ExprAddCollateString(arg0: CValuesRef<Parse>?, arg1: CValuesRef<Expr>?, @CCall.CString arg2: String?): CPointer<Expr>?

@CCall("knifunptr_sqlite3879_sqlite3ExprSkipCollate")
external fun sqlite3ExprSkipCollate(arg0: CValuesRef<Expr>?): CPointer<Expr>?

@CCall("knifunptr_sqlite3880_sqlite3CheckCollSeq")
external fun sqlite3CheckCollSeq(arg0: CValuesRef<Parse>?, arg1: CValuesRef<CollSeq>?): Int

@CCall("knifunptr_sqlite3881_sqlite3WritableSchema")
external fun sqlite3WritableSchema(arg0: CValuesRef<sqlite3>?): Int

@CCall("knifunptr_sqlite3882_sqlite3CheckObjectName")
external fun sqlite3CheckObjectName(arg0: CValuesRef<Parse>?, @CCall.CString arg1: String?): Int

@CCall("knifunptr_sqlite3883_sqlite3VdbeSetChanges")
external fun sqlite3VdbeSetChanges(arg0: CValuesRef<sqlite3>?, arg1: Int): Unit

@CCall("knifunptr_sqlite3884_sqlite3AddInt64")
external fun sqlite3AddInt64(arg0: CValuesRef<i64Var>?, arg1: i64): Int

@CCall("knifunptr_sqlite3885_sqlite3SubInt64")
external fun sqlite3SubInt64(arg0: CValuesRef<i64Var>?, arg1: i64): Int

@CCall("knifunptr_sqlite3886_sqlite3MulInt64")
external fun sqlite3MulInt64(arg0: CValuesRef<i64Var>?, arg1: i64): Int

@CCall("knifunptr_sqlite3887_sqlite3AbsInt32")
external fun sqlite3AbsInt32(arg0: Int): Int

@CCall("knifunptr_sqlite3888_sqlite3GetBoolean")
external fun sqlite3GetBoolean(@CCall.CString z: String?, arg1: u8): u8

@CCall("knifunptr_sqlite3889_sqlite3ValueText")
external fun sqlite3ValueText(arg0: CValuesRef<sqlite3_value>?, arg1: u8): COpaquePointer?

@CCall("knifunptr_sqlite3890_sqlite3ValueBytes")
external fun sqlite3ValueBytes(arg0: CValuesRef<sqlite3_value>?, arg1: u8): Int

@CCall("knifunptr_sqlite3891_sqlite3ValueSetStr")
external fun sqlite3ValueSetStr(arg0: CValuesRef<sqlite3_value>?, arg1: Int, arg2: CValuesRef<*>?, arg3: u8, arg4: CPointer<CFunction<(COpaquePointer?) -> Unit>>?): Unit

@CCall("knifunptr_sqlite3892_sqlite3ValueSetNull")
external fun sqlite3ValueSetNull(arg0: CValuesRef<sqlite3_value>?): Unit

@CCall("knifunptr_sqlite3893_sqlite3ValueFree")
external fun sqlite3ValueFree(arg0: CValuesRef<sqlite3_value>?): Unit

@CCall("knifunptr_sqlite3894_sqlite3ValueNew")
external fun sqlite3ValueNew(arg0: CValuesRef<sqlite3>?): CPointer<sqlite3_value>?

@CCall("knifunptr_sqlite3895_sqlite3Utf16to8")
external fun sqlite3Utf16to8(arg0: CValuesRef<sqlite3>?, arg1: CValuesRef<*>?, arg2: Int, arg3: u8): CPointer<ByteVar>?

@CCall("knifunptr_sqlite3896_sqlite3ValueFromExpr")
external fun sqlite3ValueFromExpr(arg0: CValuesRef<sqlite3>?, arg1: CValuesRef<Expr>?, arg2: u8, arg3: u8, arg4: CValuesRef<CPointerVar<sqlite3_value>>?): Int

@CCall("knifunptr_sqlite3897_sqlite3ValueApplyAffinity")
external fun sqlite3ValueApplyAffinity(arg0: CValuesRef<sqlite3_value>?, arg1: u8, arg2: u8): Unit

@CCall("knifunptr_sqlite3898_sqlite3RootPageMoved")
external fun sqlite3RootPageMoved(arg0: CValuesRef<sqlite3>?, arg1: Int, arg2: Int, arg3: Int): Unit

@CCall("knifunptr_sqlite3899_sqlite3Reindex")
external fun sqlite3Reindex(arg0: CValuesRef<Parse>?, arg1: CValuesRef<Token>?, arg2: CValuesRef<Token>?): Unit

@CCall("knifunptr_sqlite3900_sqlite3AlterFunctions")
external fun sqlite3AlterFunctions(): Unit

@CCall("knifunptr_sqlite3901_sqlite3AlterRenameTable")
external fun sqlite3AlterRenameTable(arg0: CValuesRef<Parse>?, arg1: CValuesRef<SrcList>?, arg2: CValuesRef<Token>?): Unit

@CCall("knifunptr_sqlite3902_sqlite3AlterRenameColumn")
external fun sqlite3AlterRenameColumn(arg0: CValuesRef<Parse>?, arg1: CValuesRef<SrcList>?, arg2: CValuesRef<Token>?, arg3: CValuesRef<Token>?): Unit

@CCall("knifunptr_sqlite3903_sqlite3GetToken")
external fun sqlite3GetToken(arg0: CValuesRef<UByteVar>?, arg1: CValuesRef<IntVar>?): Int

@CCall("knifunptr_sqlite3904_sqlite3NestedParse")
external fun sqlite3NestedParse(arg0: CValuesRef<Parse>?, @CCall.CString arg1: String?, vararg variadicArguments: Any?): Unit

@CCall("knifunptr_sqlite3905_sqlite3ExpirePreparedStatements")
external fun sqlite3ExpirePreparedStatements(arg0: CValuesRef<sqlite3>?, arg1: Int): Unit

@CCall("knifunptr_sqlite3906_sqlite3CodeRhsOfIN")
external fun sqlite3CodeRhsOfIN(arg0: CValuesRef<Parse>?, arg1: CValuesRef<Expr>?, arg2: Int, arg3: Int): Unit

@CCall("knifunptr_sqlite3907_sqlite3CodeSubselect")
external fun sqlite3CodeSubselect(arg0: CValuesRef<Parse>?, arg1: CValuesRef<Expr>?): Int

@CCall("knifunptr_sqlite3908_sqlite3SelectPrep")
external fun sqlite3SelectPrep(arg0: CValuesRef<Parse>?, arg1: CValuesRef<Select>?, arg2: CValuesRef<NameContext>?): Unit

@CCall("knifunptr_sqlite3909_sqlite3SelectWrongNumTermsError")
external fun sqlite3SelectWrongNumTermsError(pParse: CValuesRef<Parse>?, p: CValuesRef<Select>?): Unit

@CCall("knifunptr_sqlite3910_sqlite3MatchSpanName")
external fun sqlite3MatchSpanName(@CCall.CString arg0: String?, @CCall.CString arg1: String?, @CCall.CString arg2: String?, @CCall.CString arg3: String?): Int

@CCall("knifunptr_sqlite3911_sqlite3ResolveExprNames")
external fun sqlite3ResolveExprNames(arg0: CValuesRef<NameContext>?, arg1: CValuesRef<Expr>?): Int

@CCall("knifunptr_sqlite3912_sqlite3ResolveExprListNames")
external fun sqlite3ResolveExprListNames(arg0: CValuesRef<NameContext>?, arg1: CValuesRef<ExprList>?): Int

@CCall("knifunptr_sqlite3913_sqlite3ResolveSelectNames")
external fun sqlite3ResolveSelectNames(arg0: CValuesRef<Parse>?, arg1: CValuesRef<Select>?, arg2: CValuesRef<NameContext>?): Unit

@CCall("knifunptr_sqlite3914_sqlite3ResolveSelfReference")
external fun sqlite3ResolveSelfReference(arg0: CValuesRef<Parse>?, arg1: CValuesRef<Table>?, arg2: Int, arg3: CValuesRef<Expr>?, arg4: CValuesRef<ExprList>?): Int

@CCall("knifunptr_sqlite3915_sqlite3ResolveOrderGroupBy")
external fun sqlite3ResolveOrderGroupBy(arg0: CValuesRef<Parse>?, arg1: CValuesRef<Select>?, arg2: CValuesRef<ExprList>?, @CCall.CString arg3: String?): Int

@CCall("knifunptr_sqlite3916_sqlite3ColumnDefault")
external fun sqlite3ColumnDefault(arg0: CValuesRef<Vdbe>?, arg1: CValuesRef<Table>?, arg2: Int, arg3: Int): Unit

@CCall("knifunptr_sqlite3917_sqlite3AlterFinishAddColumn")
external fun sqlite3AlterFinishAddColumn(arg0: CValuesRef<Parse>?, arg1: CValuesRef<Token>?): Unit

@CCall("knifunptr_sqlite3918_sqlite3AlterBeginAddColumn")
external fun sqlite3AlterBeginAddColumn(arg0: CValuesRef<Parse>?, arg1: CValuesRef<SrcList>?): Unit

@CCall("knifunptr_sqlite3919_sqlite3RenameTokenMap")
external fun sqlite3RenameTokenMap(arg0: CValuesRef<Parse>?, arg1: CValuesRef<*>?, arg2: CValuesRef<Token>?): COpaquePointer?

@CCall("knifunptr_sqlite3920_sqlite3RenameTokenRemap")
external fun sqlite3RenameTokenRemap(arg0: CValuesRef<Parse>?, pTo: CValuesRef<*>?, pFrom: CValuesRef<*>?): Unit

@CCall("knifunptr_sqlite3921_sqlite3RenameExprUnmap")
external fun sqlite3RenameExprUnmap(arg0: CValuesRef<Parse>?, arg1: CValuesRef<Expr>?): Unit

@CCall("knifunptr_sqlite3922_sqlite3RenameExprlistUnmap")
external fun sqlite3RenameExprlistUnmap(arg0: CValuesRef<Parse>?, arg1: CValuesRef<ExprList>?): Unit

@CCall("knifunptr_sqlite3923_sqlite3GetCollSeq")
external fun sqlite3GetCollSeq(arg0: CValuesRef<Parse>?, arg1: u8, arg2: CValuesRef<CollSeq>?, @CCall.CString arg3: String?): CPointer<CollSeq>?

@CCall("knifunptr_sqlite3924_sqlite3AffinityType")
external fun sqlite3AffinityType(@CCall.CString arg0: String?, arg1: CValuesRef<Column>?): Byte

@CCall("knifunptr_sqlite3925_sqlite3Analyze")
external fun sqlite3Analyze(arg0: CValuesRef<Parse>?, arg1: CValuesRef<Token>?, arg2: CValuesRef<Token>?): Unit

@CCall("knifunptr_sqlite3926_sqlite3InvokeBusyHandler")
external fun sqlite3InvokeBusyHandler(arg0: CValuesRef<BusyHandler>?, arg1: CValuesRef<sqlite3_file>?): Int

@CCall("knifunptr_sqlite3927_sqlite3FindDb")
external fun sqlite3FindDb(arg0: CValuesRef<sqlite3>?, arg1: CValuesRef<Token>?): Int

@CCall("knifunptr_sqlite3928_sqlite3FindDbName")
external fun sqlite3FindDbName(arg0: CValuesRef<sqlite3>?, @CCall.CString arg1: String?): Int

@CCall("knifunptr_sqlite3929_sqlite3AnalysisLoad")
external fun sqlite3AnalysisLoad(arg0: CValuesRef<sqlite3>?, iDB: Int): Int

@CCall("knifunptr_sqlite3930_sqlite3DeleteIndexSamples")
external fun sqlite3DeleteIndexSamples(arg0: CValuesRef<sqlite3>?, arg1: CValuesRef<Index>?): Unit

@CCall("knifunptr_sqlite3931_sqlite3DefaultRowEst")
external fun sqlite3DefaultRowEst(arg0: CValuesRef<Index>?): Unit

@CCall("knifunptr_sqlite3932_sqlite3RegisterLikeFunctions")
external fun sqlite3RegisterLikeFunctions(arg0: CValuesRef<sqlite3>?, arg1: Int): Unit

@CCall("knifunptr_sqlite3933_sqlite3IsLikeFunction")
external fun sqlite3IsLikeFunction(arg0: CValuesRef<sqlite3>?, arg1: CValuesRef<Expr>?, arg2: CValuesRef<IntVar>?, arg3: CValuesRef<ByteVar>?): Int

@CCall("knifunptr_sqlite3934_sqlite3SchemaClear")
external fun sqlite3SchemaClear(arg0: CValuesRef<*>?): Unit

@CCall("knifunptr_sqlite3935_sqlite3SchemaGet")
external fun sqlite3SchemaGet(arg0: CValuesRef<sqlite3>?, arg1: CValuesRef<Btree>?): CPointer<Schema>?

@CCall("knifunptr_sqlite3936_sqlite3SchemaToIndex")
external fun sqlite3SchemaToIndex(db: CValuesRef<sqlite3>?, arg1: CValuesRef<Schema>?): Int

@CCall("knifunptr_sqlite3937_sqlite3KeyInfoAlloc")
external fun sqlite3KeyInfoAlloc(arg0: CValuesRef<sqlite3>?, arg1: Int, arg2: Int): CPointer<KeyInfo>?

@CCall("knifunptr_sqlite3938_sqlite3KeyInfoUnref")
external fun sqlite3KeyInfoUnref(arg0: CValuesRef<KeyInfo>?): Unit

@CCall("knifunptr_sqlite3939_sqlite3KeyInfoRef")
external fun sqlite3KeyInfoRef(arg0: CValuesRef<KeyInfo>?): CPointer<KeyInfo>?

@CCall("knifunptr_sqlite3940_sqlite3KeyInfoOfIndex")
external fun sqlite3KeyInfoOfIndex(arg0: CValuesRef<Parse>?, arg1: CValuesRef<Index>?): CPointer<KeyInfo>?

@CCall("knifunptr_sqlite3941_sqlite3KeyInfoFromExprList")
external fun sqlite3KeyInfoFromExprList(arg0: CValuesRef<Parse>?, arg1: CValuesRef<ExprList>?, arg2: Int, arg3: Int): CPointer<KeyInfo>?

@CCall("knifunptr_sqlite3942_sqlite3CreateFunc")
external fun sqlite3CreateFunc(arg0: CValuesRef<sqlite3>?, @CCall.CString arg1: String?, arg2: Int, arg3: Int, arg4: CValuesRef<*>?, arg5: CPointer<CFunction<(CPointer<sqlite3_context>?, Int, CPointer<CPointerVar<sqlite3_value>>?) -> Unit>>?, arg6: CPointer<CFunction<(CPointer<sqlite3_context>?, Int, CPointer<CPointerVar<sqlite3_value>>?) -> Unit>>?, arg7: CPointer<CFunction<(CPointer<sqlite3_context>?) -> Unit>>?, arg8: CPointer<CFunction<(CPointer<sqlite3_context>?) -> Unit>>?, arg9: CPointer<CFunction<(CPointer<sqlite3_context>?, Int, CPointer<CPointerVar<sqlite3_value>>?) -> Unit>>?, pDestructor: CValuesRef<FuncDestructor>?): Int

@CCall("knifunptr_sqlite3943_sqlite3NoopDestructor")
external fun sqlite3NoopDestructor(arg0: CValuesRef<*>?): Unit

@CCall("knifunptr_sqlite3944_sqlite3OomFault")
external fun sqlite3OomFault(arg0: CValuesRef<sqlite3>?): Unit

@CCall("knifunptr_sqlite3945_sqlite3OomClear")
external fun sqlite3OomClear(arg0: CValuesRef<sqlite3>?): Unit

@CCall("knifunptr_sqlite3946_sqlite3ApiExit")
external fun sqlite3ApiExit(db: CValuesRef<sqlite3>?, arg1: Int): Int

@CCall("knifunptr_sqlite3947_sqlite3OpenTempDatabase")
external fun sqlite3OpenTempDatabase(arg0: CValuesRef<Parse>?): Int

@CCall("knifunptr_sqlite3948_sqlite3StrAccumInit")
external fun sqlite3StrAccumInit(arg0: CValuesRef<StrAccum>?, arg1: CValuesRef<sqlite3>?, arg2: CValuesRef<ByteVar>?, arg3: Int, arg4: Int): Unit

@CCall("knifunptr_sqlite3949_sqlite3StrAccumFinish")
external fun sqlite3StrAccumFinish(arg0: CValuesRef<StrAccum>?): CPointer<ByteVar>?

@CCall("knifunptr_sqlite3950_sqlite3SelectDestInit")
external fun sqlite3SelectDestInit(arg0: CValuesRef<SelectDest>?, arg1: Int, arg2: Int): Unit

@CCall("knifunptr_sqlite3951_sqlite3CreateColumnExpr")
external fun sqlite3CreateColumnExpr(arg0: CValuesRef<sqlite3>?, arg1: CValuesRef<SrcList>?, arg2: Int, arg3: Int): CPointer<Expr>?

@CCall("knifunptr_sqlite3952_sqlite3BackupRestart")
external fun sqlite3BackupRestart(arg0: CValuesRef<sqlite3_backup>?): Unit

@CCall("knifunptr_sqlite3953_sqlite3BackupUpdate")
external fun sqlite3BackupUpdate(arg0: CValuesRef<sqlite3_backup>?, arg1: Pgno, arg2: CValuesRef<u8Var>?): Unit

@CCall("knifunptr_sqlite3954_sqlite3ExprCheckIN")
external fun sqlite3ExprCheckIN(arg0: CValuesRef<Parse>?, arg1: CValuesRef<Expr>?): Int

@CCall("knifunptr_sqlite3955_sqlite3Parser")
external fun sqlite3Parser(arg0: CValuesRef<*>?, arg1: Int, arg2: CValue<Token>): Unit

@CCall("knifunptr_sqlite3956_sqlite3ParserFallback")
external fun sqlite3ParserFallback(arg0: Int): Int

@CCall("knifunptr_sqlite3957_sqlite3AutoLoadExtensions")
external fun sqlite3AutoLoadExtensions(arg0: CValuesRef<sqlite3>?): Unit

@CCall("knifunptr_sqlite3958_sqlite3CloseExtensions")
external fun sqlite3CloseExtensions(arg0: CValuesRef<sqlite3>?): Unit

@CCall("knifunptr_sqlite3959_sqlite3TableLock")
external fun sqlite3TableLock(arg0: CValuesRef<Parse>?, arg1: Int, arg2: Int, arg3: u8, @CCall.CString arg4: String?): Unit

@CCall("knifunptr_sqlite3960_sqlite3VtabClear")
external fun sqlite3VtabClear(db: CValuesRef<sqlite3>?, arg1: CValuesRef<Table>?): Unit

@CCall("knifunptr_sqlite3961_sqlite3VtabDisconnect")
external fun sqlite3VtabDisconnect(db: CValuesRef<sqlite3>?, p: CValuesRef<Table>?): Unit

@CCall("knifunptr_sqlite3962_sqlite3VtabSync")
external fun sqlite3VtabSync(db: CValuesRef<sqlite3>?, arg1: CValuesRef<Vdbe>?): Int

@CCall("knifunptr_sqlite3963_sqlite3VtabRollback")
external fun sqlite3VtabRollback(db: CValuesRef<sqlite3>?): Int

@CCall("knifunptr_sqlite3964_sqlite3VtabCommit")
external fun sqlite3VtabCommit(db: CValuesRef<sqlite3>?): Int

@CCall("knifunptr_sqlite3965_sqlite3VtabLock")
external fun sqlite3VtabLock(arg0: CValuesRef<VTable>?): Unit

@CCall("knifunptr_sqlite3966_sqlite3VtabUnlock")
external fun sqlite3VtabUnlock(arg0: CValuesRef<VTable>?): Unit

@CCall("knifunptr_sqlite3967_sqlite3VtabUnlockList")
external fun sqlite3VtabUnlockList(arg0: CValuesRef<sqlite3>?): Unit

@CCall("knifunptr_sqlite3968_sqlite3VtabSavepoint")
external fun sqlite3VtabSavepoint(arg0: CValuesRef<sqlite3>?, arg1: Int, arg2: Int): Int

@CCall("knifunptr_sqlite3969_sqlite3VtabImportErrmsg")
external fun sqlite3VtabImportErrmsg(arg0: CValuesRef<Vdbe>?, arg1: CValuesRef<sqlite3_vtab>?): Unit

@CCall("knifunptr_sqlite3970_sqlite3GetVTable")
external fun sqlite3GetVTable(arg0: CValuesRef<sqlite3>?, arg1: CValuesRef<Table>?): CPointer<VTable>?

@CCall("knifunptr_sqlite3971_sqlite3VtabCreateModule")
external fun sqlite3VtabCreateModule(arg0: CValuesRef<sqlite3>?, @CCall.CString arg1: String?, arg2: CValuesRef<sqlite3_module>?, arg3: CValuesRef<*>?, arg4: CPointer<CFunction<(COpaquePointer?) -> Unit>>?): CPointer<Module>?

@CCall("knifunptr_sqlite3972_sqlite3VtabEponymousTableInit")
external fun sqlite3VtabEponymousTableInit(arg0: CValuesRef<Parse>?, arg1: CValuesRef<Module>?): Int

@CCall("knifunptr_sqlite3973_sqlite3VtabEponymousTableClear")
external fun sqlite3VtabEponymousTableClear(arg0: CValuesRef<sqlite3>?, arg1: CValuesRef<Module>?): Unit

@CCall("knifunptr_sqlite3974_sqlite3VtabMakeWritable")
external fun sqlite3VtabMakeWritable(arg0: CValuesRef<Parse>?, arg1: CValuesRef<Table>?): Unit

@CCall("knifunptr_sqlite3975_sqlite3VtabBeginParse")
external fun sqlite3VtabBeginParse(arg0: CValuesRef<Parse>?, arg1: CValuesRef<Token>?, arg2: CValuesRef<Token>?, arg3: CValuesRef<Token>?, arg4: Int): Unit

@CCall("knifunptr_sqlite3976_sqlite3VtabFinishParse")
external fun sqlite3VtabFinishParse(arg0: CValuesRef<Parse>?, arg1: CValuesRef<Token>?): Unit

@CCall("knifunptr_sqlite3977_sqlite3VtabArgInit")
external fun sqlite3VtabArgInit(arg0: CValuesRef<Parse>?): Unit

@CCall("knifunptr_sqlite3978_sqlite3VtabArgExtend")
external fun sqlite3VtabArgExtend(arg0: CValuesRef<Parse>?, arg1: CValuesRef<Token>?): Unit

@CCall("knifunptr_sqlite3979_sqlite3VtabCallCreate")
external fun sqlite3VtabCallCreate(arg0: CValuesRef<sqlite3>?, arg1: Int, @CCall.CString arg2: String?, arg3: CValuesRef<CPointerVar<ByteVar>>?): Int

@CCall("knifunptr_sqlite3980_sqlite3VtabCallConnect")
external fun sqlite3VtabCallConnect(arg0: CValuesRef<Parse>?, arg1: CValuesRef<Table>?): Int

@CCall("knifunptr_sqlite3981_sqlite3VtabCallDestroy")
external fun sqlite3VtabCallDestroy(arg0: CValuesRef<sqlite3>?, arg1: Int, @CCall.CString arg2: String?): Int

@CCall("knifunptr_sqlite3982_sqlite3VtabBegin")
external fun sqlite3VtabBegin(arg0: CValuesRef<sqlite3>?, arg1: CValuesRef<VTable>?): Int

@CCall("knifunptr_sqlite3983_sqlite3VtabOverloadFunction")
external fun sqlite3VtabOverloadFunction(arg0: CValuesRef<sqlite3>?, arg1: CValuesRef<FuncDef>?, nArg: Int, arg3: CValuesRef<Expr>?): CPointer<FuncDef>?

@CCall("knifunptr_sqlite3984_sqlite3StmtCurrentTime")
external fun sqlite3StmtCurrentTime(arg0: CValuesRef<sqlite3_context>?): sqlite3_int64

@CCall("knifunptr_sqlite3985_sqlite3VdbeParameterIndex")
external fun sqlite3VdbeParameterIndex(arg0: CValuesRef<Vdbe>?, @CCall.CString arg1: String?, arg2: Int): Int

@CCall("knifunptr_sqlite3986_sqlite3TransferBindings")
external fun sqlite3TransferBindings(arg0: CValuesRef<sqlite3_stmt>?, arg1: CValuesRef<sqlite3_stmt>?): Int

@CCall("knifunptr_sqlite3987_sqlite3ParserReset")
external fun sqlite3ParserReset(arg0: CValuesRef<Parse>?): Unit

@CCall("knifunptr_sqlite3988_sqlite3Reprepare")
external fun sqlite3Reprepare(arg0: CValuesRef<Vdbe>?): Int

@CCall("knifunptr_sqlite3989_sqlite3ExprListCheckLength")
external fun sqlite3ExprListCheckLength(arg0: CValuesRef<Parse>?, arg1: CValuesRef<ExprList>?, @CCall.CString arg2: String?): Unit

@CCall("knifunptr_sqlite3990_sqlite3BinaryCompareCollSeq")
external fun sqlite3BinaryCompareCollSeq(arg0: CValuesRef<Parse>?, arg1: CValuesRef<Expr>?, arg2: CValuesRef<Expr>?): CPointer<CollSeq>?

@CCall("knifunptr_sqlite3991_sqlite3TempInMemory")
external fun sqlite3TempInMemory(arg0: CValuesRef<sqlite3>?): Int

@CCall("knifunptr_sqlite3992_sqlite3JournalModename")
external fun sqlite3JournalModename(arg0: Int): CPointer<ByteVar>?

@CCall("knifunptr_sqlite3993_sqlite3Checkpoint")
external fun sqlite3Checkpoint(arg0: CValuesRef<sqlite3>?, arg1: Int, arg2: Int, arg3: CValuesRef<IntVar>?, arg4: CValuesRef<IntVar>?): Int

@CCall("knifunptr_sqlite3994_sqlite3WalDefaultHook")
external fun sqlite3WalDefaultHook(arg0: CValuesRef<*>?, arg1: CValuesRef<sqlite3>?, @CCall.CString arg2: String?, arg3: Int): Int

@CCall("knifunptr_sqlite3995_sqlite3WithAdd")
external fun sqlite3WithAdd(arg0: CValuesRef<Parse>?, arg1: CValuesRef<With>?, arg2: CValuesRef<Token>?, arg3: CValuesRef<ExprList>?, arg4: CValuesRef<Select>?): CPointer<With>?

@CCall("knifunptr_sqlite3996_sqlite3WithDelete")
external fun sqlite3WithDelete(arg0: CValuesRef<sqlite3>?, arg1: CValuesRef<With>?): Unit

@CCall("knifunptr_sqlite3997_sqlite3WithPush")
external fun sqlite3WithPush(arg0: CValuesRef<Parse>?, arg1: CValuesRef<With>?, arg2: u8): Unit

@CCall("knifunptr_sqlite3998_sqlite3UpsertNew")
external fun sqlite3UpsertNew(arg0: CValuesRef<sqlite3>?, arg1: CValuesRef<ExprList>?, arg2: CValuesRef<Expr>?, arg3: CValuesRef<ExprList>?, arg4: CValuesRef<Expr>?): CPointer<Upsert>?

@CCall("knifunptr_sqlite3999_sqlite3UpsertDelete")
external fun sqlite3UpsertDelete(arg0: CValuesRef<sqlite3>?, arg1: CValuesRef<Upsert>?): Unit

@CCall("knifunptr_sqlite31000_sqlite3UpsertDup")
external fun sqlite3UpsertDup(arg0: CValuesRef<sqlite3>?, arg1: CValuesRef<Upsert>?): CPointer<Upsert>?

@CCall("knifunptr_sqlite31001_sqlite3UpsertAnalyzeTarget")
external fun sqlite3UpsertAnalyzeTarget(arg0: CValuesRef<Parse>?, arg1: CValuesRef<SrcList>?, arg2: CValuesRef<Upsert>?): Int

@CCall("knifunptr_sqlite31002_sqlite3UpsertDoUpdate")
external fun sqlite3UpsertDoUpdate(arg0: CValuesRef<Parse>?, arg1: CValuesRef<Upsert>?, arg2: CValuesRef<Table>?, arg3: CValuesRef<Index>?, arg4: Int): Unit

@CCall("knifunptr_sqlite31003_sqlite3FkCheck")
external fun sqlite3FkCheck(arg0: CValuesRef<Parse>?, arg1: CValuesRef<Table>?, arg2: Int, arg3: Int, arg4: CValuesRef<IntVar>?, arg5: Int): Unit

@CCall("knifunptr_sqlite31004_sqlite3FkDropTable")
external fun sqlite3FkDropTable(arg0: CValuesRef<Parse>?, arg1: CValuesRef<SrcList>?, arg2: CValuesRef<Table>?): Unit

@CCall("knifunptr_sqlite31005_sqlite3FkActions")
external fun sqlite3FkActions(arg0: CValuesRef<Parse>?, arg1: CValuesRef<Table>?, arg2: CValuesRef<ExprList>?, arg3: Int, arg4: CValuesRef<IntVar>?, arg5: Int): Unit

@CCall("knifunptr_sqlite31006_sqlite3FkRequired")
external fun sqlite3FkRequired(arg0: CValuesRef<Parse>?, arg1: CValuesRef<Table>?, arg2: CValuesRef<IntVar>?, arg3: Int): Int

@CCall("knifunptr_sqlite31007_sqlite3FkOldmask")
external fun sqlite3FkOldmask(arg0: CValuesRef<Parse>?, arg1: CValuesRef<Table>?): u32

@CCall("knifunptr_sqlite31008_sqlite3FkReferences")
external fun sqlite3FkReferences(arg0: CValuesRef<Table>?): CPointer<FKey>?

@CCall("knifunptr_sqlite31009_sqlite3FkDelete")
external fun sqlite3FkDelete(arg0: CValuesRef<sqlite3>?, arg1: CValuesRef<Table>?): Unit

@CCall("knifunptr_sqlite31010_sqlite3FkLocateIndex")
external fun sqlite3FkLocateIndex(arg0: CValuesRef<Parse>?, arg1: CValuesRef<Table>?, arg2: CValuesRef<FKey>?, arg3: CValuesRef<CPointerVar<Index>>?, arg4: CValuesRef<CPointerVar<IntVar>>?): Int

@CCall("knifunptr_sqlite31011_sqlite3BeginBenignMalloc")
external fun sqlite3BeginBenignMalloc(): Unit

@CCall("knifunptr_sqlite31012_sqlite3EndBenignMalloc")
external fun sqlite3EndBenignMalloc(): Unit

@CCall("knifunptr_sqlite31013_sqlite3FindInIndex")
external fun sqlite3FindInIndex(arg0: CValuesRef<Parse>?, arg1: CValuesRef<Expr>?, arg2: u32, arg3: CValuesRef<IntVar>?, arg4: CValuesRef<IntVar>?, arg5: CValuesRef<IntVar>?): Int

@CCall("knifunptr_sqlite31014_sqlite3JournalOpen")
external fun sqlite3JournalOpen(arg0: CValuesRef<sqlite3_vfs>?, @CCall.CString arg1: String?, arg2: CValuesRef<sqlite3_file>?, arg3: Int, arg4: Int): Int

@CCall("knifunptr_sqlite31015_sqlite3JournalSize")
external fun sqlite3JournalSize(arg0: CValuesRef<sqlite3_vfs>?): Int

@CCall("knifunptr_sqlite31016_sqlite3JournalIsInMemory")
external fun sqlite3JournalIsInMemory(p: CValuesRef<sqlite3_file>?): Int

@CCall("knifunptr_sqlite31017_sqlite3MemJournalOpen")
external fun sqlite3MemJournalOpen(arg0: CValuesRef<sqlite3_file>?): Unit

@CCall("knifunptr_sqlite31018_sqlite3ExprSetHeightAndFlags")
external fun sqlite3ExprSetHeightAndFlags(pParse: CValuesRef<Parse>?, p: CValuesRef<Expr>?): Unit

@CCall("knifunptr_sqlite31019_sqlite3SelectExprHeight")
external fun sqlite3SelectExprHeight(arg0: CValuesRef<Select>?): Int

@CCall("knifunptr_sqlite31020_sqlite3ExprCheckHeight")
external fun sqlite3ExprCheckHeight(arg0: CValuesRef<Parse>?, arg1: Int): Int

@CCall("knifunptr_sqlite31021_sqlite3Get4byte")
external fun sqlite3Get4byte(arg0: CValuesRef<u8Var>?): u32

@CCall("knifunptr_sqlite31022_sqlite3Put4byte")
external fun sqlite3Put4byte(arg0: CValuesRef<u8Var>?, arg1: u32): Unit

@CCall("knifunptr_sqlite31023_sqlite3ThreadCreate")
external fun sqlite3ThreadCreate(arg0: CValuesRef<CPointerVar<SQLiteThread>>?, arg1: CPointer<CFunction<(COpaquePointer?) -> COpaquePointer?>>?, arg2: CValuesRef<*>?): Int

@CCall("knifunptr_sqlite31024_sqlite3ThreadJoin")
external fun sqlite3ThreadJoin(arg0: CValuesRef<SQLiteThread>?, arg1: CValuesRef<COpaquePointerVar>?): Int

@CCall("knifunptr_sqlite31025_sqlite3ExprVectorSize")
external fun sqlite3ExprVectorSize(pExpr: CValuesRef<Expr>?): Int

@CCall("knifunptr_sqlite31026_sqlite3ExprIsVector")
external fun sqlite3ExprIsVector(pExpr: CValuesRef<Expr>?): Int

@CCall("knifunptr_sqlite31027_sqlite3VectorFieldSubexpr")
external fun sqlite3VectorFieldSubexpr(arg0: CValuesRef<Expr>?, arg1: Int): CPointer<Expr>?

@CCall("knifunptr_sqlite31028_sqlite3ExprForVectorField")
external fun sqlite3ExprForVectorField(arg0: CValuesRef<Parse>?, arg1: CValuesRef<Expr>?, arg2: Int): CPointer<Expr>?

@CCall("knifunptr_sqlite31029_sqlite3VectorErrorMsg")
external fun sqlite3VectorErrorMsg(arg0: CValuesRef<Parse>?, arg1: CValuesRef<Expr>?): Unit

@CCall("knifunptr_sqlite31030_sqlite3VdbeError")
external fun sqlite3VdbeError(arg0: CValuesRef<Vdbe>?, @CCall.CString arg1: String?, vararg variadicArguments: Any?): Unit

@CCall("knifunptr_sqlite31031_sqlite3VdbeFreeCursor")
external fun sqlite3VdbeFreeCursor(arg0: CValuesRef<Vdbe>?, arg1: CValuesRef<VdbeCursor>?): Unit

@CCall("knifunptr_sqlite31032_sqliteVdbePopStack")
external fun sqliteVdbePopStack(arg0: CValuesRef<Vdbe>?, arg1: Int): Unit

@CCall("knifunptr_sqlite31033_sqlite3VdbeCursorMoveto")
external fun sqlite3VdbeCursorMoveto(arg0: CValuesRef<CPointerVar<VdbeCursor>>?, arg1: CValuesRef<IntVar>?): Int

@CCall("knifunptr_sqlite31034_sqlite3VdbeCursorRestore")
external fun sqlite3VdbeCursorRestore(arg0: CValuesRef<VdbeCursor>?): Int

@CCall("knifunptr_sqlite31035_sqlite3VdbeSerialTypeLen")
external fun sqlite3VdbeSerialTypeLen(arg0: u32): u32

@CCall("knifunptr_sqlite31036_sqlite3VdbeOneByteSerialTypeLen")
external fun sqlite3VdbeOneByteSerialTypeLen(arg0: u8): u8

@CCall("knifunptr_sqlite31037_sqlite3VdbeSerialType")
external fun sqlite3VdbeSerialType(arg0: CValuesRef<Mem>?, arg1: Int, arg2: CValuesRef<u32Var>?): u32

@CCall("knifunptr_sqlite31038_sqlite3VdbeSerialPut")
external fun sqlite3VdbeSerialPut(arg0: CValuesRef<UByteVar>?, arg1: CValuesRef<Mem>?, arg2: u32): u32

@CCall("knifunptr_sqlite31039_sqlite3VdbeSerialGet")
external fun sqlite3VdbeSerialGet(arg0: CValuesRef<UByteVar>?, arg1: u32, arg2: CValuesRef<Mem>?): u32

@CCall("knifunptr_sqlite31040_sqlite3VdbeDeleteAuxData")
external fun sqlite3VdbeDeleteAuxData(arg0: CValuesRef<sqlite3>?, arg1: CValuesRef<CPointerVar<AuxData>>?, arg2: Int, arg3: Int): Unit

@CCall("knifunptr_sqlite31041_sqlite2BtreeKeyCompare")
external fun sqlite2BtreeKeyCompare(arg0: CValuesRef<BtCursor>?, arg1: CValuesRef<*>?, arg2: Int, arg3: Int, arg4: CValuesRef<IntVar>?): Int

@CCall("knifunptr_sqlite31042_sqlite3VdbeIdxKeyCompare")
external fun sqlite3VdbeIdxKeyCompare(arg0: CValuesRef<sqlite3>?, arg1: CValuesRef<VdbeCursor>?, arg2: CValuesRef<UnpackedRecord>?, arg3: CValuesRef<IntVar>?): Int

@CCall("knifunptr_sqlite31043_sqlite3VdbeIdxRowid")
external fun sqlite3VdbeIdxRowid(arg0: CValuesRef<sqlite3>?, arg1: CValuesRef<BtCursor>?, arg2: CValuesRef<i64Var>?): Int

@CCall("knifunptr_sqlite31044_sqlite3VdbeExec")
external fun sqlite3VdbeExec(arg0: CValuesRef<Vdbe>?): Int

@CCall("knifunptr_sqlite31045_sqlite3VdbeList")
external fun sqlite3VdbeList(arg0: CValuesRef<Vdbe>?): Int

@CCall("knifunptr_sqlite31046_sqlite3VdbeHalt")
external fun sqlite3VdbeHalt(arg0: CValuesRef<Vdbe>?): Int

@CCall("knifunptr_sqlite31047_sqlite3VdbeChangeEncoding")
external fun sqlite3VdbeChangeEncoding(arg0: CValuesRef<Mem>?, arg1: Int): Int

@CCall("knifunptr_sqlite31048_sqlite3VdbeMemTooBig")
external fun sqlite3VdbeMemTooBig(arg0: CValuesRef<Mem>?): Int

@CCall("knifunptr_sqlite31049_sqlite3VdbeMemCopy")
external fun sqlite3VdbeMemCopy(arg0: CValuesRef<Mem>?, arg1: CValuesRef<Mem>?): Int

@CCall("knifunptr_sqlite31050_sqlite3VdbeMemShallowCopy")
external fun sqlite3VdbeMemShallowCopy(arg0: CValuesRef<Mem>?, arg1: CValuesRef<Mem>?, arg2: Int): Unit

@CCall("knifunptr_sqlite31051_sqlite3VdbeMemMove")
external fun sqlite3VdbeMemMove(arg0: CValuesRef<Mem>?, arg1: CValuesRef<Mem>?): Unit

@CCall("knifunptr_sqlite31052_sqlite3VdbeMemNulTerminate")
external fun sqlite3VdbeMemNulTerminate(arg0: CValuesRef<Mem>?): Int

@CCall("knifunptr_sqlite31053_sqlite3VdbeMemSetStr")
external fun sqlite3VdbeMemSetStr(arg0: CValuesRef<Mem>?, @CCall.CString arg1: String?, arg2: Int, arg3: u8, arg4: CPointer<CFunction<(COpaquePointer?) -> Unit>>?): Int

@CCall("knifunptr_sqlite31054_sqlite3VdbeMemSetInt64")
external fun sqlite3VdbeMemSetInt64(arg0: CValuesRef<Mem>?, arg1: i64): Unit

@CCall("knifunptr_sqlite31055_sqlite3VdbeMemSetDouble")
external fun sqlite3VdbeMemSetDouble(arg0: CValuesRef<Mem>?, arg1: Double): Unit

@CCall("knifunptr_sqlite31056_sqlite3VdbeMemSetPointer")
external fun sqlite3VdbeMemSetPointer(arg0: CValuesRef<Mem>?, arg1: CValuesRef<*>?, @CCall.CString arg2: String?, arg3: CPointer<CFunction<(COpaquePointer?) -> Unit>>?): Unit

@CCall("knifunptr_sqlite31057_sqlite3VdbeMemInit")
external fun sqlite3VdbeMemInit(arg0: CValuesRef<Mem>?, arg1: CValuesRef<sqlite3>?, arg2: u16): Unit

@CCall("knifunptr_sqlite31058_sqlite3VdbeMemSetNull")
external fun sqlite3VdbeMemSetNull(arg0: CValuesRef<Mem>?): Unit

@CCall("knifunptr_sqlite31059_sqlite3VdbeMemSetZeroBlob")
external fun sqlite3VdbeMemSetZeroBlob(arg0: CValuesRef<Mem>?, arg1: Int): Unit

@CCall("knifunptr_sqlite31060_sqlite3VdbeMemSetRowSet")
external fun sqlite3VdbeMemSetRowSet(arg0: CValuesRef<Mem>?): Int

@CCall("knifunptr_sqlite31061_sqlite3VdbeMemMakeWriteable")
external fun sqlite3VdbeMemMakeWriteable(arg0: CValuesRef<Mem>?): Int

@CCall("knifunptr_sqlite31062_sqlite3VdbeMemStringify")
external fun sqlite3VdbeMemStringify(arg0: CValuesRef<Mem>?, arg1: u8, arg2: u8): Int

@CCall("knifunptr_sqlite31063_sqlite3VdbeIntValue")
external fun sqlite3VdbeIntValue(arg0: CValuesRef<Mem>?): i64

@CCall("knifunptr_sqlite31064_sqlite3VdbeMemIntegerify")
external fun sqlite3VdbeMemIntegerify(arg0: CValuesRef<Mem>?): Int

@CCall("knifunptr_sqlite31065_sqlite3VdbeRealValue")
external fun sqlite3VdbeRealValue(arg0: CValuesRef<Mem>?): Double

@CCall("knifunptr_sqlite31066_sqlite3VdbeBooleanValue")
external fun sqlite3VdbeBooleanValue(arg0: CValuesRef<Mem>?, ifNull: Int): Int

@CCall("knifunptr_sqlite31067_sqlite3VdbeIntegerAffinity")
external fun sqlite3VdbeIntegerAffinity(arg0: CValuesRef<Mem>?): Unit

@CCall("knifunptr_sqlite31068_sqlite3VdbeMemRealify")
external fun sqlite3VdbeMemRealify(arg0: CValuesRef<Mem>?): Int

@CCall("knifunptr_sqlite31069_sqlite3VdbeMemNumerify")
external fun sqlite3VdbeMemNumerify(arg0: CValuesRef<Mem>?): Int

@CCall("knifunptr_sqlite31070_sqlite3VdbeMemCast")
external fun sqlite3VdbeMemCast(arg0: CValuesRef<Mem>?, arg1: u8, arg2: u8): Unit

@CCall("knifunptr_sqlite31071_sqlite3VdbeMemFromBtree")
external fun sqlite3VdbeMemFromBtree(arg0: CValuesRef<BtCursor>?, arg1: u32, arg2: u32, arg3: CValuesRef<Mem>?): Int

@CCall("knifunptr_sqlite31072_sqlite3VdbeMemRelease")
external fun sqlite3VdbeMemRelease(p: CValuesRef<Mem>?): Unit

@CCall("knifunptr_sqlite31073_sqlite3VdbeMemFinalize")
external fun sqlite3VdbeMemFinalize(arg0: CValuesRef<Mem>?, arg1: CValuesRef<FuncDef>?): Int

@CCall("knifunptr_sqlite31074_sqlite3VdbeMemAggValue")
external fun sqlite3VdbeMemAggValue(arg0: CValuesRef<Mem>?, arg1: CValuesRef<Mem>?, arg2: CValuesRef<FuncDef>?): Int

@CCall("knifunptr_sqlite31075_sqlite3OpcodeName")
external fun sqlite3OpcodeName(arg0: Int): CPointer<ByteVar>?

@CCall("knifunptr_sqlite31076_sqlite3VdbeMemGrow")
external fun sqlite3VdbeMemGrow(pMem: CValuesRef<Mem>?, n: Int, preserve: Int): Int

@CCall("knifunptr_sqlite31077_sqlite3VdbeMemClearAndResize")
external fun sqlite3VdbeMemClearAndResize(pMem: CValuesRef<Mem>?, n: Int): Int

@CCall("knifunptr_sqlite31078_sqlite3VdbeCloseStatement")
external fun sqlite3VdbeCloseStatement(arg0: CValuesRef<Vdbe>?, arg1: Int): Int

@CCall("knifunptr_sqlite31079_sqlite3VdbeFrameMemDel")
external fun sqlite3VdbeFrameMemDel(arg0: CValuesRef<*>?): Unit

@CCall("knifunptr_sqlite31080_sqlite3VdbeFrameDelete")
external fun sqlite3VdbeFrameDelete(arg0: CValuesRef<VdbeFrame>?): Unit

@CCall("knifunptr_sqlite31081_sqlite3VdbeFrameRestore")
external fun sqlite3VdbeFrameRestore(arg0: CValuesRef<VdbeFrame>?): Int

@CCall("knifunptr_sqlite31082_sqlite3VdbeTransferError")
external fun sqlite3VdbeTransferError(p: CValuesRef<Vdbe>?): Int

@CCall("knifunptr_sqlite31083_sqlite3VdbeSorterInit")
external fun sqlite3VdbeSorterInit(arg0: CValuesRef<sqlite3>?, arg1: Int, arg2: CValuesRef<VdbeCursor>?): Int

@CCall("knifunptr_sqlite31084_sqlite3VdbeSorterReset")
external fun sqlite3VdbeSorterReset(arg0: CValuesRef<sqlite3>?, arg1: CValuesRef<VdbeSorter>?): Unit

@CCall("knifunptr_sqlite31085_sqlite3VdbeSorterClose")
external fun sqlite3VdbeSorterClose(arg0: CValuesRef<sqlite3>?, arg1: CValuesRef<VdbeCursor>?): Unit

@CCall("knifunptr_sqlite31086_sqlite3VdbeSorterRowkey")
external fun sqlite3VdbeSorterRowkey(arg0: CValuesRef<VdbeCursor>?, arg1: CValuesRef<Mem>?): Int

@CCall("knifunptr_sqlite31087_sqlite3VdbeSorterNext")
external fun sqlite3VdbeSorterNext(arg0: CValuesRef<sqlite3>?, arg1: CValuesRef<VdbeCursor>?): Int

@CCall("knifunptr_sqlite31088_sqlite3VdbeSorterRewind")
external fun sqlite3VdbeSorterRewind(arg0: CValuesRef<VdbeCursor>?, arg1: CValuesRef<IntVar>?): Int

@CCall("knifunptr_sqlite31089_sqlite3VdbeSorterWrite")
external fun sqlite3VdbeSorterWrite(arg0: CValuesRef<VdbeCursor>?, arg1: CValuesRef<Mem>?): Int

@CCall("knifunptr_sqlite31090_sqlite3VdbeSorterCompare")
external fun sqlite3VdbeSorterCompare(arg0: CValuesRef<VdbeCursor>?, arg1: CValuesRef<Mem>?, arg2: Int, arg3: CValuesRef<IntVar>?): Int

@CCall("knifunptr_sqlite31091_sqlite3VdbeEnter")
external fun sqlite3VdbeEnter(arg0: CValuesRef<Vdbe>?): Unit

@CCall("knifunptr_sqlite31092_sqlite3VdbeLeave")
external fun sqlite3VdbeLeave(arg0: CValuesRef<Vdbe>?): Unit

@CCall("knifunptr_sqlite31093_sqlite3VdbeCheckFk")
external fun sqlite3VdbeCheckFk(arg0: CValuesRef<Vdbe>?, arg1: Int): Int

@CCall("knifunptr_sqlite31094_sqlite3VdbeMemTranslate")
external fun sqlite3VdbeMemTranslate(arg0: CValuesRef<Mem>?, arg1: u8): Int

@CCall("knifunptr_sqlite31095_sqlite3VdbeMemHandleBom")
external fun sqlite3VdbeMemHandleBom(pMem: CValuesRef<Mem>?): Int

@CCall("knifunptr_sqlite31096_sqlite3VdbeMemExpandBlob")
external fun sqlite3VdbeMemExpandBlob(arg0: CValuesRef<Mem>?): Int

@CCall("knifunptr_sqlite31097_countLookasideSlots")
external fun countLookasideSlots(p: CValuesRef<LookasideSlot>?): u32

@CCall("knifunptr_sqlite31098_getDigits")
external fun getDigits(@CCall.CString zDate: String?, @CCall.CString zFormat: String?, vararg variadicArguments: Any?): Int

@CCall("knifunptr_sqlite31099_parseTimezone")
external fun parseTimezone(@CCall.CString zDate: String?, p: CValuesRef<DateTime>?): Int

@CCall("knifunptr_sqlite31100_parseHhMmSs")
external fun parseHhMmSs(@CCall.CString zDate: String?, p: CValuesRef<DateTime>?): Int

@CCall("knifunptr_sqlite31101_datetimeError")
external fun datetimeError(p: CValuesRef<DateTime>?): Unit

@CCall("knifunptr_sqlite31102_computeJD")
external fun computeJD(p: CValuesRef<DateTime>?): Unit

@CCall("knifunptr_sqlite31103_parseYyyyMmDd")
external fun parseYyyyMmDd(@CCall.CString zDate: String?, p: CValuesRef<DateTime>?): Int

@CCall("knifunptr_sqlite31104_setDateTimeToCurrent")
external fun setDateTimeToCurrent(context: CValuesRef<sqlite3_context>?, p: CValuesRef<DateTime>?): Int

@CCall("knifunptr_sqlite31105_setRawDateNumber")
external fun setRawDateNumber(p: CValuesRef<DateTime>?, r: Double): Unit

@CCall("knifunptr_sqlite31106_parseDateOrTime")
external fun parseDateOrTime(context: CValuesRef<sqlite3_context>?, @CCall.CString zDate: String?, p: CValuesRef<DateTime>?): Int

@CCall("knifunptr_sqlite31107_validJulianDay")
external fun validJulianDay(iJD: sqlite3_int64): Int

@CCall("knifunptr_sqlite31108_computeYMD")
external fun computeYMD(p: CValuesRef<DateTime>?): Unit

@CCall("knifunptr_sqlite31109_computeHMS")
external fun computeHMS(p: CValuesRef<DateTime>?): Unit

@CCall("knifunptr_sqlite31110_computeYMD_HMS")
external fun computeYMD_HMS(p: CValuesRef<DateTime>?): Unit

@CCall("knifunptr_sqlite31111_clearYMD_HMS_TZ")
external fun clearYMD_HMS_TZ(p: CValuesRef<DateTime>?): Unit

@CCall("knifunptr_sqlite31112_osLocaltime")
external fun osLocaltime(t: CValuesRef<time_tVar>?, pTm: CValuesRef<tm>?): Int

@CCall("knifunptr_sqlite31113_localtimeOffset")
external fun localtimeOffset(p: CValuesRef<DateTime>?, pCtx: CValuesRef<sqlite3_context>?, pRc: CValuesRef<IntVar>?): sqlite3_int64

@CCall("knifunptr_sqlite31114_parseModifier")
external fun parseModifier(pCtx: CValuesRef<sqlite3_context>?, @CCall.CString z: String?, n: Int, p: CValuesRef<DateTime>?): Int

@CCall("knifunptr_sqlite31115_isDate")
external fun isDate(context: CValuesRef<sqlite3_context>?, argc: Int, argv: CValuesRef<CPointerVar<sqlite3_value>>?, p: CValuesRef<DateTime>?): Int

@CCall("knifunptr_sqlite31116_juliandayFunc")
external fun juliandayFunc(context: CValuesRef<sqlite3_context>?, argc: Int, argv: CValuesRef<CPointerVar<sqlite3_value>>?): Unit

@CCall("knifunptr_sqlite31117_datetimeFunc")
external fun datetimeFunc(context: CValuesRef<sqlite3_context>?, argc: Int, argv: CValuesRef<CPointerVar<sqlite3_value>>?): Unit

@CCall("knifunptr_sqlite31118_timeFunc")
external fun timeFunc(context: CValuesRef<sqlite3_context>?, argc: Int, argv: CValuesRef<CPointerVar<sqlite3_value>>?): Unit

@CCall("knifunptr_sqlite31119_dateFunc")
external fun dateFunc(context: CValuesRef<sqlite3_context>?, argc: Int, argv: CValuesRef<CPointerVar<sqlite3_value>>?): Unit

@CCall("knifunptr_sqlite31120_strftimeFunc")
external fun strftimeFunc(context: CValuesRef<sqlite3_context>?, argc: Int, argv: CValuesRef<CPointerVar<sqlite3_value>>?): Unit

@CCall("knifunptr_sqlite31121_ctimeFunc")
external fun ctimeFunc(context: CValuesRef<sqlite3_context>?, NotUsed: Int, NotUsed2: CValuesRef<CPointerVar<sqlite3_value>>?): Unit

@CCall("knifunptr_sqlite31122_cdateFunc")
external fun cdateFunc(context: CValuesRef<sqlite3_context>?, NotUsed: Int, NotUsed2: CValuesRef<CPointerVar<sqlite3_value>>?): Unit

@CCall("knifunptr_sqlite31123_ctimestampFunc")
external fun ctimestampFunc(context: CValuesRef<sqlite3_context>?, NotUsed: Int, NotUsed2: CValuesRef<CPointerVar<sqlite3_value>>?): Unit

@CCall("knifunptr_sqlite31124_vfsUnlink")
external fun vfsUnlink(pVfs: CValuesRef<sqlite3_vfs>?): Unit

@CCall("knifunptr_sqlite31125_sqlite3MemMalloc")
external fun sqlite3MemMalloc(nByte: Int): COpaquePointer?

@CCall("knifunptr_sqlite31126_sqlite3MemFree")
external fun sqlite3MemFree(pPrior: CValuesRef<*>?): Unit

@CCall("knifunptr_sqlite31127_sqlite3MemSize")
external fun sqlite3MemSize(pPrior: CValuesRef<*>?): Int

@CCall("knifunptr_sqlite31128_sqlite3MemRealloc")
external fun sqlite3MemRealloc(pPrior: CValuesRef<*>?, nByte: Int): COpaquePointer?

@CCall("knifunptr_sqlite31129_sqlite3MemRoundup")
external fun sqlite3MemRoundup(n: Int): Int

@CCall("knifunptr_sqlite31130_sqlite3MemInit")
external fun sqlite3MemInit(NotUsed: CValuesRef<*>?): Int

@CCall("knifunptr_sqlite31131_sqlite3MemShutdown")
external fun sqlite3MemShutdown(NotUsed: CValuesRef<*>?): Unit

@CCall("knifunptr_sqlite31132_noopMutexInit")
external fun noopMutexInit(): Int

@CCall("knifunptr_sqlite31133_noopMutexEnd")
external fun noopMutexEnd(): Int

@CCall("knifunptr_sqlite31134_noopMutexAlloc")
external fun noopMutexAlloc(id: Int): CPointer<sqlite3_mutex>?

@CCall("knifunptr_sqlite31135_noopMutexFree")
external fun noopMutexFree(p: CValuesRef<sqlite3_mutex>?): Unit

@CCall("knifunptr_sqlite31136_noopMutexEnter")
external fun noopMutexEnter(p: CValuesRef<sqlite3_mutex>?): Unit

@CCall("knifunptr_sqlite31137_noopMutexTry")
external fun noopMutexTry(p: CValuesRef<sqlite3_mutex>?): Int

@CCall("knifunptr_sqlite31138_noopMutexLeave")
external fun noopMutexLeave(p: CValuesRef<sqlite3_mutex>?): Unit

@CCall("knifunptr_sqlite31139_sqlite3_win32_is_nt")
external fun sqlite3_win32_is_nt(): Int

@CCall("knifunptr_sqlite31140_sqlite3_win32_sleep")
external fun sqlite3_win32_sleep(milliseconds: DWORD): Unit

@CCall("knifunptr_sqlite31141_winMutexInit")
external fun winMutexInit(): Int

@CCall("knifunptr_sqlite31142_winMutexEnd")
external fun winMutexEnd(): Int

@CCall("knifunptr_sqlite31143_winMutexAlloc")
external fun winMutexAlloc(iType: Int): CPointer<sqlite3_mutex>?

@CCall("knifunptr_sqlite31144_winMutexFree")
external fun winMutexFree(p: CValuesRef<sqlite3_mutex>?): Unit

@CCall("knifunptr_sqlite31145_winMutexEnter")
external fun winMutexEnter(p: CValuesRef<sqlite3_mutex>?): Unit

@CCall("knifunptr_sqlite31146_winMutexTry")
external fun winMutexTry(p: CValuesRef<sqlite3_mutex>?): Int

@CCall("knifunptr_sqlite31147_winMutexLeave")
external fun winMutexLeave(p: CValuesRef<sqlite3_mutex>?): Unit

@CCall("knifunptr_sqlite31148_sqlite3MallocAlarm")
external fun sqlite3MallocAlarm(nByte: Int): Unit

@CCall("knifunptr_sqlite31149_mallocWithAlarm")
external fun mallocWithAlarm(n: Int, pp: CValuesRef<COpaquePointerVar>?): Unit

@CCall("knifunptr_sqlite31150_isLookaside")
external fun isLookaside(db: CValuesRef<sqlite3>?, p: CValuesRef<*>?): Int

@CCall("knifunptr_sqlite31151_measureAllocationSize")
external fun measureAllocationSize(db: CValuesRef<sqlite3>?, p: CValuesRef<*>?): Unit

@CCall("knifunptr_sqlite31152_dbMallocRawFinish")
external fun dbMallocRawFinish(db: CValuesRef<sqlite3>?, n: u64): COpaquePointer?

@CCall("knifunptr_sqlite31153_dbReallocFinish")
external fun dbReallocFinish(db: CValuesRef<sqlite3>?, p: CValuesRef<*>?, n: u64): COpaquePointer?

@CCall("knifunptr_sqlite31154_apiOomError")
external fun apiOomError(db: CValuesRef<sqlite3>?): Int

@CCall("knifunptr_sqlite31155_et_getdigit")
external fun et_getdigit(`val`: CValuesRef<*>?, cnt: CValuesRef<IntVar>?): Byte

@CCall("knifunptr_sqlite31156_setStrAccumError")
external fun setStrAccumError(p: CValuesRef<StrAccum>?, eError: u8): Unit

@CCall("knifunptr_sqlite31157_getIntArg")
external fun getIntArg(p: CValuesRef<PrintfArguments>?): sqlite3_int64

@CCall("knifunptr_sqlite31158_getDoubleArg")
external fun getDoubleArg(p: CValuesRef<PrintfArguments>?): Double

@CCall("knifunptr_sqlite31159_getTextArg")
external fun getTextArg(p: CValuesRef<PrintfArguments>?): CPointer<ByteVar>?

@CCall("knifunptr_sqlite31160_printfTempBuf")
external fun printfTempBuf(pAccum: CValuesRef<sqlite3_str>?, n: sqlite3_int64): CPointer<ByteVar>?

@CCall("knifunptr_sqlite31161_sqlite3StrAccumEnlarge")
external fun sqlite3StrAccumEnlarge(p: CValuesRef<StrAccum>?, N: Int): Int

@CCall("knifunptr_sqlite31162_enlargeAndAppend")
external fun enlargeAndAppend(p: CValuesRef<StrAccum>?, @CCall.CString z: String?, N: Int): Unit

@CCall("knifunptr_sqlite31163_strAccumFinishRealloc")
external fun strAccumFinishRealloc(p: CValuesRef<StrAccum>?): CPointer<ByteVar>?

@CCall("knifunptr_sqlite31164_renderLogMsg")
external fun renderLogMsg(iErrCode: Int, @CCall.CString zFormat: String?, ap: va_list?): Unit

@CCall("knifunptr_sqlite31165_sqlite3ThreadProc")
external fun sqlite3ThreadProc(pArg: CValuesRef<*>?): UInt

@CCall("knifunptr_sqlite31166_sqlite3Win32Wait")
external fun sqlite3Win32Wait(hObject: HANDLE?): DWORD

@CCall("knifunptr_sqlite31167_sqlite3ErrorFinish")
external fun sqlite3ErrorFinish(db: CValuesRef<sqlite3>?, err_code: Int): Unit

@CCall("knifunptr_sqlite31168_compare2pow63")
external fun compare2pow63(@CCall.CString zNum: String?, incr: Int): Int

@CCall("knifunptr_sqlite31169_putVarint64")
external fun putVarint64(p: CValuesRef<UByteVar>?, v: u64): Int

@CCall("knifunptr_sqlite31170_logBadConnection")
external fun logBadConnection(@CCall.CString zType: String?): Unit

@CCall("knifunptr_sqlite31171_strHash")
external fun strHash(@CCall.CString z: String?): UInt

@CCall("knifunptr_sqlite31172_insertElement")
external fun insertElement(pH: CValuesRef<Hash>?, pEntry: CValuesRef<_ht>?, pNew: CValuesRef<HashElem>?): Unit

@CCall("knifunptr_sqlite31173_rehash")
external fun rehash(pH: CValuesRef<Hash>?, new_size: UInt): Int

@CCall("knifunptr_sqlite31174_findElementWithHash")
external fun findElementWithHash(pH: CValuesRef<Hash>?, @CCall.CString pKey: String?, pHash: CValuesRef<UIntVar>?): CPointer<HashElem>?

@CCall("knifunptr_sqlite31175_removeElementGivenHash")
external fun removeElementGivenHash(pH: CValuesRef<Hash>?, elem: CValuesRef<HashElem>?, h: UInt): Unit

@CCall("knifunptr_sqlite31176_winSetSystemCall")
external fun winSetSystemCall(pNotUsed: CValuesRef<sqlite3_vfs>?, @CCall.CString zName: String?, pNewFunc: sqlite3_syscall_ptr?): Int

@CCall("knifunptr_sqlite31177_winGetSystemCall")
external fun winGetSystemCall(pNotUsed: CValuesRef<sqlite3_vfs>?, @CCall.CString zName: String?): sqlite3_syscall_ptr?

@CCall("knifunptr_sqlite31178_winNextSystemCall")
external fun winNextSystemCall(p: CValuesRef<sqlite3_vfs>?, @CCall.CString zName: String?): CPointer<ByteVar>?

@CCall("knifunptr_sqlite31179_sqlite3_win32_write_debug")
external fun sqlite3_win32_write_debug(@CCall.CString zBuf: String?, nBuf: Int): Unit

@CCall("knifunptr_sqlite31180_winUtf8ToUnicode")
external fun winUtf8ToUnicode(@CCall.CString zText: String?): LPWSTR?

@CCall("knifunptr_sqlite31181_winUnicodeToUtf8")
external fun winUnicodeToUtf8(@CCall.WCString zWideText: String?): CPointer<ByteVar>?

@CCall("knifunptr_sqlite31182_winMbcsToUnicode")
external fun winMbcsToUnicode(@CCall.CString zText: String?, useAnsi: Int): LPWSTR?

@CCall("knifunptr_sqlite31183_winUnicodeToMbcs")
external fun winUnicodeToMbcs(@CCall.WCString zWideText: String?, useAnsi: Int): CPointer<ByteVar>?

@CCall("knifunptr_sqlite31184_winMbcsToUtf8")
external fun winMbcsToUtf8(@CCall.CString zText: String?, useAnsi: Int): CPointer<ByteVar>?

@CCall("knifunptr_sqlite31185_winUtf8ToMbcs")
external fun winUtf8ToMbcs(@CCall.CString zText: String?, useAnsi: Int): CPointer<ByteVar>?

@CCall("knifunptr_sqlite31186_sqlite3_win32_utf8_to_unicode")
external fun sqlite3_win32_utf8_to_unicode(@CCall.CString zText: String?): LPWSTR?

@CCall("knifunptr_sqlite31187_sqlite3_win32_unicode_to_utf8")
external fun sqlite3_win32_unicode_to_utf8(@CCall.WCString zWideText: String?): CPointer<ByteVar>?

@CCall("knifunptr_sqlite31188_sqlite3_win32_mbcs_to_utf8")
external fun sqlite3_win32_mbcs_to_utf8(@CCall.CString zText: String?): CPointer<ByteVar>?

@CCall("knifunptr_sqlite31189_sqlite3_win32_mbcs_to_utf8_v2")
external fun sqlite3_win32_mbcs_to_utf8_v2(@CCall.CString zText: String?, useAnsi: Int): CPointer<ByteVar>?

@CCall("knifunptr_sqlite31190_sqlite3_win32_utf8_to_mbcs")
external fun sqlite3_win32_utf8_to_mbcs(@CCall.CString zText: String?): CPointer<ByteVar>?

@CCall("knifunptr_sqlite31191_sqlite3_win32_utf8_to_mbcs_v2")
external fun sqlite3_win32_utf8_to_mbcs_v2(@CCall.CString zText: String?, useAnsi: Int): CPointer<ByteVar>?

@CCall("knifunptr_sqlite31192_winGetLastErrorMsg")
external fun winGetLastErrorMsg(lastErrno: DWORD, nBuf: Int, zBuf: CValuesRef<ByteVar>?): Int

@CCall("knifunptr_sqlite31193_winLogErrorAtLine")
external fun winLogErrorAtLine(errcode: Int, lastErrno: DWORD, @CCall.CString zFunc: String?, @CCall.CString zPath: String?, iLine: Int): Int

@CCall("knifunptr_sqlite31194_winRetryIoerr")
external fun winRetryIoerr(pnRetry: CValuesRef<IntVar>?, pError: CValuesRef<DWORDVar>?): Int

@CCall("knifunptr_sqlite31195_winLogIoerr")
external fun winLogIoerr(nRetry: Int, lineno: Int): Unit

@CCall("knifunptr_sqlite31196_winLockFile")
external fun winLockFile(phFile: LPHANDLE?, flags: DWORD, offsetLow: DWORD, offsetHigh: DWORD, numBytesLow: DWORD, numBytesHigh: DWORD): BOOL

@CCall("knifunptr_sqlite31197_winUnlockFile")
external fun winUnlockFile(phFile: LPHANDLE?, offsetLow: DWORD, offsetHigh: DWORD, numBytesLow: DWORD, numBytesHigh: DWORD): BOOL

@CCall("knifunptr_sqlite31198_winSeekFile")
external fun winSeekFile(pFile: CValuesRef<winFile>?, iOffset: sqlite3_int64): Int

@CCall("knifunptr_sqlite31199_winMapfile")
external fun winMapfile(arg0: CValuesRef<winFile>?, arg1: sqlite3_int64): Int

@CCall("knifunptr_sqlite31200_winUnmapfile")
external fun winUnmapfile(arg0: CValuesRef<winFile>?): Int

@CCall("knifunptr_sqlite31201_winClose")
external fun winClose(id: CValuesRef<sqlite3_file>?): Int

@CCall("knifunptr_sqlite31202_winRead")
external fun winRead(id: CValuesRef<sqlite3_file>?, pBuf: CValuesRef<*>?, amt: Int, offset: sqlite3_int64): Int

@CCall("knifunptr_sqlite31203_winWrite")
external fun winWrite(id: CValuesRef<sqlite3_file>?, pBuf: CValuesRef<*>?, amt: Int, offset: sqlite3_int64): Int

@CCall("knifunptr_sqlite31204_winTruncate")
external fun winTruncate(id: CValuesRef<sqlite3_file>?, nByte: sqlite3_int64): Int

@CCall("knifunptr_sqlite31205_winSync")
external fun winSync(id: CValuesRef<sqlite3_file>?, flags: Int): Int

@CCall("knifunptr_sqlite31206_winFileSize")
external fun winFileSize(id: CValuesRef<sqlite3_file>?, pSize: CValuesRef<sqlite3_int64Var>?): Int

@CCall("knifunptr_sqlite31207_winGetReadLock")
external fun winGetReadLock(pFile: CValuesRef<winFile>?): Int

@CCall("knifunptr_sqlite31208_winUnlockReadLock")
external fun winUnlockReadLock(pFile: CValuesRef<winFile>?): Int

@CCall("knifunptr_sqlite31209_winLock")
external fun winLock(id: CValuesRef<sqlite3_file>?, locktype: Int): Int

@CCall("knifunptr_sqlite31210_winCheckReservedLock")
external fun winCheckReservedLock(id: CValuesRef<sqlite3_file>?, pResOut: CValuesRef<IntVar>?): Int

@CCall("knifunptr_sqlite31211_winUnlock")
external fun winUnlock(id: CValuesRef<sqlite3_file>?, locktype: Int): Int

@CCall("knifunptr_sqlite31212_winNolockLock")
external fun winNolockLock(id: CValuesRef<sqlite3_file>?, locktype: Int): Int

@CCall("knifunptr_sqlite31213_winNolockCheckReservedLock")
external fun winNolockCheckReservedLock(id: CValuesRef<sqlite3_file>?, pResOut: CValuesRef<IntVar>?): Int

@CCall("knifunptr_sqlite31214_winNolockUnlock")
external fun winNolockUnlock(id: CValuesRef<sqlite3_file>?, locktype: Int): Int

@CCall("knifunptr_sqlite31215_winModeBit")
external fun winModeBit(pFile: CValuesRef<winFile>?, mask: UByte, pArg: CValuesRef<IntVar>?): Unit

@CCall("knifunptr_sqlite31216_winGetTempname")
external fun winGetTempname(arg0: CValuesRef<sqlite3_vfs>?, arg1: CValuesRef<CPointerVar<ByteVar>>?): Int

@CCall("knifunptr_sqlite31217_winIsDir")
external fun winIsDir(arg0: CValuesRef<*>?): Int

@CCall("knifunptr_sqlite31218_winIsDriveLetterAndColon")
external fun winIsDriveLetterAndColon(@CCall.CString arg0: String?): BOOL

@CCall("knifunptr_sqlite31219_winFileControl")
external fun winFileControl(id: CValuesRef<sqlite3_file>?, op: Int, pArg: CValuesRef<*>?): Int

@CCall("knifunptr_sqlite31220_winSectorSize")
external fun winSectorSize(id: CValuesRef<sqlite3_file>?): Int

@CCall("knifunptr_sqlite31221_winDeviceCharacteristics")
external fun winDeviceCharacteristics(id: CValuesRef<sqlite3_file>?): Int

@CCall("knifunptr_sqlite31222_winShmEnterMutex")
external fun winShmEnterMutex(): Unit

@CCall("knifunptr_sqlite31223_winShmLeaveMutex")
external fun winShmLeaveMutex(): Unit

@CCall("knifunptr_sqlite31224_winShmSystemLock")
external fun winShmSystemLock(pFile: CValuesRef<winShmNode>?, lockType: Int, ofst: Int, nByte: Int): Int

@CCall("knifunptr_sqlite31225_winOpen")
external fun winOpen(arg0: CValuesRef<sqlite3_vfs>?, @CCall.CString arg1: String?, arg2: CValuesRef<sqlite3_file>?, arg3: Int, arg4: CValuesRef<IntVar>?): Int

@CCall("knifunptr_sqlite31226_winDelete")
external fun winDelete(arg0: CValuesRef<sqlite3_vfs>?, @CCall.CString arg1: String?, arg2: Int): Int

@CCall("knifunptr_sqlite31227_winShmPurge")
external fun winShmPurge(pVfs: CValuesRef<sqlite3_vfs>?, deleteFlag: Int): Unit

@CCall("knifunptr_sqlite31228_winLockSharedMemory")
external fun winLockSharedMemory(pShmNode: CValuesRef<winShmNode>?): Int

@CCall("knifunptr_sqlite31229_winOpenSharedMemory")
external fun winOpenSharedMemory(pDbFd: CValuesRef<winFile>?): Int

@CCall("knifunptr_sqlite31230_winShmUnmap")
external fun winShmUnmap(fd: CValuesRef<sqlite3_file>?, deleteFlag: Int): Int

@CCall("knifunptr_sqlite31231_winShmLock")
external fun winShmLock(fd: CValuesRef<sqlite3_file>?, ofst: Int, n: Int, flags: Int): Int

@CCall("knifunptr_sqlite31232_winShmBarrier")
external fun winShmBarrier(fd: CValuesRef<sqlite3_file>?): Unit

@CCall("knifunptr_sqlite31233_winShmMap")
external fun winShmMap(fd: CValuesRef<sqlite3_file>?, iRegion: Int, szRegion: Int, isWrite: Int, pp: CValuesRef<COpaquePointerVar>?): Int

@CCall("knifunptr_sqlite31234_winFetch")
external fun winFetch(fd: CValuesRef<sqlite3_file>?, iOff: i64, nAmt: Int, pp: CValuesRef<COpaquePointerVar>?): Int

@CCall("knifunptr_sqlite31235_winUnfetch")
external fun winUnfetch(fd: CValuesRef<sqlite3_file>?, iOff: i64, p: CValuesRef<*>?): Int

@CCall("knifunptr_sqlite31236_winConvertFromUtf8Filename")
external fun winConvertFromUtf8Filename(@CCall.CString zFilename: String?): COpaquePointer?

@CCall("knifunptr_sqlite31237_winMakeEndInDirSep")
external fun winMakeEndInDirSep(nBuf: Int, zBuf: CValuesRef<ByteVar>?): Int

@CCall("knifunptr_sqlite31238_winAccess")
external fun winAccess(pVfs: CValuesRef<sqlite3_vfs>?, @CCall.CString zFilename: String?, flags: Int, pResOut: CValuesRef<IntVar>?): Int

@CCall("knifunptr_sqlite31239_winIsVerbatimPathname")
external fun winIsVerbatimPathname(@CCall.CString zPathname: String?): BOOL

@CCall("knifunptr_sqlite31240_winFullPathname")
external fun winFullPathname(pVfs: CValuesRef<sqlite3_vfs>?, @CCall.CString zRelative: String?, nFull: Int, zFull: CValuesRef<ByteVar>?): Int

@CCall("knifunptr_sqlite31241_winDlOpen")
external fun winDlOpen(pVfs: CValuesRef<sqlite3_vfs>?, @CCall.CString zFilename: String?): COpaquePointer?

@CCall("knifunptr_sqlite31242_winDlError")
external fun winDlError(pVfs: CValuesRef<sqlite3_vfs>?, nBuf: Int, zBufOut: CValuesRef<ByteVar>?): Unit

@CCall("knifunptr_sqlite31243_winDlSym")
external fun winDlSym(pVfs: CValuesRef<sqlite3_vfs>?, pH: CValuesRef<*>?, @CCall.CString zSym: String?): CPointer<CFunction<() -> Unit>>?

@CCall("knifunptr_sqlite31244_winDlClose")
external fun winDlClose(pVfs: CValuesRef<sqlite3_vfs>?, pHandle: CValuesRef<*>?): Unit

@CCall("knifunptr_sqlite31245_xorMemory")
external fun xorMemory(p: CValuesRef<EntropyGatherer>?, x: CValuesRef<UByteVar>?, sz: Int): Unit

@CCall("knifunptr_sqlite31246_winRandomness")
external fun winRandomness(pVfs: CValuesRef<sqlite3_vfs>?, nBuf: Int, zBuf: CValuesRef<ByteVar>?): Int

@CCall("knifunptr_sqlite31247_winSleep")
external fun winSleep(pVfs: CValuesRef<sqlite3_vfs>?, microsec: Int): Int

@CCall("knifunptr_sqlite31248_winCurrentTimeInt64")
external fun winCurrentTimeInt64(pVfs: CValuesRef<sqlite3_vfs>?, piNow: CValuesRef<sqlite3_int64Var>?): Int

@CCall("knifunptr_sqlite31249_winCurrentTime")
external fun winCurrentTime(pVfs: CValuesRef<sqlite3_vfs>?, prNow: CValuesRef<DoubleVar>?): Int

@CCall("knifunptr_sqlite31250_winGetLastError")
external fun winGetLastError(pVfs: CValuesRef<sqlite3_vfs>?, nBuf: Int, zBuf: CValuesRef<ByteVar>?): Int

@CCall("knifunptr_sqlite31251_pcacheManageDirtyList")
external fun pcacheManageDirtyList(pPage: CValuesRef<PgHdr>?, addRemove: u8): Unit

@CCall("knifunptr_sqlite31252_pcacheUnpin")
external fun pcacheUnpin(p: CValuesRef<PgHdr>?): Unit

@CCall("knifunptr_sqlite31253_numberOfCachePages")
external fun numberOfCachePages(p: CValuesRef<PCache>?): Int

@CCall("knifunptr_sqlite31254_pcacheFetchFinishWithInit")
external fun pcacheFetchFinishWithInit(pCache: CValuesRef<PCache>?, pgno: Pgno, pPage: CValuesRef<sqlite3_pcache_page>?): CPointer<PgHdr>?

@CCall("knifunptr_sqlite31255_pcacheMergeDirtyList")
external fun pcacheMergeDirtyList(pA: CValuesRef<PgHdr>?, pB: CValuesRef<PgHdr>?): CPointer<PgHdr>?

@CCall("knifunptr_sqlite31256_pcacheSortDirtyList")
external fun pcacheSortDirtyList(pIn: CValuesRef<PgHdr>?): CPointer<PgHdr>?

@CCall("knifunptr_sqlite31257_pcache1InitBulk")
external fun pcache1InitBulk(pCache: CValuesRef<PCache1>?): Int

@CCall("knifunptr_sqlite31258_pcache1Alloc")
external fun pcache1Alloc(nByte: Int): COpaquePointer?

@CCall("knifunptr_sqlite31259_pcache1Free")
external fun pcache1Free(p: CValuesRef<*>?): Unit

@CCall("knifunptr_sqlite31260_pcache1AllocPage")
external fun pcache1AllocPage(pCache: CValuesRef<PCache1>?, benignMalloc: Int): CPointer<PgHdr1>?

@CCall("knifunptr_sqlite31261_pcache1FreePage")
external fun pcache1FreePage(p: CValuesRef<PgHdr1>?): Unit

@CCall("knifunptr_sqlite31262_pcache1UnderMemoryPressure")
external fun pcache1UnderMemoryPressure(pCache: CValuesRef<PCache1>?): Int

@CCall("knifunptr_sqlite31263_pcache1ResizeHash")
external fun pcache1ResizeHash(p: CValuesRef<PCache1>?): Unit

@CCall("knifunptr_sqlite31264_pcache1PinPage")
external fun pcache1PinPage(pPage: CValuesRef<PgHdr1>?): CPointer<PgHdr1>?

@CCall("knifunptr_sqlite31265_pcache1RemoveFromHash")
external fun pcache1RemoveFromHash(pPage: CValuesRef<PgHdr1>?, freeFlag: Int): Unit

@CCall("knifunptr_sqlite31266_pcache1EnforceMaxPage")
external fun pcache1EnforceMaxPage(pCache: CValuesRef<PCache1>?): Unit

@CCall("knifunptr_sqlite31267_pcache1TruncateUnsafe")
external fun pcache1TruncateUnsafe(pCache: CValuesRef<PCache1>?, iLimit: UInt): Unit

@CCall("knifunptr_sqlite31268_pcache1Init")
external fun pcache1Init(NotUsed: CValuesRef<*>?): Int

@CCall("knifunptr_sqlite31269_pcache1Shutdown")
external fun pcache1Shutdown(NotUsed: CValuesRef<*>?): Unit

@CCall("knifunptr_sqlite31270_pcache1Destroy")
external fun pcache1Destroy(p: CValuesRef<sqlite3_pcache>?): Unit

@CCall("knifunptr_sqlite31271_pcache1Create")
external fun pcache1Create(szPage: Int, szExtra: Int, bPurgeable: Int): CPointer<sqlite3_pcache>?

@CCall("knifunptr_sqlite31272_pcache1Cachesize")
external fun pcache1Cachesize(p: CValuesRef<sqlite3_pcache>?, nMax: Int): Unit

@CCall("knifunptr_sqlite31273_pcache1Shrink")
external fun pcache1Shrink(p: CValuesRef<sqlite3_pcache>?): Unit

@CCall("knifunptr_sqlite31274_pcache1Pagecount")
external fun pcache1Pagecount(p: CValuesRef<sqlite3_pcache>?): Int

@CCall("knifunptr_sqlite31275_pcache1FetchStage2")
external fun pcache1FetchStage2(pCache: CValuesRef<PCache1>?, iKey: UInt, createFlag: Int): CPointer<PgHdr1>?

@CCall("knifunptr_sqlite31276_pcache1FetchNoMutex")
external fun pcache1FetchNoMutex(p: CValuesRef<sqlite3_pcache>?, iKey: UInt, createFlag: Int): CPointer<PgHdr1>?

@CCall("knifunptr_sqlite31277_pcache1Fetch")
external fun pcache1Fetch(p: CValuesRef<sqlite3_pcache>?, iKey: UInt, createFlag: Int): CPointer<sqlite3_pcache_page>?

@CCall("knifunptr_sqlite31278_pcache1Unpin")
external fun pcache1Unpin(p: CValuesRef<sqlite3_pcache>?, pPg: CValuesRef<sqlite3_pcache_page>?, reuseUnlikely: Int): Unit

@CCall("knifunptr_sqlite31279_pcache1Rekey")
external fun pcache1Rekey(p: CValuesRef<sqlite3_pcache>?, pPg: CValuesRef<sqlite3_pcache_page>?, iOld: UInt, iNew: UInt): Unit

@CCall("knifunptr_sqlite31280_pcache1Truncate")
external fun pcache1Truncate(p: CValuesRef<sqlite3_pcache>?, iLimit: UInt): Unit

@CCall("knifunptr_sqlite31281_rowSetEntryAlloc")
external fun rowSetEntryAlloc(p: CValuesRef<RowSet>?): CPointer<RowSetEntry>?

@CCall("knifunptr_sqlite31282_rowSetEntryMerge")
external fun rowSetEntryMerge(pA: CValuesRef<RowSetEntry>?, pB: CValuesRef<RowSetEntry>?): CPointer<RowSetEntry>?

@CCall("knifunptr_sqlite31283_rowSetEntrySort")
external fun rowSetEntrySort(pIn: CValuesRef<RowSetEntry>?): CPointer<RowSetEntry>?

@CCall("knifunptr_sqlite31284_rowSetTreeToList")
external fun rowSetTreeToList(pIn: CValuesRef<RowSetEntry>?, ppFirst: CValuesRef<CPointerVar<RowSetEntry>>?, ppLast: CValuesRef<CPointerVar<RowSetEntry>>?): Unit

@CCall("knifunptr_sqlite31285_rowSetNDeepTree")
external fun rowSetNDeepTree(ppList: CValuesRef<CPointerVar<RowSetEntry>>?, iDepth: Int): CPointer<RowSetEntry>?

@CCall("knifunptr_sqlite31286_rowSetListToTree")
external fun rowSetListToTree(pList: CValuesRef<RowSetEntry>?): CPointer<RowSetEntry>?

@CCall("knifunptr_sqlite31287_sqlite3WalOpen")
external fun sqlite3WalOpen(arg0: CValuesRef<sqlite3_vfs>?, arg1: CValuesRef<sqlite3_file>?, @CCall.CString arg2: String?, arg3: Int, arg4: i64, arg5: CValuesRef<CPointerVar<Wal>>?): Int

@CCall("knifunptr_sqlite31288_sqlite3WalClose")
external fun sqlite3WalClose(pWal: CValuesRef<Wal>?, arg1: CValuesRef<sqlite3>?, sync_flags: Int, arg3: Int, arg4: CValuesRef<u8Var>?): Int

@CCall("knifunptr_sqlite31289_sqlite3WalLimit")
external fun sqlite3WalLimit(arg0: CValuesRef<Wal>?, arg1: i64): Unit

@CCall("knifunptr_sqlite31290_sqlite3WalBeginReadTransaction")
external fun sqlite3WalBeginReadTransaction(pWal: CValuesRef<Wal>?, arg1: CValuesRef<IntVar>?): Int

@CCall("knifunptr_sqlite31291_sqlite3WalEndReadTransaction")
external fun sqlite3WalEndReadTransaction(pWal: CValuesRef<Wal>?): Unit

@CCall("knifunptr_sqlite31292_sqlite3WalFindFrame")
external fun sqlite3WalFindFrame(arg0: CValuesRef<Wal>?, arg1: Pgno, arg2: CValuesRef<u32Var>?): Int

@CCall("knifunptr_sqlite31293_sqlite3WalReadFrame")
external fun sqlite3WalReadFrame(arg0: CValuesRef<Wal>?, arg1: u32, arg2: Int, arg3: CValuesRef<u8Var>?): Int

@CCall("knifunptr_sqlite31294_sqlite3WalDbsize")
external fun sqlite3WalDbsize(pWal: CValuesRef<Wal>?): Pgno

@CCall("knifunptr_sqlite31295_sqlite3WalBeginWriteTransaction")
external fun sqlite3WalBeginWriteTransaction(pWal: CValuesRef<Wal>?): Int

@CCall("knifunptr_sqlite31296_sqlite3WalEndWriteTransaction")
external fun sqlite3WalEndWriteTransaction(pWal: CValuesRef<Wal>?): Int

@CCall("knifunptr_sqlite31297_sqlite3WalUndo")
external fun sqlite3WalUndo(pWal: CValuesRef<Wal>?, xUndo: CPointer<CFunction<(COpaquePointer?, Pgno) -> Int>>?, pUndoCtx: CValuesRef<*>?): Int

@CCall("knifunptr_sqlite31298_sqlite3WalSavepoint")
external fun sqlite3WalSavepoint(pWal: CValuesRef<Wal>?, aWalData: CValuesRef<u32Var>?): Unit

@CCall("knifunptr_sqlite31299_sqlite3WalSavepointUndo")
external fun sqlite3WalSavepointUndo(pWal: CValuesRef<Wal>?, aWalData: CValuesRef<u32Var>?): Int

@CCall("knifunptr_sqlite31300_sqlite3WalFrames")
external fun sqlite3WalFrames(pWal: CValuesRef<Wal>?, arg1: Int, arg2: CValuesRef<PgHdr>?, arg3: Pgno, arg4: Int, arg5: Int): Int

@CCall("knifunptr_sqlite31301_sqlite3WalCheckpoint")
external fun sqlite3WalCheckpoint(pWal: CValuesRef<Wal>?, db: CValuesRef<sqlite3>?, eMode: Int, xBusy: CPointer<CFunction<(COpaquePointer?) -> Int>>?, pBusyArg: CValuesRef<*>?, sync_flags: Int, nBuf: Int, zBuf: CValuesRef<u8Var>?, pnLog: CValuesRef<IntVar>?, pnCkpt: CValuesRef<IntVar>?): Int

@CCall("knifunptr_sqlite31302_sqlite3WalCallback")
external fun sqlite3WalCallback(pWal: CValuesRef<Wal>?): Int

@CCall("knifunptr_sqlite31303_sqlite3WalExclusiveMode")
external fun sqlite3WalExclusiveMode(pWal: CValuesRef<Wal>?, op: Int): Int

@CCall("knifunptr_sqlite31304_sqlite3WalHeapMemory")
external fun sqlite3WalHeapMemory(pWal: CValuesRef<Wal>?): Int

@CCall("knifunptr_sqlite31305_sqlite3WalFile")
external fun sqlite3WalFile(pWal: CValuesRef<Wal>?): CPointer<sqlite3_file>?

@CCall("knifunptr_sqlite31306_getPageNormal")
external fun getPageNormal(arg0: CValuesRef<Pager>?, arg1: Pgno, arg2: CValuesRef<CPointerVar<DbPage>>?, arg3: Int): Int

@CCall("knifunptr_sqlite31307_getPageError")
external fun getPageError(arg0: CValuesRef<Pager>?, arg1: Pgno, arg2: CValuesRef<CPointerVar<DbPage>>?, arg3: Int): Int

@CCall("knifunptr_sqlite31308_getPageMMap")
external fun getPageMMap(arg0: CValuesRef<Pager>?, arg1: Pgno, arg2: CValuesRef<CPointerVar<DbPage>>?, arg3: Int): Int

@CCall("knifunptr_sqlite31309_setGetterMethod")
external fun setGetterMethod(pPager: CValuesRef<Pager>?): Unit

@CCall("knifunptr_sqlite31310_subjRequiresPage")
external fun subjRequiresPage(pPg: CValuesRef<PgHdr>?): Int

@CCall("knifunptr_sqlite31311_read32bits")
external fun read32bits(fd: CValuesRef<sqlite3_file>?, offset: i64, pRes: CValuesRef<u32Var>?): Int

@CCall("knifunptr_sqlite31312_write32bits")
external fun write32bits(fd: CValuesRef<sqlite3_file>?, offset: i64, `val`: u32): Int

@CCall("knifunptr_sqlite31313_pagerUnlockDb")
external fun pagerUnlockDb(pPager: CValuesRef<Pager>?, eLock: Int): Int

@CCall("knifunptr_sqlite31314_pagerLockDb")
external fun pagerLockDb(pPager: CValuesRef<Pager>?, eLock: Int): Int

@CCall("knifunptr_sqlite31315_jrnlBufferSize")
external fun jrnlBufferSize(pPager: CValuesRef<Pager>?): Int

@CCall("knifunptr_sqlite31316_readMasterJournal")
external fun readMasterJournal(pJrnl: CValuesRef<sqlite3_file>?, zMaster: CValuesRef<ByteVar>?, nMaster: u32): Int

@CCall("knifunptr_sqlite31317_journalHdrOffset")
external fun journalHdrOffset(pPager: CValuesRef<Pager>?): i64

@CCall("knifunptr_sqlite31318_zeroJournalHdr")
external fun zeroJournalHdr(pPager: CValuesRef<Pager>?, doTruncate: Int): Int

@CCall("knifunptr_sqlite31319_writeJournalHdr")
external fun writeJournalHdr(pPager: CValuesRef<Pager>?): Int

@CCall("knifunptr_sqlite31320_readJournalHdr")
external fun readJournalHdr(pPager: CValuesRef<Pager>?, isHot: Int, journalSize: i64, pNRec: CValuesRef<u32Var>?, pDbSize: CValuesRef<u32Var>?): Int

@CCall("knifunptr_sqlite31321_writeMasterJournal")
external fun writeMasterJournal(pPager: CValuesRef<Pager>?, @CCall.CString zMaster: String?): Int

@CCall("knifunptr_sqlite31322_pager_reset")
external fun pager_reset(pPager: CValuesRef<Pager>?): Unit

@CCall("knifunptr_sqlite31323_releaseAllSavepoints")
external fun releaseAllSavepoints(pPager: CValuesRef<Pager>?): Unit

@CCall("knifunptr_sqlite31324_addToSavepointBitvecs")
external fun addToSavepointBitvecs(pPager: CValuesRef<Pager>?, pgno: Pgno): Int

@CCall("knifunptr_sqlite31325_pager_unlock")
external fun pager_unlock(pPager: CValuesRef<Pager>?): Unit

@CCall("knifunptr_sqlite31326_pager_error")
external fun pager_error(pPager: CValuesRef<Pager>?, rc: Int): Int

@CCall("knifunptr_sqlite31327_pager_truncate")
external fun pager_truncate(pPager: CValuesRef<Pager>?, nPage: Pgno): Int

@CCall("knifunptr_sqlite31328_pagerFlushOnCommit")
external fun pagerFlushOnCommit(pPager: CValuesRef<Pager>?, bCommit: Int): Int

@CCall("knifunptr_sqlite31329_pager_end_transaction")
external fun pager_end_transaction(pPager: CValuesRef<Pager>?, hasMaster: Int, bCommit: Int): Int

@CCall("knifunptr_sqlite31330_pagerUnlockAndRollback")
external fun pagerUnlockAndRollback(pPager: CValuesRef<Pager>?): Unit

@CCall("knifunptr_sqlite31331_pager_cksum")
external fun pager_cksum(pPager: CValuesRef<Pager>?, aData: CValuesRef<u8Var>?): u32

@CCall("knifunptr_sqlite31332_pager_playback_one_page")
external fun pager_playback_one_page(pPager: CValuesRef<Pager>?, pOffset: CValuesRef<i64Var>?, pDone: CValuesRef<Bitvec>?, isMainJrnl: Int, isSavepnt: Int): Int

@CCall("knifunptr_sqlite31333_pager_delmaster")
external fun pager_delmaster(pPager: CValuesRef<Pager>?, @CCall.CString zMaster: String?): Int

@CCall("knifunptr_sqlite31334_setSectorSize")
external fun setSectorSize(pPager: CValuesRef<Pager>?): Unit

@CCall("knifunptr_sqlite31335_pager_playback")
external fun pager_playback(pPager: CValuesRef<Pager>?, isHot: Int): Int

@CCall("knifunptr_sqlite31336_readDbPage")
external fun readDbPage(pPg: CValuesRef<PgHdr>?): Int

@CCall("knifunptr_sqlite31337_pager_write_changecounter")
external fun pager_write_changecounter(pPg: CValuesRef<PgHdr>?): Unit

@CCall("knifunptr_sqlite31338_pagerUndoCallback")
external fun pagerUndoCallback(pCtx: CValuesRef<*>?, iPg: Pgno): Int

@CCall("knifunptr_sqlite31339_pagerRollbackWal")
external fun pagerRollbackWal(pPager: CValuesRef<Pager>?): Int

@CCall("knifunptr_sqlite31340_pagerWalFrames")
external fun pagerWalFrames(pPager: CValuesRef<Pager>?, pList: CValuesRef<PgHdr>?, nTruncate: Pgno, isCommit: Int): Int

@CCall("knifunptr_sqlite31341_pagerBeginReadTransaction")
external fun pagerBeginReadTransaction(pPager: CValuesRef<Pager>?): Int

@CCall("knifunptr_sqlite31342_pagerPagecount")
external fun pagerPagecount(pPager: CValuesRef<Pager>?, pnPage: CValuesRef<PgnoVar>?): Int

@CCall("knifunptr_sqlite31343_pagerOpenWalIfPresent")
external fun pagerOpenWalIfPresent(pPager: CValuesRef<Pager>?): Int

@CCall("knifunptr_sqlite31344_pagerPlaybackSavepoint")
external fun pagerPlaybackSavepoint(pPager: CValuesRef<Pager>?, pSavepoint: CValuesRef<PagerSavepoint>?): Int

@CCall("knifunptr_sqlite31345_pagerFixMaplimit")
external fun pagerFixMaplimit(pPager: CValuesRef<Pager>?): Unit

@CCall("knifunptr_sqlite31346_pagerOpentemp")
external fun pagerOpentemp(pPager: CValuesRef<Pager>?, pFile: CValuesRef<sqlite3_file>?, vfsFlags: Int): Int

@CCall("knifunptr_sqlite31347_pager_wait_on_lock")
external fun pager_wait_on_lock(pPager: CValuesRef<Pager>?, locktype: Int): Int

@CCall("knifunptr_sqlite31348_pagerSyncHotJournal")
external fun pagerSyncHotJournal(pPager: CValuesRef<Pager>?): Int

@CCall("knifunptr_sqlite31349_pagerAcquireMapPage")
external fun pagerAcquireMapPage(pPager: CValuesRef<Pager>?, pgno: Pgno, pData: CValuesRef<*>?, ppPage: CValuesRef<CPointerVar<PgHdr>>?): Int

@CCall("knifunptr_sqlite31350_pagerReleaseMapPage")
external fun pagerReleaseMapPage(pPg: CValuesRef<PgHdr>?): Unit

@CCall("knifunptr_sqlite31351_pagerFreeMapHdrs")
external fun pagerFreeMapHdrs(pPager: CValuesRef<Pager>?): Unit

@CCall("knifunptr_sqlite31352_databaseIsUnmoved")
external fun databaseIsUnmoved(pPager: CValuesRef<Pager>?): Int

@CCall("knifunptr_sqlite31353_syncJournal")
external fun syncJournal(pPager: CValuesRef<Pager>?, newHdr: Int): Int

@CCall("knifunptr_sqlite31354_pager_write_pagelist")
external fun pager_write_pagelist(pPager: CValuesRef<Pager>?, pList: CValuesRef<PgHdr>?): Int

@CCall("knifunptr_sqlite31355_openSubJournal")
external fun openSubJournal(pPager: CValuesRef<Pager>?): Int

@CCall("knifunptr_sqlite31356_subjournalPage")
external fun subjournalPage(pPg: CValuesRef<PgHdr>?): Int

@CCall("knifunptr_sqlite31357_subjournalPageIfRequired")
external fun subjournalPageIfRequired(pPg: CValuesRef<PgHdr>?): Int

@CCall("knifunptr_sqlite31358_pagerStress")
external fun pagerStress(p: CValuesRef<*>?, pPg: CValuesRef<PgHdr>?): Int

@CCall("knifunptr_sqlite31359_hasHotJournal")
external fun hasHotJournal(pPager: CValuesRef<Pager>?, pExists: CValuesRef<IntVar>?): Int

@CCall("knifunptr_sqlite31360_pagerUnlockIfUnused")
external fun pagerUnlockIfUnused(pPager: CValuesRef<Pager>?): Unit

@CCall("knifunptr_sqlite31361_pager_open_journal")
external fun pager_open_journal(pPager: CValuesRef<Pager>?): Int

@CCall("knifunptr_sqlite31362_pagerAddPageToRollbackJournal")
external fun pagerAddPageToRollbackJournal(pPg: CValuesRef<PgHdr>?): Int

@CCall("knifunptr_sqlite31363_pager_write")
external fun pager_write(pPg: CValuesRef<PgHdr>?): Int

@CCall("knifunptr_sqlite31364_pagerWriteLargeSector")
external fun pagerWriteLargeSector(pPg: CValuesRef<PgHdr>?): Int

@CCall("knifunptr_sqlite31365_pager_incr_changecounter")
external fun pager_incr_changecounter(pPager: CValuesRef<Pager>?, isDirectMode: Int): Int

@CCall("knifunptr_sqlite31366_pagerOpenSavepoint")
external fun pagerOpenSavepoint(pPager: CValuesRef<Pager>?, nSavepoint: Int): Int

@CCall("knifunptr_sqlite31367_pagerExclusiveLock")
external fun pagerExclusiveLock(pPager: CValuesRef<Pager>?): Int

@CCall("knifunptr_sqlite31368_pagerOpenWal")
external fun pagerOpenWal(pPager: CValuesRef<Pager>?): Int

@CCall("knifunptr_sqlite31369_walIndexPageRealloc")
external fun walIndexPageRealloc(pWal: CValuesRef<Wal>?, iPage: Int, ppPage: CValuesRef<CPointerVar<u32Var>>?): Int

@CCall("knifunptr_sqlite31370_walIndexPage")
external fun walIndexPage(pWal: CValuesRef<Wal>?, iPage: Int, ppPage: CValuesRef<CPointerVar<u32Var>>?): Int

@CCall("knifunptr_sqlite31371_walCkptInfo")
external fun walCkptInfo(pWal: CValuesRef<Wal>?): CPointer<WalCkptInfo>?

@CCall("knifunptr_sqlite31372_walIndexHdr")
external fun walIndexHdr(pWal: CValuesRef<Wal>?): CPointer<WalIndexHdr>?

@CCall("knifunptr_sqlite31373_walChecksumBytes")
external fun walChecksumBytes(nativeCksum: Int, a: CValuesRef<u8Var>?, nByte: Int, aIn: CValuesRef<u32Var>?, aOut: CValuesRef<u32Var>?): Unit

@CCall("knifunptr_sqlite31374_walShmBarrier")
external fun walShmBarrier(pWal: CValuesRef<Wal>?): Unit

@CCall("knifunptr_sqlite31375_walIndexWriteHdr")
external fun walIndexWriteHdr(pWal: CValuesRef<Wal>?): Unit

@CCall("knifunptr_sqlite31376_walEncodeFrame")
external fun walEncodeFrame(pWal: CValuesRef<Wal>?, iPage: u32, nTruncate: u32, aData: CValuesRef<u8Var>?, aFrame: CValuesRef<u8Var>?): Unit

@CCall("knifunptr_sqlite31377_walDecodeFrame")
external fun walDecodeFrame(pWal: CValuesRef<Wal>?, piPage: CValuesRef<u32Var>?, pnTruncate: CValuesRef<u32Var>?, aData: CValuesRef<u8Var>?, aFrame: CValuesRef<u8Var>?): Int

@CCall("knifunptr_sqlite31378_walLockShared")
external fun walLockShared(pWal: CValuesRef<Wal>?, lockIdx: Int): Int

@CCall("knifunptr_sqlite31379_walUnlockShared")
external fun walUnlockShared(pWal: CValuesRef<Wal>?, lockIdx: Int): Unit

@CCall("knifunptr_sqlite31380_walLockExclusive")
external fun walLockExclusive(pWal: CValuesRef<Wal>?, lockIdx: Int, n: Int): Int

@CCall("knifunptr_sqlite31381_walUnlockExclusive")
external fun walUnlockExclusive(pWal: CValuesRef<Wal>?, lockIdx: Int, n: Int): Unit

@CCall("knifunptr_sqlite31382_walHash")
external fun walHash(iPage: u32): Int

@CCall("knifunptr_sqlite31383_walNextHash")
external fun walNextHash(iPriorHash: Int): Int

@CCall("knifunptr_sqlite31384_walHashGet")
external fun walHashGet(pWal: CValuesRef<Wal>?, iHash: Int, pLoc: CValuesRef<WalHashLoc>?): Int

@CCall("knifunptr_sqlite31385_walFramePage")
external fun walFramePage(iFrame: u32): Int

@CCall("knifunptr_sqlite31386_walFramePgno")
external fun walFramePgno(pWal: CValuesRef<Wal>?, iFrame: u32): u32

@CCall("knifunptr_sqlite31387_walCleanupHash")
external fun walCleanupHash(pWal: CValuesRef<Wal>?): Unit

@CCall("knifunptr_sqlite31388_walIndexAppend")
external fun walIndexAppend(pWal: CValuesRef<Wal>?, iFrame: u32, iPage: u32): Int

@CCall("knifunptr_sqlite31389_walIndexRecover")
external fun walIndexRecover(pWal: CValuesRef<Wal>?): Int

@CCall("knifunptr_sqlite31390_walIndexClose")
external fun walIndexClose(pWal: CValuesRef<Wal>?, isDelete: Int): Unit

@CCall("knifunptr_sqlite31391_walIteratorNext")
external fun walIteratorNext(p: CValuesRef<WalIterator>?, piPage: CValuesRef<u32Var>?, piFrame: CValuesRef<u32Var>?): Int

@CCall("knifunptr_sqlite31392_walMerge")
external fun walMerge(aContent: CValuesRef<u32Var>?, aLeft: CValuesRef<ht_slotVar>?, nLeft: Int, paRight: CValuesRef<CPointerVar<ht_slotVar>>?, pnRight: CValuesRef<IntVar>?, aTmp: CValuesRef<ht_slotVar>?): Unit

@CCall("knifunptr_sqlite31393_walMergesort")
external fun walMergesort(aContent: CValuesRef<u32Var>?, aBuffer: CValuesRef<ht_slotVar>?, aList: CValuesRef<ht_slotVar>?, pnList: CValuesRef<IntVar>?): Unit

@CCall("knifunptr_sqlite31394_walIteratorFree")
external fun walIteratorFree(p: CValuesRef<WalIterator>?): Unit

@CCall("knifunptr_sqlite31395_walIteratorInit")
external fun walIteratorInit(pWal: CValuesRef<Wal>?, nBackfill: u32, pp: CValuesRef<CPointerVar<WalIterator>>?): Int

@CCall("knifunptr_sqlite31396_walBusyLock")
external fun walBusyLock(pWal: CValuesRef<Wal>?, xBusy: CPointer<CFunction<(COpaquePointer?) -> Int>>?, pBusyArg: CValuesRef<*>?, lockIdx: Int, n: Int): Int

@CCall("knifunptr_sqlite31397_walPagesize")
external fun walPagesize(pWal: CValuesRef<Wal>?): Int

@CCall("knifunptr_sqlite31398_walRestartHdr")
external fun walRestartHdr(pWal: CValuesRef<Wal>?, salt1: u32): Unit

@CCall("knifunptr_sqlite31399_walCheckpoint")
external fun walCheckpoint(pWal: CValuesRef<Wal>?, db: CValuesRef<sqlite3>?, eMode: Int, xBusy: CPointer<CFunction<(COpaquePointer?) -> Int>>?, pBusyArg: CValuesRef<*>?, sync_flags: Int, zBuf: CValuesRef<u8Var>?): Int

@CCall("knifunptr_sqlite31400_walLimitSize")
external fun walLimitSize(pWal: CValuesRef<Wal>?, nMax: i64): Unit

@CCall("knifunptr_sqlite31401_walIndexTryHdr")
external fun walIndexTryHdr(pWal: CValuesRef<Wal>?, pChanged: CValuesRef<IntVar>?): Int

@CCall("knifunptr_sqlite31402_walIndexReadHdr")
external fun walIndexReadHdr(pWal: CValuesRef<Wal>?, pChanged: CValuesRef<IntVar>?): Int

@CCall("knifunptr_sqlite31403_walBeginShmUnreliable")
external fun walBeginShmUnreliable(pWal: CValuesRef<Wal>?, pChanged: CValuesRef<IntVar>?): Int

@CCall("knifunptr_sqlite31404_walTryBeginRead")
external fun walTryBeginRead(pWal: CValuesRef<Wal>?, pChanged: CValuesRef<IntVar>?, useWal: Int, cnt: Int): Int

@CCall("knifunptr_sqlite31405_walRestartLog")
external fun walRestartLog(pWal: CValuesRef<Wal>?): Int

@CCall("knifunptr_sqlite31406_walWriteToLog")
external fun walWriteToLog(p: CValuesRef<WalWriter>?, pContent: CValuesRef<*>?, iAmt: Int, iOffset: sqlite3_int64): Int

@CCall("knifunptr_sqlite31407_walWriteOneFrame")
external fun walWriteOneFrame(p: CValuesRef<WalWriter>?, pPage: CValuesRef<PgHdr>?, nTruncate: Int, iOffset: sqlite3_int64): Int

@CCall("knifunptr_sqlite31408_walRewriteChecksums")
external fun walRewriteChecksums(pWal: CValuesRef<Wal>?, iLast: u32): Int

@CCall("knifunptr_sqlite31409_lockBtreeMutex")
external fun lockBtreeMutex(p: CValuesRef<Btree>?): Unit

@CCall("knifunptr_sqlite31410_unlockBtreeMutex")
external fun unlockBtreeMutex(p: CValuesRef<Btree>?): Unit

@CCall("knifunptr_sqlite31411_btreeLockCarefully")
external fun btreeLockCarefully(p: CValuesRef<Btree>?): Unit

@CCall("knifunptr_sqlite31412_btreeEnterAll")
external fun btreeEnterAll(db: CValuesRef<sqlite3>?): Unit

@CCall("knifunptr_sqlite31413_btreeLeaveAll")
external fun btreeLeaveAll(db: CValuesRef<sqlite3>?): Unit

@CCall("knifunptr_sqlite31414_querySharedCacheTableLock")
external fun querySharedCacheTableLock(p: CValuesRef<Btree>?, iTab: Pgno, eLock: u8): Int

@CCall("knifunptr_sqlite31415_setSharedCacheTableLock")
external fun setSharedCacheTableLock(p: CValuesRef<Btree>?, iTable: Pgno, eLock: u8): Int

@CCall("knifunptr_sqlite31416_clearAllSharedCacheTableLocks")
external fun clearAllSharedCacheTableLocks(p: CValuesRef<Btree>?): Unit

@CCall("knifunptr_sqlite31417_downgradeAllSharedCacheTableLocks")
external fun downgradeAllSharedCacheTableLocks(p: CValuesRef<Btree>?): Unit

@CCall("knifunptr_sqlite31418_releasePage")
external fun releasePage(pPage: CValuesRef<MemPage>?): Unit

@CCall("knifunptr_sqlite31419_releasePageOne")
external fun releasePageOne(pPage: CValuesRef<MemPage>?): Unit

@CCall("knifunptr_sqlite31420_releasePageNotNull")
external fun releasePageNotNull(pPage: CValuesRef<MemPage>?): Unit

@CCall("knifunptr_sqlite31421_invalidateAllOverflowCache")
external fun invalidateAllOverflowCache(pBt: CValuesRef<BtShared>?): Unit

@CCall("knifunptr_sqlite31422_invalidateIncrblobCursors")
external fun invalidateIncrblobCursors(pBtree: CValuesRef<Btree>?, pgnoRoot: Pgno, iRow: i64, isClearTable: Int): Unit

@CCall("knifunptr_sqlite31423_btreeSetHasContent")
external fun btreeSetHasContent(pBt: CValuesRef<BtShared>?, pgno: Pgno): Int

@CCall("knifunptr_sqlite31424_btreeGetHasContent")
external fun btreeGetHasContent(pBt: CValuesRef<BtShared>?, pgno: Pgno): Int

@CCall("knifunptr_sqlite31425_btreeClearHasContent")
external fun btreeClearHasContent(pBt: CValuesRef<BtShared>?): Unit

@CCall("knifunptr_sqlite31426_btreeReleaseAllCursorPages")
external fun btreeReleaseAllCursorPages(pCur: CValuesRef<BtCursor>?): Unit

@CCall("knifunptr_sqlite31427_saveCursorKey")
external fun saveCursorKey(pCur: CValuesRef<BtCursor>?): Int

@CCall("knifunptr_sqlite31428_saveCursorPosition")
external fun saveCursorPosition(pCur: CValuesRef<BtCursor>?): Int

@CCall("knifunptr_sqlite31429_saveCursorsOnList")
external fun saveCursorsOnList(arg0: CValuesRef<BtCursor>?, arg1: Pgno, arg2: CValuesRef<BtCursor>?): Int

@CCall("knifunptr_sqlite31430_saveAllCursors")
external fun saveAllCursors(pBt: CValuesRef<BtShared>?, iRoot: Pgno, pExcept: CValuesRef<BtCursor>?): Int

@CCall("knifunptr_sqlite31431_btreeMoveto")
external fun btreeMoveto(pCur: CValuesRef<BtCursor>?, pKey: CValuesRef<*>?, nKey: i64, bias: Int, pRes: CValuesRef<IntVar>?): Int

@CCall("knifunptr_sqlite31432_btreeRestoreCursorPosition")
external fun btreeRestoreCursorPosition(pCur: CValuesRef<BtCursor>?): Int

@CCall("knifunptr_sqlite31433_ptrmapPageno")
external fun ptrmapPageno(pBt: CValuesRef<BtShared>?, pgno: Pgno): Pgno

@CCall("knifunptr_sqlite31434_ptrmapPut")
external fun ptrmapPut(pBt: CValuesRef<BtShared>?, key: Pgno, eType: u8, parent: Pgno, pRC: CValuesRef<IntVar>?): Unit

@CCall("knifunptr_sqlite31435_ptrmapGet")
external fun ptrmapGet(pBt: CValuesRef<BtShared>?, key: Pgno, pEType: CValuesRef<u8Var>?, pPgno: CValuesRef<PgnoVar>?): Int

@CCall("knifunptr_sqlite31436_btreeParseCellAdjustSizeForOverflow")
external fun btreeParseCellAdjustSizeForOverflow(pPage: CValuesRef<MemPage>?, pCell: CValuesRef<u8Var>?, pInfo: CValuesRef<CellInfo>?): Unit

@CCall("knifunptr_sqlite31437_btreeParseCellPtrNoPayload")
external fun btreeParseCellPtrNoPayload(pPage: CValuesRef<MemPage>?, pCell: CValuesRef<u8Var>?, pInfo: CValuesRef<CellInfo>?): Unit

@CCall("knifunptr_sqlite31438_btreeParseCellPtr")
external fun btreeParseCellPtr(pPage: CValuesRef<MemPage>?, pCell: CValuesRef<u8Var>?, pInfo: CValuesRef<CellInfo>?): Unit

@CCall("knifunptr_sqlite31439_btreeParseCellPtrIndex")
external fun btreeParseCellPtrIndex(pPage: CValuesRef<MemPage>?, pCell: CValuesRef<u8Var>?, pInfo: CValuesRef<CellInfo>?): Unit

@CCall("knifunptr_sqlite31440_btreeParseCell")
external fun btreeParseCell(pPage: CValuesRef<MemPage>?, iCell: Int, pInfo: CValuesRef<CellInfo>?): Unit

@CCall("knifunptr_sqlite31441_cellSizePtr")
external fun cellSizePtr(pPage: CValuesRef<MemPage>?, pCell: CValuesRef<u8Var>?): u16

@CCall("knifunptr_sqlite31442_cellSizePtrNoPayload")
external fun cellSizePtrNoPayload(pPage: CValuesRef<MemPage>?, pCell: CValuesRef<u8Var>?): u16

@CCall("knifunptr_sqlite31443_ptrmapPutOvflPtr")
external fun ptrmapPutOvflPtr(pPage: CValuesRef<MemPage>?, pSrc: CValuesRef<MemPage>?, pCell: CValuesRef<u8Var>?, pRC: CValuesRef<IntVar>?): Unit

@CCall("knifunptr_sqlite31444_defragmentPage")
external fun defragmentPage(pPage: CValuesRef<MemPage>?, nMaxFrag: Int): Int

@CCall("knifunptr_sqlite31445_pageFindSlot")
external fun pageFindSlot(pPg: CValuesRef<MemPage>?, nByte: Int, pRc: CValuesRef<IntVar>?): CPointer<u8Var>?

@CCall("knifunptr_sqlite31446_allocateSpace")
external fun allocateSpace(pPage: CValuesRef<MemPage>?, nByte: Int, pIdx: CValuesRef<IntVar>?): Int

@CCall("knifunptr_sqlite31447_freeSpace")
external fun freeSpace(pPage: CValuesRef<MemPage>?, iStart: u16, iSize: u16): Int

@CCall("knifunptr_sqlite31448_decodeFlags")
external fun decodeFlags(pPage: CValuesRef<MemPage>?, flagByte: Int): Int

@CCall("knifunptr_sqlite31449_btreeInitPage")
external fun btreeInitPage(pPage: CValuesRef<MemPage>?): Int

@CCall("knifunptr_sqlite31450_zeroPage")
external fun zeroPage(pPage: CValuesRef<MemPage>?, flags: Int): Unit

@CCall("knifunptr_sqlite31451_btreePageFromDbPage")
external fun btreePageFromDbPage(pDbPage: CValuesRef<DbPage>?, pgno: Pgno, pBt: CValuesRef<BtShared>?): CPointer<MemPage>?

@CCall("knifunptr_sqlite31452_btreeGetPage")
external fun btreeGetPage(pBt: CValuesRef<BtShared>?, pgno: Pgno, ppPage: CValuesRef<CPointerVar<MemPage>>?, flags: Int): Int

@CCall("knifunptr_sqlite31453_btreePageLookup")
external fun btreePageLookup(pBt: CValuesRef<BtShared>?, pgno: Pgno): CPointer<MemPage>?

@CCall("knifunptr_sqlite31454_btreePagecount")
external fun btreePagecount(pBt: CValuesRef<BtShared>?): Pgno

@CCall("knifunptr_sqlite31455_getAndInitPage")
external fun getAndInitPage(pBt: CValuesRef<BtShared>?, pgno: Pgno, ppPage: CValuesRef<CPointerVar<MemPage>>?, pCur: CValuesRef<BtCursor>?, bReadOnly: Int): Int

@CCall("knifunptr_sqlite31456_btreeGetUnusedPage")
external fun btreeGetUnusedPage(pBt: CValuesRef<BtShared>?, pgno: Pgno, ppPage: CValuesRef<CPointerVar<MemPage>>?, flags: Int): Int

@CCall("knifunptr_sqlite31457_pageReinit")
external fun pageReinit(pData: CValuesRef<DbPage>?): Unit

@CCall("knifunptr_sqlite31458_btreeInvokeBusyHandler")
external fun btreeInvokeBusyHandler(pArg: CValuesRef<*>?): Int

@CCall("knifunptr_sqlite31459_removeFromSharingList")
external fun removeFromSharingList(pBt: CValuesRef<BtShared>?): Int

@CCall("knifunptr_sqlite31460_allocateTempSpace")
external fun allocateTempSpace(pBt: CValuesRef<BtShared>?): Unit

@CCall("knifunptr_sqlite31461_freeTempSpace")
external fun freeTempSpace(pBt: CValuesRef<BtShared>?): Unit

@CCall("knifunptr_sqlite31462_newDatabase")
external fun newDatabase(arg0: CValuesRef<BtShared>?): Int

@CCall("knifunptr_sqlite31463_lockBtree")
external fun lockBtree(pBt: CValuesRef<BtShared>?): Int

@CCall("knifunptr_sqlite31464_unlockBtreeIfUnused")
external fun unlockBtreeIfUnused(pBt: CValuesRef<BtShared>?): Unit

@CCall("knifunptr_sqlite31465_setChildPtrmaps")
external fun setChildPtrmaps(pPage: CValuesRef<MemPage>?): Int

@CCall("knifunptr_sqlite31466_modifyPagePointer")
external fun modifyPagePointer(pPage: CValuesRef<MemPage>?, iFrom: Pgno, iTo: Pgno, eType: u8): Int

@CCall("knifunptr_sqlite31467_relocatePage")
external fun relocatePage(pBt: CValuesRef<BtShared>?, pDbPage: CValuesRef<MemPage>?, eType: u8, iPtrPage: Pgno, iFreePage: Pgno, isCommit: Int): Int

@CCall("knifunptr_sqlite31468_allocateBtreePage")
external fun allocateBtreePage(arg0: CValuesRef<BtShared>?, arg1: CValuesRef<CPointerVar<MemPage>>?, arg2: CValuesRef<PgnoVar>?, arg3: Pgno, arg4: u8): Int

@CCall("knifunptr_sqlite31469_incrVacuumStep")
external fun incrVacuumStep(pBt: CValuesRef<BtShared>?, nFin: Pgno, iLastPg: Pgno, bCommit: Int): Int

@CCall("knifunptr_sqlite31470_finalDbSize")
external fun finalDbSize(pBt: CValuesRef<BtShared>?, nOrig: Pgno, nFree: Pgno): Pgno

@CCall("knifunptr_sqlite31471_autoVacuumCommit")
external fun autoVacuumCommit(pBt: CValuesRef<BtShared>?): Int

@CCall("knifunptr_sqlite31472_btreeEndTransaction")
external fun btreeEndTransaction(p: CValuesRef<Btree>?): Unit

@CCall("knifunptr_sqlite31473_btreeCursor")
external fun btreeCursor(p: CValuesRef<Btree>?, iTable: Int, wrFlag: Int, pKeyInfo: CValuesRef<KeyInfo>?, pCur: CValuesRef<BtCursor>?): Int

@CCall("knifunptr_sqlite31474_getCellInfo")
external fun getCellInfo(pCur: CValuesRef<BtCursor>?): Unit

@CCall("knifunptr_sqlite31475_getOverflowPage")
external fun getOverflowPage(pBt: CValuesRef<BtShared>?, ovfl: Pgno, ppPage: CValuesRef<CPointerVar<MemPage>>?, pPgnoNext: CValuesRef<PgnoVar>?): Int

@CCall("knifunptr_sqlite31476_copyPayload")
external fun copyPayload(pPayload: CValuesRef<*>?, pBuf: CValuesRef<*>?, nByte: Int, eOp: Int, pDbPage: CValuesRef<DbPage>?): Int

@CCall("knifunptr_sqlite31477_accessPayload")
external fun accessPayload(pCur: CValuesRef<BtCursor>?, offset: u32, amt: u32, pBuf: CValuesRef<UByteVar>?, eOp: Int): Int

@CCall("knifunptr_sqlite31478_accessPayloadChecked")
external fun accessPayloadChecked(pCur: CValuesRef<BtCursor>?, offset: u32, amt: u32, pBuf: CValuesRef<*>?): Int

@CCall("knifunptr_sqlite31479_fetchPayload")
external fun fetchPayload(pCur: CValuesRef<BtCursor>?, pAmt: CValuesRef<u32Var>?): COpaquePointer?

@CCall("knifunptr_sqlite31480_moveToChild")
external fun moveToChild(pCur: CValuesRef<BtCursor>?, newPgno: u32): Int

@CCall("knifunptr_sqlite31481_moveToParent")
external fun moveToParent(pCur: CValuesRef<BtCursor>?): Unit

@CCall("knifunptr_sqlite31482_moveToRoot")
external fun moveToRoot(pCur: CValuesRef<BtCursor>?): Int

@CCall("knifunptr_sqlite31483_moveToLeftmost")
external fun moveToLeftmost(pCur: CValuesRef<BtCursor>?): Int

@CCall("knifunptr_sqlite31484_moveToRightmost")
external fun moveToRightmost(pCur: CValuesRef<BtCursor>?): Int

@CCall("knifunptr_sqlite31485_btreeNext")
external fun btreeNext(pCur: CValuesRef<BtCursor>?): Int

@CCall("knifunptr_sqlite31486_btreePrevious")
external fun btreePrevious(pCur: CValuesRef<BtCursor>?): Int

@CCall("knifunptr_sqlite31487_freePage2")
external fun freePage2(pBt: CValuesRef<BtShared>?, pMemPage: CValuesRef<MemPage>?, iPage: Pgno): Int

@CCall("knifunptr_sqlite31488_freePage")
external fun freePage(pPage: CValuesRef<MemPage>?, pRC: CValuesRef<IntVar>?): Unit

@CCall("knifunptr_sqlite31489_clearCell")
external fun clearCell(pPage: CValuesRef<MemPage>?, pCell: CValuesRef<UByteVar>?, pInfo: CValuesRef<CellInfo>?): Int

@CCall("knifunptr_sqlite31490_fillInCell")
external fun fillInCell(pPage: CValuesRef<MemPage>?, pCell: CValuesRef<UByteVar>?, pX: CValuesRef<BtreePayload>?, pnSize: CValuesRef<IntVar>?): Int

@CCall("knifunptr_sqlite31491_dropCell")
external fun dropCell(pPage: CValuesRef<MemPage>?, idx: Int, sz: Int, pRC: CValuesRef<IntVar>?): Unit

@CCall("knifunptr_sqlite31492_insertCell")
external fun insertCell(pPage: CValuesRef<MemPage>?, i: Int, pCell: CValuesRef<u8Var>?, sz: Int, pTemp: CValuesRef<u8Var>?, iChild: Pgno, pRC: CValuesRef<IntVar>?): Unit

@CCall("knifunptr_sqlite31493_populateCellCache")
external fun populateCellCache(p: CValuesRef<CellArray>?, idx: Int, N: Int): Unit

@CCall("knifunptr_sqlite31494_computeCellSize")
external fun computeCellSize(p: CValuesRef<CellArray>?, N: Int): u16

@CCall("knifunptr_sqlite31495_cachedCellSize")
external fun cachedCellSize(p: CValuesRef<CellArray>?, N: Int): u16

@CCall("knifunptr_sqlite31496_rebuildPage")
external fun rebuildPage(pCArray: CValuesRef<CellArray>?, iFirst: Int, nCell: Int, pPg: CValuesRef<MemPage>?): Int

@CCall("knifunptr_sqlite31497_pageInsertArray")
external fun pageInsertArray(pPg: CValuesRef<MemPage>?, pBegin: CValuesRef<u8Var>?, ppData: CValuesRef<CPointerVar<u8Var>>?, pCellptr: CValuesRef<u8Var>?, iFirst: Int, nCell: Int, pCArray: CValuesRef<CellArray>?): Int

@CCall("knifunptr_sqlite31498_pageFreeArray")
external fun pageFreeArray(pPg: CValuesRef<MemPage>?, iFirst: Int, nCell: Int, pCArray: CValuesRef<CellArray>?): Int

@CCall("knifunptr_sqlite31499_editPage")
external fun editPage(pPg: CValuesRef<MemPage>?, iOld: Int, iNew: Int, nNew: Int, pCArray: CValuesRef<CellArray>?): Int

@CCall("knifunptr_sqlite31500_balance_quick")
external fun balance_quick(pParent: CValuesRef<MemPage>?, pPage: CValuesRef<MemPage>?, pSpace: CValuesRef<u8Var>?): Int

@CCall("knifunptr_sqlite31501_copyNodeContent")
external fun copyNodeContent(pFrom: CValuesRef<MemPage>?, pTo: CValuesRef<MemPage>?, pRC: CValuesRef<IntVar>?): Unit

@CCall("knifunptr_sqlite31502_balance_nonroot")
external fun balance_nonroot(pParent: CValuesRef<MemPage>?, iParentIdx: Int, aOvflSpace: CValuesRef<u8Var>?, isRoot: Int, bBulk: Int): Int

@CCall("knifunptr_sqlite31503_balance_deeper")
external fun balance_deeper(pRoot: CValuesRef<MemPage>?, ppChild: CValuesRef<CPointerVar<MemPage>>?): Int

@CCall("knifunptr_sqlite31504_balance")
external fun balance(pCur: CValuesRef<BtCursor>?): Int

@CCall("knifunptr_sqlite31505_btreeOverwriteContent")
external fun btreeOverwriteContent(pPage: CValuesRef<MemPage>?, pDest: CValuesRef<u8Var>?, pX: CValuesRef<BtreePayload>?, iOffset: Int, iAmt: Int): Int

@CCall("knifunptr_sqlite31506_btreeOverwriteCell")
external fun btreeOverwriteCell(pCur: CValuesRef<BtCursor>?, pX: CValuesRef<BtreePayload>?): Int

@CCall("knifunptr_sqlite31507_btreeCreateTable")
external fun btreeCreateTable(p: CValuesRef<Btree>?, piTable: CValuesRef<IntVar>?, createTabFlags: Int): Int

@CCall("knifunptr_sqlite31508_clearDatabasePage")
external fun clearDatabasePage(pBt: CValuesRef<BtShared>?, pgno: Pgno, freePageFlag: Int, pnChange: CValuesRef<IntVar>?): Int

@CCall("knifunptr_sqlite31509_btreeDropTable")
external fun btreeDropTable(p: CValuesRef<Btree>?, iTable: Pgno, piMoved: CValuesRef<IntVar>?): Int

@CCall("knifunptr_sqlite31510_checkAppendMsg")
external fun checkAppendMsg(pCheck: CValuesRef<IntegrityCk>?, @CCall.CString zFormat: String?, vararg variadicArguments: Any?): Unit

@CCall("knifunptr_sqlite31511_getPageReferenced")
external fun getPageReferenced(pCheck: CValuesRef<IntegrityCk>?, iPg: Pgno): Int

@CCall("knifunptr_sqlite31512_setPageReferenced")
external fun setPageReferenced(pCheck: CValuesRef<IntegrityCk>?, iPg: Pgno): Unit

@CCall("knifunptr_sqlite31513_checkRef")
external fun checkRef(pCheck: CValuesRef<IntegrityCk>?, iPage: Pgno): Int

@CCall("knifunptr_sqlite31514_checkPtrmap")
external fun checkPtrmap(pCheck: CValuesRef<IntegrityCk>?, iChild: Pgno, eType: u8, iParent: Pgno): Unit

@CCall("knifunptr_sqlite31515_checkList")
external fun checkList(pCheck: CValuesRef<IntegrityCk>?, isFreeList: Int, iPage: Int, N: Int): Unit

@CCall("knifunptr_sqlite31516_btreeHeapInsert")
external fun btreeHeapInsert(aHeap: CValuesRef<u32Var>?, x: u32): Unit

@CCall("knifunptr_sqlite31517_btreeHeapPull")
external fun btreeHeapPull(aHeap: CValuesRef<u32Var>?, pOut: CValuesRef<u32Var>?): Int

@CCall("knifunptr_sqlite31518_checkTreePage")
external fun checkTreePage(pCheck: CValuesRef<IntegrityCk>?, iPage: Int, piMinKey: CValuesRef<i64Var>?, maxKey: i64): Int

@CCall("knifunptr_sqlite31519_findBtree")
external fun findBtree(pErrorDb: CValuesRef<sqlite3>?, pDb: CValuesRef<sqlite3>?, @CCall.CString zDb: String?): CPointer<Btree>?

@CCall("knifunptr_sqlite31520_setDestPgsz")
external fun setDestPgsz(p: CValuesRef<sqlite3_backup>?): Int

@CCall("knifunptr_sqlite31521_checkReadTransaction")
external fun checkReadTransaction(db: CValuesRef<sqlite3>?, p: CValuesRef<Btree>?): Int

@CCall("knifunptr_sqlite31522_isFatalError")
external fun isFatalError(rc: Int): Int

@CCall("knifunptr_sqlite31523_backupOnePage")
external fun backupOnePage(p: CValuesRef<sqlite3_backup>?, iSrcPg: Pgno, zSrcData: CValuesRef<u8Var>?, bUpdate: Int): Int

@CCall("knifunptr_sqlite31524_backupTruncateFile")
external fun backupTruncateFile(pFile: CValuesRef<sqlite3_file>?, iSize: i64): Int

@CCall("knifunptr_sqlite31525_attachBackupObject")
external fun attachBackupObject(p: CValuesRef<sqlite3_backup>?): Unit

@CCall("knifunptr_sqlite31526_backupUpdate")
external fun backupUpdate(p: CValuesRef<sqlite3_backup>?, iPage: Pgno, aData: CValuesRef<u8Var>?): Unit

@CCall("knifunptr_sqlite31527_vdbeMemAddTerminator")
external fun vdbeMemAddTerminator(pMem: CValuesRef<Mem>?): Int

@CCall("knifunptr_sqlite31528_vdbeMemClearExternAndSetNull")
external fun vdbeMemClearExternAndSetNull(p: CValuesRef<Mem>?): Unit

@CCall("knifunptr_sqlite31529_vdbeMemClear")
external fun vdbeMemClear(p: CValuesRef<Mem>?): Unit

@CCall("knifunptr_sqlite31530_doubleToInt64")
external fun doubleToInt64(r: Double): i64

@CCall("knifunptr_sqlite31531_memIntValue")
external fun memIntValue(pMem: CValuesRef<Mem>?): i64

@CCall("knifunptr_sqlite31532_memRealValue")
external fun memRealValue(pMem: CValuesRef<Mem>?): Double

@CCall("knifunptr_sqlite31533_sqlite3RealSameAsInt")
external fun sqlite3RealSameAsInt(r1: Double, i: sqlite3_int64): Int

@CCall("knifunptr_sqlite31534_vdbeReleaseAndSetInt64")
external fun vdbeReleaseAndSetInt64(pMem: CValuesRef<Mem>?, `val`: i64): Unit

@CCall("knifunptr_sqlite31535_vdbeClrCopy")
external fun vdbeClrCopy(pTo: CValuesRef<Mem>?, pFrom: CValuesRef<Mem>?, eType: Int): Unit

@CCall("knifunptr_sqlite31536_vdbeMemFromBtreeResize")
external fun vdbeMemFromBtreeResize(pCur: CValuesRef<BtCursor>?, offset: u32, amt: u32, pMem: CValuesRef<Mem>?): Int

@CCall("knifunptr_sqlite31537_valueToText")
external fun valueToText(pVal: CValuesRef<sqlite3_value>?, enc: u8): COpaquePointer?

@CCall("knifunptr_sqlite31538_valueNew")
external fun valueNew(db: CValuesRef<sqlite3>?, p: CValuesRef<ValueNewStat4Ctx>?): CPointer<sqlite3_value>?

@CCall("knifunptr_sqlite31539_valueFromExpr")
external fun valueFromExpr(db: CValuesRef<sqlite3>?, pExpr: CValuesRef<Expr>?, enc: u8, affinity: u8, ppVal: CValuesRef<CPointerVar<sqlite3_value>>?, pCtx: CValuesRef<ValueNewStat4Ctx>?): Int

@CCall("knifunptr_sqlite31540_valueBytes")
external fun valueBytes(pVal: CValuesRef<sqlite3_value>?, enc: u8): Int

@CCall("knifunptr_sqlite31541_growOpArray")
external fun growOpArray(v: CValuesRef<Vdbe>?, nOp: Int): Int

@CCall("knifunptr_sqlite31542_growOp3")
external fun growOp3(p: CValuesRef<Vdbe>?, op: Int, p1: Int, p2: Int, p3: Int): Int

@CCall("knifunptr_sqlite31543_resizeResolveLabel")
external fun resizeResolveLabel(p: CValuesRef<Parse>?, v: CValuesRef<Vdbe>?, j: Int): Unit

@CCall("knifunptr_sqlite31544_resolveP2Values")
external fun resolveP2Values(p: CValuesRef<Vdbe>?, pMaxFuncArgs: CValuesRef<IntVar>?): Unit

@CCall("knifunptr_sqlite31545_freeEphemeralFunction")
external fun freeEphemeralFunction(db: CValuesRef<sqlite3>?, pDef: CValuesRef<FuncDef>?): Unit

@CCall("knifunptr_sqlite31546_vdbeFreeOpArray")
external fun vdbeFreeOpArray(arg0: CValuesRef<sqlite3>?, arg1: CValuesRef<Op>?, arg2: Int): Unit

@CCall("knifunptr_sqlite31547_freeP4Mem")
external fun freeP4Mem(db: CValuesRef<sqlite3>?, p: CValuesRef<Mem>?): Unit

@CCall("knifunptr_sqlite31548_freeP4FuncCtx")
external fun freeP4FuncCtx(db: CValuesRef<sqlite3>?, p: CValuesRef<sqlite3_context>?): Unit

@CCall("knifunptr_sqlite31549_freeP4")
external fun freeP4(db: CValuesRef<sqlite3>?, p4type: Int, p4: CValuesRef<*>?): Unit

@CCall("knifunptr_sqlite31550_vdbeChangeP4Full")
external fun vdbeChangeP4Full(p: CValuesRef<Vdbe>?, pOp: CValuesRef<Op>?, @CCall.CString zP4: String?, n: Int): Unit

@CCall("knifunptr_sqlite31551_displayP4")
external fun displayP4(pOp: CValuesRef<Op>?, zTemp: CValuesRef<ByteVar>?, nTemp: Int): CPointer<ByteVar>?

@CCall("knifunptr_sqlite31552_vdbeLeave")
external fun vdbeLeave(p: CValuesRef<Vdbe>?): Unit

@CCall("knifunptr_sqlite31553_initMemArray")
external fun initMemArray(p: CValuesRef<Mem>?, N: Int, db: CValuesRef<sqlite3>?, flags: u16): Unit

@CCall("knifunptr_sqlite31554_releaseMemArray")
external fun releaseMemArray(p: CValuesRef<Mem>?, N: Int): Unit

@CCall("knifunptr_sqlite31555_allocSpace")
external fun allocSpace(p: CValuesRef<ReusableSpace>?, pBuf: CValuesRef<*>?, nByte: Int): COpaquePointer?

@CCall("knifunptr_sqlite31556_closeCursorsInFrame")
external fun closeCursorsInFrame(p: CValuesRef<Vdbe>?): Unit

@CCall("knifunptr_sqlite31557_closeAllCursors")
external fun closeAllCursors(p: CValuesRef<Vdbe>?): Unit

@CCall("knifunptr_sqlite31558_vdbeCommit")
external fun vdbeCommit(db: CValuesRef<sqlite3>?, p: CValuesRef<Vdbe>?): Int

@CCall("knifunptr_sqlite31559_vdbeCloseStatement")
external fun vdbeCloseStatement(p: CValuesRef<Vdbe>?, eOp: Int): Int

@CCall("knifunptr_sqlite31560_handleDeferredMoveto")
external fun handleDeferredMoveto(p: CValuesRef<VdbeCursor>?): Int

@CCall("knifunptr_sqlite31561_handleMovedCursor")
external fun handleMovedCursor(p: CValuesRef<VdbeCursor>?): Int

@CCall("knifunptr_sqlite31562_serialGet")
external fun serialGet(buf: CValuesRef<UByteVar>?, serial_type: u32, pMem: CValuesRef<Mem>?): u32

@CCall("knifunptr_sqlite31563_vdbeCompareMemString")
external fun vdbeCompareMemString(pMem1: CValuesRef<Mem>?, pMem2: CValuesRef<Mem>?, pColl: CValuesRef<CollSeq>?, prcErr: CValuesRef<u8Var>?): Int

@CCall("knifunptr_sqlite31564_isAllZero")
external fun isAllZero(@CCall.CString z: String?, n: Int): Int

@CCall("knifunptr_sqlite31565_sqlite3IntFloatCompare")
external fun sqlite3IntFloatCompare(i: i64, r: Double): Int

@CCall("knifunptr_sqlite31566_vdbeRecordDecodeInt")
external fun vdbeRecordDecodeInt(serial_type: u32, aKey: CValuesRef<u8Var>?): i64

@CCall("knifunptr_sqlite31567_vdbeRecordCompareInt")
external fun vdbeRecordCompareInt(nKey1: Int, pKey1: CValuesRef<*>?, pPKey2: CValuesRef<UnpackedRecord>?): Int

@CCall("knifunptr_sqlite31568_vdbeRecordCompareString")
external fun vdbeRecordCompareString(nKey1: Int, pKey1: CValuesRef<*>?, pPKey2: CValuesRef<UnpackedRecord>?): Int

@CCall("knifunptr_sqlite31569_vdbeSafety")
external fun vdbeSafety(p: CValuesRef<Vdbe>?): Int

@CCall("knifunptr_sqlite31570_vdbeSafetyNotNull")
external fun vdbeSafetyNotNull(p: CValuesRef<Vdbe>?): Int

@CCall("knifunptr_sqlite31571_invokeProfileCallback")
external fun invokeProfileCallback(db: CValuesRef<sqlite3>?, p: CValuesRef<Vdbe>?): Unit

@CCall("knifunptr_sqlite31572_setResultStrOrError")
external fun setResultStrOrError(pCtx: CValuesRef<sqlite3_context>?, @CCall.CString z: String?, n: Int, enc: u8, xDel: CPointer<CFunction<(COpaquePointer?) -> Unit>>?): Unit

@CCall("knifunptr_sqlite31573_invokeValueDestructor")
external fun invokeValueDestructor(p: CValuesRef<*>?, xDel: CPointer<CFunction<(COpaquePointer?) -> Unit>>?, pCtx: CValuesRef<sqlite3_context>?): Int

@CCall("knifunptr_sqlite31574_doWalCallbacks")
external fun doWalCallbacks(db: CValuesRef<sqlite3>?): Int

@CCall("knifunptr_sqlite31575_sqlite3Step")
external fun sqlite3Step(p: CValuesRef<Vdbe>?): Int

@CCall("knifunptr_sqlite31576_createAggContext")
external fun createAggContext(p: CValuesRef<sqlite3_context>?, nByte: Int): COpaquePointer?

@CCall("knifunptr_sqlite31577_columnNullValue")
external fun columnNullValue(): CPointer<Mem>?

@CCall("knifunptr_sqlite31578_columnMem")
external fun columnMem(pStmt: CValuesRef<sqlite3_stmt>?, i: Int): CPointer<Mem>?

@CCall("knifunptr_sqlite31579_columnMallocFailure")
external fun columnMallocFailure(pStmt: CValuesRef<sqlite3_stmt>?): Unit

@CCall("knifunptr_sqlite31580_columnName")
external fun columnName(pStmt: CValuesRef<sqlite3_stmt>?, N: Int, xFunc: CPointer<CFunction<(CPointer<Mem>?) -> COpaquePointer?>>?, useType: Int): COpaquePointer?

@CCall("knifunptr_sqlite31581_vdbeUnbind")
external fun vdbeUnbind(p: CValuesRef<Vdbe>?, i: Int): Int

@CCall("knifunptr_sqlite31582_bindText")
external fun bindText(pStmt: CValuesRef<sqlite3_stmt>?, i: Int, zData: CValuesRef<*>?, nData: Int, xDel: CPointer<CFunction<(COpaquePointer?) -> Unit>>?, encoding: u8): Int

@CCall("knifunptr_sqlite31583_findNextHostParameter")
external fun findNextHostParameter(@CCall.CString zSql: String?, pnToken: CValuesRef<IntVar>?): Int

@CCall("knifunptr_sqlite31584_allocateCursor")
external fun allocateCursor(p: CValuesRef<Vdbe>?, iCur: Int, nField: Int, iDb: Int, eCurType: u8): CPointer<VdbeCursor>?

@CCall("knifunptr_sqlite31585_applyNumericAffinity")
external fun applyNumericAffinity(pRec: CValuesRef<Mem>?, bTryForInt: Int): Unit

@CCall("knifunptr_sqlite31586_applyAffinity")
external fun applyAffinity(pRec: CValuesRef<Mem>?, affinity: Byte, enc: u8): Unit

@CCall("knifunptr_sqlite31587_computeNumericType")
external fun computeNumericType(pMem: CValuesRef<Mem>?): u16

@CCall("knifunptr_sqlite31588_numericType")
external fun numericType(pMem: CValuesRef<Mem>?): u16

@CCall("knifunptr_sqlite31589_out2PrereleaseWithClear")
external fun out2PrereleaseWithClear(pOut: CValuesRef<Mem>?): CPointer<Mem>?

@CCall("knifunptr_sqlite31590_out2Prerelease")
external fun out2Prerelease(p: CValuesRef<Vdbe>?, pOp: CValuesRef<VdbeOp>?): CPointer<Mem>?

@CCall("knifunptr_sqlite31591_blobSeekToRow")
external fun blobSeekToRow(p: CValuesRef<Incrblob>?, iRow: sqlite3_int64, pzErr: CValuesRef<CPointerVar<ByteVar>>?): Int

@CCall("knifunptr_sqlite31592_blobReadWrite")
external fun blobReadWrite(pBlob: CValuesRef<sqlite3_blob>?, z: CValuesRef<*>?, n: Int, iOffset: Int, xCall: CPointer<CFunction<(CPointer<BtCursor>?, u32, u32, COpaquePointer?) -> Int>>?): Int

@CCall("knifunptr_sqlite31593_vdbeIncrSwap")
external fun vdbeIncrSwap(arg0: CValuesRef<IncrMerger>?): Int

@CCall("knifunptr_sqlite31594_vdbeIncrFree")
external fun vdbeIncrFree(arg0: CValuesRef<IncrMerger>?): Unit

@CCall("knifunptr_sqlite31595_vdbePmaReaderClear")
external fun vdbePmaReaderClear(pReadr: CValuesRef<PmaReader>?): Unit

@CCall("knifunptr_sqlite31596_vdbePmaReadBlob")
external fun vdbePmaReadBlob(p: CValuesRef<PmaReader>?, nByte: Int, ppOut: CValuesRef<CPointerVar<u8Var>>?): Int

@CCall("knifunptr_sqlite31597_vdbePmaReadVarint")
external fun vdbePmaReadVarint(p: CValuesRef<PmaReader>?, pnOut: CValuesRef<u64Var>?): Int

@CCall("knifunptr_sqlite31598_vdbeSorterMapFile")
external fun vdbeSorterMapFile(pTask: CValuesRef<SortSubtask>?, pFile: CValuesRef<SorterFile>?, pp: CValuesRef<CPointerVar<u8Var>>?): Int

@CCall("knifunptr_sqlite31599_vdbePmaReaderSeek")
external fun vdbePmaReaderSeek(pTask: CValuesRef<SortSubtask>?, pReadr: CValuesRef<PmaReader>?, pFile: CValuesRef<SorterFile>?, iOff: i64): Int

@CCall("knifunptr_sqlite31600_vdbePmaReaderNext")
external fun vdbePmaReaderNext(pReadr: CValuesRef<PmaReader>?): Int

@CCall("knifunptr_sqlite31601_vdbePmaReaderInit")
external fun vdbePmaReaderInit(pTask: CValuesRef<SortSubtask>?, pFile: CValuesRef<SorterFile>?, iStart: i64, pReadr: CValuesRef<PmaReader>?, pnByte: CValuesRef<i64Var>?): Int

@CCall("knifunptr_sqlite31602_vdbeSorterCompareTail")
external fun vdbeSorterCompareTail(pTask: CValuesRef<SortSubtask>?, pbKey2Cached: CValuesRef<IntVar>?, pKey1: CValuesRef<*>?, nKey1: Int, pKey2: CValuesRef<*>?, nKey2: Int): Int

@CCall("knifunptr_sqlite31603_vdbeSorterCompare")
external fun vdbeSorterCompare(pTask: CValuesRef<SortSubtask>?, pbKey2Cached: CValuesRef<IntVar>?, pKey1: CValuesRef<*>?, nKey1: Int, pKey2: CValuesRef<*>?, nKey2: Int): Int

@CCall("knifunptr_sqlite31604_vdbeSorterCompareText")
external fun vdbeSorterCompareText(pTask: CValuesRef<SortSubtask>?, pbKey2Cached: CValuesRef<IntVar>?, pKey1: CValuesRef<*>?, nKey1: Int, pKey2: CValuesRef<*>?, nKey2: Int): Int

@CCall("knifunptr_sqlite31605_vdbeSorterCompareInt")
external fun vdbeSorterCompareInt(pTask: CValuesRef<SortSubtask>?, pbKey2Cached: CValuesRef<IntVar>?, pKey1: CValuesRef<*>?, nKey1: Int, pKey2: CValuesRef<*>?, nKey2: Int): Int

@CCall("knifunptr_sqlite31606_vdbeSorterRecordFree")
external fun vdbeSorterRecordFree(db: CValuesRef<sqlite3>?, pRecord: CValuesRef<SorterRecord>?): Unit

@CCall("knifunptr_sqlite31607_vdbeSortSubtaskCleanup")
external fun vdbeSortSubtaskCleanup(db: CValuesRef<sqlite3>?, pTask: CValuesRef<SortSubtask>?): Unit

@CCall("knifunptr_sqlite31608_vdbeSorterJoinThread")
external fun vdbeSorterJoinThread(pTask: CValuesRef<SortSubtask>?): Int

@CCall("knifunptr_sqlite31609_vdbeSorterCreateThread")
external fun vdbeSorterCreateThread(pTask: CValuesRef<SortSubtask>?, xTask: CPointer<CFunction<(COpaquePointer?) -> COpaquePointer?>>?, pIn: CValuesRef<*>?): Int

@CCall("knifunptr_sqlite31610_vdbeSorterJoinAll")
external fun vdbeSorterJoinAll(pSorter: CValuesRef<VdbeSorter>?, rcin: Int): Int

@CCall("knifunptr_sqlite31611_vdbeMergeEngineNew")
external fun vdbeMergeEngineNew(nReader: Int): CPointer<MergeEngine>?

@CCall("knifunptr_sqlite31612_vdbeMergeEngineFree")
external fun vdbeMergeEngineFree(pMerger: CValuesRef<MergeEngine>?): Unit

@CCall("knifunptr_sqlite31613_vdbeSorterExtendFile")
external fun vdbeSorterExtendFile(db: CValuesRef<sqlite3>?, pFd: CValuesRef<sqlite3_file>?, nByte: i64): Unit

@CCall("knifunptr_sqlite31614_vdbeSorterOpenTempFile")
external fun vdbeSorterOpenTempFile(db: CValuesRef<sqlite3>?, nExtend: i64, ppFd: CValuesRef<CPointerVar<sqlite3_file>>?): Int

@CCall("knifunptr_sqlite31615_vdbeSortAllocUnpacked")
external fun vdbeSortAllocUnpacked(pTask: CValuesRef<SortSubtask>?): Int

@CCall("knifunptr_sqlite31616_vdbeSorterMerge")
external fun vdbeSorterMerge(pTask: CValuesRef<SortSubtask>?, p1: CValuesRef<SorterRecord>?, p2: CValuesRef<SorterRecord>?): CPointer<SorterRecord>?

@CCall("knifunptr_sqlite31617_vdbeSorterGetCompare")
external fun vdbeSorterGetCompare(p: CValuesRef<VdbeSorter>?): SorterCompare?

@CCall("knifunptr_sqlite31618_vdbeSorterSort")
external fun vdbeSorterSort(pTask: CValuesRef<SortSubtask>?, pList: CValuesRef<SorterList>?): Int

@CCall("knifunptr_sqlite31619_vdbePmaWriterInit")
external fun vdbePmaWriterInit(pFd: CValuesRef<sqlite3_file>?, p: CValuesRef<PmaWriter>?, nBuf: Int, iStart: i64): Unit

@CCall("knifunptr_sqlite31620_vdbePmaWriteBlob")
external fun vdbePmaWriteBlob(p: CValuesRef<PmaWriter>?, pData: CValuesRef<u8Var>?, nData: Int): Unit

@CCall("knifunptr_sqlite31621_vdbePmaWriterFinish")
external fun vdbePmaWriterFinish(p: CValuesRef<PmaWriter>?, piEof: CValuesRef<i64Var>?): Int

@CCall("knifunptr_sqlite31622_vdbePmaWriteVarint")
external fun vdbePmaWriteVarint(p: CValuesRef<PmaWriter>?, iVal: u64): Unit

@CCall("knifunptr_sqlite31623_vdbeSorterListToPMA")
external fun vdbeSorterListToPMA(pTask: CValuesRef<SortSubtask>?, pList: CValuesRef<SorterList>?): Int

@CCall("knifunptr_sqlite31624_vdbeMergeEngineStep")
external fun vdbeMergeEngineStep(pMerger: CValuesRef<MergeEngine>?, pbEof: CValuesRef<IntVar>?): Int

@CCall("knifunptr_sqlite31625_vdbeSorterFlushThread")
external fun vdbeSorterFlushThread(pCtx: CValuesRef<*>?): COpaquePointer?

@CCall("knifunptr_sqlite31626_vdbeSorterFlushPMA")
external fun vdbeSorterFlushPMA(pSorter: CValuesRef<VdbeSorter>?): Int

@CCall("knifunptr_sqlite31627_vdbeIncrPopulate")
external fun vdbeIncrPopulate(pIncr: CValuesRef<IncrMerger>?): Int

@CCall("knifunptr_sqlite31628_vdbeIncrPopulateThread")
external fun vdbeIncrPopulateThread(pCtx: CValuesRef<*>?): COpaquePointer?

@CCall("knifunptr_sqlite31629_vdbeIncrBgPopulate")
external fun vdbeIncrBgPopulate(pIncr: CValuesRef<IncrMerger>?): Int

@CCall("knifunptr_sqlite31630_vdbeIncrMergerNew")
external fun vdbeIncrMergerNew(pTask: CValuesRef<SortSubtask>?, pMerger: CValuesRef<MergeEngine>?, ppOut: CValuesRef<CPointerVar<IncrMerger>>?): Int

@CCall("knifunptr_sqlite31631_vdbeIncrMergerSetThreads")
external fun vdbeIncrMergerSetThreads(pIncr: CValuesRef<IncrMerger>?): Unit

@CCall("knifunptr_sqlite31632_vdbeMergeEngineCompare")
external fun vdbeMergeEngineCompare(pMerger: CValuesRef<MergeEngine>?, iOut: Int): Unit

@CCall("knifunptr_sqlite31633_vdbePmaReaderIncrInit")
external fun vdbePmaReaderIncrInit(pReadr: CValuesRef<PmaReader>?, eMode: Int): Int

@CCall("knifunptr_sqlite31634_vdbeMergeEngineInit")
external fun vdbeMergeEngineInit(pTask: CValuesRef<SortSubtask>?, pMerger: CValuesRef<MergeEngine>?, eMode: Int): Int

@CCall("knifunptr_sqlite31635_vdbePmaReaderIncrMergeInit")
external fun vdbePmaReaderIncrMergeInit(pReadr: CValuesRef<PmaReader>?, eMode: Int): Int

@CCall("knifunptr_sqlite31636_vdbePmaReaderBgIncrInit")
external fun vdbePmaReaderBgIncrInit(pCtx: CValuesRef<*>?): COpaquePointer?

@CCall("knifunptr_sqlite31637_vdbeMergeEngineLevel0")
external fun vdbeMergeEngineLevel0(pTask: CValuesRef<SortSubtask>?, nPMA: Int, piOffset: CValuesRef<i64Var>?, ppOut: CValuesRef<CPointerVar<MergeEngine>>?): Int

@CCall("knifunptr_sqlite31638_vdbeSorterTreeDepth")
external fun vdbeSorterTreeDepth(nPMA: Int): Int

@CCall("knifunptr_sqlite31639_vdbeSorterAddToTree")
external fun vdbeSorterAddToTree(pTask: CValuesRef<SortSubtask>?, nDepth: Int, iSeq: Int, pRoot: CValuesRef<MergeEngine>?, pLeaf: CValuesRef<MergeEngine>?): Int

@CCall("knifunptr_sqlite31640_vdbeSorterMergeTreeBuild")
external fun vdbeSorterMergeTreeBuild(pSorter: CValuesRef<VdbeSorter>?, ppOut: CValuesRef<CPointerVar<MergeEngine>>?): Int

@CCall("knifunptr_sqlite31641_vdbeSorterSetupMerge")
external fun vdbeSorterSetupMerge(pSorter: CValuesRef<VdbeSorter>?): Int

@CCall("knifunptr_sqlite31642_vdbeSorterRowkey")
external fun vdbeSorterRowkey(pSorter: CValuesRef<VdbeSorter>?, pnKey: CValuesRef<IntVar>?): COpaquePointer?

@CCall("knifunptr_sqlite31643_memjrnlRead")
external fun memjrnlRead(pJfd: CValuesRef<sqlite3_file>?, zBuf: CValuesRef<*>?, iAmt: Int, iOfst: sqlite_int64): Int

@CCall("knifunptr_sqlite31644_memjrnlFreeChunks")
external fun memjrnlFreeChunks(p: CValuesRef<MemJournal>?): Unit

@CCall("knifunptr_sqlite31645_memjrnlCreateFile")
external fun memjrnlCreateFile(p: CValuesRef<MemJournal>?): Int

@CCall("knifunptr_sqlite31646_memjrnlWrite")
external fun memjrnlWrite(pJfd: CValuesRef<sqlite3_file>?, zBuf: CValuesRef<*>?, iAmt: Int, iOfst: sqlite_int64): Int

@CCall("knifunptr_sqlite31647_memjrnlTruncate")
external fun memjrnlTruncate(pJfd: CValuesRef<sqlite3_file>?, size: sqlite_int64): Int

@CCall("knifunptr_sqlite31648_memjrnlClose")
external fun memjrnlClose(pJfd: CValuesRef<sqlite3_file>?): Int

@CCall("knifunptr_sqlite31649_memjrnlSync")
external fun memjrnlSync(pJfd: CValuesRef<sqlite3_file>?, flags: Int): Int

@CCall("knifunptr_sqlite31650_memjrnlFileSize")
external fun memjrnlFileSize(pJfd: CValuesRef<sqlite3_file>?, pSize: CValuesRef<sqlite_int64Var>?): Int

@CCall("knifunptr_sqlite31651_walkWindowList")
external fun walkWindowList(pWalker: CValuesRef<Walker>?, pList: CValuesRef<Window>?): Int

@CCall("knifunptr_sqlite31652_walkExpr")
external fun walkExpr(pWalker: CValuesRef<Walker>?, pExpr: CValuesRef<Expr>?): Int

@CCall("knifunptr_sqlite31653_incrAggDepth")
external fun incrAggDepth(pWalker: CValuesRef<Walker>?, pExpr: CValuesRef<Expr>?): Int

@CCall("knifunptr_sqlite31654_incrAggFunctionDepth")
external fun incrAggFunctionDepth(pExpr: CValuesRef<Expr>?, N: Int): Unit

@CCall("knifunptr_sqlite31655_resolveAlias")
external fun resolveAlias(pParse: CValuesRef<Parse>?, pEList: CValuesRef<ExprList>?, iCol: Int, pExpr: CValuesRef<Expr>?, @CCall.CString zType: String?, nSubquery: Int): Unit

@CCall("knifunptr_sqlite31656_nameInUsingClause")
external fun nameInUsingClause(pUsing: CValuesRef<IdList>?, @CCall.CString zCol: String?): Int

@CCall("knifunptr_sqlite31657_lookupName")
external fun lookupName(pParse: CValuesRef<Parse>?, @CCall.CString zDb: String?, @CCall.CString zTab: String?, @CCall.CString zCol: String?, pNC: CValuesRef<NameContext>?, pExpr: CValuesRef<Expr>?): Int

@CCall("knifunptr_sqlite31658_notValid")
external fun notValid(pParse: CValuesRef<Parse>?, pNC: CValuesRef<NameContext>?, @CCall.CString zMsg: String?, validMask: Int): Unit

@CCall("knifunptr_sqlite31659_exprProbability")
external fun exprProbability(p: CValuesRef<Expr>?): Int

@CCall("knifunptr_sqlite31660_resolveExprStep")
external fun resolveExprStep(pWalker: CValuesRef<Walker>?, pExpr: CValuesRef<Expr>?): Int

@CCall("knifunptr_sqlite31661_resolveAsName")
external fun resolveAsName(pParse: CValuesRef<Parse>?, pEList: CValuesRef<ExprList>?, pE: CValuesRef<Expr>?): Int

@CCall("knifunptr_sqlite31662_resolveOrderByTermToExprList")
external fun resolveOrderByTermToExprList(pParse: CValuesRef<Parse>?, pSelect: CValuesRef<Select>?, pE: CValuesRef<Expr>?): Int

@CCall("knifunptr_sqlite31663_resolveOutOfRangeError")
external fun resolveOutOfRangeError(pParse: CValuesRef<Parse>?, @CCall.CString zType: String?, i: Int, mx: Int): Unit

@CCall("knifunptr_sqlite31664_resolveCompoundOrderBy")
external fun resolveCompoundOrderBy(pParse: CValuesRef<Parse>?, pSelect: CValuesRef<Select>?): Int

@CCall("knifunptr_sqlite31665_resolveOrderGroupBy")
external fun resolveOrderGroupBy(pNC: CValuesRef<NameContext>?, pSelect: CValuesRef<Select>?, pOrderBy: CValuesRef<ExprList>?, @CCall.CString zType: String?): Int

@CCall("knifunptr_sqlite31666_resolveSelectStep")
external fun resolveSelectStep(pWalker: CValuesRef<Walker>?, p: CValuesRef<Select>?): Int

@CCall("knifunptr_sqlite31667_exprCodeBetween")
external fun exprCodeBetween(arg0: CValuesRef<Parse>?, arg1: CValuesRef<Expr>?, arg2: Int, arg3: CPointer<CFunction<(CPointer<Parse>?, CPointer<Expr>?, Int, Int) -> Unit>>?, arg4: Int): Unit

@CCall("knifunptr_sqlite31668_exprCodeVector")
external fun exprCodeVector(pParse: CValuesRef<Parse>?, p: CValuesRef<Expr>?, piToFree: CValuesRef<IntVar>?): Int

@CCall("knifunptr_sqlite31669_comparisonAffinity")
external fun comparisonAffinity(pExpr: CValuesRef<Expr>?): Byte

@CCall("knifunptr_sqlite31670_binaryCompareP5")
external fun binaryCompareP5(pExpr1: CValuesRef<Expr>?, pExpr2: CValuesRef<Expr>?, jumpIfNull: Int): u8

@CCall("knifunptr_sqlite31671_codeCompare")
external fun codeCompare(pParse: CValuesRef<Parse>?, pLeft: CValuesRef<Expr>?, pRight: CValuesRef<Expr>?, opcode: Int, in1: Int, in2: Int, dest: Int, jumpIfNull: Int): Int

@CCall("knifunptr_sqlite31672_exprCodeSubselect")
external fun exprCodeSubselect(pParse: CValuesRef<Parse>?, pExpr: CValuesRef<Expr>?): Int

@CCall("knifunptr_sqlite31673_exprVectorRegister")
external fun exprVectorRegister(pParse: CValuesRef<Parse>?, pVector: CValuesRef<Expr>?, iField: Int, regSelect: Int, ppExpr: CValuesRef<CPointerVar<Expr>>?, pRegFree: CValuesRef<IntVar>?): Int

@CCall("knifunptr_sqlite31674_codeVectorCompare")
external fun codeVectorCompare(pParse: CValuesRef<Parse>?, pExpr: CValuesRef<Expr>?, dest: Int, op: u8, p5: u8): Unit

@CCall("knifunptr_sqlite31675_heightOfExpr")
external fun heightOfExpr(p: CValuesRef<Expr>?, pnHeight: CValuesRef<IntVar>?): Unit

@CCall("knifunptr_sqlite31676_heightOfExprList")
external fun heightOfExprList(p: CValuesRef<ExprList>?, pnHeight: CValuesRef<IntVar>?): Unit

@CCall("knifunptr_sqlite31677_heightOfSelect")
external fun heightOfSelect(pSelect: CValuesRef<Select>?, pnHeight: CValuesRef<IntVar>?): Unit

@CCall("knifunptr_sqlite31678_exprSetHeight")
external fun exprSetHeight(p: CValuesRef<Expr>?): Unit

@CCall("knifunptr_sqlite31679_exprAlwaysTrue")
external fun exprAlwaysTrue(p: CValuesRef<Expr>?): Int

@CCall("knifunptr_sqlite31680_exprAlwaysFalse")
external fun exprAlwaysFalse(p: CValuesRef<Expr>?): Int

@CCall("knifunptr_sqlite31681_sqlite3ExprDeleteNN")
external fun sqlite3ExprDeleteNN(db: CValuesRef<sqlite3>?, p: CValuesRef<Expr>?): Unit

@CCall("knifunptr_sqlite31682_exprStructSize")
external fun exprStructSize(p: CValuesRef<Expr>?): Int

@CCall("knifunptr_sqlite31683_exprNodeCopy")
external fun exprNodeCopy(pDest: CValuesRef<Expr>?, pSrc: CValuesRef<Expr>?): Unit

@CCall("knifunptr_sqlite31684_dupedExprStructSize")
external fun dupedExprStructSize(p: CValuesRef<Expr>?, flags: Int): Int

@CCall("knifunptr_sqlite31685_dupedExprNodeSize")
external fun dupedExprNodeSize(p: CValuesRef<Expr>?, flags: Int): Int

@CCall("knifunptr_sqlite31686_dupedExprSize")
external fun dupedExprSize(p: CValuesRef<Expr>?, flags: Int): Int

@CCall("knifunptr_sqlite31687_exprDup")
external fun exprDup(db: CValuesRef<sqlite3>?, p: CValuesRef<Expr>?, dupFlags: Int, pzBuffer: CValuesRef<CPointerVar<u8Var>>?): CPointer<Expr>?

@CCall("knifunptr_sqlite31688_withDup")
external fun withDup(db: CValuesRef<sqlite3>?, p: CValuesRef<With>?): CPointer<With>?

@CCall("knifunptr_sqlite31689_gatherSelectWindowsCallback")
external fun gatherSelectWindowsCallback(pWalker: CValuesRef<Walker>?, pExpr: CValuesRef<Expr>?): Int

@CCall("knifunptr_sqlite31690_gatherSelectWindowsSelectCallback")
external fun gatherSelectWindowsSelectCallback(pWalker: CValuesRef<Walker>?, p: CValuesRef<Select>?): Int

@CCall("knifunptr_sqlite31691_gatherSelectWindows")
external fun gatherSelectWindows(p: CValuesRef<Select>?): Unit

@CCall("knifunptr_sqlite31692_exprListDeleteNN")
external fun exprListDeleteNN(db: CValuesRef<sqlite3>?, pList: CValuesRef<ExprList>?): Unit

@CCall("knifunptr_sqlite31693_exprNodeIsConstant")
external fun exprNodeIsConstant(pWalker: CValuesRef<Walker>?, pExpr: CValuesRef<Expr>?): Int

@CCall("knifunptr_sqlite31694_exprIsConst")
external fun exprIsConst(p: CValuesRef<Expr>?, initFlag: Int, iCur: Int): Int

@CCall("knifunptr_sqlite31695_exprNodeIsConstantOrGroupBy")
external fun exprNodeIsConstantOrGroupBy(pWalker: CValuesRef<Walker>?, pExpr: CValuesRef<Expr>?): Int

@CCall("knifunptr_sqlite31696_isCandidateForInOpt")
external fun isCandidateForInOpt(pX: CValuesRef<Expr>?): CPointer<Select>?

@CCall("knifunptr_sqlite31697_sqlite3SetHasNullFlag")
external fun sqlite3SetHasNullFlag(v: CValuesRef<Vdbe>?, iCur: Int, regHasNull: Int): Unit

@CCall("knifunptr_sqlite31698_sqlite3InRhsIsConstant")
external fun sqlite3InRhsIsConstant(pIn: CValuesRef<Expr>?): Int

@CCall("knifunptr_sqlite31699_exprINAffinity")
external fun exprINAffinity(pParse: CValuesRef<Parse>?, pExpr: CValuesRef<Expr>?): CPointer<ByteVar>?

@CCall("knifunptr_sqlite31700_sqlite3SubselectError")
external fun sqlite3SubselectError(pParse: CValuesRef<Parse>?, nActual: Int, nExpect: Int): Unit

@CCall("knifunptr_sqlite31701_sqlite3ExprCodeIN")
external fun sqlite3ExprCodeIN(pParse: CValuesRef<Parse>?, pExpr: CValuesRef<Expr>?, destIfFalse: Int, destIfNull: Int): Unit

@CCall("knifunptr_sqlite31702_codeReal")
external fun codeReal(v: CValuesRef<Vdbe>?, @CCall.CString z: String?, negateFlag: Int, iMem: Int): Unit

@CCall("knifunptr_sqlite31703_codeInteger")
external fun codeInteger(pParse: CValuesRef<Parse>?, pExpr: CValuesRef<Expr>?, negFlag: Int, iMem: Int): Unit

@CCall("knifunptr_sqlite31704_exprToRegister")
external fun exprToRegister(p: CValuesRef<Expr>?, iReg: Int): Unit

@CCall("knifunptr_sqlite31705_exprCompareVariable")
external fun exprCompareVariable(pParse: CValuesRef<Parse>?, pVar: CValuesRef<Expr>?, pExpr: CValuesRef<Expr>?): Int

@CCall("knifunptr_sqlite31706_impliesNotNullRow")
external fun impliesNotNullRow(pWalker: CValuesRef<Walker>?, pExpr: CValuesRef<Expr>?): Int

@CCall("knifunptr_sqlite31707_exprIdxCover")
external fun exprIdxCover(pWalker: CValuesRef<Walker>?, pExpr: CValuesRef<Expr>?): Int

@CCall("knifunptr_sqlite31708_exprSrcCount")
external fun exprSrcCount(pWalker: CValuesRef<Walker>?, pExpr: CValuesRef<Expr>?): Int

@CCall("knifunptr_sqlite31709_addAggInfoColumn")
external fun addAggInfoColumn(db: CValuesRef<sqlite3>?, pInfo: CValuesRef<AggInfo>?): Int

@CCall("knifunptr_sqlite31710_addAggInfoFunc")
external fun addAggInfoFunc(db: CValuesRef<sqlite3>?, pInfo: CValuesRef<AggInfo>?): Int

@CCall("knifunptr_sqlite31711_analyzeAggregate")
external fun analyzeAggregate(pWalker: CValuesRef<Walker>?, pExpr: CValuesRef<Expr>?): Int

@CCall("knifunptr_sqlite31712_analyzeAggregatesInSelect")
external fun analyzeAggregatesInSelect(pWalker: CValuesRef<Walker>?, pSelect: CValuesRef<Select>?): Int

@CCall("knifunptr_sqlite31713_analyzeAggregatesInSelectEnd")
external fun analyzeAggregatesInSelectEnd(pWalker: CValuesRef<Walker>?, pSelect: CValuesRef<Select>?): Unit

@CCall("knifunptr_sqlite31714_isAlterableTable")
external fun isAlterableTable(pParse: CValuesRef<Parse>?, pTab: CValuesRef<Table>?): Int

@CCall("knifunptr_sqlite31715_renameTestSchema")
external fun renameTestSchema(pParse: CValuesRef<Parse>?, @CCall.CString zDb: String?, bTemp: Int): Unit

@CCall("knifunptr_sqlite31716_renameReloadSchema")
external fun renameReloadSchema(pParse: CValuesRef<Parse>?, iDb: Int): Unit

@CCall("knifunptr_sqlite31717_isRealTable")
external fun isRealTable(pParse: CValuesRef<Parse>?, pTab: CValuesRef<Table>?): Int

@CCall("knifunptr_sqlite31718_renameUnmapExprCb")
external fun renameUnmapExprCb(pWalker: CValuesRef<Walker>?, pExpr: CValuesRef<Expr>?): Int

@CCall("knifunptr_sqlite31719_renameTokenFree")
external fun renameTokenFree(db: CValuesRef<sqlite3>?, pToken: CValuesRef<RenameToken>?): Unit

@CCall("knifunptr_sqlite31720_renameTokenFind")
external fun renameTokenFind(pParse: CValuesRef<Parse>?, pCtx: CValuesRef<RenameCtx>?, pPtr: CValuesRef<*>?): Unit

@CCall("knifunptr_sqlite31721_renameWalkWith")
external fun renameWalkWith(pWalker: CValuesRef<Walker>?, pSelect: CValuesRef<Select>?): Unit

@CCall("knifunptr_sqlite31722_renameColumnSelectCb")
external fun renameColumnSelectCb(pWalker: CValuesRef<Walker>?, p: CValuesRef<Select>?): Int

@CCall("knifunptr_sqlite31723_renameColumnExprCb")
external fun renameColumnExprCb(pWalker: CValuesRef<Walker>?, pExpr: CValuesRef<Expr>?): Int

@CCall("knifunptr_sqlite31724_renameColumnTokenNext")
external fun renameColumnTokenNext(pCtx: CValuesRef<RenameCtx>?): CPointer<RenameToken>?

@CCall("knifunptr_sqlite31725_renameColumnParseError")
external fun renameColumnParseError(pCtx: CValuesRef<sqlite3_context>?, bPost: Int, pType: CValuesRef<sqlite3_value>?, pObject: CValuesRef<sqlite3_value>?, pParse: CValuesRef<Parse>?): Unit

@CCall("knifunptr_sqlite31726_renameColumnElistNames")
external fun renameColumnElistNames(pParse: CValuesRef<Parse>?, pCtx: CValuesRef<RenameCtx>?, pEList: CValuesRef<ExprList>?, @CCall.CString zOld: String?): Unit

@CCall("knifunptr_sqlite31727_renameColumnIdlistNames")
external fun renameColumnIdlistNames(pParse: CValuesRef<Parse>?, pCtx: CValuesRef<RenameCtx>?, pIdList: CValuesRef<IdList>?, @CCall.CString zOld: String?): Unit

@CCall("knifunptr_sqlite31728_renameParseSql")
external fun renameParseSql(p: CValuesRef<Parse>?, @CCall.CString zDb: String?, bTable: Int, db: CValuesRef<sqlite3>?, @CCall.CString zSql: String?, bTemp: Int): Int

@CCall("knifunptr_sqlite31729_renameEditSql")
external fun renameEditSql(pCtx: CValuesRef<sqlite3_context>?, pRename: CValuesRef<RenameCtx>?, @CCall.CString zSql: String?, @CCall.CString zNew: String?, bQuote: Int): Int

@CCall("knifunptr_sqlite31730_renameResolveTrigger")
external fun renameResolveTrigger(pParse: CValuesRef<Parse>?, @CCall.CString zDb: String?): Int

@CCall("knifunptr_sqlite31731_renameWalkTrigger")
external fun renameWalkTrigger(pWalker: CValuesRef<Walker>?, pTrigger: CValuesRef<Trigger>?): Unit

@CCall("knifunptr_sqlite31732_renameParseCleanup")
external fun renameParseCleanup(pParse: CValuesRef<Parse>?): Unit

@CCall("knifunptr_sqlite31733_renameColumnFunc")
external fun renameColumnFunc(context: CValuesRef<sqlite3_context>?, NotUsed: Int, argv: CValuesRef<CPointerVar<sqlite3_value>>?): Unit

@CCall("knifunptr_sqlite31734_renameTableExprCb")
external fun renameTableExprCb(pWalker: CValuesRef<Walker>?, pExpr: CValuesRef<Expr>?): Int

@CCall("knifunptr_sqlite31735_renameTableSelectCb")
external fun renameTableSelectCb(pWalker: CValuesRef<Walker>?, pSelect: CValuesRef<Select>?): Int

@CCall("knifunptr_sqlite31736_renameTableFunc")
external fun renameTableFunc(context: CValuesRef<sqlite3_context>?, NotUsed: Int, argv: CValuesRef<CPointerVar<sqlite3_value>>?): Unit

@CCall("knifunptr_sqlite31737_renameTableTest")
external fun renameTableTest(context: CValuesRef<sqlite3_context>?, NotUsed: Int, argv: CValuesRef<CPointerVar<sqlite3_value>>?): Unit

@CCall("knifunptr_sqlite31738_openStatTable")
external fun openStatTable(pParse: CValuesRef<Parse>?, iDb: Int, iStatCur: Int, @CCall.CString zWhere: String?, @CCall.CString zWhereType: String?): Unit

@CCall("knifunptr_sqlite31739_stat4Destructor")
external fun stat4Destructor(pOld: CValuesRef<*>?): Unit

@CCall("knifunptr_sqlite31740_statInit")
external fun statInit(context: CValuesRef<sqlite3_context>?, argc: Int, argv: CValuesRef<CPointerVar<sqlite3_value>>?): Unit

@CCall("knifunptr_sqlite31741_samplePushPrevious")
external fun samplePushPrevious(p: CValuesRef<Stat4Accum>?, iChng: Int): Unit

@CCall("knifunptr_sqlite31742_statPush")
external fun statPush(context: CValuesRef<sqlite3_context>?, argc: Int, argv: CValuesRef<CPointerVar<sqlite3_value>>?): Unit

@CCall("knifunptr_sqlite31743_statGet")
external fun statGet(context: CValuesRef<sqlite3_context>?, argc: Int, argv: CValuesRef<CPointerVar<sqlite3_value>>?): Unit

@CCall("knifunptr_sqlite31744_callStatGet")
external fun callStatGet(v: CValuesRef<Vdbe>?, regStat4: Int, iParam: Int, regOut: Int): Unit

@CCall("knifunptr_sqlite31745_analyzeOneTable")
external fun analyzeOneTable(pParse: CValuesRef<Parse>?, pTab: CValuesRef<Table>?, pOnlyIdx: CValuesRef<Index>?, iStatCur: Int, iMem: Int, iTab: Int): Unit

@CCall("knifunptr_sqlite31746_loadAnalysis")
external fun loadAnalysis(pParse: CValuesRef<Parse>?, iDb: Int): Unit

@CCall("knifunptr_sqlite31747_analyzeDatabase")
external fun analyzeDatabase(pParse: CValuesRef<Parse>?, iDb: Int): Unit

@CCall("knifunptr_sqlite31748_analyzeTable")
external fun analyzeTable(pParse: CValuesRef<Parse>?, pTab: CValuesRef<Table>?, pOnlyIdx: CValuesRef<Index>?): Unit

@CCall("knifunptr_sqlite31749_decodeIntArray")
external fun decodeIntArray(zIntArray: CValuesRef<ByteVar>?, nOut: Int, aOut: CValuesRef<tRowcntVar>?, aLog: CValuesRef<LogEstVar>?, pIndex: CValuesRef<Index>?): Unit

@CCall("knifunptr_sqlite31750_analysisLoader")
external fun analysisLoader(pData: CValuesRef<*>?, argc: Int, argv: CValuesRef<CPointerVar<ByteVar>>?, NotUsed: CValuesRef<CPointerVar<ByteVar>>?): Int

@CCall("knifunptr_sqlite31751_resolveAttachExpr")
external fun resolveAttachExpr(pName: CValuesRef<NameContext>?, pExpr: CValuesRef<Expr>?): Int

@CCall("knifunptr_sqlite31752_attachFunc")
external fun attachFunc(context: CValuesRef<sqlite3_context>?, NotUsed: Int, argv: CValuesRef<CPointerVar<sqlite3_value>>?): Unit

@CCall("knifunptr_sqlite31753_detachFunc")
external fun detachFunc(context: CValuesRef<sqlite3_context>?, NotUsed: Int, argv: CValuesRef<CPointerVar<sqlite3_value>>?): Unit

@CCall("knifunptr_sqlite31754_codeAttach")
external fun codeAttach(pParse: CValuesRef<Parse>?, type: Int, pFunc: CValuesRef<FuncDef>?, pAuthArg: CValuesRef<Expr>?, pFilename: CValuesRef<Expr>?, pDbname: CValuesRef<Expr>?, pKey: CValuesRef<Expr>?): Unit

@CCall("knifunptr_sqlite31755_sqliteAuthBadReturnCode")
external fun sqliteAuthBadReturnCode(pParse: CValuesRef<Parse>?): Unit

@CCall("knifunptr_sqlite31756_codeTableLocks")
external fun codeTableLocks(pParse: CValuesRef<Parse>?): Unit

@CCall("knifunptr_sqlite31757_deleteTable")
external fun deleteTable(db: CValuesRef<sqlite3>?, pTable: CValuesRef<Table>?): Unit

@CCall("knifunptr_sqlite31758_sqlite3StringToId")
external fun sqlite3StringToId(p: CValuesRef<Expr>?): Unit

@CCall("knifunptr_sqlite31759_identLength")
external fun identLength(@CCall.CString z: String?): Int

@CCall("knifunptr_sqlite31760_identPut")
external fun identPut(z: CValuesRef<ByteVar>?, pIdx: CValuesRef<IntVar>?, zSignedIdent: CValuesRef<ByteVar>?): Unit

@CCall("knifunptr_sqlite31761_createTableStmt")
external fun createTableStmt(db: CValuesRef<sqlite3>?, p: CValuesRef<Table>?): CPointer<ByteVar>?

@CCall("knifunptr_sqlite31762_resizeIndexObject")
external fun resizeIndexObject(db: CValuesRef<sqlite3>?, pIdx: CValuesRef<Index>?, N: Int): Int

@CCall("knifunptr_sqlite31763_estimateTableWidth")
external fun estimateTableWidth(pTab: CValuesRef<Table>?): Unit

@CCall("knifunptr_sqlite31764_estimateIndexWidth")
external fun estimateIndexWidth(pIdx: CValuesRef<Index>?): Unit

@CCall("knifunptr_sqlite31765_hasColumn")
external fun hasColumn(aiCol: CValuesRef<i16Var>?, nCol: Int, x: Int): Int

@CCall("knifunptr_sqlite31766_recomputeColumnsNotIndexed")
external fun recomputeColumnsNotIndexed(pIdx: CValuesRef<Index>?): Unit

@CCall("knifunptr_sqlite31767_convertToWithoutRowidTable")
external fun convertToWithoutRowidTable(pParse: CValuesRef<Parse>?, pTab: CValuesRef<Table>?): Unit

@CCall("knifunptr_sqlite31768_isShadowTableName")
external fun isShadowTableName(db: CValuesRef<sqlite3>?, zName: CValuesRef<ByteVar>?): Int

@CCall("knifunptr_sqlite31769_sqliteViewResetAll")
external fun sqliteViewResetAll(db: CValuesRef<sqlite3>?, idx: Int): Unit

@CCall("knifunptr_sqlite31770_destroyRootPage")
external fun destroyRootPage(pParse: CValuesRef<Parse>?, iTable: Int, iDb: Int): Unit

@CCall("knifunptr_sqlite31771_destroyTable")
external fun destroyTable(pParse: CValuesRef<Parse>?, pTab: CValuesRef<Table>?): Unit

@CCall("knifunptr_sqlite31772_sqlite3ClearStatTables")
external fun sqlite3ClearStatTables(pParse: CValuesRef<Parse>?, iDb: Int, @CCall.CString zType: String?, @CCall.CString zName: String?): Unit

@CCall("knifunptr_sqlite31773_sqlite3RefillIndex")
external fun sqlite3RefillIndex(pParse: CValuesRef<Parse>?, pIndex: CValuesRef<Index>?, memRootPage: Int): Unit

@CCall("knifunptr_sqlite31774_collationMatch")
external fun collationMatch(@CCall.CString zColl: String?, pIndex: CValuesRef<Index>?): Int

@CCall("knifunptr_sqlite31775_reindexTable")
external fun reindexTable(pParse: CValuesRef<Parse>?, pTab: CValuesRef<Table>?, @CCall.CString zColl: String?): Unit

@CCall("knifunptr_sqlite31776_reindexDatabases")
external fun reindexDatabases(pParse: CValuesRef<Parse>?, @CCall.CString zColl: String?): Unit

@CCall("knifunptr_sqlite31777_callCollNeeded")
external fun callCollNeeded(db: CValuesRef<sqlite3>?, enc: Int, @CCall.CString zName: String?): Unit

@CCall("knifunptr_sqlite31778_synthCollSeq")
external fun synthCollSeq(db: CValuesRef<sqlite3>?, pColl: CValuesRef<CollSeq>?): Int

@CCall("knifunptr_sqlite31779_findCollSeqEntry")
external fun findCollSeqEntry(db: CValuesRef<sqlite3>?, @CCall.CString zName: String?, create: Int): CPointer<CollSeq>?

@CCall("knifunptr_sqlite31780_matchQuality")
external fun matchQuality(p: CValuesRef<FuncDef>?, nArg: Int, enc: u8): Int

@CCall("knifunptr_sqlite31781_tabIsReadOnly")
external fun tabIsReadOnly(pParse: CValuesRef<Parse>?, pTab: CValuesRef<Table>?): Int

@CCall("knifunptr_sqlite31782_sqlite3GetFuncCollSeq")
external fun sqlite3GetFuncCollSeq(context: CValuesRef<sqlite3_context>?): CPointer<CollSeq>?

@CCall("knifunptr_sqlite31783_sqlite3SkipAccumulatorLoad")
external fun sqlite3SkipAccumulatorLoad(context: CValuesRef<sqlite3_context>?): Unit

@CCall("knifunptr_sqlite31784_minmaxFunc")
external fun minmaxFunc(context: CValuesRef<sqlite3_context>?, argc: Int, argv: CValuesRef<CPointerVar<sqlite3_value>>?): Unit

@CCall("knifunptr_sqlite31785_typeofFunc")
external fun typeofFunc(context: CValuesRef<sqlite3_context>?, NotUsed: Int, argv: CValuesRef<CPointerVar<sqlite3_value>>?): Unit

@CCall("knifunptr_sqlite31786_lengthFunc")
external fun lengthFunc(context: CValuesRef<sqlite3_context>?, argc: Int, argv: CValuesRef<CPointerVar<sqlite3_value>>?): Unit

@CCall("knifunptr_sqlite31787_absFunc")
external fun absFunc(context: CValuesRef<sqlite3_context>?, argc: Int, argv: CValuesRef<CPointerVar<sqlite3_value>>?): Unit

@CCall("knifunptr_sqlite31788_instrFunc")
external fun instrFunc(context: CValuesRef<sqlite3_context>?, argc: Int, argv: CValuesRef<CPointerVar<sqlite3_value>>?): Unit

@CCall("knifunptr_sqlite31789_printfFunc")
external fun printfFunc(context: CValuesRef<sqlite3_context>?, argc: Int, argv: CValuesRef<CPointerVar<sqlite3_value>>?): Unit

@CCall("knifunptr_sqlite31790_substrFunc")
external fun substrFunc(context: CValuesRef<sqlite3_context>?, argc: Int, argv: CValuesRef<CPointerVar<sqlite3_value>>?): Unit

@CCall("knifunptr_sqlite31791_roundFunc")
external fun roundFunc(context: CValuesRef<sqlite3_context>?, argc: Int, argv: CValuesRef<CPointerVar<sqlite3_value>>?): Unit

@CCall("knifunptr_sqlite31792_contextMalloc")
external fun contextMalloc(context: CValuesRef<sqlite3_context>?, nByte: i64): COpaquePointer?

@CCall("knifunptr_sqlite31793_upperFunc")
external fun upperFunc(context: CValuesRef<sqlite3_context>?, argc: Int, argv: CValuesRef<CPointerVar<sqlite3_value>>?): Unit

@CCall("knifunptr_sqlite31794_lowerFunc")
external fun lowerFunc(context: CValuesRef<sqlite3_context>?, argc: Int, argv: CValuesRef<CPointerVar<sqlite3_value>>?): Unit

@CCall("knifunptr_sqlite31795_randomFunc")
external fun randomFunc(context: CValuesRef<sqlite3_context>?, NotUsed: Int, NotUsed2: CValuesRef<CPointerVar<sqlite3_value>>?): Unit

@CCall("knifunptr_sqlite31796_randomBlob")
external fun randomBlob(context: CValuesRef<sqlite3_context>?, argc: Int, argv: CValuesRef<CPointerVar<sqlite3_value>>?): Unit

@CCall("knifunptr_sqlite31797_last_insert_rowid")
external fun last_insert_rowid(context: CValuesRef<sqlite3_context>?, NotUsed: Int, NotUsed2: CValuesRef<CPointerVar<sqlite3_value>>?): Unit

@CCall("knifunptr_sqlite31798_changes")
external fun changes(context: CValuesRef<sqlite3_context>?, NotUsed: Int, NotUsed2: CValuesRef<CPointerVar<sqlite3_value>>?): Unit

@CCall("knifunptr_sqlite31799_total_changes")
external fun total_changes(context: CValuesRef<sqlite3_context>?, NotUsed: Int, NotUsed2: CValuesRef<CPointerVar<sqlite3_value>>?): Unit

@CCall("knifunptr_sqlite31800_patternCompare")
external fun patternCompare(zPattern: CValuesRef<u8Var>?, zString: CValuesRef<u8Var>?, pInfo: CValuesRef<compareInfo>?, matchOther: u32): Int

@CCall("knifunptr_sqlite31801_likeFunc")
external fun likeFunc(context: CValuesRef<sqlite3_context>?, argc: Int, argv: CValuesRef<CPointerVar<sqlite3_value>>?): Unit

@CCall("knifunptr_sqlite31802_nullifFunc")
external fun nullifFunc(context: CValuesRef<sqlite3_context>?, NotUsed: Int, argv: CValuesRef<CPointerVar<sqlite3_value>>?): Unit

@CCall("knifunptr_sqlite31803_versionFunc")
external fun versionFunc(context: CValuesRef<sqlite3_context>?, NotUsed: Int, NotUsed2: CValuesRef<CPointerVar<sqlite3_value>>?): Unit

@CCall("knifunptr_sqlite31804_sourceidFunc")
external fun sourceidFunc(context: CValuesRef<sqlite3_context>?, NotUsed: Int, NotUsed2: CValuesRef<CPointerVar<sqlite3_value>>?): Unit

@CCall("knifunptr_sqlite31805_errlogFunc")
external fun errlogFunc(context: CValuesRef<sqlite3_context>?, argc: Int, argv: CValuesRef<CPointerVar<sqlite3_value>>?): Unit

@CCall("knifunptr_sqlite31806_compileoptionusedFunc")
external fun compileoptionusedFunc(context: CValuesRef<sqlite3_context>?, argc: Int, argv: CValuesRef<CPointerVar<sqlite3_value>>?): Unit

@CCall("knifunptr_sqlite31807_compileoptiongetFunc")
external fun compileoptiongetFunc(context: CValuesRef<sqlite3_context>?, argc: Int, argv: CValuesRef<CPointerVar<sqlite3_value>>?): Unit

@CCall("knifunptr_sqlite31808_quoteFunc")
external fun quoteFunc(context: CValuesRef<sqlite3_context>?, argc: Int, argv: CValuesRef<CPointerVar<sqlite3_value>>?): Unit

@CCall("knifunptr_sqlite31809_unicodeFunc")
external fun unicodeFunc(context: CValuesRef<sqlite3_context>?, argc: Int, argv: CValuesRef<CPointerVar<sqlite3_value>>?): Unit

@CCall("knifunptr_sqlite31810_charFunc")
external fun charFunc(context: CValuesRef<sqlite3_context>?, argc: Int, argv: CValuesRef<CPointerVar<sqlite3_value>>?): Unit

@CCall("knifunptr_sqlite31811_hexFunc")
external fun hexFunc(context: CValuesRef<sqlite3_context>?, argc: Int, argv: CValuesRef<CPointerVar<sqlite3_value>>?): Unit

@CCall("knifunptr_sqlite31812_zeroblobFunc")
external fun zeroblobFunc(context: CValuesRef<sqlite3_context>?, argc: Int, argv: CValuesRef<CPointerVar<sqlite3_value>>?): Unit

@CCall("knifunptr_sqlite31813_replaceFunc")
external fun replaceFunc(context: CValuesRef<sqlite3_context>?, argc: Int, argv: CValuesRef<CPointerVar<sqlite3_value>>?): Unit

@CCall("knifunptr_sqlite31814_trimFunc")
external fun trimFunc(context: CValuesRef<sqlite3_context>?, argc: Int, argv: CValuesRef<CPointerVar<sqlite3_value>>?): Unit

@CCall("knifunptr_sqlite31815_loadExt")
external fun loadExt(context: CValuesRef<sqlite3_context>?, argc: Int, argv: CValuesRef<CPointerVar<sqlite3_value>>?): Unit

@CCall("knifunptr_sqlite31816_sumStep")
external fun sumStep(context: CValuesRef<sqlite3_context>?, argc: Int, argv: CValuesRef<CPointerVar<sqlite3_value>>?): Unit

@CCall("knifunptr_sqlite31817_sumInverse")
external fun sumInverse(context: CValuesRef<sqlite3_context>?, argc: Int, argv: CValuesRef<CPointerVar<sqlite3_value>>?): Unit

@CCall("knifunptr_sqlite31818_sumFinalize")
external fun sumFinalize(context: CValuesRef<sqlite3_context>?): Unit

@CCall("knifunptr_sqlite31819_avgFinalize")
external fun avgFinalize(context: CValuesRef<sqlite3_context>?): Unit

@CCall("knifunptr_sqlite31820_totalFinalize")
external fun totalFinalize(context: CValuesRef<sqlite3_context>?): Unit

@CCall("knifunptr_sqlite31821_countStep")
external fun countStep(context: CValuesRef<sqlite3_context>?, argc: Int, argv: CValuesRef<CPointerVar<sqlite3_value>>?): Unit

@CCall("knifunptr_sqlite31822_countFinalize")
external fun countFinalize(context: CValuesRef<sqlite3_context>?): Unit

@CCall("knifunptr_sqlite31823_countInverse")
external fun countInverse(ctx: CValuesRef<sqlite3_context>?, argc: Int, argv: CValuesRef<CPointerVar<sqlite3_value>>?): Unit

@CCall("knifunptr_sqlite31824_minmaxStep")
external fun minmaxStep(context: CValuesRef<sqlite3_context>?, NotUsed: Int, argv: CValuesRef<CPointerVar<sqlite3_value>>?): Unit

@CCall("knifunptr_sqlite31825_minMaxValueFinalize")
external fun minMaxValueFinalize(context: CValuesRef<sqlite3_context>?, bValue: Int): Unit

@CCall("knifunptr_sqlite31826_minMaxValue")
external fun minMaxValue(context: CValuesRef<sqlite3_context>?): Unit

@CCall("knifunptr_sqlite31827_minMaxFinalize")
external fun minMaxFinalize(context: CValuesRef<sqlite3_context>?): Unit

@CCall("knifunptr_sqlite31828_groupConcatStep")
external fun groupConcatStep(context: CValuesRef<sqlite3_context>?, argc: Int, argv: CValuesRef<CPointerVar<sqlite3_value>>?): Unit

@CCall("knifunptr_sqlite31829_groupConcatInverse")
external fun groupConcatInverse(context: CValuesRef<sqlite3_context>?, argc: Int, argv: CValuesRef<CPointerVar<sqlite3_value>>?): Unit

@CCall("knifunptr_sqlite31830_groupConcatFinalize")
external fun groupConcatFinalize(context: CValuesRef<sqlite3_context>?): Unit

@CCall("knifunptr_sqlite31831_groupConcatValue")
external fun groupConcatValue(context: CValuesRef<sqlite3_context>?): Unit

@CCall("knifunptr_sqlite31832_setLikeOptFlag")
external fun setLikeOptFlag(db: CValuesRef<sqlite3>?, @CCall.CString zName: String?, flagVal: u8): Unit

@CCall("knifunptr_sqlite31833_fkLookupParent")
external fun fkLookupParent(pParse: CValuesRef<Parse>?, iDb: Int, pTab: CValuesRef<Table>?, pIdx: CValuesRef<Index>?, pFKey: CValuesRef<FKey>?, aiCol: CValuesRef<IntVar>?, regData: Int, nIncr: Int, isIgnore: Int): Unit

@CCall("knifunptr_sqlite31834_exprTableRegister")
external fun exprTableRegister(pParse: CValuesRef<Parse>?, pTab: CValuesRef<Table>?, regBase: Int, iCol: i16): CPointer<Expr>?

@CCall("knifunptr_sqlite31835_exprTableColumn")
external fun exprTableColumn(db: CValuesRef<sqlite3>?, pTab: CValuesRef<Table>?, iCursor: Int, iCol: i16): CPointer<Expr>?

@CCall("knifunptr_sqlite31836_fkScanChildren")
external fun fkScanChildren(pParse: CValuesRef<Parse>?, pSrc: CValuesRef<SrcList>?, pTab: CValuesRef<Table>?, pIdx: CValuesRef<Index>?, pFKey: CValuesRef<FKey>?, aiCol: CValuesRef<IntVar>?, regData: Int, nIncr: Int): Unit

@CCall("knifunptr_sqlite31837_fkTriggerDelete")
external fun fkTriggerDelete(dbMem: CValuesRef<sqlite3>?, p: CValuesRef<Trigger>?): Unit

@CCall("knifunptr_sqlite31838_fkChildIsModified")
external fun fkChildIsModified(pTab: CValuesRef<Table>?, p: CValuesRef<FKey>?, aChange: CValuesRef<IntVar>?, bChngRowid: Int): Int

@CCall("knifunptr_sqlite31839_fkParentIsModified")
external fun fkParentIsModified(pTab: CValuesRef<Table>?, p: CValuesRef<FKey>?, aChange: CValuesRef<IntVar>?, bChngRowid: Int): Int

@CCall("knifunptr_sqlite31840_isSetNullAction")
external fun isSetNullAction(pParse: CValuesRef<Parse>?, pFKey: CValuesRef<FKey>?): Int

@CCall("knifunptr_sqlite31841_fkActionTrigger")
external fun fkActionTrigger(pParse: CValuesRef<Parse>?, pTab: CValuesRef<Table>?, pFKey: CValuesRef<FKey>?, pChanges: CValuesRef<ExprList>?): CPointer<Trigger>?

@CCall("knifunptr_sqlite31842_readsTable")
external fun readsTable(p: CValuesRef<Parse>?, iDb: Int, pTab: CValuesRef<Table>?): Int

@CCall("knifunptr_sqlite31843_autoIncBegin")
external fun autoIncBegin(pParse: CValuesRef<Parse>?, iDb: Int, pTab: CValuesRef<Table>?): Int

@CCall("knifunptr_sqlite31844_autoIncStep")
external fun autoIncStep(pParse: CValuesRef<Parse>?, memId: Int, regRowid: Int): Unit

@CCall("knifunptr_sqlite31845_autoIncrementEnd")
external fun autoIncrementEnd(pParse: CValuesRef<Parse>?): Unit

@CCall("knifunptr_sqlite31846_xferOptimization")
external fun xferOptimization(pParse: CValuesRef<Parse>?, pDest: CValuesRef<Table>?, pSelect: CValuesRef<Select>?, onError: Int, iDbDest: Int): Int

@CCall("knifunptr_sqlite31847_checkConstraintExprNode")
external fun checkConstraintExprNode(pWalker: CValuesRef<Walker>?, pExpr: CValuesRef<Expr>?): Int

@CCall("knifunptr_sqlite31848_xferCompatibleIndex")
external fun xferCompatibleIndex(pDest: CValuesRef<Index>?, pSrc: CValuesRef<Index>?): Int

@CCall("knifunptr_sqlite31849_sqlite3LoadExtension")
external fun sqlite3LoadExtension(db: CValuesRef<sqlite3>?, @CCall.CString zFile: String?, @CCall.CString zProc: String?, pzErrMsg: CValuesRef<CPointerVar<ByteVar>>?): Int

@CCall("knifunptr_sqlite31850_getSafetyLevel")
external fun getSafetyLevel(@CCall.CString z: String?, omitFull: Int, dflt: u8): u8

@CCall("knifunptr_sqlite31851_getLockingMode")
external fun getLockingMode(@CCall.CString z: String?): Int

@CCall("knifunptr_sqlite31852_getAutoVacuum")
external fun getAutoVacuum(@CCall.CString z: String?): Int

@CCall("knifunptr_sqlite31853_getTempStore")
external fun getTempStore(@CCall.CString z: String?): Int

@CCall("knifunptr_sqlite31854_invalidateTempStorage")
external fun invalidateTempStorage(pParse: CValuesRef<Parse>?): Int

@CCall("knifunptr_sqlite31855_changeTempStorage")
external fun changeTempStorage(pParse: CValuesRef<Parse>?, @CCall.CString zStorageType: String?): Int

@CCall("knifunptr_sqlite31856_setPragmaResultColumnNames")
external fun setPragmaResultColumnNames(v: CValuesRef<Vdbe>?, pPragma: CValuesRef<PragmaName>?): Unit

@CCall("knifunptr_sqlite31857_returnSingleInt")
external fun returnSingleInt(v: CValuesRef<Vdbe>?, value: i64): Unit

@CCall("knifunptr_sqlite31858_returnSingleText")
external fun returnSingleText(v: CValuesRef<Vdbe>?, @CCall.CString zValue: String?): Unit

@CCall("knifunptr_sqlite31859_setAllPagerFlags")
external fun setAllPagerFlags(db: CValuesRef<sqlite3>?): Unit

@CCall("knifunptr_sqlite31860_actionName")
external fun actionName(action: u8): CPointer<ByteVar>?

@CCall("knifunptr_sqlite31861_pragmaLocate")
external fun pragmaLocate(@CCall.CString zName: String?): CPointer<PragmaName>?

@CCall("knifunptr_sqlite31862_integrityCheckResultRow")
external fun integrityCheckResultRow(v: CValuesRef<Vdbe>?): Int

@CCall("knifunptr_sqlite31863_pragmaVtabConnect")
external fun pragmaVtabConnect(db: CValuesRef<sqlite3>?, pAux: CValuesRef<*>?, argc: Int, argv: CValuesRef<CPointerVar<ByteVar>>?, ppVtab: CValuesRef<CPointerVar<sqlite3_vtab>>?, pzErr: CValuesRef<CPointerVar<ByteVar>>?): Int

@CCall("knifunptr_sqlite31864_pragmaVtabDisconnect")
external fun pragmaVtabDisconnect(pVtab: CValuesRef<sqlite3_vtab>?): Int

@CCall("knifunptr_sqlite31865_pragmaVtabBestIndex")
external fun pragmaVtabBestIndex(tab: CValuesRef<sqlite3_vtab>?, pIdxInfo: CValuesRef<sqlite3_index_info>?): Int

@CCall("knifunptr_sqlite31866_pragmaVtabOpen")
external fun pragmaVtabOpen(pVtab: CValuesRef<sqlite3_vtab>?, ppCursor: CValuesRef<CPointerVar<sqlite3_vtab_cursor>>?): Int

@CCall("knifunptr_sqlite31867_pragmaVtabCursorClear")
external fun pragmaVtabCursorClear(pCsr: CValuesRef<PragmaVtabCursor>?): Unit

@CCall("knifunptr_sqlite31868_pragmaVtabClose")
external fun pragmaVtabClose(cur: CValuesRef<sqlite3_vtab_cursor>?): Int

@CCall("knifunptr_sqlite31869_pragmaVtabNext")
external fun pragmaVtabNext(pVtabCursor: CValuesRef<sqlite3_vtab_cursor>?): Int

@CCall("knifunptr_sqlite31870_pragmaVtabFilter")
external fun pragmaVtabFilter(pVtabCursor: CValuesRef<sqlite3_vtab_cursor>?, idxNum: Int, @CCall.CString idxStr: String?, argc: Int, argv: CValuesRef<CPointerVar<sqlite3_value>>?): Int

@CCall("knifunptr_sqlite31871_pragmaVtabEof")
external fun pragmaVtabEof(pVtabCursor: CValuesRef<sqlite3_vtab_cursor>?): Int

@CCall("knifunptr_sqlite31872_pragmaVtabColumn")
external fun pragmaVtabColumn(pVtabCursor: CValuesRef<sqlite3_vtab_cursor>?, ctx: CValuesRef<sqlite3_context>?, i: Int): Int

@CCall("knifunptr_sqlite31873_pragmaVtabRowid")
external fun pragmaVtabRowid(pVtabCursor: CValuesRef<sqlite3_vtab_cursor>?, p: CValuesRef<sqlite_int64Var>?): Int

@CCall("knifunptr_sqlite31874_corruptSchema")
external fun corruptSchema(pData: CValuesRef<InitData>?, @CCall.CString zObj: String?, @CCall.CString zExtra: String?): Unit

@CCall("knifunptr_sqlite31875_schemaIsValid")
external fun schemaIsValid(pParse: CValuesRef<Parse>?): Unit

@CCall("knifunptr_sqlite31876_sqlite3Prepare")
external fun sqlite3Prepare(db: CValuesRef<sqlite3>?, @CCall.CString zSql: String?, nBytes: Int, prepFlags: u32, pReprepare: CValuesRef<Vdbe>?, ppStmt: CValuesRef<CPointerVar<sqlite3_stmt>>?, pzTail: CValuesRef<CPointerVar<ByteVar>>?): Int

@CCall("knifunptr_sqlite31877_sqlite3LockAndPrepare")
external fun sqlite3LockAndPrepare(db: CValuesRef<sqlite3>?, @CCall.CString zSql: String?, nBytes: Int, prepFlags: u32, pOld: CValuesRef<Vdbe>?, ppStmt: CValuesRef<CPointerVar<sqlite3_stmt>>?, pzTail: CValuesRef<CPointerVar<ByteVar>>?): Int

@CCall("knifunptr_sqlite31878_sqlite3Prepare16")
external fun sqlite3Prepare16(db: CValuesRef<sqlite3>?, zSql: CValuesRef<*>?, nBytes: Int, prepFlags: u32, ppStmt: CValuesRef<CPointerVar<sqlite3_stmt>>?, pzTail: CValuesRef<COpaquePointerVar>?): Int

@CCall("knifunptr_sqlite31879_clearSelect")
external fun clearSelect(db: CValuesRef<sqlite3>?, p: CValuesRef<Select>?, bFree: Int): Unit

@CCall("knifunptr_sqlite31880_findRightmost")
external fun findRightmost(p: CValuesRef<Select>?): CPointer<Select>?

@CCall("knifunptr_sqlite31881_columnIndex")
external fun columnIndex(pTab: CValuesRef<Table>?, @CCall.CString zCol: String?): Int

@CCall("knifunptr_sqlite31882_tableAndColumnIndex")
external fun tableAndColumnIndex(pSrc: CValuesRef<SrcList>?, N: Int, @CCall.CString zCol: String?, piTab: CValuesRef<IntVar>?, piCol: CValuesRef<IntVar>?): Int

@CCall("knifunptr_sqlite31883_addWhereTerm")
external fun addWhereTerm(pParse: CValuesRef<Parse>?, pSrc: CValuesRef<SrcList>?, iLeft: Int, iColLeft: Int, iRight: Int, iColRight: Int, isOuterJoin: Int, ppWhere: CValuesRef<CPointerVar<Expr>>?): Unit

@CCall("knifunptr_sqlite31884_setJoinExpr")
external fun setJoinExpr(p: CValuesRef<Expr>?, iTable: Int): Unit

@CCall("knifunptr_sqlite31885_unsetJoinExpr")
external fun unsetJoinExpr(p: CValuesRef<Expr>?, iTable: Int): Unit

@CCall("knifunptr_sqlite31886_sqliteProcessJoin")
external fun sqliteProcessJoin(pParse: CValuesRef<Parse>?, p: CValuesRef<Select>?): Int

@CCall("knifunptr_sqlite31887_innerLoopLoadRow")
external fun innerLoopLoadRow(pParse: CValuesRef<Parse>?, pSelect: CValuesRef<Select>?, pInfo: CValuesRef<RowLoadInfo>?): Unit

@CCall("knifunptr_sqlite31888_makeSorterRecord")
external fun makeSorterRecord(pParse: CValuesRef<Parse>?, pSort: CValuesRef<SortCtx>?, pSelect: CValuesRef<Select>?, regBase: Int, nBase: Int): Int

@CCall("knifunptr_sqlite31889_pushOntoSorter")
external fun pushOntoSorter(pParse: CValuesRef<Parse>?, pSort: CValuesRef<SortCtx>?, pSelect: CValuesRef<Select>?, regData: Int, regOrigData: Int, nData: Int, nPrefixReg: Int): Unit

@CCall("knifunptr_sqlite31890_codeOffset")
external fun codeOffset(v: CValuesRef<Vdbe>?, iOffset: Int, iContinue: Int): Unit

@CCall("knifunptr_sqlite31891_codeDistinct")
external fun codeDistinct(pParse: CValuesRef<Parse>?, iTab: Int, addrRepeat: Int, N: Int, iMem: Int): Unit

@CCall("knifunptr_sqlite31892_selectInnerLoop")
external fun selectInnerLoop(pParse: CValuesRef<Parse>?, p: CValuesRef<Select>?, srcTab: Int, pSort: CValuesRef<SortCtx>?, pDistinct: CValuesRef<DistinctCtx>?, pDest: CValuesRef<SelectDest>?, iContinue: Int, iBreak: Int): Unit

@CCall("knifunptr_sqlite31893_selectOpName")
external fun selectOpName(id: Int): CPointer<ByteVar>?

@CCall("knifunptr_sqlite31894_explainTempTable")
external fun explainTempTable(pParse: CValuesRef<Parse>?, @CCall.CString zUsage: String?): Unit

@CCall("knifunptr_sqlite31895_generateSortTail")
external fun generateSortTail(pParse: CValuesRef<Parse>?, p: CValuesRef<Select>?, pSort: CValuesRef<SortCtx>?, nColumn: Int, pDest: CValuesRef<SelectDest>?): Unit

@CCall("knifunptr_sqlite31896_columnTypeImpl")
external fun columnTypeImpl(pNC: CValuesRef<NameContext>?, pExpr: CValuesRef<Expr>?): CPointer<ByteVar>?

@CCall("knifunptr_sqlite31897_generateColumnTypes")
external fun generateColumnTypes(pParse: CValuesRef<Parse>?, pTabList: CValuesRef<SrcList>?, pEList: CValuesRef<ExprList>?): Unit

@CCall("knifunptr_sqlite31898_generateColumnNames")
external fun generateColumnNames(pParse: CValuesRef<Parse>?, pSelect: CValuesRef<Select>?): Unit

@CCall("knifunptr_sqlite31899_computeLimitRegisters")
external fun computeLimitRegisters(pParse: CValuesRef<Parse>?, p: CValuesRef<Select>?, iBreak: Int): Unit

@CCall("knifunptr_sqlite31900_multiSelectCollSeq")
external fun multiSelectCollSeq(pParse: CValuesRef<Parse>?, p: CValuesRef<Select>?, iCol: Int): CPointer<CollSeq>?

@CCall("knifunptr_sqlite31901_multiSelectOrderByKeyInfo")
external fun multiSelectOrderByKeyInfo(pParse: CValuesRef<Parse>?, p: CValuesRef<Select>?, nExtra: Int): CPointer<KeyInfo>?

@CCall("knifunptr_sqlite31902_generateWithRecursiveQuery")
external fun generateWithRecursiveQuery(pParse: CValuesRef<Parse>?, p: CValuesRef<Select>?, pDest: CValuesRef<SelectDest>?): Unit

@CCall("knifunptr_sqlite31903_multiSelectOrderBy")
external fun multiSelectOrderBy(pParse: CValuesRef<Parse>?, p: CValuesRef<Select>?, pDest: CValuesRef<SelectDest>?): Int

@CCall("knifunptr_sqlite31904_multiSelectValues")
external fun multiSelectValues(pParse: CValuesRef<Parse>?, p: CValuesRef<Select>?, pDest: CValuesRef<SelectDest>?): Int

@CCall("knifunptr_sqlite31905_multiSelect")
external fun multiSelect(pParse: CValuesRef<Parse>?, p: CValuesRef<Select>?, pDest: CValuesRef<SelectDest>?): Int

@CCall("knifunptr_sqlite31906_generateOutputSubroutine")
external fun generateOutputSubroutine(pParse: CValuesRef<Parse>?, p: CValuesRef<Select>?, pIn: CValuesRef<SelectDest>?, pDest: CValuesRef<SelectDest>?, regReturn: Int, regPrev: Int, pKeyInfo: CValuesRef<KeyInfo>?, iBreak: Int): Int

@CCall("knifunptr_sqlite31907_substExprList")
external fun substExprList(arg0: CValuesRef<SubstContext>?, arg1: CValuesRef<ExprList>?): Unit

@CCall("knifunptr_sqlite31908_substSelect")
external fun substSelect(arg0: CValuesRef<SubstContext>?, arg1: CValuesRef<Select>?, arg2: Int): Unit

@CCall("knifunptr_sqlite31909_substExpr")
external fun substExpr(pSubst: CValuesRef<SubstContext>?, pExpr: CValuesRef<Expr>?): CPointer<Expr>?

@CCall("knifunptr_sqlite31910_flattenSubquery")
external fun flattenSubquery(pParse: CValuesRef<Parse>?, p: CValuesRef<Select>?, iFrom: Int, isAgg: Int): Int

@CCall("knifunptr_sqlite31911_constInsert")
external fun constInsert(pConst: CValuesRef<WhereConst>?, pColumn: CValuesRef<Expr>?, pValue: CValuesRef<Expr>?): Unit

@CCall("knifunptr_sqlite31912_findConstInWhere")
external fun findConstInWhere(pConst: CValuesRef<WhereConst>?, pExpr: CValuesRef<Expr>?): Unit

@CCall("knifunptr_sqlite31913_propagateConstantExprRewrite")
external fun propagateConstantExprRewrite(pWalker: CValuesRef<Walker>?, pExpr: CValuesRef<Expr>?): Int

@CCall("knifunptr_sqlite31914_propagateConstants")
external fun propagateConstants(pParse: CValuesRef<Parse>?, p: CValuesRef<Select>?): Int

@CCall("knifunptr_sqlite31915_pushDownWhereTerms")
external fun pushDownWhereTerms(pParse: CValuesRef<Parse>?, pSubq: CValuesRef<Select>?, pWhere: CValuesRef<Expr>?, iCursor: Int, isLeftJoin: Int): Int

@CCall("knifunptr_sqlite31916_minMaxQuery")
external fun minMaxQuery(db: CValuesRef<sqlite3>?, pFunc: CValuesRef<Expr>?, ppMinMax: CValuesRef<CPointerVar<ExprList>>?): u8

@CCall("knifunptr_sqlite31917_isSimpleCount")
external fun isSimpleCount(p: CValuesRef<Select>?, pAggInfo: CValuesRef<AggInfo>?): CPointer<Table>?

@CCall("knifunptr_sqlite31918_convertCompoundSelectToSubquery")
external fun convertCompoundSelectToSubquery(pWalker: CValuesRef<Walker>?, p: CValuesRef<Select>?): Int

@CCall("knifunptr_sqlite31919_cannotBeFunction")
external fun cannotBeFunction(pParse: CValuesRef<Parse>?, pFrom: CValuesRef<SrcList_item>?): Int

@CCall("knifunptr_sqlite31920_searchWith")
external fun searchWith(pWith: CValuesRef<With>?, pItem: CValuesRef<SrcList_item>?, ppContext: CValuesRef<CPointerVar<With>>?): CPointer<Cte>?

@CCall("knifunptr_sqlite31921_withExpand")
external fun withExpand(pWalker: CValuesRef<Walker>?, pFrom: CValuesRef<SrcList_item>?): Int

@CCall("knifunptr_sqlite31922_selectPopWith")
external fun selectPopWith(pWalker: CValuesRef<Walker>?, p: CValuesRef<Select>?): Unit

@CCall("knifunptr_sqlite31923_selectExpander")
external fun selectExpander(pWalker: CValuesRef<Walker>?, p: CValuesRef<Select>?): Int

@CCall("knifunptr_sqlite31924_sqlite3SelectExpand")
external fun sqlite3SelectExpand(pParse: CValuesRef<Parse>?, pSelect: CValuesRef<Select>?): Unit

@CCall("knifunptr_sqlite31925_selectAddSubqueryTypeInfo")
external fun selectAddSubqueryTypeInfo(pWalker: CValuesRef<Walker>?, p: CValuesRef<Select>?): Unit

@CCall("knifunptr_sqlite31926_sqlite3SelectAddTypeInfo")
external fun sqlite3SelectAddTypeInfo(pParse: CValuesRef<Parse>?, pSelect: CValuesRef<Select>?): Unit

@CCall("knifunptr_sqlite31927_resetAccumulator")
external fun resetAccumulator(pParse: CValuesRef<Parse>?, pAggInfo: CValuesRef<AggInfo>?): Unit

@CCall("knifunptr_sqlite31928_finalizeAggFunctions")
external fun finalizeAggFunctions(pParse: CValuesRef<Parse>?, pAggInfo: CValuesRef<AggInfo>?): Unit

@CCall("knifunptr_sqlite31929_updateAccumulator")
external fun updateAccumulator(pParse: CValuesRef<Parse>?, regAcc: Int, pAggInfo: CValuesRef<AggInfo>?): Unit

@CCall("knifunptr_sqlite31930_explainSimpleCount")
external fun explainSimpleCount(pParse: CValuesRef<Parse>?, pTab: CValuesRef<Table>?, pIdx: CValuesRef<Index>?): Unit

@CCall("knifunptr_sqlite31931_havingToWhereExprCb")
external fun havingToWhereExprCb(pWalker: CValuesRef<Walker>?, pExpr: CValuesRef<Expr>?): Int

@CCall("knifunptr_sqlite31932_havingToWhere")
external fun havingToWhere(pParse: CValuesRef<Parse>?, p: CValuesRef<Select>?): Unit

@CCall("knifunptr_sqlite31933_isSelfJoinView")
external fun isSelfJoinView(pTabList: CValuesRef<SrcList>?, pThis: CValuesRef<SrcList_item>?): CPointer<SrcList_item>?

@CCall("knifunptr_sqlite31934_sqlite3_get_table_cb")
external fun sqlite3_get_table_cb(pArg: CValuesRef<*>?, nCol: Int, argv: CValuesRef<CPointerVar<ByteVar>>?, colv: CValuesRef<CPointerVar<ByteVar>>?): Int

@CCall("knifunptr_sqlite31935_triggerSpanDup")
external fun triggerSpanDup(db: CValuesRef<sqlite3>?, @CCall.CString zStart: String?, @CCall.CString zEnd: String?): CPointer<ByteVar>?

@CCall("knifunptr_sqlite31936_triggerStepAllocate")
external fun triggerStepAllocate(pParse: CValuesRef<Parse>?, op: u8, pName: CValuesRef<Token>?, @CCall.CString zStart: String?, @CCall.CString zEnd: String?): CPointer<TriggerStep>?

@CCall("knifunptr_sqlite31937_tableOfTrigger")
external fun tableOfTrigger(pTrigger: CValuesRef<Trigger>?): CPointer<Table>?

@CCall("knifunptr_sqlite31938_checkColumnOverlap")
external fun checkColumnOverlap(pIdList: CValuesRef<IdList>?, pEList: CValuesRef<ExprList>?): Int

@CCall("knifunptr_sqlite31939_targetSrcList")
external fun targetSrcList(pParse: CValuesRef<Parse>?, pStep: CValuesRef<TriggerStep>?): CPointer<SrcList>?

@CCall("knifunptr_sqlite31940_codeTriggerProgram")
external fun codeTriggerProgram(pParse: CValuesRef<Parse>?, pStepList: CValuesRef<TriggerStep>?, orconf: Int): Int

@CCall("knifunptr_sqlite31941_transferParseError")
external fun transferParseError(pTo: CValuesRef<Parse>?, pFrom: CValuesRef<Parse>?): Unit

@CCall("knifunptr_sqlite31942_codeRowTrigger")
external fun codeRowTrigger(pParse: CValuesRef<Parse>?, pTrigger: CValuesRef<Trigger>?, pTab: CValuesRef<Table>?, orconf: Int): CPointer<TriggerPrg>?

@CCall("knifunptr_sqlite31943_getRowTrigger")
external fun getRowTrigger(pParse: CValuesRef<Parse>?, pTrigger: CValuesRef<Trigger>?, pTab: CValuesRef<Table>?, orconf: Int): CPointer<TriggerPrg>?

@CCall("knifunptr_sqlite31944_updateVirtualTable")
external fun updateVirtualTable(pParse: CValuesRef<Parse>?, pSrc: CValuesRef<SrcList>?, pTab: CValuesRef<Table>?, pChanges: CValuesRef<ExprList>?, pRowidExpr: CValuesRef<Expr>?, aXRef: CValuesRef<IntVar>?, pWhere: CValuesRef<Expr>?, onError: Int): Unit

@CCall("knifunptr_sqlite31945_indexColumnIsBeingUpdated")
external fun indexColumnIsBeingUpdated(pIdx: CValuesRef<Index>?, iCol: Int, aXRef: CValuesRef<IntVar>?, chngRowid: Int): Int

@CCall("knifunptr_sqlite31946_indexWhereClauseMightChange")
external fun indexWhereClauseMightChange(pIdx: CValuesRef<Index>?, aXRef: CValuesRef<IntVar>?, chngRowid: Int): Int

@CCall("knifunptr_sqlite31947_execSql")
external fun execSql(db: CValuesRef<sqlite3>?, pzErrMsg: CValuesRef<CPointerVar<ByteVar>>?, @CCall.CString zSql: String?): Int

@CCall("knifunptr_sqlite31948_execSqlF")
external fun execSqlF(db: CValuesRef<sqlite3>?, pzErrMsg: CValuesRef<CPointerVar<ByteVar>>?, @CCall.CString zSql: String?, vararg variadicArguments: Any?): Int

@CCall("knifunptr_sqlite31949_createModule")
external fun createModule(db: CValuesRef<sqlite3>?, @CCall.CString zName: String?, pModule: CValuesRef<sqlite3_module>?, pAux: CValuesRef<*>?, xDestroy: CPointer<CFunction<(COpaquePointer?) -> Unit>>?): Int

@CCall("knifunptr_sqlite31950_vtabDisconnectAll")
external fun vtabDisconnectAll(db: CValuesRef<sqlite3>?, p: CValuesRef<Table>?): CPointer<VTable>?

@CCall("knifunptr_sqlite31951_addModuleArgument")
external fun addModuleArgument(db: CValuesRef<sqlite3>?, pTable: CValuesRef<Table>?, zArg: CValuesRef<ByteVar>?): Unit

@CCall("knifunptr_sqlite31952_addArgumentToVtab")
external fun addArgumentToVtab(pParse: CValuesRef<Parse>?): Unit

@CCall("knifunptr_sqlite31953_vtabCallConstructor")
external fun vtabCallConstructor(db: CValuesRef<sqlite3>?, pTab: CValuesRef<Table>?, pMod: CValuesRef<Module>?, xConstruct: CPointer<CFunction<(CPointer<sqlite3>?, COpaquePointer?, Int, CPointer<CPointerVar<ByteVar>>?, CPointer<CPointerVar<sqlite3_vtab>>?, CPointer<CPointerVar<ByteVar>>?) -> Int>>?, pzErr: CValuesRef<CPointerVar<ByteVar>>?): Int

@CCall("knifunptr_sqlite31954_growVTrans")
external fun growVTrans(db: CValuesRef<sqlite3>?): Int

@CCall("knifunptr_sqlite31955_addToVTrans")
external fun addToVTrans(db: CValuesRef<sqlite3>?, pVTab: CValuesRef<VTable>?): Unit

@CCall("knifunptr_sqlite31956_callFinaliser")
external fun callFinaliser(db: CValuesRef<sqlite3>?, offset: Int): Unit

@CCall("knifunptr_sqlite31957_sqlite3WhereGetMask")
external fun sqlite3WhereGetMask(arg0: CValuesRef<WhereMaskSet>?, arg1: Int): Bitmask

@CCall("knifunptr_sqlite31958_sqlite3WhereFindTerm")
external fun sqlite3WhereFindTerm(pWC: CValuesRef<WhereClause>?, iCur: Int, iColumn: Int, notReady: Bitmask, op: u32, pIdx: CValuesRef<Index>?): CPointer<WhereTerm>?

@CCall("knifunptr_sqlite31959_sqlite3WhereExplainOneScan")
external fun sqlite3WhereExplainOneScan(pParse: CValuesRef<Parse>?, pTabList: CValuesRef<SrcList>?, pLevel: CValuesRef<WhereLevel>?, wctrlFlags: u16): Int

@CCall("knifunptr_sqlite31960_sqlite3WhereCodeOneLoopStart")
external fun sqlite3WhereCodeOneLoopStart(pParse: CValuesRef<Parse>?, v: CValuesRef<Vdbe>?, pWInfo: CValuesRef<WhereInfo>?, iLevel: Int, pLevel: CValuesRef<WhereLevel>?, notReady: Bitmask): Bitmask

@CCall("knifunptr_sqlite31961_sqlite3WhereClauseInit")
external fun sqlite3WhereClauseInit(arg0: CValuesRef<WhereClause>?, arg1: CValuesRef<WhereInfo>?): Unit

@CCall("knifunptr_sqlite31962_sqlite3WhereClauseClear")
external fun sqlite3WhereClauseClear(arg0: CValuesRef<WhereClause>?): Unit

@CCall("knifunptr_sqlite31963_sqlite3WhereSplit")
external fun sqlite3WhereSplit(arg0: CValuesRef<WhereClause>?, arg1: CValuesRef<Expr>?, arg2: u8): Unit

@CCall("knifunptr_sqlite31964_sqlite3WhereExprUsage")
external fun sqlite3WhereExprUsage(arg0: CValuesRef<WhereMaskSet>?, arg1: CValuesRef<Expr>?): Bitmask

@CCall("knifunptr_sqlite31965_sqlite3WhereExprUsageNN")
external fun sqlite3WhereExprUsageNN(arg0: CValuesRef<WhereMaskSet>?, arg1: CValuesRef<Expr>?): Bitmask

@CCall("knifunptr_sqlite31966_sqlite3WhereExprListUsage")
external fun sqlite3WhereExprListUsage(arg0: CValuesRef<WhereMaskSet>?, arg1: CValuesRef<ExprList>?): Bitmask

@CCall("knifunptr_sqlite31967_sqlite3WhereExprAnalyze")
external fun sqlite3WhereExprAnalyze(arg0: CValuesRef<SrcList>?, arg1: CValuesRef<WhereClause>?): Unit

@CCall("knifunptr_sqlite31968_sqlite3WhereTabFuncArgs")
external fun sqlite3WhereTabFuncArgs(arg0: CValuesRef<Parse>?, arg1: CValuesRef<SrcList_item>?, arg2: CValuesRef<WhereClause>?): Unit

@CCall("knifunptr_sqlite31969_explainIndexColumnName")
external fun explainIndexColumnName(pIdx: CValuesRef<Index>?, i: Int): CPointer<ByteVar>?

@CCall("knifunptr_sqlite31970_explainAppendTerm")
external fun explainAppendTerm(pStr: CValuesRef<StrAccum>?, pIdx: CValuesRef<Index>?, nTerm: Int, iTerm: Int, bAnd: Int, @CCall.CString zOp: String?): Unit

@CCall("knifunptr_sqlite31971_explainIndexRange")
external fun explainIndexRange(pStr: CValuesRef<StrAccum>?, pLoop: CValuesRef<WhereLoop>?): Unit

@CCall("knifunptr_sqlite31972_disableTerm")
external fun disableTerm(pLevel: CValuesRef<WhereLevel>?, pTerm: CValuesRef<WhereTerm>?): Unit

@CCall("knifunptr_sqlite31973_codeApplyAffinity")
external fun codeApplyAffinity(pParse: CValuesRef<Parse>?, base: Int, n: Int, zAff: CValuesRef<ByteVar>?): Unit

@CCall("knifunptr_sqlite31974_updateRangeAffinityStr")
external fun updateRangeAffinityStr(pRight: CValuesRef<Expr>?, n: Int, zAff: CValuesRef<ByteVar>?): Unit

@CCall("knifunptr_sqlite31975_removeUnindexableInClauseTerms")
external fun removeUnindexableInClauseTerms(pParse: CValuesRef<Parse>?, iEq: Int, pLoop: CValuesRef<WhereLoop>?, pX: CValuesRef<Expr>?): CPointer<Expr>?

@CCall("knifunptr_sqlite31976_codeEqualityTerm")
external fun codeEqualityTerm(pParse: CValuesRef<Parse>?, pTerm: CValuesRef<WhereTerm>?, pLevel: CValuesRef<WhereLevel>?, iEq: Int, bRev: Int, iTarget: Int): Int

@CCall("knifunptr_sqlite31977_codeAllEqualityTerms")
external fun codeAllEqualityTerms(pParse: CValuesRef<Parse>?, pLevel: CValuesRef<WhereLevel>?, bRev: Int, nExtraReg: Int, pzAff: CValuesRef<CPointerVar<ByteVar>>?): Int

@CCall("knifunptr_sqlite31978_whereLikeOptimizationStringFixup")
external fun whereLikeOptimizationStringFixup(v: CValuesRef<Vdbe>?, pLevel: CValuesRef<WhereLevel>?, pTerm: CValuesRef<WhereTerm>?): Unit

@CCall("knifunptr_sqlite31979_codeDeferredSeek")
external fun codeDeferredSeek(pWInfo: CValuesRef<WhereInfo>?, pIdx: CValuesRef<Index>?, iCur: Int, iIdxCur: Int): Unit

@CCall("knifunptr_sqlite31980_codeExprOrVector")
external fun codeExprOrVector(pParse: CValuesRef<Parse>?, p: CValuesRef<Expr>?, iReg: Int, nReg: Int): Unit

@CCall("knifunptr_sqlite31981_whereIndexExprTransNode")
external fun whereIndexExprTransNode(p: CValuesRef<Walker>?, pExpr: CValuesRef<Expr>?): Int

@CCall("knifunptr_sqlite31982_whereIndexExprTrans")
external fun whereIndexExprTrans(pIdx: CValuesRef<Index>?, iTabCur: Int, iIdxCur: Int, pWInfo: CValuesRef<WhereInfo>?): Unit

@CCall("knifunptr_sqlite31983_exprAnalyze")
external fun exprAnalyze(arg0: CValuesRef<SrcList>?, arg1: CValuesRef<WhereClause>?, arg2: Int): Unit

@CCall("knifunptr_sqlite31984_whereOrInfoDelete")
external fun whereOrInfoDelete(db: CValuesRef<sqlite3>?, p: CValuesRef<WhereOrInfo>?): Unit

@CCall("knifunptr_sqlite31985_whereAndInfoDelete")
external fun whereAndInfoDelete(db: CValuesRef<sqlite3>?, p: CValuesRef<WhereAndInfo>?): Unit

@CCall("knifunptr_sqlite31986_whereClauseInsert")
external fun whereClauseInsert(pWC: CValuesRef<WhereClause>?, p: CValuesRef<Expr>?, wtFlags: u16): Int

@CCall("knifunptr_sqlite31987_allowedOp")
external fun allowedOp(op: Int): Int

@CCall("knifunptr_sqlite31988_exprCommute")
external fun exprCommute(pParse: CValuesRef<Parse>?, pExpr: CValuesRef<Expr>?): Unit

@CCall("knifunptr_sqlite31989_operatorMask")
external fun operatorMask(op: Int): u16

@CCall("knifunptr_sqlite31990_isLikeOrGlob")
external fun isLikeOrGlob(pParse: CValuesRef<Parse>?, pExpr: CValuesRef<Expr>?, ppPrefix: CValuesRef<CPointerVar<Expr>>?, pisComplete: CValuesRef<IntVar>?, pnoCase: CValuesRef<IntVar>?): Int

@CCall("knifunptr_sqlite31991_isAuxiliaryVtabOperator")
external fun isAuxiliaryVtabOperator(db: CValuesRef<sqlite3>?, pExpr: CValuesRef<Expr>?, peOp2: CValuesRef<UByteVar>?, ppLeft: CValuesRef<CPointerVar<Expr>>?, ppRight: CValuesRef<CPointerVar<Expr>>?): Int

@CCall("knifunptr_sqlite31992_transferJoinMarkings")
external fun transferJoinMarkings(pDerived: CValuesRef<Expr>?, pBase: CValuesRef<Expr>?): Unit

@CCall("knifunptr_sqlite31993_markTermAsChild")
external fun markTermAsChild(pWC: CValuesRef<WhereClause>?, iChild: Int, iParent: Int): Unit

@CCall("knifunptr_sqlite31994_whereNthSubterm")
external fun whereNthSubterm(pTerm: CValuesRef<WhereTerm>?, N: Int): CPointer<WhereTerm>?

@CCall("knifunptr_sqlite31995_whereCombineDisjuncts")
external fun whereCombineDisjuncts(pSrc: CValuesRef<SrcList>?, pWC: CValuesRef<WhereClause>?, pOne: CValuesRef<WhereTerm>?, pTwo: CValuesRef<WhereTerm>?): Unit

@CCall("knifunptr_sqlite31996_exprAnalyzeOrTerm")
external fun exprAnalyzeOrTerm(pSrc: CValuesRef<SrcList>?, pWC: CValuesRef<WhereClause>?, idxTerm: Int): Unit

@CCall("knifunptr_sqlite31997_termIsEquivalence")
external fun termIsEquivalence(pParse: CValuesRef<Parse>?, pExpr: CValuesRef<Expr>?): Int

@CCall("knifunptr_sqlite31998_exprSelectUsage")
external fun exprSelectUsage(pMaskSet: CValuesRef<WhereMaskSet>?, pS: CValuesRef<Select>?): Bitmask

@CCall("knifunptr_sqlite31999_exprMightBeIndexed2")
external fun exprMightBeIndexed2(pFrom: CValuesRef<SrcList>?, mPrereq: Bitmask, aiCurCol: CValuesRef<IntVar>?, pExpr: CValuesRef<Expr>?): Int

@CCall("knifunptr_sqlite32000_exprMightBeIndexed")
external fun exprMightBeIndexed(pFrom: CValuesRef<SrcList>?, mPrereq: Bitmask, aiCurCol: CValuesRef<IntVar>?, pExpr: CValuesRef<Expr>?, op: Int): Int

@CCall("knifunptr_sqlite32001_whereLoopResize")
external fun whereLoopResize(arg0: CValuesRef<sqlite3>?, arg1: CValuesRef<WhereLoop>?, arg2: Int): Int

@CCall("knifunptr_sqlite32002_whereOrMove")
external fun whereOrMove(pDest: CValuesRef<WhereOrSet>?, pSrc: CValuesRef<WhereOrSet>?): Unit

@CCall("knifunptr_sqlite32003_whereOrInsert")
external fun whereOrInsert(pSet: CValuesRef<WhereOrSet>?, prereq: Bitmask, rRun: LogEst, nOut: LogEst): Int

@CCall("knifunptr_sqlite32004_createMask")
external fun createMask(pMaskSet: CValuesRef<WhereMaskSet>?, iCursor: Int): Unit

@CCall("knifunptr_sqlite32005_whereScanNext")
external fun whereScanNext(pScan: CValuesRef<WhereScan>?): CPointer<WhereTerm>?

@CCall("knifunptr_sqlite32006_whereScanInitIndexExpr")
external fun whereScanInitIndexExpr(pScan: CValuesRef<WhereScan>?): CPointer<WhereTerm>?

@CCall("knifunptr_sqlite32007_whereScanInit")
external fun whereScanInit(pScan: CValuesRef<WhereScan>?, pWC: CValuesRef<WhereClause>?, iCur: Int, iColumn: Int, opMask: u32, pIdx: CValuesRef<Index>?): CPointer<WhereTerm>?

@CCall("knifunptr_sqlite32008_findIndexCol")
external fun findIndexCol(pParse: CValuesRef<Parse>?, pList: CValuesRef<ExprList>?, iBase: Int, pIdx: CValuesRef<Index>?, iCol: Int): Int

@CCall("knifunptr_sqlite32009_indexColumnNotNull")
external fun indexColumnNotNull(pIdx: CValuesRef<Index>?, iCol: Int): Int

@CCall("knifunptr_sqlite32010_isDistinctRedundant")
external fun isDistinctRedundant(pParse: CValuesRef<Parse>?, pTabList: CValuesRef<SrcList>?, pWC: CValuesRef<WhereClause>?, pDistinct: CValuesRef<ExprList>?): Int

@CCall("knifunptr_sqlite32011_estLog")
external fun estLog(N: LogEst): LogEst

@CCall("knifunptr_sqlite32012_translateColumnToCopy")
external fun translateColumnToCopy(pParse: CValuesRef<Parse>?, iStart: Int, iTabCur: Int, iRegister: Int, bIncrRowid: Int): Unit

@CCall("knifunptr_sqlite32013_termCanDriveIndex")
external fun termCanDriveIndex(pTerm: CValuesRef<WhereTerm>?, pSrc: CValuesRef<SrcList_item>?, notReady: Bitmask): Int

@CCall("knifunptr_sqlite32014_constructAutomaticIndex")
external fun constructAutomaticIndex(pParse: CValuesRef<Parse>?, pWC: CValuesRef<WhereClause>?, pSrc: CValuesRef<SrcList_item>?, notReady: Bitmask, pLevel: CValuesRef<WhereLevel>?): Unit

@CCall("knifunptr_sqlite32015_allocateIndexInfo")
external fun allocateIndexInfo(pParse: CValuesRef<Parse>?, pWC: CValuesRef<WhereClause>?, mUnusable: Bitmask, pSrc: CValuesRef<SrcList_item>?, pOrderBy: CValuesRef<ExprList>?, pmNoOmit: CValuesRef<u16Var>?): CPointer<sqlite3_index_info>?

@CCall("knifunptr_sqlite32016_vtabBestIndex")
external fun vtabBestIndex(pParse: CValuesRef<Parse>?, pTab: CValuesRef<Table>?, p: CValuesRef<sqlite3_index_info>?): Int

@CCall("knifunptr_sqlite32017_whereRangeAdjust")
external fun whereRangeAdjust(pTerm: CValuesRef<WhereTerm>?, nNew: LogEst): LogEst

@CCall("knifunptr_sqlite32018_whereRangeScanEst")
external fun whereRangeScanEst(pParse: CValuesRef<Parse>?, pBuilder: CValuesRef<WhereLoopBuilder>?, pLower: CValuesRef<WhereTerm>?, pUpper: CValuesRef<WhereTerm>?, pLoop: CValuesRef<WhereLoop>?): Int

@CCall("knifunptr_sqlite32019_whereLoopInit")
external fun whereLoopInit(p: CValuesRef<WhereLoop>?): Unit

@CCall("knifunptr_sqlite32020_whereLoopClearUnion")
external fun whereLoopClearUnion(db: CValuesRef<sqlite3>?, p: CValuesRef<WhereLoop>?): Unit

@CCall("knifunptr_sqlite32021_whereLoopClear")
external fun whereLoopClear(db: CValuesRef<sqlite3>?, p: CValuesRef<WhereLoop>?): Unit

@CCall("knifunptr_sqlite32022_whereLoopXfer")
external fun whereLoopXfer(db: CValuesRef<sqlite3>?, pTo: CValuesRef<WhereLoop>?, pFrom: CValuesRef<WhereLoop>?): Int

@CCall("knifunptr_sqlite32023_whereLoopDelete")
external fun whereLoopDelete(db: CValuesRef<sqlite3>?, p: CValuesRef<WhereLoop>?): Unit

@CCall("knifunptr_sqlite32024_whereInfoFree")
external fun whereInfoFree(db: CValuesRef<sqlite3>?, pWInfo: CValuesRef<WhereInfo>?): Unit

@CCall("knifunptr_sqlite32025_whereLoopCheaperProperSubset")
external fun whereLoopCheaperProperSubset(pX: CValuesRef<WhereLoop>?, pY: CValuesRef<WhereLoop>?): Int

@CCall("knifunptr_sqlite32026_whereLoopAdjustCost")
external fun whereLoopAdjustCost(p: CValuesRef<WhereLoop>?, pTemplate: CValuesRef<WhereLoop>?): Unit

@CCall("knifunptr_sqlite32027_whereLoopFindLesser")
external fun whereLoopFindLesser(ppPrev: CValuesRef<CPointerVar<WhereLoop>>?, pTemplate: CValuesRef<WhereLoop>?): CPointer<CPointerVar<WhereLoop>>?

@CCall("knifunptr_sqlite32028_whereLoopInsert")
external fun whereLoopInsert(pBuilder: CValuesRef<WhereLoopBuilder>?, pTemplate: CValuesRef<WhereLoop>?): Int

@CCall("knifunptr_sqlite32029_whereLoopOutputAdjust")
external fun whereLoopOutputAdjust(pWC: CValuesRef<WhereClause>?, pLoop: CValuesRef<WhereLoop>?, nRow: LogEst): Unit

@CCall("knifunptr_sqlite32030_whereRangeVectorLen")
external fun whereRangeVectorLen(pParse: CValuesRef<Parse>?, iCur: Int, pIdx: CValuesRef<Index>?, nEq: Int, pTerm: CValuesRef<WhereTerm>?): Int

@CCall("knifunptr_sqlite32031_whereLoopAddBtreeIndex")
external fun whereLoopAddBtreeIndex(pBuilder: CValuesRef<WhereLoopBuilder>?, pSrc: CValuesRef<SrcList_item>?, pProbe: CValuesRef<Index>?, nInMul: LogEst): Int

@CCall("knifunptr_sqlite32032_indexMightHelpWithOrderBy")
external fun indexMightHelpWithOrderBy(pBuilder: CValuesRef<WhereLoopBuilder>?, pIndex: CValuesRef<Index>?, iCursor: Int): Int

@CCall("knifunptr_sqlite32033_whereUsablePartialIndex")
external fun whereUsablePartialIndex(iTab: Int, pWC: CValuesRef<WhereClause>?, pWhere: CValuesRef<Expr>?): Int

@CCall("knifunptr_sqlite32034_whereLoopAddBtree")
external fun whereLoopAddBtree(pBuilder: CValuesRef<WhereLoopBuilder>?, mPrereq: Bitmask): Int

@CCall("knifunptr_sqlite32035_whereLoopAddVirtualOne")
external fun whereLoopAddVirtualOne(pBuilder: CValuesRef<WhereLoopBuilder>?, mPrereq: Bitmask, mUsable: Bitmask, mExclude: u16, pIdxInfo: CValuesRef<sqlite3_index_info>?, mNoOmit: u16, pbIn: CValuesRef<IntVar>?): Int

@CCall("knifunptr_sqlite32036_whereLoopAddVirtual")
external fun whereLoopAddVirtual(pBuilder: CValuesRef<WhereLoopBuilder>?, mPrereq: Bitmask, mUnusable: Bitmask): Int

@CCall("knifunptr_sqlite32037_whereLoopAddOr")
external fun whereLoopAddOr(pBuilder: CValuesRef<WhereLoopBuilder>?, mPrereq: Bitmask, mUnusable: Bitmask): Int

@CCall("knifunptr_sqlite32038_whereLoopAddAll")
external fun whereLoopAddAll(pBuilder: CValuesRef<WhereLoopBuilder>?): Int

@CCall("knifunptr_sqlite32039_wherePathSatisfiesOrderBy")
external fun wherePathSatisfiesOrderBy(pWInfo: CValuesRef<WhereInfo>?, pOrderBy: CValuesRef<ExprList>?, pPath: CValuesRef<WherePath>?, wctrlFlags: u16, nLoop: u16, pLast: CValuesRef<WhereLoop>?, pRevMask: CValuesRef<BitmaskVar>?): i8

@CCall("knifunptr_sqlite32040_whereSortingCost")
external fun whereSortingCost(pWInfo: CValuesRef<WhereInfo>?, nRow: LogEst, nOrderBy: Int, nSorted: Int): LogEst

@CCall("knifunptr_sqlite32041_wherePathSolver")
external fun wherePathSolver(pWInfo: CValuesRef<WhereInfo>?, nRowEst: LogEst): Int

@CCall("knifunptr_sqlite32042_whereShortCut")
external fun whereShortCut(pBuilder: CValuesRef<WhereLoopBuilder>?): Int

@CCall("knifunptr_sqlite32043_exprNodeIsDeterministic")
external fun exprNodeIsDeterministic(pWalker: CValuesRef<Walker>?, pExpr: CValuesRef<Expr>?): Int

@CCall("knifunptr_sqlite32044_exprIsDeterministic")
external fun exprIsDeterministic(p: CValuesRef<Expr>?): Int

@CCall("knifunptr_sqlite32045_row_numberStepFunc")
external fun row_numberStepFunc(pCtx: CValuesRef<sqlite3_context>?, nArg: Int, apArg: CValuesRef<CPointerVar<sqlite3_value>>?): Unit

@CCall("knifunptr_sqlite32046_row_numberValueFunc")
external fun row_numberValueFunc(pCtx: CValuesRef<sqlite3_context>?): Unit

@CCall("knifunptr_sqlite32047_dense_rankStepFunc")
external fun dense_rankStepFunc(pCtx: CValuesRef<sqlite3_context>?, nArg: Int, apArg: CValuesRef<CPointerVar<sqlite3_value>>?): Unit

@CCall("knifunptr_sqlite32048_dense_rankValueFunc")
external fun dense_rankValueFunc(pCtx: CValuesRef<sqlite3_context>?): Unit

@CCall("knifunptr_sqlite32049_rankStepFunc")
external fun rankStepFunc(pCtx: CValuesRef<sqlite3_context>?, nArg: Int, apArg: CValuesRef<CPointerVar<sqlite3_value>>?): Unit

@CCall("knifunptr_sqlite32050_rankValueFunc")
external fun rankValueFunc(pCtx: CValuesRef<sqlite3_context>?): Unit

@CCall("knifunptr_sqlite32051_percent_rankStepFunc")
external fun percent_rankStepFunc(pCtx: CValuesRef<sqlite3_context>?, nArg: Int, apArg: CValuesRef<CPointerVar<sqlite3_value>>?): Unit

@CCall("knifunptr_sqlite32052_percent_rankValueFunc")
external fun percent_rankValueFunc(pCtx: CValuesRef<sqlite3_context>?): Unit

@CCall("knifunptr_sqlite32053_cume_distStepFunc")
external fun cume_distStepFunc(pCtx: CValuesRef<sqlite3_context>?, nArg: Int, apArg: CValuesRef<CPointerVar<sqlite3_value>>?): Unit

@CCall("knifunptr_sqlite32054_cume_distValueFunc")
external fun cume_distValueFunc(pCtx: CValuesRef<sqlite3_context>?): Unit

@CCall("knifunptr_sqlite32055_ntileStepFunc")
external fun ntileStepFunc(pCtx: CValuesRef<sqlite3_context>?, nArg: Int, apArg: CValuesRef<CPointerVar<sqlite3_value>>?): Unit

@CCall("knifunptr_sqlite32056_ntileValueFunc")
external fun ntileValueFunc(pCtx: CValuesRef<sqlite3_context>?): Unit

@CCall("knifunptr_sqlite32057_last_valueStepFunc")
external fun last_valueStepFunc(pCtx: CValuesRef<sqlite3_context>?, nArg: Int, apArg: CValuesRef<CPointerVar<sqlite3_value>>?): Unit

@CCall("knifunptr_sqlite32058_last_valueInvFunc")
external fun last_valueInvFunc(pCtx: CValuesRef<sqlite3_context>?, nArg: Int, apArg: CValuesRef<CPointerVar<sqlite3_value>>?): Unit

@CCall("knifunptr_sqlite32059_last_valueValueFunc")
external fun last_valueValueFunc(pCtx: CValuesRef<sqlite3_context>?): Unit

@CCall("knifunptr_sqlite32060_last_valueFinalizeFunc")
external fun last_valueFinalizeFunc(pCtx: CValuesRef<sqlite3_context>?): Unit

@CCall("knifunptr_sqlite32061_noopStepFunc")
external fun noopStepFunc(p: CValuesRef<sqlite3_context>?, n: Int, a: CValuesRef<CPointerVar<sqlite3_value>>?): Unit

@CCall("knifunptr_sqlite32062_noopValueFunc")
external fun noopValueFunc(p: CValuesRef<sqlite3_context>?): Unit

@CCall("knifunptr_sqlite32063_selectWindowRewriteExprCb")
external fun selectWindowRewriteExprCb(pWalker: CValuesRef<Walker>?, pExpr: CValuesRef<Expr>?): Int

@CCall("knifunptr_sqlite32064_selectWindowRewriteSelectCb")
external fun selectWindowRewriteSelectCb(pWalker: CValuesRef<Walker>?, pSelect: CValuesRef<Select>?): Int

@CCall("knifunptr_sqlite32065_selectWindowRewriteEList")
external fun selectWindowRewriteEList(pParse: CValuesRef<Parse>?, pWin: CValuesRef<Window>?, pSrc: CValuesRef<SrcList>?, pEList: CValuesRef<ExprList>?, ppSub: CValuesRef<CPointerVar<ExprList>>?): Unit

@CCall("knifunptr_sqlite32066_exprListAppendList")
external fun exprListAppendList(pParse: CValuesRef<Parse>?, pList: CValuesRef<ExprList>?, pAppend: CValuesRef<ExprList>?): CPointer<ExprList>?

@CCall("knifunptr_sqlite32067_sqlite3WindowOffsetExpr")
external fun sqlite3WindowOffsetExpr(pParse: CValuesRef<Parse>?, pExpr: CValuesRef<Expr>?): CPointer<Expr>?

@CCall("knifunptr_sqlite32068_windowCheckIntValue")
external fun windowCheckIntValue(pParse: CValuesRef<Parse>?, reg: Int, eCond: Int): Unit

@CCall("knifunptr_sqlite32069_windowArgCount")
external fun windowArgCount(pWin: CValuesRef<Window>?): Int

@CCall("knifunptr_sqlite32070_windowAggStep")
external fun windowAggStep(pParse: CValuesRef<Parse>?, pMWin: CValuesRef<Window>?, csr: Int, bInverse: Int, reg: Int, regPartSize: Int): Unit

@CCall("knifunptr_sqlite32071_windowAggFinal")
external fun windowAggFinal(pParse: CValuesRef<Parse>?, pMWin: CValuesRef<Window>?, bFinal: Int): Unit

@CCall("knifunptr_sqlite32072_windowPartitionCache")
external fun windowPartitionCache(pParse: CValuesRef<Parse>?, p: CValuesRef<Select>?, pWInfo: CValuesRef<WhereInfo>?, regFlushPart: Int, lblFlushPart: Int, pRegSize: CValuesRef<IntVar>?): Unit

@CCall("knifunptr_sqlite32073_windowReturnOneRow")
external fun windowReturnOneRow(pParse: CValuesRef<Parse>?, pMWin: CValuesRef<Window>?, regGosub: Int, addrGosub: Int): Unit

@CCall("knifunptr_sqlite32074_windowReturnRows")
external fun windowReturnRows(pParse: CValuesRef<Parse>?, pMWin: CValuesRef<Window>?, regCtr: Int, regGosub: Int, addrGosub: Int, regInvArg: Int, regInvSize: Int): Unit

@CCall("knifunptr_sqlite32075_windowInitAccum")
external fun windowInitAccum(pParse: CValuesRef<Parse>?, pMWin: CValuesRef<Window>?): Int

@CCall("knifunptr_sqlite32076_windowCodeRowExprStep")
external fun windowCodeRowExprStep(pParse: CValuesRef<Parse>?, p: CValuesRef<Select>?, pWInfo: CValuesRef<WhereInfo>?, regGosub: Int, addrGosub: Int): Unit

@CCall("knifunptr_sqlite32077_windowCodeCacheStep")
external fun windowCodeCacheStep(pParse: CValuesRef<Parse>?, p: CValuesRef<Select>?, pWInfo: CValuesRef<WhereInfo>?, regGosub: Int, addrGosub: Int): Unit

@CCall("knifunptr_sqlite32078_windowCodeDefaultStep")
external fun windowCodeDefaultStep(pParse: CValuesRef<Parse>?, p: CValuesRef<Select>?, pWInfo: CValuesRef<WhereInfo>?, regGosub: Int, addrGosub: Int): Unit

@CCall("knifunptr_sqlite32079_disableLookaside")
external fun disableLookaside(pParse: CValuesRef<Parse>?): Unit

@CCall("knifunptr_sqlite32080_parserDoubleLinkSelect")
external fun parserDoubleLinkSelect(pParse: CValuesRef<Parse>?, p: CValuesRef<Select>?): Unit

@CCall("knifunptr_sqlite32081_tokenExpr")
external fun tokenExpr(pParse: CValuesRef<Parse>?, op: Int, t: CValue<Token>): CPointer<Expr>?

@CCall("knifunptr_sqlite32082_binaryToUnaryIfNull")
external fun binaryToUnaryIfNull(pParse: CValuesRef<Parse>?, pY: CValuesRef<Expr>?, pA: CValuesRef<Expr>?, op: Int): Unit

@CCall("knifunptr_sqlite32083_parserAddExprIdListTerm")
external fun parserAddExprIdListTerm(pParse: CValuesRef<Parse>?, pPrior: CValuesRef<ExprList>?, pIdToken: CValuesRef<Token>?, hasCollate: Int, sortOrder: Int): CPointer<ExprList>?

@CCall("knifunptr_sqlite32084_sqlite3ParserInit")
external fun sqlite3ParserInit(yypRawParser: CValuesRef<*>?, pParse: CValuesRef<Parse>?): Unit

@CCall("knifunptr_sqlite32085_yy_destructor")
external fun yy_destructor(yypParser: CValuesRef<yyParser>?, yymajor: UShort, yypminor: CValuesRef<YYMINORTYPE>?): Unit

@CCall("knifunptr_sqlite32086_yy_pop_parser_stack")
external fun yy_pop_parser_stack(pParser: CValuesRef<yyParser>?): Unit

@CCall("knifunptr_sqlite32087_sqlite3ParserFinalize")
external fun sqlite3ParserFinalize(p: CValuesRef<*>?): Unit

@CCall("knifunptr_sqlite32088_yy_find_shift_action")
external fun yy_find_shift_action(iLookAhead: UShort, stateno: UShort): UShort

@CCall("knifunptr_sqlite32089_yy_find_reduce_action")
external fun yy_find_reduce_action(stateno: UShort, iLookAhead: UShort): UShort

@CCall("knifunptr_sqlite32090_yyStackOverflow")
external fun yyStackOverflow(yypParser: CValuesRef<yyParser>?): Unit

@CCall("knifunptr_sqlite32091_yy_shift")
external fun yy_shift(yypParser: CValuesRef<yyParser>?, yyNewState: UShort, yyMajor: UShort, yyMinor: CValue<Token>): Unit

@CCall("knifunptr_sqlite32092_yy_accept")
external fun yy_accept(arg0: CValuesRef<yyParser>?): Unit

@CCall("knifunptr_sqlite32093_yy_reduce")
external fun yy_reduce(yypParser: CValuesRef<yyParser>?, yyruleno: UInt, yyLookahead: Int, yyLookaheadToken: CValue<Token>, pParse: CValuesRef<Parse>?): UShort

@CCall("knifunptr_sqlite32094_yy_syntax_error")
external fun yy_syntax_error(yypParser: CValuesRef<yyParser>?, yymajor: Int, yyminor: CValue<Token>): Unit

@CCall("knifunptr_sqlite32095_keywordCode")
external fun keywordCode(@CCall.CString z: String?, n: Int, pType: CValuesRef<IntVar>?): Int

@CCall("knifunptr_sqlite32096_getToken")
external fun getToken(pz: CValuesRef<CPointerVar<UByteVar>>?): Int

@CCall("knifunptr_sqlite32097_analyzeWindowKeyword")
external fun analyzeWindowKeyword(z: CValuesRef<UByteVar>?): Int

@CCall("knifunptr_sqlite32098_analyzeOverKeyword")
external fun analyzeOverKeyword(z: CValuesRef<UByteVar>?, lastToken: Int): Int

@CCall("knifunptr_sqlite32099_analyzeFilterKeyword")
external fun analyzeFilterKeyword(z: CValuesRef<UByteVar>?, lastToken: Int): Int

@CCall("knifunptr_sqlite32100_setupLookaside")
external fun setupLookaside(db: CValuesRef<sqlite3>?, pBuf: CValuesRef<*>?, sz: Int, cnt: Int): Int

@CCall("knifunptr_sqlite32101_allSpaces")
external fun allSpaces(@CCall.CString z: String?, n: Int): Int

@CCall("knifunptr_sqlite32102_binCollFunc")
external fun binCollFunc(padFlag: CValuesRef<*>?, nKey1: Int, pKey1: CValuesRef<*>?, nKey2: Int, pKey2: CValuesRef<*>?): Int

@CCall("knifunptr_sqlite32103_nocaseCollatingFunc")
external fun nocaseCollatingFunc(NotUsed: CValuesRef<*>?, nKey1: Int, pKey1: CValuesRef<*>?, nKey2: Int, pKey2: CValuesRef<*>?): Int

@CCall("knifunptr_sqlite32104_functionDestroy")
external fun functionDestroy(db: CValuesRef<sqlite3>?, p: CValuesRef<FuncDef>?): Unit

@CCall("knifunptr_sqlite32105_disconnectAllVtab")
external fun disconnectAllVtab(db: CValuesRef<sqlite3>?): Unit

@CCall("knifunptr_sqlite32106_connectionIsBusy")
external fun connectionIsBusy(db: CValuesRef<sqlite3>?): Int

@CCall("knifunptr_sqlite32107_sqlite3Close")
external fun sqlite3Close(db: CValuesRef<sqlite3>?, forceZombie: Int): Int

@CCall("knifunptr_sqlite32108_sqliteDefaultBusyCallback")
external fun sqliteDefaultBusyCallback(ptr: CValuesRef<*>?, count: Int, pFile: CValuesRef<sqlite3_file>?): Int

@CCall("knifunptr_sqlite32109_createFunctionApi")
external fun createFunctionApi(db: CValuesRef<sqlite3>?, @CCall.CString zFunc: String?, nArg: Int, enc: Int, p: CValuesRef<*>?, xSFunc: CPointer<CFunction<(CPointer<sqlite3_context>?, Int, CPointer<CPointerVar<sqlite3_value>>?) -> Unit>>?, xStep: CPointer<CFunction<(CPointer<sqlite3_context>?, Int, CPointer<CPointerVar<sqlite3_value>>?) -> Unit>>?, xFinal: CPointer<CFunction<(CPointer<sqlite3_context>?) -> Unit>>?, xValue: CPointer<CFunction<(CPointer<sqlite3_context>?) -> Unit>>?, xInverse: CPointer<CFunction<(CPointer<sqlite3_context>?, Int, CPointer<CPointerVar<sqlite3_value>>?) -> Unit>>?, xDestroy: CPointer<CFunction<(COpaquePointer?) -> Unit>>?): Int

@CCall("knifunptr_sqlite32110_sqlite3InvalidFunction")
external fun sqlite3InvalidFunction(context: CValuesRef<sqlite3_context>?, NotUsed: Int, NotUsed2: CValuesRef<CPointerVar<sqlite3_value>>?): Unit

@CCall("knifunptr_sqlite32111_createCollation")
external fun createCollation(db: CValuesRef<sqlite3>?, @CCall.CString zName: String?, enc: u8, pCtx: CValuesRef<*>?, xCompare: CPointer<CFunction<(COpaquePointer?, Int, COpaquePointer?, Int, COpaquePointer?) -> Int>>?, xDel: CPointer<CFunction<(COpaquePointer?) -> Unit>>?): Int

@CCall("knifunptr_sqlite32112_openDatabase")
external fun openDatabase(@CCall.CString zFilename: String?, ppDb: CValuesRef<CPointerVar<sqlite3>>?, flags: UInt, @CCall.CString zVfs: String?): Int

val sqlite3azCompileOpt: CArrayPointer<CPointerVar<ByteVar>>
    get() = interpretCPointer<CPointerVar<ByteVar>>(kniBridge0())!!

val sqlite3_version: CArrayPointer<ByteVar>
    get() = interpretCPointer<ByteVar>(kniBridge1())!!

var sqlite3_temp_directory: CPointer<ByteVar>?
    get() = interpretCPointer<ByteVar>(kniBridge2())
    set(value) { kniBridge3(value.rawValue) }

var sqlite3_data_directory: CPointer<ByteVar>?
    get() = interpretCPointer<ByteVar>(kniBridge4())
    set(value) { kniBridge5(value.rawValue) }

val sqlite3UpperToLower: CArrayPointer<UByteVar>
    get() = interpretCPointer<UByteVar>(kniBridge6())!!

val sqlite3CtypeMap: CArrayPointer<UByteVar>
    get() = interpretCPointer<UByteVar>(kniBridge7())!!

val sqlite3Config: Sqlite3Config
    get() = interpretPointed<Sqlite3Config>(kniBridge8())

val sqlite3BuiltinFunctions: FuncDefHash
    get() = interpretPointed<FuncDefHash>(kniBridge9())

val sqlite3IntTokens: CArrayPointer<Token>
    get() = interpretCPointer<Token>(kniBridge10())!!

var sqlite3PendingByte: Int
    get() = kniBridge11()
    set(value) { kniBridge12(value) }

val sqlite3OpcodeProperty: CArrayPointer<UByteVar>
    get() = interpretCPointer<UByteVar>(kniBridge13())!!

val sqlite3StrBINARY: CArrayPointer<ByteVar>
    get() = interpretCPointer<ByteVar>(kniBridge14())!!

val sqlite3Stat: sqlite3StatType
    get() = interpretPointed<sqlite3StatType>(kniBridge15())

val statMutex: CArrayPointer<ByteVar>
    get() = interpretCPointer<ByteVar>(kniBridge16())!!

val aXformType: CArrayPointer<anonymousStruct22>
    get() = interpretCPointer<anonymousStruct22>(kniBridge17())!!

var vfsList: CPointer<sqlite3_vfs>?
    get() = interpretCPointer<sqlite3_vfs>(kniBridge18())
    set(value) { kniBridge19(value.rawValue) }

val sqlite3Hooks: BenignMallocHooks
    get() = interpretPointed<BenignMallocHooks>(kniBridge20())

val winMutex_staticMutexes: CArrayPointer<sqlite3_mutex>
    get() = interpretCPointer<sqlite3_mutex>(kniBridge21())!!

var winMutex_isInit: Int
    get() = kniBridge22()
    set(value) { kniBridge23(value) }

var winMutex_isNt: Int
    get() = kniBridge24()
    set(value) { kniBridge25(value) }

var winMutex_lock: LONG
    get() = kniBridge26()
    set(value) { kniBridge27(value) }

val mem0: Mem0Global
    get() = interpretPointed<Mem0Global>(kniBridge28())

val aDigits: CArrayPointer<ByteVar>
    get() = interpretCPointer<ByteVar>(kniBridge29())!!

val aPrefix: CArrayPointer<ByteVar>
    get() = interpretCPointer<ByteVar>(kniBridge30())!!

val fmtinfo: CArrayPointer<et_info>
    get() = interpretCPointer<et_info>(kniBridge31())!!

val sqlite3OomStr: sqlite3_str
    get() = interpretPointed<sqlite3_str>(kniBridge32())

val sqlite3Prng: sqlite3PrngType
    get() = interpretPointed<sqlite3PrngType>(kniBridge33())

val sqlite3SavedPrng: sqlite3PrngType
    get() = interpretPointed<sqlite3PrngType>(kniBridge34())

val sqlite3Utf8Trans1: CArrayPointer<UByteVar>
    get() = interpretCPointer<UByteVar>(kniBridge35())!!

var sqlite3_os_type: LONG
    get() = kniBridge36()
    set(value) { kniBridge37(value) }

val aSyscall: CArrayPointer<win_syscall>
    get() = interpretCPointer<win_syscall>(kniBridge38())!!

var winIoerrRetry: Int
    get() = kniBridge39()
    set(value) { kniBridge40(value) }

var winIoerrRetryDelay: Int
    get() = kniBridge41()
    set(value) { kniBridge42(value) }

val winSysInfo: SYSTEM_INFO
    get() = interpretPointed<SYSTEM_INFO>(kniBridge43())

var winBigLock: CPointer<sqlite3_mutex>?
    get() = interpretCPointer<sqlite3_mutex>(kniBridge44())
    set(value) { kniBridge45(value.rawValue) }

var winShmNodeList: CPointer<winShmNode>?
    get() = interpretCPointer<winShmNode>(kniBridge46())
    set(value) { kniBridge47(value.rawValue) }

val winIoMethod: sqlite3_io_methods
    get() = interpretPointed<sqlite3_io_methods>(kniBridge48())

val winIoNolockMethod: sqlite3_io_methods
    get() = interpretPointed<sqlite3_io_methods>(kniBridge49())

val winAppData: winVfsAppData
    get() = interpretPointed<winVfsAppData>(kniBridge50())

val winNolockAppData: winVfsAppData
    get() = interpretPointed<winVfsAppData>(kniBridge51())

val pcache1_g: PCacheGlobal
    get() = interpretPointed<PCacheGlobal>(kniBridge52())

val aJournalMagic: CArrayPointer<UByteVar>
    get() = interpretCPointer<UByteVar>(kniBridge53())!!

val zMagicHeader: CArrayPointer<ByteVar>
    get() = interpretCPointer<ByteVar>(kniBridge54())!!

var sqlite3SharedCacheList: CPointer<BtShared>?
    get() = interpretCPointer<BtShared>(kniBridge55())
    set(value) { kniBridge56(value.rawValue) }

val sqlite3SmallTypeSizes: CArrayPointer<u8Var>
    get() = interpretCPointer<u8Var>(kniBridge57())!!

val MemJournalMethods: sqlite3_io_methods
    get() = interpretPointed<sqlite3_io_methods>(kniBridge58())

val statInitFuncdef: FuncDef
    get() = interpretPointed<FuncDef>(kniBridge59())

val statPushFuncdef: FuncDef
    get() = interpretPointed<FuncDef>(kniBridge60())

val statGetFuncdef: FuncDef
    get() = interpretPointed<FuncDef>(kniBridge61())

val globInfo: compareInfo
    get() = interpretPointed<compareInfo>(kniBridge62())

val likeInfoNorm: compareInfo
    get() = interpretPointed<compareInfo>(kniBridge63())

val likeInfoAlt: compareInfo
    get() = interpretPointed<compareInfo>(kniBridge64())

val hexdigits: CArrayPointer<ByteVar>
    get() = interpretCPointer<ByteVar>(kniBridge65())!!

val sqlite3Apis: sqlite3_api_routines
    get() = interpretPointed<sqlite3_api_routines>(kniBridge66())

val sqlite3Autoext: sqlite3AutoExtList
    get() = interpretPointed<sqlite3AutoExtList>(kniBridge67())

val pragCName: CArrayPointer<CPointerVar<ByteVar>>
    get() = interpretCPointer<CPointerVar<ByteVar>>(kniBridge68())!!

val aPragmaName: CArrayPointer<PragmaName>
    get() = interpretCPointer<PragmaName>(kniBridge69())!!

val pragmaVtabModule: sqlite3_module
    get() = interpretPointed<sqlite3_module>(kniBridge70())

val row_numberName: CArrayPointer<ByteVar>
    get() = interpretCPointer<ByteVar>(kniBridge71())!!

val dense_rankName: CArrayPointer<ByteVar>
    get() = interpretCPointer<ByteVar>(kniBridge72())!!

val rankName: CArrayPointer<ByteVar>
    get() = interpretCPointer<ByteVar>(kniBridge73())!!

val percent_rankName: CArrayPointer<ByteVar>
    get() = interpretCPointer<ByteVar>(kniBridge74())!!

val cume_distName: CArrayPointer<ByteVar>
    get() = interpretCPointer<ByteVar>(kniBridge75())!!

val ntileName: CArrayPointer<ByteVar>
    get() = interpretCPointer<ByteVar>(kniBridge76())!!

val last_valueName: CArrayPointer<ByteVar>
    get() = interpretCPointer<ByteVar>(kniBridge77())!!

val nth_valueName: CArrayPointer<ByteVar>
    get() = interpretCPointer<ByteVar>(kniBridge78())!!

val first_valueName: CArrayPointer<ByteVar>
    get() = interpretCPointer<ByteVar>(kniBridge79())!!

val leadName: CArrayPointer<ByteVar>
    get() = interpretCPointer<ByteVar>(kniBridge80())!!

val lagName: CArrayPointer<ByteVar>
    get() = interpretCPointer<ByteVar>(kniBridge81())!!

val yy_action: CArrayPointer<UShortVar>
    get() = interpretCPointer<UShortVar>(kniBridge82())!!

val yy_lookahead: CArrayPointer<UShortVar>
    get() = interpretCPointer<UShortVar>(kniBridge83())!!

val yy_shift_ofst: CArrayPointer<UShortVar>
    get() = interpretCPointer<UShortVar>(kniBridge84())!!

val yy_reduce_ofst: CArrayPointer<ShortVar>
    get() = interpretCPointer<ShortVar>(kniBridge85())!!

val yy_default: CArrayPointer<UShortVar>
    get() = interpretCPointer<UShortVar>(kniBridge86())!!

val yyFallback: CArrayPointer<UShortVar>
    get() = interpretCPointer<UShortVar>(kniBridge87())!!

val yyRuleInfoLhs: CArrayPointer<UShortVar>
    get() = interpretCPointer<UShortVar>(kniBridge88())!!

val yyRuleInfoNRhs: CArrayPointer<ByteVar>
    get() = interpretCPointer<ByteVar>(kniBridge89())!!

val aiClass: CArrayPointer<UByteVar>
    get() = interpretCPointer<UByteVar>(kniBridge90())!!

val zKWText: CArrayPointer<ByteVar>
    get() = interpretCPointer<ByteVar>(kniBridge91())!!

val aKWHash: CArrayPointer<UByteVar>
    get() = interpretCPointer<UByteVar>(kniBridge92())!!

val aKWNext: CArrayPointer<UByteVar>
    get() = interpretCPointer<UByteVar>(kniBridge93())!!

val aKWLen: CArrayPointer<UByteVar>
    get() = interpretCPointer<UByteVar>(kniBridge94())!!

val aKWOffset: CArrayPointer<UShortVar>
    get() = interpretCPointer<UShortVar>(kniBridge95())!!

val aKWCode: CArrayPointer<UByteVar>
    get() = interpretCPointer<UByteVar>(kniBridge96())!!

val aHardLimit: CArrayPointer<IntVar>
    get() = interpretCPointer<IntVar>(kniBridge97())!!

const val SQLITE_CORE: Int = 1

const val SQLITE_AMALGAMATION: Int = 1

const val OS_VXWORKS: Int = 0

const val HAVE_FCHOWN: Int = 1

const val HAVE_READLINK: Int = 1

const val HAVE_LSTAT: Int = 1

const val _LARGE_FILE: Int = 1

const val _FILE_OFFSET_BITS: Int = 64

const val _LARGEFILE_SOURCE: Int = 1

const val GCC_VERSION: Int = 4002001

const val MSVC_VERSION: Int = 0

val SQLITE_VERSION: String get() = "3.27.1"

const val SQLITE_VERSION_NUMBER: Int = 3027001

val SQLITE_SOURCE_ID: String get() = "2019\u002D02\u002D08 13:17:39 0eca3dd3d38b31c92b49ca2d311128b74584714d9e7de895b1a6286ef959alt2"

const val SQLITE_OK: Int = 0

const val SQLITE_ERROR: Int = 1

const val SQLITE_INTERNAL: Int = 2

const val SQLITE_PERM: Int = 3

const val SQLITE_ABORT: Int = 4

const val SQLITE_BUSY: Int = 5

const val SQLITE_LOCKED: Int = 6

const val SQLITE_NOMEM: Int = 7

const val SQLITE_READONLY: Int = 8

const val SQLITE_INTERRUPT: Int = 9

const val SQLITE_IOERR: Int = 10

const val SQLITE_CORRUPT: Int = 11

const val SQLITE_NOTFOUND: Int = 12

const val SQLITE_FULL: Int = 13

const val SQLITE_CANTOPEN: Int = 14

const val SQLITE_PROTOCOL: Int = 15

const val SQLITE_EMPTY: Int = 16

const val SQLITE_SCHEMA: Int = 17

const val SQLITE_TOOBIG: Int = 18

const val SQLITE_CONSTRAINT: Int = 19

const val SQLITE_MISMATCH: Int = 20

const val SQLITE_MISUSE: Int = 21

const val SQLITE_NOLFS: Int = 22

const val SQLITE_AUTH: Int = 23

const val SQLITE_FORMAT: Int = 24

const val SQLITE_RANGE: Int = 25

const val SQLITE_NOTADB: Int = 26

const val SQLITE_NOTICE: Int = 27

const val SQLITE_WARNING: Int = 28

const val SQLITE_ROW: Int = 100

const val SQLITE_DONE: Int = 101

const val SQLITE_ERROR_MISSING_COLLSEQ: Int = 257

const val SQLITE_ERROR_RETRY: Int = 513

const val SQLITE_ERROR_SNAPSHOT: Int = 769

const val SQLITE_IOERR_READ: Int = 266

const val SQLITE_IOERR_SHORT_READ: Int = 522

const val SQLITE_IOERR_WRITE: Int = 778

const val SQLITE_IOERR_FSYNC: Int = 1034

const val SQLITE_IOERR_DIR_FSYNC: Int = 1290

const val SQLITE_IOERR_TRUNCATE: Int = 1546

const val SQLITE_IOERR_FSTAT: Int = 1802

const val SQLITE_IOERR_UNLOCK: Int = 2058

const val SQLITE_IOERR_RDLOCK: Int = 2314

const val SQLITE_IOERR_DELETE: Int = 2570

const val SQLITE_IOERR_BLOCKED: Int = 2826

const val SQLITE_IOERR_NOMEM: Int = 3082

const val SQLITE_IOERR_ACCESS: Int = 3338

const val SQLITE_IOERR_CHECKRESERVEDLOCK: Int = 3594

const val SQLITE_IOERR_LOCK: Int = 3850

const val SQLITE_IOERR_CLOSE: Int = 4106

const val SQLITE_IOERR_DIR_CLOSE: Int = 4362

const val SQLITE_IOERR_SHMOPEN: Int = 4618

const val SQLITE_IOERR_SHMSIZE: Int = 4874

const val SQLITE_IOERR_SHMLOCK: Int = 5130

const val SQLITE_IOERR_SHMMAP: Int = 5386

const val SQLITE_IOERR_SEEK: Int = 5642

const val SQLITE_IOERR_DELETE_NOENT: Int = 5898

const val SQLITE_IOERR_MMAP: Int = 6154

const val SQLITE_IOERR_GETTEMPPATH: Int = 6410

const val SQLITE_IOERR_CONVPATH: Int = 6666

const val SQLITE_IOERR_VNODE: Int = 6922

const val SQLITE_IOERR_AUTH: Int = 7178

const val SQLITE_IOERR_BEGIN_ATOMIC: Int = 7434

const val SQLITE_IOERR_COMMIT_ATOMIC: Int = 7690

const val SQLITE_IOERR_ROLLBACK_ATOMIC: Int = 7946

const val SQLITE_LOCKED_SHAREDCACHE: Int = 262

const val SQLITE_LOCKED_VTAB: Int = 518

const val SQLITE_BUSY_RECOVERY: Int = 261

const val SQLITE_BUSY_SNAPSHOT: Int = 517

const val SQLITE_CANTOPEN_NOTEMPDIR: Int = 270

const val SQLITE_CANTOPEN_ISDIR: Int = 526

const val SQLITE_CANTOPEN_FULLPATH: Int = 782

const val SQLITE_CANTOPEN_CONVPATH: Int = 1038

const val SQLITE_CANTOPEN_DIRTYWAL: Int = 1294

const val SQLITE_CORRUPT_VTAB: Int = 267

const val SQLITE_CORRUPT_SEQUENCE: Int = 523

const val SQLITE_READONLY_RECOVERY: Int = 264

const val SQLITE_READONLY_CANTLOCK: Int = 520

const val SQLITE_READONLY_ROLLBACK: Int = 776

const val SQLITE_READONLY_DBMOVED: Int = 1032

const val SQLITE_READONLY_CANTINIT: Int = 1288

const val SQLITE_READONLY_DIRECTORY: Int = 1544

const val SQLITE_ABORT_ROLLBACK: Int = 516

const val SQLITE_CONSTRAINT_CHECK: Int = 275

const val SQLITE_CONSTRAINT_COMMITHOOK: Int = 531

const val SQLITE_CONSTRAINT_FOREIGNKEY: Int = 787

const val SQLITE_CONSTRAINT_FUNCTION: Int = 1043

const val SQLITE_CONSTRAINT_NOTNULL: Int = 1299

const val SQLITE_CONSTRAINT_PRIMARYKEY: Int = 1555

const val SQLITE_CONSTRAINT_TRIGGER: Int = 1811

const val SQLITE_CONSTRAINT_UNIQUE: Int = 2067

const val SQLITE_CONSTRAINT_VTAB: Int = 2323

const val SQLITE_CONSTRAINT_ROWID: Int = 2579

const val SQLITE_NOTICE_RECOVER_WAL: Int = 283

const val SQLITE_NOTICE_RECOVER_ROLLBACK: Int = 539

const val SQLITE_WARNING_AUTOINDEX: Int = 284

const val SQLITE_AUTH_USER: Int = 279

const val SQLITE_OK_LOAD_PERMANENTLY: Int = 256

const val SQLITE_OPEN_READONLY: Int = 1

const val SQLITE_OPEN_READWRITE: Int = 2

const val SQLITE_OPEN_CREATE: Int = 4

const val SQLITE_OPEN_DELETEONCLOSE: Int = 8

const val SQLITE_OPEN_EXCLUSIVE: Int = 16

const val SQLITE_OPEN_AUTOPROXY: Int = 32

const val SQLITE_OPEN_URI: Int = 64

const val SQLITE_OPEN_MEMORY: Int = 128

const val SQLITE_OPEN_MAIN_DB: Int = 256

const val SQLITE_OPEN_TEMP_DB: Int = 512

const val SQLITE_OPEN_TRANSIENT_DB: Int = 1024

const val SQLITE_OPEN_MAIN_JOURNAL: Int = 2048

const val SQLITE_OPEN_TEMP_JOURNAL: Int = 4096

const val SQLITE_OPEN_SUBJOURNAL: Int = 8192

const val SQLITE_OPEN_MASTER_JOURNAL: Int = 16384

const val SQLITE_OPEN_NOMUTEX: Int = 32768

const val SQLITE_OPEN_FULLMUTEX: Int = 65536

const val SQLITE_OPEN_SHAREDCACHE: Int = 131072

const val SQLITE_OPEN_PRIVATECACHE: Int = 262144

const val SQLITE_OPEN_WAL: Int = 524288

const val SQLITE_IOCAP_ATOMIC: Int = 1

const val SQLITE_IOCAP_ATOMIC512: Int = 2

const val SQLITE_IOCAP_ATOMIC1K: Int = 4

const val SQLITE_IOCAP_ATOMIC2K: Int = 8

const val SQLITE_IOCAP_ATOMIC4K: Int = 16

const val SQLITE_IOCAP_ATOMIC8K: Int = 32

const val SQLITE_IOCAP_ATOMIC16K: Int = 64

const val SQLITE_IOCAP_ATOMIC32K: Int = 128

const val SQLITE_IOCAP_ATOMIC64K: Int = 256

const val SQLITE_IOCAP_SAFE_APPEND: Int = 512

const val SQLITE_IOCAP_SEQUENTIAL: Int = 1024

const val SQLITE_IOCAP_UNDELETABLE_WHEN_OPEN: Int = 2048

const val SQLITE_IOCAP_POWERSAFE_OVERWRITE: Int = 4096

const val SQLITE_IOCAP_IMMUTABLE: Int = 8192

const val SQLITE_IOCAP_BATCH_ATOMIC: Int = 16384

const val SQLITE_LOCK_NONE: Int = 0

const val SQLITE_LOCK_SHARED: Int = 1

const val SQLITE_LOCK_RESERVED: Int = 2

const val SQLITE_LOCK_PENDING: Int = 3

const val SQLITE_LOCK_EXCLUSIVE: Int = 4

const val SQLITE_SYNC_NORMAL: Int = 2

const val SQLITE_SYNC_FULL: Int = 3

const val SQLITE_SYNC_DATAONLY: Int = 16

const val SQLITE_FCNTL_LOCKSTATE: Int = 1

const val SQLITE_FCNTL_GET_LOCKPROXYFILE: Int = 2

const val SQLITE_FCNTL_SET_LOCKPROXYFILE: Int = 3

const val SQLITE_FCNTL_LAST_ERRNO: Int = 4

const val SQLITE_FCNTL_SIZE_HINT: Int = 5

const val SQLITE_FCNTL_CHUNK_SIZE: Int = 6

const val SQLITE_FCNTL_FILE_POINTER: Int = 7

const val SQLITE_FCNTL_SYNC_OMITTED: Int = 8

const val SQLITE_FCNTL_WIN32_AV_RETRY: Int = 9

const val SQLITE_FCNTL_PERSIST_WAL: Int = 10

const val SQLITE_FCNTL_OVERWRITE: Int = 11

const val SQLITE_FCNTL_VFSNAME: Int = 12

const val SQLITE_FCNTL_POWERSAFE_OVERWRITE: Int = 13

const val SQLITE_FCNTL_PRAGMA: Int = 14

const val SQLITE_FCNTL_BUSYHANDLER: Int = 15

const val SQLITE_FCNTL_TEMPFILENAME: Int = 16

const val SQLITE_FCNTL_MMAP_SIZE: Int = 18

const val SQLITE_FCNTL_TRACE: Int = 19

const val SQLITE_FCNTL_HAS_MOVED: Int = 20

const val SQLITE_FCNTL_SYNC: Int = 21

const val SQLITE_FCNTL_COMMIT_PHASETWO: Int = 22

const val SQLITE_FCNTL_WIN32_SET_HANDLE: Int = 23

const val SQLITE_FCNTL_WAL_BLOCK: Int = 24

const val SQLITE_FCNTL_ZIPVFS: Int = 25

const val SQLITE_FCNTL_RBU: Int = 26

const val SQLITE_FCNTL_VFS_POINTER: Int = 27

const val SQLITE_FCNTL_JOURNAL_POINTER: Int = 28

const val SQLITE_FCNTL_WIN32_GET_HANDLE: Int = 29

const val SQLITE_FCNTL_PDB: Int = 30

const val SQLITE_FCNTL_BEGIN_ATOMIC_WRITE: Int = 31

const val SQLITE_FCNTL_COMMIT_ATOMIC_WRITE: Int = 32

const val SQLITE_FCNTL_ROLLBACK_ATOMIC_WRITE: Int = 33

const val SQLITE_FCNTL_LOCK_TIMEOUT: Int = 34

const val SQLITE_FCNTL_DATA_VERSION: Int = 35

const val SQLITE_FCNTL_SIZE_LIMIT: Int = 36

const val SQLITE_GET_LOCKPROXYFILE: Int = 2

const val SQLITE_SET_LOCKPROXYFILE: Int = 3

const val SQLITE_LAST_ERRNO: Int = 4

const val SQLITE_ACCESS_EXISTS: Int = 0

const val SQLITE_ACCESS_READWRITE: Int = 1

const val SQLITE_ACCESS_READ: Int = 2

const val SQLITE_SHM_UNLOCK: Int = 1

const val SQLITE_SHM_LOCK: Int = 2

const val SQLITE_SHM_SHARED: Int = 4

const val SQLITE_SHM_EXCLUSIVE: Int = 8

const val SQLITE_SHM_NLOCK: Int = 8

const val SQLITE_CONFIG_SINGLETHREAD: Int = 1

const val SQLITE_CONFIG_MULTITHREAD: Int = 2

const val SQLITE_CONFIG_SERIALIZED: Int = 3

const val SQLITE_CONFIG_MALLOC: Int = 4

const val SQLITE_CONFIG_GETMALLOC: Int = 5

const val SQLITE_CONFIG_SCRATCH: Int = 6

const val SQLITE_CONFIG_PAGECACHE: Int = 7

const val SQLITE_CONFIG_HEAP: Int = 8

const val SQLITE_CONFIG_MEMSTATUS: Int = 9

const val SQLITE_CONFIG_MUTEX: Int = 10

const val SQLITE_CONFIG_GETMUTEX: Int = 11

const val SQLITE_CONFIG_LOOKASIDE: Int = 13

const val SQLITE_CONFIG_PCACHE: Int = 14

const val SQLITE_CONFIG_GETPCACHE: Int = 15

const val SQLITE_CONFIG_LOG: Int = 16

const val SQLITE_CONFIG_URI: Int = 17

const val SQLITE_CONFIG_PCACHE2: Int = 18

const val SQLITE_CONFIG_GETPCACHE2: Int = 19

const val SQLITE_CONFIG_COVERING_INDEX_SCAN: Int = 20

const val SQLITE_CONFIG_SQLLOG: Int = 21

const val SQLITE_CONFIG_MMAP_SIZE: Int = 22

const val SQLITE_CONFIG_WIN32_HEAPSIZE: Int = 23

const val SQLITE_CONFIG_PCACHE_HDRSZ: Int = 24

const val SQLITE_CONFIG_PMASZ: Int = 25

const val SQLITE_CONFIG_STMTJRNL_SPILL: Int = 26

const val SQLITE_CONFIG_SMALL_MALLOC: Int = 27

const val SQLITE_CONFIG_SORTERREF_SIZE: Int = 28

const val SQLITE_CONFIG_MEMDB_MAXSIZE: Int = 29

const val SQLITE_DBCONFIG_MAINDBNAME: Int = 1000

const val SQLITE_DBCONFIG_LOOKASIDE: Int = 1001

const val SQLITE_DBCONFIG_ENABLE_FKEY: Int = 1002

const val SQLITE_DBCONFIG_ENABLE_TRIGGER: Int = 1003

const val SQLITE_DBCONFIG_ENABLE_FTS3_TOKENIZER: Int = 1004

const val SQLITE_DBCONFIG_ENABLE_LOAD_EXTENSION: Int = 1005

const val SQLITE_DBCONFIG_NO_CKPT_ON_CLOSE: Int = 1006

const val SQLITE_DBCONFIG_ENABLE_QPSG: Int = 1007

const val SQLITE_DBCONFIG_TRIGGER_EQP: Int = 1008

const val SQLITE_DBCONFIG_RESET_DATABASE: Int = 1009

const val SQLITE_DBCONFIG_DEFENSIVE: Int = 1010

const val SQLITE_DBCONFIG_MAX: Int = 1010

const val SQLITE_DENY: Int = 1

const val SQLITE_IGNORE: Int = 2

const val SQLITE_CREATE_INDEX: Int = 1

const val SQLITE_CREATE_TABLE: Int = 2

const val SQLITE_CREATE_TEMP_INDEX: Int = 3

const val SQLITE_CREATE_TEMP_TABLE: Int = 4

const val SQLITE_CREATE_TEMP_TRIGGER: Int = 5

const val SQLITE_CREATE_TEMP_VIEW: Int = 6

const val SQLITE_CREATE_TRIGGER: Int = 7

const val SQLITE_CREATE_VIEW: Int = 8

const val SQLITE_DELETE: Int = 9

const val SQLITE_DROP_INDEX: Int = 10

const val SQLITE_DROP_TABLE: Int = 11

const val SQLITE_DROP_TEMP_INDEX: Int = 12

const val SQLITE_DROP_TEMP_TABLE: Int = 13

const val SQLITE_DROP_TEMP_TRIGGER: Int = 14

const val SQLITE_DROP_TEMP_VIEW: Int = 15

const val SQLITE_DROP_TRIGGER: Int = 16

const val SQLITE_DROP_VIEW: Int = 17

const val SQLITE_INSERT: Int = 18

const val SQLITE_PRAGMA: Int = 19

const val SQLITE_READ: Int = 20

const val SQLITE_SELECT: Int = 21

const val SQLITE_TRANSACTION: Int = 22

const val SQLITE_UPDATE: Int = 23

const val SQLITE_ATTACH: Int = 24

const val SQLITE_DETACH: Int = 25

const val SQLITE_ALTER_TABLE: Int = 26

const val SQLITE_REINDEX: Int = 27

const val SQLITE_ANALYZE: Int = 28

const val SQLITE_CREATE_VTABLE: Int = 29

const val SQLITE_DROP_VTABLE: Int = 30

const val SQLITE_FUNCTION: Int = 31

const val SQLITE_SAVEPOINT: Int = 32

const val SQLITE_COPY: Int = 0

const val SQLITE_RECURSIVE: Int = 33

const val SQLITE_TRACE_STMT: Int = 1

const val SQLITE_TRACE_PROFILE: Int = 2

const val SQLITE_TRACE_ROW: Int = 4

const val SQLITE_TRACE_CLOSE: Int = 8

const val SQLITE_LIMIT_LENGTH: Int = 0

const val SQLITE_LIMIT_SQL_LENGTH: Int = 1

const val SQLITE_LIMIT_COLUMN: Int = 2

const val SQLITE_LIMIT_EXPR_DEPTH: Int = 3

const val SQLITE_LIMIT_COMPOUND_SELECT: Int = 4

const val SQLITE_LIMIT_VDBE_OP: Int = 5

const val SQLITE_LIMIT_FUNCTION_ARG: Int = 6

const val SQLITE_LIMIT_ATTACHED: Int = 7

const val SQLITE_LIMIT_LIKE_PATTERN_LENGTH: Int = 8

const val SQLITE_LIMIT_VARIABLE_NUMBER: Int = 9

const val SQLITE_LIMIT_TRIGGER_DEPTH: Int = 10

const val SQLITE_LIMIT_WORKER_THREADS: Int = 11

const val SQLITE_PREPARE_PERSISTENT: Int = 1

const val SQLITE_PREPARE_NORMALIZE: Int = 2

const val SQLITE_PREPARE_NO_VTAB: Int = 4

const val SQLITE_INTEGER: Int = 1

const val SQLITE_FLOAT: Int = 2

const val SQLITE_BLOB: Int = 4

const val SQLITE_NULL: Int = 5

const val SQLITE_TEXT: Int = 3

const val SQLITE3_TEXT: Int = 3

const val SQLITE_UTF8: Int = 1

const val SQLITE_UTF16LE: Int = 2

const val SQLITE_UTF16BE: Int = 3

const val SQLITE_UTF16: Int = 4

const val SQLITE_ANY: Int = 5

const val SQLITE_UTF16_ALIGNED: Int = 8

const val SQLITE_DETERMINISTIC: Int = 2048

const val SQLITE_WIN32_DATA_DIRECTORY_TYPE: Int = 1

const val SQLITE_WIN32_TEMP_DIRECTORY_TYPE: Int = 2

const val SQLITE_INDEX_SCAN_UNIQUE: Int = 1

const val SQLITE_INDEX_CONSTRAINT_EQ: Int = 2

const val SQLITE_INDEX_CONSTRAINT_GT: Int = 4

const val SQLITE_INDEX_CONSTRAINT_LE: Int = 8

const val SQLITE_INDEX_CONSTRAINT_LT: Int = 16

const val SQLITE_INDEX_CONSTRAINT_GE: Int = 32

const val SQLITE_INDEX_CONSTRAINT_MATCH: Int = 64

const val SQLITE_INDEX_CONSTRAINT_LIKE: Int = 65

const val SQLITE_INDEX_CONSTRAINT_GLOB: Int = 66

const val SQLITE_INDEX_CONSTRAINT_REGEXP: Int = 67

const val SQLITE_INDEX_CONSTRAINT_NE: Int = 68

const val SQLITE_INDEX_CONSTRAINT_ISNOT: Int = 69

const val SQLITE_INDEX_CONSTRAINT_ISNOTNULL: Int = 70

const val SQLITE_INDEX_CONSTRAINT_ISNULL: Int = 71

const val SQLITE_INDEX_CONSTRAINT_IS: Int = 72

const val SQLITE_INDEX_CONSTRAINT_FUNCTION: Int = 150

const val SQLITE_MUTEX_FAST: Int = 0

const val SQLITE_MUTEX_RECURSIVE: Int = 1

const val SQLITE_MUTEX_STATIC_MASTER: Int = 2

const val SQLITE_MUTEX_STATIC_MEM: Int = 3

const val SQLITE_MUTEX_STATIC_MEM2: Int = 4

const val SQLITE_MUTEX_STATIC_OPEN: Int = 4

const val SQLITE_MUTEX_STATIC_PRNG: Int = 5

const val SQLITE_MUTEX_STATIC_LRU: Int = 6

const val SQLITE_MUTEX_STATIC_LRU2: Int = 7

const val SQLITE_MUTEX_STATIC_PMEM: Int = 7

const val SQLITE_MUTEX_STATIC_APP1: Int = 8

const val SQLITE_MUTEX_STATIC_APP2: Int = 9

const val SQLITE_MUTEX_STATIC_APP3: Int = 10

const val SQLITE_MUTEX_STATIC_VFS1: Int = 11

const val SQLITE_MUTEX_STATIC_VFS2: Int = 12

const val SQLITE_MUTEX_STATIC_VFS3: Int = 13

const val SQLITE_TESTCTRL_FIRST: Int = 5

const val SQLITE_TESTCTRL_PRNG_SAVE: Int = 5

const val SQLITE_TESTCTRL_PRNG_RESTORE: Int = 6

const val SQLITE_TESTCTRL_PRNG_RESET: Int = 7

const val SQLITE_TESTCTRL_BITVEC_TEST: Int = 8

const val SQLITE_TESTCTRL_FAULT_INSTALL: Int = 9

const val SQLITE_TESTCTRL_BENIGN_MALLOC_HOOKS: Int = 10

const val SQLITE_TESTCTRL_PENDING_BYTE: Int = 11

const val SQLITE_TESTCTRL_ASSERT: Int = 12

const val SQLITE_TESTCTRL_ALWAYS: Int = 13

const val SQLITE_TESTCTRL_RESERVE: Int = 14

const val SQLITE_TESTCTRL_OPTIMIZATIONS: Int = 15

const val SQLITE_TESTCTRL_ISKEYWORD: Int = 16

const val SQLITE_TESTCTRL_SCRATCHMALLOC: Int = 17

const val SQLITE_TESTCTRL_INTERNAL_FUNCTIONS: Int = 17

const val SQLITE_TESTCTRL_LOCALTIME_FAULT: Int = 18

const val SQLITE_TESTCTRL_EXPLAIN_STMT: Int = 19

const val SQLITE_TESTCTRL_ONCE_RESET_THRESHOLD: Int = 19

const val SQLITE_TESTCTRL_NEVER_CORRUPT: Int = 20

const val SQLITE_TESTCTRL_VDBE_COVERAGE: Int = 21

const val SQLITE_TESTCTRL_BYTEORDER: Int = 22

const val SQLITE_TESTCTRL_ISINIT: Int = 23

const val SQLITE_TESTCTRL_SORTER_MMAP: Int = 24

const val SQLITE_TESTCTRL_IMPOSTER: Int = 25

const val SQLITE_TESTCTRL_PARSER_COVERAGE: Int = 26

const val SQLITE_TESTCTRL_LAST: Int = 26

const val SQLITE_STATUS_MEMORY_USED: Int = 0

const val SQLITE_STATUS_PAGECACHE_USED: Int = 1

const val SQLITE_STATUS_PAGECACHE_OVERFLOW: Int = 2

const val SQLITE_STATUS_SCRATCH_USED: Int = 3

const val SQLITE_STATUS_SCRATCH_OVERFLOW: Int = 4

const val SQLITE_STATUS_MALLOC_SIZE: Int = 5

const val SQLITE_STATUS_PARSER_STACK: Int = 6

const val SQLITE_STATUS_PAGECACHE_SIZE: Int = 7

const val SQLITE_STATUS_SCRATCH_SIZE: Int = 8

const val SQLITE_STATUS_MALLOC_COUNT: Int = 9

const val SQLITE_DBSTATUS_LOOKASIDE_USED: Int = 0

const val SQLITE_DBSTATUS_CACHE_USED: Int = 1

const val SQLITE_DBSTATUS_SCHEMA_USED: Int = 2

const val SQLITE_DBSTATUS_STMT_USED: Int = 3

const val SQLITE_DBSTATUS_LOOKASIDE_HIT: Int = 4

const val SQLITE_DBSTATUS_LOOKASIDE_MISS_SIZE: Int = 5

const val SQLITE_DBSTATUS_LOOKASIDE_MISS_FULL: Int = 6

const val SQLITE_DBSTATUS_CACHE_HIT: Int = 7

const val SQLITE_DBSTATUS_CACHE_MISS: Int = 8

const val SQLITE_DBSTATUS_CACHE_WRITE: Int = 9

const val SQLITE_DBSTATUS_DEFERRED_FKS: Int = 10

const val SQLITE_DBSTATUS_CACHE_USED_SHARED: Int = 11

const val SQLITE_DBSTATUS_CACHE_SPILL: Int = 12

const val SQLITE_DBSTATUS_MAX: Int = 12

const val SQLITE_STMTSTATUS_FULLSCAN_STEP: Int = 1

const val SQLITE_STMTSTATUS_SORT: Int = 2

const val SQLITE_STMTSTATUS_AUTOINDEX: Int = 3

const val SQLITE_STMTSTATUS_VM_STEP: Int = 4

const val SQLITE_STMTSTATUS_REPREPARE: Int = 5

const val SQLITE_STMTSTATUS_RUN: Int = 6

const val SQLITE_STMTSTATUS_MEMUSED: Int = 99

const val SQLITE_CHECKPOINT_PASSIVE: Int = 0

const val SQLITE_CHECKPOINT_FULL: Int = 1

const val SQLITE_CHECKPOINT_RESTART: Int = 2

const val SQLITE_CHECKPOINT_TRUNCATE: Int = 3

const val SQLITE_VTAB_CONSTRAINT_SUPPORT: Int = 1

const val SQLITE_ROLLBACK: Int = 1

const val SQLITE_FAIL: Int = 3

const val SQLITE_REPLACE: Int = 5

const val SQLITE_SCANSTAT_NLOOP: Int = 0

const val SQLITE_SCANSTAT_NVISIT: Int = 1

const val SQLITE_SCANSTAT_EST: Int = 2

const val SQLITE_SCANSTAT_NAME: Int = 3

const val SQLITE_SCANSTAT_EXPLAIN: Int = 4

const val SQLITE_SCANSTAT_SELECTID: Int = 5

const val SQLITE_SERIALIZE_NOCOPY: Int = 1

const val SQLITE_DESERIALIZE_FREEONCLOSE: Int = 1

const val SQLITE_DESERIALIZE_RESIZEABLE: Int = 2

const val SQLITE_DESERIALIZE_READONLY: Int = 4

const val NOT_WITHIN: Int = 0

const val PARTLY_WITHIN: Int = 1

const val FULLY_WITHIN: Int = 2

const val FTS5_TOKENIZE_QUERY: Int = 1

const val FTS5_TOKENIZE_PREFIX: Int = 2

const val FTS5_TOKENIZE_DOCUMENT: Int = 4

const val FTS5_TOKENIZE_AUX: Int = 8

const val FTS5_TOKEN_COLOCATED: Int = 1

const val SQLITE_MAX_LENGTH: Int = 1000000000

const val SQLITE_MAX_COLUMN: Int = 2000

const val SQLITE_MAX_SQL_LENGTH: Int = 1000000000

const val SQLITE_MAX_EXPR_DEPTH: Int = 1000

const val SQLITE_MAX_COMPOUND_SELECT: Int = 500

const val SQLITE_MAX_VDBE_OP: Int = 250000000

const val SQLITE_MAX_FUNCTION_ARG: Int = 127

const val SQLITE_DEFAULT_CACHE_SIZE: Int = -2000

const val SQLITE_DEFAULT_WAL_AUTOCHECKPOINT: Int = 1000

const val SQLITE_MAX_ATTACHED: Int = 10

const val SQLITE_MAX_VARIABLE_NUMBER: Int = 999

const val SQLITE_MAX_PAGE_SIZE: Int = 65536

const val SQLITE_DEFAULT_PAGE_SIZE: Int = 4096

const val SQLITE_MAX_DEFAULT_PAGE_SIZE: Int = 8192

const val SQLITE_MAX_PAGE_COUNT: Int = 1073741823

const val SQLITE_MAX_LIKE_PATTERN_LENGTH: Int = 50000

const val SQLITE_MAX_TRIGGER_DEPTH: Int = 1000

const val SQLITE_THREADSAFE: Int = 1

const val SQLITE_POWERSAFE_OVERWRITE: Int = 1

const val SQLITE_DEFAULT_MEMSTATUS: Int = 1

const val SQLITE_SYSTEM_MALLOC: Int = 1

const val SQLITE_MALLOC_SOFT_LIMIT: Int = 1024

const val _XOPEN_SOURCE: Int = 600

const val NDEBUG: Int = 1

const val TK_SEMI: Int = 1

const val TK_EXPLAIN: Int = 2

const val TK_QUERY: Int = 3

const val TK_PLAN: Int = 4

const val TK_BEGIN: Int = 5

const val TK_TRANSACTION: Int = 6

const val TK_DEFERRED: Int = 7

const val TK_IMMEDIATE: Int = 8

const val TK_EXCLUSIVE: Int = 9

const val TK_COMMIT: Int = 10

const val TK_END: Int = 11

const val TK_ROLLBACK: Int = 12

const val TK_SAVEPOINT: Int = 13

const val TK_RELEASE: Int = 14

const val TK_TO: Int = 15

const val TK_TABLE: Int = 16

const val TK_CREATE: Int = 17

const val TK_IF: Int = 18

const val TK_NOT: Int = 19

const val TK_EXISTS: Int = 20

const val TK_TEMP: Int = 21

const val TK_LP: Int = 22

const val TK_RP: Int = 23

const val TK_AS: Int = 24

const val TK_WITHOUT: Int = 25

const val TK_COMMA: Int = 26

const val TK_ABORT: Int = 27

const val TK_ACTION: Int = 28

const val TK_AFTER: Int = 29

const val TK_ANALYZE: Int = 30

const val TK_ASC: Int = 31

const val TK_ATTACH: Int = 32

const val TK_BEFORE: Int = 33

const val TK_BY: Int = 34

const val TK_CASCADE: Int = 35

const val TK_CAST: Int = 36

const val TK_CONFLICT: Int = 37

const val TK_DATABASE: Int = 38

const val TK_DESC: Int = 39

const val TK_DETACH: Int = 40

const val TK_EACH: Int = 41

const val TK_FAIL: Int = 42

const val TK_OR: Int = 43

const val TK_AND: Int = 44

const val TK_IS: Int = 45

const val TK_MATCH: Int = 46

const val TK_LIKE_KW: Int = 47

const val TK_BETWEEN: Int = 48

const val TK_IN: Int = 49

const val TK_ISNULL: Int = 50

const val TK_NOTNULL: Int = 51

const val TK_NE: Int = 52

const val TK_EQ: Int = 53

const val TK_GT: Int = 54

const val TK_LE: Int = 55

const val TK_LT: Int = 56

const val TK_GE: Int = 57

const val TK_ESCAPE: Int = 58

const val TK_ID: Int = 59

const val TK_COLUMNKW: Int = 60

const val TK_DO: Int = 61

const val TK_FOR: Int = 62

const val TK_IGNORE: Int = 63

const val TK_INITIALLY: Int = 64

const val TK_INSTEAD: Int = 65

const val TK_NO: Int = 66

const val TK_KEY: Int = 67

const val TK_OF: Int = 68

const val TK_OFFSET: Int = 69

const val TK_PRAGMA: Int = 70

const val TK_RAISE: Int = 71

const val TK_RECURSIVE: Int = 72

const val TK_REPLACE: Int = 73

const val TK_RESTRICT: Int = 74

const val TK_ROW: Int = 75

const val TK_ROWS: Int = 76

const val TK_TRIGGER: Int = 77

const val TK_VACUUM: Int = 78

const val TK_VIEW: Int = 79

const val TK_VIRTUAL: Int = 80

const val TK_WITH: Int = 81

const val TK_CURRENT: Int = 82

const val TK_FOLLOWING: Int = 83

const val TK_PARTITION: Int = 84

const val TK_PRECEDING: Int = 85

const val TK_RANGE: Int = 86

const val TK_UNBOUNDED: Int = 87

const val TK_REINDEX: Int = 88

const val TK_RENAME: Int = 89

const val TK_CTIME_KW: Int = 90

const val TK_ANY: Int = 91

const val TK_BITAND: Int = 92

const val TK_BITOR: Int = 93

const val TK_LSHIFT: Int = 94

const val TK_RSHIFT: Int = 95

const val TK_PLUS: Int = 96

const val TK_MINUS: Int = 97

const val TK_STAR: Int = 98

const val TK_SLASH: Int = 99

const val TK_REM: Int = 100

const val TK_CONCAT: Int = 101

const val TK_COLLATE: Int = 102

const val TK_BITNOT: Int = 103

const val TK_ON: Int = 104

const val TK_INDEXED: Int = 105

const val TK_STRING: Int = 106

const val TK_JOIN_KW: Int = 107

const val TK_CONSTRAINT: Int = 108

const val TK_DEFAULT: Int = 109

const val TK_NULL: Int = 110

const val TK_PRIMARY: Int = 111

const val TK_UNIQUE: Int = 112

const val TK_CHECK: Int = 113

const val TK_REFERENCES: Int = 114

const val TK_AUTOINCR: Int = 115

const val TK_INSERT: Int = 116

const val TK_DELETE: Int = 117

const val TK_UPDATE: Int = 118

const val TK_SET: Int = 119

const val TK_DEFERRABLE: Int = 120

const val TK_FOREIGN: Int = 121

const val TK_DROP: Int = 122

const val TK_UNION: Int = 123

const val TK_ALL: Int = 124

const val TK_EXCEPT: Int = 125

const val TK_INTERSECT: Int = 126

const val TK_SELECT: Int = 127

const val TK_VALUES: Int = 128

const val TK_DISTINCT: Int = 129

const val TK_DOT: Int = 130

const val TK_FROM: Int = 131

const val TK_JOIN: Int = 132

const val TK_USING: Int = 133

const val TK_ORDER: Int = 134

const val TK_GROUP: Int = 135

const val TK_HAVING: Int = 136

const val TK_LIMIT: Int = 137

const val TK_WHERE: Int = 138

const val TK_INTO: Int = 139

const val TK_NOTHING: Int = 140

const val TK_FLOAT: Int = 141

const val TK_BLOB: Int = 142

const val TK_INTEGER: Int = 143

const val TK_VARIABLE: Int = 144

const val TK_CASE: Int = 145

const val TK_WHEN: Int = 146

const val TK_THEN: Int = 147

const val TK_ELSE: Int = 148

const val TK_INDEX: Int = 149

const val TK_ALTER: Int = 150

const val TK_ADD: Int = 151

const val TK_WINDOW: Int = 152

const val TK_OVER: Int = 153

const val TK_FILTER: Int = 154

const val TK_TRUEFALSE: Int = 155

const val TK_ISNOT: Int = 156

const val TK_FUNCTION: Int = 157

const val TK_COLUMN: Int = 158

const val TK_AGG_FUNCTION: Int = 159

const val TK_AGG_COLUMN: Int = 160

const val TK_UMINUS: Int = 161

const val TK_UPLUS: Int = 162

const val TK_TRUTH: Int = 163

const val TK_REGISTER: Int = 164

const val TK_VECTOR: Int = 165

const val TK_SELECT_COLUMN: Int = 166

const val TK_IF_NULL_ROW: Int = 167

const val TK_ASTERISK: Int = 168

const val TK_SPAN: Int = 169

const val TK_END_OF_FILE: Int = 170

const val TK_UNCLOSED_STRING: Int = 171

const val TK_SPACE: Int = 172

const val TK_ILLEGAL: Int = 173

const val TKFLG_MASK: Int = 255

const val TKFLG_DONTFOLD: Int = 256

val SQLITE_BIG_DBL: Double get() = bitsToDouble(6088095589093318446) /* == 1.0E99 */

const val OMIT_TEMPDB: Int = 0

const val SQLITE_MAX_FILE_FORMAT: Int = 4

const val SQLITE_DEFAULT_FILE_FORMAT: Int = 4

const val SQLITE_DEFAULT_RECURSIVE_TRIGGERS: Int = 0

const val SQLITE_TEMP_STORE: Int = 1

const val SQLITE_MAX_WORKER_THREADS: Int = 8

const val SQLITE_DEFAULT_WORKER_THREADS: Int = 0

const val SQLITE_DEFAULT_PCACHE_INITSZ: Int = 20

const val SQLITE_DEFAULT_SORTERREF_SIZE: Int = 2147483647

const val SQLITE_ASCII: Int = 1

const val SQLITE_MAX_U32: ULong = 4294967295u

const val SQLITE_PTRSIZE: Int = 8

const val SQLITE_BYTEORDER: Int = 1234

const val SQLITE_BIGENDIAN: Int = 0

const val SQLITE_LITTLEENDIAN: Int = 1

const val SQLITE_UTF16NATIVE: Int = 2

const val LARGEST_INT64: Long = 9223372036854775807

const val SMALLEST_INT64: Long = -9223372036854775807 - 1

const val SQLITE_MAX_MMAP_SIZE: Int = 2147418112

const val SQLITE_DEFAULT_MMAP_SIZE: Int = 0

const val SELECTTRACE_ENABLED: Int = 0

val MASTER_NAME: String get() = "sqlite_master"

val TEMP_MASTER_NAME: String get() = "sqlite_temp_master"

const val MASTER_ROOT: Int = 1

const val BMS: Int = 64

const val ALLBITS: Bitmask = 18446744073709551615u

const val SQLITE_N_BTREE_META: Int = 16

const val SQLITE_DEFAULT_AUTOVACUUM: Int = 0

const val BTREE_AUTOVACUUM_NONE: Int = 0

const val BTREE_AUTOVACUUM_FULL: Int = 1

const val BTREE_AUTOVACUUM_INCR: Int = 2

const val BTREE_OMIT_JOURNAL: Int = 1

const val BTREE_MEMORY: Int = 2

const val BTREE_SINGLE: Int = 4

const val BTREE_UNORDERED: Int = 8

const val BTREE_INTKEY: Int = 1

const val BTREE_BLOBKEY: Int = 2

const val BTREE_FREE_PAGE_COUNT: Int = 0

const val BTREE_SCHEMA_VERSION: Int = 1

const val BTREE_FILE_FORMAT: Int = 2

const val BTREE_DEFAULT_CACHE_SIZE: Int = 3

const val BTREE_LARGEST_ROOT_PAGE: Int = 4

const val BTREE_TEXT_ENCODING: Int = 5

const val BTREE_USER_VERSION: Int = 6

const val BTREE_INCR_VACUUM: Int = 7

const val BTREE_APPLICATION_ID: Int = 8

const val BTREE_DATA_VERSION: Int = 15

const val BTREE_HINT_RANGE: Int = 0

const val BTREE_BULKLOAD: Int = 1

const val BTREE_SEEK_EQ: Int = 2

const val BTREE_WRCSR: Int = 4

const val BTREE_FORDELETE: Int = 8

const val BTREE_SAVEPOSITION: Int = 2

const val BTREE_AUXDELETE: Int = 4

const val BTREE_APPEND: Int = 8

const val P4_NOTUSED: Int = 0

const val P4_TRANSIENT: Int = 0

const val P4_STATIC: Int = -1

const val P4_COLLSEQ: Int = -2

const val P4_INT32: Int = -3

const val P4_SUBPROGRAM: Int = -4

const val P4_ADVANCE: Int = -5

const val P4_TABLE: Int = -6

const val P4_FREE_IF_LE: Int = -7

const val P4_DYNAMIC: Int = -7

const val P4_FUNCDEF: Int = -8

const val P4_KEYINFO: Int = -9

const val P4_EXPR: Int = -10

const val P4_MEM: Int = -11

const val P4_VTAB: Int = -12

const val P4_REAL: Int = -13

const val P4_INT64: Int = -14

const val P4_INTARRAY: Int = -15

const val P4_FUNCCTX: Int = -16

const val P4_DYNBLOB: Int = -17

const val P5_ConstraintNotNull: Int = 1

const val P5_ConstraintUnique: Int = 2

const val P5_ConstraintCheck: Int = 3

const val P5_ConstraintFK: Int = 4

const val COLNAME_NAME: Int = 0

const val COLNAME_DECLTYPE: Int = 1

const val COLNAME_DATABASE: Int = 2

const val COLNAME_TABLE: Int = 3

const val COLNAME_COLUMN: Int = 4

const val COLNAME_N: Int = 2

const val OP_Savepoint: Int = 0

const val OP_AutoCommit: Int = 1

const val OP_Transaction: Int = 2

const val OP_SorterNext: Int = 3

const val OP_Prev: Int = 4

const val OP_Next: Int = 5

const val OP_Checkpoint: Int = 6

const val OP_JournalMode: Int = 7

const val OP_Vacuum: Int = 8

const val OP_VFilter: Int = 9

const val OP_VUpdate: Int = 10

const val OP_Goto: Int = 11

const val OP_Gosub: Int = 12

const val OP_InitCoroutine: Int = 13

const val OP_Yield: Int = 14

const val OP_MustBeInt: Int = 15

const val OP_Jump: Int = 16

const val OP_Once: Int = 17

const val OP_If: Int = 18

const val OP_Not: Int = 19

const val OP_IfNot: Int = 20

const val OP_IfNullRow: Int = 21

const val OP_SeekLT: Int = 22

const val OP_SeekLE: Int = 23

const val OP_SeekGE: Int = 24

const val OP_SeekGT: Int = 25

const val OP_IfNoHope: Int = 26

const val OP_NoConflict: Int = 27

const val OP_NotFound: Int = 28

const val OP_Found: Int = 29

const val OP_SeekRowid: Int = 30

const val OP_NotExists: Int = 31

const val OP_Last: Int = 32

const val OP_IfSmaller: Int = 33

const val OP_SorterSort: Int = 34

const val OP_Sort: Int = 35

const val OP_Rewind: Int = 36

const val OP_IdxLE: Int = 37

const val OP_IdxGT: Int = 38

const val OP_IdxLT: Int = 39

const val OP_IdxGE: Int = 40

const val OP_RowSetRead: Int = 41

const val OP_RowSetTest: Int = 42

const val OP_Or: Int = 43

const val OP_And: Int = 44

const val OP_Program: Int = 45

const val OP_FkIfZero: Int = 46

const val OP_IfPos: Int = 47

const val OP_IfNotZero: Int = 48

const val OP_DecrJumpZero: Int = 49

const val OP_IsNull: Int = 50

const val OP_NotNull: Int = 51

const val OP_Ne: Int = 52

const val OP_Eq: Int = 53

const val OP_Gt: Int = 54

const val OP_Le: Int = 55

const val OP_Lt: Int = 56

const val OP_Ge: Int = 57

const val OP_ElseNotEq: Int = 58

const val OP_IncrVacuum: Int = 59

const val OP_VNext: Int = 60

const val OP_Init: Int = 61

const val OP_PureFunc0: Int = 62

const val OP_Function0: Int = 63

const val OP_PureFunc: Int = 64

const val OP_Function: Int = 65

const val OP_Return: Int = 66

const val OP_EndCoroutine: Int = 67

const val OP_HaltIfNull: Int = 68

const val OP_Halt: Int = 69

const val OP_Integer: Int = 70

const val OP_Int64: Int = 71

const val OP_String: Int = 72

const val OP_Null: Int = 73

const val OP_SoftNull: Int = 74

const val OP_Blob: Int = 75

const val OP_Variable: Int = 76

const val OP_Move: Int = 77

const val OP_Copy: Int = 78

const val OP_SCopy: Int = 79

const val OP_IntCopy: Int = 80

const val OP_ResultRow: Int = 81

const val OP_CollSeq: Int = 82

const val OP_AddImm: Int = 83

const val OP_RealAffinity: Int = 84

const val OP_Cast: Int = 85

const val OP_Permutation: Int = 86

const val OP_Compare: Int = 87

const val OP_IsTrue: Int = 88

const val OP_Offset: Int = 89

const val OP_Column: Int = 90

const val OP_Affinity: Int = 91

const val OP_BitAnd: Int = 92

const val OP_BitOr: Int = 93

const val OP_ShiftLeft: Int = 94

const val OP_ShiftRight: Int = 95

const val OP_Add: Int = 96

const val OP_Subtract: Int = 97

const val OP_Multiply: Int = 98

const val OP_Divide: Int = 99

const val OP_Remainder: Int = 100

const val OP_Concat: Int = 101

const val OP_MakeRecord: Int = 102

const val OP_BitNot: Int = 103

const val OP_Count: Int = 104

const val OP_ReadCookie: Int = 105

const val OP_String8: Int = 106

const val OP_SetCookie: Int = 107

const val OP_ReopenIdx: Int = 108

const val OP_OpenRead: Int = 109

const val OP_OpenWrite: Int = 110

const val OP_OpenDup: Int = 111

const val OP_OpenAutoindex: Int = 112

const val OP_OpenEphemeral: Int = 113

const val OP_SorterOpen: Int = 114

const val OP_SequenceTest: Int = 115

const val OP_OpenPseudo: Int = 116

const val OP_Close: Int = 117

const val OP_ColumnsUsed: Int = 118

const val OP_SeekHit: Int = 119

const val OP_Sequence: Int = 120

const val OP_NewRowid: Int = 121

const val OP_Insert: Int = 122

const val OP_InsertInt: Int = 123

const val OP_Delete: Int = 124

const val OP_ResetCount: Int = 125

const val OP_SorterCompare: Int = 126

const val OP_SorterData: Int = 127

const val OP_RowData: Int = 128

const val OP_Rowid: Int = 129

const val OP_NullRow: Int = 130

const val OP_SeekEnd: Int = 131

const val OP_SorterInsert: Int = 132

const val OP_IdxInsert: Int = 133

const val OP_IdxDelete: Int = 134

const val OP_DeferredSeek: Int = 135

const val OP_IdxRowid: Int = 136

const val OP_Destroy: Int = 137

const val OP_Clear: Int = 138

const val OP_ResetSorter: Int = 139

const val OP_CreateBtree: Int = 140

const val OP_Real: Int = 141

const val OP_SqlExec: Int = 142

const val OP_ParseSchema: Int = 143

const val OP_LoadAnalysis: Int = 144

const val OP_DropTable: Int = 145

const val OP_DropIndex: Int = 146

const val OP_DropTrigger: Int = 147

const val OP_IntegrityCk: Int = 148

const val OP_RowSetAdd: Int = 149

const val OP_Param: Int = 150

const val OP_FkCounter: Int = 151

const val OP_MemMax: Int = 152

const val OP_OffsetLimit: Int = 153

const val OP_AggInverse: Int = 154

const val OP_AggStep: Int = 155

const val OP_AggStep1: Int = 156

const val OP_AggValue: Int = 157

const val OP_AggFinal: Int = 158

const val OP_Expire: Int = 159

const val OP_TableLock: Int = 160

const val OP_VBegin: Int = 161

const val OP_VCreate: Int = 162

const val OP_VDestroy: Int = 163

const val OP_VOpen: Int = 164

const val OP_VColumn: Int = 165

const val OP_VRename: Int = 166

const val OP_Pagecount: Int = 167

const val OP_MaxPgcnt: Int = 168

const val OP_Trace: Int = 169

const val OP_CursorHint: Int = 170

const val OP_Noop: Int = 171

const val OP_Explain: Int = 172

const val OP_Abortable: Int = 173

const val OPFLG_JUMP: Int = 1

const val OPFLG_IN1: Int = 2

const val OPFLG_IN2: Int = 4

const val OPFLG_IN3: Int = 8

const val OPFLG_OUT2: Int = 16

const val OPFLG_OUT3: Int = 32

const val SQLITE_MX_JUMP_OPCODE: Int = 61

const val SQLITE_PREPARE_SAVESQL: Int = 128

const val SQLITE_PREPARE_MASK: Int = 15

const val SQLITE_DEFAULT_JOURNAL_SIZE_LIMIT: Int = -1

const val PAGER_OMIT_JOURNAL: Int = 1

const val PAGER_MEMORY: Int = 2

const val PAGER_LOCKINGMODE_QUERY: Int = -1

const val PAGER_LOCKINGMODE_NORMAL: Int = 0

const val PAGER_LOCKINGMODE_EXCLUSIVE: Int = 1

const val PAGER_JOURNALMODE_QUERY: Int = -1

const val PAGER_JOURNALMODE_DELETE: Int = 0

const val PAGER_JOURNALMODE_PERSIST: Int = 1

const val PAGER_JOURNALMODE_OFF: Int = 2

const val PAGER_JOURNALMODE_TRUNCATE: Int = 3

const val PAGER_JOURNALMODE_MEMORY: Int = 4

const val PAGER_JOURNALMODE_WAL: Int = 5

const val PAGER_GET_NOCONTENT: Int = 1

const val PAGER_GET_READONLY: Int = 2

const val PAGER_SYNCHRONOUS_OFF: Int = 1

const val PAGER_SYNCHRONOUS_NORMAL: Int = 2

const val PAGER_SYNCHRONOUS_FULL: Int = 3

const val PAGER_SYNCHRONOUS_EXTRA: Int = 4

const val PAGER_SYNCHRONOUS_MASK: Int = 7

const val PAGER_FULLFSYNC: Int = 8

const val PAGER_CKPT_FULLFSYNC: Int = 16

const val PAGER_CACHESPILL: Int = 32

const val PAGER_FLAGS_MASK: Int = 56

const val PGHDR_CLEAN: Int = 1

const val PGHDR_DIRTY: Int = 2

const val PGHDR_WRITEABLE: Int = 4

const val PGHDR_NEED_SYNC: Int = 8

const val PGHDR_DONT_WRITE: Int = 16

const val PGHDR_MMAP: Int = 32

const val PGHDR_WAL_APPEND: Int = 64

const val SQLITE_OS_OTHER: Int = 0

const val SQLITE_OS_WIN: Int = 1

const val SQLITE_OS_UNIX: Int = 0

const val SQLITE_DEFAULT_SECTOR_SIZE: Int = 4096

val SQLITE_TEMP_FILE_PREFIX: String get() = "etilqs_"

const val NO_LOCK: Int = 0

const val SHARED_LOCK: Int = 1

const val RESERVED_LOCK: Int = 2

const val PENDING_LOCK: Int = 3

const val EXCLUSIVE_LOCK: Int = 4

const val SHARED_SIZE: Int = 510

const val SQLITE_FCNTL_DB_UNCHANGED: UInt = 3389603744u

const val SQLITE_DEFAULT_SYNCHRONOUS: Int = 2

const val SQLITE_DEFAULT_WAL_SYNCHRONOUS: Int = 2

const val DB_SchemaLoaded: Int = 1

const val DB_UnresetViews: Int = 2

const val DB_Empty: Int = 4

const val DB_ResetWanted: Int = 8

const val SQLITE_N_LIMIT: Int = 12

const val SQLITE_FUNC_HASH_SZ: Int = 23

const val SQLITE_TRACE_LEGACY: Int = 64

const val SQLITE_TRACE_XPROFILE: Int = 128

const val SQLITE_TRACE_NONLEGACY_MASK: Int = 15

const val SQLITE_WriteSchema: Int = 1

const val SQLITE_LegacyFileFmt: Int = 2

const val SQLITE_FullColNames: Int = 4

const val SQLITE_FullFSync: Int = 8

const val SQLITE_CkptFullFSync: Int = 16

const val SQLITE_CacheSpill: Int = 32

const val SQLITE_ShortColNames: Int = 64

const val SQLITE_CountRows: Int = 128

const val SQLITE_NullCallback: Int = 256

const val SQLITE_IgnoreChecks: Int = 512

const val SQLITE_ReadUncommit: Int = 1024

const val SQLITE_NoCkptOnClose: Int = 2048

const val SQLITE_ReverseOrder: Int = 4096

const val SQLITE_RecTriggers: Int = 8192

const val SQLITE_ForeignKeys: Int = 16384

const val SQLITE_AutoIndex: Int = 32768

const val SQLITE_LoadExtension: Int = 65536

const val SQLITE_LoadExtFunc: Int = 131072

const val SQLITE_EnableTrigger: Int = 262144

const val SQLITE_DeferFKs: Int = 524288

const val SQLITE_QueryOnly: Int = 1048576

const val SQLITE_CellSizeCk: Int = 2097152

const val SQLITE_Fts3Tokenizer: Int = 4194304

const val SQLITE_EnableQPSG: Int = 8388608

const val SQLITE_TriggerEQP: Int = 16777216

const val SQLITE_ResetDatabase: Int = 33554432

const val SQLITE_LegacyAlter: Int = 67108864

const val SQLITE_NoSchemaError: Int = 134217728

const val SQLITE_Defensive: Int = 268435456

const val DBFLAG_SchemaChange: Int = 1

const val DBFLAG_PreferBuiltin: Int = 2

const val DBFLAG_Vacuum: Int = 4

const val DBFLAG_SchemaKnownOk: Int = 8

const val SQLITE_QueryFlattener: Int = 1

const val SQLITE_GroupByOrder: Int = 4

const val SQLITE_FactorOutConst: Int = 8

const val SQLITE_DistinctOpt: Int = 16

const val SQLITE_CoverIdxScan: Int = 32

const val SQLITE_OrderByIdxJoin: Int = 64

const val SQLITE_Transitive: Int = 128

const val SQLITE_OmitNoopJoin: Int = 256

const val SQLITE_CountOfView: Int = 512

const val SQLITE_CursorHints: Int = 1024

const val SQLITE_Stat34: Int = 2048

const val SQLITE_PushDown: Int = 4096

const val SQLITE_SimplifyJoin: Int = 8192

const val SQLITE_SkipScan: Int = 16384

const val SQLITE_PropagateConst: Int = 32768

const val SQLITE_AllOpts: Int = 65535

const val SQLITE_MAGIC_OPEN: UInt = 2687084183u

const val SQLITE_MAGIC_CLOSED: UInt = 2671521075u

const val SQLITE_MAGIC_SICK: Int = 1266094736

const val SQLITE_MAGIC_BUSY: UInt = 4030429446u

const val SQLITE_MAGIC_ERROR: UInt = 3040180528u

const val SQLITE_MAGIC_ZOMBIE: Int = 1691352191

const val SQLITE_FUNC_ENCMASK: Int = 3

const val SQLITE_FUNC_LIKE: Int = 4

const val SQLITE_FUNC_CASE: Int = 8

const val SQLITE_FUNC_EPHEM: Int = 16

const val SQLITE_FUNC_NEEDCOLL: Int = 32

const val SQLITE_FUNC_LENGTH: Int = 64

const val SQLITE_FUNC_TYPEOF: Int = 128

const val SQLITE_FUNC_COUNT: Int = 256

const val SQLITE_FUNC_COALESCE: Int = 512

const val SQLITE_FUNC_UNLIKELY: Int = 1024

const val SQLITE_FUNC_CONSTANT: Int = 2048

const val SQLITE_FUNC_MINMAX: Int = 4096

const val SQLITE_FUNC_SLOCHNG: Int = 8192

const val SQLITE_FUNC_AFFINITY: Int = 16384

const val SQLITE_FUNC_OFFSET: Int = 32768

const val SQLITE_FUNC_WINDOW: Int = 65536

const val SQLITE_FUNC_WINDOW_SIZE: Int = 131072

const val SQLITE_FUNC_INTERNAL: Int = 262144

const val SAVEPOINT_BEGIN: Int = 0

const val SAVEPOINT_RELEASE: Int = 1

const val SAVEPOINT_ROLLBACK: Int = 2

const val COLFLAG_PRIMKEY: Int = 1

const val COLFLAG_HIDDEN: Int = 2

const val COLFLAG_HASTYPE: Int = 4

const val COLFLAG_UNIQUE: Int = 8

const val COLFLAG_SORTERREF: Int = 16

const val SQLITE_SO_ASC: Int = 0

const val SQLITE_SO_DESC: Int = 1

const val SQLITE_SO_UNDEFINED: Int = -1

const val SQLITE_AFF_BLOB: Int = 65

const val SQLITE_AFF_TEXT: Int = 66

const val SQLITE_AFF_NUMERIC: Int = 67

const val SQLITE_AFF_INTEGER: Int = 68

const val SQLITE_AFF_REAL: Int = 69

const val SQLITE_AFF_MASK: Int = 71

const val SQLITE_KEEPNULL: Int = 8

const val SQLITE_JUMPIFNULL: Int = 16

const val SQLITE_STOREP2: Int = 32

const val SQLITE_NULLEQ: Int = 128

const val SQLITE_NOTNULL: Int = 144

const val TF_Readonly: Int = 1

const val TF_Ephemeral: Int = 2

const val TF_HasPrimaryKey: Int = 4

const val TF_Autoincrement: Int = 8

const val TF_HasStat1: Int = 16

const val TF_WithoutRowid: Int = 32

const val TF_NoVisibleRowid: Int = 64

const val TF_OOOHidden: Int = 128

const val TF_StatsUsed: Int = 256

const val TF_HasNotNull: Int = 512

const val TF_Shadow: Int = 1024

const val OE_None: Int = 0

const val OE_Rollback: Int = 1

const val OE_Abort: Int = 2

const val OE_Fail: Int = 3

const val OE_Ignore: Int = 4

const val OE_Replace: Int = 5

const val OE_Update: Int = 6

const val OE_Restrict: Int = 7

const val OE_SetNull: Int = 8

const val OE_SetDflt: Int = 9

const val OE_Cascade: Int = 10

const val OE_Default: Int = 11

const val SQLITE_IDXTYPE_APPDEF: Int = 0

const val SQLITE_IDXTYPE_UNIQUE: Int = 1

const val SQLITE_IDXTYPE_PRIMARYKEY: Int = 2

const val SQLITE_IDXTYPE_IPK: Int = 3

const val XN_ROWID: Int = -1

const val XN_EXPR: Int = -2

const val SQLITE_TOKEN_QUOTED: Int = 1

const val SQLITE_TOKEN_KEYWORD: Int = 2

const val EP_FromJoin: Int = 1

const val EP_Agg: Int = 2

const val EP_HasFunc: Int = 4

const val EP_FixedCol: Int = 8

const val EP_Distinct: Int = 16

const val EP_VarSelect: Int = 32

const val EP_DblQuoted: Int = 64

const val EP_InfixFunc: Int = 128

const val EP_Collate: Int = 256

const val EP_Generic: Int = 512

const val EP_IntValue: Int = 1024

const val EP_xIsSelect: Int = 2048

const val EP_Skip: Int = 4096

const val EP_Reduced: Int = 8192

const val EP_TokenOnly: Int = 16384

const val EP_Static: Int = 32768

const val EP_MemToken: Int = 65536

const val EP_NoReduce: Int = 131072

const val EP_Unlikely: Int = 262144

const val EP_ConstFunc: Int = 524288

const val EP_CanBeNull: Int = 1048576

const val EP_Subquery: Int = 2097152

const val EP_Alias: Int = 4194304

const val EP_Leaf: Int = 8388608

const val EP_WinFunc: Int = 16777216

const val EP_Subrtn: Int = 33554432

const val EP_Quoted: Int = 67108864

const val EP_Propagate: Int = 2097412

const val EXPR_FULLSIZE: ULong = 72u

const val EXPR_REDUCEDSIZE: ULong = 44u

const val EXPR_TOKENONLYSIZE: ULong = 16u

const val EXPRDUP_REDUCE: Int = 1

const val JT_INNER: Int = 1

const val JT_CROSS: Int = 2

const val JT_NATURAL: Int = 4

const val JT_LEFT: Int = 8

const val JT_RIGHT: Int = 16

const val JT_OUTER: Int = 32

const val JT_ERROR: Int = 64

const val WHERE_ORDERBY_NORMAL: Int = 0

const val WHERE_ORDERBY_MIN: Int = 1

const val WHERE_ORDERBY_MAX: Int = 2

const val WHERE_ONEPASS_DESIRED: Int = 4

const val WHERE_ONEPASS_MULTIROW: Int = 8

const val WHERE_DUPLICATES_OK: Int = 16

const val WHERE_OR_SUBCLAUSE: Int = 32

const val WHERE_GROUPBY: Int = 64

const val WHERE_DISTINCTBY: Int = 128

const val WHERE_WANT_DISTINCT: Int = 256

const val WHERE_SORTBYGROUP: Int = 512

const val WHERE_SEEK_TABLE: Int = 1024

const val WHERE_ORDERBY_LIMIT: Int = 2048

const val WHERE_SEEK_UNIQ_TABLE: Int = 4096

const val WHERE_USE_LIMIT: Int = 16384

const val WHERE_DISTINCT_NOOP: Int = 0

const val WHERE_DISTINCT_UNIQUE: Int = 1

const val WHERE_DISTINCT_ORDERED: Int = 2

const val WHERE_DISTINCT_UNORDERED: Int = 3

const val NC_AllowAgg: Int = 1

const val NC_PartIdx: Int = 2

const val NC_IsCheck: Int = 4

const val NC_InAggFunc: Int = 8

const val NC_HasAgg: Int = 16

const val NC_IdxExpr: Int = 32

const val NC_VarSelect: Int = 64

const val NC_UEList: Int = 128

const val NC_UAggInfo: Int = 256

const val NC_UUpsert: Int = 512

const val NC_MinMaxAgg: Int = 4096

const val NC_Complex: Int = 8192

const val NC_AllowWin: Int = 16384

const val SF_Distinct: Int = 1

const val SF_All: Int = 2

const val SF_Resolved: Int = 4

const val SF_Aggregate: Int = 8

const val SF_HasAgg: Int = 16

const val SF_UsesEphemeral: Int = 32

const val SF_Expanded: Int = 64

const val SF_HasTypeInfo: Int = 128

const val SF_Compound: Int = 256

const val SF_Values: Int = 512

const val SF_MultiValue: Int = 1024

const val SF_NestedFrom: Int = 2048

const val SF_MinMaxAgg: Int = 4096

const val SF_Recursive: Int = 8192

const val SF_FixedLimit: Int = 16384

const val SF_MaybeConvert: Int = 32768

const val SF_Converted: Int = 65536

const val SF_IncludeHidden: Int = 131072

const val SF_ComplexResult: Int = 262144

const val SRT_Union: Int = 1

const val SRT_Except: Int = 2

const val SRT_Exists: Int = 3

const val SRT_Discard: Int = 4

const val SRT_Fifo: Int = 5

const val SRT_DistFifo: Int = 6

const val SRT_Queue: Int = 7

const val SRT_DistQueue: Int = 8

const val SRT_Output: Int = 9

const val SRT_Mem: Int = 10

const val SRT_Set: Int = 11

const val SRT_EphemTab: Int = 12

const val SRT_Coroutine: Int = 13

const val SRT_Table: Int = 14

const val PARSE_MODE_NORMAL: Int = 0

const val PARSE_MODE_DECLARE_VTAB: Int = 1

const val PARSE_MODE_RENAME_COLUMN: Int = 2

const val PARSE_MODE_RENAME_TABLE: Int = 3

const val PARSE_HDR_SZ: ULong = 196u

const val PARSE_RECURSE_SZ: ULong = 248u

const val PARSE_TAIL_SZ: ULong = 160u

const val OPFLAG_NCHANGE: Int = 1

const val OPFLAG_NOCHNG: Int = 1

const val OPFLAG_EPHEM: Int = 1

const val OPFLAG_LASTROWID: Int = 32

const val OPFLAG_ISUPDATE: Int = 4

const val OPFLAG_APPEND: Int = 8

const val OPFLAG_USESEEKRESULT: Int = 16

const val OPFLAG_ISNOOP: Int = 64

const val OPFLAG_LENGTHARG: Int = 64

const val OPFLAG_TYPEOFARG: Int = 128

const val OPFLAG_BULKCSR: Int = 1

const val OPFLAG_SEEKEQ: Int = 2

const val OPFLAG_FORDELETE: Int = 8

const val OPFLAG_P2ISREG: Int = 16

const val OPFLAG_PERMUTE: Int = 1

const val OPFLAG_SAVEPOSITION: Int = 2

const val OPFLAG_AUXDELETE: Int = 4

const val OPFLAG_NOCHNG_MAGIC: Int = 109

const val TRIGGER_BEFORE: Int = 1

const val TRIGGER_AFTER: Int = 2

const val SQLITE_PRINTF_INTERNAL: Int = 1

const val SQLITE_PRINTF_SQLFUNC: Int = 2

const val SQLITE_PRINTF_MALLOCED: Int = 4

const val INITFLAG_AlterTable: Int = 1

const val WRC_Continue: Int = 0

const val WRC_Prune: Int = 1

const val WRC_Abort: Int = 2

const val SQLITE_NOMEM_BKPT: Int = 7

const val SQLITE_IOERR_NOMEM_BKPT: Int = 3082

const val ONEPASS_OFF: Int = 0

const val ONEPASS_SINGLE: Int = 1

const val ONEPASS_MULTI: Int = 2

const val SQLITE_ECEL_DUP: Int = 1

const val SQLITE_ECEL_FACTOR: Int = 2

const val SQLITE_ECEL_REF: Int = 4

const val SQLITE_ECEL_OMITREF: Int = 8

const val LOCATE_VIEW: Int = 1

const val LOCATE_NOERR: Int = 2

const val SQLITE_FAULTINJECTOR_MALLOC: Int = 0

const val SQLITE_FAULTINJECTOR_COUNT: Int = 1

const val IN_INDEX_ROWID: Int = 1

const val IN_INDEX_EPH: Int = 2

const val IN_INDEX_INDEX_ASC: Int = 3

const val IN_INDEX_INDEX_DESC: Int = 4

const val IN_INDEX_NOOP: Int = 5

const val IN_INDEX_NOOP_OK: Int = 1

const val IN_INDEX_MEMBERSHIP: Int = 2

const val IN_INDEX_LOOP: Int = 4

const val MEMTYPE_HEAP: Int = 1

const val MEMTYPE_LOOKASIDE: Int = 2

const val MEMTYPE_PCACHE: Int = 4

const val SQLITE_USE_URI: Int = 0

const val SQLITE_ALLOW_COVERING_INDEX_SCAN: Int = 1

const val SQLITE_SORTER_PMASZ: Int = 250

const val SQLITE_STMTJRNL_SPILL: Int = 65536

const val SQLITE_MEMDB_DEFAULT_MAXSIZE: Int = 1073741824

const val SQLITE_MAX_SCHEMA_RETRY: Int = 50

const val VDBE_DISPLAY_P4: Int = 1

const val CURTYPE_BTREE: Int = 0

const val CURTYPE_SORTER: Int = 1

const val CURTYPE_VTAB: Int = 2

const val CURTYPE_PSEUDO: Int = 3

const val CACHE_STALE: Int = 0

const val SQLITE_FRAME_MAGIC: UInt = 2275391262u

const val MEMCELLSIZE: ULong = 24u

const val MEM_Null: Int = 1

const val MEM_Str: Int = 2

const val MEM_Int: Int = 4

const val MEM_Real: Int = 8

const val MEM_Blob: Int = 16

const val MEM_AffMask: Int = 31

const val MEM_Undefined: Int = 128

const val MEM_Cleared: Int = 256

const val MEM_TypeMask: Int = 49663

const val MEM_Term: Int = 512

const val MEM_Dyn: Int = 1024

const val MEM_Static: Int = 2048

const val MEM_Ephem: Int = 4096

const val MEM_Agg: Int = 8192

const val MEM_Zero: Int = 16384

const val MEM_Subtype: Int = 32768

const val VDBE_MAGIC_INIT: Int = 381479589

const val VDBE_MAGIC_RUN: Int = 770837923

const val VDBE_MAGIC_HALT: Int = 832317811

const val VDBE_MAGIC_RESET: Int = 1224384374

const val VDBE_MAGIC_DEAD: Int = 1443283912

const val INT_464269060799999: Long = 464269060799999

const val TIMER_ELAPSED: sqlite_uint64 = 0u

const val SQLITE_OS_WINNT: Int = 1

const val SQLITE_OS_WINCE: Int = 0

const val SQLITE_OS_WINRT: Int = 0

const val SQLITE_OS_WIN_THREADS: Int = 1

const val etRADIX: Int = 0

const val etFLOAT: Int = 1

const val etEXP: Int = 2

const val etGENERIC: Int = 3

const val etSIZE: Int = 4

const val etSTRING: Int = 5

const val etDYNSTRING: Int = 6

const val etPERCENT: Int = 7

const val etCHARX: Int = 8

const val etSQLESCAPE: Int = 9

const val etSQLESCAPE2: Int = 10

const val etTOKEN: Int = 11

const val etSRCLIST: Int = 12

const val etPOINTER: Int = 13

const val etSQLESCAPE3: Int = 14

const val etORDINAL: Int = 15

const val etDECIMAL: Int = 16

const val etINVALID: Int = 17

const val FLAG_SIGNED: Int = 1

const val FLAG_STRING: Int = 4

const val SQLITE_PRINT_BUF_SIZE: Int = 70

const val etBUFSIZE: Int = 70

const val SQLITE_THREADS_IMPLEMENTED: Int = 1

const val SLOT_2_0: Int = 2080895

const val SLOT_4_2_0: UInt = 4028612735u

const val SQLITE_WIN32_GETVERSIONEX: Int = 1

const val SQLITE_WIN32_CREATEFILEMAPPINGA: Int = 1

const val SQLITE_WIN32_MAX_PATH_CHARS: Int = 260

const val SQLITE_WINNT_MAX_PATH_CHARS: Int = 32767

const val SQLITE_WIN32_MAX_PATH_BYTES: Int = 1040

const val SQLITE_WINNT_MAX_PATH_BYTES: ULong = 65534u

const val SQLITE_WIN32_MAX_ERRMSG_CHARS: Int = 1024

const val FILE_FLAG_MASK: UInt = 4282122240u

const val FILE_ATTRIBUTE_MASK: Int = 262135

const val WINFILE_RDONLY: Int = 2

const val WINFILE_PERSIST_WAL: Int = 4

const val WINFILE_PSOW: Int = 16

const val SQLITE_WIN32_DBG_BUF_SIZE: Int = 4092

const val SQLITE_WIN32_IOERR_RETRY: Int = 10

const val SQLITE_WIN32_IOERR_RETRY_DELAY: Int = 25

const val MX_CLOSE_ATTEMPT: Int = 3

const val SQLITE_LOCKFILE_FLAGS: Int = 3

const val SQLITE_LOCKFILEEX_FLAGS: Int = 1

const val WIN_SHM_BASE: Int = 120

const val WIN_SHM_DMS: Int = 128

const val WINSHM_UNLCK: Int = 1

const val WINSHM_RDLCK: Int = 2

const val WINSHM_WRLCK: Int = 3

const val BITVEC_SZ: Int = 512

const val BITVEC_USIZE: ULong = 496u

const val BITVEC_SZELEM: Int = 8

const val BITVEC_NELEM: ULong = 496u

const val BITVEC_NBIT: ULong = 3968u

const val BITVEC_NINT: ULong = 124u

const val BITVEC_MXHASH: ULong = 62u

const val BITVEC_NPTR: ULong = 62u

const val PCACHE_DIRTYLIST_REMOVE: Int = 1

const val PCACHE_DIRTYLIST_ADD: Int = 2

const val PCACHE_DIRTYLIST_FRONT: Int = 3

const val N_SORT_BUCKET: Int = 32

const val PCACHE1_MIGHT_USE_GROUP_MUTEX: Int = 0

const val ROWSET_ALLOCATION_SIZE: Int = 1024

const val ROWSET_ENTRY_PER_CHUNK: ULong = 42u

const val ROWSET_SORTED: Int = 1

const val ROWSET_NEXT: Int = 2

const val WAL_SAVEPOINT_NDATA: Int = 4

const val PAGER_OPEN: Int = 0

const val PAGER_READER: Int = 1

const val PAGER_WRITER_LOCKED: Int = 2

const val PAGER_WRITER_CACHEMOD: Int = 3

const val PAGER_WRITER_DBMOD: Int = 4

const val PAGER_WRITER_FINISHED: Int = 5

const val PAGER_ERROR: Int = 6

const val UNKNOWN_LOCK: Int = 5

const val MAX_SECTOR_SIZE: Int = 65536

const val SPILLFLAG_OFF: Int = 1

const val SPILLFLAG_ROLLBACK: Int = 2

const val SPILLFLAG_NOSYNC: Int = 4

const val PAGER_STAT_HIT: Int = 0

const val PAGER_STAT_MISS: Int = 1

const val PAGER_STAT_WRITE: Int = 2

const val PAGER_STAT_SPILL: Int = 3

const val PAGER_MAX_PGNO: Int = 2147483647

const val memJM: Int = 0

const val DIRECT_MODE: Int = 0

const val bBatch: Int = 0

const val WAL_MAX_VERSION: Int = 3007000

const val WALINDEX_MAX_VERSION: Int = 3007000

const val WAL_WRITE_LOCK: Int = 0

const val WAL_ALL_BUT_WRITE: Int = 1

const val WAL_CKPT_LOCK: Int = 1

const val WAL_RECOVER_LOCK: Int = 2

const val WAL_NREADER: Int = 5

const val READMARK_NOT_USED: UInt = 4294967295u

const val WALINDEX_LOCK_OFFSET: ULong = 120u

const val WALINDEX_HDR_SIZE: ULong = 136u

const val WAL_FRAME_HDRSIZE: Int = 24

const val WAL_HDRSIZE: Int = 32

const val WAL_MAGIC: Int = 931071618

const val WAL_NORMAL_MODE: Int = 0

const val WAL_EXCLUSIVE_MODE: Int = 1

const val WAL_HEAPMEMORY_MODE: Int = 2

const val WAL_RDWR: Int = 0

const val WAL_RDONLY: Int = 1

const val WAL_SHM_RDONLY: Int = 2

const val HASHTABLE_NPAGE: Int = 4096

const val HASHTABLE_HASH_1: Int = 383

const val HASHTABLE_NSLOT: Int = 8192

const val HASHTABLE_NPAGE_ONE: ULong = 4062u

const val WALINDEX_PGSZ: ULong = 32768u

const val WAL_RETRY: Int = -1

val SQLITE_FILE_HEADER: String get() = "SQLite format 3"

const val PTF_INTKEY: Int = 1

const val PTF_ZERODATA: Int = 2

const val PTF_LEAFDATA: Int = 4

const val PTF_LEAF: Int = 8

const val READ_LOCK: Int = 1

const val WRITE_LOCK: Int = 2

const val TRANS_NONE: Int = 0

const val TRANS_READ: Int = 1

const val TRANS_WRITE: Int = 2

const val BTS_READ_ONLY: Int = 1

const val BTS_PAGESIZE_FIXED: Int = 2

const val BTS_SECURE_DELETE: Int = 4

const val BTS_OVERWRITE: Int = 8

const val BTS_FAST_SECURE: Int = 12

const val BTS_INITIALLY_EMPTY: Int = 16

const val BTS_NO_WAL: Int = 32

const val BTS_EXCLUSIVE: Int = 64

const val BTS_PENDING: Int = 128

const val BTCURSOR_MAX_DEPTH: Int = 20

const val BTCF_WriteFlag: Int = 1

const val BTCF_ValidNKey: Int = 2

const val BTCF_ValidOvfl: Int = 4

const val BTCF_AtLast: Int = 8

const val BTCF_Incrblob: Int = 16

const val BTCF_Multiple: Int = 32

const val CURSOR_VALID: Int = 0

const val CURSOR_INVALID: Int = 1

const val CURSOR_SKIPNEXT: Int = 2

const val CURSOR_REQUIRESEEK: Int = 3

const val CURSOR_FAULT: Int = 4

const val PTRMAP_ROOTPAGE: Int = 1

const val PTRMAP_FREEPAGE: Int = 2

const val PTRMAP_OVERFLOW1: Int = 3

const val PTRMAP_OVERFLOW2: Int = 4

const val PTRMAP_BTREE: Int = 5

const val BTALLOC_ANY: Int = 0

const val BTALLOC_EXACT: Int = 1

const val BTALLOC_LE: Int = 2

const val NN: Int = 1

const val NB: Int = 3

const val MAX_6BYTE: Long = 140737488355327

const val MAX_ROWID: i64 = 9223372036854775807

const val SQLITE_MAX_PMASZ: Int = 536870912

const val SORTER_TYPE_INTEGER: Int = 1

const val SORTER_TYPE_TEXT: Int = 2

const val SORTER_MAX_MERGE_COUNT: Int = 16

const val INCRINIT_NORMAL: Int = 0

const val INCRINIT_TASK: Int = 1

const val INCRINIT_ROOT: Int = 2

const val MEMJOURNAL_DFLT_FILECHUNKSIZE: Int = 1024

const val IsStat4: Int = 0

const val IsStat3: Int = 0

const val SQLITE_STAT4_SAMPLES: Int = 1

const val IsStat34: Int = 0

const val STAT_GET_STAT1: Int = 0

const val STAT_GET_ROWID: Int = 1

const val STAT_GET_NEQ: Int = 2

const val STAT_GET_NLT: Int = 3

const val STAT_GET_NDLT: Int = 4

const val SQLITE_MAX_SRCLIST: Int = 200

const val FUNC_PERFECT_MATCH: Int = 6

const val SQLITE_MATCH: Int = 0

const val SQLITE_NOMATCH: Int = 1

const val SQLITE_NOWILDCARDMATCH: Int = 2

const val CKCNSTRNT_COLUMN: Int = 1

const val CKCNSTRNT_ROWID: Int = 2

const val sqlite3_column_database_name: Int = 0

const val sqlite3_column_database_name16: Int = 0

const val sqlite3_column_table_name: Int = 0

const val sqlite3_column_table_name16: Int = 0

const val sqlite3_column_origin_name: Int = 0

const val sqlite3_column_origin_name16: Int = 0

const val SQLITE_ENABLE_LOCKING_STYLE: Int = 0

const val PragTyp_HEADER_VALUE: Int = 0

const val PragTyp_AUTO_VACUUM: Int = 1

const val PragTyp_FLAG: Int = 2

const val PragTyp_BUSY_TIMEOUT: Int = 3

const val PragTyp_CACHE_SIZE: Int = 4

const val PragTyp_CACHE_SPILL: Int = 5

const val PragTyp_CASE_SENSITIVE_LIKE: Int = 6

const val PragTyp_COLLATION_LIST: Int = 7

const val PragTyp_COMPILE_OPTIONS: Int = 8

const val PragTyp_DATA_STORE_DIRECTORY: Int = 9

const val PragTyp_DATABASE_LIST: Int = 10

const val PragTyp_DEFAULT_CACHE_SIZE: Int = 11

const val PragTyp_ENCODING: Int = 12

const val PragTyp_FOREIGN_KEY_CHECK: Int = 13

const val PragTyp_FOREIGN_KEY_LIST: Int = 14

const val PragTyp_FUNCTION_LIST: Int = 15

const val PragTyp_INCREMENTAL_VACUUM: Int = 16

const val PragTyp_INDEX_INFO: Int = 17

const val PragTyp_INDEX_LIST: Int = 18

const val PragTyp_INTEGRITY_CHECK: Int = 19

const val PragTyp_JOURNAL_MODE: Int = 20

const val PragTyp_JOURNAL_SIZE_LIMIT: Int = 21

const val PragTyp_LOCK_PROXY_FILE: Int = 22

const val PragTyp_LOCKING_MODE: Int = 23

const val PragTyp_PAGE_COUNT: Int = 24

const val PragTyp_MMAP_SIZE: Int = 25

const val PragTyp_MODULE_LIST: Int = 26

const val PragTyp_OPTIMIZE: Int = 27

const val PragTyp_PAGE_SIZE: Int = 28

const val PragTyp_PRAGMA_LIST: Int = 29

const val PragTyp_SECURE_DELETE: Int = 30

const val PragTyp_SHRINK_MEMORY: Int = 31

const val PragTyp_SOFT_HEAP_LIMIT: Int = 32

const val PragTyp_SYNCHRONOUS: Int = 33

const val PragTyp_TABLE_INFO: Int = 34

const val PragTyp_TEMP_STORE: Int = 35

const val PragTyp_TEMP_STORE_DIRECTORY: Int = 36

const val PragTyp_THREADS: Int = 37

const val PragTyp_WAL_AUTOCHECKPOINT: Int = 38

const val PragTyp_WAL_CHECKPOINT: Int = 39

const val PragTyp_ACTIVATE_EXTENSIONS: Int = 40

const val PragTyp_HEXKEY: Int = 41

const val PragTyp_KEY: Int = 42

const val PragTyp_LOCK_STATUS: Int = 43

const val PragTyp_STATS: Int = 44

const val PragFlg_NeedSchema: Int = 1

const val PragFlg_NoColumns: Int = 2

const val PragFlg_NoColumns1: Int = 4

const val PragFlg_ReadOnly: Int = 8

const val PragFlg_Result0: Int = 16

const val PragFlg_Result1: Int = 32

const val PragFlg_SchemaOpt: Int = 64

const val PragFlg_SchemaReq: Int = 128

const val SQLITE_INTEGRITY_CHECK_ERROR_MAX: Int = 100

const val SORTFLAG_UseSorter: Int = 1

const val WHERE_LOOP_XFER_SZ: ULong = 48u

const val N_OR_COST: Int = 3

const val TERM_DYNAMIC: Int = 1

const val TERM_VIRTUAL: Int = 2

const val TERM_CODED: Int = 4

const val TERM_COPIED: Int = 8

const val TERM_ORINFO: Int = 16

const val TERM_ANDINFO: Int = 32

const val TERM_OR_OK: Int = 64

const val TERM_VNULL: Int = 0

const val TERM_LIKEOPT: Int = 256

const val TERM_LIKECOND: Int = 512

const val TERM_LIKE: Int = 1024

const val TERM_IS: Int = 2048

const val TERM_VARSELECT: Int = 4096

const val SQLITE_BLDF_INDEXED: Int = 1

const val SQLITE_BLDF_UNIQUE: Int = 2

const val SQLITE_QUERY_PLANNER_LIMIT: Int = 20000

const val SQLITE_QUERY_PLANNER_LIMIT_INCR: Int = 1000

const val WO_IN: Int = 1

const val WO_EQ: Int = 2

const val WO_LT: Int = 16

const val WO_LE: Int = 8

const val WO_GT: Int = 4

const val WO_GE: Int = 32

const val WO_AUX: Int = 64

const val WO_IS: Int = 128

const val WO_ISNULL: Int = 256

const val WO_OR: Int = 512

const val WO_AND: Int = 1024

const val WO_EQUIV: Int = 2048

const val WO_NOOP: Int = 4096

const val WO_ALL: Int = 8191

const val WO_SINGLE: Int = 511

const val WHERE_COLUMN_EQ: Int = 1

const val WHERE_COLUMN_RANGE: Int = 2

const val WHERE_COLUMN_IN: Int = 4

const val WHERE_COLUMN_NULL: Int = 8

const val WHERE_CONSTRAINT: Int = 15

const val WHERE_TOP_LIMIT: Int = 16

const val WHERE_BTM_LIMIT: Int = 32

const val WHERE_BOTH_LIMIT: Int = 48

const val WHERE_IDX_ONLY: Int = 64

const val WHERE_IPK: Int = 256

const val WHERE_INDEXED: Int = 512

const val WHERE_VIRTUALTABLE: Int = 1024

const val WHERE_IN_ABLE: Int = 2048

const val WHERE_ONEROW: Int = 4096

const val WHERE_MULTI_OR: Int = 8192

const val WHERE_AUTO_INDEX: Int = 16384

const val WHERE_SKIPSCAN: Int = 32768

const val WHERE_UNQ_WANTED: Int = 65536

const val WHERE_PARTIALIDX: Int = 131072

const val WHERE_IN_EARLYOUT: Int = 262144

const val YYNOERRORRECOVERY: Int = 1

const val YYPARSEFREENEVERNULL: Int = 1

const val sqlite3Parser_ENGINEALWAYSONSTACK: Int = 1

const val YYNOCODE: Int = 278

const val YYWILDCARD: Int = 91

const val YYSTACKDEPTH: Int = 100

const val YYFALLBACK: Int = 1

const val YYNSTATE: Int = 524

const val YYNRULE: Int = 369

const val YYNTOKEN: Int = 155

const val YY_MAX_SHIFT: Int = 523

const val YY_MIN_SHIFTREDUCE: Int = 760

const val YY_MAX_SHIFTREDUCE: Int = 1128

const val YY_ERROR_ACTION: Int = 1129

const val YY_ACCEPT_ACTION: Int = 1130

const val YY_NO_ACTION: Int = 1131

const val YY_MIN_REDUCE: Int = 1132

const val YY_MAX_REDUCE: Int = 1500

const val YY_NLOOKAHEAD: Int = 2019

const val YY_ACTTAB_COUNT: Int = 2009

const val YY_SHIFT_COUNT: Int = 523

const val YY_SHIFT_MIN: Int = 0

const val YY_SHIFT_MAX: Int = 1858

const val YY_REDUCE_COUNT: Int = 372

const val YY_REDUCE_MIN: Int = -235

const val YY_REDUCE_MAX: Int = 1441

const val CC_X: Int = 0

const val CC_KYWD: Int = 1

const val CC_ID: Int = 2

const val CC_DIGIT: Int = 3

const val CC_DOLLAR: Int = 4

const val CC_VARALPHA: Int = 5

const val CC_VARNUM: Int = 6

const val CC_SPACE: Int = 7

const val CC_QUOTE: Int = 8

const val CC_QUOTE2: Int = 9

const val CC_PIPE: Int = 10

const val CC_MINUS: Int = 11

const val CC_LT: Int = 12

const val CC_GT: Int = 13

const val CC_EQ: Int = 14

const val CC_BANG: Int = 15

const val CC_SLASH: Int = 16

const val CC_LP: Int = 17

const val CC_RP: Int = 18

const val CC_SEMI: Int = 19

const val CC_PLUS: Int = 20

const val CC_STAR: Int = 21

const val CC_PERCENT: Int = 22

const val CC_COMMA: Int = 23

const val CC_AND: Int = 24

const val CC_TILDA: Int = 25

const val CC_DOT: Int = 26

const val CC_ILLEGAL: Int = 27

const val CC_NUL: Int = 28

const val SQLITE_N_KEYWORD: Int = 136

const val tkSEMI: Int = 0

const val tkWS: Int = 1

const val tkOTHER: Int = 2

const val tkEXPLAIN: Int = 3

const val tkCREATE: Int = 4

const val tkTEMP: Int = 5

const val tkTRIGGER: Int = 6

const val tkEND: Int = 7

val SQLITE_STATIC: sqlite3_destructor_type?
    get() = interpretCPointer<CFunction<(COpaquePointer?) -> Unit>>(kniBridge98())

val SQLITE_TRANSIENT: sqlite3_destructor_type?
    get() = interpretCPointer<CFunction<(COpaquePointer?) -> Unit>>(kniBridge99())

val SQLITE_DYNAMIC: sqlite3_destructor_type?
    get() = interpretCPointer<CFunction<(COpaquePointer?) -> Unit>>(kniBridge100())

val PENDING_BYTE: Int
    get() = kniBridge101()

val RESERVED_BYTE: Int
    get() = kniBridge102()

val SHARED_FIRST: Int
    get() = kniBridge103()

val CORRUPT_DB: Int
    get() = kniBridge104()

val SQLITE_CORRUPT_BKPT: Int
    get() = kniBridge105()

val SQLITE_MISUSE_BKPT: Int
    get() = kniBridge106()

val SQLITE_CANTOPEN_BKPT: Int
    get() = kniBridge107()

val sqlite3StrNICmp: CPointer<CFunction<(CPointer<ByteVar>?, CPointer<ByteVar>?, Int) -> Int>>?
    get() = interpretCPointer<CFunction<(CPointer<ByteVar>?, CPointer<ByteVar>?, Int) -> Int>>(kniBridge108())

val getVarint: CPointer<CFunction<(CPointer<UByteVar>?, CPointer<u64Var>?) -> u8>>?
    get() = interpretCPointer<CFunction<(CPointer<UByteVar>?, CPointer<u64Var>?) -> u8>>(kniBridge109())

val putVarint: CPointer<CFunction<(CPointer<UByteVar>?, u64) -> Int>>?
    get() = interpretCPointer<CFunction<(CPointer<UByteVar>?, u64) -> Int>>(kniBridge110())

val vfsList_: CPointer<sqlite3_vfs>?
    get() = interpretCPointer<sqlite3_vfs>(kniBridge111())

val UpperToLower: CPointer<UByteVar>?
    get() = interpretCPointer<UByteVar>(kniBridge112())

val osAreFileApisANSI: CPointer<CFunction<() -> BOOL>>?
    get() = interpretCPointer<CFunction<() -> BOOL>>(kniBridge113())

val osCharLowerW: CPointer<CFunction<(LPWSTR?) -> LPWSTR?>>?
    get() = interpretCPointer<CFunction<(LPWSTR?) -> LPWSTR?>>(kniBridge114())

val osCharUpperW: CPointer<CFunction<(LPWSTR?) -> LPWSTR?>>?
    get() = interpretCPointer<CFunction<(LPWSTR?) -> LPWSTR?>>(kniBridge115())

val osCloseHandle: CPointer<CFunction<(HANDLE?) -> BOOL>>?
    get() = interpretCPointer<CFunction<(HANDLE?) -> BOOL>>(kniBridge116())

val osCreateFileA: CPointer<CFunction<(LPCSTR?, DWORD, DWORD, LPSECURITY_ATTRIBUTES?, DWORD, DWORD, HANDLE?) -> HANDLE?>>?
    get() = interpretCPointer<CFunction<(LPCSTR?, DWORD, DWORD, LPSECURITY_ATTRIBUTES?, DWORD, DWORD, HANDLE?) -> HANDLE?>>(kniBridge117())

val osCreateFileW: CPointer<CFunction<(LPCWSTR?, DWORD, DWORD, LPSECURITY_ATTRIBUTES?, DWORD, DWORD, HANDLE?) -> HANDLE?>>?
    get() = interpretCPointer<CFunction<(LPCWSTR?, DWORD, DWORD, LPSECURITY_ATTRIBUTES?, DWORD, DWORD, HANDLE?) -> HANDLE?>>(kniBridge118())

val osCreateFileMappingA: CPointer<CFunction<(HANDLE?, LPSECURITY_ATTRIBUTES?, DWORD, DWORD, DWORD, LPCSTR?) -> HANDLE?>>?
    get() = interpretCPointer<CFunction<(HANDLE?, LPSECURITY_ATTRIBUTES?, DWORD, DWORD, DWORD, LPCSTR?) -> HANDLE?>>(kniBridge119())

val osCreateFileMappingW: CPointer<CFunction<(HANDLE?, LPSECURITY_ATTRIBUTES?, DWORD, DWORD, DWORD, LPCWSTR?) -> HANDLE?>>?
    get() = interpretCPointer<CFunction<(HANDLE?, LPSECURITY_ATTRIBUTES?, DWORD, DWORD, DWORD, LPCWSTR?) -> HANDLE?>>(kniBridge120())

val osCreateMutexW: CPointer<CFunction<(LPSECURITY_ATTRIBUTES?, BOOL, LPCWSTR?) -> HANDLE?>>?
    get() = interpretCPointer<CFunction<(LPSECURITY_ATTRIBUTES?, BOOL, LPCWSTR?) -> HANDLE?>>(kniBridge121())

val osDeleteFileA: CPointer<CFunction<(LPCSTR?) -> BOOL>>?
    get() = interpretCPointer<CFunction<(LPCSTR?) -> BOOL>>(kniBridge122())

val osDeleteFileW: CPointer<CFunction<(LPCWSTR?) -> BOOL>>?
    get() = interpretCPointer<CFunction<(LPCWSTR?) -> BOOL>>(kniBridge123())

val osFileTimeToLocalFileTime: CPointer<CFunction<(CPointer<FILETIME>?, LPFILETIME?) -> BOOL>>?
    get() = interpretCPointer<CFunction<(CPointer<FILETIME>?, LPFILETIME?) -> BOOL>>(kniBridge124())

val osFileTimeToSystemTime: CPointer<CFunction<(CPointer<FILETIME>?, LPSYSTEMTIME?) -> BOOL>>?
    get() = interpretCPointer<CFunction<(CPointer<FILETIME>?, LPSYSTEMTIME?) -> BOOL>>(kniBridge125())

val osFlushFileBuffers: CPointer<CFunction<(HANDLE?) -> BOOL>>?
    get() = interpretCPointer<CFunction<(HANDLE?) -> BOOL>>(kniBridge126())

val osFormatMessageA: CPointer<CFunction<(DWORD, LPCVOID?, DWORD, DWORD, LPSTR?, DWORD, CPointer<va_listVar>?) -> DWORD>>?
    get() = interpretCPointer<CFunction<(DWORD, LPCVOID?, DWORD, DWORD, LPSTR?, DWORD, CPointer<va_listVar>?) -> DWORD>>(kniBridge127())

val osFormatMessageW: CPointer<CFunction<(DWORD, LPCVOID?, DWORD, DWORD, LPWSTR?, DWORD, CPointer<va_listVar>?) -> DWORD>>?
    get() = interpretCPointer<CFunction<(DWORD, LPCVOID?, DWORD, DWORD, LPWSTR?, DWORD, CPointer<va_listVar>?) -> DWORD>>(kniBridge128())

val osFreeLibrary: CPointer<CFunction<(HMODULE?) -> BOOL>>?
    get() = interpretCPointer<CFunction<(HMODULE?) -> BOOL>>(kniBridge129())

val osGetCurrentProcessId: CPointer<CFunction<() -> DWORD>>?
    get() = interpretCPointer<CFunction<() -> DWORD>>(kniBridge130())

val osGetDiskFreeSpaceA: CPointer<CFunction<(LPCSTR?, LPDWORD?, LPDWORD?, LPDWORD?, LPDWORD?) -> BOOL>>?
    get() = interpretCPointer<CFunction<(LPCSTR?, LPDWORD?, LPDWORD?, LPDWORD?, LPDWORD?) -> BOOL>>(kniBridge131())

val osGetDiskFreeSpaceW: CPointer<CFunction<(LPCWSTR?, LPDWORD?, LPDWORD?, LPDWORD?, LPDWORD?) -> BOOL>>?
    get() = interpretCPointer<CFunction<(LPCWSTR?, LPDWORD?, LPDWORD?, LPDWORD?, LPDWORD?) -> BOOL>>(kniBridge132())

val osGetFileAttributesA: CPointer<CFunction<(LPCSTR?) -> DWORD>>?
    get() = interpretCPointer<CFunction<(LPCSTR?) -> DWORD>>(kniBridge133())

val osGetFileAttributesW: CPointer<CFunction<(LPCWSTR?) -> DWORD>>?
    get() = interpretCPointer<CFunction<(LPCWSTR?) -> DWORD>>(kniBridge134())

val osGetFileAttributesExW: CPointer<CFunction<(LPCWSTR?, GET_FILEEX_INFO_LEVELS, LPVOID?) -> BOOL>>?
    get() = interpretCPointer<CFunction<(LPCWSTR?, GET_FILEEX_INFO_LEVELS, LPVOID?) -> BOOL>>(kniBridge135())

val osGetFileSize: CPointer<CFunction<(HANDLE?, LPDWORD?) -> DWORD>>?
    get() = interpretCPointer<CFunction<(HANDLE?, LPDWORD?) -> DWORD>>(kniBridge136())

val osGetFullPathNameA: CPointer<CFunction<(LPCSTR?, DWORD, LPSTR?, CPointer<LPSTRVar>?) -> DWORD>>?
    get() = interpretCPointer<CFunction<(LPCSTR?, DWORD, LPSTR?, CPointer<LPSTRVar>?) -> DWORD>>(kniBridge137())

val osGetFullPathNameW: CPointer<CFunction<(LPCWSTR?, DWORD, LPWSTR?, CPointer<LPWSTRVar>?) -> DWORD>>?
    get() = interpretCPointer<CFunction<(LPCWSTR?, DWORD, LPWSTR?, CPointer<LPWSTRVar>?) -> DWORD>>(kniBridge138())

val osGetLastError: CPointer<CFunction<() -> DWORD>>?
    get() = interpretCPointer<CFunction<() -> DWORD>>(kniBridge139())

val osGetProcAddressA: CPointer<CFunction<(HMODULE?, LPCSTR?) -> FARPROC?>>?
    get() = interpretCPointer<CFunction<(HMODULE?, LPCSTR?) -> FARPROC?>>(kniBridge140())

val osGetSystemInfo: CPointer<CFunction<(LPSYSTEM_INFO?) -> Unit>>?
    get() = interpretCPointer<CFunction<(LPSYSTEM_INFO?) -> Unit>>(kniBridge141())

val osGetSystemTime: CPointer<CFunction<(LPSYSTEMTIME?) -> Unit>>?
    get() = interpretCPointer<CFunction<(LPSYSTEMTIME?) -> Unit>>(kniBridge142())

val osGetSystemTimeAsFileTime: CPointer<CFunction<(LPFILETIME?) -> Unit>>?
    get() = interpretCPointer<CFunction<(LPFILETIME?) -> Unit>>(kniBridge143())

val osGetTempPathA: CPointer<CFunction<(DWORD, LPSTR?) -> DWORD>>?
    get() = interpretCPointer<CFunction<(DWORD, LPSTR?) -> DWORD>>(kniBridge144())

val osGetTempPathW: CPointer<CFunction<(DWORD, LPWSTR?) -> DWORD>>?
    get() = interpretCPointer<CFunction<(DWORD, LPWSTR?) -> DWORD>>(kniBridge145())

val osGetTickCount: CPointer<CFunction<() -> DWORD>>?
    get() = interpretCPointer<CFunction<() -> DWORD>>(kniBridge146())

val osGetVersionExA: CPointer<CFunction<(LPOSVERSIONINFOA?) -> BOOL>>?
    get() = interpretCPointer<CFunction<(LPOSVERSIONINFOA?) -> BOOL>>(kniBridge147())

val osGetVersionExW: CPointer<CFunction<(LPOSVERSIONINFOW?) -> BOOL>>?
    get() = interpretCPointer<CFunction<(LPOSVERSIONINFOW?) -> BOOL>>(kniBridge148())

val osHeapAlloc: CPointer<CFunction<(HANDLE?, DWORD, SIZE_T) -> LPVOID?>>?
    get() = interpretCPointer<CFunction<(HANDLE?, DWORD, SIZE_T) -> LPVOID?>>(kniBridge149())

val osHeapCreate: CPointer<CFunction<(DWORD, SIZE_T, SIZE_T) -> HANDLE?>>?
    get() = interpretCPointer<CFunction<(DWORD, SIZE_T, SIZE_T) -> HANDLE?>>(kniBridge150())

val osHeapDestroy: CPointer<CFunction<(HANDLE?) -> BOOL>>?
    get() = interpretCPointer<CFunction<(HANDLE?) -> BOOL>>(kniBridge151())

val osHeapFree: CPointer<CFunction<(HANDLE?, DWORD, LPVOID?) -> BOOL>>?
    get() = interpretCPointer<CFunction<(HANDLE?, DWORD, LPVOID?) -> BOOL>>(kniBridge152())

val osHeapReAlloc: CPointer<CFunction<(HANDLE?, DWORD, LPVOID?, SIZE_T) -> LPVOID?>>?
    get() = interpretCPointer<CFunction<(HANDLE?, DWORD, LPVOID?, SIZE_T) -> LPVOID?>>(kniBridge153())

val osHeapSize: CPointer<CFunction<(HANDLE?, DWORD, LPCVOID?) -> SIZE_T>>?
    get() = interpretCPointer<CFunction<(HANDLE?, DWORD, LPCVOID?) -> SIZE_T>>(kniBridge154())

val osHeapValidate: CPointer<CFunction<(HANDLE?, DWORD, LPCVOID?) -> BOOL>>?
    get() = interpretCPointer<CFunction<(HANDLE?, DWORD, LPCVOID?) -> BOOL>>(kniBridge155())

val osHeapCompact: CPointer<CFunction<(HANDLE?, DWORD) -> UINT>>?
    get() = interpretCPointer<CFunction<(HANDLE?, DWORD) -> UINT>>(kniBridge156())

val osLoadLibraryA: CPointer<CFunction<(LPCSTR?) -> HMODULE?>>?
    get() = interpretCPointer<CFunction<(LPCSTR?) -> HMODULE?>>(kniBridge157())

val osLoadLibraryW: CPointer<CFunction<(LPCWSTR?) -> HMODULE?>>?
    get() = interpretCPointer<CFunction<(LPCWSTR?) -> HMODULE?>>(kniBridge158())

val osLocalFree: CPointer<CFunction<(HLOCAL?) -> HLOCAL?>>?
    get() = interpretCPointer<CFunction<(HLOCAL?) -> HLOCAL?>>(kniBridge159())

val osLockFile: CPointer<CFunction<(HANDLE?, DWORD, DWORD, DWORD, DWORD) -> BOOL>>?
    get() = interpretCPointer<CFunction<(HANDLE?, DWORD, DWORD, DWORD, DWORD) -> BOOL>>(kniBridge160())

val osLockFileEx: CPointer<CFunction<(HANDLE?, DWORD, DWORD, DWORD, DWORD, LPOVERLAPPED?) -> BOOL>>?
    get() = interpretCPointer<CFunction<(HANDLE?, DWORD, DWORD, DWORD, DWORD, LPOVERLAPPED?) -> BOOL>>(kniBridge161())

val osMapViewOfFile: CPointer<CFunction<(HANDLE?, DWORD, DWORD, DWORD, SIZE_T) -> LPVOID?>>?
    get() = interpretCPointer<CFunction<(HANDLE?, DWORD, DWORD, DWORD, SIZE_T) -> LPVOID?>>(kniBridge162())

val osMultiByteToWideChar: CPointer<CFunction<(UINT, DWORD, LPCSTR?, Int, LPWSTR?, Int) -> Int>>?
    get() = interpretCPointer<CFunction<(UINT, DWORD, LPCSTR?, Int, LPWSTR?, Int) -> Int>>(kniBridge163())

val osQueryPerformanceCounter: CPointer<CFunction<(CPointer<LARGE_INTEGER>?) -> BOOL>>?
    get() = interpretCPointer<CFunction<(CPointer<LARGE_INTEGER>?) -> BOOL>>(kniBridge164())

val osReadFile: CPointer<CFunction<(HANDLE?, LPVOID?, DWORD, LPDWORD?, LPOVERLAPPED?) -> BOOL>>?
    get() = interpretCPointer<CFunction<(HANDLE?, LPVOID?, DWORD, LPDWORD?, LPOVERLAPPED?) -> BOOL>>(kniBridge165())

val osSetEndOfFile: CPointer<CFunction<(HANDLE?) -> BOOL>>?
    get() = interpretCPointer<CFunction<(HANDLE?) -> BOOL>>(kniBridge166())

val osSetFilePointer: CPointer<CFunction<(HANDLE?, LONG, PLONG?, DWORD) -> DWORD>>?
    get() = interpretCPointer<CFunction<(HANDLE?, LONG, PLONG?, DWORD) -> DWORD>>(kniBridge167())

val osSleep: CPointer<CFunction<(DWORD) -> Unit>>?
    get() = interpretCPointer<CFunction<(DWORD) -> Unit>>(kniBridge168())

val osSystemTimeToFileTime: CPointer<CFunction<(CPointer<SYSTEMTIME>?, LPFILETIME?) -> BOOL>>?
    get() = interpretCPointer<CFunction<(CPointer<SYSTEMTIME>?, LPFILETIME?) -> BOOL>>(kniBridge169())

val osUnlockFile: CPointer<CFunction<(HANDLE?, DWORD, DWORD, DWORD, DWORD) -> BOOL>>?
    get() = interpretCPointer<CFunction<(HANDLE?, DWORD, DWORD, DWORD, DWORD) -> BOOL>>(kniBridge170())

val osUnlockFileEx: CPointer<CFunction<(HANDLE?, DWORD, DWORD, DWORD, LPOVERLAPPED?) -> BOOL>>?
    get() = interpretCPointer<CFunction<(HANDLE?, DWORD, DWORD, DWORD, LPOVERLAPPED?) -> BOOL>>(kniBridge171())

val osUnmapViewOfFile: CPointer<CFunction<(LPCVOID?) -> BOOL>>?
    get() = interpretCPointer<CFunction<(LPCVOID?) -> BOOL>>(kniBridge172())

val osWideCharToMultiByte: CPointer<CFunction<(UINT, DWORD, LPCWSTR?, Int, LPSTR?, Int, LPCSTR?, LPBOOL?) -> Int>>?
    get() = interpretCPointer<CFunction<(UINT, DWORD, LPCWSTR?, Int, LPSTR?, Int, LPCSTR?, LPBOOL?) -> Int>>(kniBridge173())

val osWriteFile: CPointer<CFunction<(HANDLE?, LPCVOID?, DWORD, LPDWORD?, LPOVERLAPPED?) -> BOOL>>?
    get() = interpretCPointer<CFunction<(HANDLE?, LPCVOID?, DWORD, LPDWORD?, LPOVERLAPPED?) -> BOOL>>(kniBridge174())

val osCreateEventExW: CPointer<CFunction<(LPSECURITY_ATTRIBUTES?, LPCWSTR?, DWORD, DWORD) -> HANDLE?>>?
    get() = interpretCPointer<CFunction<(LPSECURITY_ATTRIBUTES?, LPCWSTR?, DWORD, DWORD) -> HANDLE?>>(kniBridge175())

val osWaitForSingleObject: CPointer<CFunction<(HANDLE?, DWORD) -> DWORD>>?
    get() = interpretCPointer<CFunction<(HANDLE?, DWORD) -> DWORD>>(kniBridge176())

val osWaitForSingleObjectEx: CPointer<CFunction<(HANDLE?, DWORD, BOOL) -> DWORD>>?
    get() = interpretCPointer<CFunction<(HANDLE?, DWORD, BOOL) -> DWORD>>(kniBridge177())

val osSetFilePointerEx: CPointer<CFunction<(HANDLE?, CValue<LARGE_INTEGER>, PLARGE_INTEGER?, DWORD) -> BOOL>>?
    get() = interpretCPointer<CFunction<(HANDLE?, CValue<LARGE_INTEGER>, PLARGE_INTEGER?, DWORD) -> BOOL>>(kniBridge178())

val osGetFileInformationByHandleEx: CPointer<CFunction<(HANDLE?, FILE_INFO_BY_HANDLE_CLASS, LPVOID?, DWORD) -> BOOL>>?
    get() = interpretCPointer<CFunction<(HANDLE?, FILE_INFO_BY_HANDLE_CLASS, LPVOID?, DWORD) -> BOOL>>(kniBridge179())

val osMapViewOfFileFromApp: CPointer<CFunction<(HANDLE?, ULONG, ULONG64, SIZE_T) -> LPVOID?>>?
    get() = interpretCPointer<CFunction<(HANDLE?, ULONG, ULONG64, SIZE_T) -> LPVOID?>>(kniBridge180())

val osCreateFile2: CPointer<CFunction<(LPCWSTR?, DWORD, DWORD, DWORD, Int) -> HANDLE?>>?
    get() = interpretCPointer<CFunction<(LPCWSTR?, DWORD, DWORD, DWORD, Int) -> HANDLE?>>(kniBridge181())

val osLoadPackagedLibrary: CPointer<CFunction<(LPCWSTR?, DWORD) -> HMODULE?>>?
    get() = interpretCPointer<CFunction<(LPCWSTR?, DWORD) -> HMODULE?>>(kniBridge182())

val osGetTickCount64: CPointer<CFunction<() -> ULONGLONG>>?
    get() = interpretCPointer<CFunction<() -> ULONGLONG>>(kniBridge183())

val osGetNativeSystemInfo: CPointer<CFunction<(LPSYSTEM_INFO?) -> Unit>>?
    get() = interpretCPointer<CFunction<(LPSYSTEM_INFO?) -> Unit>>(kniBridge184())

val osOutputDebugStringA: CPointer<CFunction<(LPCSTR?) -> Unit>>?
    get() = interpretCPointer<CFunction<(LPCSTR?) -> Unit>>(kniBridge185())

val osOutputDebugStringW: CPointer<CFunction<(LPCWSTR?) -> Unit>>?
    get() = interpretCPointer<CFunction<(LPCWSTR?) -> Unit>>(kniBridge186())

val osGetProcessHeap: CPointer<CFunction<() -> HANDLE?>>?
    get() = interpretCPointer<CFunction<() -> HANDLE?>>(kniBridge187())

val osCreateFileMappingFromApp: CPointer<CFunction<(HANDLE?, LPSECURITY_ATTRIBUTES?, ULONG, ULONG64, LPCWSTR?) -> HANDLE?>>?
    get() = interpretCPointer<CFunction<(HANDLE?, LPSECURITY_ATTRIBUTES?, ULONG, ULONG64, LPCWSTR?) -> HANDLE?>>(kniBridge188())

val osInterlockedCompareExchange: CPointer<CFunction<(CPointer<IntVar>?, Int, Int) -> Int>>?
    get() = interpretCPointer<CFunction<(CPointer<IntVar>?, Int, Int) -> Int>>(kniBridge189())

val osUuidCreate: CPointer<CFunction<(CPointer<UUID>?) -> RPC_STATUS>>?
    get() = interpretCPointer<CFunction<(CPointer<UUID>?) -> RPC_STATUS>>(kniBridge190())

val osUuidCreateSequential: CPointer<CFunction<(CPointer<UUID>?) -> RPC_STATUS>>?
    get() = interpretCPointer<CFunction<(CPointer<UUID>?) -> RPC_STATUS>>(kniBridge191())

val osFlushViewOfFile: CPointer<CFunction<(LPCVOID?, SIZE_T) -> BOOL>>?
    get() = interpretCPointer<CFunction<(LPCVOID?, SIZE_T) -> BOOL>>(kniBridge192())

val get4byte: CPointer<CFunction<(CPointer<u8Var>?) -> u32>>?
    get() = interpretCPointer<CFunction<(CPointer<u8Var>?) -> u32>>(kniBridge193())

val put4byte: CPointer<CFunction<(CPointer<u8Var>?, u32) -> Unit>>?
    get() = interpretCPointer<CFunction<(CPointer<u8Var>?, u32) -> Unit>>(kniBridge194())

val noopFunc: CPointer<CFunction<(CPointer<sqlite3_context>?, Int, CPointer<CPointerVar<sqlite3_value>>?) -> Unit>>?
    get() = interpretCPointer<CFunction<(CPointer<sqlite3_context>?, Int, CPointer<CPointerVar<sqlite3_value>>?) -> Unit>>(kniBridge195())

typealias sqlite_int64Var = LongVarOf<sqlite_int64>

typealias sqlite_int64 = Long

typealias sqlite3_int64Var = LongVarOf<sqlite3_int64>

typealias sqlite3_int64 = sqlite_int64

typealias sqlite3_syscall_ptrVar = CPointerVarOf<sqlite3_syscall_ptr>

typealias sqlite3_syscall_ptr = CPointer<CFunction<() -> Unit>>

typealias u8Var = UByteVarOf<u8>

typealias u8 = UByte

typealias u32Var = UIntVarOf<u32>

typealias u32 = UInt

typealias LogEstVar = ShortVarOf<LogEst>

typealias LogEst = Short

typealias i16Var = ShortVarOf<i16>

typealias i16 = Short

typealias u16Var = UShortVarOf<u16>

typealias u16 = UShort

typealias sqlite_uint64Var = ULongVarOf<sqlite_uint64>

typealias sqlite_uint64 = ULong

typealias u64Var = ULongVarOf<u64>

typealias u64 = sqlite_uint64

typealias BitmaskVar = ULongVarOf<Bitmask>

typealias Bitmask = u64

typealias sqlite3_uint64Var = ULongVarOf<sqlite3_uint64>

typealias sqlite3_uint64 = sqlite_uint64

typealias i64Var = LongVarOf<i64>

typealias i64 = sqlite_int64

typealias i8Var = ByteVarOf<i8>

typealias i8 = Byte

typealias Mem = sqlite3_value

typealias ynVarVar = ShortVarOf<ynVar>

typealias ynVar = i16

typealias yDbMaskVar = UIntVarOf<yDbMask>

typealias yDbMask = UInt

typealias VListVar = IntVarOf<VList>

typealias VList = Int

typealias PgnoVar = UIntVarOf<Pgno>

typealias Pgno = u32

typealias DbPage = PgHdr

typealias BoolVar = UIntVarOf<Bool>

typealias Bool = UInt

typealias SorterCompareVar = CPointerVarOf<SorterCompare>

typealias SorterCompare = CPointer<CFunction<(CPointer<SortSubtask>?, CPointer<IntVar>?, COpaquePointer?, Int, COpaquePointer?, Int) -> Int>>

typealias Op = VdbeOp

typealias bftVar = UIntVarOf<bft>

typealias bft = UInt

typealias sqlite3_xauthVar = CPointerVarOf<sqlite3_xauth>

typealias sqlite3_xauth = CPointer<CFunction<(COpaquePointer?, Int, CPointer<ByteVar>?, CPointer<ByteVar>?, CPointer<ByteVar>?, CPointer<ByteVar>?) -> Int>>

typealias sqlite3_callbackVar = CPointerVarOf<sqlite3_callback>

typealias sqlite3_callback = CPointer<CFunction<(COpaquePointer?, Int, CPointer<CPointerVar<ByteVar>>?, CPointer<CPointerVar<ByteVar>>?) -> Int>>

typealias sqlite3_destructor_typeVar = CPointerVarOf<sqlite3_destructor_type>

typealias sqlite3_destructor_type = CPointer<CFunction<(COpaquePointer?) -> Unit>>

typealias sqlite3_rtree_dblVar = DoubleVarOf<sqlite3_rtree_dbl>

typealias sqlite3_rtree_dbl = Double

typealias fts5_extension_functionVar = CPointerVarOf<fts5_extension_function>

typealias fts5_extension_function = CPointer<CFunction<(CPointer<Fts5ExtensionApi>?, CPointer<Fts5Context>?, CPointer<sqlite3_context>?, Int, CPointer<CPointerVar<sqlite3_value>>?) -> Unit>>

typealias tRowcntVar = UIntVarOf<tRowcnt>

typealias tRowcnt = u32

typealias uptrVar = ULongVarOf<uptr>

typealias uptr = u64

typealias StrAccum = sqlite3_str

typealias RecordCompareVar = CPointerVarOf<RecordCompare>

typealias RecordCompare = CPointer<CFunction<(Int, COpaquePointer?, CPointer<UnpackedRecord>?) -> Int>>

typealias sqlite3StatValueTypeVar = LongVarOf<sqlite3StatValueType>

typealias sqlite3StatValueType = sqlite3_int64

typealias etByteVar = UByteVarOf<etByte>

typealias etByte = UByte

typealias ht_slotVar = UShortVarOf<ht_slot>

typealias ht_slot = u16

typealias sqlite3_loadext_entryVar = CPointerVarOf<sqlite3_loadext_entry>

typealias sqlite3_loadext_entry = CPointer<CFunction<(CPointer<sqlite3>?, CPointer<CPointerVar<ByteVar>>?, CPointer<sqlite3_api_routines>?) -> Int>>
@SymbolName("sqlite3_kniBridge0")
private external fun kniBridge0(): NativePtr
@SymbolName("sqlite3_kniBridge1")
private external fun kniBridge1(): NativePtr
@SymbolName("sqlite3_kniBridge2")
private external fun kniBridge2(): NativePtr
@SymbolName("sqlite3_kniBridge3")
private external fun kniBridge3(p0: NativePtr): Unit
@SymbolName("sqlite3_kniBridge4")
private external fun kniBridge4(): NativePtr
@SymbolName("sqlite3_kniBridge5")
private external fun kniBridge5(p0: NativePtr): Unit
@SymbolName("sqlite3_kniBridge6")
private external fun kniBridge6(): NativePtr
@SymbolName("sqlite3_kniBridge7")
private external fun kniBridge7(): NativePtr
@SymbolName("sqlite3_kniBridge8")
private external fun kniBridge8(): NativePtr
@SymbolName("sqlite3_kniBridge9")
private external fun kniBridge9(): NativePtr
@SymbolName("sqlite3_kniBridge10")
private external fun kniBridge10(): NativePtr
@SymbolName("sqlite3_kniBridge11")
private external fun kniBridge11(): Int
@SymbolName("sqlite3_kniBridge12")
private external fun kniBridge12(p0: Int): Unit
@SymbolName("sqlite3_kniBridge13")
private external fun kniBridge13(): NativePtr
@SymbolName("sqlite3_kniBridge14")
private external fun kniBridge14(): NativePtr
@SymbolName("sqlite3_kniBridge15")
private external fun kniBridge15(): NativePtr
@SymbolName("sqlite3_kniBridge16")
private external fun kniBridge16(): NativePtr
@SymbolName("sqlite3_kniBridge17")
private external fun kniBridge17(): NativePtr
@SymbolName("sqlite3_kniBridge18")
private external fun kniBridge18(): NativePtr
@SymbolName("sqlite3_kniBridge19")
private external fun kniBridge19(p0: NativePtr): Unit
@SymbolName("sqlite3_kniBridge20")
private external fun kniBridge20(): NativePtr
@SymbolName("sqlite3_kniBridge21")
private external fun kniBridge21(): NativePtr
@SymbolName("sqlite3_kniBridge22")
private external fun kniBridge22(): Int
@SymbolName("sqlite3_kniBridge23")
private external fun kniBridge23(p0: Int): Unit
@SymbolName("sqlite3_kniBridge24")
private external fun kniBridge24(): Int
@SymbolName("sqlite3_kniBridge25")
private external fun kniBridge25(p0: Int): Unit
@SymbolName("sqlite3_kniBridge26")
private external fun kniBridge26(): Int
@SymbolName("sqlite3_kniBridge27")
private external fun kniBridge27(p0: Int): Unit
@SymbolName("sqlite3_kniBridge28")
private external fun kniBridge28(): NativePtr
@SymbolName("sqlite3_kniBridge29")
private external fun kniBridge29(): NativePtr
@SymbolName("sqlite3_kniBridge30")
private external fun kniBridge30(): NativePtr
@SymbolName("sqlite3_kniBridge31")
private external fun kniBridge31(): NativePtr
@SymbolName("sqlite3_kniBridge32")
private external fun kniBridge32(): NativePtr
@SymbolName("sqlite3_kniBridge33")
private external fun kniBridge33(): NativePtr
@SymbolName("sqlite3_kniBridge34")
private external fun kniBridge34(): NativePtr
@SymbolName("sqlite3_kniBridge35")
private external fun kniBridge35(): NativePtr
@SymbolName("sqlite3_kniBridge36")
private external fun kniBridge36(): Int
@SymbolName("sqlite3_kniBridge37")
private external fun kniBridge37(p0: Int): Unit
@SymbolName("sqlite3_kniBridge38")
private external fun kniBridge38(): NativePtr
@SymbolName("sqlite3_kniBridge39")
private external fun kniBridge39(): Int
@SymbolName("sqlite3_kniBridge40")
private external fun kniBridge40(p0: Int): Unit
@SymbolName("sqlite3_kniBridge41")
private external fun kniBridge41(): Int
@SymbolName("sqlite3_kniBridge42")
private external fun kniBridge42(p0: Int): Unit
@SymbolName("sqlite3_kniBridge43")
private external fun kniBridge43(): NativePtr
@SymbolName("sqlite3_kniBridge44")
private external fun kniBridge44(): NativePtr
@SymbolName("sqlite3_kniBridge45")
private external fun kniBridge45(p0: NativePtr): Unit
@SymbolName("sqlite3_kniBridge46")
private external fun kniBridge46(): NativePtr
@SymbolName("sqlite3_kniBridge47")
private external fun kniBridge47(p0: NativePtr): Unit
@SymbolName("sqlite3_kniBridge48")
private external fun kniBridge48(): NativePtr
@SymbolName("sqlite3_kniBridge49")
private external fun kniBridge49(): NativePtr
@SymbolName("sqlite3_kniBridge50")
private external fun kniBridge50(): NativePtr
@SymbolName("sqlite3_kniBridge51")
private external fun kniBridge51(): NativePtr
@SymbolName("sqlite3_kniBridge52")
private external fun kniBridge52(): NativePtr
@SymbolName("sqlite3_kniBridge53")
private external fun kniBridge53(): NativePtr
@SymbolName("sqlite3_kniBridge54")
private external fun kniBridge54(): NativePtr
@SymbolName("sqlite3_kniBridge55")
private external fun kniBridge55(): NativePtr
@SymbolName("sqlite3_kniBridge56")
private external fun kniBridge56(p0: NativePtr): Unit
@SymbolName("sqlite3_kniBridge57")
private external fun kniBridge57(): NativePtr
@SymbolName("sqlite3_kniBridge58")
private external fun kniBridge58(): NativePtr
@SymbolName("sqlite3_kniBridge59")
private external fun kniBridge59(): NativePtr
@SymbolName("sqlite3_kniBridge60")
private external fun kniBridge60(): NativePtr
@SymbolName("sqlite3_kniBridge61")
private external fun kniBridge61(): NativePtr
@SymbolName("sqlite3_kniBridge62")
private external fun kniBridge62(): NativePtr
@SymbolName("sqlite3_kniBridge63")
private external fun kniBridge63(): NativePtr
@SymbolName("sqlite3_kniBridge64")
private external fun kniBridge64(): NativePtr
@SymbolName("sqlite3_kniBridge65")
private external fun kniBridge65(): NativePtr
@SymbolName("sqlite3_kniBridge66")
private external fun kniBridge66(): NativePtr
@SymbolName("sqlite3_kniBridge67")
private external fun kniBridge67(): NativePtr
@SymbolName("sqlite3_kniBridge68")
private external fun kniBridge68(): NativePtr
@SymbolName("sqlite3_kniBridge69")
private external fun kniBridge69(): NativePtr
@SymbolName("sqlite3_kniBridge70")
private external fun kniBridge70(): NativePtr
@SymbolName("sqlite3_kniBridge71")
private external fun kniBridge71(): NativePtr
@SymbolName("sqlite3_kniBridge72")
private external fun kniBridge72(): NativePtr
@SymbolName("sqlite3_kniBridge73")
private external fun kniBridge73(): NativePtr
@SymbolName("sqlite3_kniBridge74")
private external fun kniBridge74(): NativePtr
@SymbolName("sqlite3_kniBridge75")
private external fun kniBridge75(): NativePtr
@SymbolName("sqlite3_kniBridge76")
private external fun kniBridge76(): NativePtr
@SymbolName("sqlite3_kniBridge77")
private external fun kniBridge77(): NativePtr
@SymbolName("sqlite3_kniBridge78")
private external fun kniBridge78(): NativePtr
@SymbolName("sqlite3_kniBridge79")
private external fun kniBridge79(): NativePtr
@SymbolName("sqlite3_kniBridge80")
private external fun kniBridge80(): NativePtr
@SymbolName("sqlite3_kniBridge81")
private external fun kniBridge81(): NativePtr
@SymbolName("sqlite3_kniBridge82")
private external fun kniBridge82(): NativePtr
@SymbolName("sqlite3_kniBridge83")
private external fun kniBridge83(): NativePtr
@SymbolName("sqlite3_kniBridge84")
private external fun kniBridge84(): NativePtr
@SymbolName("sqlite3_kniBridge85")
private external fun kniBridge85(): NativePtr
@SymbolName("sqlite3_kniBridge86")
private external fun kniBridge86(): NativePtr
@SymbolName("sqlite3_kniBridge87")
private external fun kniBridge87(): NativePtr
@SymbolName("sqlite3_kniBridge88")
private external fun kniBridge88(): NativePtr
@SymbolName("sqlite3_kniBridge89")
private external fun kniBridge89(): NativePtr
@SymbolName("sqlite3_kniBridge90")
private external fun kniBridge90(): NativePtr
@SymbolName("sqlite3_kniBridge91")
private external fun kniBridge91(): NativePtr
@SymbolName("sqlite3_kniBridge92")
private external fun kniBridge92(): NativePtr
@SymbolName("sqlite3_kniBridge93")
private external fun kniBridge93(): NativePtr
@SymbolName("sqlite3_kniBridge94")
private external fun kniBridge94(): NativePtr
@SymbolName("sqlite3_kniBridge95")
private external fun kniBridge95(): NativePtr
@SymbolName("sqlite3_kniBridge96")
private external fun kniBridge96(): NativePtr
@SymbolName("sqlite3_kniBridge97")
private external fun kniBridge97(): NativePtr
@SymbolName("sqlite3_kniBridge98")
private external fun kniBridge98(): NativePtr
@SymbolName("sqlite3_kniBridge99")
private external fun kniBridge99(): NativePtr
@SymbolName("sqlite3_kniBridge100")
private external fun kniBridge100(): NativePtr
@SymbolName("sqlite3_kniBridge101")
private external fun kniBridge101(): Int
@SymbolName("sqlite3_kniBridge102")
private external fun kniBridge102(): Int
@SymbolName("sqlite3_kniBridge103")
private external fun kniBridge103(): Int
@SymbolName("sqlite3_kniBridge104")
private external fun kniBridge104(): Int
@SymbolName("sqlite3_kniBridge105")
private external fun kniBridge105(): Int
@SymbolName("sqlite3_kniBridge106")
private external fun kniBridge106(): Int
@SymbolName("sqlite3_kniBridge107")
private external fun kniBridge107(): Int
@SymbolName("sqlite3_kniBridge108")
private external fun kniBridge108(): NativePtr
@SymbolName("sqlite3_kniBridge109")
private external fun kniBridge109(): NativePtr
@SymbolName("sqlite3_kniBridge110")
private external fun kniBridge110(): NativePtr
@SymbolName("sqlite3_kniBridge111")
private external fun kniBridge111(): NativePtr
@SymbolName("sqlite3_kniBridge112")
private external fun kniBridge112(): NativePtr
@SymbolName("sqlite3_kniBridge113")
private external fun kniBridge113(): NativePtr
@SymbolName("sqlite3_kniBridge114")
private external fun kniBridge114(): NativePtr
@SymbolName("sqlite3_kniBridge115")
private external fun kniBridge115(): NativePtr
@SymbolName("sqlite3_kniBridge116")
private external fun kniBridge116(): NativePtr
@SymbolName("sqlite3_kniBridge117")
private external fun kniBridge117(): NativePtr
@SymbolName("sqlite3_kniBridge118")
private external fun kniBridge118(): NativePtr
@SymbolName("sqlite3_kniBridge119")
private external fun kniBridge119(): NativePtr
@SymbolName("sqlite3_kniBridge120")
private external fun kniBridge120(): NativePtr
@SymbolName("sqlite3_kniBridge121")
private external fun kniBridge121(): NativePtr
@SymbolName("sqlite3_kniBridge122")
private external fun kniBridge122(): NativePtr
@SymbolName("sqlite3_kniBridge123")
private external fun kniBridge123(): NativePtr
@SymbolName("sqlite3_kniBridge124")
private external fun kniBridge124(): NativePtr
@SymbolName("sqlite3_kniBridge125")
private external fun kniBridge125(): NativePtr
@SymbolName("sqlite3_kniBridge126")
private external fun kniBridge126(): NativePtr
@SymbolName("sqlite3_kniBridge127")
private external fun kniBridge127(): NativePtr
@SymbolName("sqlite3_kniBridge128")
private external fun kniBridge128(): NativePtr
@SymbolName("sqlite3_kniBridge129")
private external fun kniBridge129(): NativePtr
@SymbolName("sqlite3_kniBridge130")
private external fun kniBridge130(): NativePtr
@SymbolName("sqlite3_kniBridge131")
private external fun kniBridge131(): NativePtr
@SymbolName("sqlite3_kniBridge132")
private external fun kniBridge132(): NativePtr
@SymbolName("sqlite3_kniBridge133")
private external fun kniBridge133(): NativePtr
@SymbolName("sqlite3_kniBridge134")
private external fun kniBridge134(): NativePtr
@SymbolName("sqlite3_kniBridge135")
private external fun kniBridge135(): NativePtr
@SymbolName("sqlite3_kniBridge136")
private external fun kniBridge136(): NativePtr
@SymbolName("sqlite3_kniBridge137")
private external fun kniBridge137(): NativePtr
@SymbolName("sqlite3_kniBridge138")
private external fun kniBridge138(): NativePtr
@SymbolName("sqlite3_kniBridge139")
private external fun kniBridge139(): NativePtr
@SymbolName("sqlite3_kniBridge140")
private external fun kniBridge140(): NativePtr
@SymbolName("sqlite3_kniBridge141")
private external fun kniBridge141(): NativePtr
@SymbolName("sqlite3_kniBridge142")
private external fun kniBridge142(): NativePtr
@SymbolName("sqlite3_kniBridge143")
private external fun kniBridge143(): NativePtr
@SymbolName("sqlite3_kniBridge144")
private external fun kniBridge144(): NativePtr
@SymbolName("sqlite3_kniBridge145")
private external fun kniBridge145(): NativePtr
@SymbolName("sqlite3_kniBridge146")
private external fun kniBridge146(): NativePtr
@SymbolName("sqlite3_kniBridge147")
private external fun kniBridge147(): NativePtr
@SymbolName("sqlite3_kniBridge148")
private external fun kniBridge148(): NativePtr
@SymbolName("sqlite3_kniBridge149")
private external fun kniBridge149(): NativePtr
@SymbolName("sqlite3_kniBridge150")
private external fun kniBridge150(): NativePtr
@SymbolName("sqlite3_kniBridge151")
private external fun kniBridge151(): NativePtr
@SymbolName("sqlite3_kniBridge152")
private external fun kniBridge152(): NativePtr
@SymbolName("sqlite3_kniBridge153")
private external fun kniBridge153(): NativePtr
@SymbolName("sqlite3_kniBridge154")
private external fun kniBridge154(): NativePtr
@SymbolName("sqlite3_kniBridge155")
private external fun kniBridge155(): NativePtr
@SymbolName("sqlite3_kniBridge156")
private external fun kniBridge156(): NativePtr
@SymbolName("sqlite3_kniBridge157")
private external fun kniBridge157(): NativePtr
@SymbolName("sqlite3_kniBridge158")
private external fun kniBridge158(): NativePtr
@SymbolName("sqlite3_kniBridge159")
private external fun kniBridge159(): NativePtr
@SymbolName("sqlite3_kniBridge160")
private external fun kniBridge160(): NativePtr
@SymbolName("sqlite3_kniBridge161")
private external fun kniBridge161(): NativePtr
@SymbolName("sqlite3_kniBridge162")
private external fun kniBridge162(): NativePtr
@SymbolName("sqlite3_kniBridge163")
private external fun kniBridge163(): NativePtr
@SymbolName("sqlite3_kniBridge164")
private external fun kniBridge164(): NativePtr
@SymbolName("sqlite3_kniBridge165")
private external fun kniBridge165(): NativePtr
@SymbolName("sqlite3_kniBridge166")
private external fun kniBridge166(): NativePtr
@SymbolName("sqlite3_kniBridge167")
private external fun kniBridge167(): NativePtr
@SymbolName("sqlite3_kniBridge168")
private external fun kniBridge168(): NativePtr
@SymbolName("sqlite3_kniBridge169")
private external fun kniBridge169(): NativePtr
@SymbolName("sqlite3_kniBridge170")
private external fun kniBridge170(): NativePtr
@SymbolName("sqlite3_kniBridge171")
private external fun kniBridge171(): NativePtr
@SymbolName("sqlite3_kniBridge172")
private external fun kniBridge172(): NativePtr
@SymbolName("sqlite3_kniBridge173")
private external fun kniBridge173(): NativePtr
@SymbolName("sqlite3_kniBridge174")
private external fun kniBridge174(): NativePtr
@SymbolName("sqlite3_kniBridge175")
private external fun kniBridge175(): NativePtr
@SymbolName("sqlite3_kniBridge176")
private external fun kniBridge176(): NativePtr
@SymbolName("sqlite3_kniBridge177")
private external fun kniBridge177(): NativePtr
@SymbolName("sqlite3_kniBridge178")
private external fun kniBridge178(): NativePtr
@SymbolName("sqlite3_kniBridge179")
private external fun kniBridge179(): NativePtr
@SymbolName("sqlite3_kniBridge180")
private external fun kniBridge180(): NativePtr
@SymbolName("sqlite3_kniBridge181")
private external fun kniBridge181(): NativePtr
@SymbolName("sqlite3_kniBridge182")
private external fun kniBridge182(): NativePtr
@SymbolName("sqlite3_kniBridge183")
private external fun kniBridge183(): NativePtr
@SymbolName("sqlite3_kniBridge184")
private external fun kniBridge184(): NativePtr
@SymbolName("sqlite3_kniBridge185")
private external fun kniBridge185(): NativePtr
@SymbolName("sqlite3_kniBridge186")
private external fun kniBridge186(): NativePtr
@SymbolName("sqlite3_kniBridge187")
private external fun kniBridge187(): NativePtr
@SymbolName("sqlite3_kniBridge188")
private external fun kniBridge188(): NativePtr
@SymbolName("sqlite3_kniBridge189")
private external fun kniBridge189(): NativePtr
@SymbolName("sqlite3_kniBridge190")
private external fun kniBridge190(): NativePtr
@SymbolName("sqlite3_kniBridge191")
private external fun kniBridge191(): NativePtr
@SymbolName("sqlite3_kniBridge192")
private external fun kniBridge192(): NativePtr
@SymbolName("sqlite3_kniBridge193")
private external fun kniBridge193(): NativePtr
@SymbolName("sqlite3_kniBridge194")
private external fun kniBridge194(): NativePtr
@SymbolName("sqlite3_kniBridge195")
private external fun kniBridge195(): NativePtr
