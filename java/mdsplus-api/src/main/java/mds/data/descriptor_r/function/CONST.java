package mds.data.descriptor_r.function;

import java.nio.ByteBuffer;
import mds.MdsException;
import mds.data.OPC;
import mds.data.descriptor.Descriptor;
import mds.data.descriptor_r.Function;
import mds.data.descriptor_r.With_Error;
import mds.data.descriptor_r.With_Units;
import mds.data.descriptor_s.Complex32;
import mds.data.descriptor_s.Float32;
import mds.data.descriptor_s.Int32;
import mds.data.descriptor_s.Missing;
import mds.data.descriptor_s.StringDsc;
import mds.data.descriptor_s.Uint8;

public abstract class CONST extends Function{
	public static final class d2Pi extends CONST{
		public d2Pi(){
			super(OPC.Opc2Pi);
		}

		public d2Pi(final ByteBuffer b){
			super(b);
		}

		@Override
		public final Float32 evaluate() {
			return new Float32(6.2831853072f);
		}
	}
	public static final class dA0 extends CONST{
		public dA0(){
			super(OPC.OpcA0);
		}

		public dA0(final ByteBuffer b){
			super(b);
		}

		@Override
		public final With_Units evaluate() {
			return new With_Units(new With_Error(new Float32(5.29177249e-11f), new Float32(0.00000024e-11f)), new StringDsc("m"));
		}
	}
	public static final class dAlpha extends CONST{
		public dAlpha(){
			super(OPC.OpcAlpha);
		}

		public dAlpha(final ByteBuffer b){
			super(b);
		}

		@Override
		public final With_Error evaluate() {
			return new With_Error(new Float32(.00729735f), new Float32(330e-12f));
		}
	}
	public static final class dAmu extends CONST{
		public dAmu(){
			super(OPC.OpcAmu);
		}

		public dAmu(final ByteBuffer b){
			super(b);
		}

		@Override
		public final With_Units evaluate() {
			return new With_Units(new With_Error(new Float32(1.6605402e-27f), new Float32(0.0000010e-27f)), new StringDsc("kg"));
		}
	}
	public static final class dAtm extends CONST{
		public dAtm(){
			super(OPC.OpcAtm);
		}

		public dAtm(final ByteBuffer b){
			super(b);
		}

		@Override
		public final With_Units evaluate() {
			return new With_Units(new Float32(101325.f), new StringDsc("Pa"));
		}
	}
	public static final class dC extends CONST{
		public dC(){
			super(OPC.OpcC);
		}

		public dC(final ByteBuffer b){
			super(b);
		}

		@Override
		public final With_Units evaluate() {
			return new With_Units(new Float32(299792458.f), new StringDsc("m/s"));
		}
	}
	public static final class dCal extends CONST{
		public dCal(){
			super(OPC.OpcCal);
		}

		public dCal(final ByteBuffer b){
			super(b);
		}

		@Override
		public final With_Units evaluate() {
			return new With_Units(new Float32(4.1868f), new StringDsc("J"));
		}
	}
	public static final class dDefault extends CONST{
		public dDefault(){
			super(OPC.OpcMdsDefault);
		}

		public dDefault(final ByteBuffer b){
			super(b);
		}

		@Override
		public final StringDsc evaluate() {
			try{
				return this.mds.getDescriptor(this.tree, "$DEFAULT", StringDsc.class);
			}catch(final MdsException e){
				return new StringDsc(this.tree.getDefaultC().decompile());
			}
		}
	}
	public static final class dDegree extends CONST{
		public dDegree(){
			super(OPC.OpcDegree);
		}

		public dDegree(final ByteBuffer b){
			super(b);
		}

		@Override
		public final Float32 evaluate() {
			return new Float32(.01745329252f);
		}
	}
	public static final class dEpsilon0 extends CONST{
		public dEpsilon0(){
			super(OPC.OpcEpsilon0);
		}

		public dEpsilon0(final ByteBuffer b){
			super(b);
		}

