package controller;

import java.net.URL;
import java.util.ResourceBundle;

import com.empresa.vehiculos.model.Enfermera;
import com.empresa.vehiculos.model.Medico;
import com.empresa.vehiculos.model.Paciente;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import javafx.event.ActionEvent;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import javafx.scene.control.cell.PropertyValueFactory;

public class HospitalController implements Initializable {

    // =========================
    // LISTAS
    // =========================

    ObservableList<Medico> listaMedicos =
            FXCollections.observableArrayList();

    ObservableList<Enfermera> listaEnfermeras =
            FXCollections.observableArrayList();

    ObservableList<Paciente> listaPacientes =
            FXCollections.observableArrayList();

    // =========================
    // MÉDICOS
    // =========================

    @FXML
    private TextField NombreMedico;

    @FXML
    private TextField DireccionMedico;

    @FXML
    private TextField TelefonoMedico;

    @FXML
    private TextField EdadMedico;

    @FXML
    private TextField EspecialidadMedico;

    @FXML
    private TextField SalarioMedico;

    @FXML
    private ComboBox NivelMedico;

    @FXML
    private TableView MostrarResultadosMedico;

    @FXML
    private TableColumn ColNombreMedico;

    @FXML
    private TableColumn ColDireccionMedico;

    @FXML
    private TableColumn ColTelefonoMedico;

    @FXML
    private TableColumn ColEdadMedico;

    @FXML
    private TableColumn ColEspecialidadMedico;

    @FXML
    private TableColumn ColSalarioMedico;

    @FXML
    private TableColumn ColNivelMedico;

    // =========================
    // ENFERMERA
    // =========================

    @FXML
    private TextField NombreEnfermera;

    @FXML
    private TextField DireccionEnfermera;

    @FXML
    private TextField TelefonoEnfermera;

    @FXML
    private TextField EdadEnfermera;

    @FXML
    private TextField SalarioEnfermera;

    @FXML
    private ComboBox CategoriaEnfermera;

    @FXML
    private TableView MostrarResultadosEnfermera;

    @FXML
    private TableColumn ColNombreEnfermera;

    @FXML
    private TableColumn ColDireccionEnfermera;

    @FXML
    private TableColumn ColTelefonoEnfermera;

    @FXML
    private TableColumn ColEdadEnfermera;

    @FXML
    private TableColumn ColSalarioEnfermera;

    @FXML
    private TableColumn ColCategoriaEnfermera;

    // =========================
    // PACIENTE
    // =========================

    @FXML
    private TextField NombrePaciente;

    @FXML
    private TextField DireccionPaciente;

    @FXML
    private TextField TelefonoPaciente;

    @FXML
    private TextField EdadPaciente;

    @FXML
    private TextField FechaIngresoPaciente;

    @FXML
    private TextField FechaAltaPaciente;

    @FXML
    private TextField MotivoPaciente;

    @FXML
    private TextField MedicamentosPaciente;

    @FXML
    private TableView MostrarResultadosPaciente;

    @FXML
    private TableColumn ColNombrePaciente;

    @FXML
    private TableColumn ColDireccionPaciente;

    @FXML
    private TableColumn ColTelefonoPaciente;

    @FXML
    private TableColumn ColEdadPaciente;

    @FXML
    private TableColumn ColFechaIngresoPaciente;

    @FXML
    private TableColumn ColAltaIngresoPaciente;

    @FXML
    private TableColumn ColMotivoPaciente;

    @FXML
    private TableColumn ColMedicamentosPaciente;

    // =========================
    // INITIALIZE
    // =========================

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        // =========================
        // COMBOBOX
        // =========================

        NivelMedico.getItems().addAll("1", "2", "3");

        CategoriaEnfermera.getItems().addAll(
                "Auxiliar",
                "Instrumentadora",
                "Profesional"
        );

        // =========================
        // COLUMNAS MÉDICO
        // =========================

        ColNombreMedico.setCellValueFactory(
                new PropertyValueFactory<>("nombre"));

        ColDireccionMedico.setCellValueFactory(
                new PropertyValueFactory<>("direccion"));

        ColTelefonoMedico.setCellValueFactory(
                new PropertyValueFactory<>("telefono"));

        ColEdadMedico.setCellValueFactory(
                new PropertyValueFactory<>("edad"));

        ColEspecialidadMedico.setCellValueFactory(
                new PropertyValueFactory<>("especialidad"));

        ColSalarioMedico.setCellValueFactory(
                new PropertyValueFactory<>("salario"));

        ColNivelMedico.setCellValueFactory(
                new PropertyValueFactory<>("nivel"));

        // =========================
        // COLUMNAS ENFERMERA
        // =========================

        ColNombreEnfermera.setCellValueFactory(
                new PropertyValueFactory<>("nombre"));

        ColDireccionEnfermera.setCellValueFactory(
                new PropertyValueFactory<>("direccion"));

