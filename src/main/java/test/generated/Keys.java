/*
 * This file is generated by jOOQ.
*/
package test.generated;


import javax.annotation.Generated;

import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;

import test.generated.tables.Appderigistration;
import test.generated.tables.Appregistration;
import test.generated.tables.Assignment;
import test.generated.tables.Category;
import test.generated.tables.Distrorder;
import test.generated.tables.Drcateg;
import test.generated.tables.Driverlicense;
import test.generated.tables.Employe;
import test.generated.tables.Enginetype;
import test.generated.tables.Examcateg;
import test.generated.tables.Examlist;
import test.generated.tables.Licenseplate;
import test.generated.tables.Person;
import test.generated.tables.Plate;
import test.generated.tables.Position;
import test.generated.tables.Postdps;
import test.generated.tables.Protocol;
import test.generated.tables.Protocoldecision;
import test.generated.tables.Pts;
import test.generated.tables.Regcert;
import test.generated.tables.Region;
import test.generated.tables.Typedecision;
import test.generated.tables.Typev;
import test.generated.tables.Vehicle;
import test.generated.tables.records.AppderigistrationRecord;
import test.generated.tables.records.AppregistrationRecord;
import test.generated.tables.records.AssignmentRecord;
import test.generated.tables.records.CategoryRecord;
import test.generated.tables.records.DistrorderRecord;
import test.generated.tables.records.DrcategRecord;
import test.generated.tables.records.DriverlicenseRecord;
import test.generated.tables.records.EmployeRecord;
import test.generated.tables.records.EnginetypeRecord;
import test.generated.tables.records.ExamcategRecord;
import test.generated.tables.records.ExamlistRecord;
import test.generated.tables.records.LicenseplateRecord;
import test.generated.tables.records.PersonRecord;
import test.generated.tables.records.PlateRecord;
import test.generated.tables.records.PositionRecord;
import test.generated.tables.records.PostdpsRecord;
import test.generated.tables.records.ProtocolRecord;
import test.generated.tables.records.ProtocoldecisionRecord;
import test.generated.tables.records.PtsRecord;
import test.generated.tables.records.RegcertRecord;
import test.generated.tables.records.RegionRecord;
import test.generated.tables.records.TypedecisionRecord;
import test.generated.tables.records.TypevRecord;
import test.generated.tables.records.VehicleRecord;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>public</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<AppderigistrationRecord, Long> IDENTITY_APPDERIGISTRATION = Identities0.IDENTITY_APPDERIGISTRATION;
    public static final Identity<AppregistrationRecord, Long> IDENTITY_APPREGISTRATION = Identities0.IDENTITY_APPREGISTRATION;
    public static final Identity<AssignmentRecord, Long> IDENTITY_ASSIGNMENT = Identities0.IDENTITY_ASSIGNMENT;
    public static final Identity<CategoryRecord, Long> IDENTITY_CATEGORY = Identities0.IDENTITY_CATEGORY;
    public static final Identity<DistrorderRecord, Long> IDENTITY_DISTRORDER = Identities0.IDENTITY_DISTRORDER;
    public static final Identity<DrcategRecord, Long> IDENTITY_DRCATEG = Identities0.IDENTITY_DRCATEG;
    public static final Identity<DriverlicenseRecord, Long> IDENTITY_DRIVERLICENSE = Identities0.IDENTITY_DRIVERLICENSE;
    public static final Identity<EmployeRecord, Long> IDENTITY_EMPLOYE = Identities0.IDENTITY_EMPLOYE;
    public static final Identity<EnginetypeRecord, Long> IDENTITY_ENGINETYPE = Identities0.IDENTITY_ENGINETYPE;
    public static final Identity<ExamcategRecord, Long> IDENTITY_EXAMCATEG = Identities0.IDENTITY_EXAMCATEG;
    public static final Identity<ExamlistRecord, Long> IDENTITY_EXAMLIST = Identities0.IDENTITY_EXAMLIST;
    public static final Identity<LicenseplateRecord, Long> IDENTITY_LICENSEPLATE = Identities0.IDENTITY_LICENSEPLATE;
    public static final Identity<PtsRecord, Long> IDENTITY_PTS = Identities0.IDENTITY_PTS;
    public static final Identity<PersonRecord, Long> IDENTITY_PERSON = Identities0.IDENTITY_PERSON;
    public static final Identity<PlateRecord, Long> IDENTITY_PLATE = Identities0.IDENTITY_PLATE;
    public static final Identity<PositionRecord, Long> IDENTITY_POSITION = Identities0.IDENTITY_POSITION;
    public static final Identity<PostdpsRecord, Long> IDENTITY_POSTDPS = Identities0.IDENTITY_POSTDPS;
    public static final Identity<ProtocolRecord, Long> IDENTITY_PROTOCOL = Identities0.IDENTITY_PROTOCOL;
    public static final Identity<ProtocoldecisionRecord, Long> IDENTITY_PROTOCOLDECISION = Identities0.IDENTITY_PROTOCOLDECISION;
    public static final Identity<RegcertRecord, Long> IDENTITY_REGCERT = Identities0.IDENTITY_REGCERT;
    public static final Identity<RegionRecord, Long> IDENTITY_REGION = Identities0.IDENTITY_REGION;
    public static final Identity<TypedecisionRecord, Long> IDENTITY_TYPEDECISION = Identities0.IDENTITY_TYPEDECISION;
    public static final Identity<TypevRecord, Long> IDENTITY_TYPEV = Identities0.IDENTITY_TYPEV;
    public static final Identity<VehicleRecord, Long> IDENTITY_VEHICLE = Identities0.IDENTITY_VEHICLE;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<AppderigistrationRecord> PK_APPDERIGISTRATION = UniqueKeys0.PK_APPDERIGISTRATION;
    public static final UniqueKey<AppregistrationRecord> PK_APPREGISTRATION = UniqueKeys0.PK_APPREGISTRATION;
    public static final UniqueKey<AssignmentRecord> PK_ASSIGNMENT = UniqueKeys0.PK_ASSIGNMENT;
    public static final UniqueKey<CategoryRecord> CATEGORY_PK = UniqueKeys0.CATEGORY_PK;
    public static final UniqueKey<DistrorderRecord> PK_DISTROREDER = UniqueKeys0.PK_DISTROREDER;
    public static final UniqueKey<DrcategRecord> DRCATEG_PK = UniqueKeys0.DRCATEG_PK;
    public static final UniqueKey<DriverlicenseRecord> ПК_DRIVERLICENSE = UniqueKeys0.ПК_DRIVERLICENSE;
    public static final UniqueKey<EmployeRecord> PK_EMPLOYE = UniqueKeys0.PK_EMPLOYE;
    public static final UniqueKey<EnginetypeRecord> PK_ENGINETYPE = UniqueKeys0.PK_ENGINETYPE;
    public static final UniqueKey<ExamcategRecord> EXAMCATEG_PK = UniqueKeys0.EXAMCATEG_PK;
    public static final UniqueKey<ExamlistRecord> PK_EXAMLIST = UniqueKeys0.PK_EXAMLIST;
    public static final UniqueKey<LicenseplateRecord> PK_LICENSEPLATE = UniqueKeys0.PK_LICENSEPLATE;
    public static final UniqueKey<LicenseplateRecord> LICENSEPLATE_VEHICLE_PK = UniqueKeys0.LICENSEPLATE_VEHICLE_PK;
    public static final UniqueKey<PtsRecord> PK_PTS = UniqueKeys0.PK_PTS;
    public static final UniqueKey<PersonRecord> PK_PERSON = UniqueKeys0.PK_PERSON;
    public static final UniqueKey<PlateRecord> UNIQUE_IDENTIFIER1 = UniqueKeys0.UNIQUE_IDENTIFIER1;
    public static final UniqueKey<PositionRecord> POSITION_PK = UniqueKeys0.POSITION_PK;
    public static final UniqueKey<PostdpsRecord> PK_POSTDPS = UniqueKeys0.PK_POSTDPS;
    public static final UniqueKey<ProtocolRecord> PK_PROTOCOL = UniqueKeys0.PK_PROTOCOL;
    public static final UniqueKey<ProtocoldecisionRecord> PK_PROTOCOLDECISION = UniqueKeys0.PK_PROTOCOLDECISION;
    public static final UniqueKey<RegcertRecord> PK_REGCERT = UniqueKeys0.PK_REGCERT;
    public static final UniqueKey<RegionRecord> PK_REGION = UniqueKeys0.PK_REGION;
    public static final UniqueKey<TypedecisionRecord> PK_TYPEDECISION = UniqueKeys0.PK_TYPEDECISION;
    public static final UniqueKey<TypevRecord> PK_TYPEV = UniqueKeys0.PK_TYPEV;
    public static final UniqueKey<VehicleRecord> PK_VEHICLE = UniqueKeys0.PK_VEHICLE;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<AppderigistrationRecord, PersonRecord> APPDERIGISTRATION__RELATIONSHIP27 = ForeignKeys0.APPDERIGISTRATION__RELATIONSHIP27;
    public static final ForeignKey<AppderigistrationRecord, EmployeRecord> APPDERIGISTRATION__RELATIONSHIP38 = ForeignKeys0.APPDERIGISTRATION__RELATIONSHIP38;
    public static final ForeignKey<AppderigistrationRecord, RegcertRecord> APPDERIGISTRATION__RELATIONSHIP23 = ForeignKeys0.APPDERIGISTRATION__RELATIONSHIP23;
    public static final ForeignKey<AppregistrationRecord, PersonRecord> APPREGISTRATION__RELATIONSHIP20 = ForeignKeys0.APPREGISTRATION__RELATIONSHIP20;
    public static final ForeignKey<AppregistrationRecord, EmployeRecord> APPREGISTRATION__RELATIONSHIP39 = ForeignKeys0.APPREGISTRATION__RELATIONSHIP39;
    public static final ForeignKey<AppregistrationRecord, VehicleRecord> APPREGISTRATION__RELATIONSHIP22 = ForeignKeys0.APPREGISTRATION__RELATIONSHIP22;
    public static final ForeignKey<AssignmentRecord, PostdpsRecord> ASSIGNMENT__RELATIONSHIP25 = ForeignKeys0.ASSIGNMENT__RELATIONSHIP25;
    public static final ForeignKey<AssignmentRecord, EmployeRecord> ASSIGNMENT__RELATIONSHIP35 = ForeignKeys0.ASSIGNMENT__RELATIONSHIP35;
    public static final ForeignKey<DistrorderRecord, EmployeRecord> DISTRORDER__RELATIONSHIP36 = ForeignKeys0.DISTRORDER__RELATIONSHIP36;
    public static final ForeignKey<DrcategRecord, DriverlicenseRecord> DRCATEG__RELATIONSHIP45 = ForeignKeys0.DRCATEG__RELATIONSHIP45;
    public static final ForeignKey<DrcategRecord, CategoryRecord> DRCATEG__RELATIONSHIP46 = ForeignKeys0.DRCATEG__RELATIONSHIP46;
    public static final ForeignKey<DriverlicenseRecord, PersonRecord> DRIVERLICENSE__RELATIONSHIP17 = ForeignKeys0.DRIVERLICENSE__RELATIONSHIP17;
    public static final ForeignKey<DriverlicenseRecord, EmployeRecord> DRIVERLICENSE__RELATIONSHIP42 = ForeignKeys0.DRIVERLICENSE__RELATIONSHIP42;
    public static final ForeignKey<EmployeRecord, PersonRecord> EMPLOYE__RELATIONSHIP1 = ForeignKeys0.EMPLOYE__RELATIONSHIP1;
    public static final ForeignKey<EmployeRecord, PositionRecord> EMPLOYE__RELATIONSHIP43 = ForeignKeys0.EMPLOYE__RELATIONSHIP43;
    public static final ForeignKey<ExamcategRecord, CategoryRecord> EXAMCATEG__RELATIONSHIP47 = ForeignKeys0.EXAMCATEG__RELATIONSHIP47;
    public static final ForeignKey<ExamcategRecord, ExamlistRecord> EXAMCATEG__RELATIONSHIP48 = ForeignKeys0.EXAMCATEG__RELATIONSHIP48;
    public static final ForeignKey<ExamlistRecord, PersonRecord> EXAMLIST__RELATIONSHIP18 = ForeignKeys0.EXAMLIST__RELATIONSHIP18;
    public static final ForeignKey<ExamlistRecord, EmployeRecord> EXAMLIST__RELATIONSHIP41 = ForeignKeys0.EXAMLIST__RELATIONSHIP41;
    public static final ForeignKey<LicenseplateRecord, RegionRecord> LICENSEPLATE__RELATIONSHIP7 = ForeignKeys0.LICENSEPLATE__RELATIONSHIP7;
    public static final ForeignKey<LicenseplateRecord, PlateRecord> LICENSEPLATE__RELATIONSHIP33 = ForeignKeys0.LICENSEPLATE__RELATIONSHIP33;
    public static final ForeignKey<LicenseplateRecord, VehicleRecord> LICENSEPLATE__LICENSEPLATE_VEHICLE_PK_FKEY = ForeignKeys0.LICENSEPLATE__LICENSEPLATE_VEHICLE_PK_FKEY;
    public static final ForeignKey<PtsRecord, VehicleRecord> PTS__RELATIONSHIP32 = ForeignKeys0.PTS__RELATIONSHIP32;
    public static final ForeignKey<PtsRecord, EnginetypeRecord> PTS__RELATIONSHIP31 = ForeignKeys0.PTS__RELATIONSHIP31;
    public static final ForeignKey<PtsRecord, TypevRecord> PTS__RELATIONSHIP30 = ForeignKeys0.PTS__RELATIONSHIP30;
    public static final ForeignKey<PtsRecord, CategoryRecord> PTS__RELATIONSHIP49 = ForeignKeys0.PTS__RELATIONSHIP49;
    public static final ForeignKey<ProtocolRecord, PersonRecord> PROTOCOL__RELATIONSHIP13 = ForeignKeys0.PROTOCOL__RELATIONSHIP13;
    public static final ForeignKey<ProtocolRecord, EmployeRecord> PROTOCOL__RELATIONSHIP34 = ForeignKeys0.PROTOCOL__RELATIONSHIP34;
    public static final ForeignKey<ProtocoldecisionRecord, TypedecisionRecord> PROTOCOLDECISION__RELATIONSHIP12 = ForeignKeys0.PROTOCOLDECISION__RELATIONSHIP12;
    public static final ForeignKey<ProtocoldecisionRecord, ProtocolRecord> PROTOCOLDECISION__RELATIONSHIP11 = ForeignKeys0.PROTOCOLDECISION__RELATIONSHIP11;
    public static final ForeignKey<ProtocoldecisionRecord, EmployeRecord> PROTOCOLDECISION__RELATIONSHIP40 = ForeignKeys0.PROTOCOLDECISION__RELATIONSHIP40;
    public static final ForeignKey<RegcertRecord, PersonRecord> REGCERT__RELATIONSHIP19 = ForeignKeys0.REGCERT__RELATIONSHIP19;
    public static final ForeignKey<RegcertRecord, EmployeRecord> REGCERT__RELATIONSHIP37 = ForeignKeys0.REGCERT__RELATIONSHIP37;
    public static final ForeignKey<RegcertRecord, VehicleRecord> REGCERT__RELATIONSHIP21 = ForeignKeys0.REGCERT__RELATIONSHIP21;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 extends AbstractKeys {
        public static Identity<AppderigistrationRecord, Long> IDENTITY_APPDERIGISTRATION = createIdentity(Appderigistration.APPDERIGISTRATION, Appderigistration.APPDERIGISTRATION.APPDERIGISTRATION_PK);
        public static Identity<AppregistrationRecord, Long> IDENTITY_APPREGISTRATION = createIdentity(Appregistration.APPREGISTRATION, Appregistration.APPREGISTRATION.APPREGISTRATION_PK);
        public static Identity<AssignmentRecord, Long> IDENTITY_ASSIGNMENT = createIdentity(Assignment.ASSIGNMENT, Assignment.ASSIGNMENT.ASSIGNMENT_PK);
        public static Identity<CategoryRecord, Long> IDENTITY_CATEGORY = createIdentity(Category.CATEGORY, Category.CATEGORY.CATEGORY_PK);
        public static Identity<DistrorderRecord, Long> IDENTITY_DISTRORDER = createIdentity(Distrorder.DISTRORDER, Distrorder.DISTRORDER.DISTRORDER_PK);
        public static Identity<DrcategRecord, Long> IDENTITY_DRCATEG = createIdentity(Drcateg.DRCATEG, Drcateg.DRCATEG.DRCATEG_PK);
        public static Identity<DriverlicenseRecord, Long> IDENTITY_DRIVERLICENSE = createIdentity(Driverlicense.DRIVERLICENSE, Driverlicense.DRIVERLICENSE.DRIVERLICENSE_PK);
        public static Identity<EmployeRecord, Long> IDENTITY_EMPLOYE = createIdentity(Employe.EMPLOYE, Employe.EMPLOYE.EMPLOYE_PK);
        public static Identity<EnginetypeRecord, Long> IDENTITY_ENGINETYPE = createIdentity(Enginetype.ENGINETYPE, Enginetype.ENGINETYPE.ENGINETYPE_PK);
        public static Identity<ExamcategRecord, Long> IDENTITY_EXAMCATEG = createIdentity(Examcateg.EXAMCATEG, Examcateg.EXAMCATEG.EXAMCATEG_PK);
        public static Identity<ExamlistRecord, Long> IDENTITY_EXAMLIST = createIdentity(Examlist.EXAMLIST, Examlist.EXAMLIST.EXAMLIST_PK);
        public static Identity<LicenseplateRecord, Long> IDENTITY_LICENSEPLATE = createIdentity(Licenseplate.LICENSEPLATE, Licenseplate.LICENSEPLATE.LICENSEPLATE_PK);
        public static Identity<PtsRecord, Long> IDENTITY_PTS = createIdentity(Pts.PTS, Pts.PTS.PTS_PK);
        public static Identity<PersonRecord, Long> IDENTITY_PERSON = createIdentity(Person.PERSON, Person.PERSON.PERSON_PK);
        public static Identity<PlateRecord, Long> IDENTITY_PLATE = createIdentity(Plate.PLATE, Plate.PLATE.PLATE_PK);
        public static Identity<PositionRecord, Long> IDENTITY_POSITION = createIdentity(Position.POSITION, Position.POSITION.POSITION_PK);
        public static Identity<PostdpsRecord, Long> IDENTITY_POSTDPS = createIdentity(Postdps.POSTDPS, Postdps.POSTDPS.POSTDPS_PK);
        public static Identity<ProtocolRecord, Long> IDENTITY_PROTOCOL = createIdentity(Protocol.PROTOCOL, Protocol.PROTOCOL.PROTOCOL_PK);
        public static Identity<ProtocoldecisionRecord, Long> IDENTITY_PROTOCOLDECISION = createIdentity(Protocoldecision.PROTOCOLDECISION, Protocoldecision.PROTOCOLDECISION.PROTOCOLDECISION_PK);
        public static Identity<RegcertRecord, Long> IDENTITY_REGCERT = createIdentity(Regcert.REGCERT, Regcert.REGCERT.REGCERT_PK);
        public static Identity<RegionRecord, Long> IDENTITY_REGION = createIdentity(Region.REGION, Region.REGION.REGION_PK);
        public static Identity<TypedecisionRecord, Long> IDENTITY_TYPEDECISION = createIdentity(Typedecision.TYPEDECISION, Typedecision.TYPEDECISION.TYPEDECISION_PK);
        public static Identity<TypevRecord, Long> IDENTITY_TYPEV = createIdentity(Typev.TYPEV, Typev.TYPEV.TYPEV_PK);
        public static Identity<VehicleRecord, Long> IDENTITY_VEHICLE = createIdentity(Vehicle.VEHICLE, Vehicle.VEHICLE.VEHICLE_PK);
    }

    private static class UniqueKeys0 extends AbstractKeys {
        public static final UniqueKey<AppderigistrationRecord> PK_APPDERIGISTRATION = createUniqueKey(Appderigistration.APPDERIGISTRATION, "PK_AppDerigistration", Appderigistration.APPDERIGISTRATION.APPDERIGISTRATION_PK);
        public static final UniqueKey<AppregistrationRecord> PK_APPREGISTRATION = createUniqueKey(Appregistration.APPREGISTRATION, "PK_AppRegistration", Appregistration.APPREGISTRATION.APPREGISTRATION_PK);
        public static final UniqueKey<AssignmentRecord> PK_ASSIGNMENT = createUniqueKey(Assignment.ASSIGNMENT, "PK_Assignment", Assignment.ASSIGNMENT.ASSIGNMENT_PK);
        public static final UniqueKey<CategoryRecord> CATEGORY_PK = createUniqueKey(Category.CATEGORY, "Category_PK", Category.CATEGORY.CATEGORY_PK);
        public static final UniqueKey<DistrorderRecord> PK_DISTROREDER = createUniqueKey(Distrorder.DISTRORDER, "PK_DistrOreder", Distrorder.DISTRORDER.DISTRORDER_PK);
        public static final UniqueKey<DrcategRecord> DRCATEG_PK = createUniqueKey(Drcateg.DRCATEG, "DrCateg_PK", Drcateg.DRCATEG.DRCATEG_PK);
        public static final UniqueKey<DriverlicenseRecord> ПК_DRIVERLICENSE = createUniqueKey(Driverlicense.DRIVERLICENSE, "ПК_DriverLicense", Driverlicense.DRIVERLICENSE.DRIVERLICENSE_PK);
        public static final UniqueKey<EmployeRecord> PK_EMPLOYE = createUniqueKey(Employe.EMPLOYE, "PK_Employe", Employe.EMPLOYE.EMPLOYE_PK, Employe.EMPLOYE.PERSON_PK);
        public static final UniqueKey<EnginetypeRecord> PK_ENGINETYPE = createUniqueKey(Enginetype.ENGINETYPE, "PK_EngineType", Enginetype.ENGINETYPE.ENGINETYPE_PK);
        public static final UniqueKey<ExamcategRecord> EXAMCATEG_PK = createUniqueKey(Examcateg.EXAMCATEG, "ExamCateg_PK", Examcateg.EXAMCATEG.EXAMCATEG_PK);
        public static final UniqueKey<ExamlistRecord> PK_EXAMLIST = createUniqueKey(Examlist.EXAMLIST, "PK_ExamList", Examlist.EXAMLIST.EXAMLIST_PK);
        public static final UniqueKey<LicenseplateRecord> PK_LICENSEPLATE = createUniqueKey(Licenseplate.LICENSEPLATE, "PK_LicensePlate", Licenseplate.LICENSEPLATE.LICENSEPLATE_PK);
        public static final UniqueKey<LicenseplateRecord> LICENSEPLATE_VEHICLE_PK = createUniqueKey(Licenseplate.LICENSEPLATE, "LicensePlate_Vehicle_PK", Licenseplate.LICENSEPLATE.VEHICLE_PK);
        public static final UniqueKey<PtsRecord> PK_PTS = createUniqueKey(Pts.PTS, "PK_PTS", Pts.PTS.PTS_PK);
        public static final UniqueKey<PersonRecord> PK_PERSON = createUniqueKey(Person.PERSON, "PK_Person", Person.PERSON.PERSON_PK);
        public static final UniqueKey<PlateRecord> UNIQUE_IDENTIFIER1 = createUniqueKey(Plate.PLATE, "Unique_Identifier1", Plate.PLATE.PLATE_PK);
        public static final UniqueKey<PositionRecord> POSITION_PK = createUniqueKey(Position.POSITION, "Position_PK", Position.POSITION.POSITION_PK);
        public static final UniqueKey<PostdpsRecord> PK_POSTDPS = createUniqueKey(Postdps.POSTDPS, "PK_PostDPS", Postdps.POSTDPS.POSTDPS_PK);
        public static final UniqueKey<ProtocolRecord> PK_PROTOCOL = createUniqueKey(Protocol.PROTOCOL, "PK_Protocol", Protocol.PROTOCOL.PROTOCOL_PK);
        public static final UniqueKey<ProtocoldecisionRecord> PK_PROTOCOLDECISION = createUniqueKey(Protocoldecision.PROTOCOLDECISION, "PK_ProtocolDecision", Protocoldecision.PROTOCOLDECISION.PROTOCOLDECISION_PK, Protocoldecision.PROTOCOLDECISION.PROTOCOL_PK);
        public static final UniqueKey<RegcertRecord> PK_REGCERT = createUniqueKey(Regcert.REGCERT, "PK_RegCert", Regcert.REGCERT.REGCERT_PK);
        public static final UniqueKey<RegionRecord> PK_REGION = createUniqueKey(Region.REGION, "PK_Region", Region.REGION.REGION_PK);
        public static final UniqueKey<TypedecisionRecord> PK_TYPEDECISION = createUniqueKey(Typedecision.TYPEDECISION, "PK_TypeDecision", Typedecision.TYPEDECISION.TYPEDECISION_PK);
        public static final UniqueKey<TypevRecord> PK_TYPEV = createUniqueKey(Typev.TYPEV, "PK_TypeV", Typev.TYPEV.TYPEV_PK);
        public static final UniqueKey<VehicleRecord> PK_VEHICLE = createUniqueKey(Vehicle.VEHICLE, "PK_Vehicle", Vehicle.VEHICLE.VEHICLE_PK);
    }

    private static class ForeignKeys0 extends AbstractKeys {
        public static final ForeignKey<AppderigistrationRecord, PersonRecord> APPDERIGISTRATION__RELATIONSHIP27 = createForeignKey(test.generated.Keys.PK_PERSON, Appderigistration.APPDERIGISTRATION, "AppDerigistration__Relationship27", Appderigistration.APPDERIGISTRATION.PERSON_PK);
        public static final ForeignKey<AppderigistrationRecord, EmployeRecord> APPDERIGISTRATION__RELATIONSHIP38 = createForeignKey(test.generated.Keys.PK_EMPLOYE, Appderigistration.APPDERIGISTRATION, "AppDerigistration__Relationship38", Appderigistration.APPDERIGISTRATION.EMPLOYE_PK, Appderigistration.APPDERIGISTRATION.PERSON_PK);
        public static final ForeignKey<AppderigistrationRecord, RegcertRecord> APPDERIGISTRATION__RELATIONSHIP23 = createForeignKey(test.generated.Keys.PK_REGCERT, Appderigistration.APPDERIGISTRATION, "AppDerigistration__Relationship23", Appderigistration.APPDERIGISTRATION.REGCERT_PK);
        public static final ForeignKey<AppregistrationRecord, PersonRecord> APPREGISTRATION__RELATIONSHIP20 = createForeignKey(test.generated.Keys.PK_PERSON, Appregistration.APPREGISTRATION, "AppRegistration__Relationship20", Appregistration.APPREGISTRATION.PERSON_PK);
        public static final ForeignKey<AppregistrationRecord, EmployeRecord> APPREGISTRATION__RELATIONSHIP39 = createForeignKey(test.generated.Keys.PK_EMPLOYE, Appregistration.APPREGISTRATION, "AppRegistration__Relationship39", Appregistration.APPREGISTRATION.EMPLOYE_PK, Appregistration.APPREGISTRATION.PERSON_PK);
        public static final ForeignKey<AppregistrationRecord, VehicleRecord> APPREGISTRATION__RELATIONSHIP22 = createForeignKey(test.generated.Keys.PK_VEHICLE, Appregistration.APPREGISTRATION, "AppRegistration__Relationship22", Appregistration.APPREGISTRATION.VEHICLE_PK);
        public static final ForeignKey<AssignmentRecord, PostdpsRecord> ASSIGNMENT__RELATIONSHIP25 = createForeignKey(test.generated.Keys.PK_POSTDPS, Assignment.ASSIGNMENT, "Assignment__Relationship25", Assignment.ASSIGNMENT.POSTDPS_PK);
        public static final ForeignKey<AssignmentRecord, EmployeRecord> ASSIGNMENT__RELATIONSHIP35 = createForeignKey(test.generated.Keys.PK_EMPLOYE, Assignment.ASSIGNMENT, "Assignment__Relationship35", Assignment.ASSIGNMENT.EMPLOYE_PK, Assignment.ASSIGNMENT.PERSON_PK);
        public static final ForeignKey<DistrorderRecord, EmployeRecord> DISTRORDER__RELATIONSHIP36 = createForeignKey(test.generated.Keys.PK_EMPLOYE, Distrorder.DISTRORDER, "DistrOrder__Relationship36", Distrorder.DISTRORDER.EMPLOYE_PK, Distrorder.DISTRORDER.PERSON_PK);
        public static final ForeignKey<DrcategRecord, DriverlicenseRecord> DRCATEG__RELATIONSHIP45 = createForeignKey(test.generated.Keys.ПК_DRIVERLICENSE, Drcateg.DRCATEG, "DrCateg__Relationship45", Drcateg.DRCATEG.DRIVERLICENSE_PK);
        public static final ForeignKey<DrcategRecord, CategoryRecord> DRCATEG__RELATIONSHIP46 = createForeignKey(test.generated.Keys.CATEGORY_PK, Drcateg.DRCATEG, "DrCateg__Relationship46", Drcateg.DRCATEG.CATEGORY_PK);
        public static final ForeignKey<DriverlicenseRecord, PersonRecord> DRIVERLICENSE__RELATIONSHIP17 = createForeignKey(test.generated.Keys.PK_PERSON, Driverlicense.DRIVERLICENSE, "DriverLicense__Relationship17", Driverlicense.DRIVERLICENSE.PERSON_PK1);
        public static final ForeignKey<DriverlicenseRecord, EmployeRecord> DRIVERLICENSE__RELATIONSHIP42 = createForeignKey(test.generated.Keys.PK_EMPLOYE, Driverlicense.DRIVERLICENSE, "DriverLicense__Relationship42", Driverlicense.DRIVERLICENSE.EMPLOYE_PK, Driverlicense.DRIVERLICENSE.PERSON_PK);
        public static final ForeignKey<EmployeRecord, PersonRecord> EMPLOYE__RELATIONSHIP1 = createForeignKey(test.generated.Keys.PK_PERSON, Employe.EMPLOYE, "Employe__Relationship1", Employe.EMPLOYE.PERSON_PK);
        public static final ForeignKey<EmployeRecord, PositionRecord> EMPLOYE__RELATIONSHIP43 = createForeignKey(test.generated.Keys.POSITION_PK, Employe.EMPLOYE, "Employe__Relationship43", Employe.EMPLOYE.POSITION_PK);
        public static final ForeignKey<ExamcategRecord, CategoryRecord> EXAMCATEG__RELATIONSHIP47 = createForeignKey(test.generated.Keys.CATEGORY_PK, Examcateg.EXAMCATEG, "ExamCateg__Relationship47", Examcateg.EXAMCATEG.CATEGORY_PK);
        public static final ForeignKey<ExamcategRecord, ExamlistRecord> EXAMCATEG__RELATIONSHIP48 = createForeignKey(test.generated.Keys.PK_EXAMLIST, Examcateg.EXAMCATEG, "ExamCateg__Relationship48", Examcateg.EXAMCATEG.EXAMLIST_PK);
        public static final ForeignKey<ExamlistRecord, PersonRecord> EXAMLIST__RELATIONSHIP18 = createForeignKey(test.generated.Keys.PK_PERSON, Examlist.EXAMLIST, "ExamList__Relationship18", Examlist.EXAMLIST.PERSON_PK);
        public static final ForeignKey<ExamlistRecord, EmployeRecord> EXAMLIST__RELATIONSHIP41 = createForeignKey(test.generated.Keys.PK_EMPLOYE, Examlist.EXAMLIST, "ExamList__Relationship41", Examlist.EXAMLIST.EMPLOYE_PK, Examlist.EXAMLIST.PERSON_PK1);
        public static final ForeignKey<LicenseplateRecord, RegionRecord> LICENSEPLATE__RELATIONSHIP7 = createForeignKey(test.generated.Keys.PK_REGION, Licenseplate.LICENSEPLATE, "LicensePlate__Relationship7", Licenseplate.LICENSEPLATE.REGION_PK);
        public static final ForeignKey<LicenseplateRecord, PlateRecord> LICENSEPLATE__RELATIONSHIP33 = createForeignKey(test.generated.Keys.UNIQUE_IDENTIFIER1, Licenseplate.LICENSEPLATE, "LicensePlate__Relationship33", Licenseplate.LICENSEPLATE.PLATE_PK);
        public static final ForeignKey<LicenseplateRecord, VehicleRecord> LICENSEPLATE__LICENSEPLATE_VEHICLE_PK_FKEY = createForeignKey(test.generated.Keys.PK_VEHICLE, Licenseplate.LICENSEPLATE, "LicensePlate__LicensePlate_Vehicle_PK_fkey", Licenseplate.LICENSEPLATE.VEHICLE_PK);
        public static final ForeignKey<PtsRecord, VehicleRecord> PTS__RELATIONSHIP32 = createForeignKey(test.generated.Keys.PK_VEHICLE, Pts.PTS, "PTS__Relationship32", Pts.PTS.VEHICLE_PK);
        public static final ForeignKey<PtsRecord, EnginetypeRecord> PTS__RELATIONSHIP31 = createForeignKey(test.generated.Keys.PK_ENGINETYPE, Pts.PTS, "PTS__Relationship31", Pts.PTS.ENGINETYPE_PK);
        public static final ForeignKey<PtsRecord, TypevRecord> PTS__RELATIONSHIP30 = createForeignKey(test.generated.Keys.PK_TYPEV, Pts.PTS, "PTS__Relationship30", Pts.PTS.TYPEV_PK);
        public static final ForeignKey<PtsRecord, CategoryRecord> PTS__RELATIONSHIP49 = createForeignKey(test.generated.Keys.CATEGORY_PK, Pts.PTS, "PTS__Relationship49", Pts.PTS.CATEGORY_PK);
        public static final ForeignKey<ProtocolRecord, PersonRecord> PROTOCOL__RELATIONSHIP13 = createForeignKey(test.generated.Keys.PK_PERSON, Protocol.PROTOCOL, "Protocol__Relationship13", Protocol.PROTOCOL.PERSON_PK);
        public static final ForeignKey<ProtocolRecord, EmployeRecord> PROTOCOL__RELATIONSHIP34 = createForeignKey(test.generated.Keys.PK_EMPLOYE, Protocol.PROTOCOL, "Protocol__Relationship34", Protocol.PROTOCOL.EMPLOYE_PK, Protocol.PROTOCOL.PERSON_PK1);
        public static final ForeignKey<ProtocoldecisionRecord, TypedecisionRecord> PROTOCOLDECISION__RELATIONSHIP12 = createForeignKey(test.generated.Keys.PK_TYPEDECISION, Protocoldecision.PROTOCOLDECISION, "ProtocolDecision__Relationship12", Protocoldecision.PROTOCOLDECISION.TYPEDECISION_PK);
        public static final ForeignKey<ProtocoldecisionRecord, ProtocolRecord> PROTOCOLDECISION__RELATIONSHIP11 = createForeignKey(test.generated.Keys.PK_PROTOCOL, Protocoldecision.PROTOCOLDECISION, "ProtocolDecision__Relationship11", Protocoldecision.PROTOCOLDECISION.PROTOCOL_PK);
        public static final ForeignKey<ProtocoldecisionRecord, EmployeRecord> PROTOCOLDECISION__RELATIONSHIP40 = createForeignKey(test.generated.Keys.PK_EMPLOYE, Protocoldecision.PROTOCOLDECISION, "ProtocolDecision__Relationship40", Protocoldecision.PROTOCOLDECISION.EMPLOYE_PK, Protocoldecision.PROTOCOLDECISION.PERSON_PK);
        public static final ForeignKey<RegcertRecord, PersonRecord> REGCERT__RELATIONSHIP19 = createForeignKey(test.generated.Keys.PK_PERSON, Regcert.REGCERT, "RegCert__Relationship19", Regcert.REGCERT.PERSON_PK);
        public static final ForeignKey<RegcertRecord, EmployeRecord> REGCERT__RELATIONSHIP37 = createForeignKey(test.generated.Keys.PK_EMPLOYE, Regcert.REGCERT, "RegCert__Relationship37", Regcert.REGCERT.EMPLOYE_PK, Regcert.REGCERT.PERSON_PK);
        public static final ForeignKey<RegcertRecord, VehicleRecord> REGCERT__RELATIONSHIP21 = createForeignKey(test.generated.Keys.PK_VEHICLE, Regcert.REGCERT, "RegCert__Relationship21", Regcert.REGCERT.VEHICLE_PK);
    }
}