		@Override
		public final With_Units evaluate() {
			return new With_Units(new Float32(8.854187817e-12f), new StringDsc("F/m"));
		}
	}
	public static final class dEv extends CONST{
		public dEv(){
			super(OPC.OpcEv);
		}

		public dEv(final ByteBuffer b){
			super(b);
		}

		@Override
		public final With_Units evaluate() {
			return new With_Units(new With_Error(new Float32(1.60217733e-19f), new Float32(0.00000049e-19f)), new StringDsc("J/eV"));
		}
	}
	public static final class dExpt extends CONST{
		public dExpt(){
			super(OPC.OpcExpt);
		}

		public dExpt(final ByteBuffer b){
			super(b);
		}

		@Override
		public final StringDsc evaluate() {
			return new StringDsc(this.tree.expt);
		}
	}
	public static final class dFalse extends CONST{
		public dFalse(){
			super(OPC.OpcFalse);
		}

		public dFalse(final ByteBuffer b){
			super(b);
		}

		@Override
		public final Uint8 evaluate() {
			return new Uint8(0);
		}
	}
	public static final class dFaraday extends CONST{
		public dFaraday(){
			super(OPC.OpcFaraday);
		}

		public dFaraday(final ByteBuffer b){
			super(b);
		}

		@Override
		public final With_Units evaluate() {
			return new With_Units(new With_Error(new Float32(9.6485309e4f), new Float32(0.0000029e4f)), new StringDsc("C/mol"));
		}
	}
	public static final class dG extends CONST{
		public dG(){
			super(OPC.OpcG);
		}

		public dG(final ByteBuffer b){
			super(b);
		}

		@Override
		public final With_Units evaluate() {
			return new With_Units(new With_Error(new Float32(6.67259e-11f), new Float32(0.00085f)), new StringDsc("m^3/s^2/kg"));
		}
	}
	public static final class dGas extends CONST{
		public dGas(){
			super(OPC.OpcGas);
		}

		public dGas(final ByteBuffer b){
			super(b);
		}

		@Override
		public final With_Units evaluate() {
			return new With_Units(new With_Error(new Float32(8.314510f), new Float32(0.000070f)), new StringDsc("J/K/mol"));
		}
	}
	public static final class dGn extends CONST{
		public dGn(){
			super(OPC.OpcGn);
		}

		public dGn(final ByteBuffer b){
			super(b);
		}

		@Override
		public final With_Units evaluate() {
			return new With_Units(new Float32(9.80665f), new StringDsc("m/s^2"));
		}
	}
	public static final class dH extends CONST{
		public dH(){
			super(OPC.OpcH);
		}

		public dH(final ByteBuffer b){
			super(b);
		}

		@Override
		public final With_Units evaluate() {
			return new With_Units(new With_Error(new Float32(6.6260755e-34f), new Float32(0.0000040f)), new StringDsc("J*s"));
		}
	}
	public static final class dHbar extends CONST{
		public dHbar(){
			super(OPC.OpcHbar);
		}

		public dHbar(final ByteBuffer b){
			super(b);
		}

		@Override
		public final With_Units evaluate() {
			return new With_Units(new With_Error(new Float32(1.05457266e-34f), new Float32(0.00000063f)), new StringDsc("J*s"));
		}
	}
	public static final class dI extends CONST{
		public dI(){
			super(OPC.OpcI);
		}

		public dI(final ByteBuffer b){
			super(b);
		}

		@Override
		public final Complex32 evaluate() {
			return new Complex32(0.f, 1.f);
		}
	}
	public static final class dK extends CONST{
		public dK(){
			super(OPC.OpcK);
		}

		public dK(final ByteBuffer b){
			super(b);
		}

		@Override
		public final With_Units evaluate() {
			return new With_Units(new With_Error(new Float32(1.380658e-23f), new Float32(0.000012e-23f)), new StringDsc("J/K"));
		}
	}
	public static final class dMe extends CONST{
		public dMe(){
			super(OPC.OpcMe);
		}

