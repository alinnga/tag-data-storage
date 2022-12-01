package com.nppgks.testopctagstorage;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
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
        tagData.put("WinCC_OA.rep_test.Q_ij", Q_ij.replaceAll("\n",""));

        String N_e_ij = """
                [
                33002,33007,30262,20626,10501,
                33013,32999,30262,20623,10501,
                33013,33007,30261,20626,10499,
                33012,33007,30256,20625,10500,
                33012,33007,30262,20623,10500
                ]
                """;
        tagData.put("WinCC_OA.rep_test.N_e_ij", N_e_ij.replaceAll("\n",""));

        String N_p_ij = """
                [
                33002,33007,30262,20626,10501,
                33012,32998,30262,20623,10501,
                33012,33007,30261,20626,10499,
                33013,33007,30257,20625,10501,
                33013,33007,30261,20624,10500
                ]
                """;
        tagData.put("WinCC_OA.rep_test.N_p_ij", N_p_ij.replaceAll("\n",""));

        String T_ij = """
                [
                5.7,6.9,10,14.4,14.1,
                5.3,7.3,10.3,14.3,14.3,
                5.3,7.3,10.3,14.3,14.2,
                5.3,7.2,10.3,14.2,14.3,
                5.3,7.3,10.3,14.3,14.3
                ]
                """;
        tagData.put("WinCC_OA.rep_test.T_ij", T_ij.replaceAll("\n",""));

        String M_ij = """
                [
                145.756,145.778,133.654,91.0918,46.3784,
                145.8,145.738,133.654,91.0829,46.3784,
                145.8,145.778,133.65,91.0962,46.3696,
                145.8040,145.778,133.632,91.0918,46.3784,
                145.8040,145.778,133.65,91.0974,46.3740
                ]
                """;
        tagData.put("WinCC_OA.rep_test.M_ij", M_ij.replaceAll("\n",""));

        tagData.put("WinCC_OA.rep_test.Q_e_arr", "[21,65,87.5,272.6]");

        tagData.put("WinCC_OA.rep_test.K_e_arr", "[226.4151,226.4151,226.4151,226.4151]");

        tagData.put("WinCC_OA.rep_test.f_p_max", "10000");

        tagData.put("WinCC_OA.rep_test.Q_p_max", "159");

        tagData.put("WinCC_OA.rep_test.MF_p", "1");
        tagData.put("WinCC_OA.rep_test.Q_p", "[0,68,136,204,272]");

        tagData.put("WinCC_OA.rep_test.theta_e", "0.11");

        tagData.put("WinCC_OA.rep_test.theta_N", "0.02");

        tagData.put("WinCC_OA.rep_test.ZS", "0.041");

        tagData.put("WinCC_OA.rep_test.f_p", "[0,2500,5000,7500,10000]");
        tagData.put("WinCC_OA.rep_test.K_y", "[226.4151,226.4151,226.4151,226.4151,226.4151]");

        tagData.put("WinCC_OA.rep_test.measureCount", "5");
        tagData.put("WinCC_OA.rep_test.pointsCount", "5");

        tagData.put("WinCC_OA.rep_test.check_inspection", "Осмотрели");
        tagData.put("WinCC_OA.rep_test.check_leakproofness", "Герметично");
        tagData.put("WinCC_OA.rep_test.check_software", "Соответствует");
        tagData.put("WinCC_OA.rep_test.check_testing", "Опробовали");
        tagData.put("WinCC_OA.rep_test.CPM_name", "Micro Motion");
        tagData.put("WinCC_OA.rep_test.CPM_number", "89807767864629");
        tagData.put("WinCC_OA.rep_test.CPM_owner", "Ямал СПГ");
        tagData.put("WinCC_OA.rep_test.calc_place", "УКУ ДТ, ИЛ-2");
        tagData.put("WinCC_OA.rep_test.calc_method", "МИ 3622-2020");
        tagData.put("WinCC_OA.rep_test.inspector_full_name", "Мишурин М.Г.");
        tagData.put("WinCC_OA.rep_test.inspector_position", "Инженер метрологии");
        tagData.put("WinCC_OA.rep_test.PR_name", "Micro Motion");
        tagData.put("WinCC_OA.rep_test.PR_number", "0947873986");

        tagData.put("WinCC_OA.rep_test.MFOrK", "MF");
        tagData.put("WinCC_OA.rep_test.zeroStabilityCorr", "true");
        tagData.put("WinCC_OA.rep_test.operatingOrControlCPM", "контрольный");
        tagData.put("WinCC_OA.rep_test.rangeType", "рабочий диапазон");
    }

    public void generateTags(){
        Random random = new Random(10);
        double min = 0;
        double max = 1000;
        
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


    }
}