        ColTelefonoEnfermera.setCellValueFactory(
                new PropertyValueFactory<>("telefono"));

        ColEdadEnfermera.setCellValueFactory(
                new PropertyValueFactory<>("edad"));

        ColSalarioEnfermera.setCellValueFactory(
                new PropertyValueFactory<>("salario"));

        ColCategoriaEnfermera.setCellValueFactory(
                new PropertyValueFactory<>("categoria"));

        // =========================
        // COLUMNAS PACIENTE
        // =========================

        ColNombrePaciente.setCellValueFactory(
                new PropertyValueFactory<>("nombre"));

        ColDireccionPaciente.setCellValueFactory(
                new PropertyValueFactory<>("direccion"));

        ColTelefonoPaciente.setCellValueFactory(
                new PropertyValueFactory<>("telefono"));

        ColEdadPaciente.setCellValueFactory(
                new PropertyValueFactory<>("edad"));

        ColFechaIngresoPaciente.setCellValueFactory(
                new PropertyValueFactory<>("fechaIngreso"));

        ColAltaIngresoPaciente.setCellValueFactory(
                new PropertyValueFactory<>("fechaAlta"));

        ColMotivoPaciente.setCellValueFactory(
                new PropertyValueFactory<>("motivo"));

        ColMedicamentosPaciente.setCellValueFactory(
                new PropertyValueFactory<>("medicamentos"));

    }

    // =========================
    // MOSTRAR MÉDICO
    // =========================

    @FXML
    private void MostrarMedico(ActionEvent event) {

        Medico medico = new Medico(

                NombreMedico.getText(),
                DireccionMedico.getText(),
                TelefonoMedico.getText(),
                EdadMedico.getText(),
                EspecialidadMedico.getText(),
                SalarioMedico.getText(),
                NivelMedico.getValue().toString()

        );

        listaMedicos.add(medico);

        MostrarResultadosMedico.setItems(listaMedicos);

    }
    // =========================
// LIMPIAR MÉDICO
// =========================

    @FXML
    private void LimpiarMedico(ActionEvent event) {

        NombreMedico.clear();
        DireccionMedico.clear();
        TelefonoMedico.clear();
        EdadMedico.clear();
        EspecialidadMedico.clear();
        SalarioMedico.clear();

        NivelMedico.setValue(null);

    }

// =========================
// SALIR MÉDICO
// =========================

    @FXML
    private void SalirMedico(ActionEvent event) {

        System.exit(0);

    }




    // =========================
    // MOSTRAR ENFERMERA
    // =========================

    @FXML
    private void MostrarEnfermera(ActionEvent event) {

        Enfermera enfermera = new Enfermera(

                NombreEnfermera.getText(),
                DireccionEnfermera.getText(),
                TelefonoEnfermera.getText(),
                EdadEnfermera.getText(),
                SalarioEnfermera.getText(),
                CategoriaEnfermera.getValue().toString()

        );

        listaEnfermeras.add(enfermera);

        MostrarResultadosEnfermera.setItems(listaEnfermeras);

    }

// =========================
// LIMPIAR ENFERMERA
// =========================

    @FXML
    private void LimpiarEnfermera(ActionEvent event) {

        NombreEnfermera.clear();
        DireccionEnfermera.clear();
        TelefonoEnfermera.clear();
        EdadEnfermera.clear();
        SalarioEnfermera.clear();

        CategoriaEnfermera.setValue(null);

    }

// =========================
// SALIR ENFERMERA
// =========================

    @FXML
    private void SalirEnfermera(ActionEvent event) {

        System.exit(0);

    }

    // =========================
    // MOSTRAR PACIENTE
    // =========================

    @FXML
    private void MostrarPaciente(ActionEvent event) {

        Paciente paciente = new Paciente(

                NombrePaciente.getText(),
                DireccionPaciente.getText(),
                TelefonoPaciente.getText(),
                EdadPaciente.getText(),
                FechaIngresoPaciente.getText(),
                FechaAltaPaciente.getText(),
                MotivoPaciente.getText(),
                MedicamentosPaciente.getText()

        );

        listaPacientes.add(paciente);

        MostrarResultadosPaciente.setItems(listaPacientes);

    }
    // =========================
// LIMPIAR PACIENTE
// =========================

    @FXML
    private void LimpiarPaciente(ActionEvent event) {

        NombrePaciente.clear();
        DireccionPaciente.clear();
        TelefonoPaciente.clear();
        EdadPaciente.clear();
        FechaIngresoPaciente.clear();
        FechaAltaPaciente.clear();
        MotivoPaciente.clear();
        MedicamentosPaciente.clear();

    }

// =========================
// SALIR PACIENTE
// =========================

    @FXML
    private void SalirPaciente(ActionEvent event) {

        System.exit(0);

    }

}