		public dMe(final ByteBuffer b){
			super(b);
		}

		@Override
		public final With_Units evaluate() {
			return new With_Units(new With_Error(new Float32(9.1093897e-31f), new Float32(0.0000054e-31f)), new StringDsc("kg"));
		}
	}
	public static final class dMissing extends CONST{
		public dMissing(){
			super(OPC.OpcMissing);
		}

		public dMissing(final ByteBuffer b){
			super(b);
		}

		@Override
		public final Missing evaluate() {
			return Missing.NEW;
		}
	}
	public static final class dMp extends CONST{
		public dMp(){
			super(OPC.OpcMp);
		}

		public dMp(final ByteBuffer b){
			super(b);
		}

		@Override
		public final With_Units evaluate() {
			return new With_Units(new With_Error(new Float32(1.6726231e-27f), new Float32(0.0000010e-27f)), new StringDsc("kg"));
		}
	}
	public static final class dMu0 extends CONST{
		public dMu0(){
			super(OPC.OpcMu0);
		}

		public dMu0(final ByteBuffer b){
			super(b);
		}

		@Override
		public final With_Units evaluate() {
			return new With_Units(new Float32(12.566370614e-7f), new StringDsc("N/A^2"));
		}
	}
	public static final class dN0 extends CONST{
		public dN0(){
			super(OPC.OpcN0);
		}

		public dN0(final ByteBuffer b){
			super(b);
		}

		@Override
		public final With_Units evaluate() {
			return new With_Units(new With_Error(new Float32(2.686763e25f), new Float32(0.000023e25f)), new StringDsc("/m^3"));
		}
	}
	public static final class dNa extends CONST{
		public dNa(){
			super(OPC.OpcNa);
		}

		public dNa(final ByteBuffer b){
			super(b);
		}

		@Override
		public final With_Units evaluate() {
			return new With_Units(new With_Error(new Float32(6.0221367e23f), new Float32(0.0000036e23f)), new StringDsc("/mol"));
		}
	}
	public static final class dNarg extends CONST{
		public dNarg(){
			super(OPC.OpcNarg);
		}

		public dNarg(final ByteBuffer b){
			super(b);
		}

		@Override
		public final Descriptor<?> evaluate() {
			try{
				return this.mds.getDescriptor("$NARGS");
			}catch(final MdsException e){
				return Missing.NEW;
			}
		}
	}
	public static final class dP0 extends CONST{
		public dP0(){
			super(OPC.OpcP0);
		}

		public dP0(final ByteBuffer b){
			super(b);
		}

		@Override
		public final With_Units evaluate() {
			return new With_Units(new Float32(1.01325e5f), new StringDsc("Pa"));
		}
	}
	public static final class dPi extends CONST{
		public dPi(){
			super(OPC.OpcPi);
		}

		public dPi(final ByteBuffer b){
			super(b);
		}

		@Override
		public final Float32 evaluate() {
			return new Float32(3.1415926536f);
		}
	}
	public static final class dQe extends CONST{
		public dQe(){
			super(OPC.OpcQe);
		}

		public dQe(final ByteBuffer b){
			super(b);
		}

		@Override
		public final With_Units evaluate() {
			return new With_Units(new With_Error(new Float32(1.60217733e-19f), new Float32(0.000000493e-19f)), new StringDsc("C"));
		}
	}
	public static final class dRe extends CONST{
		public dRe(){
			super(OPC.OpcRe);
		}

		public dRe(final ByteBuffer b){
			super(b);
		}

		@Override
		public final With_Units evaluate() {
			return new With_Units(new With_Error(new Float32(2.81794092e-15f), new Float32(0.00000038e-15f)), new StringDsc("m"));
		}
	}
	public static final class dRoprand extends CONST{
		public dRoprand(){
			super(OPC.OpcRoprand);
		}

		public dRoprand(final ByteBuffer b){
			super(b);
		}

