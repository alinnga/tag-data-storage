package com.nppgks.testopctagstorage;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

@Component
public class TagStorage {

    public Map<String, String> tagData = new HashMap<>();

    TagStorage(){
        String Q_ij = """
                [
                87.5,65.7,43.9,21.9,11.1,
                87.5,64.4,43.7,21.9,11.1,
                87.5,65.7,43.7,21.9,11.1,
                87.5,65.5,43.7,21.9,11.1,
                87.6,65.5,43.7,21.9,11.1
                ]
                """;
        tagData.put("WinCC_OA.mi3622.Q_ij", Q_ij.replaceAll("\n",""));

        String N_e_ij = """
                [
                33002,33007,30262,20626,10501,
                33013,32999,30262,20623,10501,
                33013,33007,30261,20626,10499,
                33012,33007,30256,20625,10500,
                33012,33007,30262,20623,10500
                ]
                """;
        tagData.put("WinCC_OA.mi3622.N_e_ij", N_e_ij.replaceAll("\n",""));

        String N_p_ij = """
                [
                33002,33007,30262,20626,10501,
                33012,32998,30262,20623,10501,
                33012,33007,30261,20626,10499,
                33013,33007,30257,20625,10501,
                33013,33007,30261,20624,10500
                ]
                """;
        tagData.put("WinCC_OA.mi3622.N_p_ij", N_p_ij.replaceAll("\n",""));

        String T_ij = """
                [
                5.7,6.9,10,14.4,14.1,
                5.3,7.3,10.3,14.3,14.3,
                5.3,7.3,10.3,14.3,14.2,
                5.3,7.2,10.3,14.2,14.3,
                5.3,7.3,10.3,14.3,14.3
                ]
                """;
        tagData.put("WinCC_OA.mi3622.T_ij", T_ij.replaceAll("\n",""));

        String M_ij = """
                [
                145.756,145.778,133.654,91.0918,46.3784,
                145.8,145.738,133.654,91.0829,46.3784,
                145.8,145.778,133.65,91.0962,46.3696,
                145.8040,145.778,133.632,91.0918,46.3784,
                145.8040,145.778,133.65,91.0974,46.3740
                ]
                """;
        tagData.put("WinCC_OA.mi3622.M_ij", M_ij.replaceAll("\n",""));

        tagData.put("WinCC_OA.mi3622.Q_e_arr", "[21,65,87.5,272.6]");

        tagData.put("WinCC_OA.mi3622.K_e_arr", "[226.4151,226.4151,226.4151,226.4151]");

        tagData.put("WinCC_OA.mi3622.f_p_max", "10000");

        tagData.put("WinCC_OA.mi3622.Q_p_max", "159");

        tagData.put("WinCC_OA.mi3622.MF_p", "1");
        tagData.put("WinCC_OA.mi3622.Q_p", "[0,68,136,204,272]");

        tagData.put("WinCC_OA.mi3622.theta_e", "0.11");

        tagData.put("WinCC_OA.mi3622.theta_N", "0.02");
        tagData.put("WinCC_OA.mi3622.theta_p", "");
        tagData.put("WinCC_OA.mi3622.theta_t", "");

        tagData.put("WinCC_OA.mi3622.ZS", "0.041");

        tagData.put("WinCC_OA.mi3622.f_p", "[0,2500,5000,7500,10000]");
        tagData.put("WinCC_OA.mi3622.K_y", "[226.4151,226.4151,226.4151,226.4151,226.4151]");

        tagData.put("WinCC_OA.mi3622.measureCount", "5");
        tagData.put("WinCC_OA.mi3622.pointsCount", "5");

        tagData.put("WinCC_OA.mi3622.check_inspection", "Осмотрели");
        tagData.put("WinCC_OA.mi3622.check_leakproofness", "Герметично");
        tagData.put("WinCC_OA.mi3622.check_software", "Соответствует");
        tagData.put("WinCC_OA.mi3622.check_testing", "Опробовали");
        tagData.put("WinCC_OA.mi3622.CPM_name", "Micro Motion");
        tagData.put("WinCC_OA.mi3622.CPM_number", "89807767864629");
        tagData.put("WinCC_OA.mi3622.CPM_owner", "Ямал СПГ");
        tagData.put("WinCC_OA.mi3622.poverka_place", "УКУ ДТ, ИЛ-2");
        tagData.put("WinCC_OA.mi3622.poverka_method", "МИ 3622-2020");
        tagData.put("WinCC_OA.mi3622.inspector_full_name", "Мишурин М.Г.");
        tagData.put("WinCC_OA.mi3622.inspector_position", "Инженер метрологии");
        tagData.put("WinCC_OA.mi3622.PR_name", "Micro Motion");
        tagData.put("WinCC_OA.mi3622.PR_number", "0947873986");

        tagData.put("WinCC_OA.mi3622.MFOrK", "MF");
        tagData.put("WinCC_OA.mi3622.zeroStabilityCorr", "true");
        tagData.put("WinCC_OA.mi3622.operatingOrControlCPM", "контрольный");
        tagData.put("WinCC_OA.mi3622.rangeType", "рабочий диапазон");
        tagData.put("WinCC_OA.mi3622.protocolNumber", "230");

        tagData.put("ns=0;i=50240", null);
        tagData.put("ns=0;i=50251", null);
        tagData.put("ns=0;i=50242", null);


        // Шапка акта приема-сдачи
        tagData.put("WinCC_OA.accAct.acceptanceActNumber", "44.2023");
        tagData.put("WinCC_OA.accAct.acceptanceActDate", "13.02.2023");
        tagData.put("WinCC_OA.accAct.oilAcceptancePoint", "МУПН Ен-Яхтинское м/р");
        tagData.put("WinCC_OA.accAct.pointOwner", "ООО \"Газпронефть-Заполярье\"");
        tagData.put("WinCC_OA.accAct.SIKN", "№1524");
        tagData.put("WinCC_OA.accAct.deliverOrg", "");
        tagData.put("WinCC_OA.accAct.deliverNameTitle", "Лазарев М.А.");
        tagData.put("WinCC_OA.accAct.deliverProxyDate", "24.02.2022г");
        tagData.put("WinCC_OA.accAct.deliverProxyNumber", "Д-33");
        tagData.put("WinCC_OA.accAct.receiverOrg", "");
        tagData.put("WinCC_OA.accAct.receiverNameTitle", "");
        tagData.put("WinCC_OA.accAct.receiverProxyDate", "");
        tagData.put("WinCC_OA.accAct.receiverProxyNumber", "");

        // показатели акта приема-сдачи
        tagData.put("WinCC_OA.accAct.prevEndVol_shift1", "348025");
        tagData.put("WinCC_OA.accAct.prevEndVol_shift2", "348737");
        tagData.put("WinCC_OA.accAct.grossOilMass_shift1", "574");
        tagData.put("WinCC_OA.accAct.grossOilMass_shift2", "575");

        // нижняя часть акта
        tagData.put("WinCC_OA.accAct.oilNetMassInWords", "одна тысяча сто сорок восемь т.");
        tagData.put("WinCC_OA.accAct.GOST", "1.0.1.1");
    }

