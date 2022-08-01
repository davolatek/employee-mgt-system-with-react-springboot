import React from 'react'

export default function EmployeeList() {
  return (
    <div className='container mx-auto my-6'>
        <div className='h-12'>
            <button className='rounded bg-slate-600 text-white px-6 py-2 font-semibold'>Add Employee</button>
        </div>
        <div className='flex shadow border-b'>
            <table>
                <thead>
                    <tr>
                        <th>First Name</th>
                        <th>Last Name</th>
                        <th>Email</th>
                        <th>Actions</th>
                    </tr>
                </thead>
            </table>
        </div>
    </div>
  )
}