		@Override
		public final Float32 evaluate() {
			return CONST.ROPRAND;
		}
	}
	public static final class dRydberg extends CONST{
		public dRydberg(){
			super(OPC.OpcRydberg);
		}

		public dRydberg(final ByteBuffer b){
			super(b);
		}

		@Override
		public final With_Units evaluate() {
			return new With_Units(new With_Error(new Float32(1.0973731534e7f), new Float32(0.0000000013e7f)), new StringDsc("/m"));
		}
	}
	public static final class dShot extends CONST{
		public dShot(){
			super(OPC.OpcShot);
		}

		public dShot(final ByteBuffer b){
			super(b);
		}

		@Override
		public final Int32 evaluate() {
			return new Int32(this.tree.shot);
		}
	}
	public static final class dShotname extends CONST{
		public dShotname(){
			super(OPC.OpcShotname);
		}

		public dShotname(final ByteBuffer b){
			super(b);
		}

		@Override
		public final StringDsc evaluate() {
			if(this.tree.shot == -1) return new StringDsc("MODEL");
			return new StringDsc(String.valueOf(this.tree.shot));
		}
	}
	public static final class dT0 extends CONST{
		public dT0(){
			super(OPC.OpcT0);
		}

		public dT0(final ByteBuffer b){
			super(b);
		}

		@Override
		public final With_Units evaluate() {
			return new With_Units(new Float32(273.16f), new StringDsc("K"));
		}
	}
	public static final class dThis extends CONST{
		public dThis(){
			super(OPC.OpcThis);
		}

		public dThis(final ByteBuffer b){
			super(b);
		}
	}
	public static final class dTorr extends CONST{
		public dTorr(){
			super(OPC.OpcTorr);
		}

		public dTorr(final ByteBuffer b){
			super(b);
		}

		@Override
		public final With_Units evaluate() {
			return new With_Units(new Float32(1.3332e2f), new StringDsc("Pa"));
		}
	}
	public static final class dTrue extends CONST{
		public dTrue(){
			super(OPC.OpcTrue);
		}

		public dTrue(final ByteBuffer b){
			super(b);
		}

		@Override
		public final Uint8 evaluate() {
			return new Uint8(1);
		}
	}
	public static final class dValue extends CONST{
		public dValue(){
			super(OPC.OpcValue);
		}

		public dValue(final ByteBuffer b){
			super(b);
		}

		@Override
		public Descriptor<?> evaluate() {
			return this.VALUE.VALUE();
		}
	}
	public static final Float32		ROPRAND		= Float32.F(ByteBuffer.wrap(new byte[]{0, 0, -128, 0}).getFloat());
	public final static Function	$VALUE		= new dValue();
	public static final dRoprand	$ROPRAND	= new dRoprand();
	public static final dRydberg	$RYDBERG	= new dRydberg();
	public static final dTorr		$TORR		= new dTorr();
	public static final dTrue		$TRUE		= new dTrue();
	public static final d2Pi		$2PI		= new d2Pi();
	public static final dA0			$A0			= new dA0();
	public static final dAlpha		$ALPHA		= new dAlpha();
	public static final dAmu		$AMU		= new dAmu();
	public static final dC			$C			= new dC();
	public static final dCal		$CAL		= new dCal();
	public static final dDegree		$DEGREE		= new dDegree();
	public static final dFalse		$FALSE		= new dFalse();
	public static final dFaraday	$FARADAY	= new dFaraday();
	public static final dG			$G			= new dG();
	public static final dGas		$GAS		= new dGas();
	public static final dH			$H			= new dH();
	public static final dHbar		$HBAR		= new dHbar();
	public static final dI			$I			= new dI();
	public static final dK			$K			= new dK();
	public static final dMissing	$MISSING	= new dMissing();
	public static final dMp			$MP			= new dMp();
	public static final dN0			$N0			= new dN0();
	public static final dNa			$NA			= new dNa();
	public static final dP0			$P0			= new dP0();
	public static final dPi			$PI			= new dPi();
	public static final dQe			$QE			= new dQe();
	public static final dRe			$RE			= new dRe();

