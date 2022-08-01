import { BrowserRouter, Routes, Route } from "react-router-dom";
import "./App.css";
import AddEmployee from "./component/AddEmployee";
import EmployeeList from "./component/EmployeeList";
import Navbar from "./component/Navbar";

function App() {
  return (
    <>
      <BrowserRouter>
        <Navbar />
        <Routes>
          <Route path="/" element={<EmployeeList />} />
          <Route index element={<EmployeeList />} />
          <Route path="/employeeList" element={<EmployeeList />} />
          <Route path="/addEmployee" element={<AddEmployee />} />
        </Routes>
      </BrowserRouter>
    </>
  );
}

export default App;