    public void generateTags(){
        double min = 0;
        double max = 1000;

        tagData.put("2hour_mass_il1", ""+ ThreadLocalRandom.current().nextDouble(min, max));
        tagData.put("2hour_temp_il1", ""+ThreadLocalRandom.current().nextDouble(min, max));
        tagData.put("2hour_pressure_il1", ""+ThreadLocalRandom.current().nextDouble(min, max));

        tagData.put("daily_mass_il1", ""+ ThreadLocalRandom.current().nextDouble(min, max));
        tagData.put("daily_temp_il1", ""+ThreadLocalRandom.current().nextDouble(min, max));
        tagData.put("daily_pressure_il1", ""+ThreadLocalRandom.current().nextDouble(min, max));

        tagData.put("daily_density_il1", ""+ThreadLocalRandom.current().nextDouble(min, max));
        tagData.put("daily_density20_il1", ""+ThreadLocalRandom.current().nextDouble(min, max));
        tagData.put("daily_density15_il1", ""+ThreadLocalRandom.current().nextDouble(min, max));
        tagData.put("daily_moisture_il1", ""+ThreadLocalRandom.current().nextDouble(min, max));
        tagData.put("daily_mass_gross_il1", ""+ThreadLocalRandom.current().nextDouble(min, max));
        tagData.put("daily_mass_gross_increasing_il1", ""+ThreadLocalRandom.current().nextDouble(min, max));
        tagData.put("daily_vol_il1", ""+ThreadLocalRandom.current().nextDouble(min, max));
        tagData.put("daily_vol_increasing_il1", ""+ThreadLocalRandom.current().nextDouble(min, max));
        tagData.put("daily_mass_il2", ""+ThreadLocalRandom.current().nextDouble(min, max));
        tagData.put("daily_temp_il2", ""+ThreadLocalRandom.current().nextDouble(min, max));
        tagData.put("daily_pressure_il2", ""+ThreadLocalRandom.current().nextDouble(min, max));
        tagData.put("daily_density_il2", ""+ThreadLocalRandom.current().nextDouble(min, max));
        tagData.put("daily_density20_il2", ""+ThreadLocalRandom.current().nextDouble(min, max));
        tagData.put("daily_density15_il2", ""+ThreadLocalRandom.current().nextDouble(min, max));
        tagData.put("daily_moisture_il2", ""+ThreadLocalRandom.current().nextDouble(min, max));
        tagData.put("daily_mass_gross_il2", ""+ThreadLocalRandom.current().nextDouble(min, max));
        tagData.put("daily_mass_gross_increasing_il2", ""+ThreadLocalRandom.current().nextDouble(min, max));

        tagData.put("daily_vol_il2", ""+ThreadLocalRandom.current().nextDouble(min, max));
        tagData.put("daily_vol_increasing_il2", ""+ThreadLocalRandom.current().nextDouble(min, max));
        tagData.put("daily_mass_sikn", ""+ThreadLocalRandom.current().nextDouble(min, max));
        tagData.put("daily_temp_sikn", ""+ThreadLocalRandom.current().nextDouble(min, max));
        tagData.put("daily_pressure_sikn", ""+ThreadLocalRandom.current().nextDouble(min, max));
        tagData.put("daily_density_sikn", ""+ThreadLocalRandom.current().nextDouble(min, max));
        tagData.put("daily_density20_sikn", ""+ThreadLocalRandom.current().nextDouble(min, max));
        tagData.put("daily_density15_sikn", ""+ThreadLocalRandom.current().nextDouble(min, max));
        tagData.put("daily_moisture_sikn", ""+ThreadLocalRandom.current().nextDouble(min, max));
        tagData.put("daily_mass_gross_sikn", ""+ThreadLocalRandom.current().nextDouble(min, max));
        tagData.put("daily_mass_gross_increasing_sikn", ""+ThreadLocalRandom.current().nextDouble(min, max));
        tagData.put("daily_vol_sikn", ""+ThreadLocalRandom.current().nextDouble(min, max));
        tagData.put("daily_vol_increasing_sikn", ""+ThreadLocalRandom.current().nextDouble(min, max));
        tagData.put("daily_mass_bik", ""+ThreadLocalRandom.current().nextDouble(min, max));
        tagData.put("daily_temp_bik", ""+ThreadLocalRandom.current().nextDouble(min, max));
        tagData.put("daily_pressure_bik", ""+ThreadLocalRandom.current().nextDouble(min, max));
        tagData.put("daily_density_bik", ""+ThreadLocalRandom.current().nextDouble(min, max));
        tagData.put("daily_density20_bik", ""+ThreadLocalRandom.current().nextDouble(min, max));

        tagData.put("daily_density15_bik", ""+ThreadLocalRandom.current().nextDouble(min, max));
        tagData.put("daily_moisture_bik", ""+ThreadLocalRandom.current().nextDouble(min, max));
        tagData.put("daily_mass_gross_bik", ""+ThreadLocalRandom.current().nextDouble(min, max));
        tagData.put("daily_mass_gross_increasing_bik", ""+ThreadLocalRandom.current().nextDouble(min, max));
        tagData.put("daily_vol_bik", ""+ThreadLocalRandom.current().nextDouble(min, max));
        tagData.put("daily_vol_increasing_bik", ""+ThreadLocalRandom.current().nextDouble(min, max));

        tagData.put("daily_power_il1", ""+ThreadLocalRandom.current().nextDouble(min, max));
        tagData.put("daily_power_il2", ""+ThreadLocalRandom.current().nextDouble(min, max));
        tagData.put("daily_power_il3", ""+ThreadLocalRandom.current().nextDouble(min, max));
        tagData.put("daily_power_bik", ""+ThreadLocalRandom.current().nextDouble(min, max));
        tagData.put("daily_power_sikn", ""+ThreadLocalRandom.current().nextDouble(min, max));


        // hour tags
        tagData.put("hour_mass_il1", ""+ ThreadLocalRandom.current().nextDouble(min, max));
        tagData.put("hour_temp_il1", ""+ThreadLocalRandom.current().nextDouble(min, max));
        tagData.put("hour_pressure_il1", ""+ThreadLocalRandom.current().nextDouble(min, max));

        tagData.put("hour_density_il1", ""+ThreadLocalRandom.current().nextDouble(min, max));
        tagData.put("hour_density20_il1", ""+ThreadLocalRandom.current().nextDouble(min, max));
        tagData.put("hour_density15_il1", ""+ThreadLocalRandom.current().nextDouble(min, max));
        tagData.put("hour_moisture_il1", ""+ThreadLocalRandom.current().nextDouble(min, max));
        tagData.put("hour_mass_gross_il1", ""+ThreadLocalRandom.current().nextDouble(min, max));
        tagData.put("hour_mass_gross_increasing_il1", ""+ThreadLocalRandom.current().nextDouble(min, max));
        tagData.put("hour_vol_il1", ""+ThreadLocalRandom.current().nextDouble(min, max));
        tagData.put("hour_vol_increasing_il1", ""+ThreadLocalRandom.current().nextDouble(min, max));
        tagData.put("hour_mass_il2", ""+ThreadLocalRandom.current().nextDouble(min, max));
        tagData.put("hour_temp_il2", ""+ThreadLocalRandom.current().nextDouble(min, max));
        tagData.put("hour_pressure_il2", ""+ThreadLocalRandom.current().nextDouble(min, max));
        tagData.put("hour_density_il2", ""+ThreadLocalRandom.current().nextDouble(min, max));
        tagData.put("hour_density20_il2", ""+ThreadLocalRandom.current().nextDouble(min, max));
        tagData.put("hour_density15_il2", ""+ThreadLocalRandom.current().nextDouble(min, max));
        tagData.put("hour_moisture_il2", ""+ThreadLocalRandom.current().nextDouble(min, max));
        tagData.put("hour_mass_gross_il2", ""+ThreadLocalRandom.current().nextDouble(min, max));
        tagData.put("hour_mass_gross_increasing_il2", ""+ThreadLocalRandom.current().nextDouble(min, max));

        tagData.put("hour_vol_il2", ""+ThreadLocalRandom.current().nextDouble(min, max));
        tagData.put("hour_vol_increasing_il2", ""+ThreadLocalRandom.current().nextDouble(min, max));
        tagData.put("hour_mass_sikn", ""+ThreadLocalRandom.current().nextDouble(min, max));
        tagData.put("hour_temp_sikn", ""+ThreadLocalRandom.current().nextDouble(min, max));
        tagData.put("hour_pressure_sikn", ""+ThreadLocalRandom.current().nextDouble(min, max));
        tagData.put("hour_density_sikn", ""+ThreadLocalRandom.current().nextDouble(min, max));
        tagData.put("hour_density20_sikn", ""+ThreadLocalRandom.current().nextDouble(min, max));
        tagData.put("hour_density15_sikn", ""+ThreadLocalRandom.current().nextDouble(min, max));
        tagData.put("hour_moisture_sikn", ""+ThreadLocalRandom.current().nextDouble(min, max));
        tagData.put("hour_mass_gross_sikn", ""+ThreadLocalRandom.current().nextDouble(min, max));
        tagData.put("hour_mass_gross_increasing_sikn", ""+ThreadLocalRandom.current().nextDouble(min, max));
        tagData.put("hour_vol_sikn", ""+ThreadLocalRandom.current().nextDouble(min, max));
        tagData.put("hour_vol_increasing_sikn", ""+ThreadLocalRandom.current().nextDouble(min, max));
        tagData.put("hour_mass_bik", ""+ThreadLocalRandom.current().nextDouble(min, max));
        tagData.put("hour_temp_bik", ""+ThreadLocalRandom.current().nextDouble(min, max));
        tagData.put("hour_pressure_bik", ""+ThreadLocalRandom.current().nextDouble(min, max));
        tagData.put("hour_density_bik", ""+ThreadLocalRandom.current().nextDouble(min, max));
        tagData.put("hour_density20_bik", ""+ThreadLocalRandom.current().nextDouble(min, max));

        tagData.put("hour_density15_bik", ""+ThreadLocalRandom.current().nextDouble(min, max));
        tagData.put("hour_moisture_bik", ""+ThreadLocalRandom.current().nextDouble(min, max));
        tagData.put("hour_mass_gross_bik", ""+ThreadLocalRandom.current().nextDouble(min, max));
        tagData.put("hour_mass_gross_increasing_bik", ""+ThreadLocalRandom.current().nextDouble(min, max));
        tagData.put("hour_vol_bik", ""+ThreadLocalRandom.current().nextDouble(min, max));
        tagData.put("hour_vol_increasing_bik", ""+ThreadLocalRandom.current().nextDouble(min, max));

        //shift tags
        
        tagData.put("shift_mass_il1", ""+ ThreadLocalRandom.current().nextDouble(min, max));
        tagData.put("shift_temp_il1", ""+ThreadLocalRandom.current().nextDouble(min, max));
        tagData.put("shift_pressure_il1", ""+ThreadLocalRandom.current().nextDouble(min, max));
        
        tagData.put("shift_mass_il2", ""+ThreadLocalRandom.current().nextDouble(min, max));
        tagData.put("shift_temp_il2", ""+ThreadLocalRandom.current().nextDouble(min, max));
        tagData.put("shift_pressure_il2", ""+ThreadLocalRandom.current().nextDouble(min, max));
        
        tagData.put("shift_mass_sikn", ""+ThreadLocalRandom.current().nextDouble(min, max));
        tagData.put("shift_temp_sikn", ""+ThreadLocalRandom.current().nextDouble(min, max));
        tagData.put("shift_pressure_sikn", ""+ThreadLocalRandom.current().nextDouble(min, max));
        
        tagData.put("shift_mass_bik", ""+ThreadLocalRandom.current().nextDouble(min, max));
        tagData.put("shift_temp_bik", ""+ThreadLocalRandom.current().nextDouble(min, max));
        tagData.put("shift_pressure_bik", ""+ThreadLocalRandom.current().nextDouble(min, max));
    }
    public boolean writeValues(Map<String, String> values){
        tagData.putAll(values);
        return true;
    }
}
