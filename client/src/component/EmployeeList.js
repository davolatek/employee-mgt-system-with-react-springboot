import React, { useState, useEffect } from "react";
import { useNavigate } from "react-router-dom";
import EmployeeService from "../services/EmployeeService";

export default function EmployeeList() {
  const navigate = useNavigate();
  const [loading, setLoading] = useState(true);
  const [employees, setEmployees] = useState([]);

  useEffect(() => {
    const fetchData = async () => {
      try {
        const response = await EmployeeService.getEmployees();
        setEmployees(response.data);
      } catch (error) {
        console.error(error);
      }

      setLoading(false);
    };

    fetchData();
  }, []);

  return (
    <div className="container mx-auto my-6">
      <div className="h-12">
        <button
          onClick={() => navigate("/addEmployee")}
          className="rounded bg-slate-600 text-white px-6 py-2 font-semibold"
        >
          Add Employee
        </button>
      </div>
      <div className="flex shadow border-b">
        <table className="min-w-full">
          {!loading ? (
            <>
              <thead className="bg-gray-50">
                <tr>
                <th className="text-left font-medium text-gray-500 uppercase tracking-wider py-3 px-6">
                    #
                  </th>
                  <th className="text-left font-medium text-gray-500 uppercase tracking-wider py-3 px-6">
                    First Name
                  </th>
                  <th className="text-left font-medium text-gray-500 uppercase tracking-wider py-3 px-6">
                    Last Name
                  </th>
                  <th className="text-left font-medium text-gray-500 uppercase tracking-wider py-3 px-6">
                    Email
                  </th>
                  <th className="text-right font-medium text-gray-500 uppercase tracking-wider py-3 px-6">
                    Actions
                  </th>
                </tr>
              </thead>
              <tbody className="bg-white">
                {employees.map((employee) => {
                  return (
                    <tr key={employee.id}>
                      <td className="text-left px-6 py-4 whitespace-nowrap">
                        <div className="text-sm text-gray-500">{employee.id}</div>
                      </td>
                      <td className="text-left px-6 py-4 whitespace-nowrap">
                        <div className="text-sm text-gray-500">{employee.firstName}</div>
                      </td>
                      <td className="text-left px-6 py-4 whitespace-nowrap">
                        <div className="text-sm text-gray-500">{employee.lastName}</div>
                      </td>
                      <td className="text-left px-6 py-4 whitespace-nowrap">
                        <div className="text-sm text-gray-500">{employee.emailId}</div>
                      </td>

                      <td className="text-right px-6 py-4 whitespace-nowrap font-medium text-sm">
                        <a
                          href="/"
                          className="text-indigo-600 hover:text-indigo-800 px-4"
                        >
                          Edit
                        </a>
                        <a href="/" className="text-red-600 hover:text-red-800">
                          Delete
                        </a>
                      </td>
                    </tr>
                  );
                })}
              </tbody>
            </>
          ) : null}
        </table>
      </div>
    </div>
  );
}