	public static final boolean coversOpCode(final OPC opcode) {
		switch(opcode){
			default:
				return false;
			case OpcA0:
			case OpcAlpha:
			case OpcAmu:
			case OpcC:
			case OpcCal:
			case OpcDegree:
			case OpcEv:
			case OpcFalse:
			case OpcFaraday:
			case OpcG:
			case OpcGas:
			case OpcH:
			case OpcHbar:
			case OpcI:
			case OpcK:
			case OpcMe:
			case OpcMissing:
			case OpcMp:
			case OpcN0:
			case OpcNa:
			case OpcP0:
			case OpcPi:
			case OpcQe:
			case OpcRe:
			case OpcRoprand:
			case OpcRydberg:
			case OpcT0:
			case OpcTorr:
			case OpcTrue:
			case OpcValue:
			case Opc2Pi:
			case OpcNarg:
			case OpcMdsDefault:
			case OpcExpt:
			case OpcShot:
			case OpcThis:
			case OpcAtm:
			case OpcEpsilon0:
			case OpcGn:
			case OpcMu0:
			case OpcShotname:
				return true;
		}
	}

	public static CONST deserialize(final ByteBuffer b) throws MdsException {
		final OPC opcode = OPC.get(b.getShort(b.getInt(Descriptor._ptrI)));
		switch(opcode){
			case OpcA0:
				return new dA0(b);
			case OpcAlpha:
				return new dAlpha(b);
			case OpcAmu:
				return new dAmu(b);
			case OpcC:
				return new dC(b);
			case OpcCal:
				return new dCal(b);
			case OpcDegree:
				return new dDegree(b);
			case OpcEv:
				return new dEv(b);
			case OpcFalse:
				return new dFalse(b);
			case OpcFaraday:
				return new dFaraday(b);
			case OpcG:
				return new dG(b);
			case OpcGas:
				return new dGas(b);
			case OpcH:
				return new dH(b);
			case OpcHbar:
				return new dHbar(b);
			case OpcI:
				return new dI(b);
			case OpcK:
				return new dK(b);
			case OpcMe:
				return new dMe(b);
			case OpcMissing:
				return new dMissing(b);
			case OpcMp:
				return new dMp(b);
			case OpcN0:
				return new dN0(b);
			case OpcNa:
				return new dNa(b);
			case OpcP0:
				return new dP0(b);
			case OpcPi:
				return new dPi(b);
			case OpcQe:
				return new dQe(b);
			case OpcRe:
				return new dRe(b);
			case OpcRoprand:
				return new dRoprand(b);
			case OpcRydberg:
				return new dRydberg(b);
			case OpcT0:
				return new dT0(b);
			case OpcTorr:
				return new dTorr(b);
			case OpcTrue:
				return new dTrue(b);
			case OpcValue:
				return new dValue(b);
			case Opc2Pi:
				return new d2Pi(b);
			case OpcNarg:
				return new dNarg(b);
			case OpcMdsDefault:
				return new dDefault(b);
			case OpcExpt:
				return new dExpt(b);
			case OpcShot:
				return new dShot(b);
			case OpcThis:
				return new dThis(b);
			case OpcAtm:
				return new dAtm(b);
			case OpcEpsilon0:
				return new dEpsilon0(b);
			case OpcGn:
				return new dGn(b);
			case OpcMu0:
				return new dMu0(b);
			case OpcShotname:
				return new dShotname(b);
			default:
				throw new MdsException(MdsException.TdiINV_OPC);
		}
	}

	public CONST(final ByteBuffer b){
		super(b);
	}

	private CONST(final OPC opcode){
		super(opcode);
	}

	@Override
	public final StringBuilder decompile(final int prec, final StringBuilder pout, final int mode) {
		return pout.append(this.getName());
	}

	@Override
	public final boolean isLocal() {
		return true;
	}
}
